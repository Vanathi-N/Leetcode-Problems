class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp=new int[nums1.length+nums2.length];
        int i1=0,i2=i1,i3=i2;
        while(i1<nums1.length && i2<nums2.length){
            if(nums1[i1]<nums2[i2]){
                temp[i3]=nums1[i1];
                i1++;
            }else{
                temp[i3]=nums2[i2];
                i2++;
            }
            i3++;
        }
        while(i1<nums1.length){
            temp[i3]=nums1[i1];
            i1++;
            i3++;
        }
        while(i2<nums2.length){
            temp[i3]=nums2[i2];
            i2++;
            i3++;
        }
        if(temp.length%2==0) return ((double)(temp[temp.length/2-1]+temp[temp.length/2])/2);
        else return (temp[temp.length/2]);
    }
}