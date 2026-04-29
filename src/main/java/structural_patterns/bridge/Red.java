package structural_patterns.bridge;

public class Red implements Color{
    @Override
    public String fill(){
        return "filled with solid red";
    }

}
