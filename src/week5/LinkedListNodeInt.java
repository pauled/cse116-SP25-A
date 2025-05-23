package week5;

public class LinkedListNodeInt {
    private int value;
    private LinkedListNodeInt next;

    public LinkedListNodeInt(int val, LinkedListNodeInt next) {
        this.value = val;
        this.next = next;
    }
    public String toString(){
        String out="";
        out+=this.value+" ";
        if (this.next!=null){
            out+=this.next.toString();
        }
        return out;
    }
    public String toString2(){
        String out="";
        out+=this.value+" ";
        LinkedListNodeInt temp=this.next;
        while (temp.next!=null){
            out+=temp.value+" ";
            temp=temp.next;
        }
        return out;
    }

    public static void main(String[] args) {
        LinkedListNodeInt first = new LinkedListNodeInt(1, null);
        first = new LinkedListNodeInt(2, first);
        first = new LinkedListNodeInt(3, first);
        String out=first.toString();
        System.out.println(out);
    }
}
