// Queue using two stacks

import java.io.*;
import java.util.*;

public class QueueTwoStack {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int value = sc.nextInt();
            if(value == 1){
                int number = sc.nextInt();
                stack1.push(number);
            }
            else if(value == 2){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
                else{
                    while(!stack1.isEmpty()){
                        stack2.push(stack1.pop());
                    }
                    if(!stack2.isEmpty()){
                        stack2.pop();
                    }
                }
            }
            else if(value == 3){
                if(!stack2.isEmpty()){
                    System.out.println(stack2.peek());
                }
                else{
                    while(!stack1.isEmpty()){
                        stack2.push(stack1.pop());
                    }
                    if(!stack2.isEmpty()){
                        System.out.println(stack2.peek());
                    }
                }
            }
        }
    }
}