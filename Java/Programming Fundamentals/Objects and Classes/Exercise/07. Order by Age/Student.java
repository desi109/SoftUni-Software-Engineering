public class Student {
    private String name;
    private int id;
    private int age;
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public String getname() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.",
                this.getname(),
                this.getId(),
                this.getAge());
                }
    }
