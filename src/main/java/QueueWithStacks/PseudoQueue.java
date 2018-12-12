package QueueWithStacks;
import java.util.Stack;

public class PseudoQueue<T> {
    /* make this stack behave like a queue
     * using two stacks to do so*/

    //Instance Variables
    protected Stack<T> enQueue;
    protected Stack<T> deQueue;

    //Constructor
    public PseudoQueue(){
        this.enQueue = new Stack<>();
        this.deQueue = new Stack<>();
    }

    /**Instance Methods**/

    //EnQueue Method
    public void enQueueM(T data){
        if(this.enQueue.peek() == null && this.deQueue.peek() ==null){
            this.enQueue.push(data);
        }else if(this.deQueue.peek() == null){
            this.enQueue.push(data);
        }else{
            while(this.deQueue.peek() != null){
                this.enQueue.push(this.deQueue.pop());
            }
            this.enQueue.push(data);
        }
    }

    //DeQueue Method
    public T deQueueM(){
        if(this.enQueue.peek() == null && this.deQueue.peek() == null){
            return null;
        }else if(this.enQueue.peek() == null){
            return this.deQueue.pop();
        }else{
            while(this.enQueue.peek() != null){
                this.deQueue.push(this.enQueue.pop());
            }
            return this.deQueue.pop();
        }
    }

}
