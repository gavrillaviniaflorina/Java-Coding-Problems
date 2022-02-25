import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter2 {

    //todo:P40
    public static List<Integer> checkNull(List<Integer> integers){
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

    //todo:41
    static void throwCustom(Integer number) throws Exception {
        if(number==0){
            throw new Exception("The number can't be 0");
        }

    }



}
