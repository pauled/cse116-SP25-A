package week5;

public class LinkedListNode <T>{
    private T value;
    private LinkedListNode next;

    public LinkedListNode(T val, LinkedListNode next){
        this.value=val;
        this.next=next;
    }
    public T getValue(){
        return this.value;
    }
    public String toString(){
        String out="";
        out+=this.value+" ";
        if(this.next!=null){
            out+=this.next.toString();
        }
        return out;
    }
    public int size(){
        if (this.next==null){
            return 1;
        } else {
            int temp= this.next.size();
            System.out.println("size-val: "+this.value+" temp:"+temp);
            return temp+1;
        }
    }
    public void append(LinkedListNode toAdd){
        if (this.next==null){
            this.next=toAdd;
        } else {
            this.next.append(toAdd);
        }
    }
    public boolean insert(int loc,LinkedListNode val){
        if (loc==1){
            val.next=this.next;
            this.next=val;
            return true;
        } else if(this.next==null){
            return false;
        } else {
            return this.next.insert(loc-1,val);
        }
    }
    /*
    1) method size that returns the size
    2) method append that adds a node at the end
    3) find which returns the node with a value input
    4) insert which takes a node and a location and puts the node in that
    location
     */
    public static void main(String[] args) {
        LinkedListNode<Integer> first=new LinkedListNode<>(1,null);
        first=new LinkedListNode<>(2,first);
        first=new LinkedListNode<>(3,first);
        String out=first.toString();
        System.out.println(out);
        System.out.println(first.size());
    }
}
