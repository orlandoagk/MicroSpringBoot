package co.edu.escuelaing.SpringBoot;

public class Controller {
    @RequestMapping("/hola")
    static public String hola() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/PI")
    static public String PI() {
        return "PI:"+Math.PI;
    }

    @RequestMapping("/site-home")
    static public String mainPage() {
        return "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Mi propio mensaje</h1>\n"
                + "</body>\n"
                + "</html>\n";
    }
}