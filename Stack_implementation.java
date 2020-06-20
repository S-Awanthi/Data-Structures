
public class Stack_implementation {

    //Declaring variables
    int max_size;
    int marks[];
    int top = -1;

    //Creating a constructor
    public Stack_implementation() {
        max_size = 4;
        marks = new int[max_size];
        top = -1;  //initially stack is empty 
    }

    //inserting elements(PUSH operation)
    void push(int num) {
        if (top > (max_size - 1)) {
            System.out.println("STACK IS FULL");
        } else {
            marks[++top] = num;
        }
    }

    //removing elements from the stack(POP operation)
    public int pop() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
            return 0;
        } else {
            return marks[top--];
        }
    }

    //reading the top element
    public int peek() {
        if (top == -1) {
            System.out.println("STACK IS EMPTY");
        }
        return marks[top];
    }

    public static void main(String[] args) {
        Stack_implementation st = new Stack_implementation();
        st.push(5);
        st.push(10);
        st.push(48);
        st.push(41);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
    }

}
