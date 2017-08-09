import java.util.HashMap;

class PairSum
{
    /*
     * Problem: find all pairs of integers within an array which sum to a specified value.
     */
    public static void main(String[] args)
    {
        // A couple simple tests.
        PairSum.printPairsThatSumToValue(new int[] {1, 2, 3, 4}, 5);
        PairSum.printPairsThatSumToValue(new int[] {1, 2, 3, 4}, 6);
    }

    private static void printPairsThatSumToValue(int[] array, int sum)
    {
        if (array.length <= 1) {
            return;
        }

        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(array[0], 0);

        for (int i = 1; i < array.length; i++) {
            int current = array[i];

            if (hs.containsKey(sum - current)) {
                int index = hs.get(sum - current);
                System.out.printf("%d, %d\n", Math.min(i, index), Math.max(i, index));
            }

            hs.put(current, i);
        }
    }

}