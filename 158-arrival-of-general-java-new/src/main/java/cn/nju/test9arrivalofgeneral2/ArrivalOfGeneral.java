package cn.nju.test9arrivalofgeneral2;

//import sun.jvm.hotspot.ui.FindInCodeCachePanel;

//import sun.font.DelegatingShape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrivalOfGeneral {

    /**
     * 处理士兵交换次数
     * @param num 士兵个数
     * @param heightArr 身高数组
     * @return 交换次数
     */
    public static int calculate(int num, int[] heightArr) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i=0;i<num;i++){
            list.add(heightArr[i]);
        }

        int MaxIndex=list.indexOf(Collections.max(list));

        list.remove(Collections.max(list));
        int MinIndex=list.indexOf(Collections.min(list));

        return MaxIndex+(num-2-MinIndex);
    }

}
