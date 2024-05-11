package com.entity.model;

import com.entity.YiqingfenbuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 疫情分布
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public class YiqingfenbuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
