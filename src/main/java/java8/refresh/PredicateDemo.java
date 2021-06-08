package java8.refresh;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        //1
        /*
        Predicate predEven = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                if(i % 2 == 0){
                    return true;
                }else{
                    return false;
                }
            }
        };
         */

        System.out.println("--------------------------------------------------------------");
        //2
        Predicate<Integer> predEven = (Integer i) -> {
                if(i % 2 == 0){
                    return true;
                }else{
                    return false;
                }
        };
        System.out.println(predEven.test(16));
    }

}
