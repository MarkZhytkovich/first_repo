public class Sun {

    static int count = 3;
    public static final String OUTPUT_TEXT = "Солнце вставало следующее количество раз: ";

    public static void daybreak() {
        count += 1;
    }

    public static void sunrisesCount() {
            System.out.println(OUTPUT_TEXT + count);
    }
}