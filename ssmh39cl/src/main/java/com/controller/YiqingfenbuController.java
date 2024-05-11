package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YiqingfenbuEntity;
import com.entity.view.YiqingfenbuView;

import com.service.YiqingfenbuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 疫情分布
 * 后端接口
 * @author 
 * @email 
 * @date 2022-02-19 10:14:20
 */
@RestController
@RequestMapping("/yiqingfenbu")
public class YiqingfenbuController {
    @Autowired
    private YiqingfenbuService yiqingfenbuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YiqingfenbuEntity yiqingfenbu, 
		HttpServletRequest request){

        EntityWrapper<YiqingfenbuEntity> ew = new EntityWrapper<YiqingfenbuEntity>();
		PageUtils page = yiqingfenbuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiqingfenbu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YiqingfenbuEntity yiqingfenbu, 
		HttpServletRequest request){
        EntityWrapper<YiqingfenbuEntity> ew = new EntityWrapper<YiqingfenbuEntity>();
		PageUtils page = yiqingfenbuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yiqingfenbu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YiqingfenbuEntity yiqingfenbu){
       	EntityWrapper<YiqingfenbuEntity> ew = new EntityWrapper<YiqingfenbuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yiqingfenbu, "yiqingfenbu")); 
        return R.ok().put("data", yiqingfenbuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YiqingfenbuEntity yiqingfenbu){
        EntityWrapper< YiqingfenbuEntity> ew = new EntityWrapper< YiqingfenbuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yiqingfenbu, "yiqingfenbu")); 
		YiqingfenbuView yiqingfenbuView =  yiqingfenbuService.selectView(ew);
		return R.ok("查询疫情分布成功").put("data", yiqingfenbuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YiqingfenbuEntity yiqingfenbu = yiqingfenbuService.selectById(id);
        return R.ok().put("data", yiqingfenbu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YiqingfenbuEntity yiqingfenbu = yiqingfenbuService.selectById(id);
        return R.ok().put("data", yiqingfenbu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YiqingfenbuEntity yiqingfenbu, HttpServletRequest request){
    	yiqingfenbu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiqingfenbu);

        yiqingfenbuService.insert(yiqingfenbu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YiqingfenbuEntity yiqingfenbu, HttpServletRequest request){
    	yiqingfenbu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yiqingfenbu);

        yiqingfenbuService.insert(yiqingfenbu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YiqingfenbuEntity yiqingfenbu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yiqingfenbu);
        yiqingfenbuService.updateById(yiqingfenbu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yiqingfenbuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YiqingfenbuEntity> wrapper = new EntityWrapper<YiqingfenbuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = yiqingfenbuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<YiqingfenbuEntity> ew = new EntityWrapper<YiqingfenbuEntity>();
        List<Map<String, Object>> result = yiqingfenbuService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<YiqingfenbuEntity> ew = new EntityWrapper<YiqingfenbuEntity>();
        List<Map<String, Object>> result = yiqingfenbuService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<YiqingfenbuEntity> ew = new EntityWrapper<YiqingfenbuEntity>();
        List<Map<String, Object>> result = yiqingfenbuService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }
}
