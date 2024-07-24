package process;

public class CharacterProcess extends Character {
	//親クラスのコンストラクタを呼び出し、与えられた名前を使用してキャラクターを初期化
    public CharacterProcess(String name) {	
        super(name);
    }
    
    //キャラクターのステータスを表示するためのメソッド
    public void displayStatus() {
        if (getName() != null && getHp() != null && getMp() != null && getAttack() != null && getSpeed() != null && getDefense() != null) {
            System.out.println("こんにちは「" + getName() + "」さん");
            System.out.println("ステータス");
            System.out.println("HP：" + getHp());
            System.out.println("MP：" + getMp());
            System.out.println("攻撃力：" + getAttack());
            System.out.println("素早さ：" + getSpeed());
            System.out.println("防御力：" + getDefense());
            System.out.println("さあ冒険に出かけよう！");
        } else {
            System.out.println("キャラクター情報にnullが含まれています。処理を続行できません。");
        }
    }
}