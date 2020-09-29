class Lion extends Feline implements Noise { //modify makenoise method
    Lion(String name_){
        name = name_;
        type = "Lion";
    }
    public String getNoise() {
        return "Roar!";
    }
}