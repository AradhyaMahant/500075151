package q2;

public class Employee implements Cloneable {
	static int id;
	static String name;
	static int dep;
Employee(int id,String n,int d)
	{	
		this.id=id;
		name=n;
		dep=d;		
	}
public int getId(){
	return id;
}
public void setId(int newId) {
	this.id=newId;
}
public String getName() {
  return name;
}
public void setName(String newName) {
  this.name = newName;
}
public int getDep() {
	  return dep;
	}
	public void setDep(int newDep) {
	  this.dep = newDep;
	}
void show()
	{
		System.out.println("employeeID :"+getId());
		System.out.println("employee name :"+getName());
		System.out.println("employee Department :"+getDep());
	}

public Object clone()throws CloneNotSupportedException
{  
	return super.clone();  
}  

public static void main(String args[]){  
try{  
		Employee e1 =new Employee(54,"Aradhya",2);
		e1.getId();
		e1.setId(id);
		e1.getName();
		e1.setName(name);
		e1.getDep();
		e1.setDep(dep);
		e1.show();
		Employee e2=(Employee)e1.clone();
		System.out.println("Employee clone name:"+ e2.getName());
}catch(CloneNotSupportedException c){}					
}
	
	
	
}


