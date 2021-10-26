package com.knoldus.Trees

object IntegerTree {

    abstract class IntTree {
      def incl(x: Int): IntTree
      def contains(x: Int): Boolean
    }
    class EmptyTree extends IntTree {
      def contains(x: Int): Boolean = false
      def incl(x: Int): IntTree = new Node(x, new EmptyTree, new EmptyTree)
    }
    case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree {
      def contains(x: Int): Boolean =
        if (x < elem) left contains x
        else if (x > elem) right contains x
        else true
      def incl(x: Int): IntTree =
        if (x < elem) new Node(elem, left incl x, right)
        else if (x > elem) new Node(elem, left, right incl x)
        else this
    }

    object EmptyTree extends IntTree {
      def contains(x: Int): Boolean = false
      def incl(x: Int): IntTree = new Node(x, EmptyTree, EmptyTree)
    }

}
