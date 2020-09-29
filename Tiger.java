class Tiger extends Feline implements Noise{ //modify makenoise
    Tiger(String name_){
        name = name_;
        type = "Tiger";
    }
    public String getNoise() {
        return "Growl!";
    }
}