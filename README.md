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
19:41:55.634 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests]: ShardingsphereV540ReadwriteSplittingTestApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
19:41:55.728 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplication for test class com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.2)

2023-08-28T19:41:56.123+08:00  INFO 73023 --- [           main] 40ReadwriteSplittingTestApplicationTests : Starting ShardingsphereV540ReadwriteSplittingTestApplicationTests using Java 17.0.8 with PID 73023 (started by linghengqian in /home/linghengqian/TwinklingLiftWorks/git/public/shardingsphere-v540-readwrite-splitting-test)
2023-08-28T19:41:56.125+08:00  INFO 73023 --- [           main] 40ReadwriteSplittingTestApplicationTests : No active profile set, falling back to 1 default profile: "default"
2023-08-28T19:41:57.642+08:00  INFO 73023 --- [           main] 40ReadwriteSplittingTestApplicationTests : Started ShardingsphereV540ReadwriteSplittingTestApplicationTests in 1.794 seconds (process running for 2.81)
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.834 s - in com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplicationTests
[INFO] Running com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
2023-08-28T19:41:58.335+08:00  INFO 73023 --- [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests]: MapperLayerTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2023-08-28T19:41:58.338+08:00  INFO 73023 --- [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration com.lingh.shardingspherev540readwritesplittingtest.ShardingsphereV540ReadwriteSplittingTestApplication for test class com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
2023-08-28T19:41:58.367+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-28T19:41:58.666+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2023-08-28T19:41:58.807+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-2 - Added connection conn0: url=jdbc:h2:mem:config user=SA
2023-08-28T19:41:58.808+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2023-08-28T19:41:58.892+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Starting...
2023-08-28T19:41:58.919+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-3 - Added connection conn2: url=jdbc:h2:mem:master user=SA
2023-08-28T19:41:58.919+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-3 - Start completed.
2023-08-28T19:41:58.919+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Starting...
2023-08-28T19:41:58.924+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-4 - Added connection conn4: url=jdbc:h2:mem:slave1 user=SA
2023-08-28T19:41:58.925+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-4 - Start completed.
2023-08-28T19:41:58.925+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Starting...
2023-08-28T19:41:58.930+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-5 - Added connection conn5: url=jdbc:h2:mem:slave2 user=SA
2023-08-28T19:41:58.931+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-5 - Start completed.
2023-08-28T19:42:00.391+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.pool.PoolBase          : HikariPool-1 - Driver does not support get/set network timeout for connections. (getNetworkTimeout)
2023-08-28T19:42:00.393+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.apache.shardingsphere.driver.jdbc.core.connection.ShardingSphereConnection@30b2d267
2023-08-28T19:42:00.393+08:00  INFO 73023 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
[ERROR] Tests run: 4, Failures: 0, Errors: 4, Skipped: 0, Time elapsed: 2.589 s <<< FAILURE! - in com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests
[ERROR] com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToDeleteById  Time elapsed: 2.519 s  <<< ERROR!
org.springframework.jdbc.UncategorizedSQLException: 

### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper.addAll-Inline
### The error occurred while setting parameters
### SQL: insert into t_order (`name`,user_id) values (?,?)
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
        at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
        at jdk.proxy2/jdk.proxy2.$Proxy66.insert(Unknown Source)
        at org.mybatis.spring.SqlSessionTemplate.insert(SqlSessionTemplate.java:272)
        at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:62)
        at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
        at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
        at jdk.proxy2/jdk.proxy2.$Proxy124.addAll(Unknown Source)
        at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToDeleteById(MapperLayerTests.java:36)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:50)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        Suppressed: org.springframework.jdbc.UncategorizedSQLException: 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: delete from t_order
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
                at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
                at jdk.proxy2/jdk.proxy2.$Proxy66.delete(Unknown Source)
                at org.mybatis.spring.SqlSessionTemplate.delete(SqlSessionTemplate.java:304)
                at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:72)
                at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
                at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
                at jdk.proxy2/jdk.proxy2.$Proxy124.deleteAll(Unknown Source)
                at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.after(MapperLayerTests.java:18)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
                at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
                at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptLifecycleMethod(TimeoutExtension.java:128)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptAfterEachMethod(TimeoutExtension.java:110)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeMethodInExtensionContext(ClassBasedTestDescriptor.java:520)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$synthesizeAfterEachMethodAdapter$24(ClassBasedTestDescriptor.java:510)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAfterEachMethods$10(TestMethodTestDescriptor.java:243)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$13(TestMethodTestDescriptor.java:276)
                at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$14(TestMethodTestDescriptor.java:276)
                at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAllAfterMethodsOrCallbacks(TestMethodTestDescriptor.java:275)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAfterEachMethods(TestMethodTestDescriptor.java:241)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:142)
                ... 49 more
        Caused by: java.sql.SQLException: Unknown exception: null
                at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
                at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
                at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
                at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
                at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
                at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
                at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
                at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
                at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.delete(DefaultSqlSession.java:212)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
                ... 84 more
        Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
                at org.apache.shardingsphere.infra.connection.validator.ShardingSphereMetaDataValidateUtils.validateTableExist(ShardingSphereMetaDataValidateUtils.java:56)
                at org.apache.shardingsphere.sharding.route.engine.validator.dml.impl.ShardingDeleteStatementValidator.preValidate(ShardingDeleteStatementValidator.java:42)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.lambda$createRouteContext0$0(ShardingSQLRouter.java:67)
                at java.base/java.util.Optional.ifPresent(Optional.java:178)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:67)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
                at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
                at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
                ... 98 more
Caused by: java.sql.SQLException: Unknown exception: null
        at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
        at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
        at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
        at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
        at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
        at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
        at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.insert(DefaultSqlSession.java:184)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
        ... 78 more
Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.lambda$appendMissingShardingConditions$1(InsertClauseShardingConditionEngine.java:97)
        at org.apache.shardingsphere.infra.util.exception.ShardingSpherePreconditions.checkState(ShardingSpherePreconditions.java:41)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.appendMissingShardingConditions(InsertClauseShardingConditionEngine.java:97)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.createShardingConditionsWithInsertValues(InsertClauseShardingConditionEngine.java:89)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.createShardingConditions(InsertClauseShardingConditionEngine.java:74)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.ShardingConditionEngine.createShardingConditions(ShardingConditionEngine.java:53)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createShardingConditions(ShardingSQLRouter.java:80)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:65)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
        at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
        at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
        ... 92 more

[ERROR] com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToDeleteAll  Time elapsed: 0.009 s  <<< ERROR!
org.springframework.jdbc.UncategorizedSQLException: 

### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper.addAll-Inline
### The error occurred while setting parameters
### SQL: insert into t_order (`name`,user_id) values (?,?)
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
        at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
        at jdk.proxy2/jdk.proxy2.$Proxy66.insert(Unknown Source)
        at org.mybatis.spring.SqlSessionTemplate.insert(SqlSessionTemplate.java:272)
        at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:62)
        at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
        at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
        at jdk.proxy2/jdk.proxy2.$Proxy124.addAll(Unknown Source)
        at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToDeleteAll(MapperLayerTests.java:49)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:50)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        Suppressed: org.springframework.jdbc.UncategorizedSQLException: 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: delete from t_order
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
                at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
                at jdk.proxy2/jdk.proxy2.$Proxy66.delete(Unknown Source)
                at org.mybatis.spring.SqlSessionTemplate.delete(SqlSessionTemplate.java:304)
                at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:72)
                at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
                at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
                at jdk.proxy2/jdk.proxy2.$Proxy124.deleteAll(Unknown Source)
                at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.after(MapperLayerTests.java:18)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
                at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
                at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptLifecycleMethod(TimeoutExtension.java:128)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptAfterEachMethod(TimeoutExtension.java:110)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeMethodInExtensionContext(ClassBasedTestDescriptor.java:520)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$synthesizeAfterEachMethodAdapter$24(ClassBasedTestDescriptor.java:510)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAfterEachMethods$10(TestMethodTestDescriptor.java:243)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$13(TestMethodTestDescriptor.java:276)
                at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$14(TestMethodTestDescriptor.java:276)
                at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAllAfterMethodsOrCallbacks(TestMethodTestDescriptor.java:275)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAfterEachMethods(TestMethodTestDescriptor.java:241)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:142)
                ... 49 more
        Caused by: java.sql.SQLException: Unknown exception: null
                at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
                at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
                at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
                at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
                at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
                at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
                at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
                at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
                at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.delete(DefaultSqlSession.java:212)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
                ... 84 more
        Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
                at org.apache.shardingsphere.infra.connection.validator.ShardingSphereMetaDataValidateUtils.validateTableExist(ShardingSphereMetaDataValidateUtils.java:56)
                at org.apache.shardingsphere.sharding.route.engine.validator.dml.impl.ShardingDeleteStatementValidator.preValidate(ShardingDeleteStatementValidator.java:42)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.lambda$createRouteContext0$0(ShardingSQLRouter.java:67)
                at java.base/java.util.Optional.ifPresent(Optional.java:178)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:67)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
                at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
                at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
                ... 98 more
Caused by: java.sql.SQLException: Unknown exception: null
        at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
        at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
        at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
        at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
        at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
        at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
        at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.insert(DefaultSqlSession.java:184)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
        ... 78 more
Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.lambda$appendMissingShardingConditions$1(InsertClauseShardingConditionEngine.java:97)
        at org.apache.shardingsphere.infra.util.exception.ShardingSpherePreconditions.checkState(ShardingSpherePreconditions.java:41)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.appendMissingShardingConditions(InsertClauseShardingConditionEngine.java:97)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.createShardingConditionsWithInsertValues(InsertClauseShardingConditionEngine.java:89)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.createShardingConditions(InsertClauseShardingConditionEngine.java:74)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.ShardingConditionEngine.createShardingConditions(ShardingConditionEngine.java:53)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createShardingConditions(ShardingSQLRouter.java:80)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:65)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
        at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
        at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
        ... 92 more

[ERROR] com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToAddByNameAndUserId  Time elapsed: 0.005 s  <<< ERROR!
org.springframework.jdbc.UncategorizedSQLException: 

### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper.addAll-Inline
### The error occurred while setting parameters
### SQL: insert into t_order (`name`,user_id) values (?,?)
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
        at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
        at jdk.proxy2/jdk.proxy2.$Proxy66.insert(Unknown Source)
        at org.mybatis.spring.SqlSessionTemplate.insert(SqlSessionTemplate.java:272)
        at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:62)
        at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
        at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
        at jdk.proxy2/jdk.proxy2.$Proxy124.addAll(Unknown Source)
        at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToAddByNameAndUserId(MapperLayerTests.java:28)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:50)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        Suppressed: org.springframework.jdbc.UncategorizedSQLException: 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: delete from t_order
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
                at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
                at jdk.proxy2/jdk.proxy2.$Proxy66.delete(Unknown Source)
                at org.mybatis.spring.SqlSessionTemplate.delete(SqlSessionTemplate.java:304)
                at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:72)
                at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
                at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
                at jdk.proxy2/jdk.proxy2.$Proxy124.deleteAll(Unknown Source)
                at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.after(MapperLayerTests.java:18)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
                at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
                at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptLifecycleMethod(TimeoutExtension.java:128)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptAfterEachMethod(TimeoutExtension.java:110)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeMethodInExtensionContext(ClassBasedTestDescriptor.java:520)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$synthesizeAfterEachMethodAdapter$24(ClassBasedTestDescriptor.java:510)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAfterEachMethods$10(TestMethodTestDescriptor.java:243)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$13(TestMethodTestDescriptor.java:276)
                at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$14(TestMethodTestDescriptor.java:276)
                at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAllAfterMethodsOrCallbacks(TestMethodTestDescriptor.java:275)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAfterEachMethods(TestMethodTestDescriptor.java:241)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:142)
                ... 49 more
        Caused by: java.sql.SQLException: Unknown exception: null
                at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
                at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
                at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
                at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
                at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
                at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
                at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
                at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
                at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.delete(DefaultSqlSession.java:212)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
                ... 84 more
        Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
                at org.apache.shardingsphere.infra.connection.validator.ShardingSphereMetaDataValidateUtils.validateTableExist(ShardingSphereMetaDataValidateUtils.java:56)
                at org.apache.shardingsphere.sharding.route.engine.validator.dml.impl.ShardingDeleteStatementValidator.preValidate(ShardingDeleteStatementValidator.java:42)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.lambda$createRouteContext0$0(ShardingSQLRouter.java:67)
                at java.base/java.util.Optional.ifPresent(Optional.java:178)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:67)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
                at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
                at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
                ... 98 more
Caused by: java.sql.SQLException: Unknown exception: null
        at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
        at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
        at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
        at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
        at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
        at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
        at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.insert(DefaultSqlSession.java:184)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
        ... 78 more
Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.lambda$appendMissingShardingConditions$1(InsertClauseShardingConditionEngine.java:97)
        at org.apache.shardingsphere.infra.util.exception.ShardingSpherePreconditions.checkState(ShardingSpherePreconditions.java:41)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.appendMissingShardingConditions(InsertClauseShardingConditionEngine.java:97)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.createShardingConditionsWithInsertValues(InsertClauseShardingConditionEngine.java:89)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.InsertClauseShardingConditionEngine.createShardingConditions(InsertClauseShardingConditionEngine.java:74)
        at org.apache.shardingsphere.sharding.route.engine.condition.engine.ShardingConditionEngine.createShardingConditions(ShardingConditionEngine.java:53)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createShardingConditions(ShardingSQLRouter.java:80)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:65)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
        at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
        at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
        ... 92 more

[ERROR] com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToFindAll  Time elapsed: 0.029 s  <<< ERROR!
org.springframework.jdbc.UncategorizedSQLException: 

### Error querying database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: select * from t_order
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
        at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
        at jdk.proxy2/jdk.proxy2.$Proxy66.selectList(Unknown Source)
        at org.mybatis.spring.SqlSessionTemplate.selectList(SqlSessionTemplate.java:224)
        at org.apache.ibatis.binding.MapperMethod.executeForMany(MapperMethod.java:147)
        at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:80)
        at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
        at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
        at jdk.proxy2/jdk.proxy2.$Proxy124.findAll(Unknown Source)
        at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToFindAll(MapperLayerTests.java:23)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:147)
        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:86)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
        at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:217)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:213)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:138)
        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:68)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:147)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:127)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:90)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:55)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:102)
        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:54)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
        at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:50)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148)
        at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122)
        at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385)
        at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162)
        at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507)
        at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495)
        Suppressed: org.springframework.jdbc.UncategorizedSQLException: 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: delete from t_order
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
                at org.mybatis.spring.MyBatisExceptionTranslator.translateExceptionIfPossible(MyBatisExceptionTranslator.java:93)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:439)
                at jdk.proxy2/jdk.proxy2.$Proxy66.delete(Unknown Source)
                at org.mybatis.spring.SqlSessionTemplate.delete(SqlSessionTemplate.java:304)
                at org.apache.ibatis.binding.MapperMethod.execute(MapperMethod.java:72)
                at org.apache.ibatis.binding.MapperProxy$PlainMethodInvoker.invoke(MapperProxy.java:142)
                at org.apache.ibatis.binding.MapperProxy.invoke(MapperProxy.java:86)
                at jdk.proxy2/jdk.proxy2.$Proxy124.deleteAll(Unknown Source)
                at com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.after(MapperLayerTests.java:18)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:727)
                at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
                at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:156)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptLifecycleMethod(TimeoutExtension.java:128)
                at org.junit.jupiter.engine.extension.TimeoutExtension.interceptAfterEachMethod(TimeoutExtension.java:110)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(InterceptingExecutableInvoker.java:103)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.lambda$invoke$0(InterceptingExecutableInvoker.java:93)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
                at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:92)
                at org.junit.jupiter.engine.execution.InterceptingExecutableInvoker.invoke(InterceptingExecutableInvoker.java:86)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeMethodInExtensionContext(ClassBasedTestDescriptor.java:520)
                at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$synthesizeAfterEachMethodAdapter$24(ClassBasedTestDescriptor.java:510)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAfterEachMethods$10(TestMethodTestDescriptor.java:243)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$13(TestMethodTestDescriptor.java:276)
                at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeAllAfterMethodsOrCallbacks$14(TestMethodTestDescriptor.java:276)
                at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAllAfterMethodsOrCallbacks(TestMethodTestDescriptor.java:275)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeAfterEachMethods(TestMethodTestDescriptor.java:241)
                at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:142)
                ... 49 more
        Caused by: java.sql.SQLException: Unknown exception: null
                at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
                at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
                at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
                at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
                at org.apache.ibatis.executor.statement.PreparedStatementHandler.update(PreparedStatementHandler.java:48)
                at org.apache.ibatis.executor.statement.RoutingStatementHandler.update(RoutingStatementHandler.java:75)
                at org.apache.ibatis.executor.SimpleExecutor.doUpdate(SimpleExecutor.java:50)
                at org.apache.ibatis.executor.BaseExecutor.update(BaseExecutor.java:117)
                at org.apache.ibatis.executor.CachingExecutor.update(CachingExecutor.java:76)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.update(DefaultSqlSession.java:197)
                at org.apache.ibatis.session.defaults.DefaultSqlSession.delete(DefaultSqlSession.java:212)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
                at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
                at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
                at java.base/java.lang.reflect.Method.invoke(Method.java:568)
                at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
                ... 84 more
        Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
                at org.apache.shardingsphere.infra.connection.validator.ShardingSphereMetaDataValidateUtils.validateTableExist(ShardingSphereMetaDataValidateUtils.java:56)
                at org.apache.shardingsphere.sharding.route.engine.validator.dml.impl.ShardingDeleteStatementValidator.preValidate(ShardingDeleteStatementValidator.java:42)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.lambda$createRouteContext0$0(ShardingSQLRouter.java:67)
                at java.base/java.util.Optional.ifPresent(Optional.java:178)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:67)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
                at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
                at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
                at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
                at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
                at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
                ... 98 more
Caused by: java.sql.SQLException: Unknown exception: null
        at org.apache.shardingsphere.infra.util.exception.external.sql.ShardingSphereSQLException.toSQLException(ShardingSphereSQLException.java:62)
        at org.apache.shardingsphere.dialect.SQLExceptionTransformEngine.toSQLException(SQLExceptionTransformEngine.java:62)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:416)
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.execute(ProxyPreparedStatement.java:44)
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.execute(HikariProxyPreparedStatement.java)
        at org.apache.ibatis.executor.statement.PreparedStatementHandler.query(PreparedStatementHandler.java:65)
        at org.apache.ibatis.executor.statement.RoutingStatementHandler.query(RoutingStatementHandler.java:80)
        at org.apache.ibatis.executor.SimpleExecutor.doQuery(SimpleExecutor.java:65)
        at org.apache.ibatis.executor.BaseExecutor.queryFromDatabase(BaseExecutor.java:333)
        at org.apache.ibatis.executor.BaseExecutor.query(BaseExecutor.java:158)
        at org.apache.ibatis.executor.CachingExecutor.query(CachingExecutor.java:110)
        at org.apache.ibatis.executor.CachingExecutor.query(CachingExecutor.java:90)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.selectList(DefaultSqlSession.java:154)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.selectList(DefaultSqlSession.java:147)
        at org.apache.ibatis.session.defaults.DefaultSqlSession.selectList(DefaultSqlSession.java:142)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
        at org.mybatis.spring.SqlSessionTemplate$SqlSessionInterceptor.invoke(SqlSessionTemplate.java:425)
        ... 79 more
Caused by: org.apache.shardingsphere.dialect.exception.syntax.table.NoSuchTableException
        at org.apache.shardingsphere.infra.connection.validator.ShardingSphereMetaDataValidateUtils.validateTableExist(ShardingSphereMetaDataValidateUtils.java:56)
        at org.apache.shardingsphere.sharding.route.engine.validator.dml.impl.ShardingSelectStatementValidator.preValidate(ShardingSelectStatementValidator.java:39)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.lambda$createRouteContext0$0(ShardingSQLRouter.java:67)
        at java.base/java.util.Optional.ifPresent(Optional.java:178)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext0(ShardingSQLRouter.java:67)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:59)
        at org.apache.shardingsphere.sharding.route.engine.ShardingSQLRouter.createRouteContext(ShardingSQLRouter.java:47)
        at org.apache.shardingsphere.infra.route.engine.impl.PartialSQLRouteExecutor.route(PartialSQLRouteExecutor.java:69)
        at org.apache.shardingsphere.infra.route.engine.SQLRouteEngine.route(SQLRouteEngine.java:57)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.route(KernelProcessor.java:60)
        at org.apache.shardingsphere.infra.connection.kernel.KernelProcessor.generateExecutionContext(KernelProcessor.java:51)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.createExecutionContext(ShardingSpherePreparedStatement.java:545)
        at org.apache.shardingsphere.driver.jdbc.core.statement.ShardingSpherePreparedStatement.execute(ShardingSpherePreparedStatement.java:405)
        ... 96 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   MapperLayerTests.whenRequestToAddByNameAndUserId:28 » UncategorizedSQL 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper.addAll-Inline
### The error occurred while setting parameters
### SQL: insert into t_order (`name`,user_id) values (?,?)
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
[ERROR]   MapperLayerTests.whenRequestToDeleteAll:49 » UncategorizedSQL 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper.addAll-Inline
### The error occurred while setting parameters
### SQL: insert into t_order (`name`,user_id) values (?,?)
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
[ERROR]   MapperLayerTests.whenRequestToDeleteById:36 » UncategorizedSQL 
### Error updating database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve com.lingh.shardingspherev540readwritesplittingtest.mapper.TOrderMapper.addAll-Inline
### The error occurred while setting parameters
### SQL: insert into t_order (`name`,user_id) values (?,?)
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
[ERROR]   MapperLayerTests.whenRequestToFindAll:23 » UncategorizedSQL 
### Error querying database.  Cause: java.sql.SQLException: Unknown exception: null
### The error may exist in com/lingh/shardingspherev540readwritesplittingtest/mapper/TOrderMapper.java (best guess)
### The error may involve defaultParameterMap
### The error occurred while setting parameters
### SQL: select * from t_order
### Cause: java.sql.SQLException: Unknown exception: null
; uncategorized SQLException; SQL state [HY000]; error code [30000]; Unknown exception: null
[INFO] 
[ERROR] Tests run: 5, Failures: 0, Errors: 4, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.943 s
[INFO] Finished at: 2023-08-28T19:42:01+08:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.0.0:test (default-test) on project shardingsphere-v540-readwrite-splitting-test: 
[ERROR] 
[ERROR] Please refer to /home/linghengqian/TwinklingLiftWorks/git/public/shardingsphere-v540-readwrite-splitting-test/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```