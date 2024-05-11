package com.dao;

import com.entity.DaigouwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaigouwupinVO;
import com.entity.view.DaigouwupinView;


/**
 * 代购物品
 * 
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface DaigouwupinDao extends BaseMapper<DaigouwupinEntity> {
	
	List<DaigouwupinVO> selectListVO(@Param("ew") Wrapper<DaigouwupinEntity> wrapper);
	
	DaigouwupinVO selectVO(@Param("ew") Wrapper<DaigouwupinEntity> wrapper);
	
	List<DaigouwupinView> selectListView(@Param("ew") Wrapper<DaigouwupinEntity> wrapper);

	List<DaigouwupinView> selectListView(Pagination page,@Param("ew") Wrapper<DaigouwupinEntity> wrapper);
	
	DaigouwupinView selectView(@Param("ew") Wrapper<DaigouwupinEntity> wrapper);
	

}
