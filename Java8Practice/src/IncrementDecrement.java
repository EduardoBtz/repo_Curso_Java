public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4

        lives--;
        System.out.println(lives); //3

        // Prefix.
        // Gets a gift per life.
        int gift = 100 + ++lives; // prefix
        System.out.println(gift);
        System.out.println(lives);

    }
}














