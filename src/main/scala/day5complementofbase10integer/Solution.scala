package day5complementofbase10integer

object Solution {
  def bitwiseComplement(N: Int): Int = {
    N ^ N.toBinaryString.zipWithIndex.map(x => Math.pow(2, x._2)).sum.toInt
  }
}
