package com.itwang.mapper;

import com.itwang.pojo.Book;
import com.itwang.pojo.BookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int deleteByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    Book selectByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_book
     *
     * @mbggenerated Thu Jun 15 16:39:10 CST 2023
     */
    int updateByPrimaryKey(Book record);
}