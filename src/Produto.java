

public class Produto {
    private String descricao; //Aqui sera informado o nome do produto, a marca e o modelo
    private float preco;
    private int codigo; //Esse é o código da mercadoria , para ter um controle de estoque.
    private int unidade;

    public Produto(String descricao, float preco, int codigo) {
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
        this.unidade = 8;
    }    

    public void vendido(){
        this.unidade = 1;
        System.out.println("Foi vendido " + unidade + " Unidade ");   
    }

    public void reservado(){
        System.out.print("Foi reservado ");
        quantidade();   
    }

    private void quantidade(){
        this.unidade = 2;
        System.out.println(unidade + " Unidade");       
    }

    public String getdescricao(){
        return descricao;
    }

    public float getpreco(){
        return preco;
    } 

    public int getcodigo(){
        return codigo;
    }

    public void setdescricao(String descricao){
        this.descricao = descricao;
    }

    public void setpreco(float preco){
        this.preco = preco;
    }

    public void setcodigo(int codigo){
        this.codigo = codigo;
    }


}
