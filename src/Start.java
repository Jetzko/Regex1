public class Start {
    public static void main(String[] args) {
        String s1 = "I Like to code near the Lake with my friend Luke";
        String s2 = s1.replaceAll("(Li|La)ke",  "Bla");
        System.out.println(s2);
    }
}
