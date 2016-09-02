public class CheckAnagram
{
    private static boolean isAnagramSet(String s1, String s2)
    {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] hits1 = new int[256];
        int[] hits2 = new int[256];

        for (int i = 0; i < 256; i++) {
            hits1[i] = 0;
            hits2[i] = 0;
        }

        for (int i = 0; i < s1.length(); i++) {
            hits1[s1.charAt(i)]++;
            hits2[s2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (hits1[i] != hits2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        String s1 = "test";
        String s2 = "estt";
        
        System.out.println(isAnagramSet(s1, s2));
    }
}