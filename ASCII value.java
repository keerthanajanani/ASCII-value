# ASCII-value
import java.io.*;
import java.util.*;
public class ASCII value
{
public static void main(String args[])throws IOException
{
String ch;
int i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=1;i<=255;i++)
{
ch=new Character((char)i).toString();
System.out.println(i+ " -> " + ch + "\t");
}
}
}
