package com.dao;

import com.entity.YiqingfenbuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingfenbuVO;
import com.entity.view.YiqingfenbuView;


/**
 * 疫情分布
 * 
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface YiqingfenbuDao extends BaseMapper<YiqingfenbuEntity> {
	
	List<YiqingfenbuVO> selectListVO(@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
	
	YiqingfenbuVO selectVO(@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
	
	List<YiqingfenbuView> selectListView(@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);

	List<YiqingfenbuView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
	
	YiqingfenbuView selectView(@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YiqingfenbuEntity> wrapper);
}
