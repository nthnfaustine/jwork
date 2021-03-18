/**
 * Write a description of class Location here.
 *
 * @author Nathaniel Faustine
 * @version 18 Maret 2021
 */

public class DatabaseJob {
    // instance variable dari DatabaseJob
    private String[] listJob;
    
    /*
     constructor dari class DatabaseJob
    */
    public DatabaseJob(){
       listJob = new String[100];
    }
    
    /**
     * metode untuk merubah list job
     *
     * @param     list job
     * @return    void
     */
    public DatabaseJob(String[] listJob){
        this.listJob = listJob;
    }
    
    /**
     * metode untuk menambah job (belum diimplementasikan)
     *
     * @param     job
     * @return    boolean
     */
    public boolean addJob(Job job){
        return false;
    }
    
    /**
     * metode untuk menghapus job (belum diimplementasikan)
     *
     * @param     job
     * @return    boolean
     */
    public boolean remove(Job job){
        return false;
    }
    
    /**
     * metode untuk return job
     *
     * @param     void
     * @return    null
     */
    public Job getJob(){
        return null;
    }
    
    /**
     * metode untuk return list dari job
     *
     * @param     void
     * @return    listJob
     */
    public String[] getListJob(){
        return listJob;
    }
}