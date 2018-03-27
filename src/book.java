public class book {
    private String title, author, publisher, ISBN;
    private int price;

    public book( String title1,String author1,String publisher1,String ISBN1,int price1){
        title=title1;
        author=author1;
        publisher=publisher1;
        ISBN=ISBN1;
        price=price1;
    }

    public void setTitle(String title1) {
        this.title = title1;
    }

    public String gettitle() {
        return title;
    }

    public void setAuthor(String author1) {
        this.author = author1;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher1) {
        this.publisher = publisher1;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setISBN(String ISBN1) {
        this.ISBN = ISBN1;
    }

    public String getisbn() {
        return ISBN;
    }

    public void setPrice(int price1) {
        this.price = price1;
    }

    public int getPrice() {
        return price;
    }
    public String getTitle() { return title;}
    public String getauthor() { return  author;}
    public String getpublisher() { return  publisher; }
    public String getISBN() { return ISBN; }
    public int    getprice() { return price;}
    public  void Main(){
        System.out.println("========================");
        System.out.println("title:"+this.title);
        System.out.println("author:"+this.author);
        System.out.println("publisher:"+this.publisher);
        System.out.println("ISBN:"+this.ISBN);
        System.out.println("price:"+this.price);
        System.out.println("========================");
    }
  }
