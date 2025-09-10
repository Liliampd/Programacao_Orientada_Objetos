class Usuario extends Pessoa {

    public String matricula;


    void imprimirInformacoes() {

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        System.out.println("Matricula: " + matricula);

        System.out.println("Pais: " + getPais());

    }

}