package id.ac.ui.cs.advprog.tutorial2.exercise1.command;

import id.ac.ui.cs.advprog.tutorial2.exercise1.receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    protected void operate() {
        // TODO Complete me!
        ceilingFan.low();
    }
}
