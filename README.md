# ApacheJMeter_rocketmq

#### 介绍
jmeter rocketmq插件

#### 软件架构
软件架构说明
1. 插件中jmeter core采用v5.4.1版本;
2. 插件中rocketmq采用v4.9.0版本；

#### 安装教程
使用此插件需按如下步骤进行
1.  需下载rocketmq-client、rocketmq-common、rocketmq-logging、rocketmq-remoting、netty-all、commons-validator、fastjson包，并放到$JMETER_HOME/lib下。所有包已经下载，在[jar文件](/jar)中可以找到。
2.  项目为maven工程，打包后插件需放到$JMETER_HOME/lib/ext下


#### 使用说明
> rocketmq.jmx 为测试模板文件，可供参考

1.  添加配置元件Rocketmq Connection Configuration，设定rocketmq相关链接参数等，GUI界面有提示；
2.  添加取样器Rocketmq Sampler；
