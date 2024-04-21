import org.scalatest.funsuite.AnyFunSuite
import domainA.SparkOpInstance12

class SparkOpInstance12Test extends AnyFunSuite {
  test("SparkOpInstance12: name should be dataset/spark-op-instance-12") {
    assert(SparkOpInstance12.name == "dataset/spark-op-instance-12")
  }

  // Additional tests for inputs, query, metadata, and runConfigurations can be added here
}
