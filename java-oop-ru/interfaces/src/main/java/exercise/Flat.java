package exercise;

// BEGIN
class Flat implements Home{
    double area;
    double balconyArea;
    int floor;

    Flat(double ar, double balArea, int fl){
        area = ar;
        balconyArea = balArea;
        floor = fl;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
        if (getArea() > another.getArea())
            return 1;
        else if (getArea() < another.getArea())
            return -1;
        return 0;
    }

    public String toString(){
        return "Квартира площадью " +  getArea() + " метров на " + floor + " этаже";
    }
}
// END
