package com.entity.vo;

import com.entity.JubaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 举报信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public class JubaoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
