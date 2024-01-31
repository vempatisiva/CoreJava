package functionalInterfacesTest;

import org.junit.Test;

import functionalInterfaces.Swap;

//import functionalInterfaces.Swap;
//import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void testSwapIntegers() {
        //Swap integerSwap = new Swap();

       
        Swap.swapIntegers( 4 ,5);
        System.out.println("\n");
        Swap.swapIntegers(-4,-5);
        System.out.println("\n");
        Swap.swapIntegers(45,54);
        System.out.println("\n");
        Swap.swapIntegers(-4,5);
        System.out.println("\n");
        Swap.swapIntegers(4,-5);
    }
}