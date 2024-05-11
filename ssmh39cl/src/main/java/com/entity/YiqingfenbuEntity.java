package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 疫情分布
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@TableName("yiqingfenbu")
public class YiqingfenbuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiqingfenbuEntity() {
		
	}
	
	public YiqingfenbuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 城市
	 */
					
	private String chengshi;
	
	/**
	 * 新增确诊
	 */
					
	private Integer xinzengquezhen;
	
	/**
	 * 新增无症状
	 */
					
	private Integer xinzengwuzhengzhuang;
	
	/**
	 * 确诊人数
	 */
					
	private Integer quezhenrenshu;
	
	/**
	 * 治愈人数
	 */
					
	private Integer zhiyurenshu;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：城市
	 */
	public void setChengshi(String chengshi) {
		this.chengshi = chengshi;
	}
	/**
	 * 获取：城市
	 */
	public String getChengshi() {
		return chengshi;
	}
	/**
	 * 设置：新增确诊
	 */
	public void setXinzengquezhen(Integer xinzengquezhen) {
		this.xinzengquezhen = xinzengquezhen;
	}
	/**
	 * 获取：新增确诊
	 */
	public Integer getXinzengquezhen() {
		return xinzengquezhen;
	}
	/**
	 * 设置：新增无症状
	 */
	public void setXinzengwuzhengzhuang(Integer xinzengwuzhengzhuang) {
		this.xinzengwuzhengzhuang = xinzengwuzhengzhuang;
	}
	/**
	 * 获取：新增无症状
	 */
	public Integer getXinzengwuzhengzhuang() {
		return xinzengwuzhengzhuang;
	}
	/**
	 * 设置：确诊人数
	 */
	public void setQuezhenrenshu(Integer quezhenrenshu) {
		this.quezhenrenshu = quezhenrenshu;
	}
	/**
	 * 获取：确诊人数
	 */
	public Integer getQuezhenrenshu() {
		return quezhenrenshu;
	}
	/**
	 * 设置：治愈人数
	 */
	public void setZhiyurenshu(Integer zhiyurenshu) {
		this.zhiyurenshu = zhiyurenshu;
	}
	/**
	 * 获取：治愈人数
	 */
	public Integer getZhiyurenshu() {
		return zhiyurenshu;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}

}
