public class PracticeSwitch {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("You selected Light.");
                break;
            case "Night":
                System.out.println("You selected Night.");
                break;
            case "Blue Dark":
                System.out.println("You selected Blue Dark.");
                break;
            case "Dark":
                System.out.println("You selected Dark.");
                break;
            default:
                System.out.println("Select an option.");
        }
    }
}
