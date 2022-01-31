import com.sparkpost.exception.SparkPostException;
import models.Users;
import service.AuthService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SparkPostException {

        AuthService authService = new AuthService();

        List<String> studies = new ArrayList<>();
        studies.add("Ciencias");
        studies.add("Letras");
        studies.add("Deporte");

        List<String> complementaryStudies = new ArrayList<>();
        studies.add("Ciencias");
        studies.add("Letras");
        studies.add("Deporte");

        List<String> experience = new ArrayList<>();
        studies.add("Ciencias");
        studies.add("Letras");
        studies.add("Deporte");

        Users prueba0 = new Users("prueba@prueba.com", "prueba", "pruebaPassword");
        Users prueba1 = new Users("prueba@prueba.com", "prueba", "pruebaPassword");

        Boolean prueba0R = authService.register(prueba0);
        Boolean prueba1R = authService.register(prueba1);

        int prueba3 = authService.login("prueba@prueba.com", "pruebaPassword");
        int prueba4 = authService.login("prueb@prueba.com", "pruebaPassword");
        int prueba5 = authService.login("prueba@prueba.com", "pruebPassword");

        System.out.println(prueba3);
        System.out.println(prueba4);
        System.out.println(prueba5);

    }

}
