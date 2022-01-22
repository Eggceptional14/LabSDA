public class Tester {
    public static void main(String[] args) {
        Bob b = new Bob();

        b.addMood(new MoodGrumpy());
        b.addMood(new MoodOk());
        b.addMood(new MoodHappy());

        System.out.println(b.getMood(1));
        System.out.println(b.getMood(2));
        System.out.println(b.getMood(3));

    }
}
