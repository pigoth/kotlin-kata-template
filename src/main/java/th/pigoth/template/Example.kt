package th.pigoth.template

import org.slf4j.LoggerFactory

class Example {
  private val log = LoggerFactory.getLogger(this::class.java)

  fun one(): Int {
    log.info("get one!!!")
    return 1
  }

}
