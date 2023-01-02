// Remove Duplicates from Sorted Array

function removeDuplicates(nums: number[]): number {
    let insertingIndex = 1;
    for (let i = 1; i < nums.length; i++) {
        if (nums[insertingIndex - 1] != nums[i]) {
            nums[insertingIndex] = nums[i];
            insertingIndex++;
        }
    }
    return insertingIndex;
};
