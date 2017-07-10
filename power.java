# power
import java.io.*;
import java.util.*;
public class power{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
long k,m,n=1;
System.out.println("Enter the number");
k=sc.nextLong();
System.out.println("Enter the power");
m=sc.nextLong();
if(k>=0 && m==0){
n=1;
}
else if(k==0 && m>=1){
n=0;
}
else{
for(int i=1;i<=m;i++){
n=n*k;
}
}
System.out.println(k+"^"+m+"="+n);
}
}
