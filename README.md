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

```