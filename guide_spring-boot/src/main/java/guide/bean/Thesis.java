package guide.bean;

import java.util.Date;

public class Thesis {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.tes_id
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private String tesId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.stu_id
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private String stuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.tes_title
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private String tesTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.tes_path
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private String tesPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column thesis.tes_date
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private Date tesDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.tes_id
     *
     * @return the value of thesis.tes_id
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public String getTesId() {
        return tesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.tes_id
     *
     * @param tesId the value for thesis.tes_id
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setTesId(String tesId) {
        this.tesId = tesId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.stu_id
     *
     * @return the value of thesis.stu_id
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.stu_id
     *
     * @param stuId the value for thesis.stu_id
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.tes_title
     *
     * @return the value of thesis.tes_title
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public String getTesTitle() {
        return tesTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.tes_title
     *
     * @param tesTitle the value for thesis.tes_title
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setTesTitle(String tesTitle) {
        this.tesTitle = tesTitle == null ? null : tesTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.tes_path
     *
     * @return the value of thesis.tes_path
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public String getTesPath() {
        return tesPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.tes_path
     *
     * @param tesPath the value for thesis.tes_path
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setTesPath(String tesPath) {
        this.tesPath = tesPath == null ? null : tesPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column thesis.tes_date
     *
     * @return the value of thesis.tes_date
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public Date getTesDate() {
        return tesDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column thesis.tes_date
     *
     * @param tesDate the value for thesis.tes_date
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setTesDate(Date tesDate) {
        this.tesDate = tesDate;
    }
}