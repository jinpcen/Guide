package guide.dao;

import java.util.List;

import guide.bean.Message;

public interface MessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    int deleteByPrimaryKey(String messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    Message selectByPrimaryKey(String messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbg.generated Fri Nov 16 21:37:24 CST 2018
     */
    int updateByPrimaryKey(Message record);
    
    List<Message> getAllMessage(String id);
    
    
    public List<Message> getMessage(String stu_id);
}