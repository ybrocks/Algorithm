package A2dfs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A01Dfs방문순서 {
    static List<List<Integer>> adjList = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) {

        // 출발은 0부터 시작했을때 dfs로 방문할경우 방문순서
        int[][] nodes = {{0,1}, {2,0}, {1,3}, {2,3}, {2,4}};
        visited = new boolean[5];

        for (int i=0; i<5; i++){
            adjList.add(new ArrayList<>());
        }
        for (int[] n : nodes){
            int start = n[0];
            int end = n[1];
            // 양방향 간선인 경우
            adjList.get(n[0]).add(n[1]);
            adjList.get(n[1]).add(n[0]);
        }
        // 정점번호가 작은것부터 방문하기 위한 정렬작업
        for (List<Integer> l : adjList){
            l.sort(Comparator.naturalOrder());
        }
        dfs(0);
    }
    static void dfs(int start){
        System.out.println(start);
        visited[start] = true;
        for (int target : adjList.get(start)){
            if (!visited[target]){
                dfs(target);
            }
        }
    }
}
//관련문제
//DFSBFS(1260) : 백준
//트리의 부모 찾기 : 백준
//연결 요소의 개수(11724) : 백준