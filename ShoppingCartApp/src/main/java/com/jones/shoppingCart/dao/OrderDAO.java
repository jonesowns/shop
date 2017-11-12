package com.jones.shoppingCart.dao;

import java.util.List;

import com.jones.shoppingCart.model.CartInfo;
import com.jones.shoppingCart.model.OrderDetailInfo;
import com.jones.shoppingCart.model.OrderInfo;
import com.jones.shoppingCart.model.PaginationResult;
 
public interface OrderDAO {
 
    public void saveOrder(CartInfo cartInfo);
 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
 
}