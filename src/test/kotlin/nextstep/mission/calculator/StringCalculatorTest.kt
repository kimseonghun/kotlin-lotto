package nextstep.mission.calculator

import io.kotest.assertions.throwables.shouldThrowExactly
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class StringCalculatorTest : StringSpec({

    "빈 숫자 리스트를 입력하면 0을 반환한다." {
        StringCalculator.calculate(expression = mutableListOf()) shouldBe 0
    }

    "음수가 있으면 RuntimeException 예외를 던진다." {
        shouldThrowExactly<RuntimeException> {
            StringCalculator.calculate(expression = mutableListOf(-3))
        }
    }
})
