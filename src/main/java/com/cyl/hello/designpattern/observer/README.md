# 观察者模式

通常意义上如果一个对象状态的改变需要通知很多对这个对象关注的一系列对象，就可以使用观察者模式。

定义：观察者模式（有时又被称为发布-订阅模式、模型-视图模式、源-收听者模式或从属者模式）是软件设计模式的一种。在此种模式中，一个目标物件管理所有相依于它的观察者物件，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实作事件处理系统。

上面的定义当中，主要有这样几个意思，首先是有一个目标的物件，通俗点讲就是一个类，它管理了所有依赖于它的观察者物件，或者通俗点说是观察者类，并在它自己状态发生变化时，主动发出通知。

简单点概括成通俗的话来说，就是一个类管理着所有依赖于它的观察者类，并且它状态变化时会主动给这些依赖它的类发出通知。

另外，观察者模式分离了观察者和被观察者二者的责任，这样让类之间各自维护自己的功能，专注于自己的功能，会提高系统的可维护性和可重用性。

观察者模式其实还有另外一种形态，就是事件驱动模型，LZ个人觉得这两种方式大体上其实是非常相似的，所以LZ决定一起引入事件驱动模型。不过观察者更多的强调的是发布-订阅式的问题处理，而事件驱动则更多的注重于界面与数据模型之间的问题，两者还是有很多适用场景上的区别的，虽不能一概而论，但放在一起讨论还是很方便各位理解二者。

首先事件驱动模型与观察者模式勉强的对应关系可以看成是，被观察者相当于事件源，观察者相当于监听器，事件源会产生事件，监听器监听事件。所以这其中就搀和到四个类，事件源，事件，监听器以及具体的监听器。

走到这里我们发现二者可以达到的效果一模一样，那么两者是不是一样呢？

答案当然是否定的，首先我们从实现方式上就能看出，事件驱动可以解决观察者模式的问题，但反过来则不一定，另外二者所表达的业务场景也不一样，比如上述例子，使用观察者模式更贴近业务场景的描述，而使用事件驱动，从业务上讲，则有点勉强。

二者除了业务场景的区别以外，在功能上主要有以下区别。

1，观察者模式中观察者的响应理论上讲针对特定的被观察者是唯一的（说理论上唯一的原因是，如果你愿意，你完全可以在update方法里添加一系列的elseif去产生不同的响应，但LZ早就说过，你应该忘掉elseif），而事件驱动则不是，因为我们可以定义自己感兴趣的事情，比如刚才，我们可以监听作者发布新书，我们还可以在监听器接口中定义其它的行为。再比如tomcat中，我们可以监听servletcontext的init动作，也可以监听它的destroy动作。

2，虽然事件驱动模型更加灵活，但也是付出了系统的复杂性作为代价的，因为我们要为每一个事件源定制一个监听器以及事件，这会增加系统的负担，各位看看tomcat中有多少个监听器和事件类就知道了。

3，另外观察者模式要求被观察者继承Observable类，这就意味着如果被观察者原来有父类的话，就需要自己实现被观察者的功能，当然，这一尴尬事情，我们可以使用适配器模式弥补，但也不可避免的造成了观察者模式的局限性。事件驱动中事件源则不需要，因为事件源所维护的监听器列表是给自己定制的，所以无法去制作一个通用的父类去完成这个工作。

4，被观察者传送给观察者的信息是模糊的，比如update中第二个参数，类型是Object，这需要观察者和被观察者之间有约定才可以使用这个参数。而在事件驱动模型中，这些信息是被封装在Event当中的，可以更清楚的告诉监听器，每个信息都是代表的什么。

观察者模式还有一个缺点就是，每一个观察者都要实现观察者接口，才能添加到被观察者的列表当中，假设一个观察者已经存在，而且我们无法改变其代码，那么就无法让它成为一个观察者了，不过这个我们依然可以使用适配器模式解决。但是还有一个问题就不好解决了，就是假如我们很多类都是现成的，当被观察者发生变化时，每一个观察者都需要调用不同的方法，那么观察者模式就有点捉襟见肘的感觉了，我们必须适配每一个类去统一他们变化的方法名称为update，这是一个很可怕的事情。

对于事件驱动就没有这样的问题，我们可以实现多个监听器来达到监听多个事件源的目的，但是它的缺点刚才已经说过了，在事件源或者事件增加时，监听器和事件类通常情况下会成对增加，造成系统的复杂性增加，不过目前看来，事件驱动模型一般都比较稳定，所以这个问题并不太明显，因为很少见到无限增加事件的情况发生。

还有一个缺点就是我们的事件源需要看准时机触发自己的各个监听器，这也从某种意义上增加了事件源的负担，造成了类一定程度上的臃肿。

最后，LZ再总结下二者针对的业务场景概述。

观察者模式：发布（release）--订阅（subscibe），变化（change）--更新（update）

事件驱动模型：请求（request）--响应（response），事件发生（occur）--事件处理（handle）       