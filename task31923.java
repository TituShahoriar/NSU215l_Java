public class task31923 {
    public static void main(String[] args) {
        String str = "correspondingoioi";
        int index = getSLV(str);
        System.out.println("2nd last vowel: " + index);
    }
    public static int getSLV(String str) {
        int index = -1;
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = Character.toLowerCase(str.charAt(i));
            if ("aeiou".indexOf(c) >= 0) {
                count++;
                if (count == 2) {
                    index = i;
                    break;
                }
                //public static boolean isVowel(char c) {
                //  c = Character.toLowerCase(c);
                //return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
            }
        }
        return index;
    }
}

