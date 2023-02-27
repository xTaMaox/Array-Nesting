object Solution {
    def arrayNesting(nums: Array[Int]): Int = {
        val n=nums.length
        val vis=new Array[Boolean](n)
        def solve(i:Int):Int={
            var ans=1
            vis(i)=true
            if(!vis(nums(i)))
            ans+=solve(nums(i))
            ans
        }
        var maxi=1;
        for(i <- 0 until n)
        maxi=maxi max solve(i)
        maxi
    }
}