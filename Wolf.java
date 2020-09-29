class Wolf extends Canine implements Noise { //modify makenoise
    Wolf(String name_){
        name = name_;
        type = "Wolf";
    }
    public String getNoise() {
        return "Woof!";
    }
}