public class Main {
    public static void main(String[] args) {
        String[] strings = ArrayCreator.create(String.class, 10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);


        for (String s: strings) {
            System.out.println(s);
        }

        for (Integer i: integers) {
            System.out.println(i);
        }
    }
}
