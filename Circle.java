public class Circle {
    // data fields 
    double radius = 2.0;

    // contructors - no args constructor
    Circle(){
    }

    Circle(double newRadius){
        this.radius = newRadius;
    }

    // methods 
    double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
