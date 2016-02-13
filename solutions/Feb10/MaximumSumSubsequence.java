import java.util.Scanner;

public class MaximumSumSubsequence {

	//Size and elements of the array
	public static int N;
	public static int a[] = new int[1000100];

	public static void method1() {
		long prefixSum = 0; //the current prefix sum

		long minPrefixSum = 0; //the smallest prefix sum to the left of the current index
		int minIndex = 0; //the index of the smallest prefix sum

		long maxSum = 0; //the maximum sum of a subsequence
		int leftIndex = 1, rightIndex = 1; //the ends of the subsequence of maximum sum

		for(int i=1;i<=N;++i) {
			prefixSum += a[i];
			if(prefixSum - minPrefixSum > maxSum) { //we update the maximum sum if necessary
				maxSum = prefixSum - minPrefixSum;
				leftIndex = minIndex+1; //the subsequence starts after the smallest prefix sum
				rightIndex = i; //the subsequence ends at the current index
			}
			if(prefixSum < minPrefixSum) { //we update the smallest prefix sum if necessary
				minPrefixSum = prefixSum;
				minIndex = i;
			}
		}
		System.out.println("Sum "+maxSum+" from "+leftIndex+" to "+rightIndex);
	}

	public static void method2() {
		//This uses the same principle as method1, but instead of storing the position of the
		//minimum prefix sum and subtracting it from the current prefix sum, it uses a single
		//variable, that gets reset to 0 every time it becomes negative.
		long currentSum = 0;
		long maxSum = 0;
		int leftIndex = 1;
		int rightIndex = 0;

		for(int i=1;i<=N;++i) {
			if(currentSum + a[i] < 0) {
				//we reset the sum, which is equivalent to subtracting the minimum prefix sum
				currentSum = 0;
				leftIndex = i+1; //the next index is a potential starting point of the best subsequence
			} else {
				currentSum += a[i];
				if(currentSum > maxSum) {
					maxSum = currentSum;
					rightIndex = i;
				}
			}
		}
		System.out.println("Sum "+maxSum+" from "+leftIndex+" to "+rightIndex);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();;
		int maxIndex = 1;
		for(int i=1;i<=N;++i) {
			a[i] = scanner.nextInt();
			if(a[i] > a[maxIndex]) {
				maxIndex = i;
			}
		}
		// If the largest input number is negative, the maximum subsequence is formed of only that number
		if(a[maxIndex] < 0) {
			System.out.println("Sum "+a[maxIndex]+" from "+maxIndex+" to "+maxIndex);
			return;
		}
		method1();
		method2();
	}
}
