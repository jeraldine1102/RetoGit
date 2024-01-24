public class Home {

    public static void main(String[] args) {
        person1();
        person2();
    }

    public static void person1() {
        System.out.println("¡Hola, mundo!");

        // Crea una instancia de Person y muestra información
        Person person = new Person("Juan", 25, "Perez");
        System.out.println("Nombre: " + person.getName());
        System.out.println("Apellido: " + person.getApellido());
        System.out.println("Edad: " + person.getAge());
    }

    public static void person2() {
        System.out.println("¡Hola, mundo!");

        // Crea una instancia de Address y muestra información
        Address address = new Address("Calle Principal", "Ciudad", "12345");
        System.out.println("Dirección: " + address.getFullAddress());
    }
}

