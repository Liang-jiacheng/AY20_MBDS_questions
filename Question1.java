
package com.soil.business.log.api;

import java.util.*;

public class X {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数：");
        int number = scanner.nextInt();

        List<Integer> returnList = new ArrayList<>();
        //todo 这里替换成87127231192 and 5994891682.就是b
        returnList.add(65);
        returnList.add(72);
        returnList.add(90);
        returnList.add(110);

        int[][] arr = createIntArray(number);

        List<Boolean[]> possibles = getPossibleArr(number);

        for (int k = 0; k < possibles.size(); k++) {
            int x = 0;
            int y = 0;

            List<Integer> list = new ArrayList<>();
            Integer sum = 0;

            list.add(arr[x][y]);
            sum = sum + arr[x][y];

            Boolean[] possibleArr = possibles.get(k);
            for (int i = 0; i < possibleArr.length; i++) {
                if (possibleArr[i]) {
                    x = x + 1;
                } else {
                    y = y + 1;
                }

                list.add(arr[x][y]);
                sum = sum + arr[x][y];
            }

            if (returnList.contains(sum)) {
                System.out.println("路径：" + getStrByArr(list) + "   总和:" + sum);
            }
        }
    }

    private static int[][] createIntArray(int number) {
        int[][] arr = new int[number][number];

        int k = 1;
        for (int i = 0; i < number; i++) {
            int[] data = new int[number];
            for (int j = 0; j < number; j++) {
                data[j] = k;
            }
            k++;

            arr[i] = data;
        }

        return arr;
    }

    private static List<Boolean[]> getPossibleArr(int number) {
        List<Boolean[]> list = new ArrayList<>();
        //todo 获取10个布尔数的所有可能
        return list;
    }

    private static String getStrByArr(List<Integer> list) {
        StringBuilder str = new StringBuilder();

        for (Integer item : list) {
            if (item != null) {
                str.append(item.toString()).append(",");
            }
        }
        if (str.length() > 0) {
            return str.substring(0, str.length() - 1);
        }

        return "";
    }

}

