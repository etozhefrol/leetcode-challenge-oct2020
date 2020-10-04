package day4removecoveredintervals

object Main {
  def main(args: Array[String]): Unit = {
    val a = Array(Array(1,4),Array(3,6),Array(2,8))

    println(Solution.removeCoveredIntervals(a))
  }
}

object Solution {
  def removeCoveredIntervals(intervals: Array[Array[Int]]): Int = {
    val sorted = intervals.sortWith((a, b) => if(a(0) == b(0)) a(1) > b(1) else a(0) < b(0))
    var res = sorted.length
    var localMax = Int.MinValue

    for (e <- sorted) {
      if (e(1) <= localMax) {
        res -= 1
      } else {
        localMax = e(1)
      }
    }

    res
  }
}