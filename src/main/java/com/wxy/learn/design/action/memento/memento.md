### 什么是备忘录模式?
**　备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化，存储起来，
从而可以在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。**

备忘录模式（Memento Pattern）保存一个对象的某个状态，以便在适当的时候恢复对象。

* 意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。
* 主要解决：所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
* 何时使用：很多时候我们总是需要记录一个对象的内部状态，这样做的目的就是为了允许用户取消不确定或者错误的操作，能够恢复到他原先的状态，使得他有"后悔药"可吃。
* 如何解决：通过一个备忘录类专门存储对象状态。
* 关键代码：客户不与备忘录类耦合，与备忘录管理类耦合。
* 应用实例： 1、后悔药。 2、打游戏时的存档。 3、Windows 里的 ctri + z。 4、IE 中的后退。 4、数据库的事务管理。
* 优点： 
    * 1、给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 
    * 2、实现了信息的封装，使得用户不需要关心状态的保存细节。
* 缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。
* 使用场景： 1、需要保存/恢复数据的相关状态场景。 2、提供一个可回滚的操作。
* 注意事项： 1、为了符合迪米特原则，还要增加一个管理备忘录的类。 2、为了节约内存，可使用原型模式+备忘录模式。

### 备忘录模式角色
* 备忘录(Memento)角色:
备忘录角色又如下责任：
（1）将发起人（Originator）对象的内战状态存储起来。备忘录可以根据发起人对象的判断来决定存储多少发起人（Originator）对象的内部状态。
（2）备忘录可以保护其内容不被发起人（Originator）对象之外的任何对象所读取。
备忘录有两个等效的接口：
窄接口：负责人（Caretaker）对象（和其他除发起人对象之外的任何对象）看到的是备忘录的窄接口(narrow interface)，这个窄接口只允许它把备忘录对象传给其他的对象。
宽接口：与负责人对象看到的窄接口相反的是，发起人对象可以看到一个宽接口(wide interface)，这个宽接口允许它读取所有的数据，以便根据这些数据恢复这个发起人对象的内部状态

* 发起人（Originator）角色:
发起人角色有如下责任：
（1）创建一个含有当前的内部状态的备忘录对象。
（2）使用备忘录对象存储其内部状态。

* 负责人（Caretaker）角色
负责人角色有如下责任：
（1）负责保存备忘录对象。
（2）不检查备忘录对象的内容。

### 备忘录模式理解
* 所谓备忘录模式就是在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。
* 给用户提供了一种可以恢复状态的机制，可以使用户能够比较方便地回到某个历史的状态。 
* 实现了信息的封装，使得用户不需要关心状态的保存细节。
* 1、需要保存/恢复数据的相关状态场景。 2、提供一个可回滚的操作。
* 1、为了符合迪米特原则，还要增加一个管理备忘录的类。 2、为了节约内存，可使用原型模式+备忘录模式。

### 参考链接
* [备忘录模式简介](https://www.runoob.com/design-pattern/memento-pattern.html)
* [《JAVA与模式》之备忘录模式](https://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html)