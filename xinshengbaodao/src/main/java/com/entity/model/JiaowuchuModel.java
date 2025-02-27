package com.entity.model;

import com.entity.JiaowuchuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教务处
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JiaowuchuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 教务负责人名称
     */
    private String jiaowuchuName;


    /**
     * 头像
     */
    private String jiaowuchuPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 联系方式
     */
    private String jiaowuchuPhone;


    /**
     * 邮箱
     */
    private String jiaowuchuEmail;


    /**
     * 假删
     */
    private Integer jiaowuchuDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：教务负责人名称
	 */
    public String getJiaowuchuName() {
        return jiaowuchuName;
    }


    /**
	 * 设置：教务负责人名称
	 */
    public void setJiaowuchuName(String jiaowuchuName) {
        this.jiaowuchuName = jiaowuchuName;
    }
    /**
	 * 获取：头像
	 */
    public String getJiaowuchuPhoto() {
        return jiaowuchuPhoto;
    }


    /**
	 * 设置：头像
	 */
    public void setJiaowuchuPhoto(String jiaowuchuPhoto) {
        this.jiaowuchuPhoto = jiaowuchuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：联系方式
	 */
    public String getJiaowuchuPhone() {
        return jiaowuchuPhone;
    }


    /**
	 * 设置：联系方式
	 */
    public void setJiaowuchuPhone(String jiaowuchuPhone) {
        this.jiaowuchuPhone = jiaowuchuPhone;
    }
    /**
	 * 获取：邮箱
	 */
    public String getJiaowuchuEmail() {
        return jiaowuchuEmail;
    }


    /**
	 * 设置：邮箱
	 */
    public void setJiaowuchuEmail(String jiaowuchuEmail) {
        this.jiaowuchuEmail = jiaowuchuEmail;
    }
    /**
	 * 获取：假删
	 */
    public Integer getJiaowuchuDelete() {
        return jiaowuchuDelete;
    }


    /**
	 * 设置：假删
	 */
    public void setJiaowuchuDelete(Integer jiaowuchuDelete) {
        this.jiaowuchuDelete = jiaowuchuDelete;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
