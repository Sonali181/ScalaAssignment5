package com.knoldus.set

class set {

  def setUnion(set: Set[Int], set1: Set[Int]): Set[Int] = {
    val union = set ++ set1
    union
  }
  def setIntersect(set: Set[Int], set1: Set[Int]): Set[Int] = {
    val intersect = set & set1
    intersect
  }
}
//object run extends App{
//  val v = new set
//  println(v.setIntersect(Set(1,2,3,4,5,6), Set(4,5,6,7)))
//
//}
