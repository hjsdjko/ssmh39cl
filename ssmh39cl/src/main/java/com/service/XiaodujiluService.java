package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaodujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaodujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaodujiluView;


/**
 * 消毒记录
 *
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface XiaodujiluService extends IService<XiaodujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaodujiluVO> selectListVO(Wrapper<XiaodujiluEntity> wrapper);
   	
   	XiaodujiluVO selectVO(@Param("ew") Wrapper<XiaodujiluEntity> wrapper);
   	
   	List<XiaodujiluView> selectListView(Wrapper<XiaodujiluEntity> wrapper);
   	
   	XiaodujiluView selectView(@Param("ew") Wrapper<XiaodujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaodujiluEntity> wrapper);
   	

}

