import scala.annotation.tailrec

class First() {

  @tailrec
  final def findSum(valueToFind: Int, exps: List[Int]): Int = {

    // exps.tail.find(_ + _ == valueToFind)
    exps.tail.find(_ + exps.head == valueToFind) match {
      case Some(found) => found * exps.head
      case None => findSum(valueToFind, exps.tail)

    }
  }


}
