package user;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mochan
 */
public class CarLoanData {

    int carprice;
    int loanlen;
    double expreturn;
    double monpay;

    public int getCarprice() {
        return carprice;
    }

    public int getLoanlen() {
        return loanlen;
    }

    public double getExpreturn() {
        return expreturn;
    }

    public void setCarprice(int carprice) {
        this.carprice = carprice;
    }

    public void setLoanlen(int loanlen) {
        this.loanlen = loanlen;
    }

    public void setExpreturn(double expreturn) {
        this.expreturn = expreturn;
    }

    public double getMonthlyPayment()
    {
        monpay =  (double)carprice / (double)loanlen;
        return monpay;
    }
    public double compoundInterest()
    {
        double compound = carprice - monpay;
        double compound2 = 0;
        for(int i = 0; i<loanlen/12; i++)
        {
            for(int x = 0; x< 12; x++)
            {
                compound2 = compound*(1+(expreturn/100));
            }
            System.out.println("year "+i+": "+ compound);
            
        }
        return compound2;
    }
}