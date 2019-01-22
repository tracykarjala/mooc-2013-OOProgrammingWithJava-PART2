package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
        if (name.isEmpty() || name.length() > 40 || age > 120 || age < 0) {
            throw new IllegalArgumentException("error");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
