package WorkingWithLists

object P01:
  def last[T](list: List[T]): T = list match
    case x :: Nil => x
    case x :: xs  => last(xs)
    case _        => sys.error("Last is not defined.")
