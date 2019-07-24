# example-maven-plugin

maven插件开发示例

### 命名规范

- `<pluginName>-maven-plugin`：第三方插件命名规范
- `maven-<pluginName>-plugin`：官方插件命名规范（不可用）


### 开发步骤

```
<!-- 将打包方式改为maven-plugin格式 -->
<packaging>maven-plugin</packaging>

<dependencies>
   <dependency>
       <groupId>org.apache.maven</groupId>
       <artifactId>maven-plugin-api</artifactId>
       <version>3.5.0</version>
   </dependency>
   <dependency>
       <groupId>org.apache.maven.plugin-tools</groupId>
       <artifactId>maven-plugin-annotations</artifactId>
       <version>3.5.2</version>
       <scope>provided</scope>
   </dependency>
</dependencies>
```

