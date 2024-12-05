public class Player
{
    public String type;
    public int life;
    public boolean attack = false;
    public int x;
    public int y;
    public int z;
    public int point = 0;
    public int rank;
    public Player(String type, int life, boolean attack, int x, int y, int z, int point,int rank) 
    {
        this.type = type;
        this.life = life;
        this.attack = attack;
        this.x = x;
        this.y = y;
        this.z = z;
        this.point = point;
        this.rank=rank;
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
public void getcondition(boolean attack,int life)
{
    while(!attack)
    {
        life=life/5;
        point+=5;
        System.out.println("The present life is:"+life."The present point is:"+point);
    }
    if(life==0)
    {
        System.out.println("Player expired!");
    }
}
public String getTypeOfSoldier(int life, int rank) 
{
    String type;

    if (life > 90 && rank >= 10) 
    {
        type = "General";
        System.out.println("Life: " + life + ", Rank: " + rank + " => General");
        return type;
    } else if (life > 80 && rank >= 9) {
        type = "Colonel";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Colonel);
        return type;
    }
    else if (life > 70 && rank >= 8)
    {
        type = "Lieutenant Colonel";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Lieutenant Colonel");
        return type;
    } 
    else if (life > 60 && rank >= 7)
    {
        type = "Major";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Major");
        return type;
    } else if (life > 50 && rank >= 6) {
        type = "Captain";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Captain");
        return type;
    } 
    else if (life > 40 && rank >= 5) 
    {
        type = "First Lieutenant";
        System.out.println("Life: " + life + ", Rank: " + rank + " => First Lieutenant");
        return type;
    }
    else if (life > 30 && rank >= 4)
    {
        type = "Second Lieutenant";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Second Lieutenant");
        return type;
    } 
    else if (life > 20 && rank >= 3) 
    {
        type = "Sergeant";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Sergeant");
        return type;
    }
    else if (life > 10 && rank >= 2) 
    {
        type = "Corporal";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Corporal");
        return type;
    } else
    {
        type = "Private";
        System.out.println("Life: " + life + ", Rank: " + rank + " => Private");
        return type;
    }
}

}
}
