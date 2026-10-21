package com.mypinpad.tsdk.isolation;

import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/zv;", "", "", "p0", "", "setOnFocusChangeListener", "(Ljava/lang/String;)Z", "setDividerPadding", "setX", "setCompoundDrawableTintBlendMode", "setY", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class zv {

    @NotNull
    public static final zv INSTANCE = new zv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f62457a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62458b = 1;

    static {
        int i10 = f62457a;
        int i11 = ((i10 | 123) << 1) - (i10 ^ 123);
        f62458b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static boolean setCompoundDrawableTintBlendMode(@NotNull String p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4}, 1967480732, -1967480732, (int) System.currentTimeMillis())).booleanValue();
    }

    @JvmStatic
    public static final boolean setDividerPadding(@NotNull String p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4}, -106229379, 106229383, (int) System.currentTimeMillis())).booleanValue();
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i10 | (~i12))) | i14) * 168) + (((~(i11 | i10)) | (~(i10 | i12))) * (-168)) + (((~(i13 | i14)) | (~(i14 | i12))) * 336) + (i11 * (-167)) + (i10 * (-167));
        if (i15 == 1) {
            String str = (String) objArr[0];
            int i16 = f62457a;
            int i17 = i16 | 55;
            int i18 = i17 << 1;
            int i19 = -((~(i16 & 55)) & i17);
            int i20 = (i18 & i19) + (i19 | i18);
            f62458b = i20 % 128;
            if (i20 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.areEqual(str, "PROPFIND");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str, "");
            if (!Intrinsics.areEqual(str, "PROPFIND")) {
                int i21 = f62458b + 23;
                f62457a = i21 % 128;
                int i22 = i21 % 2;
                return Boolean.TRUE;
            }
            int i23 = f62458b;
            int i24 = (i23 & 15) + (i23 | 15);
            f62457a = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 21 / 0;
            }
            return Boolean.FALSE;
        }
        if (i15 == 2) {
            String str2 = (String) objArr[0];
            int i26 = f62458b;
            int i27 = ((i26 | 7) << 1) - (i26 ^ 7);
            f62457a = i27 % 128;
            if (i27 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.areEqual(str2, "POST");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str2, "");
            if (!Intrinsics.areEqual(str2, "POST") && !Intrinsics.areEqual(str2, "PATCH")) {
                int i28 = f62457a;
                int i29 = i28 & 97;
                int i30 = ((i28 | 97) & (~i29)) + (i29 << 1);
                f62458b = i30 % 128;
                int i31 = i30 % 2;
                if (!Intrinsics.areEqual(str2, Request.PUT)) {
                    int i32 = f62457a;
                    int i33 = ((i32 & 114) + (i32 | 114)) - 1;
                    f62458b = i33 % 128;
                    if (i33 % 2 == 0) {
                        Intrinsics.areEqual(str2, "DELETE");
                        throw null;
                    }
                    if (!Intrinsics.areEqual(str2, "DELETE") && !Intrinsics.areEqual(str2, "MOVE")) {
                        int i34 = f62457a + 77;
                        f62458b = i34 % 128;
                        int i35 = i34 % 2;
                        return Boolean.FALSE;
                    }
                }
            }
            int i36 = f62457a;
            int i37 = i36 & 109;
            int i38 = (i36 ^ 109) | i37;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f62458b = i39 % 128;
            int i40 = i39 % 2;
            return Boolean.TRUE;
        }
        if (i15 != 3) {
            if (i15 != 4) {
                String str3 = (String) objArr[0];
                int i41 = f62458b + 53;
                f62457a = i41 % 128;
                int i42 = i41 % 2;
                Intrinsics.checkNotNullParameter(str3, "");
                boolean zAreEqual = Intrinsics.areEqual(str3, "PROPFIND");
                int i43 = f62457a + 77;
                f62458b = i43 % 128;
                if (i43 % 2 != 0) {
                    return Boolean.valueOf(zAreEqual);
                }
                throw null;
            }
            String str4 = (String) objArr[0];
            int i44 = f62457a;
            int i45 = (i44 & 109) + (i44 | 109);
            f62458b = i45 % 128;
            if (i45 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.areEqual(str4, "GET");
                throw null;
            }
            Intrinsics.checkNotNullParameter(str4, "");
            if (!Intrinsics.areEqual(str4, "GET")) {
                int i46 = f62457a;
                int i47 = ((i46 & 21) - (~(-(-(i46 | 21))))) - 1;
                f62458b = i47 % 128;
                int i48 = i47 % 2;
                if (!Intrinsics.areEqual(str4, "HEAD")) {
                    int i49 = f62457a;
                    int i50 = (i49 & (-30)) | ((~i49) & 29);
                    int i51 = -(-((i49 & 29) << 1));
                    int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                    f62458b = i52 % 128;
                    int i53 = i52 % 2;
                    return Boolean.TRUE;
                }
            }
            int i54 = f62457a;
            int i55 = ((i54 ^ 15) | (i54 & 15)) << 1;
            int i56 = -(((~i54) & 15) | (i54 & (-16)));
            int i57 = (i55 & i56) + (i56 | i55);
            f62458b = i57 % 128;
            int i58 = i57 % 2;
            return Boolean.FALSE;
        }
        String str5 = (String) objArr[0];
        int i59 = f62457a + 123;
        f62458b = i59 % 128;
        int i60 = i59 % 2;
        Intrinsics.checkNotNullParameter(str5, "");
        if (!Intrinsics.areEqual(str5, "POST")) {
            int i61 = f62458b;
            int i62 = i61 & 125;
            int i63 = -(-((i61 ^ 125) | i62));
            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
            f62457a = i64 % 128;
            if (i64 % 2 != 0) {
                Intrinsics.areEqual(str5, Request.PUT);
                throw null;
            }
            if (!Intrinsics.areEqual(str5, Request.PUT) && !Intrinsics.areEqual(str5, "PATCH")) {
                int i65 = f62458b;
                int i66 = i65 & 27;
                int i67 = (i66 - (~((i65 ^ 27) | i66))) - 1;
                f62457a = i67 % 128;
                if (i67 % 2 != 0) {
                    Intrinsics.areEqual(str5, "PROPPATCH");
                    throw null;
                }
                if (!Intrinsics.areEqual(str5, "PROPPATCH")) {
                    int i68 = f62458b;
                    int i69 = (i68 & (-36)) | ((~i68) & 35);
                    int i70 = -(-((i68 & 35) << 1));
                    int i71 = (i69 ^ i70) + ((i70 & i69) << 1);
                    f62457a = i71 % 128;
                    int i72 = i71 % 2;
                    if (!Intrinsics.areEqual(str5, "REPORT")) {
                        int i73 = f62458b;
                        int i74 = i73 & 69;
                        int i75 = ((i73 ^ 69) | i74) << 1;
                        int i76 = -((i73 | 69) & (~i74));
                        int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                        f62457a = i77 % 128;
                        if (i77 % 2 == 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                }
            }
        }
        int i78 = f62457a;
        int i79 = i78 & 33;
        int i80 = (i78 ^ 33) | i79;
        int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
        f62458b = i81 % 128;
        int i82 = i81 % 2;
        return Boolean.TRUE;
    }

    public static boolean setX(@NotNull String p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4}, 1437175414, -1437175413, (int) System.currentTimeMillis())).booleanValue();
    }

    @JvmStatic
    public static final boolean setY(@NotNull String p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4}, -1105951935, 1105951938, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setOnFocusChangeListener(@NotNull String p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{p4}, -970697315, 970697317, (int) System.currentTimeMillis())).booleanValue();
    }
}
