package com.bbva.ethermobilesdk.tokencompat.model.legacy;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: STOathParam.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOathParam;", "", "OCRA_SUITE", "TOTP_LENGTH", "TOTP_TIME_STEP", "TOTP_INITIAL_TIME", "TOTP_ALGORITHM", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class STOathParam {
    private static final /* synthetic */ STOathParam[] $VALUES;
    public static final STOathParam OCRA_SUITE;
    public static final STOathParam TOTP_ALGORITHM;
    public static final STOathParam TOTP_INITIAL_TIME;
    public static final STOathParam TOTP_LENGTH;
    public static final STOathParam TOTP_TIME_STEP;

    static {
        STOathParam sTOathParam = new STOathParam("OCRA_SUITE", 0);
        OCRA_SUITE = sTOathParam;
        STOathParam sTOathParam2 = new STOathParam("TOTP_LENGTH", 1);
        TOTP_LENGTH = sTOathParam2;
        STOathParam sTOathParam3 = new STOathParam("TOTP_TIME_STEP", 2);
        TOTP_TIME_STEP = sTOathParam3;
        STOathParam sTOathParam4 = new STOathParam("TOTP_INITIAL_TIME", 3);
        TOTP_INITIAL_TIME = sTOathParam4;
        STOathParam sTOathParam5 = new STOathParam("TOTP_ALGORITHM", 4);
        TOTP_ALGORITHM = sTOathParam5;
        $VALUES = new STOathParam[]{sTOathParam, sTOathParam2, sTOathParam3, sTOathParam4, sTOathParam5};
    }

    public STOathParam() {
        throw null;
    }

    public static STOathParam valueOf(String str) {
        return (STOathParam) Enum.valueOf(STOathParam.class, str);
    }

    public static STOathParam[] values() {
        return (STOathParam[]) $VALUES.clone();
    }
}
