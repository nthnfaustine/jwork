package nathanielfaustine.jwork;
/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */
public class Location
{
    private String province;
    private String city;
    private String description;
    /**
     * Constructor untuk class Location
     */
    public Location(String province, String city, String description){
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * Metode untuk return provinsi
     *
     * @param     void
     * @return    province
     */
    public String getProvince(){
        return province;
    }

    /**
     * Metode untuk return kota
     *
     * @param     void
     * @return    city
     */
    public String getCity(){
        return city;
    }

    /**
     * Metode untuk return deskripsi
     *
     * @param     void
     * @return    description
     */
    public String getDescription(){
        return description;
    }

    /**
     * Metode untuk merubah provinsi
     *
     * @param     province
     * @return    void
     */
    public void setProvince(String province){
        this.province = province;
    }

    /**
     * Metode untuk merubah kota
     *
     * @param     kota
     * @return    void
     */
    public void setCity(String city){
        this.city = city;
    }

    /**
     * Metode untuk merubah deskripsi
     *
     * @param     description
     * @return    void
     */
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Metode untuk print nama dari provinsi
     *
     * @param     void
     * @return    province
     */
    @Override
    public String toString() {
        return "Province = " + getProvince() + "\nCity = " + getCity() + "\nDescription = " + getDescription();
    }
}
