package two.sum;

public class Test {

    private static Solution sol = new Solution();

    public static void test1() {

        int[] inputArray1 = {4,5,1,3,7,0,-1,10};

        int target1 = 14;

        int[] result = sol.twoSum(inputArray1, target1);

        System.out.println("Expect: 0, 7" + ". actual: " + result[0] + ", " + result[1]);
    }
}