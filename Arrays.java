public class Arrays {

    public static void main(String[] args) {
        int[] numbers = new int[56];
        int average = 0;
        int sum = 0;
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
            sum += numbers[i];
            average = sum / numbers.length;
            }
        System.out.println(average);


        int[] massiv = new int[200];
        int max = massiv[0];
        for (int i = 1; i < massiv.length; i++) {
            massiv[i] = i;
            if (massiv[i] > 0) {
                max = massiv[i];
            }
        }
        System.out.println(max);
}}