#开始须知
			需要账号密码直接QQ我
##聚合数据接口
* 具体详情请看： 
			
			https://www.juhe.cn/docs/index/otherid/1/page/1（这个是所有免费的数据接口）
			下面的是新闻数据：
			https://www.juhe.cn/docs/api/id/235
* 下面是例子： 
		
			APPKEY: 3d8383e9bb20838bb75901ad7e5f27f9
			请求方式：get/post 都可以（上次测试的时候是20条数据，更新不频繁，只需要下拉刷新就OK了）
			请求示例：http://v.juhe.cn/toutiao/index?type=top&key=APPKEY
			

##天狗云接口
	好像挂了
##干货集中营接口
* 具体详情请看： 
			 
			http://gank.io/api
* 下面是例子：
			
			分类数据: http://gank.io/api/data/数据类型/请求个数/第几页
			数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
			请求个数： 数字，大于0
			第几页：数字，大于0
			例：
			http://gank.io/api/data/Android/10/1
			http://gank.io/api/data/福利/10/1
			http://gank.io/api/data/iOS/20/2
			http://gank.io/api/data/all/20/
			应该很容易实现上拉加载更多了 可以分页加载
##心知天气API
* 具体详情请看： 
			 
			http://www.thinkpage.cn/doc （还自带各种天气样式的图标下载）
			
##知乎日报数据接口
* 具体详情请看： 
		 
		https://github.com/izzyleung/ZhihuDailyPurify/wiki/
		%E7%9F%A5%E4%B9%8E%E6%97%A5%E6%8A%A5-API-%E5%88%86%E6%9E%90
##貌似有视频接口
		
		http://www.apifree.net/	
## 其他的知道在更新。			