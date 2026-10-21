package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/mypinpad/tsdk/i/yi;", "", "", "toString", "()Ljava/lang/String;", "setOnLongClickListener", "Ljava/lang/String;", "setDividerPadding", "setX", "setCompoundDrawableTintBlendMode", "setOnFocusChangeListener", "setY", "setLayoutAnimation", "setOnDragListener"}, k = 1, mv = {1, 6, 0})
public final class yi {
    private static int getNavBarTitleString = 0;
    public static final yi setCompoundDrawableTintBlendMode;

    @Deprecated(message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}.")
    public static final yi setDividerPadding;
    private static int setIncludeFontPadding = 1;
    public static final yi setLayoutAnimation;
    private static final /* synthetic */ yi[] setNavigationOnClickListener;
    public static final yi setOnDragListener;
    public static final yi setOnFocusChangeListener;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final yi setY;

    /* JADX INFO: renamed from: setOnLongClickListener, reason: from kotlin metadata */
    @NotNull
    private final String setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yi$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/yi$setX;", "", "", "p0", "Lcom/mypinpad/tsdk/i/yi;", "setDividerPadding", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/yi;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62094a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62095b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
            String str = (String) objArr[0];
            int i13 = f62094a;
            int i14 = ((i13 | 7) << 1) - (i13 ^ 7);
            f62095b = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(str, yi.setX(yi.setCompoundDrawableTintBlendMode));
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            yi yiVar = yi.setCompoundDrawableTintBlendMode;
            if (Intrinsics.areEqual(str, yi.setX(yiVar))) {
                int i15 = f62094a + 25;
                int i16 = i15 % 128;
                f62095b = i16;
                if (i15 % 2 == 0) {
                    throw null;
                }
                int i17 = i16 & 101;
                int i18 = (i16 | 101) & (~i17);
                int i19 = i17 << 1;
                int i20 = (i18 & i19) + (i19 | i18);
                f62094a = i20 % 128;
                int i21 = i20 % 2;
            } else {
                yiVar = yi.setOnFocusChangeListener;
                if (Intrinsics.areEqual(str, yi.setX(yiVar))) {
                    int i22 = f62094a;
                    int i23 = i22 & 105;
                    int i24 = (~i23) & (i22 | 105);
                    int i25 = i23 << 1;
                    int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                    f62095b = i26 % 128;
                    int i27 = i26 % 2;
                    int i28 = (((i22 | 50) << 1) - (i22 ^ 50)) - 1;
                    f62095b = i28 % 128;
                    int i29 = i28 % 2;
                } else {
                    yiVar = yi.setLayoutAnimation;
                    if (Intrinsics.areEqual(str, yi.setX(yiVar))) {
                        int i30 = f62094a;
                        int i31 = ((i30 | 69) << 1) - (i30 ^ 69);
                        f62095b = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = (i30 & 41) + (i30 | 41);
                        f62095b = i33 % 128;
                        if (i33 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        yiVar = yi.setY;
                        if (Intrinsics.areEqual(str, yi.setX(yiVar))) {
                            int i34 = f62095b;
                            int i35 = (-2) - (((i34 ^ 30) + ((i34 & 30) << 1)) ^ (-1));
                            int i36 = i35 % 128;
                            f62094a = i36;
                            int i37 = i35 % 2;
                            int i38 = (i36 & 113) + (i36 | 113);
                            f62095b = i38 % 128;
                            int i39 = i38 % 2;
                        } else {
                            yiVar = yi.setDividerPadding;
                            if (Intrinsics.areEqual(str, yi.setX(yiVar))) {
                                int i40 = f62095b;
                                int i41 = (i40 ^ 55) + ((i40 & 55) << 1);
                                f62094a = i41 % 128;
                                if (i41 % 2 != 0) {
                                    int i42 = 47 / 0;
                                }
                            } else {
                                yiVar = yi.setOnDragListener;
                                if (!Intrinsics.areEqual(str, yi.setX(yiVar))) {
                                    throw new IOException(Intrinsics.stringPlus("Unexpected protocol: ", str));
                                }
                                int i43 = f62095b;
                                int i44 = i43 + 109;
                                f62094a = i44 % 128;
                                if (i44 % 2 != 0) {
                                    throw null;
                                }
                                int i45 = ((i43 & 68) + (i43 | 68)) - 1;
                                f62094a = i45 % 128;
                                if (i45 % 2 != 0) {
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
            return yiVar;
        }

        @JvmStatic
        @NotNull
        public static yi setDividerPadding(@NotNull String p4) throws IOException {
            return (yi) setCompoundDrawableTintBlendMode(new Object[]{p4}, -661410454, 661410454, (int) System.currentTimeMillis());
        }
    }

    static {
        yi yiVar = new yi("HTTP_1_0", 0, "http/1.0");
        setCompoundDrawableTintBlendMode = yiVar;
        yi yiVar2 = new yi("HTTP_1_1", 1, "http/1.1");
        setOnFocusChangeListener = yiVar2;
        yi yiVar3 = new yi("SPDY_3", 2, "spdy/3.1");
        setDividerPadding = yiVar3;
        yi yiVar4 = new yi("HTTP_2", 3, "h2");
        setY = yiVar4;
        yi yiVar5 = new yi("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        setLayoutAnimation = yiVar5;
        yi yiVar6 = new yi("QUIC", 5, "quic");
        setOnDragListener = yiVar6;
        int i10 = (~0) & 21;
        int i11 = -(-0);
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        setIncludeFontPadding = i13;
        int i14 = i12 % 2;
        yi[] yiVarArr = {yiVar, yiVar2, yiVar3, yiVar4, yiVar5, yiVar6};
        int i15 = (i13 & (-126)) | ((~i13) & 125);
        int i16 = (i13 & 125) << 1;
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        getNavBarTitleString = i17 % 128;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (i17 % 2 != 0) {
            throw null;
        }
        setNavigationOnClickListener = yiVarArr;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i18 = ((-1) << 1) - ((setIncludeFontPadding + 50) ^ (-1));
        getNavBarTitleString = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public yi(String str, int i10, String str2) {
        super(str, i10);
        this.setDividerPadding = str2;
    }

    public static final /* synthetic */ String setX(yi yiVar) {
        int i10 = getNavBarTitleString;
        int i11 = ((i10 | 89) << 1) - (i10 ^ 89);
        setIncludeFontPadding = i11 % 128;
        int i12 = i11 % 2;
        String str = yiVar.setDividerPadding;
        int i13 = i10 & 115;
        int i14 = (i10 ^ 115) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        setIncludeFontPadding = i15 % 128;
        int i16 = i15 % 2;
        return str;
    }

    public static yi valueOf(String str) {
        int i10 = setIncludeFontPadding;
        int i11 = i10 & 71;
        int i12 = i10 | 71;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        getNavBarTitleString = i13 % 128;
        int i14 = i13 % 2;
        yi yiVar = (yi) Enum.valueOf(yi.class, str);
        if (i14 != 0) {
            int i15 = 10 / 0;
        }
        return yiVar;
    }

    public static yi[] values() {
        int i10 = setIncludeFontPadding;
        int i11 = ((i10 & 116) + (i10 | 116)) - 1;
        getNavBarTitleString = i11 % 128;
        int i12 = i11 % 2;
        yi[] yiVarArr = (yi[]) setNavigationOnClickListener.clone();
        int i13 = setIncludeFontPadding;
        int i14 = ((-1) << 1) - ((-1) ^ ((i13 ^ 88) + ((i13 & 88) << 1)));
        getNavBarTitleString = i14 % 128;
        int i15 = i14 % 2;
        return yiVarArr;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        int i10 = getNavBarTitleString;
        int i11 = (i10 & (-90)) | ((~i10) & 89);
        int i12 = (i10 & 89) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        setIncludeFontPadding = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setDividerPadding;
        }
        throw null;
    }
}
