/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* buildArray(int* nums, int numsSize, int* returnSize) {
  int c=0;
    int* ans=(int*)malloc(numsSize*sizeof(int));
    for(int i=0;i<numsSize;i++)
    {
        ans[c++]=nums[nums[i]];
    }
    *returnSize=c;
    return ans;
}