class Cat extends Feline implements Noise { //modify makenoise
    Cat(String name_){
        name = name_;
        type = "Cat";
    }
    public String getNoise() {
        return "Meow!";
    }
}