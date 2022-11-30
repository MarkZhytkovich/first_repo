public class StringHomework {
    public static void main(String [] args) {
        String TestString = "I like Java!!!";
        System.out.println(TestString);
        System.out.println(TestString.charAt(13));
        System.out.println(TestString.contains("Java"));
        System.out.println(TestString.replace("a", "o"));
        System.out.println(TestString.toUpperCase());
        System.out.println(TestString.toLowerCase());
        System.out.println(TestString.substring(7, 11));

        String cake = "корж %s корж";
        System.out.println(String.format(cake, "крем"));

    }


}

