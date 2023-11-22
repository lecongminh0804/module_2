package _17_IO_Binary_File_Serialization.exercise.ex_2;

import java.io.*;

public class CopyBinaryFile {
    private static final String source = "D:\\codegym\\module2\\src\\_17_IO_Binary_File_Serialization\\exercise\\ex_2\\Test_1.txt";
    private static final String des = "D:\\codegym\\module2\\src\\_17_IO_Binary_File_Serialization\\exercise\\ex_2\\Test_2.txt";
    public static void main(String[] args) {
        try {
            System.out.println(copy());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    private static long copy() throws IOException {
        InputStream inputStream = new FileInputStream(source);
        OutputStream outputStream = new FileOutputStream(des);
        byte[] bytes = new byte[1024];
        int length;

        while ((length = inputStream.read(bytes)) > 0){
            outputStream.write(bytes);
        }

        inputStream.close();
        outputStream.close();
        File file= new File(des);
        return file.length();
    }
}
