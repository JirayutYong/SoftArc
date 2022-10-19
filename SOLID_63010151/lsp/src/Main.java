public class Main {

    private static final int width = 4;
    private static final int height = 5;

    public static void main(String[] args) {
        //call Shape class instead Rectangle class
        Shape reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + reg1.getArea());

        Shape reg2 = new Square(width);
        //set width to square Area 
        System.out.println("====   Square  ====");
        System.out.println("Width = " + width);
        System.out.println("Area = " + reg2.getArea());
        
        reg2.setHeight(height);
        //set height to square Area 
        System.out.println("height = " + height);
        System.out.println("Area = " + reg2.getArea());
    }
}
