# FACT
import java.util.*;
import java.io.*;
public class Fact
{
public static void main(String args[])throws IOException
{
int fact=1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Integer n=Integer.parseInt(br.readLine());
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}
