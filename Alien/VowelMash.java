public class VowelMash implements ICrypto
{
  private static VowelMash m_instance;

  private VowelMash(){}

  public static ICrypto getInstance(){
    return (m_instance == null) ? new VowelMash() : m_instance;
  //singleton
  //read in file
  	//A->E, E->I, I->O, O->U, U->A
}
