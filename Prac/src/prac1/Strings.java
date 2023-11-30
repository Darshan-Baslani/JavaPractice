package prac1;

public class Strings {

    public static void main(String[] args) {
       String name = "Darshan";
       String name2 = new String("Darshan");
       System.out.println(name); 
       System.out.println(name2);
       System.out.println(name == name2);
       System.out.println(name.equals(name2));
       name = "Baslani"; 
       System.out.println(name); 
       System.out.println(name2); 
       System.out.println(name == name2);

        // String saves the same value in the same location of heap
        // Ex: two different string variables having same value will be pointing to same location in heap

        // To save the same value of a string variable pointing to a different location in heap, create new object of type String.

        // String are immutable i.e. there value can't be changed, in line 12 name starts pointing to different location in heap, it doesn't 
        // change the value

        // To make String mutable StringBuilder is used
        // It want make much difference in output, but internally space would be saved.

        StringBuilder name3 = new StringBuilder();
        name3.append("Darshan Baslani");
        System.out.println(name3);

    }
    
}
