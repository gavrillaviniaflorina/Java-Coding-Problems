import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Chapter2 {

    //todo:P40
    public  List<Integer> checkNull(List<Integer> integers){
        if(integers==null){
            return Collections.emptyList();
        }

        List<Integer> result=new ArrayList<>();
        for(Integer integer:integers){
            if(integer!=null){
                result.add(integer);
            }
        }

        return result;
    }

    //todo:42
    public  void throwCustom(Integer number) throws Exception {
        if(number==0){
            throw new Exception("The number can't be 0");
        }

    }

    //todo:43
    public String returnNotNullReference( String text) {

        return Objects.requireNonNullElse(text,"I don't have a name");

    }

    //todo:44
    public boolean checkInTheRange(int min, int max, int index){
        if(min>index || max<index){
            throw new IndexOutOfBoundsException(" I am outside: "+ index);
        }
        return true;
    }


    //todo:45

    public boolean checkSubrangeInRange(int sub_min,int sub_max, int range_min,int range_max){

        checkInTheRange(range_min,range_max,sub_min);
        checkInTheRange(range_min,range_max,sub_max);

        return true;
    }

    //todo:49
    public final class Point1{
        private final double x;
        private final  double y;

        public Point1(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }

//todo:50 passing mutable objects to/from an imutable class
    public class Radius{
        private int start;
        private int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}

    public final class Point{

private final double x;
        private final double y;
        private final Radius radius;

        public Point(double x, double y, Radius radius) {
            this.x = x;
            this.y = y;
            Radius clone=new Radius();
            clone.setStart(radius.getStart());
            clone.setEnd(radius.getEnd());
            this.radius=clone;
        }



        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Radius getRadius() {
            Radius clone=new Radius();
            clone.setStart(this.radius.getStart());
            clone.setEnd(this.radius.getEnd());
            return clone;
        }
    }

    //todo:53


    public class Point3 implements Cloneable{
        private int x;
        private int y;

        public Point3(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point3() {
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        @Override
        public Point3 clone() throws CloneNotSupportedException{
            return (Point3) super.clone();
        }
        //todo:54

        @Override
        public String toString(){
            String text="I am a point";
            return text;
        }
    }

    //todo:56,57


    public void statementBlocks(int choose){

        switch (choose){
            case 0->{
                System.out.println("This is case 0");
            }
            case 1->{
                System.out.println("This is case 1");
            }
            case 2->{
                System.out.println("This is case 2");
            }
            default -> {
                System.out.println("No case");
            }
        }
    }





}
