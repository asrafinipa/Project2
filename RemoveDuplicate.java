package GroupProject2;

import java.util.ArrayList;

public class RemoveDuplicate {
    //10. How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("mercedes");
        cars.add("bmw");
        cars.add("audy");
        cars.add("cadillac");
        cars.add("bmw");
        cars.add("audy");
        cars.add("infinity");
        for (int i=0;i<cars.size();i++){
            for (int j = i+1; j < cars.size() ; j++) {
                if (cars.get(i).equals(cars.get(j))){
                    System.out.println("duplicate found: "+cars.get(i));
                    cars.remove(j);
                }
            }
        }
        System.out.println(cars);



    }
}
