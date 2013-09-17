package main.chapter8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cponakan
 * Date: 7/25/13
 * Time: 10:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class RobotInMatrix {
    static int[][] matrix ={{0,0,1},{0,0,1},{0,0,0}};

    public static void main(String[] args){
        System.out.println(recursive(2, 0, 0));
        List<String> list = new ArrayList<String>();
        getAllPathsWhenObstaclesPresent(2, 0, 0, "", list);
        for(String abc : list){
            System.out.println(abc);
        }
    }

    public static int recursive(int n, int i, int j){
        if( i == n || j == n){
            //reach either border, only one path
            return 1;
        }
        return recursive(n, i + 1, j) + recursive(n, i, j + 1);
    }

    public static void getAllPaths(int n, int i, int j, String path, List<String> list){
        path +="(" + i + "," + j + ") ";
        if( i == n || j == n){
            if(i!=n){
                for(int k=i+1; k<=n; k++){
                    path +="(" + k + "," + n + ") ";
                }
            }
            if(j!=n){
                for(int k=j+1; k<=n; k++){
                    path +="(" + n + "," + k + ") ";
                }
            }
            list.add(path);

            return;
        }

        getAllPaths(n, i + 1, j, path, list);
        getAllPaths(n, i, j + 1, path, list);
    }

    public static void getAllPathsWhenObstaclesPresent(int n, int i, int j, String path, List<String> list){
        if(matrix[i][j] == 0){
            path +="(" + i + "," + j + ") ";
            if( i == n || j == n){
                if(i!=n){
                    for(int k=i+1; k<=n; k++){
                        path +="(" + k + "," + n + ") ";
                    }
                }
                if(j!=n){
                    for(int k=j+1; k<=n; k++){
                        path +="(" + n + "," + k + ") ";
                    }
                }
                list.add(path);

                return;
            }
        }else{
            return;
        }
        if( i> n || j > n){
            return;
        }


        getAllPathsWhenObstaclesPresent(n, i + 1, j, path, list);
        getAllPathsWhenObstaclesPresent(n, i, j + 1, path, list);
    }
}
