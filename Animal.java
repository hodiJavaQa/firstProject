import javax.xml.namespace.QName;

public class Animal {
    //DATA
    String name;
    String nickname;
    int age;
    String sound;
    String color;

    //func
    public Animal(String name, String nickname, int age, String sound, String color) {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.sound = sound;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
