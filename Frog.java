class Frog extends Amphibian implements Noise { //modify makenoise
    Frog(String name_){
        name = name_;
        type = "Frog";
    }
    public String getNoise() {
        return "Ribbit!";
    }
}