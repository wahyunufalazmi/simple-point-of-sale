package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain.CashPayment;
import domain.Cashier;
import domain.Item;
import domain.QrisPayment;
import domain.Sale;
import domain.SaleItem;
import domain.SaleRepository;
import domain.SaleRepositoryDummy;

public class SaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalPrice = 0;
		
		Cashier cashier = new Cashier("nufal");
		
		Item item1 = new Item("123",50,"tshirt","chlotes",true);
		Item item2 = new Item("124",100,"novel","book",false);
		
		SaleItem saleitem = new SaleItem();
		
		Sale sale = new Sale();
		sale.setSaleNumber(1);
		sale.addItem(3, item1);
		sale.addItem(3, item2);
		
		System.out.println("cashier: "+cashier.getName());
		System.out.println("sale number: "+sale.getSaleNumber());
		System.out.println(sale.getTransDate());
		System.out.println("--------------------------------------------------------------------------------------------------------");
		for(Item i : sale.getItem()) {
			if(i != null) {
				if(i.isTaxable() == true) {
					
				System.out.println("code: "+i.getCode()+", price: "+i.getPrice()+", description: "+i.getDescription()+", type: "+i.getType()+
				", quantity: "+sale.getQuantity()+", total price: "+saleitem.totalPrice(sale.getQuantity(), i.getPrice())+", taxable");
				totalPrice = totalPrice + saleitem.totalPrice(sale.getQuantity(), i.getPrice());
				System.out.println("tax nominal (10%): "+sale.taxNominal(totalPrice));
				System.out.println("price after tax: "+sale.afterTax(totalPrice, sale.taxNominal(totalPrice)));
				System.out.println("");
				totalPrice = sale.afterTax(totalPrice, sale.taxNominal(totalPrice));
				}else {
					
				System.out.println("code: "+i.getCode()+", price: "+i.getPrice()+", description: "+i.getDescription()+", type: "+i.getType()+
				", quantity: "+sale.getQuantity()+", total price: "+saleitem.totalPrice(sale.getQuantity(), i.getPrice())+", not taxable");
				totalPrice = totalPrice + saleitem.totalPrice(sale.getQuantity(), i.getPrice());
				}
			}
		}
		System.out.println("--------------------------------------------------------------------------------------------------------");
		System.out.println("total price: "+totalPrice);
		CashPayment cashpayment = new CashPayment(totalPrice, 500);
		System.out.println("cash: "+cashpayment.getCash());
		System.out.println("change: "+cashpayment.Change());
		System.out.println(cashpayment.Validate());
		
		SaleRepository sr = new SaleRepositoryDummy();
		sr.save(sale);
	}

}
