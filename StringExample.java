public class StringExample {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");      // doesn’t change s
        System.out.println(s);   // prints Hello
        s = s + " World";        // new String assigned
        System.out.println(s);   // prints Hello World
    }
}

