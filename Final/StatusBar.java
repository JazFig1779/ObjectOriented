import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

class StatusBar extends JPanel implements IGameView
{
  private JLabel m_status = new JLabel();
  List<IGameObject> m_objects;
  public StatusBar(List<IGameObject> objects)
  {
    m_objects = objects;
    setLayout(new BorderLayout());
    m_status.setText("");
    add(m_status, BorderLayout.CENTER);
  }

  @Override
  public void tick()
  {
    if (m_objects.size()> 1)
    {
      int count = 10;
      while(count !=0)
      {
        m_status.setText(String.format("X: %s Y:%s -- EX: %s EY: %s",
          m_objects.get(0).getX(), m_objects.get(0).getY(),
            m_objects.get(1).getX(), m_objects.get(1).getY()));
            count--;
        }
    }

  }

  @Override
  public JPanel getJPanel()
  {
    return this;
  }
}
