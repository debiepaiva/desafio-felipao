public class ClassificacaoPorVitorias {
    public static int total(int vitorias, int derrotas){
        return vitorias - derrotas;
    }

    public static void main(String[] args) throws Exception {
        int vitoriasTotais = total(200, 100);

        int[][] niveis = {
            {0, 10}, //Ferro
            {11, 20}, //Bronze
            {21, 50}, //Prata
            {51, 80}, //Ouro
            {81, 90}, //Diamante
            {91, 100}, //Lendário
        };

        String[] nomesNiveis = {"Ferro", "Bronze", "Prata", "Ouro", "Diamante", "Lendário"
        };

         String nivel = "Radiante";

         for (int i = 0; i < niveis.length; i++) {
            int minimo = niveis[i][0];
            int maximo = niveis[i][1];

            if (vitoriasTotais >= minimo && vitoriasTotais <= maximo) {
                nivel = nomesNiveis[i];
                break;
            }
        }

        System.out.println("O Herói tem de saldo de " + vitoriasTotais + " está no nível de " + nivel);
    }
}
