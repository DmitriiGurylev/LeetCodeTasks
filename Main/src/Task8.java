//package src;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Task8 {
//    int[][] grid;
//
//    public int largestIsland(int[][] grid) {
//        this.grid  = grid;
//        Map<Integer,Integer> map = new HashMap<>();
//        int id=0;
//
//        for (int i=1;i<grid.length;i++)
//            for (int j=1;j<grid.length;j++){
//                if (grid[i][j]==1){
//                    grid[i][j]=2;
//                    map.put(++id, findTheIslandCounts(i,j,grid.length));
//                    map.get(id)
//
//
//                }
//
//
//            }
//
//
//    }
//
//    public int findTheIslandCounts(int i,int j,int gridLength){
//        if (i!=gridLength)
//            if (grid[i+1][j]==1){
//                grid[i][j] = 2;
//                findTheIslandCounts(i,j,grid.length);
//    }
//
//
//
//
//
//    }
//
//}
