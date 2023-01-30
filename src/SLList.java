public class SLList {
private IntNode first;
private int size;

private IntNode sentinal;
private int saize;
public SLList(int x) {
    sentinal = new IntNode(0, null);
    sentinal.next = new IntNode(x, null);
    size = 1;
}
    public  SLList(){
       sentinal = new IntNode(0, null);
        size = 0;
    }
    public void addFirst(int x){
    sentinal.next = new IntNode(x, sentinal.next);
    size++;
    }

    public int getFirst(){
    return sentinal.next.item;
    }

    public void addLast(int  x){

    size++;
    IntNode p = sentinal;

    while(p.next != null){
        p = p.next;
    }
    p.next = new IntNode(x, null);
    }

    private static  int size(IntNode p){
    if(p.next == null){
        return 1;
    }
    return 1 + size(p.next);
    }
    public int size(){
    return size;

    }



    public static void main(String[] args){
        SLList  L =   new SLList();
        L.addLast(10);
        L.addFirst(5);
        L.addLast(55);
        System.out.println(L.getFirst());
        System.out.println(L.size());
    }



}
