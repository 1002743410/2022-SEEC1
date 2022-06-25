import java.io.*;

public class FileReader {
    public String readFile(String filePath) throws IOException{
        File filename=new File(filePath);
        BufferedInputStream in=new BufferedInputStream(new FileInputStream(filename));
        ByteArrayOutputStream out=new ByteArrayOutputStream(1024);
        byte[] temp=new byte[1024];
        int size=0;
        while((size=in.read(temp))!=-1){
            out.write(temp,0,size);
        }
        in.close();
        String s= out.toString();
        System.out.println(s);
        //TODO
        //OJ version:java 8
        return s;
    }

}
