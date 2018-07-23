package pr0304Barracks.core.commands;

import jdk.jshell.spi.ExecutionControl;
import pr0304Barracks.contracts.Repository;
import pr0304Barracks.contracts.Unit;
import pr0304Barracks.contracts.UnitFactory;

public class RetireCommand extends BaseCommand  {


    protected RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() {
        String unitType = super.getData()[1];

        try {
            super.getRepository().removeUnit(unitType);

            return unitType + " retired!";
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }

    }
}
