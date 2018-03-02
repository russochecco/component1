public final class Main {

    public static void main(String... args) {

        final Person person = new Person();

        person.setName("Francesco");
        person.setSurname("Russo");
        person.setAge(44);

        System.out.println(String.format("New person %s", person));

    }
}
