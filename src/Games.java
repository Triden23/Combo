public enum Games {
    Select("Select"),
    Tekken("Tekken 8"),
    BlazBlue("BlazBlue Centrification");

    String name;
    private Games(String s){
        s = name;
    }

    public String toString(){
        return this.name();
    }
}
