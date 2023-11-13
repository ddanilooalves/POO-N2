/*04 - Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de
informática para representar uma fatura de um item vendido na loja. Uma fatura deve
incluir as seguintes informações como atributos:*/

package Exercício04;

public class Invoice {
    private String numItem;
    private String descItem;
    private int qnt;
    private double pcUnitario;

    public Invoice(String numItem, String descItem, int qnt, double pcUnitario) {
        this.numItem = numItem;
        this.descItem = descItem;
        this.qnt = qnt > 0 ? qnt : 0;
        this.pcUnitario = pcUnitario > 0.0 ? pcUnitario : 0.0;
    }

    public String getNumItem() {
        return numItem;
    }

    public void setNumItem(String numItem) {
        this.numItem = numItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt > 0 ? qnt : 0;
    }

    public double getPcUnitario() {
        return pcUnitario;
    }

    public void setPcUnitario(double pcUnitario) {
        this.pcUnitario = pcUnitario > 0.0 ? pcUnitario : 0.0;
    }

    public double getInvoiceAmount() {
        return qnt * pcUnitario;
    }
}
