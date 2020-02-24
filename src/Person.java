public class Person {

    private String Fname,Lname,email,contact;

    void setEmail(String email) {
        this.email=email;
    }

    void setName(String Fname,String Lname) {
        this.Fname=Fname;
        this.Lname=Lname;
    }
    void setContact(String contact) {
        this.contact=contact;
    }
    Node head;
    int size=0;
    public class Node{
        private Person data;;
        private Node next;
        Node(Person data){
            this.data=data;
        }

    }
    public void insert(Person ob) {
        Node n=new Node(ob);
        n.next=head;
        head=n;
        size++;
        System.out.println(ob.Fname+" "+ob.Lname+"  : is added");
    }
    public void delete(String  Fname,String  Lname) {
        if(search(Fname,Lname)){                                                                                                   // search element before delete
            Node temp=head;
            Node pre=null;
            if(temp!=null && temp.data.Fname.equals(Fname) && temp.data.Lname.equals(Lname)) {                                                                    // delete at first node
                head=temp.next;
                System.out.println(Fname+" "+Lname+" : is deleted");
                size--;
            }
            else {
                while (temp!=null && !temp.data.Fname.equals(Fname) && !temp.data.Lname.equals(Lname)) {
                    pre=temp;
                    temp=temp.next;
                }
                pre.next=temp.next;
                System.out.println(Fname+" "+Lname+" : is deleted");
                size--;
            }
        }
        else {                                                                                                        //contact is not present
            System.out.println(" Sorry! " +Fname+" "+Lname+" : is not present in your contact list");
        }

    }
    public boolean search(String Fname,String Lname) {
        boolean res=false;
        int k=0;
        if(head!=null) {
            Node temp=head;
            for(int i=0;i<size;i++) {
                if(temp.data.Fname.equals(Fname) && temp.data.Lname.equals(Lname)) {                                                                                 // match  string
                    res=true;
                    System.out.println("YES, I GOT_IT : "+Fname+" "+Lname);
                    k=1;
                    break;
                }
                temp=temp.next;
            }
            if(k==0)
                System.out.println("sorry ! "+Fname+" "+Lname+" not present in contact list");
        }
        else {
            System.out.println("NONE CONTACT PRESENT YET");
        }
        return res;
    }
    public  void print()
    {
        Node currNode =head;
        while (currNode != null) {
            System.out.print(currNode.data +" ");
            System.out.println();
            currNode = currNode.next;
        }
        System.out.println();
    }
    @Override
    public String toString() {

        return   Fname + "\t\t\t" + Lname + "\t\t\t " + contact+"\t\t\t" +email;
    }
}
