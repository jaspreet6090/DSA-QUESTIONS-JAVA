// Given an array ‘arr’ of integer numbers, ‘arr[i]’ represents the number of pages in the ‘i-th’ book.



// There are ‘m’ number of students, and the task is to allocate all the books to the students.



// Allocate books in such a way that:

// 1. Each student gets at least one book.
// 2. Each book should be allocated to only one student.
// 3. Book allocation should be in a contiguous manner.


// You have to allocate the book to ‘m’ students such that the maximum number of pages assigned to a student is minimum.



// If the allocation of books is not possible, return -1.



class AllocationBooks{
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;
        System.out.println(allocateBooks(arr, m));
    }

    public static int allocateBooks(int[] arr, int m){
        int n = arr.length;
        if(n < m) return -1;
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){
            start = Math.max(start, arr[i]);
            end += arr[i];
        }
        int res = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isValid(arr, n, m, mid)){
                res = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }

    public static boolean isValid(int[] arr, int n, int m, int mid){
        int student = 1;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum > mid){
                student++;
                sum = arr[i];
            }
            if(student > m) return false;
        }
        return true;
    }
}