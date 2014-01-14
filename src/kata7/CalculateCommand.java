package kata7;

public class CalculateCommand extends Command {

    private final MoneyDialog moneyDialog;
    private final CurrencyDialog currencyDialog;

    public CalculateCommand(MoneyDialog moneyDialog, CurrencyDialog currencyDialog) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
    }

    @Override
    public void execute() {
        System.out.println(moneyDialog.getMoney() + " " + currencyDialog.getCurrency());
    }
}
