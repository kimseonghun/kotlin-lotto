package nextstep.mission.lotto.io

import nextstep.mission.lotto.dto.LottoDto
import nextstep.mission.lotto.vo.LottoNumber
import nextstep.mission.lotto.vo.LottoNumbers
import nextstep.mission.lotto.vo.WinningPrize.FIFTH
import nextstep.mission.lotto.vo.WinningPrize.FIRST
import nextstep.mission.lotto.vo.WinningPrize.FOURTH
import nextstep.mission.lotto.vo.WinningPrize.SECOND
import nextstep.mission.lotto.vo.WinningPrize.THIRD
import nextstep.mission.lotto.vo.WinningResult

object ConsoleInput {
    fun inputPrice(): Int {
        println("구입금액을 입력해 주세요.")
        return readln().toInt()
    }

    fun inputWinningNumbers(): LottoNumbers {
        println("지난 주 당첨 번호를 입력해 주세요.")
        return readln().split(",").map { LottoNumber(it.toInt()) }.let { LottoNumbers(it) }
    }

    fun inputBonusNumber(): LottoNumber {
        println("보너스 볼을 입력해 주세요.")
        return LottoNumber(readln().toInt())
    }
}

object ConsoleOutput {
    fun printLotto(lotto: LottoDto) {
        println("${lotto.lottoNumbers.size}개를 구매했습니다.")
        lotto.lottoNumbers.forEach { println(it) }
    }

    fun printWinningResult(winningResult: WinningResult, rateOfReturn: Double) {
        println("==========")
        println("3개 일치 (5000원) - ${winningResult.getCount(FIFTH)}개")
        println("4개 일치 (50000원) - ${winningResult.getCount(FOURTH)}개")
        println("5개 일치 (1500000원) - ${winningResult.getCount(THIRD)}개")
        println("5개 일치, 보너스 볼 일치(30000000원) -${winningResult.getCount(SECOND)}개")
        println("6개 일치 (2000000000원) - ${winningResult.getCount(FIRST)}개")
        println("총 수익률은 ${String.format("%.2f", rateOfReturn)} 입니다.")
    }
}
