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
[ERROR] com.lingh.shardingspherev540readwritesplittingtest.MapperLayerTests.whenRequestToFindAll  Time elapsed: 0.057 s  <<< ERROR!
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

```