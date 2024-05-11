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
 * 来访登记
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@TableName("laifangdengji")
public class LaifangdengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LaifangdengjiEntity() {
		
	}
	
	public LaifangdengjiEntity(T t) {
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
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 访客姓名
	 */
					
	private String fangkexingming;
	
	/**
	 * 访客身份证
	 */
					
	private String fangkeshenfenzheng;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 拜访业主
	 */
					
	private String baifangyezhu;
	
	/**
	 * 随身物品
	 */
					
	private String suishenwupin;
	
	/**
	 * 存放物品
	 */
					
	private String cunfangwupin;
	
	/**
	 * 来访时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date laifangshijian;
	
	/**
	 * 来访目的
	 */
					
	private String laifangmude;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 来访备注
	 */
					
	private String laifangbeizhu;
	
	
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
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：访客姓名
	 */
	public void setFangkexingming(String fangkexingming) {
		this.fangkexingming = fangkexingming;
	}
	/**
	 * 获取：访客姓名
	 */
	public String getFangkexingming() {
		return fangkexingming;
	}
	/**
	 * 设置：访客身份证
	 */
	public void setFangkeshenfenzheng(String fangkeshenfenzheng) {
		this.fangkeshenfenzheng = fangkeshenfenzheng;
	}
	/**
	 * 获取：访客身份证
	 */
	public String getFangkeshenfenzheng() {
		return fangkeshenfenzheng;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：拜访业主
	 */
	public void setBaifangyezhu(String baifangyezhu) {
		this.baifangyezhu = baifangyezhu;
	}
	/**
	 * 获取：拜访业主
	 */
	public String getBaifangyezhu() {
		return baifangyezhu;
	}
	/**
	 * 设置：随身物品
	 */
	public void setSuishenwupin(String suishenwupin) {
		this.suishenwupin = suishenwupin;
	}
	/**
	 * 获取：随身物品
	 */
	public String getSuishenwupin() {
		return suishenwupin;
	}
	/**
	 * 设置：存放物品
	 */
	public void setCunfangwupin(String cunfangwupin) {
		this.cunfangwupin = cunfangwupin;
	}
	/**
	 * 获取：存放物品
	 */
	public String getCunfangwupin() {
		return cunfangwupin;
	}
	/**
	 * 设置：来访时间
	 */
	public void setLaifangshijian(Date laifangshijian) {
		this.laifangshijian = laifangshijian;
	}
	/**
	 * 获取：来访时间
	 */
	public Date getLaifangshijian() {
		return laifangshijian;
	}
	/**
	 * 设置：来访目的
	 */
	public void setLaifangmude(String laifangmude) {
		this.laifangmude = laifangmude;
	}
	/**
	 * 获取：来访目的
	 */
	public String getLaifangmude() {
		return laifangmude;
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
	 * 设置：来访备注
	 */
	public void setLaifangbeizhu(String laifangbeizhu) {
		this.laifangbeizhu = laifangbeizhu;
	}
	/**
	 * 获取：来访备注
	 */
	public String getLaifangbeizhu() {
		return laifangbeizhu;
	}

}
