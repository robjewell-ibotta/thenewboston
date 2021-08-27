package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

  private val mockDataSource = MockBankDataSource()

  @Test
  fun `should provide a collection of banks`() {
    // when
    val banks = mockDataSource.getBanks()

    // then
    assertThat(banks).isNotEmpty
  }
}
