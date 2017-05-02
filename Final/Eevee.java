import java.util.*;

public class Eevee extends GameObject
{

    private int m_hero = 0;
    private Random m_rand =  new Random();

  public Eevee(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Eevee.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {
    if(m_x > 350)
    {
       m_x = m_x - m_dX;
       m_y = m_y + m_dY;
    }
    else if(m_x < 50)
    {
      m_x = m_x + m_dX;
      m_y = m_y + m_dY;
    }
    else if(m_y < 50)
    {
      m_x = m_x + m_dX;
      m_y = m_y - m_dY;
    }
    else if(m_y > 250)
    {
        m_x = m_x - m_dX;
        m_y = m_y - m_dY;
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
