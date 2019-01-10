import java.util.*;
class Hashset1{
 public static void main(String args[]){
  
 HashSet<String> al=new HashSet(); // creating hashSet
 al.add("Rachit");                 // adding elements
 al.add("Amit");
 al.add("jack");
 al.add("Amit");
 Iterator<String> itr=al.iterator();
 while(itr.hasNext()){
 System.out.println(itr.next());
 }
 }
 }