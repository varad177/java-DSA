//we will solve some problems

class arr {

    // for calculating pair sum
    static void pairsum(int arr[], int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }

            }
        }
        System.out.println("the sum pair are " + ans);

    }

    // for calculating tripplet sum
    static void trisum(int arr[], int target) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        sum++;
                    }
                }
            }
        }
        System.out.println("the tri pair sum are " + sum);
    }

    // find unique elements which is come only 1 times in array
    static void find_unique_element(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }

    }

    // find 2nd largest element in array
    static int largest_elements(int arr[]) {

        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static void second_largest_elements(int arr[]) {

        int max = largest_elements(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = largest_elements(arr);
        System.out.println("the second largest element is " + secondmax);

    }
    static  void first_repeating_element(int arr[]){
        int n= arr.length;
        for(int i =1; i<n ; i++){
           for(int j =i+1; j<n; j++){
            if(arr[i]==arr[j]){
                int r = arr[i];
                System.out.println(" the first reapeting element is" +r);
                break;
            }
           }
        }
    }

    void number() {
        int age[] = { 1, 2, 3, 4, 3, 4, 2 };
        pairsum(age, 6);
        trisum(age, 6);

        int ages[] = { 1, 2, 3, 4, 2, 1, 4, 11, 3 };
        // find_unique_element(ages);
        largest_elements(ages);
        second_largest_elements(ages);
        int [] agess={1,2,3,4,5,2};
        first_repeating_element(agess);

    }

}

public class arrays_problems {
    public static void main(String[] args) {
        arr a = new arr();
        a.number();

    }

}
