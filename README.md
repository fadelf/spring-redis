## Project Title

Simple Redis Implementation Project.

### Description

A simple CRUD program using Redis and deployment on CentOS 7 server.

### Getting Started

#### Dependencies

* Java installed on your server
* You need to install and configure Redis on your server

#### Installing Redis on CentOS 7

This installation step is for CentOS 7, other Linux distribution might be different

* Enable the Remi repository
```
sudo yum install epel-release yum-utils
sudo yum install http://rpms.remirepo.net/enterprise/remi-release-7.rpm
sudo yum-config-manager --enable remi
```
* Install redis package
```
sudo yum install redis
```
* After installation is completed, start Redis and enable it
```
sudo systemctl start redis
sudo systemctl enable redis
```
* Make sure Redis is running
```
sudo systemctl status redis
```

### Executing program

* Compile program to download and install required dependencies
```
mvn clean install
```
* Upload your java jar file to server and run command below
```
nohup java -jar [your jar file name] &
```
* It will also created nohup.out file to see your application log

## Help

Common problems or issues.
* This application default port 8081 might be used by another application on your server
* Redis default port is 6379 might be used by another application on your server
* Don't forget to set your Redis password in RedisConfig.java file

## Authors

Fadhel Faturrahman

## Version History

* 0.1
    * Initial Release

## License

This project does't have some license

## Acknowledgments

[https://linuxize.com/post/how-to-install-and-configure-redis-on-centos-7/]