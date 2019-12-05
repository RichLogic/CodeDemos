//package leetcode.medium;
//
//import java.util.*;
//
//public class Subject310 {
//
//    public static void main(String[] args) {
//        int[][] edges = {{0,1},{1,2},{1,3},{2,4},{3,5},{4,6}};
//        System.out.println(findMinHeightTrees(6, edges));
//    }
//
//    private static List<Integer> findMinHeightTrees(int n, int[][] edges) {
//
//        List<Integer> resultList = new ArrayList<>();
//
//        if (edges.length == 0) {
//            resultList.add(0);z
//            return resultList;
//        }
//
//        if (edges.length == 1) {
//            resultList.add(edges[0][0]);
//            resultList.add(edges[0][1]);
//        }
//
//        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
//
//        for (int[] edge : edges) {
//            if (map.containsKey(edge[0]))
//                map.get(edge[0]).add(edge[1]);
//            else {
//                ArrayList<Integer> list = new ArrayList<>();
//                list.add(edge[1]);
//                map.put(edge[0], list);
//            }
//
//            if (map.containsKey(edge[1]))
//                map.get(edge[1]).add(edge[0]);
//            else {
//                ArrayList<Integer> list = new ArrayList<>();
//                list.add(edge[0]);
//                map.put(edge[1], list);
//            }
//        }
//
//        // 判断谁是叶子节点
//        Map<Integer, Integer> valueMap = new HashMap<>();
//        LinkedList<Integer> queue = new LinkedList<>();
//        List<Integer> leaves = new ArrayList<>();
//        map.forEach((x, y) -> {
//            if(y.size() == 1) {
//                queue.add(x);
//                leaves.add(x);
//                valueMap.put(x, 1);
//            }
//        });
//
//        while (queue.size() != 0) {
//            int x = queue.pop();
//
//            Integer parent = null;
//            for (Integer p : map.get(x)) {
//                if (!valueMap.containsKey(p) || (valueMap.get(p) == valueMap.get(x))) {
//                    parent = p;
//                    break;
//                }
//            }
//
//            if (parent != null) {
//                queue.add(parent);
//                valueMap.put(parent, valueMap.get(x) + 1);
//            }
//        }
//
//        int deep = 0;
//        for (Integer key : valueMap.keySet()) {
//            if (valueMap.get(key) > deep) {
//                deep = valueMap.get(key);
//                resultList.clear();
//                resultList.add(key);
//            } else if (valueMap.get(key) == deep) {
//                resultList.add(key);
//            }
//        }
//
//        return resultList;
//    }
//
//}
