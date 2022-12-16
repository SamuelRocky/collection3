package collection3;


import java.util.*;
public class UseShirt {

	public static void main(String[] args) {
      Shirt s1=new Shirt(32,"Peterenglend","Orange");
      Shirt s2=new Shirt(32,"Crocodile","Black");
      Shirt s3=new Shirt(44,"Otto","White");
      List<Shirt> shirts=new ArrayList<>();
      shirts.add(s1);
      shirts.add(s2);
      shirts.add(s3);
      Long s=shirts.stream().filter(x->x.getSize()<=32).count();
      System.out.println(s);
      
      
	}

}
