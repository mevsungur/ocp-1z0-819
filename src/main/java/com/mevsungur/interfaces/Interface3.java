package com.mevsungur.interfaces;

public class Interface3 {
}

class A{}
interface M{}
interface N{}

class B extends A {}
class C extends A implements M {}
class D extends A implements M, N {}
// A en başta olmalıymış.
//class Generic<T extends M & N & A> {}
class Generic<T extends A & M & N> {}
