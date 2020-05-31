package FirstSteps.ByteShortIntLongChallenge;

public class Challenge {
    public static void main(String[] args) {

        int myInt = 12345678;
        byte myByte = 123;
        short myShort = 12345;
        long myLong = 50_000L + 10 * (myInt + myByte + myShort);
        System.out.println("My long value: " + myLong);
    }
}
