package Main;

public class Amount {
    private  String currency;
    private  int amount;

    public Amount(String currency , int amount ) {
        this.currency=currency;
        this.amount=amount ;

    }
    public String toString(){
        return amount + " " + currency;
    }

    public void add (Amount other){
        if (!this.currency.equals(other.currency)){
            throw  new RuntimeException("CurrencyNotEqual");
        }

        this.amount=this.amount+ other.amount;
    }
}




class ExceptionRunner{
    public static void main(String[] args) {
        Amount amount1 =new Amount("USD" , 10);
        Amount amount2 =new Amount("USD", 20);
        Amount amount3 =new Amount("EUR",20);

        amount1.add(amount2);
        System.out.println(amount1);


        amount1.add(amount3);
        System.out.println(amount1);

    }


}


/*Home work :
Implement Throwing a Custom Exception - CurrenciesDoNotMatchException

Solution :
public void add1 (Amount other) throws Exception {
       if (!this.currency.equals(other.currency))
       {
           throw new Exception("CurrencyDo not match ");
       }
       this.amount=this.amount+other.amount;
   }

}


 */

