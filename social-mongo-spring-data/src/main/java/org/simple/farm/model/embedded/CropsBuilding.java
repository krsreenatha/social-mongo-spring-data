package org.simple.farm.model.embedded;

import java.util.Date;

/**
 * @author ilya40umov
 */
public class CropsBuilding extends Building {

    private Date lastHarvest;

    public Date getLastHarvest() {
        return lastHarvest;
    }

    public void setLastHarvest(Date lastHarvest) {
        this.lastHarvest = lastHarvest;
    }

    @Override
    public String toString() {
        return "CropsBuilding{" +
                "lastHarvest=" + lastHarvest +
                "} " + super.toString();
    }
}
