/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author lucas.budelon
 */
public class SaleItem {

    public Product Product;
    public int Quantity;

    public SaleItem() {
    }

    public SaleItem(Product Product, int Quantity) {
        this.Product = Product;
        this.Quantity = Quantity;
    }
}