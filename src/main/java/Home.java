public class Home {
    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");

        // Crea una instancia de Person y muestra información
        Person person = new Person("Juan", 25);
        System.out.println("Nombre: " + person.getName());
        System.out.println("Edad: " + person.getAge());

        // Crea una instancia de Address y muestra información
        Address address = new Address("Calle Principal", "Ciudad", "12345");
        System.out.println("Dirección: " + address.getFullAddress());
    }
}
