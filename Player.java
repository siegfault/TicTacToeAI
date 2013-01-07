public class Player {
  public enum PlayerType {COMPUTER, HUMAN}
  PlayerType type;

  public Player(PlayerType types) {
    type = types;
  }
}