public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] copyFrom = {"Arabica", "Mocha", "Cappuccino", "Cortado", "Deepo", "Espresso"};
        String[] copyTo = new String[3];

        // copy one element ("Cappuccino") from index 2 of copyFrom into copyTo[0]
        System.arraycopy(copyFrom, 2, copyTo, 0, 1);

        // print copyTo
        for (int i = 0; i < copyTo.length; i++) {
            System.out.println(copyTo[i]);
        }
    }
}
