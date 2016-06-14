package com.company.LinkedList;

import com.sun.org.apache.bcel.internal.generic.ILOAD;

/**
 * Created by hcummings on 6/14/2016.
 */
public class linked_list_example {

    public static void main (String[] args){

        LinkedList list = new LinkedList();
        list.add(new Node(new String[]{"thing 1"}),1);
        Node node1 = (Node) list.get(1);
        node1.setNext(new Node(new String[]{"thing 2"}));

        String[] result =  (String[])node1.getNext().getData();
        System.out.println(result[0].toString());
    }


}
