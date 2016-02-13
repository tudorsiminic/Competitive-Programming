import java.util.Scanner;

public class BinarySearch {

	//Size and elements of the array
	public static int N;
	public static int a[] = new int[1000100];


	public static int searchEqual(int y) {
		int left = 1, right = N;

		while(left <= right) {
			int mid = (left+right)/2;
			if(a[mid] == y) {
				return mid; //Solution found
			} else if (a[mid] < y) {
				left = mid + 1; //If a solution exists, it is between mid+1 and right
			} else {
				right = mid - 1; //If a solution exists, it is between left and mid-1
			}
		}

		//-1 can't be an index, so returning -1 indicates no solution was found
		return -1;
	}

	public static int searchLargestSmaller(int y) {
		int left = 1, right = N;

		//If this value never gets updated, we return -1, so we know there's no solution
		int candidate = -1;

		while(left <= right) {
			int mid = (left+right)/2;
			if(a[mid] <= y) {
				candidate = mid;
				left = mid + 1; //There might still be a solution between mid+1 and right
			} else {
				right = mid - 1; //If a solution exists, it is between left and mid-1
			}
		}

		return candidate;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		for(int i=1;i<=N;++i) {
			a[i] = scanner.nextInt();
		}
		int y = scanner.nextInt();
		System.out.println(searchEqual(y));
		System.out.println(searchLargestSmaller(y));
	}
}
