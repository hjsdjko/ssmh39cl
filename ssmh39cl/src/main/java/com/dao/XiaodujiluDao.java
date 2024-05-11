package com.dao;

import com.entity.XiaodujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaodujiluVO;
import com.entity.view.XiaodujiluView;


/**
 * 消毒记录
 * 
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface XiaodujiluDao extends BaseMapper<XiaodujiluEntity> {
	
	List<XiaodujiluVO> selectListVO(@Param("ew") Wrapper<XiaodujiluEntity> wrapper);
	
	XiaodujiluVO selectVO(@Param("ew") Wrapper<XiaodujiluEntity> wrapper);
	
	List<XiaodujiluView> selectListView(@Param("ew") Wrapper<XiaodujiluEntity> wrapper);

	List<XiaodujiluView> selectListView(Pagination page,@Param("ew") Wrapper<XiaodujiluEntity> wrapper);
	
	XiaodujiluView selectView(@Param("ew") Wrapper<XiaodujiluEntity> wrapper);
	

}
