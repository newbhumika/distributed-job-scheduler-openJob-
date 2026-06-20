

<p align="center">
  A distributed task scheduling framework.
</p>


## Introduction
**Openjob** is A distributed and high-performance task scheduling framework that supports multiple cronjob, delay task, workflow, lightweight distributed computing, unlimited horizontal scaling, with high scalability and fault tolerance. Also has permission management, powerful alarm monitoring, and support multiple languages.
* High reliability
  * Distributed with stateless design, using the Master/Worker architecture, supports multiple databases (MySQL/PostgreSQL/Oracle)
* High performance
  * System uses a consistency sharding algorithm, lock-free design, task scheduling is accurate down to the second, supporting lightweight distributed computing and unlimited horizontal scaling
* Cronjob
  * Supports distributed cronjob, fixed rate tasks, high-performance second tasks, and onetime tasks
* Distributed computing
  * Supports multiple distributed programming models such as standalone, broadcast, Map, MapReduce, and sharding, easy to complete distributed computing for big data
* Delay task
  * High performance delay task based on Redis , support multi-level storage, and provides rich statistics and reports
* Workflow
  * Supports workflow scheduling engine, visual DAG design, and easy to complete complex task scheduling
* Permission management
  * User management, supports menu, button, and data permission settings, flexible management of user permissions
* Alarm monitoring
  * Overall monitoring metrics, rich and alarm in time, easy to locate and resolve online problem
* Multiple languages
  * Support multiple languages such as Java, Go, PHP, and Python, as well as build with frameworks such as Spring Boot, Gin, and Swoft
## Open source
|**Item**|**Quartz**|**Elastic-Job**|**XXL-JOB**|**Openjob**|
| ----- | ----- | ----- | ----- | ----- |
|Cronjob|Cron|Cron|Cron|* Cronjob<br>* second<br>* Onetime<br>* Fixed rate|
|Delay task|No|No|No|Distributed, high-performance delay task  based on Redis|
|Workflow|No|No|No|Workflow design with UI|
|Distributed Computing|No|Sharding|Sharding|* Broadcast<br>* Map/MapReduce<br>* Sharding|
|Multiple languages|Java|* Java<br>* Shell|* Java<br>* Shell|* Java<br>* Go(Gin、beego)<br>* PHP(Swoft)<br>* Python(Agent)<br>* Shell<br>* HTTP<br>* Kettle|
|Visualization|No|Weak|* Task history<br>* Task log（Not support storage）<br>* Dashboard|* Task history<br><br>* Task log（support H2/Mysql/Elasticsearch）<br>* Dashboard<br>* Full permissions<br>* Task log stack|
|Manageable|No|enable、disable task|* enable、disable task<br>* execute once<br>* stop|* enable、disable task<br>* execute once<br>* kill<br>* stop|
|Alarms|No|email|email|* custom event<br>* email<br>* webhook|
|Performance|Every task scheduling try to acquire a lock through the database, causes a high pressure on the database|ZooKeeper  is performance bottleneck|Task scheduling is only by master, causes a high pressure on master|Uses sharding algorithm, each node can be scheduled without lock, supports unlimited horizontal scaling, and supports big task scheduling|



Openjob is under the Apache 2.0 license. See the [LICENSE](LICENSE) file for details.


