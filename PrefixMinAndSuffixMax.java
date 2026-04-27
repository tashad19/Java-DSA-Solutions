import java.util.*;
 
public class PrefixMinAndSuffixMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t--!=0){
            int n = sc.nextInt();
            
            int[] minSoFar = new int[n];
            int[] maxSoFar = new int[n];
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            
            int min = arr[0];
            for(int i=0; i<n; i++){
                min = Math.min(min, arr[i]);
                minSoFar[i] = min;
            }
            
            int max = arr[n-1];
            for(int i=n-1; i>=0; i--){
                max = Math.max(max, arr[i]);
                maxSoFar[i] = max;
            }
            
            for(int i=0; i<n; i++){
                if(minSoFar[i] == arr[i] || maxSoFar[i] == arr[i]){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}