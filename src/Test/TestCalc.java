package Test;
import org.junit.Test;
import org.junit.Assert;
import yura.Calc;

public class TestCalc {

	@Test
	public void test() {
		Calc k = new Calc();
		float A=k.Result(20000,20,22,2000);
		if(A!=24000.0)Assert.fail();
	}

}
