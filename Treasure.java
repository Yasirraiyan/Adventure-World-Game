 public class Tresure 
    {
    public int x;
    public int y;
    public int z;
    public boolean solve = false;
    public String challange;
    public String hindrence;
    public int score=0;
    public int life=5;
    

    
    public Tresure(int x, int y, int z, boolean solve, String challange,String hindrence) 
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.solve = solve;
        this.challange = challange;
        this.hindrence=hindrence;
    }
    public void checkwin(String challange,String hindrence)
    {
        if(challange=="solve"&&hindrence=="cross")
        {
            solve=true;
            System.out.println("Win");
            score=100;
        }
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
    public void getPositionIn2D(int x, int y) 
   { 
       String position; 
       if (x == 0 && y == 0) 
       { 
           position = "The position is at the origin (0,0)."; 
           
       } 
       else if (x > 0 && y > 0)
       {
           position = "The position is in the first quadrant."; 
           
       } 
       else if (x < 0 && y > 0) 
       {
           position = "The position is in the second quadrant."; 
           
       } 
       else if (x < 0 && y < 0) 
       { 
           position = "The position is in the third quadrant."; 
           
       } 
       else if (x > 0 && y < 0) 
       { 
           position = "The position is in the fourth quadrant."; 
           
       }
       else if (x == 0 && y > 0) 
       { 
           position = "The position is on the positive y-axis."; 
           
       } 
       else if (x == 0 && y < 0) 
       { 
           position = "The position is on the negative y-axis."; 
           
       } 
       else if (y == 0 && x > 0) 
       { 
           position = "The position is on the positive x-axis."; 
           
       } 
       else if (y == 0 && x < 0) 
       { 
           position = "The position is on the negative x-axis."; 
           
       } 
       else 
       { 
           position = "The position is somewhere in the 2D plane."; 
           
       } 
        System.out.println("The position is:"+(x,y)); 
       
   }
   public void getPositionIn3D(int x, int y, int z)
   {
    String position;

    if (x == 0 && y == 0 && z == 0) 
    {
        position = "The position is at the origin (0,0,0).";
    }
    else if (x > 0 && y > 0 && z > 0)
    {
        position = "The position is in the first octant.";
    } else if (x < 0 && y > 0 && z > 0) {
        position = "The position is in the second octant.";
    } 
    else if (x < 0 && y < 0 && z > 0)
    {
        position = "The position is in the third octant.";
    } 
    else if (x > 0 && y < 0 && z > 0)
    {
        position = "The position is in the fourth octant.";
    } 
    else if (x > 0 && y > 0 && z < 0) 
    {
        position = "The position is in the fifth octant.";
    } 
    else if (x < 0 && y > 0 && z < 0) 
    {
        position = "The position is in the sixth octant.";
    } 
    else if (x < 0 && y < 0 && z < 0) 
    {
        position = "The position is in the seventh octant.";
    }
    else if (x > 0 && y < 0 && z < 0)
    {
        position = "The position is in the eighth octant.";
    } 
    else if (x == 0 && y == 0)
    {
        position = "The position is on the z-axis.";
    }
    else if (x == 0 && z == 0) 
    {
        position = "The position is on the y-axis.";
    } else if (y == 0 && z == 0) {
        position = "The position is on the x-axis.";
    } 
    else if (x == 0 && y > 0 && z > 0) 
    {
        position = "The position is on the positive y-z plane.";
    }
    else if (x == 0 && y > 0 && z < 0)
    {
        position = "The position is on the positive y-negative z plane.";
    } 
    else if (x == 0 && y < 0 && z > 0) 
    {
        position = "The position is on the negative y-positive z plane.";
    } 
    else if (x == 0 && y < 0 && z < 0) 
    {
        position = "The position is on the negative y-z plane.";
    } 
    else if (y == 0 && x > 0 && z > 0) 
    {
        position = "The position is on the positive x-z plane.";
    }
    else if (y == 0 && x > 0 && z < 0) 
    {
        position = "The position is on the positive x-negative z plane.";
    } 
    else if (y == 0 && x < 0 && z > 0)
    {
        position = "The position is on the negative x-positive z plane.";
    } 
    else if (y == 0 && x < 0 && z < 0) 
    {
        position = "The position is on the negative x-z plane.";
    } 
    else if (z == 0 && x > 0 && y > 0) 
    {
        position = "The position is on the positive x-y plane.";
    } 
    else if (z == 0 && x > 0 && y < 0)
    {
        position = "The position is on the positive x-negative y plane.";
    }
    else if (z == 0 && x < 0 && y > 0)
    {
        position = "The position is on the negative x-positive y plane.";
    } 
    else if (z == 0 && x < 0 && y < 0)
    {
        position = "The position is on the negative x-y plane.";
    } 
    else 
    {
        position = "The position is somewhere in the 3D space.";
    }
    System.out.println(position);
}
