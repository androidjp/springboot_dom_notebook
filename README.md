> 注意：此分支 用 mongoDB，so，记得开启MongoDB服务[（配置MongoDB过程）](http://blog.csdn.net/ityouknow/article/details/71402893)
## dev运行
* 借助springBoot内置默认tomcat，来启动web项目
  * IDEA 方式：直接点击“RUN” 运行 application main方法, 由于yml配置了端口号，所以是8383端口。【默认在本机的8080端口可访问】
  * cmd方式：`$ mvn spring-boot:run`
  
## deploy 运行
* 打jar包,用java来跑。
  1. `mvn install`
  2. `java -jar target/springboot_demo-0.0.1-SNAPSHOT.jar`
* 打war包, 扔tomcat等跑。
  1. 当然是修改main方法所在的application类，让其继承`SpringBootInitializer`,并重写其`configure()`方法。
  2. 执行 `mvn package`
  3. 在target中拿到war包，直接扔到tomcat中就好。
 
 ## 已实现API
 * 登录
   * 接口: `/user/POST/login`
   * Body:
      ```json
      {
    	  "user_id":"11111",
    	  "password":"123"
      }
      ```
 * 注册
   * 接口: `/user/POST/register`
   * Body:
      ```json
      {
            "email_addr":"",
            "phone_num":"22222",
            "password":"123",
            "nick_name":"Ming"
      }
      ```

