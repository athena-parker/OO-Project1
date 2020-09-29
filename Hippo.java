class Hippo extends Pachyderm implements Noise { //modify makenoise
    Hippo(String name_){
        name = name_;
        type = "Hippo";
    }
    public String getNoise() {
        return "Grunt!";
    }
}