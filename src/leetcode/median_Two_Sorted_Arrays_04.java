/**
 * 
 */
package leetcode;

/**
 * @author sihangjun
 * 下午7:10:45
 */
public class median_Two_Sorted_Arrays_04 {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {		
		int l1=0;int l2 = 0;
		int index = 0;
		while(l1<nums1.length && l2<nums2.length && index<(nums1.length+nums2.length)/2){
			if(nums1[l1]<=nums2[l2]) {l1++;}
			else {l2++;}
			index++;
		}
		while(l1<nums1.length && index<(nums1.length+nums2.length)/2){
			l1++;
			index++;
		}
		while(l2<nums2.length && index<(nums1.length+nums2.length)/2){
			l2++;
			index++;
		}
		l1 = l1 == nums1.length?l1-1:l1;
		l2 = l2 == nums2.length?l2-1:l2;
		if((nums1.length+nums2.length)%2==0){
			int sum  = 0;
			if(nums1[l1]<nums2[l2]){
				sum = nums1[l1];
				if(l1>=1) sum += nums1[l1-1];
				else sum += nums2[l2];
			}else{
				sum = nums1[l2];
				if(l2>=1) sum += nums1[l2-1];
				else sum += nums1[l1];
			}
			/*if(nums1.length>=1&&nums2.length>=1)
				return (nums1[l1]+nums2[l2])/2.0;
			else if (nums1.length>=1)
				return (nums1[l1]+nums1[l1-1])/2.0;
			else
				return (nums2[l2]+nums2[l2-1])/2.0;*/
			return sum/2.0;
			
		}
		else {
			if(nums1.length>=1&&nums2.length>=1)
				return nums1[l1]<nums2[l2]?nums1[l1]:nums2[l2];
			else if(nums1.length>=1)
				return nums1[l1];
			else
				return nums2[l2];
		}
        
    }
	public static void main(String[] args){
		int[] nums1 = {1,2,5};
		int[] nums2 = {3,4,6};
		double res = findMedianSortedArrays(nums1,nums2);
		System.out.println(res);
	}

}
