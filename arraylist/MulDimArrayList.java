package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MulDimArrayList {
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
        int n = ab.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialisation
        for(int i = 0;i<n;i++){           // n = no. of lists
            list.add(new ArrayList<>());
        }

        // add elements 
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                list.get(i).add(ab.nextInt());
            }
        }

        System.out.println(list);

    }
    
}
