 class Codebat{

    // Method to reverse an array of length 3
    public static int[] reverse3(int[] arr) {
        if (arr.length != 3) {
            throw new IllegalArgumentException("Array must have exactly 3 elements");
        }
        return new int[]{arr[2], arr[1], arr[0]};
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 11, 9};
        int[] arr3 = {7, 0, 0};

       // Testing the reverse3 method
        int[] reversed1 = reverse3(arr1);
        int[] reversed2 = reverse3(arr2);
        int[] reversed3 = reverse3(arr3);

        System.out.println(java.util.Arrays.toString(reversed1));
        System.out.println(java.util.Arrays.toString(reversed2)); 
        System.out.println(java.util.Arrays.toString(reversed3)); 
    }

    }

    