package Heranca;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Aguinaldo");
        v.setSalario(1000.0f);
        v.setCpf("23723424");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem((int) 10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O sal�rio do vendedor �: "+v.calcularSalario());
        
        Motorista m = new Motorista();
        
    }
}
