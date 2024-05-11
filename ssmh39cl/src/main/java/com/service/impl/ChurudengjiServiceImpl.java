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


import com.dao.ChurudengjiDao;
import com.entity.ChurudengjiEntity;
import com.service.ChurudengjiService;
import com.entity.vo.ChurudengjiVO;
import com.entity.view.ChurudengjiView;

@Service("churudengjiService")
public class ChurudengjiServiceImpl extends ServiceImpl<ChurudengjiDao, ChurudengjiEntity> implements ChurudengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChurudengjiEntity> page = this.selectPage(
                new Query<ChurudengjiEntity>(params).getPage(),
                new EntityWrapper<ChurudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChurudengjiEntity> wrapper) {
		  Page<ChurudengjiView> page =new Query<ChurudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChurudengjiVO> selectListVO(Wrapper<ChurudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChurudengjiVO selectVO(Wrapper<ChurudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChurudengjiView> selectListView(Wrapper<ChurudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChurudengjiView selectView(Wrapper<ChurudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
