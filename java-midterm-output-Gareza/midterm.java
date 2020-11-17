import java.util.ArrayList;
import java.util.Scanner;

public class midterm {
    static ArrayList<String> name = new ArrayList<>();
    static ArrayList<Integer> age = new ArrayList<>();
    static Scanner q = new Scanner(System.in);
    public static void main(String[] args){
        int option = 0;
        end:
        while (true){
            System.out.print("\n----[Options]----\n[1] Add Entry \n[2] Delete Entry \n[3] View All Entry \n[4] Update an Entry \n[0] Exit\n[Choice] = ");
            option = q.nextInt();

            switch (option){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    update();
                    break;
                case 0:
                    System.out.println("goodbye\nthank you :>");
                    break end;
                default:
                    System.out.println("----[INVALID INPUT]----");
                    break;
            }
        }
    }

    static void add(){
        System.out.println("\n----[Add someone in the list ]----");
        System.out.print("Enter Name: ");
        name.add(q.next());
        System.out.print("Enter Age: ");
        age.add(q.nextInt());
    }
    static void delete(){
        System.out.println("\n----[Delete someone in the list]----");
        String pp;
        System.out.print("Enter name to delete: ");
        pp = q.next();
        if(name.contains(pp)){
            name.remove(pp);
            System.out.println(pp +" [has been deleted]");
        }
        else{
            System.out.println("There Is No " + pp +" In The List. ");
        }
    }

    static void view() {
        System.out.println("\n----[Persons who you have entered]----");
        for (int i=0;i<name.size();i++){
            System.out.println(name.get(i)+" is "+age.get(i));
        }
    }

    static void update(){
        System.out.println("\n----[edit the list]----");
        System.out.print("Enter index: ");
        int index = q.nextInt();
        System.out.print("Enter [New] Name: ");
        String neew = q.next();
        System.out.print("Enter [New] Age: ");
        int agess = q.nextInt();
        name.set(index,neew);
        age.set(index,agess);
    }
}