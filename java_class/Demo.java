package java_class;

 class box{
   double length,breadth,height;
}
public class Demo{
    public static void main(String args[]){
        double vol;
        box mybox=new box();
        mybox.length=13;
        mybox.breadth=13;
        mybox.height=13;
        vol=mybox.length*mybox.breadth*mybox.height;
        System.out.println("Volume is "+vol);
    }
}
