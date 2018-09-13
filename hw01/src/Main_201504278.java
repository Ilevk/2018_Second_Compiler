import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main_201504278 {
    static Deque<String> deque = new LinkedList<>();
    public static void main(String args[]) {
        String input_code = new String();
        String operation;
        String[] tokens;
        IO_Manager io = new IO_Manager();
        StringBuilder output_code = new StringBuilder();
        StringBuilder tmp;
        try {
            input_code = io.read();
        } catch (IOException e) {
            System.out.println("File read Error");
        }
        input_code = input_code.replace(" ", "");
        output_code.append("#include <stdio.h>\n\nint main(){\n").toString();

        input_code = input_code.replace('\n', ',');
        tokens = input_code.split(",");
        int i = 0;

        while (i < tokens.length) {
            operation = strip(tokens[i++]);

            if(operation.equals("print")){
                tmp = new StringBuilder();
                while(!deque.isEmpty()) {
                    tmp.append(deque.remove());
                }
                    output_code.append("\tprintf(\"%s\", \""+ tmp.toString()+"\");\n");
            } else if (operation.equals("ignore")){
                while(!deque.isEmpty()){
                    deque.remove();
                }
            } else{
                tmp = new StringBuilder();
                while(!deque.isEmpty()){
                    tmp.append(deque.remove());
                }
                deque.add(tmp.toString());
            }
        }
        output_code.append("}");
        io.write(output_code.toString());

    }

    static String strip(String line) {
        String[] splited_line = line.split("]");
        String[] replace_char;
        String operation, count;
        boolean control_string = false;
        if (splited_line.length > 2)
            control_string = true;
        for (int i = 0; i < splited_line.length - 1; i++) {
            if (splited_line[i].length() > 1)
                splited_line[i] = splited_line[i].substring(1, splited_line[i].length());
            else
                splited_line[i] = "\\n";

            if (splited_line[i].contains("/")) {
                replace_char = splited_line[i].split("/");
                deque.push(deque.pop().replace(replace_char[1], replace_char[0]));
            } else if (control_string && i > 0 && splited_line[i].equals("U")) {
                    deque.push(deque.pop().toUpperCase());
            } else if (control_string && i > 0 &&  splited_line[i].equals("L")) {
                    deque.push(deque.pop().toLowerCase());
            } else {
                deque.push(splited_line[i]);
            }
        }
        for(int i=0;i<deque.size()-1; i++)
            deque.add(deque.remove());

        String[] op = splited_line[splited_line.length-1].split(":");
        if(op.length > 1) {
            operation = op[1];
            if(op[1].contains("(")){
                String[] tmp = op[1].split("\\)");
                count = tmp[0].replace("(", "");
                if(tmp.length > 1)
                    operation = tmp[1];
                else
                    operation ="";

                StringBuilder tmp1 = new StringBuilder();
                StringBuilder tmp2 = new StringBuilder();
                while(!deque.isEmpty())
                    tmp1.append(deque.remove());
                for(int j = 0; j < Integer.parseInt(count); j++)
                    tmp2.append(tmp1.toString());
                deque.add(tmp2.toString());
            }
        }
        else
            operation = "";
        return operation;
    }


}


class IO_Manager {
    String input_filename = "test.hoo";
    String output_filename = "test.c";
    File input_file, output_file;
    FileInputStream fis;
    FileOutputStream fos;

    IO_Manager() {
        input_file = new File(input_filename);
        output_file = new File(output_filename);
        try {
            fis = new FileInputStream(input_file);
            fos = new FileOutputStream(output_file);
        } catch (Exception e) {
            System.out.println("File Stream Open Error");
        }
    }

    String read() throws IOException {
        StringBuilder sb = new StringBuilder();
        int i;
        while ((i = fis.read()) != -1) {
            sb.append((char) i);
        }
        fis.close();
        return sb.toString();
    }

    boolean write(String output_code) {
        try {
            fos.write(output_code.getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println("File write Error");
            return false;
        }
        return true;
    }
}
