package arrays;

import java.util.ArrayList;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(printPascal(5)); //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {

        ArrayList<ArrayList<Long>> pascalList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            ArrayList<Long> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    list.add(1L);
                } else {
                    long a = pascalList.get(i - 1).get(j - 1);
                    long b = pascalList.get(i - 1).get(j);
                    list.add(a+b);
                }
            }
            pascalList.add(list);
        }
        return pascalList;
    }
}
