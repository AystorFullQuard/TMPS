import java.util.HashSet;
import java.util.Set;

public class MP {
    public static void main(String[] args) {
        int size = 4;
        int[] arr = { -1, 2, 5, 8 };

        int[] arr2 = foo(arr, 15);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }

    static int[] foo3(int[] num, int k) {
        int l = 0, r = num.length - 1;
        while (l < r) {
            int sum = num[l] + num[r];
            if (sum == k) {
                return new int[] { num[l], num[r] };
            }
            if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
        return new int[0];
    }

    static int[] foo(int[] num, int k) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int z = j + i; z < num.length; z++) {
                    if (num[i] + num[j] + num[z] == k) {
                        return new int[] { num[i], num[j], num[z] };
                    }
                }
            }
        }
        return new int[0];
    }

    static int[] foo1(int[] num, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            int numFind = k - num[i];
            if (set.contains(numFind)) {
                return new int[] { numFind, num[i] };
            }
            set.add(num[i]);
        }

        return new int[0];

    }
}