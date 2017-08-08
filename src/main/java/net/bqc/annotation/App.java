package net.bqc.annotation;

import java.lang.reflect.Field;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IllegalAccessException {

        FileNode fileNode = new FileNode();

        Class fileNodeClass = fileNode.getClass();
        Field[] fields = fileNodeClass.getFields();

        System.out.println("Before ignoring: " + fileNode);

        System.out.print("Ignored fields: ");
        for (Field field : fields) {
            if (field.isAnnotationPresent(JciaIgnore.class)) {
                field.set(fileNode, null);
                System.out.print(field.getName() + " | ");
            }
        }
        System.out.println();
        System.out.println("After ignoring: " + fileNode);
    }
}
