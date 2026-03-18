package basics;
import  java.lang.Math;

//methods   are block   of  code    statements  that    perform a   certain task
//make  code    more    reusable, efficient and organized.
//Methods   in  java    must    belong  to  a   class


/*
Why functions:-

1.  modularity
2.  code    reusability
3.  readability
4.  Maintainability

*/
public class JavaMethodsDemo {

    //a simple  method  definition(instance method)
    public void   greetMessage(String  name){
        System.out.println("Hello   " + name +"");
    }

    //Method    2:  to  find    the max of  two numbers(static  method: associated  with    class.)
    public static int findMax(int x,int  y){
        if(x>=y){
            return  x;
        }else{
            return  y;
        }
    }
    public static void main(String[] args) {

        JavaMethodsDemo obj1=new    JavaMethodsDemo();//object  creation
        obj1.greetMessage("Ashish");//instance  method  call

        int result1=findMax(9, 7);//calling staic   method
        int result2=JavaMethodsDemo.findMax(9, 7);//calling staic   method

        System.out.println("max:" + result1);
        System.out.println("max:" + result2);

        System.out.println(Math.random());//calling a   predefined  method
    }

}
