import java.util.*;
 
public class DandelionFields {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--!=0){
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            ArrayList<Integer> odds = new ArrayList<>();
            
            long total = 0;
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2!=0) odds.add(arr[i]);
                else total += arr[i];
            }
            
            Collections.sort(odds, (a,b) -> b - a);
            
            for(int i=0; i<(odds.size()+1)/2; i++){
                total += odds.get(i);
            }
            
            if(odds.size()==0) total = 0;
            
            // System.out.println(odds);
            System.out.println(total);
        }
    }
}