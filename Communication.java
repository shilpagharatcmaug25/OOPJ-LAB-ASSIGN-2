interface Callable{
void makeCall(String number);
}

interface Messaging{
 void sendMessage(String number, String message);
 }
 
 interface Internet{
 void browse(String website);
 }
 
class SmartPhone implements Callable,Messaging,Internet{
 
public void makeCall(String number){
 System.out.println("Calling:" +number);
 }
 
 public void sendMessage(String number, String message){
 System.out.println("Sending message to" +number+ ":" +message);
 }
 
 public void browse(String website){
 System.out.println("Browsing Website:" +website);
 }
 }
 
 public class Communication{
 public static void main(String args[]){
 SmartPhone s=new SmartPhone();
 s.makeCall("9876543210" );
 s.sendMessage("9876543210","Hello!");
 s.browse("www.google.com");
 }
 }
 
 
 
 