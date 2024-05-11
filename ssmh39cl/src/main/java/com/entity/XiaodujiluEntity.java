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
 * 消毒记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@TableName("xiaodujilu")
public class XiaodujiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaodujiluEntity() {
		
	}
	
	public XiaodujiluEntity(T t) {
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
	 * 消毒名称
	 */
					
	private String xiaodumingcheng;
	
	/**
	 * 消毒场所
	 */
					
	private String xiaoduchangsuo;
	
	/**
	 * 消毒方式
	 */
					
	private String xiaodufangshi;
	
	/**
	 * 消毒用品
	 */
					
	private String xiaoduyongpin;
	
	/**
	 * 消毒人
	 */
					
	private String xiaoduren;
	
	/**
	 * 检查人
	 */
					
	private String jiancharen;
	
	/**
	 * 消毒记录
	 */
					
	private String xiaodujilu;
	
	/**
	 * 消毒日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiaoduriqi;
	
	/**
	 * 消毒时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date xiaodushijian;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：消毒名称
	 */
	public void setXiaodumingcheng(String xiaodumingcheng) {
		this.xiaodumingcheng = xiaodumingcheng;
	}
	/**
	 * 获取：消毒名称
	 */
	public String getXiaodumingcheng() {
		return xiaodumingcheng;
	}
	/**
	 * 设置：消毒场所
	 */
	public void setXiaoduchangsuo(String xiaoduchangsuo) {
		this.xiaoduchangsuo = xiaoduchangsuo;
	}
	/**
	 * 获取：消毒场所
	 */
	public String getXiaoduchangsuo() {
		return xiaoduchangsuo;
	}
	/**
	 * 设置：消毒方式
	 */
	public void setXiaodufangshi(String xiaodufangshi) {
		this.xiaodufangshi = xiaodufangshi;
	}
	/**
	 * 获取：消毒方式
	 */
	public String getXiaodufangshi() {
		return xiaodufangshi;
	}
	/**
	 * 设置：消毒用品
	 */
	public void setXiaoduyongpin(String xiaoduyongpin) {
		this.xiaoduyongpin = xiaoduyongpin;
	}
	/**
	 * 获取：消毒用品
	 */
	public String getXiaoduyongpin() {
		return xiaoduyongpin;
	}
	/**
	 * 设置：消毒人
	 */
	public void setXiaoduren(String xiaoduren) {
		this.xiaoduren = xiaoduren;
	}
	/**
	 * 获取：消毒人
	 */
	public String getXiaoduren() {
		return xiaoduren;
	}
	/**
	 * 设置：检查人
	 */
	public void setJiancharen(String jiancharen) {
		this.jiancharen = jiancharen;
	}
	/**
	 * 获取：检查人
	 */
	public String getJiancharen() {
		return jiancharen;
	}
	/**
	 * 设置：消毒记录
	 */
	public void setXiaodujilu(String xiaodujilu) {
		this.xiaodujilu = xiaodujilu;
	}
	/**
	 * 获取：消毒记录
	 */
	public String getXiaodujilu() {
		return xiaodujilu;
	}
	/**
	 * 设置：消毒日期
	 */
	public void setXiaoduriqi(Date xiaoduriqi) {
		this.xiaoduriqi = xiaoduriqi;
	}
	/**
	 * 获取：消毒日期
	 */
	public Date getXiaoduriqi() {
		return xiaoduriqi;
	}
	/**
	 * 设置：消毒时间
	 */
	public void setXiaodushijian(Date xiaodushijian) {
		this.xiaodushijian = xiaodushijian;
	}
	/**
	 * 获取：消毒时间
	 */
	public Date getXiaodushijian() {
		return xiaodushijian;
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

}
