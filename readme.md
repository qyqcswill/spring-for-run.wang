day01
---
 ## 1 . maven
 - core->lombok
 - web->web
 - maven私服（阿里私服 华为私服）
 - lombok 插件
 
 ## 2 回顾post 和 get 请求
 - get 内容小， 数据是拼接在 url 后面
 - post 数据 放在requestBody 里面
 
 ## 3 目前 的架构：
  - spring-boot
  - spring-mvc
  - 默认占用端口 8080 
  - tomcat 服务器
 ## 工程结构
  - src 源码目录
  - src.main:主要编程目录
  - src.test:写测试目录
  
 ## spring-boot 启动类
  - psvm 启动类 run
  - 404 找不到资源
 ## controller 实现 servlet 的效果
  - @Controller 加在类上面
  - @ReponseBody 消息转换
  - @RequestMapping 资源路径匹配
  - @RequestMapping 重要属性 value ，method
  
 ## @requestParam: 获取 request 参数
  - value: key
  - required: 是否必须，默认true
  - defaultValue: 默认值，如果前台没传相关的参数，就使用默认值
  
