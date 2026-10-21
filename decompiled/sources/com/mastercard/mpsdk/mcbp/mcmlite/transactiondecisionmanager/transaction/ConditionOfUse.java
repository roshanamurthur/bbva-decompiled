package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ConditionOfUse {
    private static final /* synthetic */ ConditionOfUse[] $VALUES;
    public static final ConditionOfUse DOMESTIC;
    public static final ConditionOfUse INTERNATIONAL;

    static {
        ConditionOfUse conditionOfUse = new ConditionOfUse("DOMESTIC", 0);
        DOMESTIC = conditionOfUse;
        ConditionOfUse conditionOfUse2 = new ConditionOfUse("INTERNATIONAL", 1);
        INTERNATIONAL = conditionOfUse2;
        $VALUES = new ConditionOfUse[]{conditionOfUse, conditionOfUse2};
    }

    public ConditionOfUse() {
        throw null;
    }

    public static ConditionOfUse of(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2) ? DOMESTIC : INTERNATIONAL;
    }

    public static ConditionOfUse valueOf(String str) {
        return (ConditionOfUse) Enum.valueOf(ConditionOfUse.class, str);
    }

    public static ConditionOfUse[] values() {
        return (ConditionOfUse[]) $VALUES.clone();
    }
}
