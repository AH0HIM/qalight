package qalight.classWork;

import org.junit.Assert;

public class MainClass{
    public static void main(String[] args){
        Methods methods = new Methods();
        Assert.assertFalse("Not false", methods.isTriangle(5, 8, 3));
        Assert.assertTrue("Not true", methods.isTriangle(5, 8, 6));
        Assert.assertEquals("Expected doesn't equal actual",
                120, methods.factorial(5));
        //Assert.assertNotEquals("Expected doesn't equal actual", 120, methods.factorial(5));

        Assert.assertEquals("Is not equal",-1, methods.sqrSixAngles(0),  0.01);

        //arrayMethods arrayMethods = new arrayMethods();
        //Cat cat1 = new Cat();
        //Cat cat2 = new Cat("Matroskin", 5, "Black");

        //methods.divide(10,0);

        //cat1.setName("Barsik");
        //cat1.setAge(6);
        //cat1.setColor("White");

        //System.out.println(cat1.getColor());

        // int b = 5;
        // double c = 1.5;
        // int [] arr1 = {6, 8, 9, 12, 66, 10, -55, 98, 76};

        // System.out.println(methods.factorial(b));
        // System.out.println(methods.sqrSixangles(5));
        // System.out.println(methods.triangleSquare(c,c,c));
        // methods.prnString("hello",b);
        // methods.isNumberEquals(769);
        // methods.printTriangle(5);
        // System.out.println("Summ elements : " + arrayMethods.summKrr(int arr1));
        // arrayMethods.indexOffElements(arr1);
        // System.out.println();
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(Arrays.toString(arrayMethods.replaceElements(arr1));
    }
}

