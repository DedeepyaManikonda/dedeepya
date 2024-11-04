import java.util.*;
import java.io.*;

class MyException extends Exception{
public String toString(){
return "Exception! you can only book 6 Tickets at a time";
}
}

class Passanger{
int num,age;
String name,ref,gen;
Scanner scan=new Scanner(System.in);
public void details(){
System.out.print("Enter no.of Tickets:");
 num=scan.nextInt();
try{
if(num>6)
throw new MyException();
}
catch(MyException e)
{
System.out.println(e);
 num=scan.nextInt();
}
scan.nextLine();
System.out.print("name:");
 name=scan.nextLine(); 
System.out.print("age:");
 age=scan.nextInt();
scan.nextLine();
System.out.print("Gender:");
 gen=scan.nextLine();
System.out.print("reference:");           
 ref=scan.nextLine();
}
}
class DetailsCheck extends Passanger{
Tickert t=new Tickert();
void display(int c,String train,String time,String from,String to,String date,String type,int seats){
System.out.println("------------------------------Check Your Details-----------------------------------");
 System.out.println();
 System.out.println(" From : "+from+"----------------> To :"+to);
 System.out.println();
 System.out.printf(" %-6s   %-6s    %-6s  %n","TrainName : "+train,"Timing: "+time,"Date : "+date);
 System.out.println();
 System.out.printf(" %-6s   %-6s    %-6s    %-6s %n","Name : "+name+"","Age: "+age+"","Gender:   "+gen,"avilableseats :"+(seats-num));
 System.out.println();
 System.out.printf(" %-6s   %-6s    %6s   %n","Reference : "+ref+"","Tikets: "+num+"","Type: "+type);
 System.out.println();
 System.out.println("cost of "+type+" is ="+c);
 System.out.println("total passenger = "+num);
 int total=c*num;
 System.out.println();
 System.out.println("Total cost ="+total);
 System.out.println();
 System.out.println("------------------------------------********---------------------------------------");
 System.out.println("enter your choice");
 System.out.println("1.Confirm    2.Exit");
 int ch=scan.nextInt();
 if(ch==1)
 t.passdetails(from,to,date,time,train,type,total,seats,name);
 else
 System.exit(0);
}
}
class Tickert{
void passdetails(String from,String to,String date,String time,String train,String type,int total,int seats,String name){
Random rand =new  Random();
int s=rand.nextInt(seats);

System.out.println("----------------------***-YOUR TICKET-***-------------------------------");

System.out.println("|");
 System.out.printf("|%-6s   %-6s    %n","Name : "+name+"","Ticket_number: "+s);
 System.out.println("|");
 System.out.printf("| %-6s   %-6s    %-6s  %n","From : "+from," To : "+to,"Date : "+date);
 System.out.println("|");
 System.out.printf("| %-6s   %-6s    %-6s  %n","TrainName : "+train,"Timing: "+time,"Cost : "+total);
 System.out.println("---------------------------*************--------------------------------");
try{
Writer w = new FileWriter("trainInfo.txt",true);
w.write("----------------------***-PassengerDetails-***---------------------------------");
w.write("\n");
w.write("|");
w.write("\n");
w.write("|Name : "+name+"   Ticket_number: "+s+"   avilable seats:"+seats);
w.write("\n");
w.write("|");
w.write("\n");
w.write("|From : "+from+"   To : "+to+"   Date : "+date);
w.write("\n");
w.write("|");
w.write("\n");
w.write("|TrainName : "+train+"   Timing: "+time+"  Cost : "+total);
w.write("\n");
w.write("---------------------------*************----------------------------------");
w.write("\n");
w.close();
}
catch (IOException | NumberFormatException e) {
e.printStackTrace();
}

}
}

class Classes{
int Sleeper(){
return 500;
}
int secondsitting(){
return 300;
}
int Ac1(){
return 2000;
}
int Ac2(){
return 1000;
}
int general(){
return 100;
}
}



class SelectTrains{
String travel_train(String to,String from){
String a="vijayawada";
String b="visakhapatnam";
String c="hyderabad";
String d="chennai";
Scanner sc=new Scanner(System.in);
if(from.equals(a))
{
  if(to.equalsIgnoreCase(b)){
   System.out.printf("-----------------------------------------------%n");
  System.out.printf("   Avilable trains and timings  %n");
  System.out.printf("| %-18s | %-6s | %6s |%n","TRAINS","Timings","Seats"); 
    System.out.printf("-----------------------------------------------%n");
                   
  System.out.printf("| %-18s | %-6s |%6s  |%n","VisakahaExpress","3:00am ","152 ");  
  System.out.printf("| %-18s | %-6s |%6s  |%n","HowrahExpress","5:30am ","38"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","NagaonExpress","10:00pm","100 "); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","PrasanthiExpress","9:00am ","182"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","RatnachalExpress","7:30am ","90"); 
  System.out.printf("-----------------------------------------------%n"); 
  }
  else if(to.equalsIgnoreCase(c)){
  System.out.printf("-----------------------------------------------%n");
  System.out.printf("   Avilable trains and timings  %n");
  System.out.printf("| %-18s | %-6s | %6s |%n","TRAINS","Timings","Seats"); 
   System.out.printf("-----------------------------------------------%n");              
  System.out.printf("| %-18s | %-6s |%6s  |%n","VisakahaExpress","3:00am ","100 ");  
  System.out.printf("| %-18s | %-6s |%6s  |%n","CharminarExpress","5:30am ","58"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","KonarkExpress","10:00pm","70 "); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","GolcondaExpress","9:00am ","49"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","KrishnaExpress","7:30am ","96"); 
  System.out.printf("-----------------------------------------------%n");     
 }
  else if(to.equalsIgnoreCase(d)){
               System.out.printf("-----------------------------------------------%n");
  System.out.printf("   Avilable trains and timings  %n");
  System.out.printf("| %-20s | %-6s | %6s |%n","TRAINS","Timings","Seats"); 
     System.out.printf("-----------------------------------------------%n");
                  
  System.out.printf("| %-18s | %-6s |%6s  |%n","ChennaiExpress      ","3:00am ","78 ");  
  System.out.printf("| %-18s | %-6s |%6s  |%n","CoromandelExpress   ","5:30am ","100"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","KanniyaKumariExpress","10:00pm","58 "); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","MaduriExpress       ","9:00am ","120"); 

  System.out.printf("-----------------------------------------------%n");
}

  else{
  System.out.printf("-----------------------------------------------%n");
  System.out.printf("   Avilable trains and timings  %n");
  System.out.printf("| %-18s | %-6s | %6s |%n","TRAINS","Timings","Seats"); 
  System.out.printf("-----------------------------------------------%n");                  
  System.out.printf("| %-18s | %-6s |%6s  |%n","VandeBharatExpress","3:00am ","98 ");  
  System.out.printf("| %-18s | %-6s |%6s  |%n","PrasanthiExpress","5:30am ","100"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","ShatabdiExpress","10:00pm","56 "); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","DeccanExpress","9:00am ","124"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","MumbaiExpress","7:30am ","110"); 
  System.out.printf("-----------------------------------------------%n");
}
 
}
else{     
  System.out.printf("-----------------------------------------------%n");
  System.out.printf("   Avilable trains and timings  %n");
  System.out.printf("| %-18s | %-6s | %6s |%n","TRAINS","Timings","Seats"); 
   System.out.printf("-----------------------------------------------%n");                 
  System.out.printf("| %-18s | %-6s |%6s  |%n","VandeBharatExpress","3:00am ","93 ");  
  System.out.printf("| %-18s | %-6s |%6s  |%n","PrasanthiExpress","5:30am ","103"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","ShatabdiExpress","10:00pm","267 "); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","DeccanExpress","9:00am ","120"); 
  System.out.printf("| %-18s | %-6s |%6s  |%n","MumbaiExpress","7:30am ","150"); 
  System.out.printf("-----------------------------------------------%n");
}
System.out.println("Enter Train name,time,seats(sperated by comma):");
String train=sc.nextLine();
return train;
}
}


class BookTicket{

public static void main(String args[])
{
int c=0;
String type="";
Scanner scan=new Scanner(System.in);
System.out.println();
System.out.print("Enter From Station:");
String from=scan.nextLine();

System.out.print("Enter To Station:");
String to=scan.nextLine();
System.out.println("Enter the date when you travel");
String date=scan.nextLine();

Classes cls=new Classes();
DetailsCheck tic=new DetailsCheck();
SelectTrains tobj =new SelectTrains();
String value=tobj.travel_train(to,from);
StringTokenizer st=new StringTokenizer(value,",");
String train=st.nextToken();
String time=st.nextToken();
int seats=Integer.parseInt(st.nextToken());
System.out.println("Enter classes choice");
System.out.println(" 1.Sleeper  2.second Sitting  3.AC First Class(1A)  4.AC 2 Tier(2A)");
int choice=scan.nextInt();

switch(choice){
case 1:c=cls.Sleeper();
       type="Sleeper";
       break;
case 2:c=cls.secondsitting();
       type="second_Sitting";
       break;
case 3:c=cls.Ac1();
        type="AC_FirstClass(1A)";
       break;
case 4:c=cls.Ac2();
         type="AC_2Tier(2A)";
       break;
default:c=cls.general();
         type="General";
}

tic.details();
tic.display(c,train,time,from,to,date,type,seats);
}
}