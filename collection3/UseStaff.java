package collection3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStaff {

	public static void main(String[] args) {
ArrayList<Staff> details= new ArrayList<>();
details.add(new Staff(11,"Samuel",25,40000,true));
details.add(new Staff(12,"Rajesh",26,50000,true));
details.add(new Staff(13,"Ranga",24,45000,true));
details.add(new Staff(14,"Nilesh",27,55000,true));
details.add(new Staff(15,"Saravanan",22,60000,true));
details.add(new Staff(16,"Catherine",28,35000,false));
details.add(new Staff(17,"Preethi",29,65000,false));
details.add(new Staff(18,"Priya",21,70000,false));
details.add(new Staff(19,"Adithya",30,30000,false));
details.add(new Staff(20,"Jessie",32,75000,false));

/*List<Staff> femaleStaffs = details.stream().filter(x->x.isMale()==false).collect(Collectors.toList());
femaleStaffs.forEach(x->System.out.println(x));

List<Staff> d=details.stream().filter(x->x.getAge()>26&&x.getSalary()>45000).collect(Collectors.toList());
d.forEach(x->System.out.println(x));

Long l=details.stream().filter(x->x.isMale()==true&&x.getSalary()>=50000).count();
System.out.println(l);

Long m=details.stream().count();
System.out.println(m);

List<Integer> names=details.stream().filter(x->x.getSalary()>45000).map(y->y.getAge()).collect(Collectors.toList());
names.forEach(x->System.out.println(x));*/

Map<Integer, Staff> r= details.stream().collect(Collectors.toMap(x->x.getId(),y->y));
r.forEach((x,y)->System.out.println(x+" "+y));
System.out.println("----------------------------------------------------------------------------------------------");
List<Integer> l=r.keySet().stream().collect(Collectors.toList());
l.forEach(x->System.out.println(x));





	}

}
