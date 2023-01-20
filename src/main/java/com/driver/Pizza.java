package com.driver;

public class Pizza {
    int Non_veg=400;
    int Veg=300;
    int Extra_Cheese=80;
    int Extra_Topping=70;
    int Extra_Tro_nonVeg=120;
    int Pager_Bag=0;
    private int price;
    private Boolean isVeg;
    private String bill;
    boolean asked=false;
    boolean asked_top=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.bill="Base Price Of The Pizza: 300 \n";
            this.price+=Veg;
        }else{
            this.bill="Base Price Of The Pizza: 400 \n";
            this.price+=Non_veg;
        }
    }

    public int getPrice(){
      return this.price;
    }

    public void addExtraCheese(){
        if(asked_top==false){
            this.bill+="Extra Cheese Added: 80 \n";
            this.price+=Extra_Cheese;
            asked_top=true;
        }


    }

    public void addExtraToppings(){
        if(asked==false){
            if(isVeg==false){
                this.bill+="Extra Toppings For Non-veg Pizza = 120 \n";
                this.price+=120;
                asked=true;
                return;
            }
            this.bill+="Extra Toppings Added: 70 \n";
            this.price+=Extra_Topping;
            asked=true;
        }

    }


    public void addTakeaway(){
        // your code goes here
        Pager_Bag+=20;
        this.price+=Pager_Bag;
    }

    public String getBill(){
        if(Pager_Bag>20){
            this.bill+="Paperbag Added: "+Integer.toString(Pager_Bag)+"\n";
        }
        this.bill+="Total Price:"+" "+this.price;
        return this.bill;
    }
}
