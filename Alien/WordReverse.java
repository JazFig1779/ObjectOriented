public class WordReverse implements ICrypto
{
  private static WordReverse m_instance;

  private WordReverse(){}

  public static ICrypto getInstance(){
    return (m_instance == null) ? new WordReverse() : m_instance;

  //put into array and then switch into queue

    String[] arr = m_msg.split(" ");
    IQueue<String> q = new QueueLL<String>();
    for (String l : arr)
      q.enqueue(l);
      System.out.printf("%s%n", q);

  
}
