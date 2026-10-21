package com.bbva.glomohybrid.login.domain.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CountryLoginErrorType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/domain/model/CountryLoginErrorType;", "", "BlockedUser", "BlockedPassword", "InvalidCredentials", "ExpiredCredentials", "Unknown", "UnauthorizedAccess", "GenericError", "Flowmeter", "MaintenanceFlowmeter", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryLoginErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CountryLoginErrorType[] $VALUES;
    public static final CountryLoginErrorType BlockedPassword;
    public static final CountryLoginErrorType BlockedUser;
    public static final CountryLoginErrorType ExpiredCredentials;
    public static final CountryLoginErrorType Flowmeter;
    public static final CountryLoginErrorType GenericError;
    public static final CountryLoginErrorType InvalidCredentials;
    public static final CountryLoginErrorType MaintenanceFlowmeter;
    public static final CountryLoginErrorType UnauthorizedAccess;
    public static final CountryLoginErrorType Unknown;

    static {
        CountryLoginErrorType countryLoginErrorType = new CountryLoginErrorType("BlockedUser", 0);
        BlockedUser = countryLoginErrorType;
        CountryLoginErrorType countryLoginErrorType2 = new CountryLoginErrorType("BlockedPassword", 1);
        BlockedPassword = countryLoginErrorType2;
        CountryLoginErrorType countryLoginErrorType3 = new CountryLoginErrorType("InvalidCredentials", 2);
        InvalidCredentials = countryLoginErrorType3;
        CountryLoginErrorType countryLoginErrorType4 = new CountryLoginErrorType("ExpiredCredentials", 3);
        ExpiredCredentials = countryLoginErrorType4;
        CountryLoginErrorType countryLoginErrorType5 = new CountryLoginErrorType("Unknown", 4);
        Unknown = countryLoginErrorType5;
        CountryLoginErrorType countryLoginErrorType6 = new CountryLoginErrorType("UnauthorizedAccess", 5);
        UnauthorizedAccess = countryLoginErrorType6;
        CountryLoginErrorType countryLoginErrorType7 = new CountryLoginErrorType("GenericError", 6);
        GenericError = countryLoginErrorType7;
        CountryLoginErrorType countryLoginErrorType8 = new CountryLoginErrorType("Flowmeter", 7);
        Flowmeter = countryLoginErrorType8;
        CountryLoginErrorType countryLoginErrorType9 = new CountryLoginErrorType("MaintenanceFlowmeter", 8);
        MaintenanceFlowmeter = countryLoginErrorType9;
        CountryLoginErrorType[] countryLoginErrorTypeArr = {countryLoginErrorType, countryLoginErrorType2, countryLoginErrorType3, countryLoginErrorType4, countryLoginErrorType5, countryLoginErrorType6, countryLoginErrorType7, countryLoginErrorType8, countryLoginErrorType9};
        $VALUES = countryLoginErrorTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(countryLoginErrorTypeArr);
    }

    public CountryLoginErrorType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<CountryLoginErrorType> getEntries() {
        return $ENTRIES;
    }

    public static CountryLoginErrorType valueOf(String str) {
        return (CountryLoginErrorType) Enum.valueOf(CountryLoginErrorType.class, str);
    }

    public static CountryLoginErrorType[] values() {
        return (CountryLoginErrorType[]) $VALUES.clone();
    }
}
