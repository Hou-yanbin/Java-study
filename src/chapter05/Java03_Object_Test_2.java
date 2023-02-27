package chapter05;

public class Java03_Object_Test_2 {
    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组 - 选择排序
        int[] nums = {1,4,3,5,2};

        for ( int j = 0; j < nums.length; j++ ) {
            int maxIndex = 0;
            for ( int i = 1; i < nums.length - j; i++ ) {
                if ( nums[i] > nums[maxIndex] ) {
                    maxIndex = i;
                }
            }

            int num1 = nums[nums.length-j-1];
            int num2 = nums[maxIndex];

            nums[maxIndex] = num1;
            nums[nums.length-j-1] = num2;
        }



        for (int num : nums) {
            System.out.println(num);
        }

    }
}
