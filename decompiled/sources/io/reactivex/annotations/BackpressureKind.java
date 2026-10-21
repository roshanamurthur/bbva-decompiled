package io.reactivex.annotations;

import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class BackpressureKind {
    private static final /* synthetic */ BackpressureKind[] $VALUES;
    public static final BackpressureKind ERROR;
    public static final BackpressureKind FULL;
    public static final BackpressureKind NONE;
    public static final BackpressureKind PASS_THROUGH;
    public static final BackpressureKind SPECIAL;
    public static final BackpressureKind UNBOUNDED_IN;

    static {
        BackpressureKind backpressureKind = new BackpressureKind("PASS_THROUGH", 0);
        PASS_THROUGH = backpressureKind;
        BackpressureKind backpressureKind2 = new BackpressureKind("FULL", 1);
        FULL = backpressureKind2;
        BackpressureKind backpressureKind3 = new BackpressureKind("SPECIAL", 2);
        SPECIAL = backpressureKind3;
        BackpressureKind backpressureKind4 = new BackpressureKind("UNBOUNDED_IN", 3);
        UNBOUNDED_IN = backpressureKind4;
        BackpressureKind backpressureKind5 = new BackpressureKind("ERROR", 4);
        ERROR = backpressureKind5;
        BackpressureKind backpressureKind6 = new BackpressureKind(ExpectedUserActionOnPoiTypes.NONE, 5);
        NONE = backpressureKind6;
        $VALUES = new BackpressureKind[]{backpressureKind, backpressureKind2, backpressureKind3, backpressureKind4, backpressureKind5, backpressureKind6};
    }

    public BackpressureKind() {
        throw null;
    }

    public static BackpressureKind valueOf(String str) {
        return (BackpressureKind) Enum.valueOf(BackpressureKind.class, str);
    }

    public static BackpressureKind[] values() {
        return (BackpressureKind[]) $VALUES.clone();
    }
}
