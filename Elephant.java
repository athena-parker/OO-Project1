class Elephant extends Pachyderm implements Noise { //modify makenoise
    Elephant(String name_){
        name = name_;
        type = "Elephant";
    }
    public String getNoise() {
        return "Hooooooo!";
    }
}