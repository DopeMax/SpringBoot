# Spring Boot干货系列：（一）优雅的入门篇
## 前言
   Spring一直是很火的一个开源框架，在过去的一段时间里，Spring Boot在社区中热度一直很高，所以决定花时间来了解和学习，为自己做技术储备。
## 正文
   首先声明，Spring Boot不是一门新技术，所以不用紧张。从本质上来说，Spring Boot就是Spring,它做了那些没有它你也会去做的Spring Bean配置。它使用“习惯优于配置”（项目中存在大量的配置，此外还内置了一个习惯性的配置，让你无需手动进行配置）的理念让你的项目快速运行起来。使用Spring Boot很容易创建一个独立运行（运行jar,内嵌Servlet容器）、准生产级别的基于Spring框架的项目，使用Spring Boot你可以不用或者只需要很少的Spring配置。
## Spring Boot精要
- 自动配置：针对很多Spring应用程序常见的应用功能，Spring Boot能自动提供相关配置
- 起步依赖：告诉Spring Boot需要什么功能，它就能引入需要的库。
- 命令行界面：这是Spring Boot的可选特性，借此你只需写代码就能完成完整的应用程序，无需传统项目构建。
- Actuator：让你能够深入运行中的Spring Boot应用程序，一套究竟。

详细的我们就不展开，等你爱上后自然会去深入的了解，后续章节我们会一一展开介绍。接下来让我们开搞吧。我已经迫不及待的要尝尝Spring Boot的味道了。
## 系统要求
本系列统一使用Java 1.8，Spring Boot 1.5.1.RELEASE以及Maven3.3.9版本。开发工具使用IDEA
## 光速入门-开发一个web服务
传统Spring MVC开发一个简单的Hello World Web应用程序，应该做什么，能想到一些基本的需求:
- 一个项目结构，其中有一个包含必要依赖的Maven或者Gradle构建文件，最起码要有Spring MVC和Servlet API这些依赖。
- 一个web.xml文件（或者一个WebApplicationInitializer实现），其中声明了Spring的DispatcherServlet。
- 一个启动了Spring MVC的Spring配置
- 一控制器类，以“hello World”相应HTTP请求。
- 一个用于部署应用程序的Web应用服务器，比如Tomcat。

这份清单里面只有一个东西是和Hello World功能相关的，即控制器，剩下的都是Spring开发的Web应用程序必需的通用模板。

接下来看看Spring Boot如何搞定？

很简单，我仅仅只需要非常少的几个配置就可以迅速方便的搭建起来一套web项目。
## 初始化Spring Boot项目
构建一个Sping Boot的Maven项目，强烈推荐Spring Initializr,它从本质上来说就是一个Web应用程序，它能为你生成Spring Boot项目结构。
Spring Initializr有几种用法：
- 通过Web界面使用
    1. 访问：http://start.spring.io/
    2. 选择构建工具Maven Project、Spring Boot版本1.5.1以及一些工程基本信息，可参考下图所示
    ![image](http://upload-images.jianshu.io/upload_images/1637925-8fd3e8f13ba45de6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
    3. 点击Generate Project下载项目压缩包
    
    4. 导入到你的工程，如果是IDEA，则需要：
        1. 菜单中选择File–>New–>Project from Existing Sources...
        2. 选择解压后的项目文件夹，点击OK
        3. 点击Import project from external model并选择Maven，点击Next到底为止。
        4. 若你的环境有多个版本的JDK，注意到选择Java SDK的时候请选择Java 7以上的版本
- 通过IntelliJ IDEA使用(个人推荐)

IntelliJ IDEA是非常流行的IDE，IntelliJ IDEA 14.1已经支持Spring Boot了。

创建Spring Boot操作步骤如下：

在File菜单里面选择 New > Project,然后选择Spring Initializr，接着如下图一步步操作即可。
![image](http://upload-images.jianshu.io/upload_images/1637925-106fd2bbdd0d0cfd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![image](http://upload-images.jianshu.io/upload_images/1637925-2f6daafd0fd15e0e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![image](http://upload-images.jianshu.io/upload_images/1637925-abff3fb18e51cf78.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![image](http://upload-images.jianshu.io/upload_images/1637925-4abbae7dfbc06430.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
## 项目结构
根据上面的操作已经初始化了一个Spring Boot的框架了，项目结构如下：
![image](http://upload-images.jianshu.io/upload_images/1637925-53b06a5289301aea.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

如你所见，项目里面基本没有代码，除了几个空目录外，还包含如下几样东西。
- pom.xml：Maven构建说明文件。
- Chapter1Application.java：一个带有main()方法的类，用于启动应用程序（关键）。
- Chapter1ApplicationTests.java：一个空的Junit测试类，它加载了一个使用Spring Boot字典配置功能的Spring应用程序上下文。
- application.properties：一个空的properties文件，你可以根据需要添加配置属性。