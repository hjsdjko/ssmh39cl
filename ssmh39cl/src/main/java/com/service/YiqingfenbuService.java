package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingfenbuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingfenbuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingfenbuView;


/**
 * 疫情分布
 *
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface YiqingfenbuService extends IService<YiqingfenbuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingfenbuVO> selectListVO(Wrapper<YiqingfenbuEntity> wrapper);
   	
   	YiqingfenbuVO selectVO(@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
   	
   	List<YiqingfenbuView> selectListView(Wrapper<YiqingfenbuEntity> wrapper);
   	
   	YiqingfenbuView selectView(@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingfenbuEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YiqingfenbuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YiqingfenbuEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YiqingfenbuEntity> wrapper);
}

