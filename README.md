# shardingsphere-v540-readwrite-splitting-test

- For https://github.com/dynamic-datasource/dynamic-datasource-samples/pull/28
  and https://github.com/apache/shardingsphere/issues/27955 .

- Run the following command on the Ubuntu 22.04.3 instance.

```shell
sudo apt install unzip zip curl sed -y
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 17.0.8-graalce
sdk use java 17.0.8-graalce

git clone git@github.com:linghengqian/shardingsphere-v540-readwrite-splitting-test.git
cd ./shardingsphere-v540-readwrite-splitting-test/
./mvnw clean test
```

- Error Log as follows.

```shell
$ ./mvnw clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------< com.lingh:shardingsphere-v540-readwrite-splitting-test >-------
[INFO] Building shardingsphere-v540-readwrite-splitting-test 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.2.0:clean (default-clean) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Deleting /home/linghengqian/TwinklingLiftWorks/git/public/shardingsphere-v540-readwrite-splitting-test/target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 2 resources from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Changes detected - recompiling the module! :source
[INFO] Compiling 3 source files with javac [debug release 17] to target/classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] skip non existing resourceDirectory /home/linghengqian/TwinklingLiftWorks/git/public/shardingsphere-v540-readwrite-splitting-test/src/test/resources
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Changes detected - recompiling the module! :dependency
[INFO] Compiling 2 source files with javac [debug release 17] to target/test-classes
[INFO] 
[INFO] --- surefire:3.0.0:test (default-test) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests
19:39:03.447 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests]: ShardingsphereV540ReadwriteSplittingTestApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
19:39:03.538 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplication for test class com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.2)

2023-08-28T19:39:03.929+08:00  INFO 72602 --- [           main] 40ReadwriteSplittingTestApplicationTests : Starting ShardingsphereV540ReadwriteSplittingTestApplicationTests using Java 17.0.8 with PID 72602 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/shardingsphere-v540-readwrite-splitting-test)
2023-08-28T19:39:03.931+08:00  INFO 72602 --- [           main] 40ReadwriteSplittingTestApplicationTests : No active profile set, falling back to 1 default profile: "default"
2023-08-28T19:39:05.524+08:00  INFO 72602 --- [           main] 40ReadwriteSplittingTestApplicationTests : Started ShardingsphereV540ReadwriteSplittingTestApplicationTests in 1.862 seconds (process running for 2.885)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.947 s - in com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests
[INFO] Running com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
2023-08-28T19:39:06.256+08:00  INFO 72602 --- [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests]: MapperLayerTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2023-08-28T19:39:06.260+08:00  INFO 72602 --- [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplication for test class com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
2023-08-28T19:39:06.294+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-28T19:39:06.602+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2023-08-28T19:39:06.751+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-2 - Added connection conn0: url=jdbc:h2:mem:config user=SA
2023-08-28T19:39:06.753+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2023-08-28T19:39:06.835+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2023-08-28T19:39:06.854+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-3 - Added connection conn1: url=jdbc:h2:mem:master user=SA
2023-08-28T19:39:06.855+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2023-08-28T19:39:06.855+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Starting...
2023-08-28T19:39:06.861+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-4 - Added connection conn3: url=jdbc:h2:mem:slave1 user=SA
2023-08-28T19:39:06.862+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Start completed.
2023-08-28T19:39:06.862+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Starting...
2023-08-28T19:39:06.870+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-5 - Added connection conn5: url=jdbc:h2:mem:slave2 user=SA
2023-08-28T19:39:06.871+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Start completed.
2023-08-28T19:39:08.324+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (getNetworkTimeout)
2023-08-28T19:39:08.325+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.apache.shardingsphere.driver.jdbc.core.connection.ShardingSphereConnection@605c2b9f
2023-08-28T19:39:08.326+08:00  INFO 72602 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.774 s - in com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  10.292 s
[INFO] Finished at: 2023-08-28T19:39:09+08:00
[INFO] ------------------------------------------------------------------------
```