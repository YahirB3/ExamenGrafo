public class main {
    
    public static void main(String[] args) {
        int[][] mAdy1 = {
            {0, 3, 0, 0, 4},
            {3, 0, 2, 6, 8},
            {0, 2, 0, 0, 5},
            {0, 6, 0, 0, 0},
            {4, 8, 5, 0, 0}
        };
        System.out.println("Primer grafo:");
        ImprimirGrafo(mAdy1);
        int[][] mAdy2 = {
            {0, 0, 0, 2, 4},
            {0, 0, 3, 0, 0},
            {0, 1, 0, 0, 5},
            {2, 0, 0, 0, 0},
            {6, 0, 3, 0, 0}
        };
        System.out.println("Segundo grafo:");
        ImprimirGrafo(mAdy2);
        int[][] mAdy3 = {
            {0, 2, 5, 0, 0},
            {6, 0, 0, 3, 2},
            {4, 0, 0, 0, 0},
            {0, 2, 0, 0, 2},
            {0, 3, 0, 5, 0}
        };
        System.out.println("Tercer grafo:");
        ImprimirGrafo(mAdy3);
        int[][] mAdy4 = {
            {0, 4, 2, 0, 0},
            {2, 0, 3, 7, 3},
            {3, 4, 0, 0, 7},
            {0, 3, 0, 0, 0},
            {0, 5, 2, 0, 0}
        };
        System.out.println("Cuarto grafo:");
        ImprimirGrafo(mAdy4);
        int[][] mAdy5 = {
            {0, 3, 0, 7, 0},
            {7, 0, 3, 0, 2},
            {0, 6, 0, 5, 0},
            {4, 0, 3, 0, 3},
            {0, 4, 0, 2, 0}
        };
        System.out.println("Quinto grafo:");
        ImprimirGrafo(mAdy5);
    }
public static void ImprimirGrafo(int[][] MA) {
    char[] vertices = {'A', 'B', 'C', 'D', 'E'};
    for (int i = 0; i < MA.length; i++) {
        System.out.print(vertices[i] + " está conectado con: ");
        for (int j = 0; j < MA[i].length; j++) {
            if (MA[i][j] > 0) {
                System.out.print(vertices[j] + "(" + MA[i][j] + ")" + " ");
            }
        }
        System.out.println();
    }
}
}
