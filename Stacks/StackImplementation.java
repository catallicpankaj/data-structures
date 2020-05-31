/**
 * Sample program in java to implement a stack using Array (bounded) 
 */
public class StackImplementation {
    int MAX = 100;
    int top = -1;
    int newArray[] = new int[MAX];

    boolean isEmpty(){
        return top<0;
    }

    boolean push (int x){
        if(top == MAX){
            System.out.println("overflow");
            return false;
        }
        else{
            top = top+1;
            newArray[top]=x;
            return true;
        }
    }

    int pop(){
        if(top<0){
            System.out.println("underflow");
            return 0;
        }
        else{
            int x = newArray[top];
            top --;
            return x;
        }
    }

    int peek(){
        if(top<0){
            System.out.println("underflow");
            return 0;
        }
        else{
            return  newArray[top];
        }
    }


}