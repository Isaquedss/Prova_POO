public class Empresa {
    private String nomeE;
    private String porte;
    private String modeloDeNegocio;
    private double metaLoja;  //Variavel para informar a meta da loja
    private double vendaLoja = 630000; //Variavel para informar a venda da loja

    public Empresa(String nomeE, String porte, String modeloDeNegocio) {
        this.nomeE = nomeE;
        this.porte = porte;
        this.modeloDeNegocio = modeloDeNegocio;
    }
    
    public void meta(){       //Método para informar a meta total do mes 
        this.metaLoja = 550000;
        System.out.println("A meta da loja no mês é de " + metaLoja + "R$");
        vendas();

    }

    private void vendas(){  //Método para informar a venda total do mês
        this.vendaLoja = 620000;
        if(vendaLoja >= 550000){
            System.out.println("A loja vendeu " + metaLoja + "R$" + " e bateu sua meta");
        } else{
            System.out.println("A loja não vendeu " + metaLoja + "R$" +  " e não bateu a meta");
        }
    }

    public void premiacao(){
        if(vendaLoja >= 550000){
            System.out.println("A loja recebeu a premiação do mês");
        } else{
            System.out.println("A loja não receberá premiação");
        }
    }

    public String getnomeE(){
        return nomeE;
    }

    public String getporte(){
        return porte;
    }

    public String getmodeloDeNegocio(){
        return modeloDeNegocio;
    }

    public void setnomeE(String nomeE){
        this.nomeE = nomeE;
    }

    public void setporte(String porte){
        this.porte = porte;
    }

    public void setmodeloDeNegocio(String modeloDeNegocio){
        this.modeloDeNegocio = modeloDeNegocio;
    }
}

