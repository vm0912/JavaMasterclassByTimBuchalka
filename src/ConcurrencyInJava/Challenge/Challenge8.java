package ConcurrencyInJava.Challenge;

public class Challenge8 {

    /**
     *Spot the problem in the code and fix it.
     * SOLUTION: A situation happening here is called a deadlock, which means the two threads are holding two different locks,
     * and at the same time are waiting in the queue to fetch the lock which is in the possession of the opposite thread,
     * so they are in a state in which none of them is able to execute, but is waiting for the other to release the lock.
     * The solution here is to remove keyword 'synchronized' from the tutor.studyTime(), student.startStudy() and
     * student.handInAssignment() because if we leave the locks on the tutor methods, and the first thing in the
     * student.handInAssignment() is to call the tutor.getProgressReport() and ask for a lock, the lock could be obtained
     * only after the tutor has released it.
     *Also, we don't need to synchronize the tutor.setStudent(Student student) method because in this scenario the code
     * is executing in the main thread.
     */
    public static void main(String[] args) {
        final Tutor tutor = new Tutor();
        final Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class Tutor {
    private Student student;

//    public synchronized void setStudent(Student student) {
        public void setStudent(Student student) {
        this.student = student;
    }

    public synchronized void studyTime() {
        System.out.println("Tutor has arrived");
        try {
            // wait for student to arrive and hand in assignment
            Thread.sleep(300);
        } catch (InterruptedException e) {

        }

        student.startStudy();
        System.out.println("Tutor is studying with student");
    }

    public synchronized void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");

    }
}

class Student {

    private Tutor tutor;

    Student(Tutor tutor) {
        this.tutor = tutor;
    }

//    public synchronized  void startStudy() {
    public void startStudy() {
        // study
        System.out.println("Student is studying");

    }

//    public synchronized void handInAssignment() {
    public void handInAssignment() {
        tutor.getProgressReport();
        System.out.println("Student handed in assignment");
    }

}
