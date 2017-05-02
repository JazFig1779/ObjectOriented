import java.util.*;
import java.io.*;

public class Factory implements IFactory
{
  private static IFactory m_instance;
  public static IFactory getInstance()
  {
    if (m_instance == null)
      m_instance = new Factory();
    return m_instance;
  }
  private Factory() {}

  @Override
  public IGameObject createEnemy(int x, int y, int w, int h, int dX, int dY)
  {
  /*  IGameObject m = null;
    try
    {
      String enemy = "";
      Scanner f = new Scanner(new File("Enemy.txt"));
      if(f.hasNextLine())
        enemy = f.nextLine().trim();

      Class c1 = Class.forName(enemy);
      m = (IGameObject) c1.newInstance();
    }
    catch (Exception e)
    {
      throw new Error("Unable to get enemy.");
    }
    return m;*/
    return new Mewtwo(x, y, w, h, dX, dY);
  }

  @Override
  public IGameObject createHero(int x, int y, int w, int h, int dX, int dY)
  {
    /*IGameObject h = null;
    try
    {
      String hero = "";
      Scanner p = new Scanner(new File("Hero.txt"));
      if(p.hasNextLine())
        hero = p.nextLine().trim();
      Class c2 = Class.forName(hero);
      h = (IGameObject)c2.newInstance();
    }
    catch (Exception e)
    {
      throw new Error("Unable to get hero.");
    }  */
    //return h;
    //return new Hero(x, y, w, h, dX, dY);
    return new Eevee(x, y, w, h, dX, dY);
  }

  @Override
  public IGameView createMainView(List<IGameObject> objects)
  {
    return new GameView(objects);
  }

  @Override
  public IGameView createStatusView(List<IGameObject> objects)
  {
    return new StatusBar(objects);
  }

  @Override
  public IGameController createController(int interval, List<IGameObject> objects, List<IGameView> views)
  {
    return new GameController(interval, objects, views);
  }
}
