package com.google.zxing.client.result;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ParsedResultType {
    private static final /* synthetic */ ParsedResultType[] $VALUES;
    public static final ParsedResultType ADDRESSBOOK;
    public static final ParsedResultType CALENDAR;
    public static final ParsedResultType EMAIL_ADDRESS;
    public static final ParsedResultType GEO;
    public static final ParsedResultType ISBN;
    public static final ParsedResultType PRODUCT;
    public static final ParsedResultType SMS;
    public static final ParsedResultType TEL;
    public static final ParsedResultType TEXT;
    public static final ParsedResultType URI;
    public static final ParsedResultType VIN;
    public static final ParsedResultType WIFI;

    static {
        ParsedResultType parsedResultType = new ParsedResultType("ADDRESSBOOK", 0);
        ADDRESSBOOK = parsedResultType;
        ParsedResultType parsedResultType2 = new ParsedResultType("EMAIL_ADDRESS", 1);
        EMAIL_ADDRESS = parsedResultType2;
        ParsedResultType parsedResultType3 = new ParsedResultType("PRODUCT", 2);
        PRODUCT = parsedResultType3;
        ParsedResultType parsedResultType4 = new ParsedResultType("URI", 3);
        URI = parsedResultType4;
        ParsedResultType parsedResultType5 = new ParsedResultType("TEXT", 4);
        TEXT = parsedResultType5;
        ParsedResultType parsedResultType6 = new ParsedResultType("GEO", 5);
        GEO = parsedResultType6;
        ParsedResultType parsedResultType7 = new ParsedResultType("TEL", 6);
        TEL = parsedResultType7;
        ParsedResultType parsedResultType8 = new ParsedResultType("SMS", 7);
        SMS = parsedResultType8;
        ParsedResultType parsedResultType9 = new ParsedResultType("CALENDAR", 8);
        CALENDAR = parsedResultType9;
        ParsedResultType parsedResultType10 = new ParsedResultType("WIFI", 9);
        WIFI = parsedResultType10;
        ParsedResultType parsedResultType11 = new ParsedResultType("ISBN", 10);
        ISBN = parsedResultType11;
        ParsedResultType parsedResultType12 = new ParsedResultType("VIN", 11);
        VIN = parsedResultType12;
        $VALUES = new ParsedResultType[]{parsedResultType, parsedResultType2, parsedResultType3, parsedResultType4, parsedResultType5, parsedResultType6, parsedResultType7, parsedResultType8, parsedResultType9, parsedResultType10, parsedResultType11, parsedResultType12};
    }

    public ParsedResultType() {
        throw null;
    }

    public static ParsedResultType valueOf(String str) {
        return (ParsedResultType) Enum.valueOf(ParsedResultType.class, str);
    }

    public static ParsedResultType[] values() {
        return (ParsedResultType[]) $VALUES.clone();
    }
}
