package collection3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UseMobile {

	public static void main(String[] args) {
		Mobile m1= new Mobile("Samsung",35000,"Black",12345);
		Mobile m2= new Mobile("Oneplus",40000,"White",34567);
		Mobile m3= new Mobile("Vivo",25000,"Blue",45678);
		Mobile m4= new Mobile("Oppo",20000,"Red",55678);
		
      HashMap<Integer,Mobile> mobiles=new HashMap<>();
      mobiles.put(m1.getImei(), m1);
      mobiles.put(m2.getImei(), m2);
      mobiles.put(m3.getImei(), m3);
      mobiles.put(m4.getImei(), m4);
      
     ArrayList<Mobile> m=new ArrayList<>();
     m.add(m1);
     m.add(m2);
     m.add(m3);
     m.add(m4);
     
     HashSet<Mobile> n=new HashSet<>();
     n.add(m1);
     n.add(m2);
     n.add(m3);
     n.add(m4);
      
      Map<Integer,Mobile> mobile= mobiles.values().stream().filter(x->x.getPrice()>=30000).collect(Collectors.toMap(x->x.getImei(), y->y));
      mobile.forEach((x,y)->System.out.println(x+","+y));
      
      List<Mobile> b=mobiles.values().stream().distinct().collect(Collectors.toList());
      b.forEach(x->System.out.println(x));
      
      int sum=mobiles.values().stream().distinct().collect(Collectors.summingInt(x->x.getPrice()));
      System.out.println(sum);
      
      Set<Mobile> s=mobiles.values().stream().collect(Collectors.toSet());
      s.forEach(x->System.out.println(x));
      
      
      
      
      
      
      
	}

}
