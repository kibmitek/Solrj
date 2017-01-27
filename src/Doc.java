import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;
import java.util.List;

/**
 * Created by Dmitrii on 1/26/2017.
 */
public class Doc {
    @Field
    private String id;
    @Field
    private List<String> name;
    @Field
    private List<String> manu;
    @Field
    private String manu_id_s;
    @Field
    private List<String> cat;
    @Field
    private List<String> features;
    @Field
    private List<Float> price;
    @Field
    private List<Integer> popularity;
    @Field
    private List<Boolean> inStock;
    @Field
    private  List<String> store;
    @Field
    private Date manufacturedate_dt;
    @Field
    private List<String> payloads;
    @Field
    private double _version_;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getManu() {
        return manu;
    }

    public void setManu(List<String> manu) {
        this.manu = manu;
    }

    public String getManu_id_s() {
        return manu_id_s;
    }

    public void setManu_id_s(String manu_id_s) {
        this.manu_id_s = manu_id_s;
    }

    public List<String> getCat() {
        return cat;
    }

    public void setCat(List<String> cat) {
        this.cat = cat;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public List<Float> getPrice() {
        return price;
    }

    public void setPrice(List<Float> price) {
        this.price = price;
    }

    public List<Integer> getPopularity() {
        return popularity;
    }

    public void setPopularity(List<Integer> popularity) {
        this.popularity = popularity;
    }

    public List<Boolean> isInStock() {
        return inStock;
    }

    public void setInStock(List<Boolean> inStock) {
        this.inStock = inStock;
    }

    public List<String> getStore() {
        return store;
    }

    public void setStore(List<String> store) {
        this.store = store;
    }

    public Date getManufacturedate_dt() {
        return manufacturedate_dt;
    }

    public void setManufacturedate_dt(Date manufacturedate_dt) {
        this.manufacturedate_dt = manufacturedate_dt;
    }

    public List<String> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<String> payloads) {
        this.payloads = payloads;
    }

    public double get_version_() {
        return _version_;
    }

    public void set_version_(double _version_) {
        this._version_ = _version_;
    }
}
