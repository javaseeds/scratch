package funk.shane.model;

import com.openpojo.business.BusinessIdentity;

public class Person {
    private String lname;
    private String fname;
    private int age;

    public Person() {    }

    public Person(String lname, String fname, int age) {
        this.lname = lname;
        this.fname = fname;
        this.age = age;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return BusinessIdentity.toString(this);
    }

    @Override
    public int hashCode() {
        return BusinessIdentity.getHashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        return BusinessIdentity.areEqual(this, obj);
    }

}
