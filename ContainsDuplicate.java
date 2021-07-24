import java.util.HashSet;
import java.util.Arrays;
// teste
// Existem 3 tipos de aproximações diferentes a esse problema
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        
        System.out.println(containsDuplicate1(nums));
        System.out.println(containsDuplicate2(nums));
        System.out.println(containsDuplicate3(nums));
    }
    
    /* 
       Primeira solução, loopar pela vetor de números exponencialmente. (Solução aceitável até certo ponto)
       O problema é que pelo fato de ser exponencial só consegue aguentar vetores até 10 elevado a 4, 
       depois disso da Time Limit Exceed 
    */

    static boolean containsDuplicate1(int[] nums) {
        for(int i: nums){
            for(int j: nums){
                if(nums[i] == nums[j] && i != j) return true;
            }
        }
        return false;
    }

    /* 
       Segunda solução, ordenar o vetor e comparar o index com o index + 1 (Solução aceitável)
    */

    static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i + 1]) return true;
        }

        return false;
    }
    
    /*
        Terceira solução, utilizando HashSet (Solução ideal)
        HashSet é uma lista que não se repete, ou seja podemos usar isso ao nosso favor,
        loopando pelo vetor de nums nós podemos checar se a lista possui o index de num,
        se tiver então retorna true, caso o contrario, adiciona na lista.
    */

    static boolean containsDuplicate3(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i: nums){
            if(set.contains(i)) return true;
            set.add(i);
        }

        return false;
    }
}
