# shardingsphere-v540-readwrite-splitting-test
- For https://github.com/dynamic-datasource/dynamic-datasource-samples/pull/28 .

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