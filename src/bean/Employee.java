package bean;

public class Employee {
private int eid;
private String ename;
private float esal;
private String eaddr;

public Employee()
{
	
}

public Employee(int eid, String ename, float esal, String eaddr) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
	this.eaddr = eaddr;
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public float getEsal() {
	return esal;
}

public void setEsal(float esal) {
	this.esal = esal;
}

public String getEaddr() {
	return eaddr;
}

public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}

}
