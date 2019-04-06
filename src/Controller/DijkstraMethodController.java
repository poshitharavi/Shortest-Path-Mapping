/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DijkstraOutPut;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DijkstraMethodController {
    
    static String path= "";
    
    public static DijkstraOutPut dijkstra(int graph[][],int start, int end){
        
        //geting the size of branches (cites)
        int arraySize = graph[0].length;
        //array sets the shortest distance to each branch
        int dist[]= new int [arraySize];
        //coolean to check the branch has visited already
        Boolean b[] = new Boolean[arraySize];
        //order of the branches
        int parents[] = new int[arraySize];
        
        //set all the distances to max values 
        //and check visited nodes as false
        for (int i=0;i < arraySize;i++){
            dist[i] = Integer.MAX_VALUE;
            b[i] = false;
        }
        //set the start branch distance as 0 
        dist[start] = 0;
        //set starting branches parent as no parent
        parents[start] = -1;
        
        for(int count=0; count< arraySize ; count++){
            //intialzing nearest vertex
            int nearestVertex = -1;
            //intializing current shortest path
            int shortestdis = Integer.MAX_VALUE;
            
           for(int vertexIndex=0; vertexIndex < arraySize; vertexIndex++){
               //checking thebranch has visited and  shortest distance to
               //that branch is smaller than current shortest distance
               if(!b[vertexIndex] && dist[vertexIndex] < shortestdis){
                   //set the neareset branch as current branch
                   nearestVertex = vertexIndex;
                   //shortest distance as the current 
                   shortestdis = dist[vertexIndex];
               }
           }
           //set visited branche as true
           b[nearestVertex] = true;
           
           for(int vertexIndex = 0;vertexIndex < arraySize; vertexIndex++){
               //get the current branch dustance
               int edgeDistance = graph[nearestVertex][vertexIndex];
               //check the cuurent branch distance is greater than 0 and check the new is low than current
               if(edgeDistance > 0 && ((shortestdis+edgeDistance)< dist[vertexIndex]) ){
                   //add the parent 
                   parents[vertexIndex] = nearestVertex;
                   //set the shortest path
                   dist[vertexIndex] = shortestdis+edgeDistance;
               }
           }
        }
        return getSelectedOutput(start, end ,dist,parents);
    }
    
    
    public static DijkstraOutPut getSelectedOutput(int start,int end,int[] distances, int [] parents){
        
        DijkstraOutPut out = new DijkstraOutPut();

                if(path != null){
                    path = "";
                }
                getPath(end, parents);
               
                out.setStart(start);
                out.setEnd(end);
                out.setTotalDistance(distances[end]);
                out.setPath(path);
            
        
        return out;
    }
    
    private static void getPath(int currentVertex, int[] parents)
    {
         
        if (currentVertex == -1)
        {
            return;
        }
        getPath(parents[currentVertex], parents);
     
        path+=currentVertex;
       
    }
    
}
