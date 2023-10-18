package U_EX_PR.Mid_Term_Exam_Preparation.Exam_Q;

class Date{
    private int dd,mm,yy;

    public Date(){
        dd=mm=yy = 0;
    }
    public Date(int dd, int mm, int yy){
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Check is it leap or not

    public boolean isleap(){
        if(yy % 4 == 0 ){
            return true;
        }
        else{
            return false;
        }
    }

    public void displayDate(){
        System.out.println("Date is Now: " + dd + "/" + mm + "/"+yy);
    }
}
public class long_Q_05{
    public static void main(String[] args){
        Date d = new Date(20, 04, 2020);
        System.out.println("Leap or Not: "+d.isleap());
        d.displayDate();
    }
}