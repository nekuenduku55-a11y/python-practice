/*import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
char c=s2.charAt(0 );
int c1=0;
for(int i=0;i<s1.length();i++){
if(s1.charAt(i)==c)
c1++;
}
System.out.println(c1);
}
}*/


//a=10 20 30 40 50 60 ,n=6 output =120
/*import java.util.*;

class Accenture {
    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        Set<Integer> a = new HashSet<>();
        int n = s.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
int num=s.nextInt();
a.add(num);
if(num%2==0)
sum=sum+num;
}
System.out.println(sum);
}
}*/

/*john n=4,b=5,c=4,a[]=1100 out=8  2*4=8,2*5=10 min=8
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int a[]=new int[n];
int zero=0;
int one=0;
for(int i=0;i<n;i++){
a[i]=s.nextInt();
if(a[i]==0)
zero++;
else
one++;
}
int e=zero*c;
int d=one*b;
if(e>d)
System.out.println(d);
else
System.out.println(e);
}
}*/

/*AABBCC ,AB OUTPUT=CC
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
StringBuilder d=new StringBuilder();
for(int i=0;i<a.length();i++){
char c=a.charAt(i);
if(b.indexOf(c)==-1){
d.append(c);
}
}
System.out.println(d.toString());
}
}*/

/*char count
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int n=s.nextInt();
s.nextLine();
String b=s.nextLine();
char c=b.charAt(0);
int count=0;
for(int i=0;i<a.length();i++){
if(a.charAt(i)==c){
count++;
}
}
System.out.println(count);
}
}*/

/*ball h=10 v=20 vn=5 out=160
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int h=s.nextInt();
int v1=s.nextInt();
int vn=s.nextInt();
int e=v1/vn;
int h1=h*((e*2)+(e*2));
System.out.println(h1);
}
}*/

/*evenodd
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
Set<Integer>a=new HashSet<>();
StringBuilder d=new StringBuilder();
int n=s.nextInt();
for(int i=0;i<n;i++){
int num=s.nextInt();
a.add(num);
if(num%2==0)
d.append("even");
else
d.append("odd");
}
System.out.println(d.toString());
}
}*/

/*sum XOR
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=6;
int a[]={10,5,6,3,7,2};
int odd=0;
int even=0;
for(int i=0;i<a.length;i++){
if(i%2!=0){
odd=odd+a[i];
}
else
even=even^a[i];
}
System.out.println(odd-even);
}
}*/

//max pair product
import java.util.*;
class Accenture{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=8;
int max=0;
int e=0;
int f=0;
int a[]={11,1,2,8,10,11,15,7};
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length-1;j++){
if(a[i]+a[j]==18){
int temp=a[i]*a[j];
e=a[i];
f=a[j];
if(temp>=max)
{
max=temp;
}
}
}
}
if(e>f)
System.out.println(e+","+f);
else
System.out.println(f+","+e);

}
}

















