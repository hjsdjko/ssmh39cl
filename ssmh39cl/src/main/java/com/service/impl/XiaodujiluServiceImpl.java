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


import com.dao.XiaodujiluDao;
import com.entity.XiaodujiluEntity;
import com.service.XiaodujiluService;
import com.entity.vo.XiaodujiluVO;
import com.entity.view.XiaodujiluView;

@Service("xiaodujiluService")
public class XiaodujiluServiceImpl extends ServiceImpl<XiaodujiluDao, XiaodujiluEntity> implements XiaodujiluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaodujiluEntity> page = this.selectPage(
                new Query<XiaodujiluEntity>(params).getPage(),
                new EntityWrapper<XiaodujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaodujiluEntity> wrapper) {
		  Page<XiaodujiluView> page =new Query<XiaodujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaodujiluVO> selectListVO(Wrapper<XiaodujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaodujiluVO selectVO(Wrapper<XiaodujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaodujiluView> selectListView(Wrapper<XiaodujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaodujiluView selectView(Wrapper<XiaodujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
