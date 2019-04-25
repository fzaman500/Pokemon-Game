public class PokeWorld
{
  public static void main(String[] args){
    //Make PKMN move sets
    Move[] moves1 = new Move[4];
    moves1[0] = new Move("Tackle", 3);
    moves1[1] = new Move("Flame Wheel", 7);
    moves1[2] = new Move("Bite", 4);
    moves1[3] = new Move("Scratch", 2);
    Move[] moves2 = new Move[4];
    moves2[0] = new Move("Tackle", 2);
    moves2[1] = new Move("Hyperfang", 6);
    moves2[2] = new Move("Bite", 5);
    moves2[3] = new Move("Tail whip",0);
    Move[] moves3 = new Move[4];
    moves3[0] = new Move("Scary Face", 0);
    moves3[1] = new Move("Sleep", 0);
    moves3[2] = new Move("Nightmare", 15);
    moves3[3] = new Move("Shadow Ball",10);
    Move[] moves4 = new Move[4];
    moves4[0] = new Move("Water Gun", 15);
    moves4[1] = new Move("Rapid Spin", 5);
    moves4[2] = new Move("Leer", 0);
    moves4[3] = new Move("Tail Whip", 0);
    Move[] moves5 = new Move[4];
    moves5[0] = new Move("Volt Tackle", 30);
    moves5[1] = new Move("Thunderbolt", 5);
    moves5[2] = new Move("Leer", 0);
    moves5[3] = new Move("Tail Whip", 0);
    
    //Make Pokemon
    FirePokemon warrior = new FirePokemon("Growlithe", moves1);
    NormalPokemon ratsputin = new NormalPokemon("Rattata", moves2);
    GhostPokemon bendrowned = new GhostPokemon("Gengar", moves3);
    WaterPokemon shellshock = new WaterPokemon("Squirtle", moves4);
    ElectricPokemon bolt = new ElectricPokemon("Pikachu", moves5);
    
    //Add pokemon to array inventory
    Pokemon[] inventory = new Pokemon[5];
    inventory[0] = warrior;
    inventory[1] = ratsputin;
    inventory[2] = bendrowned;
    inventory[3] = shellshock;
    inventory[4] = bolt;
    
    //Show Battle Text
    int wMove = 2;
    int rMove = 1;
    int sMove = 3;
    System.out.println(inventory[0].getName() + " used "+ inventory[0].getMove(wMove).getName()+". It's super effective!");
    System.out.println(inventory[1].getName() + " used "+ inventory[1].getMove(rMove).getName()+". It's super effective!");
    System.out.println(inventory[2].getName() + " used "+ inventory[2].getMove(rMove).getName()+". It's super effective!");
    System.out.println(inventory[3].getName() + " used "+ inventory[3].getMove(sMove).getName()+". It's super effective!");
    System.out.println(inventory[4].getName() + " used "+ inventory[4].getMove(sMove).getName()+". It's super effective!");
    
    //Show results text
    System.out.println(inventory[0].getName() + " did "+inventory[0].getMove(wMove).getDamage()+" damage.");
    System.out.println(inventory[1].getName() + " did "+inventory[1].getMove(rMove).getDamage()+" damage.");
    System.out.println(inventory[2].getName() + " did "+inventory[2].getMove(rMove).getDamage()+" damage.");
    System.out.println(inventory[3].getName() + " did "+ inventory[3].getMove(sMove).getDamage()+" damage.");
    System.out.println(inventory[4].getName() + " did "+ inventory[4].getMove(sMove).getDamage()+" damage.");
  }
}