package New_Branch;

public class new_branch_01 {

    int roll;
    String name;
    float cgpa;
    String address;
    String hometown;


    int age;

    public new_branch_01(int roll, String name, float cgpa, String address, int age,String hometown;) {

        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
        this.address = address;
        this.age = age;
        this.hometown=hometown;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
