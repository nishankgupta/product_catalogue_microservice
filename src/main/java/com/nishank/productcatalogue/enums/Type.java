package com.nishank.productcatalogue.enums;

public enum Type {
    JEANS, SHIRTS, TSHIRTS, SHOES;

    public static Type getType(String type) {
        if (type == null)
            return null;

        for (Type ty : Type.values()) {
            if (ty.name().equalsIgnoreCase(type))
                return ty;
        }

        return null;
    }
}
