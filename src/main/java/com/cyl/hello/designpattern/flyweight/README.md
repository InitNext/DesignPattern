# 享元模式

定义：享元模式（英语：Flyweight Pattern）是一种软件设计模式。它使用共享物件，用来尽可能减少内存使用量以及分享资讯给尽可能多的相似物件；它适合用于当大量物件只是重复因而导致无法令人接受的使用大量内存。通常物件中的部分状态是可以分享。常见做法是把它们放在外部数据结构，当需要使用时再将它们传递给享元。

这个模式主要是为了减少不必要的重复对象，减少内存消耗。而要做到这个的话，那么就需要把一个对象可共享的状态给封装起来，而不可能共享的状态则从外部获取

享元模式强调内部状态和外部状态，内部状态则是可以共享的状态，外部状态则是随外部环境而变化的状态，是无法共享的状态。