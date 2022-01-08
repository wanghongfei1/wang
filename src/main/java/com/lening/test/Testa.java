package com.lening.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @Description: Testa$
 * @Author 王豪
 * @Date: 2022/1/7$ 18:49$
 * @Version 1.0
 */
public class Testa {
    public static void main(String[] args) {
//        List<Integer> list  = new ArrayList<>();
//        list.add(1);
//        list.add(18);
//        list.add(15);
//        list.add(11);
//        list.forEach(i ->{
//            System.out.println(i);
//        });



//      1.  Runnable runnable = () -> System.out.println("Hello Lambda!");
//        runnable.run();

//     2.   Consumer<Integer> c = (x) -> System.out.println(x);
//        c.accept(15955555);

//     3.  String ss = "dfdsfsd";
//        Consumer<String> con = (x) -> System. out .println(x);
//        con.accept( "啦啦啦，我是卖报的小行家" );



        Comparator<Integer> com = (x, y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x, y);
        };

        Runnable t = () -> System.out.println("你真是会玩");
        

    }
}
