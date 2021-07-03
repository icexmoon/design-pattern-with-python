package pattern8.sort_in_java_v2;

class Character implements Comparable {
    String name;
    int attack;

    public Character(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    @Override
    public int compareTo(Object o) {
        Character other = (Character) o;
        if (this.attack > other.attack) {
            return 1;
        } else if (this.attack == other.attack) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Character(" + this.name + "," + this.attack + ")";
    }

}
