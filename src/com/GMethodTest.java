package com;

import java.util.ArrayList;

public class GMethodTest {


    public static void main(String[] args) {

            	 ArrayList<Integer> list = new ArrayList<Integer>();
            		 ArrayList<String>  words = new ArrayList<String>();
            		 ArrayList<Circle>  circles = new ArrayList<Circle>();
            		    list.add(14);
            		    list.add(24);
            		    list.add(4);
            		    list.add(12);

            		   words.add("red");
            		   words.add("green");
            		   words.add("blue");
                       words.add("blue");

            		    circles.add(new Circle(3));
            		    circles.add(new Circle(2.9));
            		    circles.add(new Circle(5.9));
            		    circles.add(new Circle(3));


            		 ArrayList<Integer>  newList = removeDuplicates(list);
            		 ArrayList<String>   newwords = removeDuplicates(words);
            		 ArrayList<Circle>  newcircles = removeDuplicates(circles);

                //观察下面三行代码打印结果，是否去掉了ArrayList中的重复项
            	     System.out.println(newList);
            		 System.out.println(newwords);
                   System.out.println(newcircles);

            		 Integer[] numbers = {1, 2, 3};
            		 System.out.println(max(numbers));
            		 String[]   s =  {"red", "green", "blue"};
                   System.out.println(max(s));
                   Circle[]   c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
            		 System.out.println(max(c));
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
        ArrayList<E> list1 = new ArrayList<>();
        for(E item : list){
           if (!list1.contains(item)) list1.add(item);
        }
        return list1;
    }

    public static <E extends Comparable<E>> E max(E[] list){
        E maxItem = list[0];
        for (int i = 0;i < list.length; i++){
            if (maxItem.compareTo(list[i]) == -1) maxItem = list[i];
        }
        return maxItem;
    }
}
