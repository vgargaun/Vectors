import lombok.extern.java.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class WorkVector {
    public static Logger logger = Logger.getLogger(WorkVector.class);
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");

        Vector vector1 = new Vector(0,0, -4, -5);
        Vector vector2 = new Vector(6,1, 8, 6);


        Vector minusVec = vector1.minusVector(vector1,vector2);

        logger.info("Minus Vector");
        logger.info("(x1, y1) = ("+minusVec.getX1()+", "+minusVec.getY1()+")");
        logger.info("(x2, y2) = ("+minusVec.getX2()+", "+minusVec.getY2()+")");

        Vector sumVec = vector1.sumVector(vector1,vector2);
        logger.info("Sum Vector");
        logger.info("(x1, y1) = ("+sumVec.getX1()+", "+sumVec.getY1()+")");
        logger.info("(x2, y2) = ("+sumVec.getX2()+", "+sumVec.getY2()+")");

        logger.info("modul vector 1 = "+vector1.lengthV());
        logger.info("modul vector 2 = "+vector2.lengthV());

        logger.info("degrees = " + vector1.degreesVector(vector1));
        



    }
}
