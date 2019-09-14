### 1.组合模式简介
组合模式（Composite Pattern），又叫部分整体模式，是用于把一组相似的对象当作一个单一的对象。
组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
这种模式创建了一个包含自己对象组的类。该类提供了修改相同对象组的方式。


* 意图：将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
* 主要解决：它在我们树型结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，从而使得客户程序与复杂元素的内部结构解耦。
* 何时使用： 1、您想表示对象的部分-整体层次结构（树形结构）。 2、您希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
* 如何解决：树枝和叶子实现统一接口，树枝内部组合该接口。
* 关键代码：树枝内部组合该接口，并且含有内部属性 List，里面放 Component。
* 应用实例： 1、算术表达式包括操作数、操作符和另一个操作数，其中，另一个操作符也可以是操作数、操作符和另一个操作数。 2、在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。
* 优点： 1、高层模块调用简单。 2、节点自由增加。
* 缺点：在使用组合模式时，其叶子和树枝的声明都是实现类，而不是接口，违反了依赖倒置原则。
* 使用场景：部分、整体场景，如树形菜单，文件、文件夹的管理。
* 注意事项：定义时为具体类。

### 2.组合模式角色
* 抽象构件(Component)角色：这是一个抽象角色，它给参加组合的对象定义出公共的接口及其默认行为，可以用来管理所有的子对象。合成对象通常把它所包含的子对象当做类型为Component的对象。
在安全式的合成模式里，构件角色并不定义出管理子对象的方法，这一定义由树枝构件对象给出。
* 树叶构件(Leaf)角色：树叶对象是没有下级子对象的对象，定义出参加组合的原始对象的行为。
* 树枝构件(Composite)角色：代表参加组合的有下级子对象的对象。树枝构件类给出所有的管理子对象的方法，如add()、remove()以及getChild()。

### 参考链接
[组合模式简介](https://www.runoob.com/design-pattern/composite-pattern.html)
[《JAVA与模式》之合成模式](https://www.runoob.com/design-pattern/composite-pattern.html)