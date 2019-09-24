### 1.什么是责任链模式
**责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。请求在这个链上传递，直到链上的某一个对象决定处理此请求。
发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。**

顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。

* 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
* 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
* 何时使用：在处理消息的时候以过滤很多道。
* 如何解决：拦截的类都实现统一接口。
* 关键代码：Handler 里面聚合它自己，在 HandlerRequest 里判断是否合适，如果没达到条件则向下传递，向谁传递之前 set 进去。

* 应用实例： 
1、红楼梦中的"击鼓传花"。 
2、JS 中的事件冒泡。 
3、JAVA WEB 中 Apache Tomcat 对 Encoding 的处理，Struts2 的拦截器，jsp servlet 的 Filter。

* 优点： 
1、降低耦合度。它将请求的发送者和接收者解耦。 
2、简化了对象。使得对象不需要知道链的结构。 
3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。 
4、增加新的请求处理类很方便。

* 缺点： 
1、不能保证请求一定被接收。 
2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。 
3、可能不容易观察运行时的特征，有碍于除错。

* 使用场景： 
1、有多个对象可以处理同一个请求，具体哪个对象处理该请求由运行时刻自动确定。 
2、在不明确指定接收者的情况下，向多个对象中的一个提交一个请求。 
3、可动态指定一组对象处理请求。

* 注意事项：在 JAVA WEB 中遇到很多应用。

### 2.责任链模式角色
* 抽象处理者(Handler)角色：定义出一个处理请求的接口。如果需要，接口可以定义 出一个方法以设定和返回对下家的引用。这个角色通常由一个Java抽象类或者Java接口实现。
上图中Handler类的聚合关系给出了具体子类对下家的引用，抽象方法handleRequest()规范了子类处理请求的操作。
* 具体处理者(ConcreteHandler)角色：具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。


### 参考链接
[责任链模式简介](https://www.runoob.com/design-pattern/chain-of-responsibility-pattern.html)
[《JAVA与模式》之责任链模式](https://www.cnblogs.com/java-my-life/archive/2012/05/28/2516865.html)