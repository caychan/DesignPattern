代理模式，同一个类而去调用另一个类的方法，不对这个方法进行直接操作。
代理模式的特点在于隔离，隔离调用类和被调用类的关系，通过一个代理类去调用。

代理模式和适配器模式最大的区别：代理模式是与原对象实现同一个接口，而适配器类则是匹配新接口，也就是实现一个新接口。


 1 适配器模式是将一个类(a)通过某种方式转换成另一个类(b).
 2 装饰模式是在一个原有类(a)的基础之上增加了某些新的功能变成另一个类(b).
 3 代理模式是将一个类(a)转换成具体的操作类(b).