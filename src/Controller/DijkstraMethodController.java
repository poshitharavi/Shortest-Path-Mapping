/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Poshitha_Ravindu
 */
public class DijkstraMethodController {
    
    
    public static void dijkstra(int graph[][],int start){
        
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
        printGraph(start, dist,parents);
    }
    
    
    public static void printGraph(int start,int[] distances, int [] parents){
        
        int nVertices = distances.length;
        System.out.print("Vertex\t Distance\tPath");
         
        for (int vertexIndex = 0; vertexIndex < nVertices; vertexIndex++) 
        {
            if (vertexIndex != start) 
            {
                System.out.print("\n" + start + " -> ");
                System.out.print(vertexIndex + " \t\t ");
                System.out.print(distances[vertexIndex] + "\t\t");
                printPath(vertexIndex, parents);
                System.out.println(" ");
            }
        }
    }
    
    private static void printPath(int currentVertex, int[] parents)
    {
         
        if (currentVertex == -1)
        {
            return;
        }
        printPath(parents[currentVertex], parents);
        System.out.print(currentVertex + " ");
    }
    
}
