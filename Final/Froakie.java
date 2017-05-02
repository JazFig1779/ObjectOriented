import java.util.*;

public class Froakie extends GameObject
{

    private int m_hero = 0;
    private Random m_rand =  new Random();

  public Froakie(int x, int y, int w, int h, int dX, int dY)
  {
    super("./froakie.jpg", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    m_hero++;
     if(m_hero % 20 == 0)
     {
       m_x = m_rand.nextInt(maxw);
       m_y = m_rand.nextInt(maxh);
     }

  }

  @Override
    public void keyPressed(char c)
    {
      if(c == 'a')
      {
        m_y = 0;
        m_x = -2;
      }
      if(c == 's')
      {
        m_y = 0;
        m_x = 2;
      }
      if(c == 'w')
      {
        m_y = 2;
        m_x = 0;
      }
      if(c == 'z')
      {
        m_y = -2;
        m_x = 0;
      }

    }

}
