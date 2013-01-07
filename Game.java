public class Game {
  private Player current_player;
  private Player p1;
  private Player p2;
  public enum PlayerType {COMPUTER, HUMAN}

  public Game(PlayerType type1, PlayerType type2) {
    // p1 = new Player(type1);
    // p2 = new Player(type2);
    // current_player = p1;
  }

  public static void take_args(String[] args) {
    for(String arg : args) {
      System.out.println(arg);
    }
  }

  public static void print_board() {
    System.out.println(" | | \n-+-+-\n | | \n-+-+-\n | | ");
  }

  public static void play_game() {
    for(int i=0; i<9; i++) {

    }
  }

  public static void main(String[] args) {
    take_args(args);
    print_board();
    // Game game = new Game(PlayerType.COMPUTER, PlayerType.HUMAN);
    play_game();
  }
}