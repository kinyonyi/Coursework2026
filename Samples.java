public class Samples {
    public static void main(String[] args) {
        // (obj1)creation of objects from the Circle class 
        Circle c1 = new Circle(); // circle with the no args constructor

        // circle 2 (obj2)
        Circle c2 = new Circle(5.0);

        // accessing data fields for the two circles 
        System.out.println("Radius C1: " + c1.radius);
        System.out.println("Radius C1: " + c2.radius);

        // getting the area [calling the methods]
        System.out.println("Area C1: " + c1.getArea());
        System.out.println("Area C2: " + c2.getArea());
    }
}

/*
    Create a class Person
    Data Attr - species, nationality, name
    Have a costructor drafted to enable re-assignment of the data fields
    Have a method called details 
    -> formated string that includes the name, species and nationality 
    dave is a ugandan belonging to the mamals
    -> Add a greeting methods that accepts a string and concats it with 
    the name of the object
    -> hey Dave, How are you today
    -> Hi Daniella, Blessed night!  
*/