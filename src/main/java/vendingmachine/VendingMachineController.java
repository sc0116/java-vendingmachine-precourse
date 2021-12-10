package vendingmachine;

import vendingmachine.domain.VendingMachine;
import vendingmachine.view.Input;
import vendingmachine.view.Output;

public class VendingMachineController {

	private final VendingMachine vendingMachine;

	public VendingMachineController(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	public void run() {
		chargeHoldingAmount();
	}

	private void chargeHoldingAmount() {
		int holdingAmount = Input.holdingAmount();
		vendingMachine.insertCoins(holdingAmount);
		Output.holdingAmount(vendingMachine.getCoins());
	}
}