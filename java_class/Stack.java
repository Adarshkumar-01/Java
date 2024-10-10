package java_class;

public class Stack {
    int top=-1;
    int capacity=10;
    int arr[]=new int[capacity];
    void push(int x){
        if(top==capacity-1){
            System.out.println("Stack is full");
            return;
    }else{ 
        top++;
        arr[top]=x;  
    } 
    }
    int pop( ){
        if(top<=-1){
            System.out.println("stack underflow!!");
        }
         int  element=arr[top];
            top--;
            return element;
        
    }
    public static void main(String args[]){
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop());


    }

    
    
}
