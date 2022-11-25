package com.github.tvboxgo.www.util;

import java.util.ArrayList;

public class Config {

    private static  ArrayList<String> arrayList;

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
            arrayList.add("clan://localhost/api/ypfe/ypfe.json");
            arrayList.add("clan://localhost/api/gv97/gv97.json");
        }
        return arrayList;
    }
}
