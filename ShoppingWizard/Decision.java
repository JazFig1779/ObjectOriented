public class Decision
{
  private String m_question;
  private IDecision m_yes;
  private IDecision m_no;
  private String m_yesTerminal;
  private String m_noTerminal;

  public Decision(String question, IDecision yes, IDecision no, String yesTerminal, String noTerminal)
  {
    m_question = question;
    m_yes = yes;
    m_no = no;
    m_yesTerminal = yesTerminal;
    m_noTerminal = noTerminal;
  }

  public void setYes(IDecision yes)
  {
    if(IDecision yes != null)
      return new Decision();
  }

  public void setNo(IDecision no);
  {
    if(IDecision no != null)
      return new Decision();
  }

  public void setYesTerminal(String terminal)
  {
    if( String yesTerminal == null && String noTerminal  == null)
      return new Decision();
  }

  public void setNoTerminal(String terminal)
  {
    if( String yesTerminal == null && String noTerminal  == null)
      return new Decision();
  }

  public IDecision ask()
  {
    // ask the user the current question...
    System.out.println(D);
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();

	// if the user answers yes
  if(input = "yes")
  {
    setYes();
  }
  else
  {
    setYesTerminal();
  }
	// and there is a decision object set for a yes answer
	// return the yes decision object
	// otherwise print the yes terminal string and return null

  if(input = "no")
  {
    setNo();
  }
  else
  {
    setNoTerminal();
  }
	// if the user answers no
	// and there is a decision object set for a no answer
	// return the no decision object
	// otherwise print the no terminal string and return null
  }
}
