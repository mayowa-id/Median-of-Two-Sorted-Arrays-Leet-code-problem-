public class Solution {


       public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] sortedArray = sortArray(nums1, nums2);
            int size = nums1.length + nums2.length;
            int m =0;
            if (size %2 == 0){
               m = ((sortedArray[size/2]) + sortedArray[(size/2)+1])/2;
            }
            else{
                m= (size + 1)/2;
            }
           double Median = (double)sortedArray[m];
            return Median;
        }


        public int[] sortArray(int[] array1, int[] array2){
            int size = array1.length + array2.length;
            int i;
            int j;
            int k =0;

            int[] sortedArray = new int[size];
            for(i=0; array1.length > i; i++ ){
                for(j=0; array2.length > j; j++){
                    if (array1[i] <= array2[j]){
                        sortedArray[k] = array1[i];
                    }
                    else {
                      sortedArray[k] = array2[j];
                    }
                }

            }
            return sortedArray;
        }
    }
