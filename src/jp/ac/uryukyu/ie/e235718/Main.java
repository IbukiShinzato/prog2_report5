package jp.ac.uryukyu.ie.e235718;

public class Main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException n){
            System.out.println("エラー: NullPointException");
            System.out.println(n.getMessage());
        }
    }
}
