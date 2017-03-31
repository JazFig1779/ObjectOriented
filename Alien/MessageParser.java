public class MessageParser implements ICrypto
{
  private List<String> m_words;
  private String m_msg;

  public MessageParser(String msg)
  {
    m_msg = msg;
  }

  public int getCharCount()
  {
    int charCount = m_msg.length();
  }
  public int getWordCount()
  {
    int wordCount = 0;

   boolean word = false;
   int endOfLine = m_msg.length() - 1;

   for (int i = 0; i < m_msg.length(); i++) {
       // if the char is a letter, word = true.
       if (Character.isLetter(m_msg.charAt(i)) && i != endOfLine) {
           word = true;
       } else if (!Character.isLetter(m_msg.charAt(i)) && word) {
           wordCount++;
           word = false;
       } else if (Character.isLetter(m_msg.charAt(i)) && i == endOfLine) {
           wordCount++;
       }
   }
   return wordCount;
  }
  public char getChar(int i)
  {
    int count = 0;
    char c;
   for (int i=0; i < m_msg.length(); i++)
   {
       if (m_msg.charAt(i) == c)
       {
            count++;
       }
   }
   return count;

  public String getWord(int i)
  {
    m_msg.indexOf(String m_words);
  }
}
