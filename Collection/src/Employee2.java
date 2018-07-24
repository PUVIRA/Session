public class Employee2 implements Comparable<Employee2>{
	int empId;
	String name;
	int age;
	Employee2(int empId,String name,int age){
	this.empId=empId;
	this.name=name;
	this.age=age;
	}

	public int compareTo(Employee2 em) {
	if(age==em.age)
		return 0;
	else if(age>em.age)
		return 1;
	else
		return -1;
}
}

