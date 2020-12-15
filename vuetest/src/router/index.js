import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import PageOne from "../views/PageOne";
import PageTwo from "../views/PageTwo";
import App from "../App";
import index from "../views/index"
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: '导航一',
    redirect:'PageOne',
    component: index,
    children:[
      {
        path:'/PageOne',
        name:'页面一',
        component: PageOne
      },
      {
        path:'/PageTwo',
        name:'页面二',
        component:PageTwo
      }
    ]
  }

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
