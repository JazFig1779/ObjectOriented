public class Lucario extends GameObject
{
  public Lucario(int x, int y, int w, int h, int dX, int dY)
  {
    super("./Lucario.png", x, y, w, h, dX, dY);
  }

  @Override
  public void tick(int maxw, int maxh)
  {

     if(m_x > 400)
     {
        m_x = 0; //This loop works as expected
     }

     if(m_y > 300)
     {
         m_y = 0; //This loop works as expected
     }

    m_x = m_x + m_dX;
    m_y = m_y + m_dY;

  }

}
