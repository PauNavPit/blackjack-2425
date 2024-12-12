import com.diogonunes.jcolor.Attribute;

public enum Color {
        ROJO(Attribute.RED_TEXT()),
        NEGRO(Attribute.BLACK_TEXT());
        private Attribute color;

        Color(Attribute color){
            this.color=color;
        }


    public Attribute getColor() {
        return color;
    }
}
