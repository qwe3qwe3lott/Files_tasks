import java.io.*;
public class Files_task1 {
    public static void main(String[] args) throws IOException {
        File file = new File("task1.txt");
        PrintWriter pw = new PrintWriter(file);
        if (!file.exists()) file.createNewFile();
        //Здесь вводить текст для файла
        pw.println("кеокеr7л7");
        pw.println("tyreryj");
        pw.println("rthjdj");
        pw.close();
        BufferedReader br = new BufferedReader(new FileReader("task1.txt"));
        String s;
        int count = 0;
        while ((s = br.readLine()) != null) {
            char[] c = s.toCharArray();
            for(int i = 0; i < c.length; i++) {
                if (c[i] == 'r') count++;
            }
        }
        System.out.println(count);
    }
}
