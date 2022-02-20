package WorkingWithLists

import org.scalatest.funspec.AnyFunSpec

class Test01 extends AnyFunSpec:
  describe("P01") {
    it("Example") {
      assert(P01.last(List(1, 1, 2, 3, 5, 8)) == 8)
    }
  }
