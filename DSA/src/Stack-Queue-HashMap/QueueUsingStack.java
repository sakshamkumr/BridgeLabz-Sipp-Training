import java.util.*;
class QueueUsingStack{
    ArrayList<Integer> list = new ArrayList<>();
    // check if stack is empty or not.
    public boolean stack_khali_to_nahi(){
        return list.size() == 0;
    }
    // Add element to list
    public void stack_me_element_daalo(int n){
        list.add(n);
    }
    // remove element to list
    public  int stack_ke_element_nikaalo(){
        if(list.size() == 0){
            return -1;
        }
        int top_Element = list.get(list.size() - 1);
        list.remove(list.size()-1);
        return top_Element;
    }
    // Peek Top element from stack.
    public  int upr_vaala_element_dekho(){
        if(list.size() == 0){
            return -1;
        }
        return list.get(list.size() - 1);
    }
}
public class Main
{
     
	public static void main(String[] args) {
		QueueUsingStack x = new QueueUsingStack();
        ArrayList<Integer> queue = new ArrayList<>();
		x.stack_me_element_daalo(1);
		x.stack_me_element_daalo(2);
		x.stack_me_element_daalo(3);
		x.stack_me_element_daalo(4);
		x.stack_me_element_daalo(5);
		System.out.println("Stack");
		while(!x.stack_khali_to_nahi()){
		    System.out.println(x.upr_vaala_element_dekho());
		    int removed_element = x.stack_ke_element_nikaalo();
            queue.add(removed_element);
		}
		System.out.println("Forming Queue Using Stack");
        for(int i = queue.size()-1;i>=0;i--){
            System.out.println(queue.get(i));
        }
	}
}
