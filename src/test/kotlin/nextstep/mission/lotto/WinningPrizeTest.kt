package nextstep.mission.lotto

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class WinningPrizeTest : StringSpec({

    "FIRST: 당첨 조건 6이다." {
        WinningPrize.FIRST.matchedCount shouldBe 6
    }

    "FIRST: 당첨 금액은 20억이다." {
        WinningPrize.FIRST.prize shouldBe 2_000_000_000
    }

    "SECOND: 당첨 조건 5이다." {
        WinningPrize.SECOND.matchedCount shouldBe 5
    }

    "SECOND: 당첨 금액은 150만이다." {
        WinningPrize.SECOND.prize shouldBe 1_500_000
    }

    "THIRD: 당첨 조건 4이다." {
        WinningPrize.THIRD.matchedCount shouldBe 4
    }

    "THIRD: 당첨 금액은 5만이다." {
        WinningPrize.THIRD.prize shouldBe 50_000
    }

    "FOURTH: 당첨 조건 3이다." {
        WinningPrize.FOURTH.matchedCount shouldBe 3
    }

    "FOURTH: 당첨 금액은 5만이다." {
        WinningPrize.FOURTH.prize shouldBe 5_000
    }
})
