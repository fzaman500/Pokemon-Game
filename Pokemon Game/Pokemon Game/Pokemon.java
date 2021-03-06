public class Pokemon
{
 private String name;
 private String type;
 private Move[] moves;
 
 public Pokemon(String name, String type, Move[] moves)
 {
   this.name = name;
   this.type = type;
   this.moves = moves;
 }
 
 public String getName()
 {
   return name; 
 }
 
 public String getType()
 {
   return type;
 }
 
 public Move getMove(int n)
 {
   return moves[n];
 }
}