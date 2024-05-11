import java.util.*;

public class main {
    
    public static void main(String[] args) {
        int[][] mAdy1 = {
            {0, 3, 0, 0, 4},
            {3, 0, 2, 6, 8},
            {0, 2, 0, 0, 5},
            {0, 6, 0, 0, 0},
            {4, 8, 5, 0, 0}
        };
        String[] nombres = {"A", "B", "C", "D", "E"};
        System.out.println("Primer grafo:");
        dijkstra(mAdy1, nombres);
        
    }
    public static void dijkstra(int[][] graph, String[] nombres) {
        System.out.println("elige A,B,C,D o E");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nodo inicio:");
        String nodoInicio = scanner.nextLine();
        System.out.println("nodo final:");
        String nodoFinal = scanner.nextLine();
        int source = -1;
        int destination = -1;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nodoInicio)) {
                source = i;
            }
            if (nombres[i].equalsIgnoreCase(nodoFinal)) {
                destination = i;
            }
        }
        if (source == -1 || destination == -1) {
            System.out.println("nodos no válidos.");
            return;
        }
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;   
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }   
        System.out.println("Distancia más corta del nodo: " + nodoInicio + " al nodo " + nodoFinal + " es: " + dist[destination]);
    }
    public static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int min1 = -1;
        
        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                min1 = v;
            }
        }
        return min1;
    }
}
