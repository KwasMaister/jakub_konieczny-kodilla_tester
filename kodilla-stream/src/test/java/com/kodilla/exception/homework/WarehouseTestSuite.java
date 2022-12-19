package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrderExist() throws OrderDoesntExistException {
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("FirstOreder123"));
        //when
        Order isFirstOreder123 = warehouse.getOrder("FirstOreder123");
        //then
        assertNotNull(isFirstOreder123);
    }

    @Test
    public void testGetOrderDoesntExist() {
    //given
        Warehouse warehouse = new Warehouse();
   //when and then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("xyz"));

    }
}