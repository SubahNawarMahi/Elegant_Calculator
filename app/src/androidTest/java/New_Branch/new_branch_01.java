package New_Branch;

public class new_branch_01 {

    int roll;
    String name;
    float cgpa;
    String address;
    String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public new_branch_01(int roll, String name, float cgpa, String address, String department) {

        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
        this.address = address;
        this.department= department;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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
