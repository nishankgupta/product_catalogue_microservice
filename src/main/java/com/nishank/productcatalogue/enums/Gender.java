package com.nishank.productcatalogue.enums;

public enum Gender {
    MALE, FEMALE;

    public static Gender getGender(String gender) {
        if (gender == null)
            return null;

        for (Gender gen : Gender.values()) {
            if (gen.name().equalsIgnoreCase(gender))
                return gen;
        }

        return null;
    }
}
