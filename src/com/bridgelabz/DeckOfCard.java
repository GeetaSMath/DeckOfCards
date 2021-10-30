package com.bridgelabz;

public class DeckOfCard {
    private static int num;

    public static void main(String[] args){
    DistrubuteCards distrubuteCards = new DistrubuteCards();
    for (num=1;num<=4;num++)
    {
        distrubuteCards.DistrubuteCardsplayers(num);
        System.out.println("Players :"+num+ "cards:");
        distrubuteCards.showCards(num);

    }


}
}
