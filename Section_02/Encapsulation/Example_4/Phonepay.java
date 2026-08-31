package Encapsulation.Example_4;

/**
 * InnerPhonepay
 */
 class InnerPhonepay {
   private long phonNo;
   private String upiId;
   private String password;
   private int noOfTran;


   public long getPhonNo() {
    return phonNo;
   }
   public void setPhonNo(long phonNo) {
    this.phonNo = phonNo;
   }
   public String getUpiId() {
    return upiId;
   }
   public void setUpiId(String upiId) {
    this.upiId = upiId;
   }
   public String getPassword() {
    return password;
   }
   public void setPassword(String password) {
    this.password = password;
   }
   public int getNoOfTran() {
    return noOfTran;
   }
   public void setNoOfTran(int noOfTran) {
    this.noOfTran = noOfTran;
   }
}


public class Phonepay {
    public static void main(String[] args) {
     InnerPhonepay s = new InnerPhonepay();
     s.setUpiId("sanvith@sbi");
     s.setPhonNo(6360809969l);
     s.setPassword("Rex@2005");
     s.setNoOfTran(20);
     
     System.out.println("user phone no is :"+s.getPhonNo());
     System.out.println("user upi id is :"+s.getUpiId());
     System.out.println("the password of the user is :"+s.getPassword());
     System.out.println("the number of treanscrion is :"+s.getNoOfTran());
    }
}
