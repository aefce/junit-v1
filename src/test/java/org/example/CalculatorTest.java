package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
class CalculatorTest {
    @Test
    @DisplayName("測試加法功能")
    void testAddition() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act
        int result = calculator.add(2, 3);
        // Assert
        assertEquals(5, result, "2 + 3 應該要等於 5");
    }
    @Test
    @DisplayName("測試減法功能")
    void testSubtraction(){
        //Arrange
        Calculator calculator = new Calculator();
        //Act&Assert
        assertEquals(2,calculator.subtract(5,3), "5 - 3 應該要等於 2");
        assertEquals(-5,calculator.subtract(5,10),"5 - 10 應該等於 -5");
        assertEquals(15,calculator.subtract(5,-10),"5 - (-10) 應該等於 15");
    }
    @Test
    @DisplayName("測試圓面積計算")
    void testCircleArea() {
        // Arrange
        Calculator calculator = new Calculator();
        //Art&Assert
        assertEquals(314.159, calculator.circleArea(10.0), 0.001);
    }
    @Test
    @DisplayName("測試圓面積計算，半徑為0")
    void testCircleArea_radiusZero() {
        // Arrange
        Calculator calculator = new Calculator();
        // Act & Assert
        assertEquals(0.0, calculator.circleArea(0.0), 0.001);
    }
    @Test
    @DisplayName("測試負數半徑應拋出例外")
    void testCircleArea_throwExcptionForNegativeRadius(){
        //Arrange
        Calculator calculator = new Calculator();
        //Act & Assert
        assertThrows(IllegalArgumentException.class,() ->{
            calculator.circleArea(-5.0);
        });
    }
}