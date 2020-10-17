import com.company.Bilet;

import java.util.Random;
public class Loterie
{
  private  int nrBile=6;
  private int[] extrase = new int[6];
  private Random aleator=new Random();

  public Loterie()
  {

  }

  public void nrCastigatoare()
  {
      for(int i=0; i<nrBile;i++) {
          int val = aleator.nextInt(50);
          extrase[i]=val;
      }
  }

  public int[] getExtrase(){
      return extrase;
  }

    public static void main(String args[])
    {
        Bilet tichet = new Bilet();
        tichet.citireNr();
        int [] alese= tichet.getNumere();
        for(int i=0;i<6;i++)
        {
            System.out.println(alese[i]);
        }
        Loterie lot=new Loterie();
        lot.nrCastigatoare();
        int []bileVictorie= lot.getExtrase();
        boolean win=true;
        for(int i=0;i<6;i++)
        {
            if(bileVictorie[i]!=alese[i])
            {
                win=false;
            }
        }
        if(win)
        {
            System.out.println("Ura am castigat!");
        }
        else{
            System.out.println("Offf viata mea");
        }
    }
}
