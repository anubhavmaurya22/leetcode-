class Solution:
    def combinationSum2(self, candidates: list[int], target: int) -> list[list[int]]:
        candidates.sort()
        res=[]
        
        def dfs (start , remaining ,comb):
            if remaining ==0:
                res.append(comb.copy())
                return 
            if remaining <0 :
                return 

            for i in range (start ,len(candidates)):
                if i>start and candidates [i]== candidates[i-1]:
                    continue
                if candidates [i]>remaining :
                    break 

                comb.append(candidates[i])
                dfs(i+1, remaining -candidates[i],comb)
                comb.pop()
        dfs (0,target,[])
        return res
                
                               
        