package domainA

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.{DataFrame, SparkSession}
import platform.common_classes.{Metadata, RunConfigurations, SparkOp}

object SparkOpInstance1 extends SparkOp {
  val randomValue: Int = 7345 // Hardcoded random value

  override def name: String = "SparkOpInstance1"
  override def inputs: Set[String] = Set() // No inputs, making it a root
  override def query(inputs: Map[String, DataFrame]): DataFrame = {
    // Previously used randomValue from SparkOpInstance20, now using hardcoded value
    val _ = randomValue
    SparkSession.builder().getOrCreate().emptyDataFrame
  }
  override def metadata: Metadata = {
    // Mock implementation for metadata
    new Metadata()
  }
  override def runConfigurations: RunConfigurations = {
    // Mock implementation for runConfigurations
    new RunConfigurations()
  }
}
