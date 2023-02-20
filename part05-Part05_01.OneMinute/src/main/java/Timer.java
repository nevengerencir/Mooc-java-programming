import java.time.Clock;

public class Timer {
 ClockHand seconds;
 ClockHand hundreds;

 public Timer(){
     this.seconds = new ClockHand(60);
     this.hundreds = new ClockHand(100);
 }


    public String toString(){
        return seconds.value() + ":" + hundreds.value();
 }
 public void advance (){
     this.hundreds.advance();
     if(this.hundreds.value() <= 0){
         this.seconds.advance();
     }
 }
}
