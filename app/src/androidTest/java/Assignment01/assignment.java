package Assignment01;

public class assignment {
    int roll;
    String name;
    float cgpa;

    public assignment(int roll, String name, float cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
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
}
