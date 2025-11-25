public class App {
    public static void main(String[] args) throws Exception {
        String name = "Debora";
        int exp = 10000;
        
        /* No formato de if else */

        if (exp <= 1000) {
             System.out.println("O herói de nome: " + name + " está no nível de Ferro.");
        } else if (exp >= 10001) {
            System.out.println("O herói de nome: " + name + " está no nível de Radiante.");
        } else if (exp >= 1000 & exp <= 2000) {
            System.out.println("O herói de nome: " + name + " está no nível de Bronze.");
        } else if (exp >= 2001 & exp <= 5000) {
            System.out.println("O herói de nome: " + name + " está no nível de Prata.");
        } else if (exp >= 5001 & exp <= 7000) {
            System.out.println("O herói de nome: " + name + " está no nível de Ouro.");
        } else if (exp >= 7001 & exp <= 8000) {
            System.out.println("O herói de nome: " + name + " está no nível de Platina.");
        } else if (exp >= 8001 & exp <= 9000) {
            System.out.println("O herói de nome: " + name + " está no nível de Ascendente.");
        } else if (exp >= 9001 & exp <= 10000) {
            System.out.println("O herói de nome: " + name + " está no nível de Imortal.");
        } 
    
        } 
}
