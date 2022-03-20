public class GameCharacterYoung extends GameCharacter{

    public GameCharacterYoung() {
        super("Angus Young");
        guitarBehavior=new Guitar_GibsonSG();
        soloBehavior=new Solo_JumpOffStage();
    }
}
