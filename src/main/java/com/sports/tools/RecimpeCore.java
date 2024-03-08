package com.sports.tools;

import com.sports.entity.UserTizhi;

public class RecimpeCore {

    String objective;
    UserTizhi userTizhi;

    public  RecimpeCore(String objective, UserTizhi userTizhi){
       this.objective=objective;
       this.userTizhi=userTizhi;
    }
    public String getSportway() {
        if ("减脂瘦身".equals(objective)) {
            return "有氧运动";
        }
        if ("增肌".equals(objective)) {
            return "无氧运动";
        }
        if ("增强心肺能力".equals(objective)) {
            return "有氧运动";
        }
        if ("增强有氧耐力".equals(objective)) {
            return "有氧运动";
        }
        if ("增强无氧耐力".equals(objective)) {
            return "无氧运动";
        }
        if ("强身健体".equals(objective)) {
            return "有氧运动";
        }
        if ("缓解亚健康".equals(objective)) {
            return "娱乐运动";
        }
        return "";
    }

    public int getSportStrength() {
        int strengthnum = 0, num = 0;
        if ("减脂瘦身".equals(objective) && userTizhi.getPhysique() < 2) {
            strengthnum = 2;
            num++;
        }
        if ("减脂瘦身".equals(objective) && userTizhi.getPhysique() >= 2) {
            strengthnum = 3;
            num++;
        }
        if ("减脂瘦身".equals(objective) && userTizhi.getHeartLungAbility() < 2) {
            strengthnum += 2;
            num++;
        }
        if ("减脂瘦身".equals(objective) && userTizhi.getHeartLungAbility() >= 2) {
            strengthnum += 3;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getHeartLungAbility() < 3) {
            strengthnum += 4;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getHeartLungAbility() >= 3) {
            strengthnum += 5;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getMuscularEndurance() < 3) {
            strengthnum += 4;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getMuscularEndurance() >= 3) {
            strengthnum += 5;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getPhysique() < 3) {
            strengthnum += 4;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getPhysique() >= 3) {
            strengthnum += 5;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getWithinFat() == 3) {
            strengthnum += 3;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getWithinFat() == 2) {
            strengthnum += 4;
            num++;
        }
        if ("增肌".equals(objective) && userTizhi.getWithinFat() == 1) {
            strengthnum += 5;
            num++;
        }
        if ("增强心肺能力".equals(objective) && userTizhi.getHeartLungAbility() < 2) {
            strengthnum = 2;
            num++;
        }
        if ("增强心肺能力".equals(objective) && userTizhi.getHeartLungAbility() >= 2) {
            strengthnum = 3;
            num++;
        }
        if ("增强心肺能力".equals(objective) && userTizhi.getPhysique() < 2) {
            strengthnum += 2;
            num++;
        }
        if ("增强心肺能力".equals(objective) && userTizhi.getPhysique() >= 2) {
            strengthnum += 3;
            num++;
        }
        if ("增强心肺能力".equals(objective) && userTizhi.getWithinFat() < 3) {
            strengthnum += 3;
            num++;
        }
        if ("增强心肺能力".equals(objective) && userTizhi.getPhysique() >= 3) {
            strengthnum += 2;
            num++;
        }
        if ("强身健体".equals(objective)) {
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
                    if ("肥胖".equals(userTizhi.getPhysique())) {
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

        if ("增强有氧耐力".equals(objective) && userTizhi.getPhysique() < 3) {
            strengthnum = 3;
            num++;
        }
        if ("增强有氧耐力".equals(objective) && userTizhi.getPhysique() >= 3) {
            strengthnum = 4;
            num++;
        }
        if ("增强有氧耐力".equals(objective) && userTizhi.getHeartLungAbility() < 2) {
            strengthnum += 3;
            num++;
        }
        if ("增强有氧耐力".equals(objective) && userTizhi.getHeartLungAbility() >= 2) {
            strengthnum += 4;
            num++;
        }

        if ("增强无氧耐力".equals(objective) && userTizhi.getPhysique() < 4) {
            strengthnum = 4;
            num++;
        }
        if (objective.equals("增强无氧耐力") && userTizhi.getPhysique() >= 4) {
            strengthnum = 5;
            num++;
        }
        if (objective.equals("增强无氧耐力") && userTizhi.getHeartLungAbility() < 4) {
            strengthnum += 4;
            num++;
        }
        if (objective.equals("增强无氧耐力") && userTizhi.getHeartLungAbility() >= 4) {
            strengthnum += 5;
            num++;
        }
        if (objective.equals("增强无氧耐力") && userTizhi.getMuscularEndurance() < 4) {
            strengthnum += 4;
            num++;
        }
        if (objective.equals("增强无氧耐力") && userTizhi.getMuscularEndurance() >= 4) {
            strengthnum += 5;
            num++;
        }
        if (objective.equals("缓解亚健康") && userTizhi.getPhysique() < 4) {
            strengthnum = 2;
            num++;
        }
        if (objective.equals("缓解亚健康") && userTizhi.getPhysique() >= 4) {
            strengthnum = 3;
            num++;
        }
        if (objective.equals("缓解亚健康") && userTizhi.getHeartLungAbility() < 4) {
            strengthnum += 2;
            num++;
        }
        if (objective.equals("缓解亚健康") && userTizhi.getHeartLungAbility() >= 4) {
            strengthnum += 3;
            num++;
        }
        if (objective.equals("缓解亚健康") && userTizhi.getMuscularEndurance() < 4) {
            strengthnum += 2;
            num++;
        }
        if (objective.equals("缓解亚健康") && userTizhi.getMuscularEndurance() >= 4) {
            strengthnum += 3;
            num++;
        }
        return strengthnum / num;
    }

    public int getSportTime() {
        if (objective.equals("减脂瘦身")) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else if (objective.equals("增肌")) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 2;
            } else {
                return 1;
            }
        } else if (objective.equals("增强心肺能力")) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else if (objective.equals("增强有氧耐力")) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 3;
            } else {
                return 4;
            }
        } else if (objective.equals("增强无氧耐力")) {
            if (userTizhi.getHeartLungAbility() < 3 || userTizhi.getPhysique() < 3) {
                return 2;
            } else {
                return 3;
            }
        } else if (objective.equals("强身健体")) {
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
                    if (userTizhi.getPhysique().equals("肥胖")) {
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
        } else if (objective.equals("缓解亚健康")) {
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
        if (objective.equals("减脂瘦身")) {
            return 3;
        }
        if (objective.equals("增肌")) {
            return 2;
        }
        if (objective.equals("增强心肺能力")) {
            return 2;
        }
        if (objective.equals("增强有氧耐力")) {
            return 3;
        }
        if (objective.equals("增强无氧耐力")) {
            return 2;
        }
        if (objective.equals("强身健体")) {
            if (userTizhi.getWithinFat() == 3) {
               return 3;
            } else {
                if (userTizhi.getHeartLungAbility() < 3) {
                    return 2;
                } else {
                    if (userTizhi.getPhysique().equals("肥胖")) {
                        return 3;
                    } else {
                        return 2;
                    }
                }
            }
        }
        if (objective.equals("缓解亚健康")) {
            return 2;
        }
        return 2;
    }

    public String getStrengthShowType(){
        if ("减脂瘦身".equals(objective)) {
            return "心率";
        }
        if ("增肌".equals(objective)) {
            return "组率";
        }
        if ("增强心肺能力".equals(objective)) {
            return "心率";
        }
        if ("增强有氧耐力".equals(objective)) {
            return "心率";
        }
        if ("增强无氧耐力".equals(objective)) {
            return "组率";
        }
        if ("强身健体".equals(objective)) {
            return "心率";
        }
        if ("缓解亚健康".equals(objective)) {
            return "心率";
        }
        return "心率";

    }
}