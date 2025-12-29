package A1sort;

import java.util.PriorityQueue;
import java.util.Queue;

public class A02힙정렬문제풀이 {
    public static void main(String[] args) {
        //명예의 전당 : 프로그래머스

        //야근지수 : 프로그래머스

        // score_len은 배열 score의 길이입니다.

        class Solution {
            public int[] solution(int k, int[] score) {
                int[] answer = new int[score.length];

                Queue<Integer> pq = new PriorityQueue<>();

                for (int i=0; i<score.length; i++){
                    int a = score[i];

                    if (pq.size()<k){
                        pq.add(a);
                    }else {
                        if (a>pq.peek()){
                            pq.poll();
                            pq.add(a);
                        }
                    }
                    answer[i] = pq.peek();
                }
                return answer;
            }
        }
    }
}
