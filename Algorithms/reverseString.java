public class reverseString {
    public static void main(String[] args) {
        String str = new String("Anime");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        System.out.println(str);
    }
}
