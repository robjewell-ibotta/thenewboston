package tv.codealong.tutorials.springboot.thenewboston.service

// import io.mockk.verify
import io.mockk.*


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource

internal class BankServiceTest {

  private val dataSource: BankDataSource = mockk()

  private val bankService = BankService(dataSource)

  @Test
  fun `should call its data source to retrieve banks`() {
    // given
    every { dataSource.retrieveBanks() } returns emptyList()

    // when
    // val banks = bankService.getBanks()
    bankService.getBanks()

    // then
    verify(exactly = 1) { dataSource.retrieveBanks() }
  }
}
