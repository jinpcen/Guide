package guide.bean;

import java.util.Date;

public class Question extends QuestionKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.ask_day
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private Date askDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.anwser
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    private String anwser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.ask_day
     *
     * @return the value of question.ask_day
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public Date getAskDay() {
        return askDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.ask_day
     *
     * @param askDay the value for question.ask_day
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setAskDay(Date askDay) {
        this.askDay = askDay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.anwser
     *
     * @return the value of question.anwser
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public String getAnwser() {
        return anwser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.anwser
     *
     * @param anwser the value for question.anwser
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    public void setAnwser(String anwser) {
        this.anwser = anwser == null ? null : anwser.trim();
    }
}