package com.bbva.ethermobilesdk.token.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Exception.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/ethermobilesdk/token/model/EtherTokenErrorType;", "", "DENIED_STORAGE_ACCESS", "TOKEN_NOT_FOUND", "ILLEGAL_STATE", "INVALID_OCRA_SUITE", "BAD_TOKEN_ACTIVATION", "TOKEN_IS_NOT_ACTIVE", "UNKNOWN", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class EtherTokenErrorType {
    private static final /* synthetic */ EtherTokenErrorType[] $VALUES;
    public static final EtherTokenErrorType BAD_TOKEN_ACTIVATION;
    public static final EtherTokenErrorType DENIED_STORAGE_ACCESS;
    public static final EtherTokenErrorType ILLEGAL_STATE;
    public static final EtherTokenErrorType INVALID_OCRA_SUITE;
    public static final EtherTokenErrorType TOKEN_IS_NOT_ACTIVE;
    public static final EtherTokenErrorType TOKEN_NOT_FOUND;
    public static final EtherTokenErrorType UNKNOWN;

    static {
        EtherTokenErrorType etherTokenErrorType = new EtherTokenErrorType("DENIED_STORAGE_ACCESS", 0);
        DENIED_STORAGE_ACCESS = etherTokenErrorType;
        EtherTokenErrorType etherTokenErrorType2 = new EtherTokenErrorType("TOKEN_NOT_FOUND", 1);
        TOKEN_NOT_FOUND = etherTokenErrorType2;
        EtherTokenErrorType etherTokenErrorType3 = new EtherTokenErrorType("ILLEGAL_STATE", 2);
        ILLEGAL_STATE = etherTokenErrorType3;
        EtherTokenErrorType etherTokenErrorType4 = new EtherTokenErrorType("INVALID_OCRA_SUITE", 3);
        INVALID_OCRA_SUITE = etherTokenErrorType4;
        EtherTokenErrorType etherTokenErrorType5 = new EtherTokenErrorType("BAD_TOKEN_ACTIVATION", 4);
        BAD_TOKEN_ACTIVATION = etherTokenErrorType5;
        EtherTokenErrorType etherTokenErrorType6 = new EtherTokenErrorType("TOKEN_IS_NOT_ACTIVE", 5);
        TOKEN_IS_NOT_ACTIVE = etherTokenErrorType6;
        EtherTokenErrorType etherTokenErrorType7 = new EtherTokenErrorType("UNKNOWN", 6);
        UNKNOWN = etherTokenErrorType7;
        $VALUES = new EtherTokenErrorType[]{etherTokenErrorType, etherTokenErrorType2, etherTokenErrorType3, etherTokenErrorType4, etherTokenErrorType5, etherTokenErrorType6, etherTokenErrorType7};
    }

    public EtherTokenErrorType() {
        throw null;
    }

    public static EtherTokenErrorType valueOf(String str) {
        return (EtherTokenErrorType) Enum.valueOf(EtherTokenErrorType.class, str);
    }

    public static EtherTokenErrorType[] values() {
        return (EtherTokenErrorType[]) $VALUES.clone();
    }
}
