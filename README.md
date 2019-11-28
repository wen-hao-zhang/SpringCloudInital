# SpringCloudInital
Base foundation application bone for SpringCloud project

  SpringCloudInitial 说明书

1、	GitHub地址https://github.com/wen-hao-zhang/SpringCloudInital
2、	discSystem-3(端口为12345)及discSystem-33(端口为12346)项目为Enurek(SpingCloud注册服务)服务集群，对外提供服务注册及发现功能。其中一台出现宕机后，另外一台仍然可以提供消息注册服务
3、	discSystem-4及discSystem-5为对外提供服务的微服务，可以在Enurek管理界面看到它们的运行状态
4、	Ribbon为负载均衡(端口12347)也是注册于Enurek,通过访问Ribbon的API，Ribbon会根据负载情况向discSystem-4及discSystem-5发起请求
为防止雪崩效应，在Ribbon中增加了熔断器，即在出现服务异常时，熔断器会返回回调结果给客户端
5、	Service-feign项目也是融合和Ribbon，可以起到负载均衡作用
6、	Service-zuul是本项目中的路由器，通过调用路由所提供的的端口，可以访问不同的服务
7、	Config-server为本项目的配置中心，通过它来读取配置在GIthub的配置信息
8、	Config-client配置了通过消息总线，将消息通过RabbitMq消息队列向后端发起请求，实现消息消费的不丢失以及重复消费
9、	在service-hi及service-miya引入了了服务追踪，系统会记录下服务调用的日志

