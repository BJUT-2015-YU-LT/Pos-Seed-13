package domains;

import java.util.ArrayList;

/**
 * Created by guolei on 2016/1/5.
 */
public class Pos {
    public Pos() {}

    public String getShoppingList(ShoppingListChart shoppingListChart) throws Exception{
        ArrayList<ListItem> listItems = shoppingListChart.getListItems();
        double totalMoney = 0;
        double totalSaveMoney = 0;

        for (int i = 0; i < listItems.size(); i++) {
            totalMoney += listItems.get(i).getSubTotal();
            totalSaveMoney += listItems.get(i).getSaveMoney();
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append("***商店购物清单***\n");
        for (int i = 0; i < listItems.size(); i++) {
            stringBuilder
                    .append("名称：").append(listItems.get(i).getName()).append("，");

            stringBuilder
                    .append("单价：").append(String.format("%.2f", listItems.get(i).getPrice()));

            stringBuilder
                    .append("(元)").append("，")
                    .append("小计：").append(String.format("%.2f", listItems.get(i).getSubTotal()))
                    .append("(元)").append("\n");
        }

        stringBuilder
                .append("----------------------\n")
                .append("总计：").append(String.format("%.2f", totalMoney)).append("(元)").append("\n");
        if(totalSaveMoney!=0) {
            stringBuilder.append("节省：").append(String.format("%.2f", totalSaveMoney)).append("(元)").append("\n");
        }
        stringBuilder.append("**********************\n");

        return stringBuilder.toString();
    }
}
