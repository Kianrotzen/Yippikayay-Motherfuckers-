public class App {
    public static void main(String[] args) {

        Character knight = new Character(10,5,0,10, "Chen");
        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.life = 10;
        knight.name = "Chen";
        knight.sayMyName();
        knight.sayMystrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();


        Character mage = new Character(0,5,10,4, "Gondar");

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.life = 4;
        mage.name = "Gondar";
        mage.sayMyName();
        mage.sayMystrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

    
        Character thief = new Character(5,10,0,4, "Aksha");

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.life = 4;
        thief.name = "Aksha";
        thief.sayMyName();
        thief.sayMystrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character(5,7,5,5, "Gale");

        archer.strength = 5; 
        archer.agility = 7;
        archer.intelligence = 5;
        archer.life = 5;
        archer.name = "Gale"; 
        archer.sayMyName();
        archer.sayMystrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();

        
        Character warrior = new Character (10,6,5,8, "Escanor");

        warrior.strength = 10;
        warrior.agility = 6;
        warrior.intelligence = 5;
        warrior.life = 8; 
        warrior.name = "Escanor"; 
        warrior.sayMyName();
        warrior.sayMystrength();
        warrior.sayMyAgility();
    }
}  