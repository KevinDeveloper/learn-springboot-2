package com.kevin.springboottwo;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName: Test
 * @Description:
 * @Auther: Kevin
 * @Date: 2018/4/17 09:59
 */
public class Test {
    public static void main(String[] args){
//        Integer[] a = new Integer[]{1,2,3,4};
//        List<Integer> list = Arrays.asList(a);
//        list.add(5);
//
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        List<String> list1 = new ArrayList<>(list);
        list.add("3");
        System.out.println(list.equals(list1));
        LinkedHashMap<String, String> linkMap = new LinkedHashMap<>();
        ExecutorService service = Executors.newFixedThreadPool(3);
        linkMap.put("1","2");


    }

    @Override
    public int hashCode() {
        return super.hashCode();

    }
}
