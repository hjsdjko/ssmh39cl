import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import yezhu from '@/views/modules/yezhu/list'
    import xiaodujilu from '@/views/modules/xiaodujilu/list'
    import yiqingfenbu from '@/views/modules/yiqingfenbu/list'
    import daigouwupin from '@/views/modules/daigouwupin/list'
    import churudengji from '@/views/modules/churudengji/list'
    import jubaoxinxi from '@/views/modules/jubaoxinxi/list'
    import config from '@/views/modules/config/list'
    import laifangdengji from '@/views/modules/laifangdengji/list'
    import jiankangdaka from '@/views/modules/jiankangdaka/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '公告资讯',
        component: news
      }
      ,{
	path: '/yezhu',
        name: '业主',
        component: yezhu
      }
      ,{
	path: '/xiaodujilu',
        name: '消毒记录',
        component: xiaodujilu
      }
      ,{
	path: '/yiqingfenbu',
        name: '疫情分布',
        component: yiqingfenbu
      }
      ,{
	path: '/daigouwupin',
        name: '代购物品',
        component: daigouwupin
      }
      ,{
	path: '/churudengji',
        name: '出入登记',
        component: churudengji
      }
      ,{
	path: '/jubaoxinxi',
        name: '举报信息',
        component: jubaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/laifangdengji',
        name: '来访登记',
        component: laifangdengji
      }
      ,{
	path: '/jiankangdaka',
        name: '健康打卡',
        component: jiankangdaka
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
