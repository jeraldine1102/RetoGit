public class Person {
    private String name;
    private int age;

    private String apellido;

    public Person(String name, int age, String apellido) {
        this.name = name;
        this.age = age;
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getApellido() {
        return apellido;
    }
}
