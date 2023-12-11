package domain;

public class SaleRepositoryDummy implements SaleRepository{

	@Override
	public Sale findByNumber(int number) {
		// TODO Auto-generated method stub
		
		Sale sale = new Sale();
		sale.setSaleNumber(number);
		return sale;
	}
	
	

	@Override
	public void save(Sale sale) {
		// TODO Auto-generated method stub
		System.out.println("Sale is successfully saved");
		
	}

}
