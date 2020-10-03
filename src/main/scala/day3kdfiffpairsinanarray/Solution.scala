package day3kdfiffpairsinanarray

import scala.collection.mutable

object Solution {
  def main(args: Array[String]): Unit = {
    val nums = Array(1,3,1,5,4)

    println(findPairs(nums, 0))
  }

  def findPairs(nums: Array[Int], k: Int): Int = {
    val sorted = nums.sorted
    var res = 0

    val queue: mutable.Queue[Int] = mutable.Queue(sorted(0))

    for (i <- 1 until sorted.length) {
      while (queue.nonEmpty && queue.head + k < sorted(i)) {
        queue.dequeue()
      }

      if (queue.nonEmpty && queue.head + k == sorted(i)) {
        res += 1
        queue.dequeue()
      }

      if (sorted(i) != sorted(i - 1)) {
        queue.enqueue(sorted(i))
      }
    }

    res
  }
}
