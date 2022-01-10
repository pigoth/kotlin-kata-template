package th.pigoth.template

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleTest {

  @Test
  internal fun dummy_test_ok() {
    assertThat(Example().one()).isGreaterThan(0)
  }

  @Test
  internal fun dummy_test_fail() {
    assertThat(Example().one()).isGreaterThan(100000)
  }
}
