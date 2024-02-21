@IsTest
private class CircleTest {

    @IsTest
    private static void testCalculateArea() {
        Decimal radius = 5;
        Decimal expectedArea = Math.PI * radius * radius;

        Decimal actualArea = Circle.calculateArea(radius);

        Assert.areEqual(expectedArea, actualArea, 'The calculated area was not as expected.');
    }
}
