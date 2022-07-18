public class area_circle {
    public static void main(String[] args){
        final float PI = 3.14f;
        float radius = 1;
        float area;

        if(radius >= 0) {
            area = radius*radius*PI;
            System.out.println("The area for the circle of radius " +
                    radius+ " is " + area);
        }
        else {
            System.out.println("Negative input");
        }
    }
}
