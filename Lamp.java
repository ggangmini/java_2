public class Lamp {

   private boolean isOn;

   public Lamp() {
       isOn = false;
   }

   public void trunOn(){
       isOn = true;
   }
   public void trunOff(){
       isOn = false;
   }

   public void printStatus(){
       if(this.isOn == true){
           System.out.println("램프카 켜져 있습니다");
       }
       else{
           System.out.println("램프카 꺼져 있습니다");
       }
//       System.out.println("현재 상태 : " +this.isOn);
   }
}
