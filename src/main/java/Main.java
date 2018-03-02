import org.frusso.sharedmodule1.vo.PersonVO;

public final class Main {

    public static void main(String... args) {

        final PersonVO personVO = new PersonVO("Francesco", "Russo", 44);
        System.out.println(String.format("New %s", personVO));

        System.exit(0);
    }
}
