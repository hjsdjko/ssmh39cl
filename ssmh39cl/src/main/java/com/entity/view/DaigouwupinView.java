package com.entity.view;

import com.entity.DaigouwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 代购物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@TableName("daigouwupin")
public class DaigouwupinView  extends DaigouwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaigouwupinView(){
	}
 
 	public DaigouwupinView(DaigouwupinEntity daigouwupinEntity){
 	try {
			BeanUtils.copyProperties(this, daigouwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
