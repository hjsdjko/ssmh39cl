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


import com.dao.YiqingfenbuDao;
import com.entity.YiqingfenbuEntity;
import com.service.YiqingfenbuService;
import com.entity.vo.YiqingfenbuVO;
import com.entity.view.YiqingfenbuView;

@Service("yiqingfenbuService")
public class YiqingfenbuServiceImpl extends ServiceImpl<YiqingfenbuDao, YiqingfenbuEntity> implements YiqingfenbuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingfenbuEntity> page = this.selectPage(
                new Query<YiqingfenbuEntity>(params).getPage(),
                new EntityWrapper<YiqingfenbuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingfenbuEntity> wrapper) {
		  Page<YiqingfenbuView> page =new Query<YiqingfenbuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingfenbuVO> selectListVO(Wrapper<YiqingfenbuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingfenbuVO selectVO(Wrapper<YiqingfenbuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingfenbuView> selectListView(Wrapper<YiqingfenbuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingfenbuView selectView(Wrapper<YiqingfenbuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YiqingfenbuEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YiqingfenbuEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YiqingfenbuEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
