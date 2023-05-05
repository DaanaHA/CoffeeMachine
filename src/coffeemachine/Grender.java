package coffeemachine;

public class Grender {
    private int level;

    public Grender() {
        
    }

    public Grender(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void grind(int level) {
        
    }
    
    public String getInfo() {
        return "Level: " + this.level;
    }
    
}
