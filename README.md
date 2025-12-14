# shardingsphere-v540-readwrite-splitting-test

- For https://github.com/dynamic-datasource/dynamic-datasource-samples/pull/28
  and https://github.com/apache/shardingsphere/issues/27955 .

- Execute the following `PowerShell 7` command on the `Windows 11 Home 25H2` instance with `PowerShell/PowerShell`,
  `version-fox/vfox`, `git-for-windows/git` and `rancher-sandbox/rancher-desktop` installed.

```shell
vfox add java
vfox install java@21.0.9-ms
vfox use --global java@21.0.9-ms

git clone git@github.com:linghengqian/shardingsphere-v540-readwrite-splitting-test.git
cd ./shardingsphere-v540-readwrite-splitting-test/
./mvnw clean test
```

- Error Log as follows.

```shell
PS D:\TwinklingLiftWorks\git\public\shardingsphere-v540-readwrite-splitting-test> ./mvnw clean test
[INFO] Scanning for projects...
[INFO] 
[INFO] -------< com.lingh:shardingsphere-v540-readwrite-splitting-test >-------
[INFO] Building shardingsphere-v540-readwrite-splitting-test 0.0.1-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- clean:3.5.0:clean (default-clean) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Deleting D:\TwinklingLiftWorks\git\public\shardingsphere-v540-readwrite-splitting-test\target
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 3 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.14.1:compile (default-compile) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 4 source files with javac [debug parameters release 21] to target\classes
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] skip non existing resourceDirectory D:\TwinklingLiftWorks\git\public\shardingsphere-v540-readwrite-splitting-test\src\test\resources
[INFO] 
[INFO] --- compiler:3.14.1:testCompile (default-testCompile) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 1 source file with javac [debug parameters release 21] to target\test-classes
[INFO] 
[INFO] --- surefire:3.5.4:test (default-test) @ shardingsphere-v540-readwrite-splitting-test ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
22:59:21.684 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests]: MapperLayerTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
22:59:21.789 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplication for test class com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.0)

2025-12-14T22:59:22.148+08:00  INFO 10628 --- [           main] c.l.s.MapperLayerTests                   : Starting MapperLayerTests using Java 21.0.9 with PID 10628 (started by lingh in D:\TwinklingLiftWorks\git\public\shardingsphere-v540-readwrite-splitting-test)
2025-12-14T22:59:22.149+08:00  INFO 10628 --- [           main] c.l.s.MapperLayerTests                   : No active profile set, falling back to 1 default profile: "default"
2025-12-14T22:59:23.498+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-12-14T22:59:23.814+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2025-12-14T22:59:23.958+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-2 - Added connection conn0: url=jdbc:h2:mem:config user=SA
2025-12-14T22:59:23.960+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2025-12-14T22:59:23.998+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2025-12-14T22:59:24.024+08:00  INFO 10628 --- [           main] org.testcontainers.images.PullPolicy     : Image pull policy will be performed by: DefaultPullPolicy()
2025-12-14T22:59:24.026+08:00  INFO 10628 --- [           main] o.t.utility.ImageNameSubstitutor         : Image name substitution will be performed by: DefaultImageNameSubstitutor (composite of 'ConfigurationFileImageNameSubstitutor' and 'PrefixingImageNameSubstitutor')
2025-12-14T22:59:24.034+08:00  INFO 10628 --- [           main] org.testcontainers.DockerClientFactory   : Testcontainers version: 2.0.2
2025-12-14T22:59:24.186+08:00  INFO 10628 --- [           main] o.t.d.DockerClientProviderStrategy       : Loaded org.testcontainers.dockerclient.NpipeSocketClientProviderStrategy from ~/.testcontainers.properties, will try it first
2025-12-14T22:59:24.585+08:00  INFO 10628 --- [           main] o.t.d.DockerClientProviderStrategy       : Found Docker environment with local Npipe socket (npipe:////./pipe/docker_engine)
2025-12-14T22:59:24.586+08:00  INFO 10628 --- [           main] org.testcontainers.DockerClientFactory   : Docker host IP address is localhost
2025-12-14T22:59:24.607+08:00  INFO 10628 --- [           main] org.testcontainers.DockerClientFactory   : Connected to docker: 
  Server Version: 28.3.3
  API Version: 1.51
  Operating System: Rancher Desktop WSL Distribution
  Total Memory: 15584 MB
2025-12-14T22:59:24.723+08:00  INFO 10628 --- [           main] tc.testcontainers/ryuk:0.13.0            : Creating container for image: testcontainers/ryuk:0.13.0
2025-12-14T22:59:24.780+08:00  INFO 10628 --- [           main] o.t.utility.RegistryAuthLocator          : Credential helper/store (docker-credential-wincred) does not have credentials for https://index.docker.io/v1/
2025-12-14T22:59:24.906+08:00  INFO 10628 --- [           main] tc.testcontainers/ryuk:0.13.0            : Container testcontainers/ryuk:0.13.0 is starting: 609b4f54dc0cebf6e9ae36e0ed4e66f9831203ffb013ce1c3d1e72fd0c74c2f5
2025-12-14T22:59:25.442+08:00  INFO 10628 --- [           main] tc.testcontainers/ryuk:0.13.0            : Container testcontainers/ryuk:0.13.0 started in PT0.7183265S
2025-12-14T22:59:25.448+08:00  INFO 10628 --- [           main] o.t.utility.RyukResourceReaper           : Ryuk started - will monitor and terminate Testcontainers containers on JVM exit
2025-12-14T22:59:25.449+08:00  INFO 10628 --- [           main] org.testcontainers.DockerClientFactory   : Checking the system...
2025-12-14T22:59:25.449+08:00  INFO 10628 --- [           main] org.testcontainers.DockerClientFactory   : ?? Docker server version should be at least 1.6.0
2025-12-14T22:59:25.452+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Creating container for image: mysql:9.4.0-oraclelinux9
2025-12-14T22:59:25.572+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Container mysql:9.4.0-oraclelinux9 is starting: b7d87908d71244e35f30afb3a5ef4241b0d8fc7bd84ee722f81ec876c799b302
2025-12-14T22:59:25.868+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Waiting for database connection to become available at jdbc:mysql://localhost:33515/master using query 'SELECT 1'
2025-12-14T22:59:37.036+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Container mysql:9.4.0-oraclelinux9 started in PT11.5838194S
2025-12-14T22:59:37.036+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Container is started (JDBC URL: jdbc:mysql://localhost:33515/master)
2025-12-14T22:59:37.051+08:00  INFO 10628 --- [           main] org.testcontainers.ext.ScriptUtils       : Executing database script from schema.sql
2025-12-14T22:59:37.110+08:00  INFO 10628 --- [           main] org.testcontainers.ext.ScriptUtils       : Executed database script from schema.sql in 58 ms.
2025-12-14T22:59:37.113+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-3 - Added connection org.testcontainers.jdbc.ConnectionWrapper@3f2a7ca0
2025-12-14T22:59:37.113+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2025-12-14T22:59:39.081+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.apache.shardingsphere.driver.jdbc.core.connection.ShardingSphereConnection@32c1db01
2025-12-14T22:59:39.082+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-12-14T22:59:39.091+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Starting...
2025-12-14T22:59:39.094+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Creating container for image: mysql:9.4.0-oraclelinux9
2025-12-14T22:59:39.197+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Container mysql:9.4.0-oraclelinux9 is starting: a891baa72129ee0b09560e3525d266096becc2066eafe88701c1c84621918abf
2025-12-14T22:59:39.522+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Waiting for database connection to become available at jdbc:mysql://localhost:33516/slave1 using query 'SELECT 1'
2025-12-14T22:59:49.485+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Container mysql:9.4.0-oraclelinux9 started in PT10.3912361S
2025-12-14T22:59:49.486+08:00  INFO 10628 --- [           main] tc.mysql:9.4.0-oraclelinux9              : Container is started (JDBC URL: jdbc:mysql://localhost:33516/slave1)
2025-12-14T22:59:49.495+08:00  INFO 10628 --- [           main] org.testcontainers.ext.ScriptUtils       : Executing database script from schema.sql
2025-12-14T22:59:49.548+08:00  INFO 10628 --- [           main] org.testcontainers.ext.ScriptUtils       : Executed database script from schema.sql in 52 ms.
2025-12-14T22:59:49.549+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-4 - Added connection org.testcontainers.jdbc.ConnectionWrapper@4476e722
2025-12-14T22:59:49.549+08:00  INFO 10628 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Start completed.
2025-12-14T22:59:49.688+08:00  INFO 10628 --- [           main] c.l.s.MapperLayerTests                   : Started MapperLayerTests in 27.789 seconds (process running for 28.769)
Mockito is currently self-attaching to enable the inline-mock-maker. This will no longer work in future releases of the JDK. Please add Mockito as an agent to your build as described in Mockito's documentation: https://javadoc.io/doc/org.mockito/mockito-core/latest/org.mockito/org/mockito/Mockito.html#0.3
WARNING: A Java agent has been loaded dynamically (C:\Users\lingh\.m2\repository\net\bytebuddy\byte-buddy-agent\1.17.8\byte-buddy-agent-1.17.8.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 30.01 s -- in com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  35.390 s
[INFO] Finished at: 2025-12-14T22:59:52+08:00
[INFO] ------------------------------------------------------------------------
```