import java.util.HashSet;
import java.util.Set;

class GenerateMSet {
    public static void main(String[] args)
    {
        int[] arr = {5, 7, 8, 1};
        Set<Integer> result = GenerateMSet.generateMSet(2, arr);

        for (Integer i : result) {
            System.out.println(i);
        }
    }

    private static Set<Integer> generateMSet(int m, int[] arr)
    {
        if (m >= arr.length) {
            throw new IllegalArgumentException();
        }

        Set<Integer> result = new HashSet<>();

        int count = 0;

        while (count < m) {
            int random = (int) (Math.random() * (arr.length - count + 1));

            int tmp = arr[count];
            arr[count] = arr[random];
            arr[random] = tmp;

            result.add(arr[count]);

            count++;
        }

        return result;
    }
}