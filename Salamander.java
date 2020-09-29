class Salamander extends Amphibian implements Noise { //modify makenoise
    Salamander(String name_){
        name = name_;
        type = "Salamander";
    }
    public String getNoise() {
        return "Pop!";
    }
}