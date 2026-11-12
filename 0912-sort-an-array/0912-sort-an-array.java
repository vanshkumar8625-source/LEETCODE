class Solution {
    public static void merge(int arr[], int start, int mid, int end) {
        int size = end - start + 1;
        int temp[] = new int[size];

        int person1 = start;
        int person2 = mid + 1;
        int k = 0;
        while (person1 <= mid && person2 <= end) {
            if (arr[person1] >= arr[person2]) {
                temp[k] = arr[person2];
                person2++;
            } else {
                temp[k] = arr[person1];
                person1++;
            }
            k++;
        }

        while (person1 <= mid) {
            temp[k++] = arr[person1++];
        }

        while (person2 <= end) {
            temp[k++] = arr[person2++];
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp[i - start];
        }
    }

    void mergesort(int start,int end,int []arr){
        if(start == end)return;

        int mid = start + (end -  start)/2;

        mergesort(start,mid,arr);
        mergesort(mid+1,end,arr);

        merge(arr,start,mid,end);
    }

    public int[] sortArray(int[] nums) {
        int length = nums.length;
        mergesort(0,length-1,nums);

        return nums;
    }
}