package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaigouwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaigouwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaigouwupinView;


/**
 * 代购物品
 *
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface DaigouwupinService extends IService<DaigouwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaigouwupinVO> selectListVO(Wrapper<DaigouwupinEntity> wrapper);
   	
   	DaigouwupinVO selectVO(@Param("ew") Wrapper<DaigouwupinEntity> wrapper);
   	
   	List<DaigouwupinView> selectListView(Wrapper<DaigouwupinEntity> wrapper);
   	
   	DaigouwupinView selectView(@Param("ew") Wrapper<DaigouwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaigouwupinEntity> wrapper);
   	

}

