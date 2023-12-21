class CustomObject{
    String str = "tet";

    public CustomObject(String str){
        this.str = str;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}