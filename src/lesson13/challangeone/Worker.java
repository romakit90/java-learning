package lesson13.challangeone;

public class Worker {
    private String name;
    private int age;
    private String contactPhone;
    private String email;

    public Worker(String name, int age, String contactPhone, String email) {
        this.name = name;
        this.age = age;
        this.contactPhone = contactPhone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public String getEmail() {
        return email;
    }

    public double calculateSalary() {
        return 3000.0; // Base salary for a generic worker
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contactPhone='" + contactPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
