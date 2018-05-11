package com.nishank.productcatalogue.enums;

public enum Category {
    SPORTS, CASUAL, FORMAL, PARTY;

    public static Category getCategory(String category) {
        if (category == null)
            return null;

        for (Category cat : Category.values()) {
            if (cat.name().equalsIgnoreCase(category))
                return cat;
        }

        return null;
    }
}
