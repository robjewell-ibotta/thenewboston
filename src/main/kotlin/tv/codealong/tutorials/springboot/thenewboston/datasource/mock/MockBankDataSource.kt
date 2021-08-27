package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import org.springframework.stereotype.Repository
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.thenewboston.model.Bank

@Repository
class MockBankDataSource : BankDataSource {
  override fun getBanks(): Collection<Bank> {
    return emptyList()
  }
}
