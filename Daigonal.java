import java.util.*;
public class Daigonal{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][] =new int[3][3];
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum =0;
        System.out.println("@@@@@@@@@@@@@@@@@@@@");
        for(int x=0;x<arr.length;x++){
            for(int y=0 ;y<arr[x].length;y++){
                if(x!=y){
                    continue;
                }else{
                   sum=sum+arr[x][y];                    
                }
            }
        }
        System.out.println("Sum is : "+sum);
    }
}