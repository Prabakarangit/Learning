package learn.dsa.array;

public class TrappingRainWater {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{4, 2, 0, 3, 2, 5}));
    }

    static int trap(int[] height) {
        int l = 1, r = height.length - 2;
        int lmax = height[0], rmax = height[height.length - 1];
        int ans = 0;

        while (l <= r) {

            if (rmax <= lmax) {
                ans += Math.max(0, rmax - height[r]);
                rmax = Math.max(rmax, height[r]);
                r--;
            } else {
                ans += Math.max(0, lmax - height[l]);
                lmax = Math.max(lmax, height[l]);
                l++;
            }
        }
        return ans;
    }
}


//
//    class Solution {
//
//
//        public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
//            int n = adj.size();
//            boolean[] visited = new boolean[n];
//            boolean[] recStack = new boolean[n];
//
//            for (int i = 0; i < n; i++) {
//                if (!visited[i] && isCycleExists(adj, visited, recStack, i)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        public boolean isCycleExists(ArrayList<ArrayList<Integer>> adj,
//                                     boolean[] visited, boolean[] recStack, int source) {
//            visited[source] = true;
//            recStack[source] = true;
//
//            for (Integer neighbour: adj.get(source)) {
//                if (!visited[neighbour]
//                        && isCycleExists(adj, visited, recStack, neighbour)) {
//                    return true;
//                } else if (recStack[neighbour]) {
//                    return true;
//                }
//            }
//            recStack[source] = false;
//            return false;
//        }
//    }
//
//
//    class Solution {
//        public boolean isBipartite(int[][] graph) {
//            int n = graph.length;
//            int color[] = new int[n];
//            // 1 and -1, 0 -> no color
//
//            for(int i = 0; i < n; i++) {
//                if (color[i] == 0) { //node is not visited
//                    Queue<Integer> queue = new LinkedList<Integer>();
//                    queue.add(i);
//                    color[i] = 1;
//                    while (!queue.isEmpty()) {
//                        int node = queue.poll();
//                        for(int neighbour: graph[node]) {
//                            if (color[neighbour] == 0) {
//                                color[neighbour] = -1*color[node];
//                                queue.add(neighbour);
//                            } else if (color[neighbour] == color[node]) {
//                                return false;
//                            }
//                        }
//                    }
//                }
//            }
//            return true;
//        }
//    }
//
//




