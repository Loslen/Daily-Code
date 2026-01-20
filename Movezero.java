class Movezero {
    public void moveZeroes(int[] nums) {
        if(nums==null) {
            return;
        }
        //最初の走査時に非ゼロの個数を記録する
        int j = 0;
        for(int i=0;i<nums.length;++i) {
            if(nums[i]!=0) {
                nums[j++] = nums[i];
            }
        }
        //非ゼロ要素のカウントが終わったら
        //２回目の走査でまつびの要素にゼロを代入すればいいです
        for(int i=j;i<nums.length;++i) {
            nums[i] = 0;
        }
    }
}
