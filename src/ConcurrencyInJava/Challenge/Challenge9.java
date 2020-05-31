package ConcurrencyInJava.Challenge;

/**
 * Spot the problem in the code and fix it.
 * SOLUTION: Again we have a deadlock. The tutor holds the both keys, releases the tutor key, the student acquires it and then
 * the deadlock occurs.
 * To solve this problem, the getProgressReport() method has to happen after the student started studying, but if the tutor
 * is calling wait() and the other thread gets the tutor lock, before wait() the studying process has to occur, because once the
 * student thread gets the tutor lock, it executes the getProgressReport() method.
 * The solution code is written below, and the commented lines are the initial lines of the code which had a deadlock.
 */
public class Challenge9 {
    public static void main(String[] args) {
        final NewTutor tutor = new NewTutor();
        final NewStudent student = new NewStudent(tutor);
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

class NewTutor {
    private NewStudent student;

    public void setStudent(NewStudent student) {
        this.student = student;
    }

    public void studyTime() {

        synchronized (this) {
            System.out.println("Tutor has arrived");
            synchronized (student) {
//                try {
//                    // wait for student to arrive
//                    this.wait();
//                } catch (InterruptedException e) {
//
//                }
                student.startStudy();
                System.out.println("Tutor is studying with student");
            }
            //the try-catch was moved below the student.startStudy() and the printed statement
            try {
                // wait for student to arrive
                this.wait();
            } catch (InterruptedException e) {

            }
        }
    }

    public void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class NewStudent {

    private NewTutor tutor;

    NewStudent(NewTutor tutor) {
        this.tutor = tutor;
    }

    public void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public void handInAssignment() {
        synchronized (tutor) {
//            tutor.getProgressReport();
            synchronized (this) {
                //the following line is added
                tutor.getProgressReport();
                System.out.println("Student handed in assignment");
                tutor.notifyAll();
            }
        }
    }
}
