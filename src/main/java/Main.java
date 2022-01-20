import com.sparkpost.exception.SparkPostException;
import service.AuthService;

public class Main {

    public static void main(String[] args) throws SparkPostException {

        AuthService authService = new AuthService();

        Boolean prueba0 = authService.register("prueba@prueba.com", "prueba", "pruebaPassword");
        Boolean prueba1 = authService.register("prueba1@prueba1.com", "prueba1", "prueba1Password");

        int prueba3 = authService.login("prueba@prueba.com", "pruebaPassword");
        int prueba4 = authService.login("prueb@prueba.com", "pruebaPassword");
        int prueba5 = authService.login("prueba@prueba.com", "pruebPassword");

        System.out.println(prueba3);
        System.out.println(prueba4);
        System.out.println(prueba5);

    }

}
