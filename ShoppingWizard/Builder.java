import java.util.*;

public class Builder
{
  private static Builder m_instance;

	private Builder(){}

	public static Builder getInstance(){
		if (m_instance == null)
      m_instance = new Builder();
      return m_instance;

	}
//  public Decision(String question, IDecision yes, IDecision no, String yesTerminal, String noTerminal)
	@Override
	public Decision buildwizard(){
	   Decision D = new Decision("Do you want to buy a snowboard?", D1, D2, null, null);
     Decision D1 = new Decision("Have you snowboarded?", D3, null, null, T);
     Decision  D3 = new Decision("Are you an expert?", D4, null, null, T1);
     Decision  D4 = new Decision("Do you like to go fast?", null, null, T2, T1);
     Decision  D2 = new Decision("Do you want to buy downhill skis?", D5, null, null, T3);
     Decision  D5 = new Decision("Have you gone skiing before?", D6, null, null, T4);
     Decision  D6 = new Decision("Are you an expert?", D7, null, null, T5);
     Decision  D7 = new Decision("Do you like to jump?", null, null, T6, T5);
     Decision T = new Decision("Buy the XG100 model", null, null, null, null);
     Decision T1 = new Decision("Buy the XG200 model", null, null, null, null);
     Decision T2 = new Decision("Buy the XG300 model", null, null, null, null);
     Decision T3 = new Decision("Recommend they try skiing someday", null, null, null, null);
     Decision T4 = new Decision("Buy the ZR100 model", null, null, null, null);
     Decision T5 = new Decision("Buy the ZR200 model", null, null, null, null);
     Decision T6 = new Decision("Buy the ZR300 model", null, null, null, null);
	}
}
