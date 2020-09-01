# Spring-Config
Utilizing Spring's cloud based externalised configuration
## [Overview](https://spring.io/projects/spring-cloud-config)
## [Repo for cloud based config](https://github.com/vkku/config-repo.git)
Spring Cloud Config has an HTTP service:(available on server)
* /{application}/{profile}[/{label}]
* /{application}-{profile}.yml/{label}
* /{application}-{profile}.yml
* /{application}-{profile}.properties/{label}
* /{application}-{profile}.properties


http://localhost:9080/central : Client

http://localhost:8888/central/dev : Server
