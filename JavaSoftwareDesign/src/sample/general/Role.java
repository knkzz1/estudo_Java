package sample.general;

public enum Role {
    USER("Usúario", " Ler; Editar"),
    ADMIN("Administrador", "Ler; Editar; Criar; Excluir"),
    OWNER("Proprietário", "Ler;Criar; Promover"),
    TEMP ("Temporário", "Ler"),
    READ ("Visitante", "Ler Restrições");

    //Atributos
    String nome;
    String permissoes;

    //Construtores
    Role(String nome, String permissoes){
        this.nome = nome;
        this.permissoes = permissoes;
    }
}