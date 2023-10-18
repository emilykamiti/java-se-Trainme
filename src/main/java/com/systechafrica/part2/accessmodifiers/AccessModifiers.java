package com.systechafrica.part2.accessmodifiers;


import com.systechafrica.part2.accessmodifiers.lms.Book;

public class AccessModifiers {
   // private static final Logger LOGGER = Logger.getLogger(AccessModifiers.class.getName()); 

public static void main(String[] args) {
    Person person2 = new Person("nasinza", "emilykamiti@gmail.com" );
    Person person = new Person();
    
    person.setName("emily");
    person.setEmail("nasinza@gmail.24");
    // person.name = "nasinza";
    // person.email = "emilykamiti@gmail.com";
   // person.printPersonalDetails();
   // person.getPersonalDetails();
   person.getName();
}
public void accessDefault(){
           Book book = new Book();
    //    book.isbn = " 8u368989740918-"; // does not complie because the properties andmeethods 
    //     are using default access modifier inside lms
    //     book.title = "java programming";
    //     book.printBookDetails();
    }

}

