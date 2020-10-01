package day1numberofrecentcalls

import scala.collection.mutable

object Solution {

}

class RecentCounter() {
  val requests: mutable.ListBuffer[Int] = mutable.ListBuffer()
  var size: Int = 0

  def ping(t: Int): Int = {
    requests.append(t)
    size += 1

    size - requests.indexWhere(_ >= t - 3000)
  }

}
