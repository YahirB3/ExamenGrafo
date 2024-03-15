public class main {
    
    public static void main(String[] args) {
        int[][] mAdy1 = {
            {0, 1, 0, 0, 1},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {0, 1, 0, 0, 0},
            {1, 1, 1, 0, 0}
        };
        System.out.println("Primer grafo:");
        ImprimirGrafo(mAdy1);
        int[][] mAdy2 = {
            {0, 0, 0, 1, 1},
            {0, 0, 1, 0, 0},
            {0, 1, 0, 0, 1},
            {1, 0, 0, 0, 0},
            {1, 0, 1, 0, 0}
        };
        System.out.println("Segundo grafo:");
        ImprimirGrafo(mAdy2);
        int[][] mAdy3 = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 1},
            {1, 0, 0, 0, 0},
            {0, 1, 0, 0, 1},
            {0, 1, 0, 1, 0}
        };
        System.out.println("Tercer grafo:");
        ImprimirGrafo(mAdy3);
        int[][] mAdy4 = {
            {0, 1, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0}
        };
        System.out.println("Cuarto grafo:");
        ImprimirGrafo(mAdy4);
        int[][] mAdy5 = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1},
            {0, 1, 0, 1, 0}
        };
        System.out.println("Quinto grafo:");
        ImprimirGrafo(mAdy5);
    }
    public static void ImprimirGrafo(int[][] MA) {
        for (int i = 0; i < MA.length; i++) {
            System.out.print("Vértice " + (i + 1) + " está conectado con: ");
            for (int j = 0; j < MA[i].length; j++) {
                if (MA[i][j] == 1) {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
