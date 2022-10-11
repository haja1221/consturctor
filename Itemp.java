class Itemp{
      String empName;
      int empid;
      int salary;
      

      Itemp(String name,int id,int sal){
       
           empName=name;
           empid=id;
           salary=sal;

       System.out.println("name= "+name+"\nemploye id= "+empid+"\nsalary= "+salary);

      }
      Itemp(String name,int id){

            empName=name;
            empid=id;
      System.out.println("\nname="+name+"\nemployeeid= "+empid);

      }

      public static void main(String[]args){
       
       Itemp S1= new Itemp("hajamohideen",1,10000);
       
       Itemp S2= new Itemp("naveen",2);



      }
}
