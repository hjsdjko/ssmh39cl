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
 * 举报信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@TableName("jubaoxinxi")
public class JubaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JubaoxinxiEntity() {
		
	}
	
	public JubaoxinxiEntity(T t) {
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
	 * 举报编号
	 */
					
	private String jubaobianhao;
	
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 举报人
	 */
					
	private String jubaoren;
	
	/**
	 * 被举报人
	 */
					
	private String beijubaoren;
	
	/**
	 * 举报时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date jubaoshijian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 举报原因
	 */
					
	private String jubaoyuanyin;
	
	
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
	 * 设置：举报编号
	 */
	public void setJubaobianhao(String jubaobianhao) {
		this.jubaobianhao = jubaobianhao;
	}
	/**
	 * 获取：举报编号
	 */
	public String getJubaobianhao() {
		return jubaobianhao;
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
	 * 设置：举报人
	 */
	public void setJubaoren(String jubaoren) {
		this.jubaoren = jubaoren;
	}
	/**
	 * 获取：举报人
	 */
	public String getJubaoren() {
		return jubaoren;
	}
	/**
	 * 设置：被举报人
	 */
	public void setBeijubaoren(String beijubaoren) {
		this.beijubaoren = beijubaoren;
	}
	/**
	 * 获取：被举报人
	 */
	public String getBeijubaoren() {
		return beijubaoren;
	}
	/**
	 * 设置：举报时间
	 */
	public void setJubaoshijian(Date jubaoshijian) {
		this.jubaoshijian = jubaoshijian;
	}
	/**
	 * 获取：举报时间
	 */
	public Date getJubaoshijian() {
		return jubaoshijian;
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
	 * 设置：举报原因
	 */
	public void setJubaoyuanyin(String jubaoyuanyin) {
		this.jubaoyuanyin = jubaoyuanyin;
	}
	/**
	 * 获取：举报原因
	 */
	public String getJubaoyuanyin() {
		return jubaoyuanyin;
	}

}
