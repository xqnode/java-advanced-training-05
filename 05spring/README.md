## 作业
2.（必做）写代码实现 Spring Bean 的装配，方式越多越好（XML、Annotation 都可以）, 提交到 GitHub。

代码位置：https://github.com/xqnode/java-advanced-training-05/blob/master/05spring/src/test/java/com/example/demo/BeanTest.java

8.（必做）给前面课程提供的 Student/Klass/School 实现自动配置和 Starter。

代码位置：https://github.com/xqnode/java-advanced-training-05/tree/master/05spring/

> 说明：StudentAutoConfig作为配置类，在 META-INF/spring.factories 中进行了相关的引入配置，`org.springframework.boot.autoconfigure.EnableAutoConfiguration=com.example.demo.config.StudentAutoConfig
`。打包后，可以直接引用 Student类。

10.（必做）研究一下 JDBC 接口和数据库连接池，掌握它们的设计和用法：
1）使用 JDBC 原生接口，实现数据库的增删改查操作。
2）使用事务，PrepareStatement 方式，批处理方式，改进上述操作。
3）配置 Hikari 连接池，改进上述操作。提交代码到 GitHub。

代码位置：

