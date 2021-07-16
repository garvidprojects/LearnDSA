import java.util.*;
public class hasPairWithSum {
    public static void main(String[] args){
        int setOfNums[] = {1,2,3,9};
        if(hasPairwithSums(setOfNums,8)){
            System.out.println("Found a pair");
        }
        else{
            System.out.println("No pair found !!");
        }
    }

    public static boolean hasPairwithSums(int [] set, int target){
        
        HashSet<Integer> comp = new HashSet<Integer>();
        for(int i = 0 ; i < set.length; i++){
            if(comp.contains(target-set[i])){
                return true;
            }
            comp.add(target-set[i]);
        }
        return false;
    }
}
