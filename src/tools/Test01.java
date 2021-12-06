package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        String   str[]={"中文","计算机","ABC", "123","qq@qq.com"};

        //Array.aslist()   把数组转换成list列表
        List<String> strlist= Arrays.asList(str);
        for (String  string :strlist){
            System.out.println(string);
        }

        //new ArrayList<>(Arrays.asList(str));把数组转换成ArrayList，因此就拥有了众多的操作方法
        ArrayList<String> alist  =new ArrayList<>(Arrays.asList(str));
        LinkedList<String> llist= new LinkedList<>(Arrays.asList(str));
        alist.remove(2);
        //llist.remove(3);
        for (String  string  :alist){
            System.out.print(string+"\t");
        }
        // 将列表转换为数组  语法 ：列表.toArray()
        Object[] res = alist.toArray();
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + "\t");

        }

    }
}

