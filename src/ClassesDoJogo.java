public class ClassesDoJogo {
    private String nome;
    private int idade;
    private String tipo;

    public ClassesDoJogo(String nome, int idade, String tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo.toLowerCase();
    }

    public String obterAtaque(){
        switch (tipo) {
            case "mago": return "magia";
            case "guerreiro": return "espada";
            case "monge": return "artes marciais";
            case "ninja": return "shuriken";
            default: return "um ataque desconhecido";
        }
    }

    public void atacar(){
        System.out.println(tipo + " atacou usando " + obterAtaque());
    }

    public void perfil(){
        System.out.println(nome + " é " + tipo + ". E tem " + idade + " anos.");
    }
    public static void main(String[] args){
            ClassesDoJogo heroi = new ClassesDoJogo("Lulu", 17, "ninja");
            heroi.perfil();
            heroi.atacar();  
        }
}
