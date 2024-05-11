package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DaigouwupinDao;
import com.entity.DaigouwupinEntity;
import com.service.DaigouwupinService;
import com.entity.vo.DaigouwupinVO;
import com.entity.view.DaigouwupinView;

@Service("daigouwupinService")
public class DaigouwupinServiceImpl extends ServiceImpl<DaigouwupinDao, DaigouwupinEntity> implements DaigouwupinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaigouwupinEntity> page = this.selectPage(
                new Query<DaigouwupinEntity>(params).getPage(),
                new EntityWrapper<DaigouwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaigouwupinEntity> wrapper) {
		  Page<DaigouwupinView> page =new Query<DaigouwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaigouwupinVO> selectListVO(Wrapper<DaigouwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaigouwupinVO selectVO(Wrapper<DaigouwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaigouwupinView> selectListView(Wrapper<DaigouwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaigouwupinView selectView(Wrapper<DaigouwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
