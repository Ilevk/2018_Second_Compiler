import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main_201504278 {
    static Deque<String> deque = new LinkedList<>();
    public static void main(String args[]) {
        String input_code = new String();
        String operation;
        String[] lines;
        IO_Manager io = new IO_Manager();
        StringBuilder output_code = new StringBuilder();
        StringBuilder tmp;
        try {
            input_code = io.read();
        } catch (IOException e) {
            System.out.println("File read Error");
        }
        input_code = input_code.replace(" ", "");
        // 고정 문자열 StringBuilder에 출력
        output_code.append("#include <stdio.h>\n\nint main(){\n").toString();
        // 개행 문자를 다루기 편하게 쉼표로 변경
        input_code = input_code.replace('\n', ',');
        // 쉼표 단위로 Line by Line으로 처리하기 위해 쪼갬
        lines = input_code.split(",");
        int i = 0;
        // 라인 갯수만큼 반복
        while (i < lines.length) {
            operation = strip(lines[i++]);

            // 출력할 문자열 StringBuilder에 출력
            if(operation.equals("print")){
                tmp = new StringBuilder();
                while(!deque.isEmpty()) {
                    tmp.append(deque.remove());
                }
                    output_code.append("\tprintf(\"%s\", \""+ tmp.toString()+"\");\n");
            // 출력한 문자열 제거
            } else if (operation.equals("ignore")){
                while(!deque.isEmpty()){
                    deque.remove();
                }
            } else{
            // 명령어가 없는 경우 저장되어 있는 모든 문자열을 꺼내 연결하고 다시 저장
                tmp = new StringBuilder();
                while(!deque.isEmpty()){
                    tmp.append(deque.remove());
                }
                deque.add(tmp.toString());
            }
        }
        // 고정 문자열 StringBuilder에 출력
        output_code.append("}");
        // StringBuilder 문자열 출력
        io.write(output_code.toString());

    }

    static String strip(String line) {
        //']' 로 문자열 및 문자열 제어를 쪼갠다.
        String[] splited_line = line.split("]");
        String[] replace_char;
        String operation, count;
        boolean control_string = false;
        // ']'로 쪼개진 개수가 2 초과라는 것은 문자열 제어 옵션이 있다는 의미.
        if (splited_line.length > 2)
            control_string = true;
        // 쪼개진 문자열 및 문자열 제어를 처리 쪼개진 라인의 맨 마지막은 명령어 라인이니 length - 1까지 진행
        for (int i = 0; i < splited_line.length - 1; i++) {
            if (splited_line[i].length() > 1)
                splited_line[i] = splited_line[i].substring(1, splited_line[i].length());
            else
                splited_line[i] = "\\n";

            // 치환 옵션
            if (splited_line[i].contains("/")) {
                replace_char = splited_line[i].split("/");
                deque.push(deque.pop().replace(replace_char[1], replace_char[0]));
            // 대문자 변환 옵션 이전 문자열 하나 꺼내서 대문자로 변환 후 다시 저장
            } else if (control_string && i > 0 && splited_line[i].equals("U")) {
                    deque.push(deque.pop().toUpperCase());
            // 소문자 변환 옵션 이전 문자열 하나 꺼내서 소문자로 변환 후 다시 저장
            } else if (control_string && i > 0 &&  splited_line[i].equals("L")) {
                    deque.push(deque.pop().toLowerCase());
            } else {
            // 옵션이 아닌 경우 문자열이니 그대로 저장.
                deque.push(splited_line[i]);
            }
        }

        //순서 변경
        for(int i=0;i<deque.size()-1; i++)
            deque.add(deque.remove());
        // 명령어 분해
        String[] op = splited_line[splited_line.length-1].split(":");
        // 길이가 1 초과인 것은 명령어가 존재 한다는 것. 초과 아닌 것은 명령어가 없는것
        if(op.length > 1) {
            operation = op[1];
            // 명령어 중 반복 옵션이 있는 경우 '(' 문자를 포함 하므로, '('를 포함하는 경우 반복 옵션을 실행
            if(op[1].contains("(")){
                String[] tmp = op[1].split("\\)");
                count = tmp[0].replace("(", "");
                // 동일하게 소괄호로 쪼갠 문자열 의 길이가 1초과인 경우 1번 인덱스에 명령어가 있음.
                if(tmp.length > 1)
                    operation = tmp[1];
                else
                    operation ="";

                StringBuilder tmp1 = new StringBuilder();
                StringBuilder tmp2 = new StringBuilder();
                // 반복 옵션을 위해 모든 문자열을 꺼내 연결한다.
                while(!deque.isEmpty())
                    tmp1.append(deque.remove());
                // 해당 문자열을 반복 횟수 만큼 이어붙인다.
                for(int j = 0; j < Integer.parseInt(count); j++)
                    tmp2.append(tmp1.toString());
                // 반복 옵션을 적용한 문자열 하나를 저장
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
