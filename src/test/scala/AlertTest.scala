import org.scalatest.FunSuite
import com.dataops.functions.alert.{detect_overheat}

class AlertTest extends  FunSuite {
  test("detect_overheat should be true"){
    assert(detect_overheat())
  }
}
