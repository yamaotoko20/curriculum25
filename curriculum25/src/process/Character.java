package process;

import java.util.Random;

//インスタンス変数
public class Character {
    private String name;	//キャラクターの名前を格納するための文字列
    private Integer hp;		//キャラクターの体力ポイントを表す整数
    private Integer mp;		//キャラクターの魔法ポイントを表す整数
    private Integer attack;	//キャラクターの攻撃力を表す整数
    private Integer speed;	//キャラクターのスピードを表す整数
    private Integer defense;//キャラクターの防御力を表す整数

    public Character(String name) {
        this.name = name;
        Random random = new Random();
        this.hp = random.nextInt(1000) + 800;
        this.mp = random.nextInt(1000) + 800;
        this.attack = random.nextInt(500) + 300;
        this.speed = random.nextInt(1000);
        this.defense = random.nextInt(50) + 20;
    }

    public String getName() {	//キャラクターの名前を取得するためのゲッターメソッ
        return name;
    }

    public Integer getHp() {	//キャラクターのHPを取得するためのゲッターメソッド
        return hp;
    }

    public Integer getMp() {	//キャラクターのMPを取得するためのゲッターメソッド
        return mp;
    }

    public Integer getAttack() {	//キャラクターの攻撃力を取得するためのゲッターメソッド
        return attack;
    }

    public Integer getSpeed() {		//キャラクターのスピードを取得するためのゲッターメソッド
        return speed;
    }

    public Integer getDefense() {	//キャラクターの防御力を取得するためのゲッターメソッド
        return defense;
    }
	
	
}
