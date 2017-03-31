public class Factory
{
  public IMessageParser createParser(String text);

  private static Factory m_instance;

  private Factory(){}

  public static Factory getInstance(){
    return (m_instance == null) ? new Factory() : m_instance;
}
