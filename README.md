项目说明


1.使用spring结合quartz设计分布式环境下定时任务，使用quartz集群进行开发，保证分布式环境下，任务不会被重复触发；

2.需要默认初始化quartz要求的11张表；

3.常见的定时任务:
    3.1：每天固定几点定时执行某项任务，比如统计报表；
    3.2：固定间隔时间执行某项任务，比如导入开班，定时半个小时执行已经导入报班的数据，进行订单的创建；
    
    
    
知识总结：


1.
