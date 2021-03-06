状态模式，又称状态对象模式（Pattern of Objects for States），状态模式是对象的行为模式。
状态模式允许一个对象在其内部状态改变的时候改变其行为。这个对象看上去就像是改变了它的类一样。

在很多情况下，一个对象的行为取决于一个或多个动态变化的属性，这样的属性叫做状态，这样的对象叫做有状态的(stateful)对象，这样的对象状态是从事先定义好的一系列值中取出的。当一个这样的对象与外部事件产生互动时，其内部状态就会改变，从而使得系统的行为也随之发生变化。
状态模式把所研究的对象的行为包装在不同的状态对象里，每一个状态对象都属于一个抽象状态类的一个子类。状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。

在下面的两种情况下均可使用State模式:
1) 一个对象的行为取决于它的状态, 并且它必须在运行时刻根据状态改变它的行为。
2) 代码中包含大量与对象状态有关的条件语句:一个操作中含有庞大的多分支的条件（if else(或switch case)语句，且这些分支依赖于该对象的状态。

状态模式所涉及到的角色有：
环境类（Context）:  定义客户感兴趣的接口。维护一个ConcreteState子类的实例，这个实例定义当前状态。
抽象状态类（State）:  定义一个接口以封装与Context的一个特定状态相关的行为。
具体状态类（ConcreteState）:  每一子类实现一个与Context的一个状态相关的行为。


![state](../img/state.png)