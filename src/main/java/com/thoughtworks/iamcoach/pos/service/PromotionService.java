package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.model.CartItem;
import com.thoughtworks.iamcoach.pos.model.Promotion;

import java.util.Arrays;
import java.util.List;

public class PromotionService {

    private PromotionDao promotionDao = new PromotionDao();

    public double calculateMoney(CartItem cartItem) {

        List<Promotion> list = cartItem.getProduct().getPromotions();
        double result = cartItem.getProduct().getPrice() * cartItem.getCount();
        double money[] = new double[list.size()];
        Promotion promotion;

        for (int i = 0; i < list.size(); i++) {
            promotion = list.get(i);
            double subTotal = promotion.getMoney(cartItem);
            money[i] = subTotal;
        }
        Arrays.sort(money);

        return money.length == 0 ? result : money[0];
    }


    public int getDiscount(int id){

        try {
            return promotionDao.getDiscount(id);
        } catch (Exception e) {
            return 100;
        }
    }
}
