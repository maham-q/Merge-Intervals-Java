import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class q3{
   
    public static void mergeIntervals(List<int[]> ilist){
        if (ilist==null||ilist.size()<0) {
            return ;
        }
        for(int i=0;i<ilist.size()-1;i++){

            int temp1[]=ilist.get(i);
            int temp2[]=ilist.get(i+1);
            int start1=temp1[0];
            int end1=temp1[1];
            int start2=temp2[0];
            int end2=temp2[1];
            if(end1>start2){
                temp1[1]=end2;
                ilist.remove(i+1);
            }
        }
    }
    public static void display(List<int[]> ilist){
        System.out.println("[");
        for(int i=0;i<ilist.size();i++){
            System.out.println("  ["+ilist.get(i)[0]+","+ilist.get(i)[1]+"],");
        }
        System.out.println("]");
    }
    public static void main(String[] args){
        System.out.println("Merge Intervals in Java");
        List<int[]> iList=new ArrayList<>(Arrays.asList(
            new int[]{1, 3},
            new int[]{2, 6},
            new int[]{8, 10},
            new int[]{15, 18}
        ));
        display(iList);
        mergeIntervals(iList);
        display(iList);

    }
}