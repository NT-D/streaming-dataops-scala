import com.dataops.functions.alert.{detect_overheat}

object Main {
  def main(args : Array[String]): Unit ={
    if(detect_overheat()) println("hello")
  }
}