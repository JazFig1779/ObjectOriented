import java.io.*;

public class HomeRunTextRpt
{
  protected String m_dataFile;
  protected String m_reportFile;

  public HomeRunTextRpt(String dataFile, String reportFile)
  {
    dataFile = m_dataFile;
    reportFile = m_reportFile;
  }

  public List<DataPair> loadData()
  {
    File f = new File("players.txt");
    for (String s : files)
    {
      BufferedReader in = new BufferedReader(new FileReader("./files/"+s));
      String line = in.readLine();
  }

  public void generateReport(List<DataPair> data)
  {

  }
 }
