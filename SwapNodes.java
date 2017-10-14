// Swap Nodes

import java.io.*;
import java.util.*;

public class SwapNodes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int root = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int tree[][] = new int[1+n][2];
        for(int i=1;i<1+n;i++){
            for(int m=0;m<2;m++){
                tree[i][m]=scan.nextInt();
            }
        }
        int t = scan.nextInt();
        for(int j=0;j<t;j++){
            int k = scan.nextInt();  
            swap(tree, root, k, 1);
            System.out.println();
            }
    }
         public static void swap(int [][] tree, int node, int targetDepth,
            int depth) {
        if(node == -1) return;

        if(depth % targetDepth == 0) {
            int temp = tree[node][0];
            tree[node][0] = tree[node][1];
            tree[node][1] = temp;
        }
        swap(tree, tree[node][0], targetDepth, depth+1);
        System.out.print(Integer.toString(node) + " ");
        swap(tree, tree[node][1], targetDepth, depth+1);
    }
}
        
    
