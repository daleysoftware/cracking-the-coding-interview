class ShuffleDeck {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        shuffle(array);

        for (int item : array) {
            System.out.println(item);
        }
    }

    private static int random(int min, int max)
    {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    private static void shuffle(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int random = random(array.length - 1, i);
            // Swap the element at i with the element at random.
            int temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
    }
}