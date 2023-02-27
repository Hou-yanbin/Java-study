package chapter05;

public class Java03_Object_Test_1 {
    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组
        int[] nums = {1,4,3,5,2};

        // TODO 希望获取到的数据，1，2，3，4，5
        // 简化需求：将数组中的最大值放置数组的最后
        for ( int j = 0; j < nums.length; j++ ) {
            for ( int i = 0; i < nums.length - j - 1; i++ ) {
                int num1 = nums[i];
                int num2 = nums[i+1];
                if ( num1 > num2 ) {
                    // 左边的数据大于右边的数据，应该交互位置
                    nums[i] = num2;
                    nums[i+1] = num1;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
