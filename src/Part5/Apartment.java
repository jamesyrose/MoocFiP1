package Part5;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getRooms() {
    	return rooms;
    }
    
    public int getSquares() {
    	return squares;
    }
    
    public int getPricePerSquare() {
    	return pricePerSquare;
    }
   
    
    public boolean hasMoreRooms(Apartment apt) {
    	if (this.rooms > apt.getRooms()) {
    		return true; 
    	}else {
    		return false;
    	}
    }
    
    public boolean largerThan(Apartment apt) {
    	if (this.squares > apt.getSquares()) {
    		return true;
    	}else { 
    		return false;
    	}
    }
    
    public boolean lowerPricerPerSquare(Apartment apt) {
    	if (this.pricePerSquare < apt.getPricePerSquare()) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public int priceDifference(Apartment apt) {
    	int price = squares * pricePerSquare;
    	int priceCompare = apt.getPricePerSquare() * apt.getSquares();
    	int difference = price - priceCompare;
    	return Math.abs(difference);
    }
}