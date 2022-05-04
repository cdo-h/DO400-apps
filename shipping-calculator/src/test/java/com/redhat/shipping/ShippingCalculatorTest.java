package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    // @todo: add tests
    @Test
    public void canCalculateTheCostForARegion() {
	    ShippingCalculator calculator = new ShippingCalculator();

	    assertEquals(0, calculator.costForRegion("A Region"));
    }
    @Test
    public void onNAREgionTheCostIs100() {
	    //Given a shipping calculator
	    ShippingCalculator calculator = new ShippingCalculator();

	    //When NA is the country region
	    int calculatedCost = calculator.costForRegion("NA");

	    //Then the shipping cost is 100
	    assertEquals(100, calculatedCost);
    }
    @Test
    public void onLATAMRegionTheCOstIs200() {
	    //Given a shipping calculator
	    ShippingCalculator calculator = new ShippingCalculator();
	    //When LATAM is the country region
	    int calculatedCost = calculator.costForRegion("LATAM");
	    //Then the shipping cost is 200
	    assertEquals(200, calculatedCost);
    }
    @Test
    public void onEMEARegionTheCostIs300() {
	    //Given a shipping calc
	    ShippingCalculator calculator = new ShippingCalculator();
	    //When EMEA is country region
	    int calculatedCost = calculator.costForRegion("EMEA");
	    //Then the shipping cost is 300
	    assertEquals(300, calculatedCost);
}
@Test
public void onAPACRegionTheCostIs400() {
	//Given a shipping
	ShippingCalculator calculator = new ShippingCalculator();
	//When APAC
	int calculatedCost = calculator.costForRegion("APAC");
	//Then shipping 400
	assertEquals(400, calculatedCost);
}
}
