class Rhino extends Pachyderm implements Noise { //modify makenoise
    Rhino(String name_){
        name = name_;
        type = "Rhino";
    }
    public String getNoise() {
        return "Moo!";
    }
}