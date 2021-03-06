package com.ncst.itertor.d;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Date 2020/8/10 16:27
 * @Author by LiShiYan
 * @Descaption 煎饼屋菜单
 */
public class PancakeMenu implements Menu {
    private ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();
        addItem("薯片","香喷喷",false,8);
        addItem("煎饼","香喷喷",true,10);
        addItem("豆浆","香喷喷",false,3);
        addItem("油条","好吃",false,2);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }

}
