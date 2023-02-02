package Heranca;

public class Vendedor extends Funcionario {
     
        private int totalItensVendidos;
        private int comissaoPorItem;
        
        public Vendedor(){
            super();
        }
        
        public float calcularSalario(){
            return super.getSalario()+(this.comissaoPorItem * totalItensVendidos);
        }

    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public int getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(int comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }  
}
