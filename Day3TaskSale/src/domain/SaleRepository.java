package domain;

public interface SaleRepository {
	
	public Sale findByNumber(int number);
	public void save(Sale sale);

}
