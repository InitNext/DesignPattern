# 解析器模式

定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。

使用场景：解释器模式需要解决的是，如果一种特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题。

文法也称为语法，指的是语言的结构方式。包括词的构成和变化，词组和句子的组织。对于文法来说，我们可以简单的理解为一种语言的规则，那么从解释器模式的定义可以看出，首先我们要先设计一种语言，然后给出语言的文法的表示，而在此基础上，我们采用解释器模式去解释语言中的句子。

上下文无关文法的组成，有四种组成部分：

1. 非终结符号集（LZ标注：像JAVA语言中的表达式，程序语句，标识符等）

2. 终结符号集（LZ标注：类似JAVA语言中的+，-，*，\，=等）

3. 产生式集合，也可以称为规则集合（LZ标注：假设我们记JAVA中的标识符为id，那么下面这句话可以被成视为一条规则 id->a|b...|z|0..|9|_，其中|是或者的意思）

4. 一个起始符号，这个符号是非终结符号集的一个元素（LZ标注：JAVA语言使用CompilationUnit（编译单元）作为起始符号。）


在日常工作当中，我们使用到解释器模式的概率几乎为0，因为写一个解释器就基本相当于创造了一种语言，这对于大多数人来说，是几乎不可能接到的工作。不过我们了解一下解释器模式，还是对我们有好处的。

解释器模式的优点：

1. 由于我们使用具体的终止符和非终止符去解释文法，所以会比较易于编写。

2. 可以比较方便的修改和扩展文法规则。

相对于优点来说，它的缺点也非常明显，那就是由于我们几乎针对每一个规则都定义了一个类，所以如果一个文法的规则比较多，那对于文法的维护工作也会变得非常困难。