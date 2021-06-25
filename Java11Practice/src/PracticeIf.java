public class PracticeIf {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int filesSended = 3;

        if (isBluetoothEnabled) {
            // Send file
            filesSended++;
            System.out.println(filesSended);
        }else {
            filesSended--;
            System.out.println("Blue tooth is not turned on.");
        }
    }
}
