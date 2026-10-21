package com.mypinpad.tsdk.isolation;

import com.mypinpad.tsdk.api.errors.TerminalException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61478a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61479b = 1;

    @Nullable
    public static final byte[] setDividerPadding(@NotNull JSONObject jSONObject, @NotNull String str) throws TerminalException {
        return (byte[]) setX(new Object[]{jSONObject, str}, -649889507, 649889508, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ec  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws JSONException, TerminalException {
        int i13;
        int i14 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
        int i15 = (~i11) | i10;
        int i16 = ~i12;
        int i17 = (((~(i10 | i16)) | i11) * 216) + ((i15 | i16) * (-216)) + i14;
        byte[] x4 = null;
        if (i17 != 1) {
            if (i17 != 2) {
                JSONObject jSONObject = (JSONObject) objArr[0];
                String str = (String) objArr[1];
                int i18 = f61478a + 111;
                f61479b = i18 % 128;
                int i19 = i18 % 2;
                Intrinsics.checkNotNullParameter(jSONObject, "");
                Intrinsics.checkNotNullParameter(str, "");
                String string = jSONObject.getString(str);
                Intrinsics.checkNotNullExpressionValue(string, "");
                byte[] onFocusChangeListener = vc.setOnFocusChangeListener(string);
                int i20 = f61479b;
                int i21 = (i20 & 115) + (i20 | 115);
                f61478a = i21 % 128;
                if (i21 % 2 == 0) {
                    return onFocusChangeListener;
                }
                throw null;
            }
            JSONObject jSONObject2 = (JSONObject) objArr[0];
            String str2 = (String) objArr[1];
            int i22 = f61479b;
            int i23 = i22 & 35;
            int i24 = -(-((i22 ^ 35) | i23));
            int i25 = (i23 & i24) + (i24 | i23);
            f61478a = i25 % 128;
            if (i25 % 2 == 0) {
                Intrinsics.checkNotNullParameter(jSONObject2, "");
                Intrinsics.checkNotNullParameter(str2, "");
                String string2 = jSONObject2.getString(str2);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return vc.setX(string2);
            }
            Intrinsics.checkNotNullParameter(jSONObject2, "");
            Intrinsics.checkNotNullParameter(str2, "");
            String string3 = jSONObject2.getString(str2);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            vc.setX(string3);
            throw null;
        }
        JSONObject jSONObject3 = (JSONObject) objArr[0];
        String str3 = (String) objArr[1];
        int i26 = f61478a;
        int i27 = i26 & 1;
        int i28 = (i26 ^ 1) | i27;
        int i29 = (i27 & i28) + (i28 | i27);
        f61479b = i29 % 128;
        if (i29 % 2 == 0) {
            Intrinsics.checkNotNullParameter(jSONObject3, "");
            Intrinsics.checkNotNullParameter(str3, "");
            jSONObject3.opt(str3);
            throw null;
        }
        Intrinsics.checkNotNullParameter(jSONObject3, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Object objOpt = jSONObject3.opt(str3);
        if (objOpt != null) {
            int i30 = f61479b;
            int i31 = ((i30 ^ 73) | (i30 & 73)) << 1;
            int i32 = -(((~i30) & 73) | (i30 & (-74)));
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            f61478a = i33 % 128;
            int i34 = i33 % 2;
            if (objOpt instanceof String) {
                x4 = vc.setX((String) objOpt);
                int i35 = f61479b;
                i13 = (i35 ^ 101) + ((i35 & 101) << 1);
            } else {
                int i36 = f61479b;
                int i37 = i36 & 83;
                i13 = (i37 - (~((i36 ^ 83) | i37))) - 1;
            }
        } else {
            int i38 = f61479b;
            int i39 = i38 & 83;
            i13 = (i39 - (~((i38 ^ 83) | i39))) - 1;
        }
        f61478a = i13 % 128;
        int i40 = i13 % 2;
        return x4;
    }

    @NotNull
    public static final byte[] setY(@NotNull JSONObject jSONObject, @NotNull String str) throws JSONException, TerminalException {
        return (byte[]) setX(new Object[]{jSONObject, str}, -748840383, 748840385, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setX(@NotNull JSONObject jSONObject, @NotNull String str) throws JSONException, TerminalException {
        return (byte[]) setX(new Object[]{jSONObject, str}, 1760386962, -1760386962, (int) System.currentTimeMillis());
    }
}
