package org.techno.api.mode.bedwars;

import org.techno.api.KDAHolder;

public interface BedWarsProfile extends KDAHolder {

  int wins();

  int losses();

  int brokenBedsCount();

  int finalKills();

  int level();

  long currentExperience();

  long experienceUntilNextLevel();

}
