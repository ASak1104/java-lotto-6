package lotto.game;

import java.util.List;
import java.util.Objects;
import lotto.model.Lotto;
import lotto.util.LottoGameConsole;

public class LottoGame {
    private int cost = Integer.MIN_VALUE;
    private int bonusNumber = Integer.MIN_VALUE;
    private Lotto target;
    private List<Lotto> lottos;

    public void initCost() {
        while (cost == Integer.MIN_VALUE) {
            readCost();
        }
    }

    public void initTarget() {
        while (Objects.isNull(target)) {
            readTarget();
        }
    }

    public void initBonusNumber() {
        while (bonusNumber == Integer.MIN_VALUE) {
            readBonusNumber();
        }
    }

    public void initLottos() {

    }

    private void readCost() {
        try {
            cost = LottoGameConsole.readCost();
        } catch (NumberFormatException e) {
            LottoGameConsole.print(LottoGameMessage.NON_NUMBER);
        } catch (IllegalArgumentException e) {
            LottoGameConsole.print(LottoGameMessage.INVALID_COST_UNIT);
        }
    }

    private void readTarget() {
        try {
            target = LottoGameConsole.readTargetLotto();
        } catch (NumberFormatException e) {
            LottoGameConsole.print(LottoGameMessage.NON_NUMBER);
        } catch (IllegalArgumentException e) {
            LottoGameConsole.print(LottoGameMessage.INVALID_LOTTO_NUMBERS);
        }
    }

    private void readBonusNumber() {
        try {
            bonusNumber = LottoGameConsole.readBonusNumber();
        } catch (NumberFormatException e) {
            LottoGameConsole.print(LottoGameMessage.NON_NUMBER);
        } catch (IllegalArgumentException e) {
            LottoGameConsole.print(LottoGameMessage.NUMBER_OUT_OF_RANGE);
        }
    }
}
