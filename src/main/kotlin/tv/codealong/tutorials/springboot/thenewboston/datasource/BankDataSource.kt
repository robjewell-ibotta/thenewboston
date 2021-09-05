package tv.codealong.tutorials.springboot.thenewboston.datasource

import tv.codealong.tutorials.springboot.thenewboston.model.Bank

interface BankDataSource {

  fun retrieveBanks(): Collection<Bank>
}
