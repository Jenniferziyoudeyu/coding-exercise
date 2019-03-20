package class_6_DFS;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {
    public List<List<Integer>> printAllSubset(List<Integer> list) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(list, lists, 0, cur);
        return lists;

    }
    static void dfs(List<Integer> list, List<List<Integer>> lists, int level, List<Integer> cur) {
        if (level >= list.size()) {
            lists.add(new ArrayList<>(cur));
            return;
        }
        int addInt = list.get(level);
        cur.add(addInt);
        dfs(list, lists, level + 1, cur);
        cur.remove(cur.size() - 1);
        dfs(list, lists, level + 1, cur);
    }
}

/*
test:
   public static void main(String[] args) {
   ------------------------------------------------------
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }

        PrintAllSubsets print = new PrintAllSubsets();
        List<List<Integer>> listInt = print.printAllSubset(list);
        for (List i : listInt) {
            System.out.println(i);
        }


output:
[1, 2, 3]
[1, 2]
[1, 3]
[1]
[2, 3]
[2]
[3]
[]

 */
