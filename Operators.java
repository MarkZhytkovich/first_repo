public class Operators {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                System.out.println("один");
            }
            if (i == 2) {
                System.out.println("два");
            }
            if (i == 3) {
                System.out.println("три");
            }
            if (i == 4) {
                System.out.println("четыре");
            }
            if (i == 5) {
                System.out.println("пять");
            }
        }

        int num = 1;
        switch(num) {
            case 1:
                System.out.println("один");
            case 2:
                System.out.println("два");
            case 3:
                System.out.println("три");
            case 4:
                System.out.println("четыре");
            case 5:
                System.out.println("пять");
        }

        int k = 10;
        int sum = 0;
        while (k <= 55) {
            if (k % 2 == 0) {
                sum += k;
            }
            k++;
        }
        System.out.println(sum);
}}