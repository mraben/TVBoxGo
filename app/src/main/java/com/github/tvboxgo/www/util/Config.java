package com.github.tvboxgo.www.util;

import java.util.ArrayList;

public class Config {

    private static  ArrayList<String> arrayList;
    public static  final int  ANIMATE_DURATION = 5;
    public static  final int  VIEWPAGER_DURATION = 10;
    public static  final int  NUM_ZERO = 0;
    public static  final int  NUM_ONE = 1;
    public static  final int  NUM_TWO = 2;
    public static  final int  NUM_THR = 3;
    public static  final int  NUM_FOUR = 4;
    public static  final int  NUM_FIVE = 5;
    public static  final int  NUM_SIX = 6;
    public static  final int  NUM_SEVEN = 7;
    public static  final int  NUM_EIGHT = 8;
    public static  final int  NUM_NINE = 9;
    public static  final int  NUM_TEN = 10;


    /**
     * 返回默认地址集合
     * @return
     */
    public static ArrayList<String> getNormalUrl() {
        if (null == arrayList || arrayList.size() <= 0) {
            arrayList = new ArrayList<>();
            arrayList.add("clan://localhost/api/lanjin/lanjinc.json");
            arrayList.add("clan://localhost/api/lanjin/lanjinb.json");
            arrayList.add("clan://localhost/api/lanjin/lanjina.json");
            arrayList.add("clan://localhost/api/lanjin/lanjin.json");
            arrayList.add("clan://localhost/api/eib3/eib3.json");
            arrayList.add("clan://localhost/api/ikbb/ikbb.json");
            arrayList.add("clan://localhost/api/kcel/kcel.json");
            arrayList.add("clan://localhost/api/xymc/xymc.json");
            arrayList.add("clan://localhost/api/ptest/ptest.json");
            arrayList.add("clan://localhost/api/1pw8/1pw8.json");
            arrayList.add("clan://localhost/api/g6qm/g6qm.json");
            arrayList.add("clan://localhost/api/7a7n/7a7n.json");
            arrayList.add("clan://localhost/api/fj/fj.json");
            arrayList.add("clan://localhost/api/pyn/pyn.json");
            arrayList.add("clan://localhost/api/ns66/ns66.json");
            arrayList.add("clan://localhost/api/5tbo/5tbo.json");
            arrayList.add("clan://localhost/api/fzns/fzns.json");
            arrayList.add("clan://localhost/api/pb9c/pb9c.json");
            arrayList.add("clan://localhost/api/fuei/fuei.json");
//            arrayList.add("clan://localhost/api/ypfe/ypfe.json");
            arrayList.add("clan://localhost/api/gv97/gv97.json");
            arrayList.add("clan://localhost/api/489x/489x.json");
            arrayList.add("clan://localhost/api/5vdu/5vdu.json");
            arrayList.add("clan://localhost/api/p6w5/p6w5.json");
            arrayList.add("clan://localhost/api/hp75/hp75.json");
        }
        return arrayList;
    }
}
