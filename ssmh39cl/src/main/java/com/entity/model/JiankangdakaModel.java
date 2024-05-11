package com.entity.model;

import com.entity.JiankangdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健康打卡
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public class JiankangdakaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业主账号
	 */
	
	private String yezhuzhanghao;
		
	/**
	 * 业主姓名
	 */
	
	private String yezhuxingming;
		
	/**
	 * 当前体温
	 */
	
	private String dangqiantiwen;
		
	/**
	 * 咳嗽
	 */
	
	private String kesou;
		
	/**
	 * 出入风险区域
	 */
	
	private String churufengxianquyu;
		
	/**
	 * 接触病患
	 */
	
	private String jiechubinghuan;
		
	/**
	 * 当前位置
	 */
	
	private String dangqianweizhi;
		
	/**
	 * 打卡备注
	 */
	
	private String dakabeizhu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：业主账号
	 */
	 
	public void setYezhuzhanghao(String yezhuzhanghao) {
		this.yezhuzhanghao = yezhuzhanghao;
	}
	
	/**
	 * 获取：业主账号
	 */
	public String getYezhuzhanghao() {
		return yezhuzhanghao;
	}
				
	
	/**
	 * 设置：业主姓名
	 */
	 
	public void setYezhuxingming(String yezhuxingming) {
		this.yezhuxingming = yezhuxingming;
	}
	
	/**
	 * 获取：业主姓名
	 */
	public String getYezhuxingming() {
		return yezhuxingming;
	}
				
	
	/**
	 * 设置：当前体温
	 */
	 
	public void setDangqiantiwen(String dangqiantiwen) {
		this.dangqiantiwen = dangqiantiwen;
	}
	
	/**
	 * 获取：当前体温
	 */
	public String getDangqiantiwen() {
		return dangqiantiwen;
	}
				
	
	/**
	 * 设置：咳嗽
	 */
	 
	public void setKesou(String kesou) {
		this.kesou = kesou;
	}
	
	/**
	 * 获取：咳嗽
	 */
	public String getKesou() {
		return kesou;
	}
				
	
	/**
	 * 设置：出入风险区域
	 */
	 
	public void setChurufengxianquyu(String churufengxianquyu) {
		this.churufengxianquyu = churufengxianquyu;
	}
	
	/**
	 * 获取：出入风险区域
	 */
	public String getChurufengxianquyu() {
		return churufengxianquyu;
	}
				
	
	/**
	 * 设置：接触病患
	 */
	 
	public void setJiechubinghuan(String jiechubinghuan) {
		this.jiechubinghuan = jiechubinghuan;
	}
	
	/**
	 * 获取：接触病患
	 */
	public String getJiechubinghuan() {
		return jiechubinghuan;
	}
				
	
	/**
	 * 设置：当前位置
	 */
	 
	public void setDangqianweizhi(String dangqianweizhi) {
		this.dangqianweizhi = dangqianweizhi;
	}
	
	/**
	 * 获取：当前位置
	 */
	public String getDangqianweizhi() {
		return dangqianweizhi;
	}
				
	
	/**
	 * 设置：打卡备注
	 */
	 
	public void setDakabeizhu(String dakabeizhu) {
		this.dakabeizhu = dakabeizhu;
	}
	
	/**
	 * 获取：打卡备注
	 */
	public String getDakabeizhu() {
		return dakabeizhu;
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
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
