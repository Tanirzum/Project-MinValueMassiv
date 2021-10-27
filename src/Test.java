public class Test {
    public static void main(String[] args) {

        int[] array = {12, 34, 54, 65, 76, 87, 87, 65, 34, 1};
        int minValue = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value: " + minValue);
        System.out.println("min index: " + minIndex);
    }
}
