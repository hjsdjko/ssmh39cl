package com.dao;

import com.entity.ChurudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChurudengjiVO;
import com.entity.view.ChurudengjiView;


/**
 * 出入登记
 * 
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
public interface ChurudengjiDao extends BaseMapper<ChurudengjiEntity> {
	
	List<ChurudengjiVO> selectListVO(@Param("ew") Wrapper<ChurudengjiEntity> wrapper);
	
	ChurudengjiVO selectVO(@Param("ew") Wrapper<ChurudengjiEntity> wrapper);
	
	List<ChurudengjiView> selectListView(@Param("ew") Wrapper<ChurudengjiEntity> wrapper);

	List<ChurudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChurudengjiEntity> wrapper);
	
	ChurudengjiView selectView(@Param("ew") Wrapper<ChurudengjiEntity> wrapper);
	

}
