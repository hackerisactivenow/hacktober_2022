import java.util.*;
public class AngryProfessor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++)
        {
            int count=0;
            int size = sc.nextInt();
            int thres = sc.nextInt();
            int arr[] = new int[size];
            for(int j =0;j<size;j++)
            {
                arr[j] = sc.nextInt();
                if(arr[j]<=0)
                count++;
            }
                if(count < thres)
                System.out.println("YES");
                else
                System.out.println("NO");
        }
    }
}
