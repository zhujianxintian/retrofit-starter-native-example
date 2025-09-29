# retrofit-starter-native-example

用于测试集成 `retrofit-spring-boot-starter` 的 `GraalVM Native` 编译

## 启动
启动项目之后, 浏览器访问 `http://localhost:8080/test/article` 即可跑通测试接口

## 编译
1. 命令行编译, 在当前项目根目录使用 `mvn package` 即可编译

2. 使用 idea 编译, 打开右侧 `Maven`, `<项目名>` - `Lifecycle`, 依次点击展开, 点击 `package` 即可

## 运行以及查看日志

### 方法一

日志可能很多, 为了方便查看日志, 直接在 `项目根目录` 使用以下命令

```shell
.\target\retrofit-starter-native-image-example.exe 2>&1 | Tee-Object -FilePath .\target\run.log
```

之后在 `target\run.log` 中查看日志

### 方法二

如果不需要写入日志, 直接在 `项目根目录` 使用以下命令

```shell
.\target\retrofit-starter-native-image-example.exe
```