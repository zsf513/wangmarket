package com.xnx3.admin.generateCache;

import org.springframework.stereotype.Component;
import com.xnx3.j2ee.generateCache.BaseGenerate;

/**
 * 模版页面
 * @author 管雷鸣
 */
@Component
public class TemplatePage extends BaseGenerate{
	
	public TemplatePage() {
		type();
	}
	
	public void type(){
		createCacheObject("type");
		cacheAdd(com.xnx3.admin.entity.TemplatePage.TYPE_INDEX, "首页模版");
		cacheAdd(com.xnx3.admin.entity.TemplatePage.TYPE_NEWS_LIST, "列表页模版");
		cacheAdd(com.xnx3.admin.entity.TemplatePage.TYPE_NEWS_VIEW, "详情页模版");
		generateCacheFile();
	}
}
