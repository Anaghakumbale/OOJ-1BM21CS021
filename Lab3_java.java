import java.util.Scanner;
class Book
{
String name,author;
double price;
int num_pages;
void Book(){
name=" ";
author=" ";
price=0.0;num_pages=0;}
void input(){
Scanner ss=new Scanner(System.in);
System.out.println("enter the name of the book:");
name=ss.nextLine();
System.out.println("enter the author of the book:");
author=ss.nextLine();
System.out.println("enter the price of the book:");
price=ss.nextDouble();
System.out.println("enter the number of pages of the book:");
num_pages=ss.nextInt();
}
public String toString(){
return("NAME:"+name+"\nAUTHOR:"+author+"\nPRICE:"+price+"/-"+"\nNUMBER OF PAGES:"+num_pages+"\n");
}}class book_main
{
public static void main(String xx[])
{
Scanner s=new Scanner (System.in);
System.out.println("enter the number of books:");
int n=s.nextInt();
Book book[]=new Book[n];
for(int i=0;i<n;i++)
{
book[i]=new Book();
book[i].input();
System.out.println("\n Book details:");
System.out.println(book[i]);
}}}