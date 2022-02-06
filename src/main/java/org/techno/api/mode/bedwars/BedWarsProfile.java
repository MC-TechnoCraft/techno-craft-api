package org.techno.api.mode.bedwars;

import org.techno.api.KDAHolder;

public interface BedWarsProfile extends KDAHolder {

    int getWins();

    int getLosses();

    int getBrokenBedsCount();

    int getFinalKills();

    int getLevel();

    long getCurrentExperience();

    long getExperienceUntilNextLevel();

}
