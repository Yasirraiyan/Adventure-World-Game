public class Hill
{
    public String challange;
    public String trunk;
    public boolean fallenbody=false;
    public String dangerzone;
    public int life=5;
    public int point=0;
    public int attempt=5;
    public boolean solve=false;
    
    public Hill(String challange,String trunk)
    {
        this.challange=challange;
        this.trunk=trunk;
    }
    public void solvechallange(boolean fallenbody,String trunk)
    {
        if(!fallenbody&&trunk=="yes")
        {
            dangerzone=="success";
            point++;
            attempt--;
            challange=="solve";
        }
         if(fallenbody&&trunk=="no")
        {
            dangerzone="fail";
            point--;
            attempt--;
            life=life/5;
            if(life==0||attempt==0)
            {
                System.out.println("Not solve challange");
            }
        }
    }
    public void getdoorcondition(boolean solve,String dangerzone)
    {
        if(!solve&&dangerzone=="cross")
        {
            System.out.println("Door opened.")
        }
        else
        {
             System.out.println("Door closed.")
        }
    }
