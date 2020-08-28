package co.edu.escuelaing.SpringBoot;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**

 *

 * @author dnielben

 */

public class MicroSpring {
    private Map<String, Method> beans = new HashMap<>();

    public void mapServices(String nameClass) throws Exception {
        int mapped = 0;
        for (Method m : Class.forName(nameClass).getMethods()) {
            //System.out.println("Revisando: " + m.getName());
            if (m.isAnnotationPresent(RequestMapping.class)) {
                //System.out.println("Si está anotado con @RequestMapping");
                try {
                    beans.put(m.getAnnotation(RequestMapping.class).value(),m);
                    mapped++;
                } catch (Throwable ex) {
                    System.out.printf("Test %s failed: %s %n", m, ex.getCause());
                }
            }
        }
    }

    public String executeServices(String path) {
        try {
            return beans.get(path).invoke(null).toString();
        } catch (InvocationTargetException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(MicroSpring.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Error ";
    }
}