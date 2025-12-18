public class DepthNumber {

    public static int Digit(int Number) {
        if (Number == 0) {
            return 1;
        } else {
            return (int) Math.floor(Math.log10(Math.abs(Number))) + 1;
        }
    }
    public static int Armstrong(int Number) {
        int Digits = Digit(Number);
        int sum = 0;
        int NumCopy = Number;

        while (Number > 0) {
            int Singleton = Number % 10;
            sum += Math.pow(Singleton, Digits);
            Number /= 10;
        }

        return (sum == NumCopy) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 500};
        for (int i = arr[0]; i <= arr[1]; i++) {
            int YesNo = Armstrong(i);
            if (YesNo == 1) {
                System.out.println(i + " is Armstrong");
            } else {
                System.out.println(i + " is Not Armstrong");
            }
        }
    }
}
