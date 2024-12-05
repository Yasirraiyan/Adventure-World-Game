public class Main 
{
    public static void main(String[] args) 
    {
        
        Player player1 = new Player("Warrior", 100, false, 0, 0, 0, 0, 5);
        Player player2 = new Player("Mage", 80, true, 1, 2, 3, 10, 7);
        Player player3 = new Player("Rogue", 60, false, -1, 2, 3, 15, 8);
        Player player4 = new Player("Paladin", 90, true, 4, 5, 6, 20, 10);
        Player player5 = new Player("Cleric", 70, false, 7, 8, 9, 25, 6);
        Player player6 = new Player("Druid", 85, true, -4, -5, -6, 30, 9);
        Player player7 = new Player("Hunter", 65, false, 10, -10, 10, 35, 4);
        Player player8 = new Player("Monk", 50, true, -7, 8, -9, 40, 3);
        Player player9 = new Player("Bard", 95, false, 1, -1, -1, 45, 2);
        Player player10 = new Player("Knight", 40, true, -2, -3, -4, 50, 1);

       
        Player[] players = {player1, player2, player3, player4, player5, player6, player7, player8, player9, player10};

        for (Player player : players) 
        {
            // Get position in 2D
            player.getPositionIn2D(player.x, player.y);

            // Get position in 3D
            player.getPositionIn3D(player.x, player.y, player.z);

            // Get condition
            player.getcondition(player.attack, player.life);

            // Get type of soldier
            String soldierType = player.getTypeOfSoldier(player.life, player.rank);
            System.out.println("Soldier Type for " + player.type + ": " + soldierType);
        }
        River river1 = new River("Amazon", "Strong currents and hidden rocks", true); River river2 = new River("Nile", "Crocodiles and whirlpools", false); River river3 = new River("Mississippi", "Debris and strong winds", true); River river4 = new River("Ganges", "Pollution and strong undertow", false); River river5 = new River("Danube", "Ice blocks and fog", true); River river6 = new River("Volga", "Dense vegetation and murky waters", false); River river7 = new River("Yangtze", "Steep banks and fast currents", true); River river8 = new River("Rhine", "Industrial waste and strong eddies", false); River river9 = new River("Mekong", "Sharp rocks and high tides", true); River river10 = new River("Thames", "Bridge construction and frequent floods", false);
          river1.describeRiver(); 
          river1.navigateRiver();
          System.out.println(); 
          river2.describeRiver(); 
          river2.navigateRiver(); 
          System.out.println(); 
          river3.describeRiver(); 
          river3.navigateRiver(); 
          System.out.println(); 
          river4.describeRiver(); 
          river4.navigateRiver(); 
          System.out.println(); 
          river5.describeRiver(); 
          river5.navigateRiver(); 
          System.out.println();
          river6.describeRiver(); 
          river6.navigateRiver();
          System.out.println(); 
          river7.describeRiver(); 
          river7.navigateRiver();
          System.out.println(); 
          river8.describeRiver(); 
          river8.navigateRiver(); 
          System.out.println(); /
          river9.describeRiver();
          river9.navigateRiver(); 
          System.out.println(); 
          river10.describeRiver();
          river10.navigateRiver();
          System.out.println();
          Hill hill1 = new Hill("Rock Slide", "yes");
          Hill hill2 = new Hill("Steep Climb", "no");
          Hill hill3 = new Hill("Avalanche", "yes"); 
          Hill hill4 = new Hill("Forest Path", "no"); 
          Hill hill5 = new Hill("Rough Terrain", "yes");
          Hill hill6 = new Hill("Icy Slope", "no");
          Hill hill7 = new Hill("Muddy Path", "yes");
          Hill hill8 = new Hill("Narrow Ridge", "no"); 
          Hill hill9 = new Hill("Dense Fog", "yes"); 
          Hill hill10 = new Hill("Ravine Crossing", "no"); 
          System.out.println("Hill 1:"); 
          hill1.solvechallange(false, "yes"); 
          hill1.getdoorcondition(hill1.solve, hill1.dangerzone);
          System.out.println();
          System.out.println("Hill 2:"); 
          hill2.solvechallange(true, "no"); 
          hill2.getdoorcondition(hill2.solve, hill2.dangerzone);
          System.out.println(); 
          hill3 System.out.println("Hill 3:");
          hill3.solvechallange(false, "yes");
          hill3.getdoorcondition(hill3.solve, hill3.dangerzone);
          System.out.println(); 
          System.out.println("Hill 4:"); 
          hill4.solvechallange(true, "no"); 
          hill4.getdoorcondition(hill4.solve, hill4.dangerzone);
          System.out.println(); 
           hill5 System.out.println("Hill 5:"); 
           hill5.solvechallange(false, "yes"); 
           hill5.getdoorcondition(hill5.solve, hill5.dangerzone);
           System.out.println(); 
           System.out.println("Hill 6:");
           hill6.solvechallange(true, "no");
           hill6.getdoorcondition(hill6.solve, hill6.dangerzone); 
           System.out.println(); 
           System.out.println("Hill 7:"); 
           hill7.solvechallange(false, "yes"); 
           hill7.getdoorcondition(hill7.solve, hill7.dangerzone); 
           System.out.println(); 
          System.out.println("Hill 8:"); 
          hill8.solvechallange(true, "no"); 
          hill8.getdoorcondition(hill8.solve, hill8.dangerzone); 
          System.out.println(); 
           System.out.println("Hill 9:");
           hill9.solvechallange(false, "yes"); 
           hill9.getdoorcondition(hill9.solve, hill9.dangerzone); 
           System.out.println(); 
           System.out.println("Hill 10:");
           hill10.solvechallange(true, "no"); 
           hill10.getdoorcondition(hill10.solve, hill10.dangerzone);
           Tresure tresure1 = new Tresure(1, 2, 3, false, "solve", "cross"); Tresure tresure2 = new Tresure(-1, -2, 3, false, "solve", "blocked"); 
           Tresure tresure3 = new Tresure(4, 5, 6, false, "not_solve", "cross"); 
           Tresure tresure4 = new Tresure(-4, -5, -6, false, "solve", "blocked"); 
           Tresure tresure5 = new Tresure(7, 8, 9, false, "not_solve", "cross"); 
           Tresure tresure6 = new Tresure(-7, -8, -9, false, "solve", "blocked"); 
           Tresure tresure7 = new Tresure(10, 11, 12, false, "not_solve", "cross");
           Tresure tresure8 = new Tresure(-10, -11, -12, false, "solve", "blocked");
           Tresure tresure9 = new Tresure(13, 14, 15, false, "not_solve", "cross"); 
           Tresure tresure10 = new Tresure(-13, -14, -15, false, "solve", "blocked"); 
           Tresure tresure11 = new Tresure(1, 2, 3, false, "solve", "cross"); Tresure tresure12 = new Tresure(-1, -2, 3, false, "solve", "blocked"); 
           Tresure tresure13 = new Tresure(4, 5, 6, false, "not_solve", "cross"); 
           Tresure tresure14 = new Tresure(-4, -5, -6, false, "solve", "blocked"); 
           Tresure tresure15 = new Tresure(7, 8, 9, false, "not_solve", "cross"); 
           Tresure tresure16 = new Tresure(-7, -8, -9, false, "solve", "blocked"); 
           Tresure tresure17 = new Tresure(10, 11, 12, false, "not_solve", "cross"); 
           Tresure tresure18 = new Tresure(-10, -11, -12, false, "solve", "blocked"); 
           Tresure tresure19 = new Tresure(13, 14, 15, false, "not_solve", "cross");
           Tresure tresure20 = new Tresure(-13, -14, -15, false, "solve", "blocked"); 
           Tresure tresure21 = new Tresure(1, 2, 3, false, "solve", "cross"); Tresure tresure22 = new Tresure(-1, -2, 3, false, "solve", "blocked"); 
           Tresure tresure23 = new Tresure(4, 5, 6, false, "not_solve", "cross"); 
           Tresure tresure24 = new Tresure(-4, -5, -6, false, "solve", "blocked"); 
           Tresure tresure25 = new Tresure(7, 8, 9, false, "not_solve", "cross"); 
           Tresure tresure26 = new Tresure(-7, -8, -9, false, "solve", "blocked"); 
           Tresure tresure27 = new Tresure(10, 11, 12, false, "not_solve", "cross"); 
           Tresure tresure28 = new Tresure(-10, -11, -12, false, "solve", "blocked"); 
           Tresure tresure29 = new Tresure(13, 14, 15, false, "not_solve", "cross"); 
           Tresure tresure30 = new Tresure(-13, -14, -15, false, "solve", "blocked"); 
           Tresure 1 System.out.println("Tresure 1:"); 
           tresure1.checkwin(tresure1.challange, tresure1.hindrence); 
           tresure1.solvechallange(false, "yes");
           tresure1.getPositionIn2D(tresure1.x, tresure1.y); 
           tresure1.getPositionIn3D(tresure1.x, tresure1.y, tresure1.z); System.out.println();
           System.out.println("Tresure 2:");
           tresure2.checkwin(tresure2.challange, tresure2.hindrence);
           tresure2.solvechallange(true, "no"); 
           tresure2.getPositionIn2D(tresure2.x, tresure2.y)
           ; tresure2.getPositionIn3D(tresure2.x, tresure2.y, tresure2.z); System.out.println();
            System.out.println("Tresure 3:"); 
            tresure3.checkwin(tresure3.challange, tresure3.hindrence); tresure3.solvechallange(false, "yes");
            tresure3.getPositionIn2D(tresure3.x, tresure3.y); 
            tresure3.getPositionIn3D(tresure3.x, tresure3.y, tresure3.z); System.out.println(); 
            System.out.println("Tresure 4:");
            tresure4.checkwin(tresure4.challange, tresure4.hindrence); tresure4.solvechallange(true, "no");
            tresure4.getPositionIn2D(tresure4.x, tresure4.y); 
            tresure4.getPositionIn3D(tresure4.x, tresure4.y, tresure4.z); System.out.println(); 
            System.out.println("Tresure 5:");
            tresure5.checkwin(tresure5.challange, tresure5.hindrence); tresure5.solvechallange(false, "yes"); 
            tresure5.getPositionIn2D(tresure5.x, tresure5.y); 
            tresure5.getPositionIn3D(tresure5.x, tresure5.y, tresure5.z); System.out.println();
            System.out.println("Tresure 6:");
            tresure6.checkwin(tresure6.challange, tresure6.hindrence); tresure6.solvechallange(true, "no"); 
            tresure6.getPositionIn2D(tresure6.x, tresure6.y); 
            tresure6.getPositionIn3D(tresure6.x, tresure6.y, tresure6.z); System.out.println();
             System.out.println("Tresure 7:");
             tresure7.checkwin(tresure7.challange, tresure7.hindrence); tresure7.solvechallange(false, "yes"); 
             tresure7.getPositionIn2D(tresure7.x, tresure7.y);
             tresure7.getPositionIn3D(tresure7.x, tresure7.y, tresure7.z); System.out.println(); 
             System.out.println("Tresure 8:"); 
             tresure8.checkwin(tresure8.challange, tresure8.hindrence); tresure8.solvechallange(true, "no"); 
             tresure8.getPositionIn2D(tresure8.x, tresure8.y);
             tresure8.getPositionIn3D(tresure8.x, tresure8.y, tresure8.z); System.out.println(); 
             System.out.println("Tresure 9:");
             tresure9.checkwin(tresure9.challange, tresure9.hindrence); tresure9.solvechallange(false, "yes"); 
             tresure9.getPositionIn2D(tresure9.x, tresure9.y); 
             tresure9.getPositionIn3D(tresure9.x, tresure9.y, tresure9.z); System.out.println(); 
             System.out.println("Tresure 10:");
             tresure10.checkwin(tresure10.challange, tresure10.hindrence); tresure10.solvechallange(true, "no");
             tresure10.getPositionIn2D(tresure10.x, tresure10.y); 
             tresure10.getPositionIn3D(tresure10.x, tresure10.y, tresure10.z); System.out.println();
              System.out.println("Tresure 11:");
              tresure11.checkwin(tresure11.challange, tresure11.hindrence); tresure11.solvechallange(false, "yes");
              tresure11.getPositionIn2D(tresure11.x, tresure11.y);
              tresure11.getPositionIn3D(tresure11.x, tresure11.y, tresure11.z); 
              System.out.println();
              System.out.println("Tresure 12:"); 
              tresure12.checkwin(tresure12.challange, tresure12.hindrence); tresure12.solvechallange(true, "no");
              tresure12.getPositionIn2D(tresure12.x, tresure12.y);
              tresure12.getPositionIn3D(tresure12.x, tresure12.y, tresure12.z); System.out.println(); 
               System.out.println("Tresure 13:");
               tresure13.checkwin(tresure13.challange, tresure13.hindrence); tresure13.solvechallange(false, "yes"); 
               tresure13.getPositionIn2D(tresure13.x, tresure13.y);
               tresure13.getPositionIn3D(tresure13.x, tresure13.y, tresure13.z); 
               System.out.println(); 
               System.out.println("Tresure 14:"); 
               tresure14.checkwin(tresure14.challange, tresure14.hindrence); tresure14.solvechallange(true, "no"); 
               tresure14.getPositionIn2D(tresure14.x, tresure14.y); 
               tresure14.getPositionIn3D(tresure14.x, tresure14.y, tresure14.z); System.out.println(); 
                System.out.println("Tresure 15:"); 
                tresure15.checkwin(tresure15.challange, tresure15.hindrence); tresure15.solvechallange(false, "yes"); 
                tresure15.getPositionIn2D(tresure15.x, tresure15.y);
                tresure15.getPositionIn3D(tresure15.x, tresure15.y, tresure15.z); System.out.println();
               System.out.println("Tresure 16:"); 
               tresure16.checkwin(tresure16.challange, tresure16.hindrence); tresure16.solvechallange(true, "no"); 
               tresure16.getPositionIn2D(tresure16.x, tresure16.y);
               tresure16.getPositionIn3D(tresure16.x, tresure16.y, tresure16.z);
               System.out.println();
                System.out.println("Tresure 17:");
                tresure17.checkwin(tresure17.challange, tresure17.hindrence); 
                tresure17.solvechallange(false, "yes");
                tresure17.getPositionIn2D(tresure17.x, tresure17.y); 
                tresure17.getPositionIn3D(tresure17.x, tresure17.y, tresure17.z); 
                System.out.println(); 
                System.out.println("Tresure 18:");
                tresure18.checkwin(tresure18.challange, tresure18.hindrence); tresure18.solvechallange(true, "no"); 
                tresure18.getPositionIn2D(tresure18.x, tresure18.y);
                tresure18.getPositionIn3D(tresure18.x, tresure18.y, tresure18.z); System.out.println();
                 System.out.println("Tresure 19:"); 
                 tresure19.checkwin(tresure19.challange, tresure19.hindrence); tresure19.solvechallange(false, "yes"); 
                 tresure19.getPositionIn2D(tresure19.x, tresure19.y); tresure19.getPositionIn3D(tresure19.x, tresure19.y, tresure19.z); System.out.println();
                  System.out.println("Tresure 20:"); 
                  tresure20.checkwin(tresure20.challange, tresure20.hindrence); 
                  tresure20.solvechallange(true, "no"); 
                  tresure20.getPositionIn2D(tresure20.x, tresure20.y); tresure20.getPositionIn3D(tresure20.x, tresure20.y, tresure20.z);
                  System.out.println();
                   tresure21 System.out.println("Tresure 21:");
                   tresure21.checkwin(tresure21.challange, tresure21.hindrence);
                   tresure21.solvechallange(false, "yes"); 
                   tresure21.getPositionIn2D(tresure21.x, tresure21.y); tresure21.getPositionIn3D(tresure21.x, tresure21.y, tresure21.z); System.out.println();
                    System.out.println("Tresure 22:");
                    tresure22.checkwin(tresure22.challange, tresure22.hindrence);
                    tresure22.solvechallange(true, "no");
                    tresure22.getPositionIn2D(tresure22.x, tresure22.y); tresure22.getPositionIn3D(tresure22.x, tresure22.y, tresure22.z); System.out.println();
                    System.out.println("Tresure 23:"); 
                    tresure23.checkwin(tresure23.challange, tresure23.hindrence); 
                    tresure23.solvechallange(false, "yes");
                    tresure23.getPositionIn2D(tresure23.x, tresure23.y); tresure23.getPositionIn3D(tresure23.x, tresure23.y, tresure23.z);
                    System.out.println();
                    System.out.println("Tresure 24:"); 
                    tresure24.checkwin(tresure24.challange, tresure24.hindrence);
                    tresure24.solvechallange(true, "no");
                    tresure24.getPositionIn2D(tresure24.x, tresure24.y); tresure24.getPositionIn3D(tresure24.x, tresure24.y, tresure24.z); 
                    System.out.println(); 
                    System.out.println("Tresure 25:");
                    tresure25.checkwin(tresure25.challange, tresure25.hindrence);
                    tresure25.solvechallange(false, "yes");
                    tresure25.getPositionIn2D(tresure25.x, tresure25.y); 
                    tresure25.getPositionIn3D(tresure25.x, tresure25.y, tresure25.z); 
                    System.out.println("Tresure 26:"); 
                    tresure26.checkwin(tresure26.challange, tresure26.hindrence); 
                    tresure26.solvechallange(true, "no");
                    tresure26.getPositionIn2D(tresure26.x, tresure26.y); tresure26.getPositionIn3D(tresure26.x, tresure26.y, tresure26.z);
                    System.out.println(); 
                     System.out.println("Tresure 27:");
                     tresure27.checkwin(tresure27.challange, tresure27.hindrence);
                     tresure27.solvechallange(false, "yes"); 
                     tresure27.getPositionIn2D(tresure27.x, tresure27.y); tresure27.getPositionIn3D(tresure27.x, tresure27.y, tresure27.z); System.out.println(); 
                    System.out.println("Tresure 28:");
                    tresure28.checkwin(tresure28.challange, tresure28.hindrence); 
                    tresure28.solvechallange(true, "no");
                    tresure28.getPositionIn2D(tresure28.x, tresure28.y); tresure28.getPositionIn3D(tresure28.x, tresure28.y, tresure28.z); 
                    System.out.println(); 
                    System.out.println("Tresure 29:");
                    tresure29.checkwin(tresure29.challange, tresure29.hindrence); 
                    tresure29.solvechallange(false, "yes"); 
                    tresure29.getPositionIn2D(tresure29.x, tresure29.y); tresure29.getPositionIn3D(tresure29.x, tresure29.y, tresure29.z); 
                    System.out.println(); 
                    System.out.println("Tresure 30:");
                    tresure30.checkwin(tresure30.challange, tresure30.hindrence);
                    tresure30.solvechallange(true, "no");
                    tresure30.getPositionIn2D(tresure30.x, tresure30.y); tresure30.getPositionIn3D(tresure30.x, tresure30.y, tresure30.z); 
                    System.out.println();
                   
        Mountain mountain1 = new Mountain("Everest", "Snowy", 8848);
        Mountain mountain2 = new Mountain("K2", "Icy", 8611);

        // Executing methods for mountain1
        System.out.println("Mountain 1:");
        mountain1.describeMountain();
        mountain1.climbMountain();
        System.out.println();

        // Executing methods for mountain2
        System.out.println("Mountain 2:");
        mountain2.describeMountain();
        mountain2.climbMountain();
        System.out.println();
        public class Main {
   
        Desert desert1 = new Desert("Sahara", "Hot", 9200000);
        Desert desert2 = new Desert("Gobi", "Cold", 1295000);

        // Executing methods for desert1
        System.out.println("Desert 1:");
        desert1.describeDesert();
        desert1.exploreDesert();
        System.out.println();

        // Executing methods for desert2
        System.out.println("Desert 2:");
        desert2.describeDesert();
        desert2.exploreDesert();
        System.out.println();
    }
    
        Forest forest1 = new Forest("Amazon", "Rainforest", 5500000);
        Forest forest2 = new Forest("Black Forest", "Temperate", 6000);

        // Executing methods for forest1
        System.out.println("Forest 1:");
        forest1.describeForest();
        forest1.exploreForest();
        System.out.println();

        // Executing methods for forest2
        System.out.println("Forest 2:");
        forest2.describeForest();
        forest2.exploreForest();
        System.out.println();
        public class Main {
   
        Island island1 = new Island("Hawaii", "Pacific Ocean", 28313);
        Island island2 = new Island("Maldives", "Indian Ocean", 298);

        // Executing methods for island1
        System.out.println("Island 1:");
        island1.describeIsland();
        island1.exploreIsland();
        System.out.println();

        // Executing methods for island2
        System.out.println("Island 2:");
        island2.describeIsland();
        island2.exploreIsland();
        System.out.println();
       
   
        Volcano volcano1 = new Volcano("Mount Fuji", false, 1707);
        Volcano volcano2 = new Volcano("Mount Vesuvius", true, 1944);

        // Executing methods for volcano1
        System.out.println("Volcano 1:");
        volcano1.describeVolcano();
        volcano1.monitorVolcano();
        System.out.println();

        // Executing methods for volcano2
        System.out.println("Volcano 2:");
        volcano2.describeVolcano();
        volcano2.monitorVolcano();
        System.out.println();
    }
}

    }
}

    }
}

}

    }
}

    }
}
