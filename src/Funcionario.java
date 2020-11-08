public class Funcionario {
    private String nomeF;
    private int matricula;
    private String cargo;
    private int faltasF;
    private int advertenciaF;

    public Funcionario(String nomeF, int matricula, String cargo){
        this.nomeF = nomeF;
        this.matricula = matricula;
        this.cargo = cargo;
    }

    private void faltas(){       //Essas faltas são anuais
        this.faltasF = 2;     
        if (faltasF >= 30){
            System.out.println("O Funcionário possui muitas faltas consecutivas injustificadas ");
            System.out.println("O funcionário será mandado embora por justa causa (abandono de emprego)");
        }else{
            System.out.println("Faltas justificadas");
            
        }     
    }

    private void advertencias(){   //Advertências totais
        this.advertenciaF = 5;
        if (advertenciaF >= 3){
            System.out.println("O Funcionário possui muitas advertências ");
            System.out.println("O funcionário será desligado por justa causa!!");
        }else{
            System.out.println("Em questão de diciplina o funcionário é 'diciplinado' ");
        }
    }

    public void demissao(){  
        faltas();
        advertencias();
    }

    public String getnomeF(){
        return nomeF;
    }

    public int getmatricula(){
        return matricula;
    }

    public String getcargo(){
        return cargo;
    }

    public void setnomeF(String nomeF){
        this.nomeF = nomeF;
    }

    public void setmatricula(int matricula){
        this.matricula = matricula;
    }

    public void setcargo(String cargo){
        this.cargo = cargo;
    }
}
