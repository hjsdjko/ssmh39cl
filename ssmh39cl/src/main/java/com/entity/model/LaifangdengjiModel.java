package com.entity.model;

import com.entity.LaifangdengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 来访登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public class LaifangdengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
