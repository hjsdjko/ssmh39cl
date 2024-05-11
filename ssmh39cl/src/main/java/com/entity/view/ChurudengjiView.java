package com.entity.view;

import com.entity.ChurudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 出入登记
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@TableName("churudengji")
public class ChurudengjiView  extends ChurudengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChurudengjiView(){
	}
 
 	public ChurudengjiView(ChurudengjiEntity churudengjiEntity){
 	try {
			BeanUtils.copyProperties(this, churudengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
