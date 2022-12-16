package collection3;

import java.util.ArrayList;

public class Usecar {

	public static void main(String[] args) {
     ArrayList<Car> cars=new ArrayList<>();
     cars.add(new Car("Honda",700000,"White",false,false,1000));
     cars.add(new Car("Maruti Suzuki",800000,"Blue",true,true,1200));
     cars.add(new Car("Tata",500000,"Grey",false,false,800));
     cars.add(new Car("Toyoto",1500000,"Ash",true,true,1500));
     cars.add(new Car("Ford",1000000,"Black",false,true,1000));
     cars.add(new Car("BMW",7500000,"Black",true,true,1200));
     cars.add(new Car("Hero",600000,"White",false,true,1000));
     cars.add(new Car("Skoda",900000,"Blue",false,false,900));
     cars.add(new Car("MiniCooper",5000000,"Grey",true,false,1000));
     cars.add(new Car("Innova",1700000,"Ash",false,true,1200));
     
     Long c=cars.stream().filter(x->!x.getColor().equals("White")).count();
     System.out.println(c);
    	 
        
     
     
	}

}
