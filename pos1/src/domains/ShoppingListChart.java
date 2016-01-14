package domains;

import java.util.ArrayList;

/**
 * Created by guolei on 2016/1/5.
 */
public class ShoppingListChart {
    private ArrayList<ListItem> listItems=new ArrayList<ListItem>();

    public  ShoppingListChart(){}

    public ShoppingListChart(ShoppingChart shoppingChart){
        ArrayList<Item> items=shoppingChart.getItems();

        for(int i=0;i<items.size();i++)
        {
            Item item=items.get(i);

            if(!this.hasThisProduct(item.getBarCode()))
            {
                ListItem listItem=new ListItem(item);
                listItems.add(listItem);
            }
            else
            {
                for(int j=0;j<listItems.size();j++)
                {
                    if(listItems.get(j).getBarCode().equals(item.getBarCode()))
                    {
                        listItems.get(j).create();
                    }
                }
            }
        }

    }


    public boolean hasThisProduct(String barCode)
    {
        for(int i=0;i<listItems.size();i++)
        {
            ListItem listItem=listItems.get(i);
            if(listItem.getBarCode().equals(barCode))
            {
                return true;
            }
        }
        return false;
    }

    public ArrayList<ListItem> getListItems() {
        return listItems;
    }

}
