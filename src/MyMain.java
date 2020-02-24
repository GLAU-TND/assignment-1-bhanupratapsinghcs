//package ContactList;
import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person p1=new Person();
        System.out.println("------- MOST WELCOME IN MY PROGRAM--------");
        String fn,ln,cont,email;
        String s2,s1="";

        do {
            System.out.println("PRESS 1 FOR ADD CONTACT");
            System.out.println("PRESS 2 FOR DELETE CONTACT");
            System.out.println("PRESS 3 FOR SEARCH");
            System.out.println("PRESS 4 FOR VIEW CONTACTS");
            System.out.println("PRESS 5 FOR ESCAPE");
            int n=sc.nextInt();
            switch(n) {
                case 1:
                    Person p=new Person();
                    System.out.println("ENTER FNAME AND LNAME ");
                    fn=sc.next();
                    ln=sc.next();
                    p.setName(fn,ln);
                    System.out.println("ENTER CONTACT_NUMBER ");
                    cont=sc.next();
                    p.setContact(cont);
                    System.out.println("YOU HAVE EMAIL (y/n)");
                    s2=sc.next();
                    if(s2.equals("y")) {
                        System.out.println("ENTER EMAIL");
                        email=sc.next();
                        p.setEmail(email);
                    }
                    else
                        p.setEmail("none");
                    p1.insert(p);
                    System.out.println("press y to be continue");
                    s1=sc.next();
                    break;
                case 2:
                    System.out.println("ENTER FNAME && LNAME FOR DELETE CONTACT");
                    fn=sc.next();
                    ln=sc.next();
                    p1.delete(fn,ln);
                    System.out.println("press y to be continue");
                    s1=sc.next();
                    break;
                case 3:
                    System.out.println("ENTER FNAME && LNAME FOR SEARCH CONTACT");
                    fn=sc.next();
                    ln=sc.next();
                    System.out.println(p1.search(fn,ln));
                    System.out.println("press y to be continue");
                    s1=sc.next();
                    break;
                case 4:
                    System.out.println("------YOUR CONTACT_LIST-------");
                    System.out.println("<------------------------------>");
                    System.out.println("<------------------------------>");
                    System.out.println("FNAME\t\t\tLNMAE\t\t\tCONTACT_NUMBER\t\t\tEMAIL");
                    p1.print();
                    System.out.println("press y to be continue");
                    s1=sc.next();
                    break;
                case 5:
                    System.out.println("YOU ARE NOW EXITED FROM PROGRAM");
                    s1="EXIT";
                    break;
                default:
                    System.out.println("PLEASE ENTER VALID NUMBER LIKE 1-5");
            }

        } while(s1.equals("y"));
    }
}
