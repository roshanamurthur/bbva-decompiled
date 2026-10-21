package com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager;

import rh.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class CvmRiskManagerBuilder {
    private static final /* synthetic */ CvmRiskManagerBuilder[] $VALUES;
    public static final CvmRiskManagerBuilder INSTANCE;

    static {
        CvmRiskManagerBuilder cvmRiskManagerBuilder = new CvmRiskManagerBuilder("INSTANCE", 0);
        INSTANCE = cvmRiskManagerBuilder;
        $VALUES = new CvmRiskManagerBuilder[]{cvmRiskManagerBuilder};
    }

    public CvmRiskManagerBuilder() {
        throw null;
    }

    public static CvmRiskManager getDefault() {
        return new a();
    }

    public static CvmRiskManagerBuilder valueOf(String str) {
        return (CvmRiskManagerBuilder) Enum.valueOf(CvmRiskManagerBuilder.class, str);
    }

    public static CvmRiskManagerBuilder[] values() {
        return (CvmRiskManagerBuilder[]) $VALUES.clone();
    }
}
