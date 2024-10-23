public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 9;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) { //True ou False para determinada operação
            System.out.println("Prova de recuperação.");
        } else {
            System.out.println("Reprovado");
        }

    //Ou
/*        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);*/
    }
}
