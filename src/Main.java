import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pozgs= in.nextInt();
        int[]nums=new int[15];
        int max;
        int col;
        for (int i=0; i<nums.length;i++){
            nums[i]= 0;
        }

        for (int i=0;i<pozgs;i++){
            nums[in.nextInt()-1]+=1;
        }
        for (int j =0;j<3;j++){
            max=0;
            col=0;
            for(int i =0;i<nums.length;i++){
                if (nums[i]>col){
                    col = nums[i];
                    max = i+1;
                }
            }
            System.out.println(max);
            System.out.println(col);
            nums[max-1]=0;
        }

    }
}