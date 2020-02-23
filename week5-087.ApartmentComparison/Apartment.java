
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    public boolean larger(Apartment otherApartment){
    if (this.pricePerSquareMeter < (otherApartment.pricePerSquareMeter)){
        return false;
    } else {
        return true;
        }
    }
    public int priceDifference(Apartment otherApartment){
    int price = this.squareMeters * this.pricePerSquareMeter;
    int price1 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
    if (price < price1){
        return price1 - price;
    } else {
        return price - price1;
        }
    }
    public boolean moreExpensiveThan(Apartment otherApartment){
    int price = this.squareMeters * this.pricePerSquareMeter;
    int price1 = otherApartment.pricePerSquareMeter * otherApartment.squareMeters;
    if (price < price1){
        return false;
    } else {
        return true;
        }
    }
}
