import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PokerShuffleCards {
    public static void main(String[] args) {
        ArrayList<String> color =new ArrayList<String>();
        color.add("♠");
        color.add("♥");
        color.add("◆");
        color.add("♣");
        ArrayList<String> number =new ArrayList<String>();
        for (int i=3;i<=10;i++){
            number.add(i+"");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        number.add("A");
        number.add("2");
        HashMap<Integer,String>map=new HashMap<Integer,String>();
        int index=0;
        for (String thisNumber:number){
            for (String thisColor:color) {
                map.put(index++, thisColor + thisNumber);
            }
        }
        map.put(index++,"小王");
        map.put(index++,"大王");
        ArrayList<Integer> cards =new ArrayList<Integer>();
        for (int i=0;i<=53;i++){
            cards.add(i);
        }
        Collections.shuffle(cards);
        ArrayList<Integer> iPlayer =new ArrayList<Integer>();
        ArrayList<Integer> iPlayer2 =new ArrayList<Integer>();
        ArrayList<Integer> iPlayer3 =new ArrayList<Integer>();
        ArrayList<Integer> iSecretCards =new ArrayList<Integer>();
        for (int i=0;i<cards.size();i++) {
            if (i>=51){
                iSecretCards.add(cards.get(i));

            }else if (i%3==0){
                    iPlayer.add(cards.get(i));
             }else if (i%3==1){
                    iPlayer2.add(cards.get(i));
              }else{
                    iPlayer3.add(cards.get(i));
               }
            }
        Collections.sort(iPlayer);
        Collections.sort(iPlayer2);
        Collections.sort(iPlayer3);
        ArrayList<String> sPlayer =new ArrayList<String>();
        ArrayList<String> sPlayer2 =new ArrayList<String>();
        ArrayList<String> sPlayer3 =new ArrayList<String>();
        ArrayList<String> sSecretCards =new ArrayList<String>();
        for (Integer key:iPlayer){
            sPlayer.add(map.get(key));
        }
        for (Integer key:iPlayer2){
            sPlayer2.add(map.get(key));
        }
        for (Integer key:iPlayer3){
            sPlayer3.add(map.get(key));
        }
        for (Integer key:iPlayer){
            sSecretCards.add(map.get(key));
        }
        System.out.println("玩家1："+sPlayer);
        System.out.println("玩家2："+sPlayer2);
        System.out.println("玩家3："+sPlayer3);
        System.out.println("底牌："+sSecretCards);
    }
}
