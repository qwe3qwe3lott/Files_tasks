import java.io.*;
public class Files_task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("task1.txt");
        PrintWriter pw = new PrintWriter(file);
        if (!file.exists()) file.createNewFile();
        //Здесь вводить текст для файла
        pw.println("rrr rr rrrrarrr rrrr ");
        pw.println("tyreryj");
        pw.println("rthjdj");
        pw.close();
        BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
        String s;
        int countrrr = 0;
        while ((s = br.readLine()) != null) {
            char[] c = s.toCharArray();
            boolean f = true;
            int countr = 0;
            for(int i = 0; i < c.length; i++) {
                if (f == true) {
                    if (c[i] == 'r' && countr != 3) countr++;
                    if (c[i] != 'r') {
                        countr = 0;
                    }
                    if (countr == 3) {
                        countrrr++;
                        f = false;
                    }
                } else {
                    if (c[i] == ' ') f = true;
                    countr = 0;
                }
            }
        }
        System.out.println(countrrr);
    }
}
