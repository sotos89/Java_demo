package gr.aueb.elearn.builder;

public class CDAdv implements ShoppingItem {
    private String cdId;
    private String cdTitle;
    private String cdProducer;

    public static CDAdv getInstance(){
        return new CDAdv();
    }

    public CDAdv id(String cdId){
        this.cdId = cdId;
        return this;
    }

    public CDAdv title(String cdTitle){
        this.cdTitle = cdTitle;
        return this;
    }

    public CDAdv cdProducer(String cdProducer){
        this.cdProducer = cdProducer;
        return this;
    }

    public String getCdId() {
        return cdId;
    }
    public String getCdTitle() {
        return cdTitle;
    }
    public String getCdProducer() {
        return cdProducer;
    }

    @Override
    public String toString() {
        return "CD{" +
                "cdId='" + cdId + '\'' +
                ", cdTitle='" + cdTitle + '\'' +
                ", cdProducer='" + cdProducer + '\'' +
                '}';
    }
}
