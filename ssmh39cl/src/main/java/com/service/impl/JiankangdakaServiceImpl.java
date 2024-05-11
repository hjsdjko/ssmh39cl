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


import com.dao.JiankangdakaDao;
import com.entity.JiankangdakaEntity;
import com.service.JiankangdakaService;
import com.entity.vo.JiankangdakaVO;
import com.entity.view.JiankangdakaView;

@Service("jiankangdakaService")
public class JiankangdakaServiceImpl extends ServiceImpl<JiankangdakaDao, JiankangdakaEntity> implements JiankangdakaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangdakaEntity> page = this.selectPage(
                new Query<JiankangdakaEntity>(params).getPage(),
                new EntityWrapper<JiankangdakaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangdakaEntity> wrapper) {
		  Page<JiankangdakaView> page =new Query<JiankangdakaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangdakaVO> selectListVO(Wrapper<JiankangdakaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangdakaVO selectVO(Wrapper<JiankangdakaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangdakaView> selectListView(Wrapper<JiankangdakaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangdakaView selectView(Wrapper<JiankangdakaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
