import java.util.*;

public class MonotonicStack {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 8, 7};
        int[] res = PrevGreaterElements(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] PrevGreaterElements(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.empty() && arr[stack.peek()] < arr[i]) {
                int prevGreaterIndex = stack.pop();
                result[prevGreaterIndex] = i;
            }
            stack.push(i);
        }
        return result;
    }
}
