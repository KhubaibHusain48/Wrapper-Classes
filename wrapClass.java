package Concepts.Wrapperclasses;

public class wrapClass {
    public static void main(String[] args) {
        Integer first = Integer.valueOf(7);
        Integer second = 4; // Automatic conversion between primitive type and wrapper class(Autoboxing)
        System.out.println(first);
        int a = first; // Unboxing
    }
}
