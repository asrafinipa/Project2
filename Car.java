package GroupProject2;

public class Car {
    /*
    13. Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does its own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount
     */
    double carPrice;
    String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }
    void printInfo(){
        System.out.println("carPrice is "+carPrice+ " car color is "+color);
    }

    double calculateSalePrice() {
        return carPrice;
    }
}

     class  Sedan extends Car{
        int length;

        public Sedan(double carPrice, String color, int length) {
            super(carPrice, color);
            this.length=length;
        }

        @Override
        double calculateSalePrice() {
            if (length>20){
                return carPrice=carPrice+carPrice*0.05;
            }else{
                return carPrice=carPrice+carPrice*0.1;
            }
        }
    }
     class Truck extends Car{
        int weight;

        public Truck(double carPrice, String color,int weight) {
            super(carPrice, color);
            this.weight=weight;
        }

        @Override
        double calculateSalePrice() {
            if (weight>2000){
                return carPrice=carPrice+carPrice*0.2;
            }else {
                return carPrice=carPrice+carPrice*0.10;
            }
        }

         public static void main(String[] args) {
             Sedan s=new Sedan(30000,"black",12);
             System.out.println("Sedan price is "+s.calculateSalePrice());
             s.printInfo();
             Truck t=new Truck(35000,"white",2300);
             System.out.println("Truck price is "+t.calculateSalePrice());
             t.printInfo();
         }
    }





