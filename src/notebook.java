public class notebook {
    private String name;
    private Float price;
    private int g=0;
    public notebook(String name1, float price1, int g1){
        name=name1;
        price=price1;
        g=g1;
    }
    public void showInfo(){
        System.out.println(this.name+"\t\t"+this.price+"\t\t"+this.g);
    }
}