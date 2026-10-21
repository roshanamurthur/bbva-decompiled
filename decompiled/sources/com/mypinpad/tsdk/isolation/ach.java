package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ach {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52388a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52389b = 1;

    public static /* synthetic */ aco a() {
        int i10 = f52388a + 83;
        f52389b = i10 % 128;
        int i11 = i10 % 2;
        aco acoVar = (aco) e0.a(new Object[0], -1880730629, 1880730631, (int) System.currentTimeMillis());
        int i12 = f52388a;
        int i13 = (((i12 | 122) << 1) - (i12 ^ 122)) - 1;
        f52389b = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 34 / 0;
        }
        return acoVar;
    }

    public static /* synthetic */ abv b(Object[] objArr) {
        aco acoVar = (aco) objArr[0];
        int i10 = f52388a;
        int i11 = ((i10 & (-44)) | ((~i10) & 43)) + ((i10 & 43) << 1);
        f52389b = i11 % 128;
        int i12 = i11 % 2;
        abv abvVar = (abv) e0.a(new Object[]{acoVar}, 913010438, -913010438, (int) System.currentTimeMillis());
        int i13 = f52389b;
        int i14 = ((i13 & (-112)) | ((~i13) & 111)) + ((i13 & 111) << 1);
        f52388a = i14 % 128;
        if (i14 % 2 == 0) {
            return abvVar;
        }
        throw null;
    }

    public static /* synthetic */ acp c(Object[] objArr) {
        Socket socket = (Socket) objArr[0];
        int i10 = f52389b;
        int i11 = i10 ^ 5;
        int i12 = -(-((i10 & 5) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52388a = i13 % 128;
        int i14 = i13 % 2;
        acp acpVar = (acp) d0.a(new Object[]{socket}, 1376174841, -1376174837, (int) System.currentTimeMillis());
        int i15 = f52389b;
        int i16 = (i15 | 31) << 1;
        int i17 = -(i15 ^ 31);
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f52388a = i18 % 128;
        if (i18 % 2 == 0) {
            return acpVar;
        }
        throw null;
    }

    public static final boolean setCompoundDrawableTintBlendMode(@NotNull AssertionError assertionError) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{assertionError}, -1623690444, 1623690450, (int) System.currentTimeMillis())).booleanValue();
    }

    @JvmName(name = "blackhole")
    @NotNull
    public static final aco setDividerPadding() {
        return (aco) setOnFocusChangeListener(new Object[0], -365975954, 365975956, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
        int i16 = i11 | i13;
        switch ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15) {
            case 1:
                return b(objArr);
            case 2:
                return a();
            case 3:
                return c(objArr);
            case 4:
                acp acpVar = (acp) objArr[0];
                int i17 = f52388a;
                int i18 = (((i17 ^ 11) | (i17 & 11)) << 1) - (((~i17) & 11) | (i17 & (-12)));
                f52389b = i18 % 128;
                int i19 = i18 % 2;
                aby abyVar = (aby) e0.a(new Object[]{acpVar}, -1380930630, 1380930631, (int) System.currentTimeMillis());
                int i20 = f52389b;
                int i21 = (i20 & 33) + (i20 | 33);
                f52388a = i21 % 128;
                int i22 = i21 % 2;
                return abyVar;
            case 5:
                InputStream inputStream = (InputStream) objArr[0];
                int i23 = f52388a;
                int i24 = i23 & 45;
                int i25 = ((i23 ^ 45) | i24) << 1;
                int i26 = -((i23 | 45) & (~i24));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                f52389b = i27 % 128;
                int i28 = i27 % 2;
                acp acpVar2 = (acp) d0.a(new Object[]{inputStream}, -644770052, 644770052, (int) System.currentTimeMillis());
                System.currentTimeMillis();
                System.currentTimeMillis();
                return acpVar2;
            case 6:
                AssertionError assertionError = (AssertionError) objArr[0];
                int i29 = f52389b;
                int i30 = ((i29 & 82) + (i29 | 82)) - 1;
                f52388a = i30 % 128;
                Object[] objArr2 = new Object[1];
                if (i30 % 2 == 0) {
                    objArr2[0] = assertionError;
                    return Boolean.valueOf(((Boolean) d0.a(objArr2, -1840766099, 1840766102, (int) System.currentTimeMillis())).booleanValue());
                }
                objArr2[0] = assertionError;
                ((Boolean) d0.a(objArr2, -1840766099, 1840766102, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            default:
                Socket socket = (Socket) objArr[0];
                int i31 = f52389b;
                int i32 = i31 ^ 107;
                int i33 = ((i31 & 107) | i32) << 1;
                int i34 = -i32;
                int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                f52388a = i35 % 128;
                int i36 = i35 % 2;
                aco acoVar = (aco) d0.a(new Object[]{socket}, -1754345016, 1754345017, (int) System.currentTimeMillis());
                System.currentTimeMillis();
                System.currentTimeMillis();
                return acoVar;
        }
    }

    @NotNull
    public static final aby setX(@NotNull acp acpVar) {
        return (aby) setOnFocusChangeListener(new Object[]{acpVar}, -878740537, 878740541, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final aco setY(@NotNull Socket socket) throws IOException {
        return (aco) setOnFocusChangeListener(new Object[]{socket}, -85046677, 85046677, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final acp setCompoundDrawableTintBlendMode(@NotNull Socket socket) throws IOException {
        return (acp) setOnFocusChangeListener(new Object[]{socket}, -1701685100, 1701685103, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final abv setDividerPadding(@NotNull aco acoVar) {
        return (abv) setOnFocusChangeListener(new Object[]{acoVar}, -678282231, 678282232, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final acp setX(@NotNull InputStream inputStream) {
        return (acp) setOnFocusChangeListener(new Object[]{inputStream}, -1653320900, 1653320905, (int) System.currentTimeMillis());
    }
}
