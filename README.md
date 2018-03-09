# 基于SpringBoot 的简单NoteBook Server-part Demo
> 注意：此分支 用 mongoDB，so，记得开启MongoDB服务[（配置MongoDB过程）](http://blog.csdn.net/ityouknow/article/details/71402893)

## SpringBoot 操作简单说明
### （1）dev运行
* 借助springBoot内置默认tomcat，来启动web项目
  * IDEA 方式：直接点击“RUN” 运行 application main方法, 由于yml配置了端口号，所以是8383端口。【默认在本机的8080端口可访问】
  * cmd方式：`$ mvn spring-boot:run`
* 当然，如果有多个.yml文件分别作为dev和prod 的配置，那么，如何用命令来打不同渠道的包呢？
  1. 在你的`prod_application.yml`文件中配置：
    ```yml
    spring:
      profiles:
        active: prod
    ```
  2. cmd输入以下命令即可打对应配置的包：
    ```
    java -jar target/springboot_demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
    ```
### （2）deploy 运行
* 打jar包,用java来跑。
  1. `mvn install`
  2. `java -jar target/springboot_demo-0.0.1-SNAPSHOT.jar`
* 打war包, 扔tomcat等跑。
  1. 当然是修改main方法所在的application类，让其继承`SpringBootInitializer`,并重写其`configure()`方法。
  2. 【此方式不可靠】执行 `mvn package -Dspring.profiles.active=prod` , 即可完成prod配置的打包。
  3. 【方式二：目前只查到这种方式】 就是先去`application.yml`中配置`spring.profiles.active=prod`，然后`mvn clean package`就好了。
  4. 在target中拿到war包，直接扔到tomcat中就好。

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
 * 添加新笔记
   * 接口：`/note/POST`
   * Body:
      ```json
        {
            "author":"33333",
            "title":"微服务入门",
            "content":"xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
        }
      ```
 * 获取第N页的笔记列表（每页最多5条item）
   * 接口：`/note/GET/list/{page}`
   * Response:
      ```json
        {
            "code": 200,
            "message": null,
            "data": [
                {
                    "noteId": "3c241281-10a7-4bac-b270-08739ab1b88a",
                    "title": "微服务入门",
                    "authorId": "33333",
                    "updateTime": "2018-03-01 09:55"
                },
                {
                    "noteId": "9780fed1-89b1-4e32-a122-0ccac5338874",
                    "title": "小朋友看过来",
                    "authorId": "22221",
                    "updateTime": "2018-03-01 09:54"
                }
            ]
        }
      ```