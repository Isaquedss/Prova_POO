public class Principal {
    public static void main(String[] args) throws Exception {

        Empresa empresaA = new Empresa("Via Varejo ", "Empresa de Grande Porte", "Franquia");

        empresaA.setnomeE("Casas Bahia");
        empresaA.setporte("EPP");
        empresaA.setmodeloDeNegocio("Franquia");
            System.out.print("A empresa é a " + empresaA.getnomeE());
            System.out.print(", ela tem um porte " + empresaA.getporte());
            System.out.println(", e seu modelo de negocio é uma " + empresaA.getmodeloDeNegocio());

        empresaA.meta();
        empresaA.premiacao(); 

            System.out.println();

        Funcionario funcionarioA = new Funcionario("Marcos", 3205026, "coordenador");

        funcionarioA.setnomeF("Ana vitoria");
        funcionarioA.setmatricula(4206633);
        funcionarioA.setcargo("Analista de crédito");
            System.err.print("O funcionário " + funcionarioA.getnomeF());
            System.out.print(" com seu registro na matrícula " + funcionarioA.getmatricula());
            System.out.println(" possui o cargo de " + funcionarioA.getcargo());
    
        funcionarioA.demissao();

            System.out.println();

            System.out.println("O último registro de venda/reserva do funcionário " + funcionarioA.getnomeF() + " foi:");

            System.out.println();


        Produto produtoA = new Produto("Televisores", 1499, 4631245 );

        produtoA.setdescricao("Tv 32 pol Smart Samsung");
        produtoA.setpreco(2500);
        produtoA.setcodigo(4256398);
            System.out.print(produtoA.getdescricao());
            System.out.print( " no valor de " + produtoA.getpreco());
            System.out.println("R$" + " com o codigo " + produtoA.getcodigo());
        
        produtoA.reservado();
        produtoA.vendido();

        




        
        
        
        
    }
}
