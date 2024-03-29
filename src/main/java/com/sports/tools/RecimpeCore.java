package com.sports.tools;

import com.sports.common.Constants;
import com.sports.entity.UserTizhi;

/**
 * @author 小王小王 混世魔王
 */
public class RecimpeCore {

    String objective;
    UserTizhi userTizhi;

    public  RecimpeCore(String objective, UserTizhi userTizhi){
       this.objective=objective;
       this.userTizhi=userTizhi;
    }
    public String getSportway() {
        if (Constants.loseWeight.equals(objective)) {
            return "有氧运动";
        }
        if (Constants.gainMuscle.equals(objective)) {
            return "无氧运动";
        }
        if (Constants.IncCardiopulmonary.equals(objective)) {
            return "有氧运动";
        }
        if (Constants.IncAerobicEndurance.equals(objective)) {
            return "有氧运动";
        }
        if (Constants.IncAnaerobicTolerance.equals(objective)) {
            return "无氧运动";
        }
        if (Constants.buildBody.equals(objective)) {
            return "有氧运动";
        }
        if (Constants.alleviatingSubHealth.equals(objective)) {
            return "娱乐运动";
        }
        return "";
    }

    public int getSportStrength() {
        int strengthnum = 0, num = 0;
        if (Constants.loseWeight.equals(objective) && userTizhi.getPhysique() < 2) {
            strengthnum = 2;
            num++;
        }
        if (Constants.loseWeight.equals(objective) && userTizhi.getPhysique() >= 2) {
            strengthnum = 3;
            num++;
        }
        if (Constants.loseWeight.equals(objective) && userTizhi.getHeartLungAbility() < 2) {
            strengthnum += 2;
            num++;
        }
        if (Constants.loseWeight.equals(objective) && userTizhi.getHeartLungAbility() >= 2) {
            strengthnum += 3;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getHeartLungAbility() < 3) {
            strengthnum += 4;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getHeartLungAbility() >= 3) {
            strengthnum += 5;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getMuscularEndurance() < 3) {
            strengthnum += 4;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getMuscularEndurance() >= 3) {
            strengthnum += 5;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getPhysique() < 3) {
            strengthnum += 4;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getPhysique() >= 3) {
            strengthnum += 5;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getWithinFat() == 3) {
            strengthnum += 3;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getWithinFat() == 2) {
            strengthnum += 4;
            num++;
        }
        if (Constants.gainMuscle.equals(objective) && userTizhi.getWithinFat() == 1) {
            strengthnum += 5;
            num++;
        }
        if (Constants.IncCardiopulmonary.equals(objective) && userTizhi.getHeartLungAbility() < 2) {
            strengthnum = 2;
            num++;
        }
        if (Constants.IncCardiopulmonary.equals(objective) && userTizhi.getHeartLungAbility() >= 2) {
            strengthnum = 3;
            num++;
        }
        if (Constants.IncCardiopulmonary.equals(objective) && userTizhi.getPhysique() < 2) {
            strengthnum += 2;
            num++;
        }
        if (Constants.IncCardiopulmonary.equals(objective) && userTizhi.getPhysique() >= 2) {
            strengthnum += 3;
            num++;
        }
        if (Constants.IncCardiopulmonary.equals(objective) && userTizhi.getWithinFat() < 3) {
            strengthnum += 3;
            num++;
        }
        if (Constants.IncCardiopulmonary.equals(objective) && userTizhi.getPhysique() >= 3) {
            strengthnum += 2;
            num++;
        }
        if (Constants.buildBody.equals(objective)) {
            if (userTizhi.getWithinFat() == 3) {
                if (userTizhi.getPhysique() < 2) {
                    strengthnum = 2;
                    num++;
                }
                if (userTizhi.getPhysique() >= 2) {
                    strengthnum = 3;
                    num++;
                }
                if (userTizhi.getHeartLungAbility() < 2) {
                    strengthnum += 2;
                    num++;
                }
                if (userTizhi.getHeartLungAbility() >= 2) {
                    strengthnum += 3;
                    num++;
                }
            } else {
                if (userTizhi.getHeartLungAbility() < 3) {
                    if (userTizhi.getHeartLungAbility() < 2) {
                        strengthnum = 2;
                        num++;
                    }
                    if (userTizhi.getHeartLungAbility() >= 2) {
                        strengthnum = 3;
                        num++;
                    }
                    if (userTizhi.getPhysique() < 2) {
                        strengthnum += 2;
                        num++;
                    }
                    if (userTizhi.getPhysique() >= 2) {
                        strengthnum += 3;
                        num++;
                    }
                    if (userTizhi.getWithinFat() < 3) {
                        strengthnum += 3;
                        num++;
                    }
                    if (userTizhi.getPhysique() >= 3) {
                        strengthnum += 2;
                        num++;
                    }

                } else {
                    if (Constants.fat.equals(userTizhi.getPhysique())) {
                        if (userTizhi.getPhysique() < 2) {
                            strengthnum = 2;
                            num++;
                        }
                        if (userTizhi.getPhysique() >= 2) {
                            strengthnum = 3;
                            num++;
                        }
                        if (userTizhi.getHeartLungAbility() < 2) {
                            strengthnum += 2;
                            num++;
                        }
                        if (userTizhi.getHeartLungAbility() >= 2) {
                            strengthnum += 3;
                            num++;
                        }
                    } else {
                        strengthnum += 3;
                        num++;
                    }
                }
            }
        }

        if (Constants.IncAerobicEndurance.equals(objective) && userTizhi.getPhysique() < 3) {
            strengthnum = 3;
            num++;
        }
        if (Constants.IncAerobicEndurance.equals(objective) && userTizhi.getPhysique() >= 3) {
            strengthnum = 4;
            num++;
        }
        if (Constants.IncAerobicEndurance.equals(objective) && userTizhi.getHeartLungAbility() < 2) {
            strengthnum += 3;
            num++;
        }
        if (Constants.IncAerobicEndurance.equals(objective) && userTizhi.getHeartLungAbility() >= 2) {
            strengthnum += 4;
            num++;
        }

        if (Constants.IncAnaerobicTolerance.equals(objective) && userTizhi.getPhysique() < 4) {
            strengthnum = 4;
            num++;
        }
        if (Constants.IncAnaerobicTolerance.equals(objective) && userTizhi.getPhysique() >= 4) {
            strengthnum = 5;
            num++;
        }
        if (Constants.IncAnaerobicTolerance.equals(objective) && userTizhi.getHeartLungAbility() < 4) {
            strengthnum += 4;
            num++;
        }
        if (Constants.IncAnaerobicTolerance.equals(objective) && userTizhi.getHeartLungAbility() >= 4) {
            strengthnum += 5;
            num++;
        }
        if (Constants.IncAnaerobicTolerance.equals(objective) && userTizhi.getMuscularEndurance() < 4) {
            strengthnum += 4;
            num++;
        }
        if (Constants.IncAnaerobicTolerance.equals(objective) && userTizhi.getMuscularEndurance() >= 4) {
            strengthnum += 5;
            num++;
        }
        if (Constants.alleviatingSubHealth.equals(objective) && userTizhi.getPhysique() < 4) {
            strengthnum = 2;
            num++;
        }
        if (Constants.alleviatingSubHealth.equals(objective) && userTizhi.getPhysique() >= 4) {
            strengthnum = 3;
            num++;
        }
        if (Constants.alleviatingSubHealth.equals(objective) && userTizhi.getHeartLungAbility() < 4) {
            strengthnum += 2;
            num++;
        }
        if (Constants.alleviatingSubHealth.equals(objective) && userTizhi.getHeartLungAbility() >= 4) {
            strengthnum += 3;
            num++;
        }
        if (Constants.alleviatingSubHealth.equals(objective) && userTizhi.getMuscularEndurance() < 4) {
            strengthnum += 2;
            num++;
        }
        if (Constants.alleviatingSubHealth.equals(objective) && userTizhi.getMuscularEndurance() >= 4) {
            strengthnum += 3;
            num++;
        }
        return strengthnum / num;
    }

    public int getSportTime() {
        if (Constants.loseWeight.equals(objective)) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else if (Constants.gainMuscle.equals(objective)) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 2;
            } else {
                return 1;
            }
        } else if (Constants.IncCardiopulmonary.equals(objective)) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else if (Constants.IncAerobicEndurance.equals(objective)) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else if (Constants.IncAnaerobicTolerance.equals(objective)) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 2;
            } else {
                return 3;
            }
        } else if (Constants.buildBody.equals(objective)) {
            if (userTizhi.getWithinFat() == 3) {
                if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                    return 4;
                } else {
                    return 5;
                }
            } else {
                if (userTizhi.getHeartLungAbility() < 3) {
                    if (userTizhi.getPhysique() < 3) {
                        return 3;
                    } else {
                        return 4;
                    }
                } else {
                    if (Constants.fat.equals(userTizhi.getPhysique())) {
                        if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                            return 3;
                        } else {
                            return 4;
                        }
                    } else {
                        return 3;
                    }
                }
            }
        } else if (Constants.alleviatingSubHealth.equals(objective)) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else {
            return 3;
        }

    }

    public int getSportFrequency(){
        if (Constants.loseWeight.equals(objective)) {
            return 3;
        }
        if (Constants.gainMuscle.equals(objective)) {
            return 2;
        }
        if (Constants.IncCardiopulmonary.equals(objective)) {
            return 2;
        }
        if (Constants.IncAerobicEndurance.equals(objective)) {
            return 3;
        }
        if (Constants.IncAnaerobicTolerance.equals(objective)) {
            return 2;
        }
        if (Constants.buildBody.equals(objective)) {
            if (userTizhi.getWithinFat() == 3) {
               return 3;
            } else {
                if (userTizhi.getHeartLungAbility() < 3) {
                    return 2;
                } else {
                    if (Constants.fat.equals(userTizhi.getPhysique())) {
                        return 3;
                    } else {
                        return 2;
                    }
                }
            }
        }
        if (Constants.alleviatingSubHealth.equals(objective)) {
            return 2;
        }
        return 2;
    }

    public String getStrengthShowType(){
        if (Constants.loseWeight.equals(objective)) {
            return "心率";
        }
        if (Constants.gainMuscle.equals(objective)) {
            return "组率";
        }
        if (Constants.IncCardiopulmonary.equals(objective)) {
            return "心率";
        }
        if (Constants.IncAerobicEndurance.equals(objective)) {
            return "心率";
        }
        if (Constants.IncAnaerobicTolerance.equals(objective)) {
            return "组率";
        }
        if (Constants.buildBody.equals(objective)) {
            return "心率";
        }
        if (Constants.alleviatingSubHealth.equals(objective)) {
            return "心率";
        }
        return "心率";

    }
}