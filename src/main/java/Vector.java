import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Vector {

    private double x1;  // Origine pe axa x
    private double y1;  // Origine pe axa y
    private double x2;  // Virful pe axa x
    private double y2;  // Virful pe axa y

    public double lengthV()
    {
        return Math.sqrt(Math.pow(getX2()-getX1(), 2)+Math.pow(getY2()-getY1(), 2));
    }

    public Vector minusVector(Vector vector1, Vector vector2) {
        double x2 = vector2.getX2()-vector2.getX1()+vector1.getX1();
        double y2 = vector2.getY2()-vector2.getY1()+vector1.getY1();
        double x1 = vector1.getX2();
        double y1 = vector1.getY2();
        Vector vector3 = new Vector(x1, y1, x2, y2);
        return vector3;
    }

    public Vector sumVector(Vector vector1, Vector vector2) {

        double x1 = vector1.getX2();
        double y1 = vector1.getY2();
        double x2 = vector2.getX2()-vector2.getX1()+vector1.getX2();
        double y2 = vector2.getY2() - vector2.getY1()+vector1.getY2();
        Vector vector3 = new Vector(x1, y1, x2, y2);
        return vector3;
    }

    public double degreesVector(Vector vector) {
        double degree = 0;
        if(vector.x1<vector.x2 && vector.y1<vector.y2){
            degree = degreesCalculation(vector.x1, vector.x2, vector.lengthV());

        }

        if(vector.x1 > vector.x2 && vector.y1<vector.y2){
            degree = 180 - degreesCalculation(vector.x1, vector.x2, vector.lengthV());
        }

        if(vector.x1>vector.x2 && vector.y1>vector.y2){
            degree = 180 + degreesCalculation(vector.x1, vector.x2, vector.lengthV());
        }
        if(vector.x1<vector.x2 && vector.y1>vector.y2){
            degree = 360 - degreesCalculation(vector.x1, vector.x2, vector.lengthV());
        }
        return degree;
    }

    private double degreesCalculation (double x1, double x2, double length) {
        double degrees = Math.toDegrees(Math.acos(Math.abs((x2-x1))/length));
        return  degrees;
    }
}
