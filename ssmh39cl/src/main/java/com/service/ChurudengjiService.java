package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChurudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChurudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChurudengjiView;


/**
 * 出入登记
 *
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface ChurudengjiService extends IService<ChurudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChurudengjiVO> selectListVO(Wrapper<ChurudengjiEntity> wrapper);
   	
   	ChurudengjiVO selectVO(@Param("ew") Wrapper<ChurudengjiEntity> wrapper);
   	
   	List<ChurudengjiView> selectListView(Wrapper<ChurudengjiEntity> wrapper);
   	
   	ChurudengjiView selectView(@Param("ew") Wrapper<ChurudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChurudengjiEntity> wrapper);
   	

}

