import java.io.File;

public class Explorer {
            public static void main (String[] args) {
            java.io.File file = new java.io.File("C:\\Program Files");
            String list[] = file.list();
            for (String s : list) {
                System.out.println(s);

            }

            System.out.println(file.isDirectory());
            System.out.println(file.toString());
        }
    }



