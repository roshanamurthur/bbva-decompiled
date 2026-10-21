package com.mypinpad.tsdk.isolation;

import ak.b;
import bk.q;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.fasterxml.jackson.core.JsonPointer;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.UShort;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@JvmName(name = "Util")
public final class yt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final aci f62203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Regex f62204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f62205c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62206d = 1;

    @JvmField
    @NotNull
    public static final TimeZone setCompoundDrawableTintBlendMode;

    @JvmField
    @NotNull
    public static final yn setDividerPadding;

    @JvmField
    @NotNull
    public static final String setOnDragListener;

    @JvmField
    public static final boolean setOnFocusChangeListener;

    @JvmField
    @NotNull
    public static final byte[] setX;

    @JvmField
    @NotNull
    public static final ye setY;

    static {
        byte[] bArr = new byte[0];
        setX = bArr;
        ye.Companion companion = ye.INSTANCE;
        setY = ye.Companion.setOnFocusChangeListener(new String[0]);
        setDividerPadding = (yn) yn.Companion.setCompoundDrawableTintBlendMode(new Object[]{yn.INSTANCE, bArr}, -1555551412, 1555551414, (int) System.currentTimeMillis());
        yo.Companion companion2 = yo.INSTANCE;
        aci.Companion companion3 = aci.INSTANCE;
        abw.Companion companion4 = abw.INSTANCE;
        f62203a = (aci) aci.Companion.setY(new Object[]{companion3, new abw[]{(abw) abw.Companion.setOnFocusChangeListener(new Object[]{"efbbbf"}, 948642662, -948642658, (int) System.currentTimeMillis()), (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"feff"}, 948642662, -948642658, (int) System.currentTimeMillis()), (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"fffe"}, 948642662, -948642658, (int) System.currentTimeMillis()), (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"0000ffff"}, 948642662, -948642658, (int) System.currentTimeMillis()), (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"ffff0000"}, 948642662, -948642658, (int) System.currentTimeMillis())}}, -1159774451, 1159774453, System.identityHashCode(companion3));
        TimeZone timeZone = TimeZone.getTimeZone(Time.GMT);
        Intrinsics.checkNotNull(timeZone);
        setCompoundDrawableTintBlendMode = timeZone;
        f62204b = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        setOnFocusChangeListener = false;
        String name = ym.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        setOnDragListener = StringsKt__StringsKt.removeSuffix(StringsKt__StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
        int i10 = f62206d;
        int i11 = (((i10 ^ 71) | (i10 & 71)) << 1) - (((~i10) & 71) | (i10 & (-72)));
        f62205c = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Boolean A(Object[] objArr) throws NoSuchAlgorithmException, CloneNotSupportedException {
        boolean zBooleanValue = false;
        acp acpVar = (acp) objArr[0];
        TimeUnit timeUnit = (TimeUnit) objArr[1];
        int i10 = f62205c;
        int i11 = i10 & 85;
        int i12 = ((i10 ^ 85) | i11) << 1;
        int i13 = -((i10 | 85) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f62206d = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(acpVar, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            zBooleanValue = ((Boolean) setY(new Object[]{acpVar, 100, timeUnit}, -1187644817, 1187644820, 100)).booleanValue();
            int i16 = f62205c;
            int i17 = (-2) - (((i16 & 54) + (i16 | 54)) ^ (-1));
            f62206d = i17 % 128;
            int i18 = i17 % 2;
        } catch (IOException unused) {
        }
        int i19 = f62205c + 91;
        f62206d = i19 % 128;
        int i20 = i19 % 2;
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.mypinpad.tsdk.i.g10] */
    public static /* synthetic */ g10 B(Object[] objArr) {
        final String str = (String) objArr[0];
        final boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f62206d;
        int i11 = ((i10 ^ 59) | (i10 & 59)) << 1;
        int i12 = -(((~i10) & 59) | (i10 & (-60)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f62205c = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        ?? r1 = new ThreadFactory() { // from class: com.mypinpad.tsdk.i.g10
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                byte[] bArr = yt.setX;
                return (Thread) yt.setY(new Object[]{str, Boolean.valueOf(zBooleanValue), runnable}, -2104837599, 2104837614, (int) System.currentTimeMillis());
            }
        };
        int i14 = f62205c;
        int i15 = i14 & 67;
        int i16 = -(-(i14 | 67));
        int i17 = (i15 & i16) + (i16 | i15);
        f62206d = i17 % 128;
        int i18 = i17 % 2;
        return r1;
    }

    public static /* synthetic */ String C(Object[] objArr) {
        String str = (String) objArr[0];
        Object[] objArr2 = (Object[]) objArr[1];
        int i10 = f62205c;
        int i11 = ((i10 & (-114)) | ((~i10) & 113)) + ((i10 & 113) << 1);
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr2, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        int i13 = f62206d;
        int i14 = ((i13 ^ 2) + ((i13 & 2) << 1)) - 1;
        f62205c = i14 % 128;
        if (i14 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public static /* synthetic */ Boolean D(Object[] objArr) {
        boolean z10;
        Socket socket = (Socket) objArr[0];
        boolean z11 = true;
        aby abyVar = (aby) objArr[1];
        int i10 = f62206d;
        int i11 = (((i10 | 28) << 1) - (i10 ^ 28)) - 1;
        f62205c = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(socket, "");
        Intrinsics.checkNotNullParameter(abyVar, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                if (abyVar.setX()) {
                    int i13 = f62206d;
                    int i14 = (i13 ^ 43) + ((i13 & 43) << 1);
                    f62205c = i14 % 128;
                    int i15 = i14 % 2;
                    z10 = false;
                } else {
                    int i16 = f62206d + 21;
                    int i17 = i16 % 128;
                    f62205c = i17;
                    z10 = i16 % 2 == 0;
                    int i18 = (i17 ^ 37) + ((i17 & 37) << 1);
                    f62206d = i18 % 128;
                    int i19 = i18 % 2;
                }
                socket.setSoTimeout(soTimeout);
                int i20 = f62206d;
                int i21 = i20 ^ 59;
                int i22 = ((i20 & 59) | i21) << 1;
                int i23 = -i21;
                int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
                f62205c = i24 % 128;
                int i25 = i24 % 2;
                int i26 = ((i20 ^ 108) + ((i20 & 108) << 1)) - 1;
                f62205c = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 18 / 0;
                }
                z11 = z10;
            } catch (Throwable th2) {
                socket.setSoTimeout(soTimeout);
                throw th2;
            }
        } catch (SocketTimeoutException unused) {
        } catch (IOException unused2) {
            z11 = false;
        }
        int i28 = f62206d;
        int i29 = i28 & 123;
        int i30 = -(-((i28 ^ 123) | i29));
        int i31 = (i29 & i30) + (i30 | i29);
        f62205c = i31 % 128;
        if (i31 % 2 == 0) {
            return Boolean.valueOf(z11);
        }
        int i32 = 14 / 0;
        return Boolean.valueOf(z11);
    }

    public static /* synthetic */ Boolean E(Object[] objArr) {
        long jC_;
        boolean z10 = false;
        acp acpVar = (acp) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        TimeUnit timeUnit = (TimeUnit) objArr[2];
        int i10 = f62206d;
        int i11 = (i10 & 35) + (i10 | 35);
        f62205c = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(acpVar, "");
            Intrinsics.checkNotNullParameter(timeUnit, "");
            System.nanoTime();
            acpVar.setY().b_();
            throw null;
        }
        Intrinsics.checkNotNullParameter(acpVar, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        long jNanoTime = System.nanoTime();
        if (acpVar.setY().b_()) {
            int i12 = f62205c;
            int i13 = ((i12 & 30) + (i12 | 30)) - 1;
            f62206d = i13 % 128;
            int i14 = i13 % 2;
            jC_ = acpVar.setY().c_() - jNanoTime;
            int i15 = f62206d + 9;
            f62205c = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = f62206d;
            int i18 = (i17 & 5) + (i17 | 5);
            f62205c = i18 % 128;
            int i19 = i18 % 2;
            jC_ = Long.MAX_VALUE;
        }
        acpVar.setY().setY(Math.min(jC_, timeUnit.toNanos(iIntValue)) + jNanoTime);
        try {
            abx abxVar = new abx();
            int i20 = f62206d;
            int i21 = i20 & 35;
            int i22 = i20 | 35;
            int i23 = (i21 & i22) + (i22 | i21);
            f62205c = i23 % 128;
            int i24 = i23 % 2;
            while (acpVar.setY(abxVar, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1) {
                int i25 = f62205c;
                int i26 = ((i25 ^ 57) | (i25 & 57)) << 1;
                int i27 = -(((~i25) & 57) | (i25 & (-58)));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f62206d = i28 % 128;
                int i29 = i28 % 2;
                abx.setOnFocusChangeListener(new Object[]{abxVar}, 502611487, -502611445, System.identityHashCode(abxVar));
                int i30 = f62206d;
                int i31 = i30 & 85;
                int i32 = -(-((i30 ^ 85) | i31));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f62205c = i33 % 128;
                int i34 = i33 % 2;
            }
            if (jC_ == Long.MAX_VALUE) {
                int i35 = f62206d;
                int i36 = i35 & 111;
                int i37 = (i35 | 111) & (~i36);
                int i38 = i36 << 1;
                int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                f62205c = i39 % 128;
                if (i39 % 2 != 0) {
                    acpVar.setY().setOnDragListener();
                    int i40 = 55 / 0;
                } else {
                    acpVar.setY().setOnDragListener();
                }
                int i41 = f62206d;
                int i42 = i41 | 85;
                int i43 = (i42 << 1) - ((~(i41 & 85)) & i42);
                f62205c = i43 % 128;
                int i44 = i43 % 2;
            } else {
                acpVar.setY().setY(jNanoTime + jC_);
                int i45 = f62205c;
                int i46 = (i45 | 117) << 1;
                int i47 = -(((~i45) & 117) | (i45 & (-118)));
                int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                f62206d = i48 % 128;
                int i49 = i48 % 2;
            }
            z10 = true;
        } catch (InterruptedIOException unused) {
            if (jC_ == Long.MAX_VALUE) {
                acpVar.setY().setOnDragListener();
                int i50 = f62206d;
                int i51 = i50 & 67;
                int i52 = -(-(i50 | 67));
                int i53 = (i51 & i52) + (i52 | i51);
                f62205c = i53 % 128;
                int i54 = i53 % 2;
            } else {
                acpVar.setY().setY(jNanoTime + jC_);
                int i55 = f62205c + 111;
                f62206d = i55 % 128;
                int i56 = i55 % 2;
            }
        } catch (Throwable th2) {
            if (jC_ == Long.MAX_VALUE) {
                acpVar.setY().setOnDragListener();
                int i57 = f62206d;
                int i58 = i57 & 39;
                int i59 = (i57 ^ 39) | i58;
                int i60 = ((i58 | i59) << 1) - (i59 ^ i58);
                f62205c = i60 % 128;
                int i61 = i60 % 2;
            } else {
                acpVar.setY().setY(jNanoTime + jC_);
                int i62 = f62206d;
                int i63 = (i62 ^ 57) + ((i62 & 57) << 1);
                f62205c = i63 % 128;
                int i64 = i63 % 2;
            }
            throw th2;
        }
        int i65 = f62205c;
        int i66 = i65 & 49;
        int i67 = (i65 ^ 49) | i66;
        int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
        f62206d = i68 % 128;
        if (i68 % 2 != 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ Integer F(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        String str = (String) objArr[0];
        char cCharValue = ((Character) objArr[1]).charValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f62206d;
        int i11 = i10 & 89;
        int i12 = -(-(i10 | 89));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f62205c = i14;
        if (i13 % 2 == 0 ? (iIntValue2 & 4) != 0 : (iIntValue2 & 5) != 0) {
            int i15 = i14 + 1;
            f62206d = i15 % 128;
            int i16 = i15 % 2;
            iIntValue = str.length();
            int i17 = f62205c + 7;
            f62206d = i17 % 128;
            int i18 = i17 % 2;
        }
        int iIntValue3 = ((Integer) setY(new Object[]{str, Character.valueOf(cCharValue), 0, Integer.valueOf(iIntValue)}, -1105526239, 1105526263, 0)).intValue();
        int i19 = f62206d + 53;
        f62205c = i19 % 128;
        if (i19 % 2 == 0) {
            return Integer.valueOf(iIntValue3);
        }
        throw null;
    }

    public static /* synthetic */ Integer a(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f62205c + 29;
        f62206d = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int i11 = f62206d;
        int i12 = i11 & 43;
        int i13 = (i11 | 43) & (~i12);
        int i14 = i12 << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        f62205c = i15 % 128;
        int i16 = i15 % 2;
        while (iIntValue < iIntValue2) {
            int i17 = f62205c;
            int i18 = (i17 ^ 3) + ((i17 & 3) << 1);
            f62206d = i18 % 128;
            int i19 = i18 % 2;
            int i20 = iIntValue & (-115);
            int i21 = (((iIntValue ^ (-115)) | i20) << 1) - ((~i20) & (iIntValue | (-115)));
            int i22 = i21 & 116;
            int i23 = (i21 ^ 116) | i22;
            int i24 = (i23 | i22) + (i22 & i23);
            if (StringsKt__StringsKt.contains$default((CharSequence) str2, str.charAt(iIntValue), false, 2, (Object) null)) {
                int i25 = f62205c;
                int i26 = ((i25 | 109) << 1) - (i25 ^ 109);
                int i27 = i26 % 128;
                f62206d = i27;
                int i28 = i26 % 2;
                int i29 = i27 & 15;
                int i30 = (i27 | 15) & (~i29);
                int i31 = i29 << 1;
                int i32 = (i30 & i31) + (i30 | i31);
                f62205c = i32 % 128;
                if (i32 % 2 == 0) {
                    return Integer.valueOf(iIntValue);
                }
                int i33 = 72 / 0;
                return Integer.valueOf(iIntValue);
            }
            iIntValue = i24;
        }
        int i34 = f62206d;
        int i35 = i34 ^ 29;
        int i36 = -(-((i34 & 29) << 1));
        int i37 = (i35 & i36) + (i36 | i35);
        f62205c = i37 % 128;
        int i38 = i37 % 2;
        return Integer.valueOf(iIntValue2);
    }

    public static /* synthetic */ Integer b(Object[] objArr) throws NoSuchAlgorithmException, IOException {
        abx abxVar = (abx) objArr[0];
        int i10 = f62205c;
        int i11 = ((i10 & 89) - (~(-(-(i10 | 89))))) - 1;
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(abxVar, "");
        int i13 = f62206d;
        int i14 = i13 & 125;
        int i15 = (i14 - (~(-(-((i13 ^ 125) | i14))))) - 1;
        f62205c = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (!((Boolean) abx.setOnFocusChangeListener(new Object[]{abxVar}, -1474615858, 1474615886, System.identityHashCode(abxVar))).booleanValue()) {
            int i18 = f62205c;
            int i19 = ((i18 | 79) << 1) - (i18 ^ 79);
            f62206d = i19 % 128;
            if (i19 % 2 != 0) {
                if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar, 0L}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue() != 61) {
                    break;
                }
                int i20 = f62205c;
                int i21 = i20 & 65;
                int i22 = -(-((i20 ^ 65) | i21));
                int i23 = (i21 & i22) + (i22 | i21);
                f62206d = i23 % 128;
                int i24 = i23 % 2;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i25 = i17 * (-463);
                int i26 = 465 & i25;
                int i27 = (i25 | 465) & (~i26);
                int i28 = i26 << 1;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                int i30 = ~i17;
                int i31 = ~iCurrentTimeMillis;
                int i32 = (i31 | iCurrentTimeMillis) & i31;
                int i33 = (~i32) & i30;
                int i34 = ~i30;
                int i35 = i33 | (i32 & i34);
                int i36 = i32 & i30;
                int i37 = ~((i36 & i35) | (i35 ^ i36));
                int i38 = (i17 | i30) & i30;
                int i39 = (i38 & 1) | (i38 ^ 1);
                int i40 = ~i39;
                int i41 = (i39 | i40) & i40;
                int i42 = i37 ^ i41;
                int i43 = i41 & i37;
                int i44 = (i43 & i42) | (i42 ^ i43);
                int i45 = i31 | 1;
                int i46 = ~i45;
                int i47 = (i45 | i46) & i46;
                int i48 = i44 & i47;
                int i49 = (i44 | i47) & (~i48);
                int i50 = -(-(((i49 & i48) | (i49 ^ i48)) * 464));
                int i51 = i29 & i50;
                int i52 = (i50 ^ i29) | i51;
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                int i54 = iCurrentTimeMillis ^ (-2);
                int i55 = iCurrentTimeMillis & (-2);
                int i56 = (i54 & i55) | (i54 ^ i55);
                int i57 = (i56 & i34) | ((~i56) & i30);
                int i58 = i56 & i30;
                int i59 = (-2) - (((i53 - (~(-(~(((i58 & i57) | (i57 ^ i58)) * (-464)))))) - 1) ^ (-1));
                int i60 = i30 ^ 1;
                int i61 = i30 & 1;
                int i62 = ~((i61 & i60) | (i60 ^ i61));
                int i63 = iCurrentTimeMillis & 1;
                int i64 = (iCurrentTimeMillis | 1) & (~i63);
                int i65 = ~((i64 & i63) | (i64 ^ i63));
                int i66 = i62 & i65;
                int i67 = (i65 | i62) & (~i66);
                i17 = (i59 - (~(-(-(((i67 & i66) | (i67 ^ i66)) * 464))))) - 1;
                ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar}, 33298663, -33298647, System.identityHashCode(abxVar))).byteValue();
                int i68 = f62206d;
                int i69 = (i68 & 9) + (i68 | 9);
                f62205c = i69 % 128;
                int i70 = i69 % 2;
            } else {
                if (((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar, 1L}, 630256048, -630256030, System.identityHashCode(abxVar))).byteValue() != 120) {
                    break;
                }
                int i210 = f62205c;
                int i211 = i210 & 65;
                int i212 = -(-((i210 ^ 65) | i211));
                int i213 = (i211 & i212) + (i212 | i211);
                f62206d = i213 % 128;
                int i214 = i213 % 2;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i215 = i17 * (-463);
                int i216 = 465 & i215;
                int i217 = (i215 | 465) & (~i216);
                int i218 = i216 << 1;
                int i219 = ((i217 | i218) << 1) - (i217 ^ i218);
                int i310 = ~i17;
                int i311 = ~iCurrentTimeMillis2;
                int i312 = (i311 | iCurrentTimeMillis2) & i311;
                int i313 = (~i312) & i310;
                int i314 = ~i310;
                int i315 = i313 | (i312 & i314);
                int i316 = i312 & i310;
                int i317 = ~((i316 & i315) | (i315 ^ i316));
                int i318 = (i17 | i310) & i310;
                int i319 = (i318 & 1) | (i318 ^ 1);
                int i410 = ~i319;
                int i411 = (i319 | i410) & i410;
                int i412 = i317 ^ i411;
                int i413 = i411 & i317;
                int i414 = (i413 & i412) | (i412 ^ i413);
                int i415 = i311 | 1;
                int i416 = ~i415;
                int i417 = (i415 | i416) & i416;
                int i418 = i414 & i417;
                int i419 = (i414 | i417) & (~i418);
                int i510 = -(-(((i419 & i418) | (i419 ^ i418)) * 464));
                int i511 = i219 & i510;
                int i512 = (i510 ^ i219) | i511;
                int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                int i514 = iCurrentTimeMillis2 ^ (-2);
                int i515 = iCurrentTimeMillis2 & (-2);
                int i516 = (i514 & i515) | (i514 ^ i515);
                int i517 = (i516 & i314) | ((~i516) & i310);
                int i518 = i516 & i310;
                int i519 = (-2) - (((i513 - (~(-(~(((i518 & i517) | (i517 ^ i518)) * (-464)))))) - 1) ^ (-1));
                int i610 = i310 ^ 1;
                int i611 = i310 & 1;
                int i612 = ~((i611 & i610) | (i610 ^ i611));
                int i613 = iCurrentTimeMillis2 & 1;
                int i614 = (iCurrentTimeMillis2 | 1) & (~i613);
                int i615 = ~((i614 & i613) | (i614 ^ i613));
                int i616 = i612 & i615;
                int i617 = (i615 | i612) & (~i616);
                i17 = (i519 - (~(-(-(((i617 & i616) | (i617 ^ i616)) * 464))))) - 1;
                ((Byte) abx.setOnFocusChangeListener(new Object[]{abxVar}, 33298663, -33298647, System.identityHashCode(abxVar))).byteValue();
                int i618 = f62206d;
                int i619 = (i618 & 9) + (i618 | 9);
                f62205c = i619 % 128;
                int i71 = i619 % 2;
            }
        }
        int i72 = f62206d;
        int i73 = i72 & 27;
        int i74 = ((i72 ^ 27) | i73) << 1;
        int i75 = -((i72 | 27) & (~i73));
        int i76 = (i74 & i75) + (i75 | i74);
        f62205c = i76 % 128;
        if (i76 % 2 == 0) {
            return Integer.valueOf(i17);
        }
        int i77 = 89 / 0;
        return Integer.valueOf(i17);
    }

    public static /* synthetic */ Thread c(Object[] objArr) {
        String str = (String) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Runnable runnable = (Runnable) objArr[2];
        Intrinsics.checkNotNullParameter(str, "");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(zBooleanValue);
        int i10 = f62206d;
        int i11 = i10 & 115;
        int i12 = (i10 | 115) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f62205c = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 11 / 0;
        }
        return thread;
    }

    public static /* synthetic */ Map d(Object[] objArr) {
        Map map = (Map) objArr[0];
        int i10 = f62206d;
        int i11 = (i10 & (-126)) | ((~i10) & 125);
        int i12 = (i10 & 125) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        f62205c = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(map, "");
        if (!map.isEmpty()) {
            Map mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
            Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
            int i15 = f62205c + 72;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f62206d = i16 % 128;
            if (i16 % 2 != 0) {
                return mapUnmodifiableMap;
            }
            int i17 = 47 / 0;
            return mapUnmodifiableMap;
        }
        int i18 = f62205c;
        int i19 = ((i18 & 51) - (~(-(-(i18 | 51))))) - 1;
        f62206d = i19 % 128;
        if (i19 % 2 == 0) {
            q.emptyMap();
            throw null;
        }
        Map mapEmptyMap = q.emptyMap();
        int i20 = f62206d;
        int i21 = i20 & 113;
        int i22 = ((i20 | 113) & (~i21)) + (i21 << 1);
        f62205c = i22 % 128;
        if (i22 % 2 == 0) {
            return mapEmptyMap;
        }
        int i23 = 53 / 0;
        return mapEmptyMap;
    }

    public static /* synthetic */ String e(Object[] objArr) throws IOException {
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f62206d;
        int i11 = i10 & 33;
        int i12 = -(-((i10 ^ 33) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f62205c = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int iIntValue3 = ((Integer) setY(new Object[]{str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, -1390836990, 1390837019, iIntValue)).intValue();
            Intrinsics.checkNotNullExpressionValue(str.substring(iIntValue3, ((Integer) setY(new Object[]{str, Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2)}, -1844371224, 1844371266, iIntValue3)).intValue()), "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        int iIntValue4 = ((Integer) setY(new Object[]{str, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)}, -1390836990, 1390837019, iIntValue)).intValue();
        String strSubstring = str.substring(iIntValue4, ((Integer) setY(new Object[]{str, Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue2)}, -1844371224, 1844371266, iIntValue4)).intValue());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0096  */
    /* JADX WARN: Code duplicated, block: B:9:0x005d  */
    public static /* synthetic */ String f(Object[] objArr) {
        String string;
        int i10;
        yg ygVar = (yg) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i11 = f62205c;
        int i12 = i11 & 7;
        int i13 = (i11 ^ 7) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f62206d = i14 % 128;
        if (i14 % 2 == 0) {
            Intrinsics.checkNotNullParameter(ygVar, "");
            if (StringsKt__StringsKt.contains$default((CharSequence) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)), (CharSequence) DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, true, 4, (Object) null)) {
                StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
                sb2.append((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)));
                sb2.append(AbstractJsonLexerKt.END_LIST);
                string = sb2.toString();
                int i15 = f62206d;
                int i16 = (i15 & (-70)) | ((~i15) & 69);
                int i17 = -(-((i15 & 69) << 1));
                i10 = (i16 ^ i17) + ((i17 & i16) << 1);
                f62205c = i10 % 128;
            } else {
                string = (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar));
                int i18 = f62205c;
                int i19 = i18 & 5;
                int i20 = (i18 ^ 5) | i19;
                i10 = (i19 ^ i20) + ((i20 & i19) << 1);
                f62206d = i10 % 128;
            }
        } else {
            Intrinsics.checkNotNullParameter(ygVar, "");
            if (StringsKt__StringsKt.contains$default((CharSequence) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)), (CharSequence) DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, false, 2, (Object) null)) {
                StringBuilder sb3 = new StringBuilder(Constant.BRACKET_OPEN);
                sb3.append((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)));
                sb3.append(AbstractJsonLexerKt.END_LIST);
                string = sb3.toString();
                int i110 = f62206d;
                int i111 = (i110 & (-70)) | ((~i110) & 69);
                int i112 = -(-((i110 & 69) << 1));
                i10 = (i111 ^ i112) + ((i112 & i111) << 1);
                f62205c = i10 % 128;
            } else {
                string = (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar));
                int i113 = f62205c;
                int i114 = i113 & 5;
                int i21 = (i113 ^ 5) | i114;
                i10 = (i114 ^ i21) + ((i21 & i114) << 1);
                f62206d = i10 % 128;
            }
        }
        int i22 = i10 % 2;
        if (!zBooleanValue) {
            int i23 = f62206d;
            int i24 = ((i23 ^ 68) + ((i23 & 68) << 1)) - 1;
            f62205c = i24 % 128;
            int i25 = i24 % 2;
            if (((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue() == ((Integer) yg.Companion.setDividerPadding(new Object[]{(String) yg.setOnFocusChangeListener(new Object[]{ygVar}, 952222842, -952222825, System.identityHashCode(ygVar))}, -728502532, 728502538, (int) System.currentTimeMillis())).intValue()) {
                int i26 = f62206d + 77;
                f62205c = i26 % 128;
                if (i26 % 2 != 0) {
                    int i27 = 46 / 0;
                }
                return string;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append(AbstractJsonLexerKt.COLON);
        sb4.append(((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue());
        String string2 = sb4.toString();
        int i28 = f62206d;
        int i29 = ((i28 | 31) << 1) - (i28 ^ 31);
        f62205c = i29 % 128;
        int i30 = i29 % 2;
        return string2;
    }

    public static /* synthetic */ Long g(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        yr yrVar = (yr) objArr[0];
        int i10 = (-2) - ((f62206d + 70) ^ (-1));
        f62205c = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(yrVar, "");
        ye yeVar = (ye) yr.setX(new Object[]{yrVar}, 1547100838, -1547100838, System.identityHashCode(yrVar));
        String str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, "Content-Length"}, 914142416, -914142409, System.identityHashCode(yeVar));
        if (str != null) {
            long jLongValue = ((Long) setY(new Object[]{str}, -814104043, 814104055, (int) System.currentTimeMillis())).longValue();
            int i12 = f62205c;
            int i13 = (i12 & 25) + (i12 | 25);
            f62206d = i13 % 128;
            int i14 = i13 % 2;
            return Long.valueOf(jLongValue);
        }
        int i15 = f62205c;
        int i16 = i15 ^ 79;
        int i17 = ((i15 & 79) | i16) << 1;
        int i18 = -i16;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        int i20 = i19 % 128;
        f62206d = i20;
        if (i19 % 2 == 0) {
            int i21 = 77 / 0;
        }
        int i22 = i20 & 45;
        int i23 = (i20 | 45) & (~i22);
        int i24 = i22 << 1;
        int i25 = (i23 & i24) + (i23 | i24);
        f62205c = i25 % 128;
        if (i25 % 2 == 0) {
            return -1L;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0073  */
    /* JADX WARN: Code duplicated, block: B:13:0x0093  */
    /* JADX WARN: Code duplicated, block: B:15:0x0097  */
    /* JADX WARN: Code duplicated, block: B:18:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:21:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:27:0x010f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0128  */
    /* JADX WARN: Code duplicated, block: B:30:0x014e  */
    /* JADX WARN: Code duplicated, block: B:33:0x015e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0162  */
    /* JADX WARN: Code duplicated, block: B:37:0x018c  */
    /* JADX WARN: Code duplicated, block: B:39:0x019a  */
    /* JADX WARN: Code duplicated, block: B:40:0x019c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0234  */
    /* JADX WARN: Code duplicated, block: B:47:0x0239  */
    /* JADX WARN: Code duplicated, block: B:50:0x023d A[LOOP:0: B:9:0x0050->B:50:0x023d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[PHI: r13
      PHI (r13v8 int) = (r13v7 int), (r13v44 int) binds: [B:8:0x004e, B:5:0x0038] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static /* synthetic */ Integer h(Object[] objArr) {
        int i10;
        int i11;
        char cCharAt;
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        int i16;
        int i17;
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i18 = f62206d;
        int i19 = ((i18 | 29) << 1) - (i18 ^ 29);
        f62205c = i19 % 128;
        if (i19 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i20 = ((iIntValue2 | 8) << 1) - (iIntValue2 ^ 8);
            i10 = ((i20 | 89) << 1) - (i20 ^ 89);
            if (iIntValue <= i10) {
                while (true) {
                    int i21 = i10 & (-36);
                    int i22 = ((i10 ^ (-36)) | i21) << 1;
                    int i23 = -((~i21) & (i10 | (-36)));
                    int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
                    i11 = (-2) - (((i24 ^ 36) + ((i24 & 36) << 1)) ^ (-1));
                    cCharAt = str.charAt(i10);
                    if (cCharAt == '\t') {
                        int i25 = f62205c;
                        int i26 = i25 & 105;
                        int i27 = -(-((i25 ^ 105) | i26));
                        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                        int i29 = i28 % 128;
                        f62206d = i29;
                        int i30 = i28 % 2;
                        int i31 = ((i29 | 109) << 1) - (i29 ^ 109);
                        f62205c = i31 % 128;
                        int i32 = i31 % 2;
                    } else {
                        if (cCharAt == '\n') {
                            int i33 = f62205c;
                            int i34 = i33 ^ 125;
                            int i35 = (i33 & 125) << 1;
                            i12 = (i34 & i35) + (i35 | i34);
                            f62206d = i12 % 128;
                            if (i12 % 2 == 0) {
                            }
                            if (z10) {
                                int i36 = f62206d;
                                int i37 = i36 ^ 57;
                                int i38 = ((i36 & 57) | i37) << 1;
                                int i39 = -i37;
                                int i40 = (i38 & i39) + (i38 | i39);
                                f62205c = i40 % 128;
                                int i41 = i40 % 2;
                            } else {
                                if (cCharAt == '\f') {
                                    int i42 = f62205c;
                                    int i43 = i42 & 49;
                                    int i44 = -(-((i42 ^ 49) | i43));
                                    int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                                    int i46 = i45 % 128;
                                    f62206d = i46;
                                    int i47 = i45 % 2;
                                    int i48 = ((i46 & 11) - (~(-(-(i46 | 11))))) - 1;
                                    f62205c = i48 % 128;
                                    int i49 = i48 % 2;
                                } else {
                                    i13 = f62206d;
                                    int i50 = i13 | 1;
                                    int i51 = i50 << 1;
                                    int i52 = -(i50 & (~(i13 & 1)));
                                    int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                                    i14 = i53 % 128;
                                    f62205c = i14;
                                    int i54 = i53 % 2;
                                    if (cCharAt == '\r') {
                                        int i55 = i14 & 109;
                                        int i56 = ((i14 ^ 109) | i55) << 1;
                                        int i57 = -((i14 | 109) & (~i55));
                                        int i58 = (i56 ^ i57) + ((i56 & i57) << 1);
                                        int i59 = i58 % 128;
                                        f62206d = i59;
                                        int i60 = i58 % 2;
                                        int i61 = i59 & 85;
                                        int i62 = -(-((i59 ^ 85) | i61));
                                        int i63 = (i61 & i62) + (i62 | i61);
                                        f62205c = i63 % 128;
                                        int i64 = i63 % 2;
                                        z11 = true;
                                    } else {
                                        int i65 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                                        f62205c = i65 % 128;
                                        int i66 = i65 % 2;
                                        z11 = false;
                                    }
                                }
                                if (!z11) {
                                    int i67 = f62205c;
                                    i15 = (i67 & 37) + (i67 | 37);
                                    int i68 = i15 % 128;
                                    f62206d = i68;
                                    if (i15 % 2 == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    int i69 = (i68 & 87) + (i68 | 87);
                                    f62205c = i69 % 128;
                                    int i70 = i69 % 2;
                                    if (!z12) {
                                        int i71 = f62205c + 57;
                                        int i72 = i71 % 128;
                                        f62206d = i72;
                                        int i73 = i71 % 2;
                                        int i74 = -(-(i10 * (-103)));
                                        int i75 = ((((-103) ^ i74) | ((-103) & i74)) << 1) - ((i74 & 102) | ((-103) & (~i74)));
                                        int i76 = ~i10;
                                        int i77 = (-2) ^ i76;
                                        int i78 = (-2) & i76;
                                        int i79 = ~((i77 & i78) | (i77 ^ i78));
                                        int i80 = (i76 & iIntValue) | (i76 ^ iIntValue);
                                        int i81 = ~i80;
                                        int i82 = (i80 | i81) & i81;
                                        int i83 = ((~i82) & i79) | ((~i79) & i82);
                                        int i84 = i82 & i79;
                                        int i85 = ((i84 & i83) | (i83 ^ i84)) * 104;
                                        int i86 = i75 & i85;
                                        int i87 = (i86 - (~((i85 ^ i75) | i86))) - 1;
                                        int i88 = ~iIntValue;
                                        int i89 = i88 & (i88 | iIntValue);
                                        int i90 = i89 ^ 1;
                                        int i91 = i89 & 1;
                                        int i92 = (i91 & i90) | (i90 ^ i91);
                                        int i93 = i92 ^ i10;
                                        int i94 = i10 & i92;
                                        int i95 = (~((i94 & i93) | (i93 ^ i94))) * (-104);
                                        int i96 = i87 & i95;
                                        int i97 = (i96 - (~(-(-((i95 ^ i87) | i96))))) - 1;
                                        int i98 = iIntValue & 1;
                                        int i99 = (iIntValue | 1) & (~i98);
                                        int i100 = -(-(((i98 & i99) | (i99 ^ i98)) * 104));
                                        int i101 = ((i97 ^ i100) | (i97 & i100)) << 1;
                                        int i102 = -((i100 & (~i97)) | ((~i100) & i97));
                                        i16 = (i101 & i102) + (i102 | i101);
                                        int i103 = i72 & 87;
                                        int i104 = -(-(i72 | 87));
                                        i17 = (i103 ^ i104) + ((i103 & i104) << 1);
                                        f62205c = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            return Integer.valueOf(i16);
                                        }
                                        throw null;
                                    }
                                    if (i10 == iIntValue) {
                                        i10 = i11;
                                    }
                                } else {
                                    if (cCharAt == ' ') {
                                        int i105 = f62205c;
                                        int i106 = ((i105 ^ 46) + ((i105 & 46) << 1)) - 1;
                                        f62206d = i106 % 128;
                                        int i107 = i106 % 2;
                                        int i710 = f62205c + 57;
                                        int i711 = i710 % 128;
                                        f62206d = i711;
                                        int i712 = i710 % 2;
                                        int i713 = -(-(i10 * (-103)));
                                        int i714 = ((((-103) ^ i713) | ((-103) & i713)) << 1) - ((i713 & 102) | ((-103) & (~i713)));
                                        int i715 = ~i10;
                                        int i716 = (-2) ^ i715;
                                        int i717 = (-2) & i715;
                                        int i718 = ~((i716 & i717) | (i716 ^ i717));
                                        int i810 = (i715 & iIntValue) | (i715 ^ iIntValue);
                                        int i811 = ~i810;
                                        int i812 = (i810 | i811) & i811;
                                        int i813 = ((~i812) & i718) | ((~i718) & i812);
                                        int i814 = i812 & i718;
                                        int i815 = ((i814 & i813) | (i813 ^ i814)) * 104;
                                        int i816 = i714 & i815;
                                        int i817 = (i816 - (~((i815 ^ i714) | i816))) - 1;
                                        int i818 = ~iIntValue;
                                        int i819 = i818 & (i818 | iIntValue);
                                        int i910 = i819 ^ 1;
                                        int i911 = i819 & 1;
                                        int i912 = (i911 & i910) | (i910 ^ i911);
                                        int i913 = i912 ^ i10;
                                        int i914 = i10 & i912;
                                        int i915 = (~((i914 & i913) | (i913 ^ i914))) * (-104);
                                        int i916 = i817 & i915;
                                        int i917 = (i916 - (~(-(-((i915 ^ i817) | i916))))) - 1;
                                        int i918 = iIntValue & 1;
                                        int i919 = (iIntValue | 1) & (~i918);
                                        int i108 = -(-(((i918 & i919) | (i919 ^ i918)) * 104));
                                        int i109 = ((i917 ^ i108) | (i917 & i108)) << 1;
                                        int i1010 = -((i108 & (~i917)) | ((~i108) & i917));
                                        i16 = (i109 & i1010) + (i1010 | i109);
                                        int i1011 = i711 & 87;
                                        int i1012 = -(-(i711 | 87));
                                        i17 = (i1011 ^ i1012) + ((i1011 & i1012) << 1);
                                        f62205c = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            return Integer.valueOf(i16);
                                        }
                                        throw null;
                                    }
                                    int i110 = f62206d;
                                    int i111 = i110 ^ 77;
                                    int i112 = (((i110 & 77) | i111) << 1) - i111;
                                    f62205c = i112 % 128;
                                    int i113 = i112 % 2;
                                    int i114 = (i110 ^ 111) + ((i110 & 111) << 1);
                                    f62205c = i114 % 128;
                                    int i115 = i114 % 2;
                                    if (i10 == iIntValue) {
                                        i10 = i11;
                                    }
                                }
                            }
                            int i116 = f62206d;
                            int i117 = ((i116 | 23) << 1) - (((~i116) & 23) | (i116 & (-24)));
                            int i118 = i117 % 128;
                            f62205c = i118;
                            int i119 = i117 % 2;
                            int i120 = i118 & 53;
                            int i121 = ((i118 | 53) & (~i120)) + (i120 << 1);
                            f62206d = i121 % 128;
                            int i122 = i121 % 2;
                            z11 = true;
                            if (!z11) {
                                int i610 = f62205c;
                                i15 = (i610 & 37) + (i610 | 37);
                                int i611 = i15 % 128;
                                f62206d = i611;
                                if (i15 % 2 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                int i612 = (i611 & 87) + (i611 | 87);
                                f62205c = i612 % 128;
                                int i719 = i612 % 2;
                                if (!z12) {
                                    int i7110 = f62205c + 57;
                                    int i7111 = i7110 % 128;
                                    f62206d = i7111;
                                    int i7112 = i7110 % 2;
                                    int i7113 = -(-(i10 * (-103)));
                                    int i7114 = ((((-103) ^ i7113) | ((-103) & i7113)) << 1) - ((i7113 & 102) | ((-103) & (~i7113)));
                                    int i7115 = ~i10;
                                    int i7116 = (-2) ^ i7115;
                                    int i7117 = (-2) & i7115;
                                    int i7118 = ~((i7116 & i7117) | (i7116 ^ i7117));
                                    int i8110 = (i7115 & iIntValue) | (i7115 ^ iIntValue);
                                    int i8111 = ~i8110;
                                    int i8112 = (i8110 | i8111) & i8111;
                                    int i8113 = ((~i8112) & i7118) | ((~i7118) & i8112);
                                    int i8114 = i8112 & i7118;
                                    int i8115 = ((i8114 & i8113) | (i8113 ^ i8114)) * 104;
                                    int i8116 = i7114 & i8115;
                                    int i8117 = (i8116 - (~((i8115 ^ i7114) | i8116))) - 1;
                                    int i8118 = ~iIntValue;
                                    int i8119 = i8118 & (i8118 | iIntValue);
                                    int i9110 = i8119 ^ 1;
                                    int i9111 = i8119 & 1;
                                    int i9112 = (i9111 & i9110) | (i9110 ^ i9111);
                                    int i9113 = i9112 ^ i10;
                                    int i9114 = i10 & i9112;
                                    int i9115 = (~((i9114 & i9113) | (i9113 ^ i9114))) * (-104);
                                    int i9116 = i8117 & i9115;
                                    int i9117 = (i9116 - (~(-(-((i9115 ^ i8117) | i9116))))) - 1;
                                    int i9118 = iIntValue & 1;
                                    int i9119 = (iIntValue | 1) & (~i9118);
                                    int i1013 = -(-(((i9118 & i9119) | (i9119 ^ i9118)) * 104));
                                    int i1014 = ((i9117 ^ i1013) | (i9117 & i1013)) << 1;
                                    int i1015 = -((i1013 & (~i9117)) | ((~i1013) & i9117));
                                    i16 = (i1014 & i1015) + (i1015 | i1014);
                                    int i1016 = i7111 & 87;
                                    int i1017 = -(-(i7111 | 87));
                                    i17 = (i1016 ^ i1017) + ((i1016 & i1017) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            } else {
                                if (cCharAt == ' ') {
                                    int i1018 = f62205c;
                                    int i1019 = ((i1018 ^ 46) + ((i1018 & 46) << 1)) - 1;
                                    f62206d = i1019 % 128;
                                    int i1020 = i1019 % 2;
                                    int i7119 = f62205c + 57;
                                    int i71110 = i7119 % 128;
                                    f62206d = i71110;
                                    int i71111 = i7119 % 2;
                                    int i71112 = -(-(i10 * (-103)));
                                    int i71113 = ((((-103) ^ i71112) | ((-103) & i71112)) << 1) - ((i71112 & 102) | ((-103) & (~i71112)));
                                    int i71114 = ~i10;
                                    int i71115 = (-2) ^ i71114;
                                    int i71116 = (-2) & i71114;
                                    int i71117 = ~((i71115 & i71116) | (i71115 ^ i71116));
                                    int i81110 = (i71114 & iIntValue) | (i71114 ^ iIntValue);
                                    int i81111 = ~i81110;
                                    int i81112 = (i81110 | i81111) & i81111;
                                    int i81113 = ((~i81112) & i71117) | ((~i71117) & i81112);
                                    int i81114 = i81112 & i71117;
                                    int i81115 = ((i81114 & i81113) | (i81113 ^ i81114)) * 104;
                                    int i81116 = i71113 & i81115;
                                    int i81117 = (i81116 - (~((i81115 ^ i71113) | i81116))) - 1;
                                    int i81118 = ~iIntValue;
                                    int i81119 = i81118 & (i81118 | iIntValue);
                                    int i91110 = i81119 ^ 1;
                                    int i91111 = i81119 & 1;
                                    int i91112 = (i91111 & i91110) | (i91110 ^ i91111);
                                    int i91113 = i91112 ^ i10;
                                    int i91114 = i10 & i91112;
                                    int i91115 = (~((i91114 & i91113) | (i91113 ^ i91114))) * (-104);
                                    int i91116 = i81117 & i91115;
                                    int i91117 = (i91116 - (~(-(-((i91115 ^ i81117) | i91116))))) - 1;
                                    int i91118 = iIntValue & 1;
                                    int i91119 = (iIntValue | 1) & (~i91118);
                                    int i10110 = -(-(((i91118 & i91119) | (i91119 ^ i91118)) * 104));
                                    int i10111 = ((i91117 ^ i10110) | (i91117 & i10110)) << 1;
                                    int i10112 = -((i10110 & (~i91117)) | ((~i10110) & i91117));
                                    i16 = (i10111 & i10112) + (i10112 | i10111);
                                    int i10113 = i71110 & 87;
                                    int i10114 = -(-(i71110 | 87));
                                    i17 = (i10113 ^ i10114) + ((i10113 & i10114) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                int i1110 = f62206d;
                                int i1111 = i1110 ^ 77;
                                int i1112 = (((i1110 & 77) | i1111) << 1) - i1111;
                                f62205c = i1112 % 128;
                                int i1113 = i1112 % 2;
                                int i1114 = (i1110 ^ 111) + ((i1110 & 111) << 1);
                                f62205c = i1114 % 128;
                                int i1115 = i1114 % 2;
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            }
                        } else {
                            int i123 = f62205c + 29;
                            f62206d = i123 % 128;
                            int i124 = i123 % 2;
                        }
                        z10 = false;
                        if (z10) {
                            int i310 = f62206d;
                            int i311 = i310 ^ 57;
                            int i312 = ((i310 & 57) | i311) << 1;
                            int i313 = -i311;
                            int i410 = (i312 & i313) + (i312 | i313);
                            f62205c = i410 % 128;
                            int i411 = i410 % 2;
                        } else {
                            if (cCharAt == '\f') {
                                int i412 = f62205c;
                                int i413 = i412 & 49;
                                int i414 = -(-((i412 ^ 49) | i413));
                                int i415 = (i413 ^ i414) + ((i414 & i413) << 1);
                                int i416 = i415 % 128;
                                f62206d = i416;
                                int i417 = i415 % 2;
                                int i418 = ((i416 & 11) - (~(-(-(i416 | 11))))) - 1;
                                f62205c = i418 % 128;
                                int i419 = i418 % 2;
                            } else {
                                i13 = f62206d;
                                int i510 = i13 | 1;
                                int i511 = i510 << 1;
                                int i512 = -(i510 & (~(i13 & 1)));
                                int i513 = ((i511 | i512) << 1) - (i512 ^ i511);
                                i14 = i513 % 128;
                                f62205c = i14;
                                int i514 = i513 % 2;
                                if (cCharAt == '\r') {
                                    int i515 = i14 & 109;
                                    int i516 = ((i14 ^ 109) | i515) << 1;
                                    int i517 = -((i14 | 109) & (~i515));
                                    int i518 = (i516 ^ i517) + ((i516 & i517) << 1);
                                    int i519 = i518 % 128;
                                    f62206d = i519;
                                    int i613 = i518 % 2;
                                    int i614 = i519 & 85;
                                    int i615 = -(-((i519 ^ 85) | i614));
                                    int i616 = (i614 & i615) + (i615 | i614);
                                    f62205c = i616 % 128;
                                    int i617 = i616 % 2;
                                    z11 = true;
                                } else {
                                    int i618 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                                    f62205c = i618 % 128;
                                    int i619 = i618 % 2;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                int i6110 = f62205c;
                                i15 = (i6110 & 37) + (i6110 | 37);
                                int i6111 = i15 % 128;
                                f62206d = i6111;
                                if (i15 % 2 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                int i6112 = (i6111 & 87) + (i6111 | 87);
                                f62205c = i6112 % 128;
                                int i7120 = i6112 % 2;
                                if (!z12) {
                                    int i71118 = f62205c + 57;
                                    int i71119 = i71118 % 128;
                                    f62206d = i71119;
                                    int i711110 = i71118 % 2;
                                    int i711111 = -(-(i10 * (-103)));
                                    int i711112 = ((((-103) ^ i711111) | ((-103) & i711111)) << 1) - ((i711111 & 102) | ((-103) & (~i711111)));
                                    int i711113 = ~i10;
                                    int i711114 = (-2) ^ i711113;
                                    int i711115 = (-2) & i711113;
                                    int i711116 = ~((i711114 & i711115) | (i711114 ^ i711115));
                                    int i811110 = (i711113 & iIntValue) | (i711113 ^ iIntValue);
                                    int i811111 = ~i811110;
                                    int i811112 = (i811110 | i811111) & i811111;
                                    int i811113 = ((~i811112) & i711116) | ((~i711116) & i811112);
                                    int i811114 = i811112 & i711116;
                                    int i811115 = ((i811114 & i811113) | (i811113 ^ i811114)) * 104;
                                    int i811116 = i711112 & i811115;
                                    int i811117 = (i811116 - (~((i811115 ^ i711112) | i811116))) - 1;
                                    int i811118 = ~iIntValue;
                                    int i811119 = i811118 & (i811118 | iIntValue);
                                    int i911110 = i811119 ^ 1;
                                    int i911111 = i811119 & 1;
                                    int i911112 = (i911111 & i911110) | (i911110 ^ i911111);
                                    int i911113 = i911112 ^ i10;
                                    int i911114 = i10 & i911112;
                                    int i911115 = (~((i911114 & i911113) | (i911113 ^ i911114))) * (-104);
                                    int i911116 = i811117 & i911115;
                                    int i911117 = (i911116 - (~(-(-((i911115 ^ i811117) | i911116))))) - 1;
                                    int i911118 = iIntValue & 1;
                                    int i911119 = (iIntValue | 1) & (~i911118);
                                    int i10115 = -(-(((i911118 & i911119) | (i911119 ^ i911118)) * 104));
                                    int i10116 = ((i911117 ^ i10115) | (i911117 & i10115)) << 1;
                                    int i10117 = -((i10115 & (~i911117)) | ((~i10115) & i911117));
                                    i16 = (i10116 & i10117) + (i10117 | i10116);
                                    int i10118 = i71119 & 87;
                                    int i10119 = -(-(i71119 | 87));
                                    i17 = (i10118 ^ i10119) + ((i10118 & i10119) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            } else {
                                if (cCharAt == ' ') {
                                    int i10120 = f62205c;
                                    int i10121 = ((i10120 ^ 46) + ((i10120 & 46) << 1)) - 1;
                                    f62206d = i10121 % 128;
                                    int i1021 = i10121 % 2;
                                    int i711117 = f62205c + 57;
                                    int i711118 = i711117 % 128;
                                    f62206d = i711118;
                                    int i711119 = i711117 % 2;
                                    int i7111110 = -(-(i10 * (-103)));
                                    int i7111111 = ((((-103) ^ i7111110) | ((-103) & i7111110)) << 1) - ((i7111110 & 102) | ((-103) & (~i7111110)));
                                    int i7111112 = ~i10;
                                    int i7111113 = (-2) ^ i7111112;
                                    int i7111114 = (-2) & i7111112;
                                    int i7111115 = ~((i7111113 & i7111114) | (i7111113 ^ i7111114));
                                    int i8111110 = (i7111112 & iIntValue) | (i7111112 ^ iIntValue);
                                    int i8111111 = ~i8111110;
                                    int i8111112 = (i8111110 | i8111111) & i8111111;
                                    int i8111113 = ((~i8111112) & i7111115) | ((~i7111115) & i8111112);
                                    int i8111114 = i8111112 & i7111115;
                                    int i8111115 = ((i8111114 & i8111113) | (i8111113 ^ i8111114)) * 104;
                                    int i8111116 = i7111111 & i8111115;
                                    int i8111117 = (i8111116 - (~((i8111115 ^ i7111111) | i8111116))) - 1;
                                    int i8111118 = ~iIntValue;
                                    int i8111119 = i8111118 & (i8111118 | iIntValue);
                                    int i9111110 = i8111119 ^ 1;
                                    int i9111111 = i8111119 & 1;
                                    int i9111112 = (i9111111 & i9111110) | (i9111110 ^ i9111111);
                                    int i9111113 = i9111112 ^ i10;
                                    int i9111114 = i10 & i9111112;
                                    int i9111115 = (~((i9111114 & i9111113) | (i9111113 ^ i9111114))) * (-104);
                                    int i9111116 = i8111117 & i9111115;
                                    int i9111117 = (i9111116 - (~(-(-((i9111115 ^ i8111117) | i9111116))))) - 1;
                                    int i9111118 = iIntValue & 1;
                                    int i9111119 = (iIntValue | 1) & (~i9111118);
                                    int i101110 = -(-(((i9111118 & i9111119) | (i9111119 ^ i9111118)) * 104));
                                    int i101111 = ((i9111117 ^ i101110) | (i9111117 & i101110)) << 1;
                                    int i101112 = -((i101110 & (~i9111117)) | ((~i101110) & i9111117));
                                    i16 = (i101111 & i101112) + (i101112 | i101111);
                                    int i101113 = i711118 & 87;
                                    int i101114 = -(-(i711118 | 87));
                                    i17 = (i101113 ^ i101114) + ((i101113 & i101114) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                int i1116 = f62206d;
                                int i1117 = i1116 ^ 77;
                                int i1118 = (((i1116 & 77) | i1117) << 1) - i1117;
                                f62205c = i1118 % 128;
                                int i1119 = i1118 % 2;
                                int i11110 = (i1116 ^ 111) + ((i1116 & 111) << 1);
                                f62205c = i11110 % 128;
                                int i11111 = i11110 % 2;
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            }
                        }
                        int i1120 = f62206d;
                        int i1121 = ((i1120 | 23) << 1) - (((~i1120) & 23) | (i1120 & (-24)));
                        int i1122 = i1121 % 128;
                        f62205c = i1122;
                        int i1123 = i1121 % 2;
                        int i125 = i1122 & 53;
                        int i126 = ((i1122 | 53) & (~i125)) + (i125 << 1);
                        f62206d = i126 % 128;
                        int i127 = i126 % 2;
                        z11 = true;
                        if (!z11) {
                            int i6113 = f62205c;
                            i15 = (i6113 & 37) + (i6113 | 37);
                            int i6114 = i15 % 128;
                            f62206d = i6114;
                            if (i15 % 2 == 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            int i6115 = (i6114 & 87) + (i6114 | 87);
                            f62205c = i6115 % 128;
                            int i7121 = i6115 % 2;
                            if (!z12) {
                                int i7111116 = f62205c + 57;
                                int i7111117 = i7111116 % 128;
                                f62206d = i7111117;
                                int i7111118 = i7111116 % 2;
                                int i7111119 = -(-(i10 * (-103)));
                                int i71111110 = ((((-103) ^ i7111119) | ((-103) & i7111119)) << 1) - ((i7111119 & 102) | ((-103) & (~i7111119)));
                                int i71111111 = ~i10;
                                int i71111112 = (-2) ^ i71111111;
                                int i71111113 = (-2) & i71111111;
                                int i71111114 = ~((i71111112 & i71111113) | (i71111112 ^ i71111113));
                                int i81111110 = (i71111111 & iIntValue) | (i71111111 ^ iIntValue);
                                int i81111111 = ~i81111110;
                                int i81111112 = (i81111110 | i81111111) & i81111111;
                                int i81111113 = ((~i81111112) & i71111114) | ((~i71111114) & i81111112);
                                int i81111114 = i81111112 & i71111114;
                                int i81111115 = ((i81111114 & i81111113) | (i81111113 ^ i81111114)) * 104;
                                int i81111116 = i71111110 & i81111115;
                                int i81111117 = (i81111116 - (~((i81111115 ^ i71111110) | i81111116))) - 1;
                                int i81111118 = ~iIntValue;
                                int i81111119 = i81111118 & (i81111118 | iIntValue);
                                int i91111110 = i81111119 ^ 1;
                                int i91111111 = i81111119 & 1;
                                int i91111112 = (i91111111 & i91111110) | (i91111110 ^ i91111111);
                                int i91111113 = i91111112 ^ i10;
                                int i91111114 = i10 & i91111112;
                                int i91111115 = (~((i91111114 & i91111113) | (i91111113 ^ i91111114))) * (-104);
                                int i91111116 = i81111117 & i91111115;
                                int i91111117 = (i91111116 - (~(-(-((i91111115 ^ i81111117) | i91111116))))) - 1;
                                int i91111118 = iIntValue & 1;
                                int i91111119 = (iIntValue | 1) & (~i91111118);
                                int i101115 = -(-(((i91111118 & i91111119) | (i91111119 ^ i91111118)) * 104));
                                int i101116 = ((i91111117 ^ i101115) | (i91111117 & i101115)) << 1;
                                int i101117 = -((i101115 & (~i91111117)) | ((~i101115) & i91111117));
                                i16 = (i101116 & i101117) + (i101117 | i101116);
                                int i101118 = i7111117 & 87;
                                int i101119 = -(-(i7111117 | 87));
                                i17 = (i101118 ^ i101119) + ((i101118 & i101119) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        } else {
                            if (cCharAt == ' ') {
                                int i10122 = f62205c;
                                int i10123 = ((i10122 ^ 46) + ((i10122 & 46) << 1)) - 1;
                                f62206d = i10123 % 128;
                                int i1022 = i10123 % 2;
                                int i71111115 = f62205c + 57;
                                int i71111116 = i71111115 % 128;
                                f62206d = i71111116;
                                int i71111117 = i71111115 % 2;
                                int i71111118 = -(-(i10 * (-103)));
                                int i71111119 = ((((-103) ^ i71111118) | ((-103) & i71111118)) << 1) - ((i71111118 & 102) | ((-103) & (~i71111118)));
                                int i711111110 = ~i10;
                                int i711111111 = (-2) ^ i711111110;
                                int i711111112 = (-2) & i711111110;
                                int i711111113 = ~((i711111111 & i711111112) | (i711111111 ^ i711111112));
                                int i811111110 = (i711111110 & iIntValue) | (i711111110 ^ iIntValue);
                                int i811111111 = ~i811111110;
                                int i811111112 = (i811111110 | i811111111) & i811111111;
                                int i811111113 = ((~i811111112) & i711111113) | ((~i711111113) & i811111112);
                                int i811111114 = i811111112 & i711111113;
                                int i811111115 = ((i811111114 & i811111113) | (i811111113 ^ i811111114)) * 104;
                                int i811111116 = i71111119 & i811111115;
                                int i811111117 = (i811111116 - (~((i811111115 ^ i71111119) | i811111116))) - 1;
                                int i811111118 = ~iIntValue;
                                int i811111119 = i811111118 & (i811111118 | iIntValue);
                                int i911111110 = i811111119 ^ 1;
                                int i911111111 = i811111119 & 1;
                                int i911111112 = (i911111111 & i911111110) | (i911111110 ^ i911111111);
                                int i911111113 = i911111112 ^ i10;
                                int i911111114 = i10 & i911111112;
                                int i911111115 = (~((i911111114 & i911111113) | (i911111113 ^ i911111114))) * (-104);
                                int i911111116 = i811111117 & i911111115;
                                int i911111117 = (i911111116 - (~(-(-((i911111115 ^ i811111117) | i911111116))))) - 1;
                                int i911111118 = iIntValue & 1;
                                int i911111119 = (iIntValue | 1) & (~i911111118);
                                int i1011110 = -(-(((i911111118 & i911111119) | (i911111119 ^ i911111118)) * 104));
                                int i1011111 = ((i911111117 ^ i1011110) | (i911111117 & i1011110)) << 1;
                                int i1011112 = -((i1011110 & (~i911111117)) | ((~i1011110) & i911111117));
                                i16 = (i1011111 & i1011112) + (i1011112 | i1011111);
                                int i1011113 = i71111116 & 87;
                                int i1011114 = -(-(i71111116 | 87));
                                i17 = (i1011113 ^ i1011114) + ((i1011113 & i1011114) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            int i11112 = f62206d;
                            int i11113 = i11112 ^ 77;
                            int i11114 = (((i11112 & 77) | i11113) << 1) - i11113;
                            f62205c = i11114 % 128;
                            int i11115 = i11114 % 2;
                            int i11116 = (i11112 ^ 111) + ((i11112 & 111) << 1);
                            f62205c = i11116 % 128;
                            int i11117 = i11116 % 2;
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        int i314 = f62206d;
                        int i315 = i314 ^ 57;
                        int i316 = ((i314 & 57) | i315) << 1;
                        int i317 = -i315;
                        int i4110 = (i316 & i317) + (i316 | i317);
                        f62205c = i4110 % 128;
                        int i4111 = i4110 % 2;
                    } else {
                        if (cCharAt == '\f') {
                            int i4112 = f62205c;
                            int i4113 = i4112 & 49;
                            int i4114 = -(-((i4112 ^ 49) | i4113));
                            int i4115 = (i4113 ^ i4114) + ((i4114 & i4113) << 1);
                            int i4116 = i4115 % 128;
                            f62206d = i4116;
                            int i4117 = i4115 % 2;
                            int i4118 = ((i4116 & 11) - (~(-(-(i4116 | 11))))) - 1;
                            f62205c = i4118 % 128;
                            int i4119 = i4118 % 2;
                        } else {
                            i13 = f62206d;
                            int i5110 = i13 | 1;
                            int i5111 = i5110 << 1;
                            int i5112 = -(i5110 & (~(i13 & 1)));
                            int i5113 = ((i5111 | i5112) << 1) - (i5112 ^ i5111);
                            i14 = i5113 % 128;
                            f62205c = i14;
                            int i5114 = i5113 % 2;
                            if (cCharAt == '\r') {
                                int i5115 = i14 & 109;
                                int i5116 = ((i14 ^ 109) | i5115) << 1;
                                int i5117 = -((i14 | 109) & (~i5115));
                                int i5118 = (i5116 ^ i5117) + ((i5116 & i5117) << 1);
                                int i5119 = i5118 % 128;
                                f62206d = i5119;
                                int i6116 = i5118 % 2;
                                int i6117 = i5119 & 85;
                                int i6118 = -(-((i5119 ^ 85) | i6117));
                                int i6119 = (i6117 & i6118) + (i6118 | i6117);
                                f62205c = i6119 % 128;
                                int i6120 = i6119 % 2;
                                z11 = true;
                            } else {
                                int i6121 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                                f62205c = i6121 % 128;
                                int i6122 = i6121 % 2;
                                z11 = false;
                            }
                        }
                        if (!z11) {
                            int i61110 = f62205c;
                            i15 = (i61110 & 37) + (i61110 | 37);
                            int i61111 = i15 % 128;
                            f62206d = i61111;
                            if (i15 % 2 == 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            int i61112 = (i61111 & 87) + (i61111 | 87);
                            f62205c = i61112 % 128;
                            int i7122 = i61112 % 2;
                            if (!z12) {
                                int i711111114 = f62205c + 57;
                                int i711111115 = i711111114 % 128;
                                f62206d = i711111115;
                                int i711111116 = i711111114 % 2;
                                int i711111117 = -(-(i10 * (-103)));
                                int i711111118 = ((((-103) ^ i711111117) | ((-103) & i711111117)) << 1) - ((i711111117 & 102) | ((-103) & (~i711111117)));
                                int i711111119 = ~i10;
                                int i7111111110 = (-2) ^ i711111119;
                                int i7111111111 = (-2) & i711111119;
                                int i7111111112 = ~((i7111111110 & i7111111111) | (i7111111110 ^ i7111111111));
                                int i8111111110 = (i711111119 & iIntValue) | (i711111119 ^ iIntValue);
                                int i8111111111 = ~i8111111110;
                                int i8111111112 = (i8111111110 | i8111111111) & i8111111111;
                                int i8111111113 = ((~i8111111112) & i7111111112) | ((~i7111111112) & i8111111112);
                                int i8111111114 = i8111111112 & i7111111112;
                                int i8111111115 = ((i8111111114 & i8111111113) | (i8111111113 ^ i8111111114)) * 104;
                                int i8111111116 = i711111118 & i8111111115;
                                int i8111111117 = (i8111111116 - (~((i8111111115 ^ i711111118) | i8111111116))) - 1;
                                int i8111111118 = ~iIntValue;
                                int i8111111119 = i8111111118 & (i8111111118 | iIntValue);
                                int i9111111110 = i8111111119 ^ 1;
                                int i9111111111 = i8111111119 & 1;
                                int i9111111112 = (i9111111111 & i9111111110) | (i9111111110 ^ i9111111111);
                                int i9111111113 = i9111111112 ^ i10;
                                int i9111111114 = i10 & i9111111112;
                                int i9111111115 = (~((i9111111114 & i9111111113) | (i9111111113 ^ i9111111114))) * (-104);
                                int i9111111116 = i8111111117 & i9111111115;
                                int i9111111117 = (i9111111116 - (~(-(-((i9111111115 ^ i8111111117) | i9111111116))))) - 1;
                                int i9111111118 = iIntValue & 1;
                                int i9111111119 = (iIntValue | 1) & (~i9111111118);
                                int i1011115 = -(-(((i9111111118 & i9111111119) | (i9111111119 ^ i9111111118)) * 104));
                                int i1011116 = ((i9111111117 ^ i1011115) | (i9111111117 & i1011115)) << 1;
                                int i1011117 = -((i1011115 & (~i9111111117)) | ((~i1011115) & i9111111117));
                                i16 = (i1011116 & i1011117) + (i1011117 | i1011116);
                                int i1011118 = i711111115 & 87;
                                int i1011119 = -(-(i711111115 | 87));
                                i17 = (i1011118 ^ i1011119) + ((i1011118 & i1011119) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        } else {
                            if (cCharAt == ' ') {
                                int i10124 = f62205c;
                                int i10125 = ((i10124 ^ 46) + ((i10124 & 46) << 1)) - 1;
                                f62206d = i10125 % 128;
                                int i1023 = i10125 % 2;
                                int i7111111113 = f62205c + 57;
                                int i7111111114 = i7111111113 % 128;
                                f62206d = i7111111114;
                                int i7111111115 = i7111111113 % 2;
                                int i7111111116 = -(-(i10 * (-103)));
                                int i7111111117 = ((((-103) ^ i7111111116) | ((-103) & i7111111116)) << 1) - ((i7111111116 & 102) | ((-103) & (~i7111111116)));
                                int i7111111118 = ~i10;
                                int i7111111119 = (-2) ^ i7111111118;
                                int i71111111110 = (-2) & i7111111118;
                                int i71111111111 = ~((i7111111119 & i71111111110) | (i7111111119 ^ i71111111110));
                                int i81111111110 = (i7111111118 & iIntValue) | (i7111111118 ^ iIntValue);
                                int i81111111111 = ~i81111111110;
                                int i81111111112 = (i81111111110 | i81111111111) & i81111111111;
                                int i81111111113 = ((~i81111111112) & i71111111111) | ((~i71111111111) & i81111111112);
                                int i81111111114 = i81111111112 & i71111111111;
                                int i81111111115 = ((i81111111114 & i81111111113) | (i81111111113 ^ i81111111114)) * 104;
                                int i81111111116 = i7111111117 & i81111111115;
                                int i81111111117 = (i81111111116 - (~((i81111111115 ^ i7111111117) | i81111111116))) - 1;
                                int i81111111118 = ~iIntValue;
                                int i81111111119 = i81111111118 & (i81111111118 | iIntValue);
                                int i91111111110 = i81111111119 ^ 1;
                                int i91111111111 = i81111111119 & 1;
                                int i91111111112 = (i91111111111 & i91111111110) | (i91111111110 ^ i91111111111);
                                int i91111111113 = i91111111112 ^ i10;
                                int i91111111114 = i10 & i91111111112;
                                int i91111111115 = (~((i91111111114 & i91111111113) | (i91111111113 ^ i91111111114))) * (-104);
                                int i91111111116 = i81111111117 & i91111111115;
                                int i91111111117 = (i91111111116 - (~(-(-((i91111111115 ^ i81111111117) | i91111111116))))) - 1;
                                int i91111111118 = iIntValue & 1;
                                int i91111111119 = (iIntValue | 1) & (~i91111111118);
                                int i10111110 = -(-(((i91111111118 & i91111111119) | (i91111111119 ^ i91111111118)) * 104));
                                int i10111111 = ((i91111111117 ^ i10111110) | (i91111111117 & i10111110)) << 1;
                                int i10111112 = -((i10111110 & (~i91111111117)) | ((~i10111110) & i91111111117));
                                i16 = (i10111111 & i10111112) + (i10111112 | i10111111);
                                int i10111113 = i7111111114 & 87;
                                int i10111114 = -(-(i7111111114 | 87));
                                i17 = (i10111113 ^ i10111114) + ((i10111113 & i10111114) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            int i11118 = f62206d;
                            int i11119 = i11118 ^ 77;
                            int i111110 = (((i11118 & 77) | i11119) << 1) - i11119;
                            f62205c = i111110 % 128;
                            int i111111 = i111110 % 2;
                            int i111112 = (i11118 ^ 111) + ((i11118 & 111) << 1);
                            f62205c = i111112 % 128;
                            int i111113 = i111112 % 2;
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        }
                    }
                    int i1124 = f62206d;
                    int i1125 = ((i1124 | 23) << 1) - (((~i1124) & 23) | (i1124 & (-24)));
                    int i1126 = i1125 % 128;
                    f62205c = i1126;
                    int i1127 = i1125 % 2;
                    int i128 = i1126 & 53;
                    int i129 = ((i1126 | 53) & (~i128)) + (i128 << 1);
                    f62206d = i129 % 128;
                    int i1210 = i129 % 2;
                    z11 = true;
                    if (!z11) {
                        int i61113 = f62205c;
                        i15 = (i61113 & 37) + (i61113 | 37);
                        int i61114 = i15 % 128;
                        f62206d = i61114;
                        if (i15 % 2 == 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        int i61115 = (i61114 & 87) + (i61114 | 87);
                        f62205c = i61115 % 128;
                        int i7123 = i61115 % 2;
                        if (!z12) {
                            int i71111111112 = f62205c + 57;
                            int i71111111113 = i71111111112 % 128;
                            f62206d = i71111111113;
                            int i71111111114 = i71111111112 % 2;
                            int i71111111115 = -(-(i10 * (-103)));
                            int i71111111116 = ((((-103) ^ i71111111115) | ((-103) & i71111111115)) << 1) - ((i71111111115 & 102) | ((-103) & (~i71111111115)));
                            int i71111111117 = ~i10;
                            int i71111111118 = (-2) ^ i71111111117;
                            int i71111111119 = (-2) & i71111111117;
                            int i711111111110 = ~((i71111111118 & i71111111119) | (i71111111118 ^ i71111111119));
                            int i811111111110 = (i71111111117 & iIntValue) | (i71111111117 ^ iIntValue);
                            int i811111111111 = ~i811111111110;
                            int i811111111112 = (i811111111110 | i811111111111) & i811111111111;
                            int i811111111113 = ((~i811111111112) & i711111111110) | ((~i711111111110) & i811111111112);
                            int i811111111114 = i811111111112 & i711111111110;
                            int i811111111115 = ((i811111111114 & i811111111113) | (i811111111113 ^ i811111111114)) * 104;
                            int i811111111116 = i71111111116 & i811111111115;
                            int i811111111117 = (i811111111116 - (~((i811111111115 ^ i71111111116) | i811111111116))) - 1;
                            int i811111111118 = ~iIntValue;
                            int i811111111119 = i811111111118 & (i811111111118 | iIntValue);
                            int i911111111110 = i811111111119 ^ 1;
                            int i911111111111 = i811111111119 & 1;
                            int i911111111112 = (i911111111111 & i911111111110) | (i911111111110 ^ i911111111111);
                            int i911111111113 = i911111111112 ^ i10;
                            int i911111111114 = i10 & i911111111112;
                            int i911111111115 = (~((i911111111114 & i911111111113) | (i911111111113 ^ i911111111114))) * (-104);
                            int i911111111116 = i811111111117 & i911111111115;
                            int i911111111117 = (i911111111116 - (~(-(-((i911111111115 ^ i811111111117) | i911111111116))))) - 1;
                            int i911111111118 = iIntValue & 1;
                            int i911111111119 = (iIntValue | 1) & (~i911111111118);
                            int i10111115 = -(-(((i911111111118 & i911111111119) | (i911111111119 ^ i911111111118)) * 104));
                            int i10111116 = ((i911111111117 ^ i10111115) | (i911111111117 & i10111115)) << 1;
                            int i10111117 = -((i10111115 & (~i911111111117)) | ((~i10111115) & i911111111117));
                            i16 = (i10111116 & i10111117) + (i10111117 | i10111116);
                            int i10111118 = i71111111113 & 87;
                            int i10111119 = -(-(i71111111113 | 87));
                            i17 = (i10111118 ^ i10111119) + ((i10111118 & i10111119) << 1);
                            f62205c = i17 % 128;
                            if (i17 % 2 == 0) {
                                return Integer.valueOf(i16);
                            }
                            throw null;
                        }
                        if (i10 == iIntValue) {
                            i10 = i11;
                        }
                    } else {
                        if (cCharAt == ' ') {
                            int i10126 = f62205c;
                            int i10127 = ((i10126 ^ 46) + ((i10126 & 46) << 1)) - 1;
                            f62206d = i10127 % 128;
                            int i1024 = i10127 % 2;
                            int i711111111111 = f62205c + 57;
                            int i711111111112 = i711111111111 % 128;
                            f62206d = i711111111112;
                            int i711111111113 = i711111111111 % 2;
                            int i711111111114 = -(-(i10 * (-103)));
                            int i711111111115 = ((((-103) ^ i711111111114) | ((-103) & i711111111114)) << 1) - ((i711111111114 & 102) | ((-103) & (~i711111111114)));
                            int i711111111116 = ~i10;
                            int i711111111117 = (-2) ^ i711111111116;
                            int i711111111118 = (-2) & i711111111116;
                            int i711111111119 = ~((i711111111117 & i711111111118) | (i711111111117 ^ i711111111118));
                            int i8111111111110 = (i711111111116 & iIntValue) | (i711111111116 ^ iIntValue);
                            int i8111111111111 = ~i8111111111110;
                            int i8111111111112 = (i8111111111110 | i8111111111111) & i8111111111111;
                            int i8111111111113 = ((~i8111111111112) & i711111111119) | ((~i711111111119) & i8111111111112);
                            int i8111111111114 = i8111111111112 & i711111111119;
                            int i8111111111115 = ((i8111111111114 & i8111111111113) | (i8111111111113 ^ i8111111111114)) * 104;
                            int i8111111111116 = i711111111115 & i8111111111115;
                            int i8111111111117 = (i8111111111116 - (~((i8111111111115 ^ i711111111115) | i8111111111116))) - 1;
                            int i8111111111118 = ~iIntValue;
                            int i8111111111119 = i8111111111118 & (i8111111111118 | iIntValue);
                            int i9111111111110 = i8111111111119 ^ 1;
                            int i9111111111111 = i8111111111119 & 1;
                            int i9111111111112 = (i9111111111111 & i9111111111110) | (i9111111111110 ^ i9111111111111);
                            int i9111111111113 = i9111111111112 ^ i10;
                            int i9111111111114 = i10 & i9111111111112;
                            int i9111111111115 = (~((i9111111111114 & i9111111111113) | (i9111111111113 ^ i9111111111114))) * (-104);
                            int i9111111111116 = i8111111111117 & i9111111111115;
                            int i9111111111117 = (i9111111111116 - (~(-(-((i9111111111115 ^ i8111111111117) | i9111111111116))))) - 1;
                            int i9111111111118 = iIntValue & 1;
                            int i9111111111119 = (iIntValue | 1) & (~i9111111111118);
                            int i101111110 = -(-(((i9111111111118 & i9111111111119) | (i9111111111119 ^ i9111111111118)) * 104));
                            int i101111111 = ((i9111111111117 ^ i101111110) | (i9111111111117 & i101111110)) << 1;
                            int i101111112 = -((i101111110 & (~i9111111111117)) | ((~i101111110) & i9111111111117));
                            i16 = (i101111111 & i101111112) + (i101111112 | i101111111);
                            int i101111113 = i711111111112 & 87;
                            int i101111114 = -(-(i711111111112 | 87));
                            i17 = (i101111113 ^ i101111114) + ((i101111113 & i101111114) << 1);
                            f62205c = i17 % 128;
                            if (i17 % 2 == 0) {
                                return Integer.valueOf(i16);
                            }
                            throw null;
                        }
                        int i111114 = f62206d;
                        int i111115 = i111114 ^ 77;
                        int i111116 = (((i111114 & 77) | i111115) << 1) - i111115;
                        f62205c = i111116 % 128;
                        int i111117 = i111116 % 2;
                        int i111118 = (i111114 ^ 111) + ((i111114 & 111) << 1);
                        f62205c = i111118 % 128;
                        int i111119 = i111118 % 2;
                        if (i10 == iIntValue) {
                            i10 = i11;
                        }
                    }
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            int i130 = (((iIntValue2 & (-31)) | ((~iIntValue2) & 30)) + ((iIntValue2 & 30) << 1)) - 30;
            i10 = (i130 ^ (-1)) + (i130 << 1);
            if (iIntValue <= i10) {
                while (true) {
                    int i210 = i10 & (-36);
                    int i211 = ((i10 ^ (-36)) | i210) << 1;
                    int i212 = -((~i210) & (i10 | (-36)));
                    int i213 = (i211 ^ i212) + ((i211 & i212) << 1);
                    i11 = (-2) - (((i213 ^ 36) + ((i213 & 36) << 1)) ^ (-1));
                    cCharAt = str.charAt(i10);
                    if (cCharAt == '\t') {
                        int i214 = f62205c;
                        int i215 = i214 & 105;
                        int i216 = -(-((i214 ^ 105) | i215));
                        int i217 = (i215 ^ i216) + ((i216 & i215) << 1);
                        int i218 = i217 % 128;
                        f62206d = i218;
                        int i318 = i217 % 2;
                        int i319 = ((i218 | 109) << 1) - (i218 ^ 109);
                        f62205c = i319 % 128;
                        int i320 = i319 % 2;
                    } else {
                        if (cCharAt == '\n') {
                            int i321 = f62205c;
                            int i322 = i321 ^ 125;
                            int i323 = (i321 & 125) << 1;
                            i12 = (i322 & i323) + (i323 | i322);
                            f62206d = i12 % 128;
                            if (i12 % 2 == 0) {
                            }
                            if (z10) {
                                int i3110 = f62206d;
                                int i3111 = i3110 ^ 57;
                                int i3112 = ((i3110 & 57) | i3111) << 1;
                                int i3113 = -i3111;
                                int i41110 = (i3112 & i3113) + (i3112 | i3113);
                                f62205c = i41110 % 128;
                                int i41111 = i41110 % 2;
                            } else {
                                if (cCharAt == '\f') {
                                    int i41112 = f62205c;
                                    int i41113 = i41112 & 49;
                                    int i41114 = -(-((i41112 ^ 49) | i41113));
                                    int i41115 = (i41113 ^ i41114) + ((i41114 & i41113) << 1);
                                    int i41116 = i41115 % 128;
                                    f62206d = i41116;
                                    int i41117 = i41115 % 2;
                                    int i41118 = ((i41116 & 11) - (~(-(-(i41116 | 11))))) - 1;
                                    f62205c = i41118 % 128;
                                    int i41119 = i41118 % 2;
                                } else {
                                    i13 = f62206d;
                                    int i51110 = i13 | 1;
                                    int i51111 = i51110 << 1;
                                    int i51112 = -(i51110 & (~(i13 & 1)));
                                    int i51113 = ((i51111 | i51112) << 1) - (i51112 ^ i51111);
                                    i14 = i51113 % 128;
                                    f62205c = i14;
                                    int i51114 = i51113 % 2;
                                    if (cCharAt == '\r') {
                                        int i51115 = i14 & 109;
                                        int i51116 = ((i14 ^ 109) | i51115) << 1;
                                        int i51117 = -((i14 | 109) & (~i51115));
                                        int i51118 = (i51116 ^ i51117) + ((i51116 & i51117) << 1);
                                        int i51119 = i51118 % 128;
                                        f62206d = i51119;
                                        int i61116 = i51118 % 2;
                                        int i61117 = i51119 & 85;
                                        int i61118 = -(-((i51119 ^ 85) | i61117));
                                        int i61119 = (i61117 & i61118) + (i61118 | i61117);
                                        f62205c = i61119 % 128;
                                        int i6123 = i61119 % 2;
                                        z11 = true;
                                    } else {
                                        int i6124 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                                        f62205c = i6124 % 128;
                                        int i6125 = i6124 % 2;
                                        z11 = false;
                                    }
                                }
                                if (!z11) {
                                    int i611110 = f62205c;
                                    i15 = (i611110 & 37) + (i611110 | 37);
                                    int i611111 = i15 % 128;
                                    f62206d = i611111;
                                    if (i15 % 2 == 0) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    int i611112 = (i611111 & 87) + (i611111 | 87);
                                    f62205c = i611112 % 128;
                                    int i7124 = i611112 % 2;
                                    if (!z12) {
                                        int i7111111111110 = f62205c + 57;
                                        int i7111111111111 = i7111111111110 % 128;
                                        f62206d = i7111111111111;
                                        int i7111111111112 = i7111111111110 % 2;
                                        int i7111111111113 = -(-(i10 * (-103)));
                                        int i7111111111114 = ((((-103) ^ i7111111111113) | ((-103) & i7111111111113)) << 1) - ((i7111111111113 & 102) | ((-103) & (~i7111111111113)));
                                        int i7111111111115 = ~i10;
                                        int i7111111111116 = (-2) ^ i7111111111115;
                                        int i7111111111117 = (-2) & i7111111111115;
                                        int i7111111111118 = ~((i7111111111116 & i7111111111117) | (i7111111111116 ^ i7111111111117));
                                        int i81111111111110 = (i7111111111115 & iIntValue) | (i7111111111115 ^ iIntValue);
                                        int i81111111111111 = ~i81111111111110;
                                        int i81111111111112 = (i81111111111110 | i81111111111111) & i81111111111111;
                                        int i81111111111113 = ((~i81111111111112) & i7111111111118) | ((~i7111111111118) & i81111111111112);
                                        int i81111111111114 = i81111111111112 & i7111111111118;
                                        int i81111111111115 = ((i81111111111114 & i81111111111113) | (i81111111111113 ^ i81111111111114)) * 104;
                                        int i81111111111116 = i7111111111114 & i81111111111115;
                                        int i81111111111117 = (i81111111111116 - (~((i81111111111115 ^ i7111111111114) | i81111111111116))) - 1;
                                        int i81111111111118 = ~iIntValue;
                                        int i81111111111119 = i81111111111118 & (i81111111111118 | iIntValue);
                                        int i91111111111110 = i81111111111119 ^ 1;
                                        int i91111111111111 = i81111111111119 & 1;
                                        int i91111111111112 = (i91111111111111 & i91111111111110) | (i91111111111110 ^ i91111111111111);
                                        int i91111111111113 = i91111111111112 ^ i10;
                                        int i91111111111114 = i10 & i91111111111112;
                                        int i91111111111115 = (~((i91111111111114 & i91111111111113) | (i91111111111113 ^ i91111111111114))) * (-104);
                                        int i91111111111116 = i81111111111117 & i91111111111115;
                                        int i91111111111117 = (i91111111111116 - (~(-(-((i91111111111115 ^ i81111111111117) | i91111111111116))))) - 1;
                                        int i91111111111118 = iIntValue & 1;
                                        int i91111111111119 = (iIntValue | 1) & (~i91111111111118);
                                        int i101111115 = -(-(((i91111111111118 & i91111111111119) | (i91111111111119 ^ i91111111111118)) * 104));
                                        int i101111116 = ((i91111111111117 ^ i101111115) | (i91111111111117 & i101111115)) << 1;
                                        int i101111117 = -((i101111115 & (~i91111111111117)) | ((~i101111115) & i91111111111117));
                                        i16 = (i101111116 & i101111117) + (i101111117 | i101111116);
                                        int i101111118 = i7111111111111 & 87;
                                        int i101111119 = -(-(i7111111111111 | 87));
                                        i17 = (i101111118 ^ i101111119) + ((i101111118 & i101111119) << 1);
                                        f62205c = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            return Integer.valueOf(i16);
                                        }
                                        throw null;
                                    }
                                    if (i10 == iIntValue) {
                                        i10 = i11;
                                    }
                                } else {
                                    if (cCharAt == ' ') {
                                        int i10128 = f62205c;
                                        int i10129 = ((i10128 ^ 46) + ((i10128 & 46) << 1)) - 1;
                                        f62206d = i10129 % 128;
                                        int i1025 = i10129 % 2;
                                        int i7111111111119 = f62205c + 57;
                                        int i71111111111110 = i7111111111119 % 128;
                                        f62206d = i71111111111110;
                                        int i71111111111111 = i7111111111119 % 2;
                                        int i71111111111112 = -(-(i10 * (-103)));
                                        int i71111111111113 = ((((-103) ^ i71111111111112) | ((-103) & i71111111111112)) << 1) - ((i71111111111112 & 102) | ((-103) & (~i71111111111112)));
                                        int i71111111111114 = ~i10;
                                        int i71111111111115 = (-2) ^ i71111111111114;
                                        int i71111111111116 = (-2) & i71111111111114;
                                        int i71111111111117 = ~((i71111111111115 & i71111111111116) | (i71111111111115 ^ i71111111111116));
                                        int i811111111111110 = (i71111111111114 & iIntValue) | (i71111111111114 ^ iIntValue);
                                        int i811111111111111 = ~i811111111111110;
                                        int i811111111111112 = (i811111111111110 | i811111111111111) & i811111111111111;
                                        int i811111111111113 = ((~i811111111111112) & i71111111111117) | ((~i71111111111117) & i811111111111112);
                                        int i811111111111114 = i811111111111112 & i71111111111117;
                                        int i811111111111115 = ((i811111111111114 & i811111111111113) | (i811111111111113 ^ i811111111111114)) * 104;
                                        int i811111111111116 = i71111111111113 & i811111111111115;
                                        int i811111111111117 = (i811111111111116 - (~((i811111111111115 ^ i71111111111113) | i811111111111116))) - 1;
                                        int i811111111111118 = ~iIntValue;
                                        int i811111111111119 = i811111111111118 & (i811111111111118 | iIntValue);
                                        int i911111111111110 = i811111111111119 ^ 1;
                                        int i911111111111111 = i811111111111119 & 1;
                                        int i911111111111112 = (i911111111111111 & i911111111111110) | (i911111111111110 ^ i911111111111111);
                                        int i911111111111113 = i911111111111112 ^ i10;
                                        int i911111111111114 = i10 & i911111111111112;
                                        int i911111111111115 = (~((i911111111111114 & i911111111111113) | (i911111111111113 ^ i911111111111114))) * (-104);
                                        int i911111111111116 = i811111111111117 & i911111111111115;
                                        int i911111111111117 = (i911111111111116 - (~(-(-((i911111111111115 ^ i811111111111117) | i911111111111116))))) - 1;
                                        int i911111111111118 = iIntValue & 1;
                                        int i911111111111119 = (iIntValue | 1) & (~i911111111111118);
                                        int i1011111110 = -(-(((i911111111111118 & i911111111111119) | (i911111111111119 ^ i911111111111118)) * 104));
                                        int i1011111111 = ((i911111111111117 ^ i1011111110) | (i911111111111117 & i1011111110)) << 1;
                                        int i1011111112 = -((i1011111110 & (~i911111111111117)) | ((~i1011111110) & i911111111111117));
                                        i16 = (i1011111111 & i1011111112) + (i1011111112 | i1011111111);
                                        int i1011111113 = i71111111111110 & 87;
                                        int i1011111114 = -(-(i71111111111110 | 87));
                                        i17 = (i1011111113 ^ i1011111114) + ((i1011111113 & i1011111114) << 1);
                                        f62205c = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            return Integer.valueOf(i16);
                                        }
                                        throw null;
                                    }
                                    int i1111110 = f62206d;
                                    int i1111111 = i1111110 ^ 77;
                                    int i1111112 = (((i1111110 & 77) | i1111111) << 1) - i1111111;
                                    f62205c = i1111112 % 128;
                                    int i1111113 = i1111112 % 2;
                                    int i1111114 = (i1111110 ^ 111) + ((i1111110 & 111) << 1);
                                    f62205c = i1111114 % 128;
                                    int i1111115 = i1111114 % 2;
                                    if (i10 == iIntValue) {
                                        i10 = i11;
                                    }
                                }
                            }
                            int i1128 = f62206d;
                            int i1129 = ((i1128 | 23) << 1) - (((~i1128) & 23) | (i1128 & (-24)));
                            int i11210 = i1129 % 128;
                            f62205c = i11210;
                            int i11211 = i1129 % 2;
                            int i1211 = i11210 & 53;
                            int i1212 = ((i11210 | 53) & (~i1211)) + (i1211 << 1);
                            f62206d = i1212 % 128;
                            int i1213 = i1212 % 2;
                            z11 = true;
                            if (!z11) {
                                int i611113 = f62205c;
                                i15 = (i611113 & 37) + (i611113 | 37);
                                int i611114 = i15 % 128;
                                f62206d = i611114;
                                if (i15 % 2 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                int i611115 = (i611114 & 87) + (i611114 | 87);
                                f62205c = i611115 % 128;
                                int i7125 = i611115 % 2;
                                if (!z12) {
                                    int i71111111111118 = f62205c + 57;
                                    int i71111111111119 = i71111111111118 % 128;
                                    f62206d = i71111111111119;
                                    int i711111111111110 = i71111111111118 % 2;
                                    int i711111111111111 = -(-(i10 * (-103)));
                                    int i711111111111112 = ((((-103) ^ i711111111111111) | ((-103) & i711111111111111)) << 1) - ((i711111111111111 & 102) | ((-103) & (~i711111111111111)));
                                    int i711111111111113 = ~i10;
                                    int i711111111111114 = (-2) ^ i711111111111113;
                                    int i711111111111115 = (-2) & i711111111111113;
                                    int i711111111111116 = ~((i711111111111114 & i711111111111115) | (i711111111111114 ^ i711111111111115));
                                    int i8111111111111110 = (i711111111111113 & iIntValue) | (i711111111111113 ^ iIntValue);
                                    int i8111111111111111 = ~i8111111111111110;
                                    int i8111111111111112 = (i8111111111111110 | i8111111111111111) & i8111111111111111;
                                    int i8111111111111113 = ((~i8111111111111112) & i711111111111116) | ((~i711111111111116) & i8111111111111112);
                                    int i8111111111111114 = i8111111111111112 & i711111111111116;
                                    int i8111111111111115 = ((i8111111111111114 & i8111111111111113) | (i8111111111111113 ^ i8111111111111114)) * 104;
                                    int i8111111111111116 = i711111111111112 & i8111111111111115;
                                    int i8111111111111117 = (i8111111111111116 - (~((i8111111111111115 ^ i711111111111112) | i8111111111111116))) - 1;
                                    int i8111111111111118 = ~iIntValue;
                                    int i8111111111111119 = i8111111111111118 & (i8111111111111118 | iIntValue);
                                    int i9111111111111110 = i8111111111111119 ^ 1;
                                    int i9111111111111111 = i8111111111111119 & 1;
                                    int i9111111111111112 = (i9111111111111111 & i9111111111111110) | (i9111111111111110 ^ i9111111111111111);
                                    int i9111111111111113 = i9111111111111112 ^ i10;
                                    int i9111111111111114 = i10 & i9111111111111112;
                                    int i9111111111111115 = (~((i9111111111111114 & i9111111111111113) | (i9111111111111113 ^ i9111111111111114))) * (-104);
                                    int i9111111111111116 = i8111111111111117 & i9111111111111115;
                                    int i9111111111111117 = (i9111111111111116 - (~(-(-((i9111111111111115 ^ i8111111111111117) | i9111111111111116))))) - 1;
                                    int i9111111111111118 = iIntValue & 1;
                                    int i9111111111111119 = (iIntValue | 1) & (~i9111111111111118);
                                    int i1011111115 = -(-(((i9111111111111118 & i9111111111111119) | (i9111111111111119 ^ i9111111111111118)) * 104));
                                    int i1011111116 = ((i9111111111111117 ^ i1011111115) | (i9111111111111117 & i1011111115)) << 1;
                                    int i1011111117 = -((i1011111115 & (~i9111111111111117)) | ((~i1011111115) & i9111111111111117));
                                    i16 = (i1011111116 & i1011111117) + (i1011111117 | i1011111116);
                                    int i1011111118 = i71111111111119 & 87;
                                    int i1011111119 = -(-(i71111111111119 | 87));
                                    i17 = (i1011111118 ^ i1011111119) + ((i1011111118 & i1011111119) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            } else {
                                if (cCharAt == ' ') {
                                    int i101210 = f62205c;
                                    int i101211 = ((i101210 ^ 46) + ((i101210 & 46) << 1)) - 1;
                                    f62206d = i101211 % 128;
                                    int i1026 = i101211 % 2;
                                    int i711111111111117 = f62205c + 57;
                                    int i711111111111118 = i711111111111117 % 128;
                                    f62206d = i711111111111118;
                                    int i711111111111119 = i711111111111117 % 2;
                                    int i7111111111111110 = -(-(i10 * (-103)));
                                    int i7111111111111111 = ((((-103) ^ i7111111111111110) | ((-103) & i7111111111111110)) << 1) - ((i7111111111111110 & 102) | ((-103) & (~i7111111111111110)));
                                    int i7111111111111112 = ~i10;
                                    int i7111111111111113 = (-2) ^ i7111111111111112;
                                    int i7111111111111114 = (-2) & i7111111111111112;
                                    int i7111111111111115 = ~((i7111111111111113 & i7111111111111114) | (i7111111111111113 ^ i7111111111111114));
                                    int i81111111111111110 = (i7111111111111112 & iIntValue) | (i7111111111111112 ^ iIntValue);
                                    int i81111111111111111 = ~i81111111111111110;
                                    int i81111111111111112 = (i81111111111111110 | i81111111111111111) & i81111111111111111;
                                    int i81111111111111113 = ((~i81111111111111112) & i7111111111111115) | ((~i7111111111111115) & i81111111111111112);
                                    int i81111111111111114 = i81111111111111112 & i7111111111111115;
                                    int i81111111111111115 = ((i81111111111111114 & i81111111111111113) | (i81111111111111113 ^ i81111111111111114)) * 104;
                                    int i81111111111111116 = i7111111111111111 & i81111111111111115;
                                    int i81111111111111117 = (i81111111111111116 - (~((i81111111111111115 ^ i7111111111111111) | i81111111111111116))) - 1;
                                    int i81111111111111118 = ~iIntValue;
                                    int i81111111111111119 = i81111111111111118 & (i81111111111111118 | iIntValue);
                                    int i91111111111111110 = i81111111111111119 ^ 1;
                                    int i91111111111111111 = i81111111111111119 & 1;
                                    int i91111111111111112 = (i91111111111111111 & i91111111111111110) | (i91111111111111110 ^ i91111111111111111);
                                    int i91111111111111113 = i91111111111111112 ^ i10;
                                    int i91111111111111114 = i10 & i91111111111111112;
                                    int i91111111111111115 = (~((i91111111111111114 & i91111111111111113) | (i91111111111111113 ^ i91111111111111114))) * (-104);
                                    int i91111111111111116 = i81111111111111117 & i91111111111111115;
                                    int i91111111111111117 = (i91111111111111116 - (~(-(-((i91111111111111115 ^ i81111111111111117) | i91111111111111116))))) - 1;
                                    int i91111111111111118 = iIntValue & 1;
                                    int i91111111111111119 = (iIntValue | 1) & (~i91111111111111118);
                                    int i10111111110 = -(-(((i91111111111111118 & i91111111111111119) | (i91111111111111119 ^ i91111111111111118)) * 104));
                                    int i10111111111 = ((i91111111111111117 ^ i10111111110) | (i91111111111111117 & i10111111110)) << 1;
                                    int i10111111112 = -((i10111111110 & (~i91111111111111117)) | ((~i10111111110) & i91111111111111117));
                                    i16 = (i10111111111 & i10111111112) + (i10111111112 | i10111111111);
                                    int i10111111113 = i711111111111118 & 87;
                                    int i10111111114 = -(-(i711111111111118 | 87));
                                    i17 = (i10111111113 ^ i10111111114) + ((i10111111113 & i10111111114) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                int i1111116 = f62206d;
                                int i1111117 = i1111116 ^ 77;
                                int i1111118 = (((i1111116 & 77) | i1111117) << 1) - i1111117;
                                f62205c = i1111118 % 128;
                                int i1111119 = i1111118 % 2;
                                int i11111110 = (i1111116 ^ 111) + ((i1111116 & 111) << 1);
                                f62205c = i11111110 % 128;
                                int i11111111 = i11111110 % 2;
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            }
                        } else {
                            int i1214 = f62205c + 29;
                            f62206d = i1214 % 128;
                            int i1215 = i1214 % 2;
                        }
                        z10 = false;
                        if (z10) {
                            int i3114 = f62206d;
                            int i3115 = i3114 ^ 57;
                            int i3116 = ((i3114 & 57) | i3115) << 1;
                            int i3117 = -i3115;
                            int i411110 = (i3116 & i3117) + (i3116 | i3117);
                            f62205c = i411110 % 128;
                            int i411111 = i411110 % 2;
                        } else {
                            if (cCharAt == '\f') {
                                int i411112 = f62205c;
                                int i411113 = i411112 & 49;
                                int i411114 = -(-((i411112 ^ 49) | i411113));
                                int i411115 = (i411113 ^ i411114) + ((i411114 & i411113) << 1);
                                int i411116 = i411115 % 128;
                                f62206d = i411116;
                                int i411117 = i411115 % 2;
                                int i411118 = ((i411116 & 11) - (~(-(-(i411116 | 11))))) - 1;
                                f62205c = i411118 % 128;
                                int i411119 = i411118 % 2;
                            } else {
                                i13 = f62206d;
                                int i511110 = i13 | 1;
                                int i511111 = i511110 << 1;
                                int i511112 = -(i511110 & (~(i13 & 1)));
                                int i511113 = ((i511111 | i511112) << 1) - (i511112 ^ i511111);
                                i14 = i511113 % 128;
                                f62205c = i14;
                                int i511114 = i511113 % 2;
                                if (cCharAt == '\r') {
                                    int i511115 = i14 & 109;
                                    int i511116 = ((i14 ^ 109) | i511115) << 1;
                                    int i511117 = -((i14 | 109) & (~i511115));
                                    int i511118 = (i511116 ^ i511117) + ((i511116 & i511117) << 1);
                                    int i511119 = i511118 % 128;
                                    f62206d = i511119;
                                    int i611116 = i511118 % 2;
                                    int i611117 = i511119 & 85;
                                    int i611118 = -(-((i511119 ^ 85) | i611117));
                                    int i611119 = (i611117 & i611118) + (i611118 | i611117);
                                    f62205c = i611119 % 128;
                                    int i6126 = i611119 % 2;
                                    z11 = true;
                                } else {
                                    int i6127 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                                    f62205c = i6127 % 128;
                                    int i6128 = i6127 % 2;
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                int i6111110 = f62205c;
                                i15 = (i6111110 & 37) + (i6111110 | 37);
                                int i6111111 = i15 % 128;
                                f62206d = i6111111;
                                if (i15 % 2 == 0) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                int i6111112 = (i6111111 & 87) + (i6111111 | 87);
                                f62205c = i6111112 % 128;
                                int i7126 = i6111112 % 2;
                                if (!z12) {
                                    int i7111111111111116 = f62205c + 57;
                                    int i7111111111111117 = i7111111111111116 % 128;
                                    f62206d = i7111111111111117;
                                    int i7111111111111118 = i7111111111111116 % 2;
                                    int i7111111111111119 = -(-(i10 * (-103)));
                                    int i71111111111111110 = ((((-103) ^ i7111111111111119) | ((-103) & i7111111111111119)) << 1) - ((i7111111111111119 & 102) | ((-103) & (~i7111111111111119)));
                                    int i71111111111111111 = ~i10;
                                    int i71111111111111112 = (-2) ^ i71111111111111111;
                                    int i71111111111111113 = (-2) & i71111111111111111;
                                    int i71111111111111114 = ~((i71111111111111112 & i71111111111111113) | (i71111111111111112 ^ i71111111111111113));
                                    int i811111111111111110 = (i71111111111111111 & iIntValue) | (i71111111111111111 ^ iIntValue);
                                    int i811111111111111111 = ~i811111111111111110;
                                    int i811111111111111112 = (i811111111111111110 | i811111111111111111) & i811111111111111111;
                                    int i811111111111111113 = ((~i811111111111111112) & i71111111111111114) | ((~i71111111111111114) & i811111111111111112);
                                    int i811111111111111114 = i811111111111111112 & i71111111111111114;
                                    int i811111111111111115 = ((i811111111111111114 & i811111111111111113) | (i811111111111111113 ^ i811111111111111114)) * 104;
                                    int i811111111111111116 = i71111111111111110 & i811111111111111115;
                                    int i811111111111111117 = (i811111111111111116 - (~((i811111111111111115 ^ i71111111111111110) | i811111111111111116))) - 1;
                                    int i811111111111111118 = ~iIntValue;
                                    int i811111111111111119 = i811111111111111118 & (i811111111111111118 | iIntValue);
                                    int i911111111111111110 = i811111111111111119 ^ 1;
                                    int i911111111111111111 = i811111111111111119 & 1;
                                    int i911111111111111112 = (i911111111111111111 & i911111111111111110) | (i911111111111111110 ^ i911111111111111111);
                                    int i911111111111111113 = i911111111111111112 ^ i10;
                                    int i911111111111111114 = i10 & i911111111111111112;
                                    int i911111111111111115 = (~((i911111111111111114 & i911111111111111113) | (i911111111111111113 ^ i911111111111111114))) * (-104);
                                    int i911111111111111116 = i811111111111111117 & i911111111111111115;
                                    int i911111111111111117 = (i911111111111111116 - (~(-(-((i911111111111111115 ^ i811111111111111117) | i911111111111111116))))) - 1;
                                    int i911111111111111118 = iIntValue & 1;
                                    int i911111111111111119 = (iIntValue | 1) & (~i911111111111111118);
                                    int i10111111115 = -(-(((i911111111111111118 & i911111111111111119) | (i911111111111111119 ^ i911111111111111118)) * 104));
                                    int i10111111116 = ((i911111111111111117 ^ i10111111115) | (i911111111111111117 & i10111111115)) << 1;
                                    int i10111111117 = -((i10111111115 & (~i911111111111111117)) | ((~i10111111115) & i911111111111111117));
                                    i16 = (i10111111116 & i10111111117) + (i10111111117 | i10111111116);
                                    int i10111111118 = i7111111111111117 & 87;
                                    int i10111111119 = -(-(i7111111111111117 | 87));
                                    i17 = (i10111111118 ^ i10111111119) + ((i10111111118 & i10111111119) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            } else {
                                if (cCharAt == ' ') {
                                    int i101212 = f62205c;
                                    int i101213 = ((i101212 ^ 46) + ((i101212 & 46) << 1)) - 1;
                                    f62206d = i101213 % 128;
                                    int i1027 = i101213 % 2;
                                    int i71111111111111115 = f62205c + 57;
                                    int i71111111111111116 = i71111111111111115 % 128;
                                    f62206d = i71111111111111116;
                                    int i71111111111111117 = i71111111111111115 % 2;
                                    int i71111111111111118 = -(-(i10 * (-103)));
                                    int i71111111111111119 = ((((-103) ^ i71111111111111118) | ((-103) & i71111111111111118)) << 1) - ((i71111111111111118 & 102) | ((-103) & (~i71111111111111118)));
                                    int i711111111111111110 = ~i10;
                                    int i711111111111111111 = (-2) ^ i711111111111111110;
                                    int i711111111111111112 = (-2) & i711111111111111110;
                                    int i711111111111111113 = ~((i711111111111111111 & i711111111111111112) | (i711111111111111111 ^ i711111111111111112));
                                    int i8111111111111111110 = (i711111111111111110 & iIntValue) | (i711111111111111110 ^ iIntValue);
                                    int i8111111111111111111 = ~i8111111111111111110;
                                    int i8111111111111111112 = (i8111111111111111110 | i8111111111111111111) & i8111111111111111111;
                                    int i8111111111111111113 = ((~i8111111111111111112) & i711111111111111113) | ((~i711111111111111113) & i8111111111111111112);
                                    int i8111111111111111114 = i8111111111111111112 & i711111111111111113;
                                    int i8111111111111111115 = ((i8111111111111111114 & i8111111111111111113) | (i8111111111111111113 ^ i8111111111111111114)) * 104;
                                    int i8111111111111111116 = i71111111111111119 & i8111111111111111115;
                                    int i8111111111111111117 = (i8111111111111111116 - (~((i8111111111111111115 ^ i71111111111111119) | i8111111111111111116))) - 1;
                                    int i8111111111111111118 = ~iIntValue;
                                    int i8111111111111111119 = i8111111111111111118 & (i8111111111111111118 | iIntValue);
                                    int i9111111111111111110 = i8111111111111111119 ^ 1;
                                    int i9111111111111111111 = i8111111111111111119 & 1;
                                    int i9111111111111111112 = (i9111111111111111111 & i9111111111111111110) | (i9111111111111111110 ^ i9111111111111111111);
                                    int i9111111111111111113 = i9111111111111111112 ^ i10;
                                    int i9111111111111111114 = i10 & i9111111111111111112;
                                    int i9111111111111111115 = (~((i9111111111111111114 & i9111111111111111113) | (i9111111111111111113 ^ i9111111111111111114))) * (-104);
                                    int i9111111111111111116 = i8111111111111111117 & i9111111111111111115;
                                    int i9111111111111111117 = (i9111111111111111116 - (~(-(-((i9111111111111111115 ^ i8111111111111111117) | i9111111111111111116))))) - 1;
                                    int i9111111111111111118 = iIntValue & 1;
                                    int i9111111111111111119 = (iIntValue | 1) & (~i9111111111111111118);
                                    int i101111111110 = -(-(((i9111111111111111118 & i9111111111111111119) | (i9111111111111111119 ^ i9111111111111111118)) * 104));
                                    int i101111111111 = ((i9111111111111111117 ^ i101111111110) | (i9111111111111111117 & i101111111110)) << 1;
                                    int i101111111112 = -((i101111111110 & (~i9111111111111111117)) | ((~i101111111110) & i9111111111111111117));
                                    i16 = (i101111111111 & i101111111112) + (i101111111112 | i101111111111);
                                    int i101111111113 = i71111111111111116 & 87;
                                    int i101111111114 = -(-(i71111111111111116 | 87));
                                    i17 = (i101111111113 ^ i101111111114) + ((i101111111113 & i101111111114) << 1);
                                    f62205c = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        return Integer.valueOf(i16);
                                    }
                                    throw null;
                                }
                                int i11111112 = f62206d;
                                int i11111113 = i11111112 ^ 77;
                                int i11111114 = (((i11111112 & 77) | i11111113) << 1) - i11111113;
                                f62205c = i11111114 % 128;
                                int i11111115 = i11111114 % 2;
                                int i11111116 = (i11111112 ^ 111) + ((i11111112 & 111) << 1);
                                f62205c = i11111116 % 128;
                                int i11111117 = i11111116 % 2;
                                if (i10 == iIntValue) {
                                    i10 = i11;
                                }
                            }
                        }
                        int i11212 = f62206d;
                        int i11213 = ((i11212 | 23) << 1) - (((~i11212) & 23) | (i11212 & (-24)));
                        int i11214 = i11213 % 128;
                        f62205c = i11214;
                        int i11215 = i11213 % 2;
                        int i1216 = i11214 & 53;
                        int i1217 = ((i11214 | 53) & (~i1216)) + (i1216 << 1);
                        f62206d = i1217 % 128;
                        int i1218 = i1217 % 2;
                        z11 = true;
                        if (!z11) {
                            int i6111113 = f62205c;
                            i15 = (i6111113 & 37) + (i6111113 | 37);
                            int i6111114 = i15 % 128;
                            f62206d = i6111114;
                            if (i15 % 2 == 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            int i6111115 = (i6111114 & 87) + (i6111114 | 87);
                            f62205c = i6111115 % 128;
                            int i7127 = i6111115 % 2;
                            if (!z12) {
                                int i711111111111111114 = f62205c + 57;
                                int i711111111111111115 = i711111111111111114 % 128;
                                f62206d = i711111111111111115;
                                int i711111111111111116 = i711111111111111114 % 2;
                                int i711111111111111117 = -(-(i10 * (-103)));
                                int i711111111111111118 = ((((-103) ^ i711111111111111117) | ((-103) & i711111111111111117)) << 1) - ((i711111111111111117 & 102) | ((-103) & (~i711111111111111117)));
                                int i711111111111111119 = ~i10;
                                int i7111111111111111110 = (-2) ^ i711111111111111119;
                                int i7111111111111111111 = (-2) & i711111111111111119;
                                int i7111111111111111112 = ~((i7111111111111111110 & i7111111111111111111) | (i7111111111111111110 ^ i7111111111111111111));
                                int i81111111111111111110 = (i711111111111111119 & iIntValue) | (i711111111111111119 ^ iIntValue);
                                int i81111111111111111111 = ~i81111111111111111110;
                                int i81111111111111111112 = (i81111111111111111110 | i81111111111111111111) & i81111111111111111111;
                                int i81111111111111111113 = ((~i81111111111111111112) & i7111111111111111112) | ((~i7111111111111111112) & i81111111111111111112);
                                int i81111111111111111114 = i81111111111111111112 & i7111111111111111112;
                                int i81111111111111111115 = ((i81111111111111111114 & i81111111111111111113) | (i81111111111111111113 ^ i81111111111111111114)) * 104;
                                int i81111111111111111116 = i711111111111111118 & i81111111111111111115;
                                int i81111111111111111117 = (i81111111111111111116 - (~((i81111111111111111115 ^ i711111111111111118) | i81111111111111111116))) - 1;
                                int i81111111111111111118 = ~iIntValue;
                                int i81111111111111111119 = i81111111111111111118 & (i81111111111111111118 | iIntValue);
                                int i91111111111111111110 = i81111111111111111119 ^ 1;
                                int i91111111111111111111 = i81111111111111111119 & 1;
                                int i91111111111111111112 = (i91111111111111111111 & i91111111111111111110) | (i91111111111111111110 ^ i91111111111111111111);
                                int i91111111111111111113 = i91111111111111111112 ^ i10;
                                int i91111111111111111114 = i10 & i91111111111111111112;
                                int i91111111111111111115 = (~((i91111111111111111114 & i91111111111111111113) | (i91111111111111111113 ^ i91111111111111111114))) * (-104);
                                int i91111111111111111116 = i81111111111111111117 & i91111111111111111115;
                                int i91111111111111111117 = (i91111111111111111116 - (~(-(-((i91111111111111111115 ^ i81111111111111111117) | i91111111111111111116))))) - 1;
                                int i91111111111111111118 = iIntValue & 1;
                                int i91111111111111111119 = (iIntValue | 1) & (~i91111111111111111118);
                                int i101111111115 = -(-(((i91111111111111111118 & i91111111111111111119) | (i91111111111111111119 ^ i91111111111111111118)) * 104));
                                int i101111111116 = ((i91111111111111111117 ^ i101111111115) | (i91111111111111111117 & i101111111115)) << 1;
                                int i101111111117 = -((i101111111115 & (~i91111111111111111117)) | ((~i101111111115) & i91111111111111111117));
                                i16 = (i101111111116 & i101111111117) + (i101111111117 | i101111111116);
                                int i101111111118 = i711111111111111115 & 87;
                                int i101111111119 = -(-(i711111111111111115 | 87));
                                i17 = (i101111111118 ^ i101111111119) + ((i101111111118 & i101111111119) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        } else {
                            if (cCharAt == ' ') {
                                int i101214 = f62205c;
                                int i101215 = ((i101214 ^ 46) + ((i101214 & 46) << 1)) - 1;
                                f62206d = i101215 % 128;
                                int i1028 = i101215 % 2;
                                int i7111111111111111113 = f62205c + 57;
                                int i7111111111111111114 = i7111111111111111113 % 128;
                                f62206d = i7111111111111111114;
                                int i7111111111111111115 = i7111111111111111113 % 2;
                                int i7111111111111111116 = -(-(i10 * (-103)));
                                int i7111111111111111117 = ((((-103) ^ i7111111111111111116) | ((-103) & i7111111111111111116)) << 1) - ((i7111111111111111116 & 102) | ((-103) & (~i7111111111111111116)));
                                int i7111111111111111118 = ~i10;
                                int i7111111111111111119 = (-2) ^ i7111111111111111118;
                                int i71111111111111111110 = (-2) & i7111111111111111118;
                                int i71111111111111111111 = ~((i7111111111111111119 & i71111111111111111110) | (i7111111111111111119 ^ i71111111111111111110));
                                int i811111111111111111110 = (i7111111111111111118 & iIntValue) | (i7111111111111111118 ^ iIntValue);
                                int i811111111111111111111 = ~i811111111111111111110;
                                int i811111111111111111112 = (i811111111111111111110 | i811111111111111111111) & i811111111111111111111;
                                int i811111111111111111113 = ((~i811111111111111111112) & i71111111111111111111) | ((~i71111111111111111111) & i811111111111111111112);
                                int i811111111111111111114 = i811111111111111111112 & i71111111111111111111;
                                int i811111111111111111115 = ((i811111111111111111114 & i811111111111111111113) | (i811111111111111111113 ^ i811111111111111111114)) * 104;
                                int i811111111111111111116 = i7111111111111111117 & i811111111111111111115;
                                int i811111111111111111117 = (i811111111111111111116 - (~((i811111111111111111115 ^ i7111111111111111117) | i811111111111111111116))) - 1;
                                int i811111111111111111118 = ~iIntValue;
                                int i811111111111111111119 = i811111111111111111118 & (i811111111111111111118 | iIntValue);
                                int i911111111111111111110 = i811111111111111111119 ^ 1;
                                int i911111111111111111111 = i811111111111111111119 & 1;
                                int i911111111111111111112 = (i911111111111111111111 & i911111111111111111110) | (i911111111111111111110 ^ i911111111111111111111);
                                int i911111111111111111113 = i911111111111111111112 ^ i10;
                                int i911111111111111111114 = i10 & i911111111111111111112;
                                int i911111111111111111115 = (~((i911111111111111111114 & i911111111111111111113) | (i911111111111111111113 ^ i911111111111111111114))) * (-104);
                                int i911111111111111111116 = i811111111111111111117 & i911111111111111111115;
                                int i911111111111111111117 = (i911111111111111111116 - (~(-(-((i911111111111111111115 ^ i811111111111111111117) | i911111111111111111116))))) - 1;
                                int i911111111111111111118 = iIntValue & 1;
                                int i911111111111111111119 = (iIntValue | 1) & (~i911111111111111111118);
                                int i1011111111110 = -(-(((i911111111111111111118 & i911111111111111111119) | (i911111111111111111119 ^ i911111111111111111118)) * 104));
                                int i1011111111111 = ((i911111111111111111117 ^ i1011111111110) | (i911111111111111111117 & i1011111111110)) << 1;
                                int i1011111111112 = -((i1011111111110 & (~i911111111111111111117)) | ((~i1011111111110) & i911111111111111111117));
                                i16 = (i1011111111111 & i1011111111112) + (i1011111111112 | i1011111111111);
                                int i1011111111113 = i7111111111111111114 & 87;
                                int i1011111111114 = -(-(i7111111111111111114 | 87));
                                i17 = (i1011111111113 ^ i1011111111114) + ((i1011111111113 & i1011111111114) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            int i11111118 = f62206d;
                            int i11111119 = i11111118 ^ 77;
                            int i111111110 = (((i11111118 & 77) | i11111119) << 1) - i11111119;
                            f62205c = i111111110 % 128;
                            int i111111111 = i111111110 % 2;
                            int i111111112 = (i11111118 ^ 111) + ((i11111118 & 111) << 1);
                            f62205c = i111111112 % 128;
                            int i111111113 = i111111112 % 2;
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        }
                    }
                    z10 = true;
                    if (z10) {
                        int i3118 = f62206d;
                        int i3119 = i3118 ^ 57;
                        int i31110 = ((i3118 & 57) | i3119) << 1;
                        int i31111 = -i3119;
                        int i4111110 = (i31110 & i31111) + (i31110 | i31111);
                        f62205c = i4111110 % 128;
                        int i4111111 = i4111110 % 2;
                    } else {
                        if (cCharAt == '\f') {
                            int i4111112 = f62205c;
                            int i4111113 = i4111112 & 49;
                            int i4111114 = -(-((i4111112 ^ 49) | i4111113));
                            int i4111115 = (i4111113 ^ i4111114) + ((i4111114 & i4111113) << 1);
                            int i4111116 = i4111115 % 128;
                            f62206d = i4111116;
                            int i4111117 = i4111115 % 2;
                            int i4111118 = ((i4111116 & 11) - (~(-(-(i4111116 | 11))))) - 1;
                            f62205c = i4111118 % 128;
                            int i4111119 = i4111118 % 2;
                        } else {
                            i13 = f62206d;
                            int i5111110 = i13 | 1;
                            int i5111111 = i5111110 << 1;
                            int i5111112 = -(i5111110 & (~(i13 & 1)));
                            int i5111113 = ((i5111111 | i5111112) << 1) - (i5111112 ^ i5111111);
                            i14 = i5111113 % 128;
                            f62205c = i14;
                            int i5111114 = i5111113 % 2;
                            if (cCharAt == '\r') {
                                int i5111115 = i14 & 109;
                                int i5111116 = ((i14 ^ 109) | i5111115) << 1;
                                int i5111117 = -((i14 | 109) & (~i5111115));
                                int i5111118 = (i5111116 ^ i5111117) + ((i5111116 & i5111117) << 1);
                                int i5111119 = i5111118 % 128;
                                f62206d = i5111119;
                                int i6111116 = i5111118 % 2;
                                int i6111117 = i5111119 & 85;
                                int i6111118 = -(-((i5111119 ^ 85) | i6111117));
                                int i6111119 = (i6111117 & i6111118) + (i6111118 | i6111117);
                                f62205c = i6111119 % 128;
                                int i6129 = i6111119 % 2;
                                z11 = true;
                            } else {
                                int i61210 = (((i13 | 74) << 1) - (i13 ^ 74)) - 1;
                                f62205c = i61210 % 128;
                                int i61211 = i61210 % 2;
                                z11 = false;
                            }
                        }
                        if (!z11) {
                            int i61111110 = f62205c;
                            i15 = (i61111110 & 37) + (i61111110 | 37);
                            int i61111111 = i15 % 128;
                            f62206d = i61111111;
                            if (i15 % 2 == 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            int i61111112 = (i61111111 & 87) + (i61111111 | 87);
                            f62205c = i61111112 % 128;
                            int i7128 = i61111112 % 2;
                            if (!z12) {
                                int i71111111111111111112 = f62205c + 57;
                                int i71111111111111111113 = i71111111111111111112 % 128;
                                f62206d = i71111111111111111113;
                                int i71111111111111111114 = i71111111111111111112 % 2;
                                int i71111111111111111115 = -(-(i10 * (-103)));
                                int i71111111111111111116 = ((((-103) ^ i71111111111111111115) | ((-103) & i71111111111111111115)) << 1) - ((i71111111111111111115 & 102) | ((-103) & (~i71111111111111111115)));
                                int i71111111111111111117 = ~i10;
                                int i71111111111111111118 = (-2) ^ i71111111111111111117;
                                int i71111111111111111119 = (-2) & i71111111111111111117;
                                int i711111111111111111110 = ~((i71111111111111111118 & i71111111111111111119) | (i71111111111111111118 ^ i71111111111111111119));
                                int i8111111111111111111110 = (i71111111111111111117 & iIntValue) | (i71111111111111111117 ^ iIntValue);
                                int i8111111111111111111111 = ~i8111111111111111111110;
                                int i8111111111111111111112 = (i8111111111111111111110 | i8111111111111111111111) & i8111111111111111111111;
                                int i8111111111111111111113 = ((~i8111111111111111111112) & i711111111111111111110) | ((~i711111111111111111110) & i8111111111111111111112);
                                int i8111111111111111111114 = i8111111111111111111112 & i711111111111111111110;
                                int i8111111111111111111115 = ((i8111111111111111111114 & i8111111111111111111113) | (i8111111111111111111113 ^ i8111111111111111111114)) * 104;
                                int i8111111111111111111116 = i71111111111111111116 & i8111111111111111111115;
                                int i8111111111111111111117 = (i8111111111111111111116 - (~((i8111111111111111111115 ^ i71111111111111111116) | i8111111111111111111116))) - 1;
                                int i8111111111111111111118 = ~iIntValue;
                                int i8111111111111111111119 = i8111111111111111111118 & (i8111111111111111111118 | iIntValue);
                                int i9111111111111111111110 = i8111111111111111111119 ^ 1;
                                int i9111111111111111111111 = i8111111111111111111119 & 1;
                                int i9111111111111111111112 = (i9111111111111111111111 & i9111111111111111111110) | (i9111111111111111111110 ^ i9111111111111111111111);
                                int i9111111111111111111113 = i9111111111111111111112 ^ i10;
                                int i9111111111111111111114 = i10 & i9111111111111111111112;
                                int i9111111111111111111115 = (~((i9111111111111111111114 & i9111111111111111111113) | (i9111111111111111111113 ^ i9111111111111111111114))) * (-104);
                                int i9111111111111111111116 = i8111111111111111111117 & i9111111111111111111115;
                                int i9111111111111111111117 = (i9111111111111111111116 - (~(-(-((i9111111111111111111115 ^ i8111111111111111111117) | i9111111111111111111116))))) - 1;
                                int i9111111111111111111118 = iIntValue & 1;
                                int i9111111111111111111119 = (iIntValue | 1) & (~i9111111111111111111118);
                                int i1011111111115 = -(-(((i9111111111111111111118 & i9111111111111111111119) | (i9111111111111111111119 ^ i9111111111111111111118)) * 104));
                                int i1011111111116 = ((i9111111111111111111117 ^ i1011111111115) | (i9111111111111111111117 & i1011111111115)) << 1;
                                int i1011111111117 = -((i1011111111115 & (~i9111111111111111111117)) | ((~i1011111111115) & i9111111111111111111117));
                                i16 = (i1011111111116 & i1011111111117) + (i1011111111117 | i1011111111116);
                                int i1011111111118 = i71111111111111111113 & 87;
                                int i1011111111119 = -(-(i71111111111111111113 | 87));
                                i17 = (i1011111111118 ^ i1011111111119) + ((i1011111111118 & i1011111111119) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        } else {
                            if (cCharAt == ' ') {
                                int i101216 = f62205c;
                                int i101217 = ((i101216 ^ 46) + ((i101216 & 46) << 1)) - 1;
                                f62206d = i101217 % 128;
                                int i1029 = i101217 % 2;
                                int i711111111111111111111 = f62205c + 57;
                                int i711111111111111111112 = i711111111111111111111 % 128;
                                f62206d = i711111111111111111112;
                                int i711111111111111111113 = i711111111111111111111 % 2;
                                int i711111111111111111114 = -(-(i10 * (-103)));
                                int i711111111111111111115 = ((((-103) ^ i711111111111111111114) | ((-103) & i711111111111111111114)) << 1) - ((i711111111111111111114 & 102) | ((-103) & (~i711111111111111111114)));
                                int i711111111111111111116 = ~i10;
                                int i711111111111111111117 = (-2) ^ i711111111111111111116;
                                int i711111111111111111118 = (-2) & i711111111111111111116;
                                int i711111111111111111119 = ~((i711111111111111111117 & i711111111111111111118) | (i711111111111111111117 ^ i711111111111111111118));
                                int i81111111111111111111110 = (i711111111111111111116 & iIntValue) | (i711111111111111111116 ^ iIntValue);
                                int i81111111111111111111111 = ~i81111111111111111111110;
                                int i81111111111111111111112 = (i81111111111111111111110 | i81111111111111111111111) & i81111111111111111111111;
                                int i81111111111111111111113 = ((~i81111111111111111111112) & i711111111111111111119) | ((~i711111111111111111119) & i81111111111111111111112);
                                int i81111111111111111111114 = i81111111111111111111112 & i711111111111111111119;
                                int i81111111111111111111115 = ((i81111111111111111111114 & i81111111111111111111113) | (i81111111111111111111113 ^ i81111111111111111111114)) * 104;
                                int i81111111111111111111116 = i711111111111111111115 & i81111111111111111111115;
                                int i81111111111111111111117 = (i81111111111111111111116 - (~((i81111111111111111111115 ^ i711111111111111111115) | i81111111111111111111116))) - 1;
                                int i81111111111111111111118 = ~iIntValue;
                                int i81111111111111111111119 = i81111111111111111111118 & (i81111111111111111111118 | iIntValue);
                                int i91111111111111111111110 = i81111111111111111111119 ^ 1;
                                int i91111111111111111111111 = i81111111111111111111119 & 1;
                                int i91111111111111111111112 = (i91111111111111111111111 & i91111111111111111111110) | (i91111111111111111111110 ^ i91111111111111111111111);
                                int i91111111111111111111113 = i91111111111111111111112 ^ i10;
                                int i91111111111111111111114 = i10 & i91111111111111111111112;
                                int i91111111111111111111115 = (~((i91111111111111111111114 & i91111111111111111111113) | (i91111111111111111111113 ^ i91111111111111111111114))) * (-104);
                                int i91111111111111111111116 = i81111111111111111111117 & i91111111111111111111115;
                                int i91111111111111111111117 = (i91111111111111111111116 - (~(-(-((i91111111111111111111115 ^ i81111111111111111111117) | i91111111111111111111116))))) - 1;
                                int i91111111111111111111118 = iIntValue & 1;
                                int i91111111111111111111119 = (iIntValue | 1) & (~i91111111111111111111118);
                                int i10111111111110 = -(-(((i91111111111111111111118 & i91111111111111111111119) | (i91111111111111111111119 ^ i91111111111111111111118)) * 104));
                                int i10111111111111 = ((i91111111111111111111117 ^ i10111111111110) | (i91111111111111111111117 & i10111111111110)) << 1;
                                int i10111111111112 = -((i10111111111110 & (~i91111111111111111111117)) | ((~i10111111111110) & i91111111111111111111117));
                                i16 = (i10111111111111 & i10111111111112) + (i10111111111112 | i10111111111111);
                                int i10111111111113 = i711111111111111111112 & 87;
                                int i10111111111114 = -(-(i711111111111111111112 | 87));
                                i17 = (i10111111111113 ^ i10111111111114) + ((i10111111111113 & i10111111111114) << 1);
                                f62205c = i17 % 128;
                                if (i17 % 2 == 0) {
                                    return Integer.valueOf(i16);
                                }
                                throw null;
                            }
                            int i111111114 = f62206d;
                            int i111111115 = i111111114 ^ 77;
                            int i111111116 = (((i111111114 & 77) | i111111115) << 1) - i111111115;
                            f62205c = i111111116 % 128;
                            int i111111117 = i111111116 % 2;
                            int i111111118 = (i111111114 ^ 111) + ((i111111114 & 111) << 1);
                            f62205c = i111111118 % 128;
                            int i111111119 = i111111118 % 2;
                            if (i10 == iIntValue) {
                                i10 = i11;
                            }
                        }
                    }
                    int i11216 = f62206d;
                    int i11217 = ((i11216 | 23) << 1) - (((~i11216) & 23) | (i11216 & (-24)));
                    int i11218 = i11217 % 128;
                    f62205c = i11218;
                    int i11219 = i11217 % 2;
                    int i1219 = i11218 & 53;
                    int i12110 = ((i11218 | 53) & (~i1219)) + (i1219 << 1);
                    f62206d = i12110 % 128;
                    int i12111 = i12110 % 2;
                    z11 = true;
                    if (!z11) {
                        int i61111113 = f62205c;
                        i15 = (i61111113 & 37) + (i61111113 | 37);
                        int i61111114 = i15 % 128;
                        f62206d = i61111114;
                        if (i15 % 2 == 0) {
                            z12 = false;
                        } else {
                            z12 = true;
                        }
                        int i61111115 = (i61111114 & 87) + (i61111114 | 87);
                        f62205c = i61111115 % 128;
                        int i7129 = i61111115 % 2;
                        if (!z12) {
                            int i7111111111111111111110 = f62205c + 57;
                            int i7111111111111111111111 = i7111111111111111111110 % 128;
                            f62206d = i7111111111111111111111;
                            int i7111111111111111111112 = i7111111111111111111110 % 2;
                            int i7111111111111111111113 = -(-(i10 * (-103)));
                            int i7111111111111111111114 = ((((-103) ^ i7111111111111111111113) | ((-103) & i7111111111111111111113)) << 1) - ((i7111111111111111111113 & 102) | ((-103) & (~i7111111111111111111113)));
                            int i7111111111111111111115 = ~i10;
                            int i7111111111111111111116 = (-2) ^ i7111111111111111111115;
                            int i7111111111111111111117 = (-2) & i7111111111111111111115;
                            int i7111111111111111111118 = ~((i7111111111111111111116 & i7111111111111111111117) | (i7111111111111111111116 ^ i7111111111111111111117));
                            int i811111111111111111111110 = (i7111111111111111111115 & iIntValue) | (i7111111111111111111115 ^ iIntValue);
                            int i811111111111111111111111 = ~i811111111111111111111110;
                            int i811111111111111111111112 = (i811111111111111111111110 | i811111111111111111111111) & i811111111111111111111111;
                            int i811111111111111111111113 = ((~i811111111111111111111112) & i7111111111111111111118) | ((~i7111111111111111111118) & i811111111111111111111112);
                            int i811111111111111111111114 = i811111111111111111111112 & i7111111111111111111118;
                            int i811111111111111111111115 = ((i811111111111111111111114 & i811111111111111111111113) | (i811111111111111111111113 ^ i811111111111111111111114)) * 104;
                            int i811111111111111111111116 = i7111111111111111111114 & i811111111111111111111115;
                            int i811111111111111111111117 = (i811111111111111111111116 - (~((i811111111111111111111115 ^ i7111111111111111111114) | i811111111111111111111116))) - 1;
                            int i811111111111111111111118 = ~iIntValue;
                            int i811111111111111111111119 = i811111111111111111111118 & (i811111111111111111111118 | iIntValue);
                            int i911111111111111111111110 = i811111111111111111111119 ^ 1;
                            int i911111111111111111111111 = i811111111111111111111119 & 1;
                            int i911111111111111111111112 = (i911111111111111111111111 & i911111111111111111111110) | (i911111111111111111111110 ^ i911111111111111111111111);
                            int i911111111111111111111113 = i911111111111111111111112 ^ i10;
                            int i911111111111111111111114 = i10 & i911111111111111111111112;
                            int i911111111111111111111115 = (~((i911111111111111111111114 & i911111111111111111111113) | (i911111111111111111111113 ^ i911111111111111111111114))) * (-104);
                            int i911111111111111111111116 = i811111111111111111111117 & i911111111111111111111115;
                            int i911111111111111111111117 = (i911111111111111111111116 - (~(-(-((i911111111111111111111115 ^ i811111111111111111111117) | i911111111111111111111116))))) - 1;
                            int i911111111111111111111118 = iIntValue & 1;
                            int i911111111111111111111119 = (iIntValue | 1) & (~i911111111111111111111118);
                            int i10111111111115 = -(-(((i911111111111111111111118 & i911111111111111111111119) | (i911111111111111111111119 ^ i911111111111111111111118)) * 104));
                            int i10111111111116 = ((i911111111111111111111117 ^ i10111111111115) | (i911111111111111111111117 & i10111111111115)) << 1;
                            int i10111111111117 = -((i10111111111115 & (~i911111111111111111111117)) | ((~i10111111111115) & i911111111111111111111117));
                            i16 = (i10111111111116 & i10111111111117) + (i10111111111117 | i10111111111116);
                            int i10111111111118 = i7111111111111111111111 & 87;
                            int i10111111111119 = -(-(i7111111111111111111111 | 87));
                            i17 = (i10111111111118 ^ i10111111111119) + ((i10111111111118 & i10111111111119) << 1);
                            f62205c = i17 % 128;
                            if (i17 % 2 == 0) {
                                return Integer.valueOf(i16);
                            }
                            throw null;
                        }
                        if (i10 == iIntValue) {
                            i10 = i11;
                        }
                    } else {
                        if (cCharAt == ' ') {
                            int i101218 = f62205c;
                            int i101219 = ((i101218 ^ 46) + ((i101218 & 46) << 1)) - 1;
                            f62206d = i101219 % 128;
                            int i10210 = i101219 % 2;
                            int i7111111111111111111119 = f62205c + 57;
                            int i71111111111111111111110 = i7111111111111111111119 % 128;
                            f62206d = i71111111111111111111110;
                            int i71111111111111111111111 = i7111111111111111111119 % 2;
                            int i71111111111111111111112 = -(-(i10 * (-103)));
                            int i71111111111111111111113 = ((((-103) ^ i71111111111111111111112) | ((-103) & i71111111111111111111112)) << 1) - ((i71111111111111111111112 & 102) | ((-103) & (~i71111111111111111111112)));
                            int i71111111111111111111114 = ~i10;
                            int i71111111111111111111115 = (-2) ^ i71111111111111111111114;
                            int i71111111111111111111116 = (-2) & i71111111111111111111114;
                            int i71111111111111111111117 = ~((i71111111111111111111115 & i71111111111111111111116) | (i71111111111111111111115 ^ i71111111111111111111116));
                            int i8111111111111111111111110 = (i71111111111111111111114 & iIntValue) | (i71111111111111111111114 ^ iIntValue);
                            int i8111111111111111111111111 = ~i8111111111111111111111110;
                            int i8111111111111111111111112 = (i8111111111111111111111110 | i8111111111111111111111111) & i8111111111111111111111111;
                            int i8111111111111111111111113 = ((~i8111111111111111111111112) & i71111111111111111111117) | ((~i71111111111111111111117) & i8111111111111111111111112);
                            int i8111111111111111111111114 = i8111111111111111111111112 & i71111111111111111111117;
                            int i8111111111111111111111115 = ((i8111111111111111111111114 & i8111111111111111111111113) | (i8111111111111111111111113 ^ i8111111111111111111111114)) * 104;
                            int i8111111111111111111111116 = i71111111111111111111113 & i8111111111111111111111115;
                            int i8111111111111111111111117 = (i8111111111111111111111116 - (~((i8111111111111111111111115 ^ i71111111111111111111113) | i8111111111111111111111116))) - 1;
                            int i8111111111111111111111118 = ~iIntValue;
                            int i8111111111111111111111119 = i8111111111111111111111118 & (i8111111111111111111111118 | iIntValue);
                            int i9111111111111111111111110 = i8111111111111111111111119 ^ 1;
                            int i9111111111111111111111111 = i8111111111111111111111119 & 1;
                            int i9111111111111111111111112 = (i9111111111111111111111111 & i9111111111111111111111110) | (i9111111111111111111111110 ^ i9111111111111111111111111);
                            int i9111111111111111111111113 = i9111111111111111111111112 ^ i10;
                            int i9111111111111111111111114 = i10 & i9111111111111111111111112;
                            int i9111111111111111111111115 = (~((i9111111111111111111111114 & i9111111111111111111111113) | (i9111111111111111111111113 ^ i9111111111111111111111114))) * (-104);
                            int i9111111111111111111111116 = i8111111111111111111111117 & i9111111111111111111111115;
                            int i9111111111111111111111117 = (i9111111111111111111111116 - (~(-(-((i9111111111111111111111115 ^ i8111111111111111111111117) | i9111111111111111111111116))))) - 1;
                            int i9111111111111111111111118 = iIntValue & 1;
                            int i9111111111111111111111119 = (iIntValue | 1) & (~i9111111111111111111111118);
                            int i101111111111110 = -(-(((i9111111111111111111111118 & i9111111111111111111111119) | (i9111111111111111111111119 ^ i9111111111111111111111118)) * 104));
                            int i101111111111111 = ((i9111111111111111111111117 ^ i101111111111110) | (i9111111111111111111111117 & i101111111111110)) << 1;
                            int i101111111111112 = -((i101111111111110 & (~i9111111111111111111111117)) | ((~i101111111111110) & i9111111111111111111111117));
                            i16 = (i101111111111111 & i101111111111112) + (i101111111111112 | i101111111111111);
                            int i101111111111113 = i71111111111111111111110 & 87;
                            int i101111111111114 = -(-(i71111111111111111111110 | 87));
                            i17 = (i101111111111113 ^ i101111111111114) + ((i101111111111113 & i101111111111114) << 1);
                            f62205c = i17 % 128;
                            if (i17 % 2 == 0) {
                                return Integer.valueOf(i16);
                            }
                            throw null;
                        }
                        int i1111111110 = f62206d;
                        int i1111111111 = i1111111110 ^ 77;
                        int i1111111112 = (((i1111111110 & 77) | i1111111111) << 1) - i1111111111;
                        f62205c = i1111111112 % 128;
                        int i1111111113 = i1111111112 % 2;
                        int i1111111114 = (i1111111110 ^ 111) + ((i1111111110 & 111) << 1);
                        f62205c = i1111111114 % 128;
                        int i1111111115 = i1111111114 % 2;
                        if (i10 == iIntValue) {
                            i10 = i11;
                        }
                    }
                }
            }
        }
        int i131 = f62205c;
        int i132 = ((i131 & (-12)) | ((~i131) & 11)) + ((i131 & 11) << 1);
        f62206d = i132 % 128;
        if (i132 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
    
        if (r3.length == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        if (r3.length == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0086, code lost:
    
        r12 = (-2) - (((r8 ^ 20) + ((r8 & 20) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.yt.f62205c = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        r6 = r7 & 41;
        r8 = (~r6) & (r7 | 41);
        r6 = r6 << 1;
        r9 = (r8 & r6) + (r6 | r8);
        com.mypinpad.tsdk.isolation.yt.f62206d = r9 % 128;
        r9 = r9 % 2;
        r6 = r1.length;
        r8 = (((r7 ^ 125) | (r7 & 125)) << 1) - (((~r7) & 125) | (r7 & (-126)));
        com.mypinpad.tsdk.isolation.yt.f62206d = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bb, code lost:
    
        if (r0 >= r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.yt.f62206d + 69;
        com.mypinpad.tsdk.isolation.yt.f62205c = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c6, code lost:
    
        if ((r7 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c8, code lost:
    
        r7 = r1[r0];
        r8 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r3);
        r0 = ((r0 & (-113)) + (r0 | (-113))) + 124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        r7 = r1[r0];
        r8 = (((r0 & 17) | ((~r0) & (-18))) - (~(-(-((r0 & (-18)) << 1))))) - 1;
        r0 = r8 & 19;
        r0 = (r0 - (~((r8 ^ 19) | r0))) - 1;
        r8 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f5, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.yt.f62206d;
        r10 = (r9 & 107) + (r9 | 107);
        com.mypinpad.tsdk.isolation.yt.f62205c = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0105, code lost:
    
        if (r8.hasNext() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.yt.f62206d;
        r9 = (-2) - ((((r9 | 120) << 1) - (r9 ^ 120)) ^ (-1));
        com.mypinpad.tsdk.isolation.yt.f62205c = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0118, code lost:
    
        if ((r9 % 2) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        if (r12.compare(r7, (java.lang.String) r8.next()) != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0126, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.yt.f62205c;
        r1 = r12 & 53;
        r0 = (((r12 ^ 53) | r1) << 1) - ((r12 | 53) & (~r1));
        com.mypinpad.tsdk.isolation.yt.f62206d = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013a, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013b, code lost:
    
        r12.compare(r7, (java.lang.String) r8.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0144, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0145, code lost:
    
        r12 = com.mypinpad.tsdk.isolation.yt.f62206d;
        r0 = (((r12 ^ 93) | (r12 & 93)) << 1) - (((~r12) & 93) | (r12 & (-94)));
        com.mypinpad.tsdk.isolation.yt.f62205c = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x015c, code lost:
    
        return java.lang.Boolean.FALSE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean i(java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.yt.i(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ Integer j(Object[] objArr) {
        String str = (String) objArr[0];
        char cCharValue = ((Character) objArr[1]).charValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f62205c;
        int i11 = (i10 ^ 41) + ((i10 & 41) << 1);
        f62206d = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            int i12 = 51 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
        }
        int i13 = f62205c;
        int i14 = i13 & 113;
        int i15 = ((i13 | 113) & (~i14)) + (i14 << 1);
        f62206d = i15 % 128;
        int i16 = i15 % 2;
        while (iIntValue < iIntValue2) {
            int i17 = f62205c;
            int i18 = i17 & 53;
            int i19 = -(-((i17 ^ 53) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            f62206d = i20 % 128;
            int i21 = i20 % 2;
            int i22 = iIntValue & 1;
            int i23 = i22 + ((iIntValue ^ 1) | i22);
            if (str.charAt(iIntValue) == cCharValue) {
                int i24 = f62206d + 35;
                f62205c = i24 % 128;
                if (i24 % 2 == 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            }
            iIntValue = i23;
        }
        int i25 = f62206d + 47;
        f62205c = i25 % 128;
        if (i25 % 2 == 0) {
            return Integer.valueOf(iIntValue2);
        }
        throw null;
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        String[] strArr = (String[]) objArr[0];
        String str = (String) objArr[1];
        Comparator comparator = (Comparator) objArr[2];
        int i10 = f62205c;
        int i11 = (i10 & 67) + (i10 | 67);
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        int length = strArr.length;
        int i13 = f62206d;
        int i14 = i13 & 113;
        int i15 = (((i13 | 113) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        f62205c = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < length) {
            int i18 = f62205c;
            int i19 = ((i18 | 23) << 1) - (i18 ^ 23);
            f62206d = i19 % 128;
            if (i19 % 2 == 0) {
                comparator.compare(strArr[i17], str);
                throw null;
            }
            if (comparator.compare(strArr[i17], str) == 0) {
                int i20 = f62205c;
                int i21 = i20 + 87;
                f62206d = i21 % 128;
                int i22 = i21 % 2;
                int i23 = i20 ^ 27;
                int i24 = ((i20 & 27) | i23) << 1;
                int i25 = -i23;
                int i26 = (i24 & i25) + (i25 | i24);
                f62206d = i26 % 128;
                int i27 = i26 % 2;
                int i28 = i20 & 13;
                int i29 = ((~i28) & (i20 | 13)) + (i28 << 1);
                f62206d = i29 % 128;
                if (i29 % 2 == 0) {
                    throw null;
                }
                int i30 = i20 + 67;
                f62206d = i30 % 128;
                if (i30 % 2 != 0) {
                    return Integer.valueOf(i17);
                }
                int i31 = 87 / 0;
                return Integer.valueOf(i17);
            }
            int i32 = f62205c;
            int i33 = (((i32 | 48) << 1) - (i32 ^ 48)) - 1;
            int i34 = i33 % 128;
            f62206d = i34;
            int i35 = i33 % 2;
            i17++;
            int i36 = (-2) - ((-1) ^ (i34 + 112));
            f62205c = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = f62206d;
        int i39 = (i38 ^ 13) + ((i38 & 13) << 1);
        f62205c = i39 % 128;
        int i40 = i39 % 2;
        return -1;
    }

    public static /* synthetic */ Boolean l(Object[] objArr) {
        boolean zMatches;
        String str = (String) objArr[0];
        int i10 = (-2) - ((f62206d + 84) ^ (-1));
        f62205c = i10 % 128;
        int i11 = i10 % 2;
        Regex regex = f62204b;
        if (i11 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            zMatches = regex.matches(str);
            int i12 = 27 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            zMatches = regex.matches(str);
        }
        int i13 = f62205c;
        int i14 = i13 & 17;
        int i15 = (((i13 ^ 17) | i14) << 1) - ((i13 | 17) & (~i14));
        f62206d = i15 % 128;
        int i16 = i15 % 2;
        return Boolean.valueOf(zMatches);
    }

    public static /* synthetic */ Exception m(Object[] objArr) {
        Exception exc = (Exception) objArr[0];
        List list = (List) objArr[1];
        int i10 = f62205c;
        int i11 = (i10 ^ 79) + ((i10 & 79) << 1);
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.size() > 1) {
            int i13 = f62206d;
            int i14 = (-2) - ((((i13 | 106) << 1) - (i13 ^ 106)) ^ (-1));
            f62205c = i14 % 128;
            int i15 = i14 % 2;
            System.out.println(list);
            int i16 = f62206d;
            int i17 = i16 & 57;
            int i18 = i17 + ((i16 ^ 57) | i17);
            f62205c = i18 % 128;
            int i19 = i18 % 2;
        }
        Iterator it = list.iterator();
        int i20 = f62206d;
        int i21 = i20 ^ 59;
        int i22 = ((((i20 & 59) | i21) << 1) - (~(-i21))) - 1;
        f62205c = i22 % 128;
        int i23 = i22 % 2;
        while (it.hasNext()) {
            int i24 = f62206d;
            int i25 = i24 ^ 25;
            int i26 = ((i24 & 25) | i25) << 1;
            int i27 = -i25;
            int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
            f62205c = i28 % 128;
            int i29 = i28 % 2;
            b.addSuppressed(exc, (Exception) it.next());
            int i30 = f62206d;
            int i31 = (i30 ^ 53) + ((i30 & 53) << 1);
            f62205c = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = f62205c;
        int i34 = (i33 ^ 1) + ((i33 & 1) << 1);
        f62206d = i34 % 128;
        if (i34 % 2 != 0) {
            return exc;
        }
        throw null;
    }

    public static /* synthetic */ Integer n(Object[] objArr) {
        short sShortValue = ((Short) objArr[0]).shortValue();
        int i10 = f62206d;
        int i11 = (i10 & (-44)) | ((~i10) & 43);
        int i12 = (i10 & 43) << 1;
        int i13 = (i11 & i12) + (i11 | i12);
        f62205c = i13 % 128;
        int i14 = i13 % 2;
        int i15 = sShortValue & UShort.MAX_VALUE;
        int i16 = (-2) - (((i10 ^ 48) + ((i10 & 48) << 1)) ^ (-1));
        f62205c = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static /* synthetic */ Boolean o(Object[] objArr) {
        yg ygVar = (yg) objArr[0];
        yg ygVar2 = (yg) objArr[1];
        int i10 = f62205c;
        int i11 = ((((i10 ^ 79) | (i10 & 79)) << 1) - (~(-(((~i10) & 79) | (i10 & (-80)))))) - 1;
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(ygVar, "");
        Intrinsics.checkNotNullParameter(ygVar2, "");
        if (Intrinsics.areEqual((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar)), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2)))) {
            int i13 = f62206d + 29;
            f62205c = i13 % 128;
            int i14 = i13 % 2;
            if (((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar}, -2100304715, 2100304729, System.identityHashCode(ygVar))).intValue() == ((Integer) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -2100304715, 2100304729, System.identityHashCode(ygVar2))).intValue()) {
                int i15 = f62205c;
                int i16 = i15 & 19;
                int i17 = -(-((i15 ^ 19) | i16));
                int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
                f62206d = i18 % 128;
                int i19 = i18 % 2;
                if (!(!Intrinsics.areEqual((String) yg.setOnFocusChangeListener(new Object[]{ygVar}, 952222842, -952222825, System.identityHashCode(ygVar)), (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, 952222842, -952222825, System.identityHashCode(ygVar2))))) {
                    int i20 = f62206d;
                    int i21 = (i20 & (-62)) | ((~i20) & 61);
                    int i22 = -(-((i20 & 61) << 1));
                    int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                    int i24 = i23 % 128;
                    f62205c = i24;
                    int i25 = i23 % 2;
                    int i26 = i24 ^ 83;
                    int i27 = (((i24 & 83) | i26) << 1) - i26;
                    f62206d = i27 % 128;
                    if (i27 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    int i28 = 39 / 0;
                    return Boolean.TRUE;
                }
            }
        }
        int i29 = f62206d;
        int i30 = ((i29 ^ 48) + ((i29 & 48) << 1)) - 1;
        f62205c = i30 % 128;
        if (i30 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Integer p(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        int iIntValue;
        String str = (String) objArr[0];
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int i10 = f62205c;
        int i11 = ((i10 | 109) << 1) - (i10 ^ 109);
        f62206d = i11 % 128;
        if (i11 % 2 == 0) {
            iIntValue = ((Integer) setY(new Object[]{str, Integer.valueOf(iIntValue2), Integer.valueOf(str.length())}, -1844371224, 1844371266, iIntValue2)).intValue();
            int i12 = 14 / 0;
        } else {
            iIntValue = ((Integer) setY(new Object[]{str, Integer.valueOf(iIntValue2), Integer.valueOf(str.length())}, -1844371224, 1844371266, iIntValue2)).intValue();
        }
        int i13 = f62205c;
        int i14 = i13 & 115;
        int i15 = i13 | 115;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f62206d = i16 % 128;
        int i17 = i16 % 2;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Integer q(Object[] objArr) {
        String str = (String) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        TimeUnit timeUnit = (TimeUnit) objArr[2];
        int i10 = f62205c;
        int i11 = (-2) - ((((i10 | 106) << 1) - (i10 ^ 106)) ^ (-1));
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (jLongValue < 0) {
            int i13 = f62205c;
            int i14 = ((i13 | 49) << 1) - (i13 ^ 49);
            f62206d = i14 % 128;
            int i15 = i14 % 2;
            throw new IllegalStateException(Intrinsics.stringPlus(str, " < 0").toString());
        }
        int i16 = f62206d + 51;
        int i17 = i16 % 128;
        f62205c = i17;
        int i18 = i16 % 2;
        int i19 = (i17 ^ 13) + ((i17 & 13) << 1);
        int i20 = i19 % 128;
        f62206d = i20;
        int i21 = i19 % 2;
        if (timeUnit == null) {
            int i22 = i17 + 18;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            f62206d = i23 % 128;
            int i24 = i23 % 2;
            throw new IllegalStateException("unit == null".toString());
        }
        int i25 = ((i20 ^ 55) | (i20 & 55)) << 1;
        int i26 = -((i20 & (-56)) | ((~i20) & 55));
        int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
        int i28 = i27 % 128;
        f62205c = i28;
        int i29 = i27 % 2;
        int i30 = i28 & 1;
        int i31 = (i28 | 1) & (~i30);
        int i32 = -(-(i30 << 1));
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        f62206d = i33 % 128;
        int i34 = i33 % 2;
        long millis = timeUnit.toMillis(jLongValue);
        if (millis > 2147483647L) {
            int i35 = f62206d;
            int i36 = ((i35 | 61) << 1) - (i35 ^ 61);
            f62205c = i36 % 128;
            int i37 = i36 % 2;
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, " too large.").toString());
        }
        int i38 = f62205c;
        int i39 = i38 & 75;
        int i40 = -(-((i38 ^ 75) | i39));
        int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
        f62206d = i41 % 128;
        int i42 = i41 % 2;
        if (millis == 0) {
            int i43 = (i38 ^ 33) + ((i38 & 33) << 1);
            int i44 = i43 % 128;
            f62206d = i44;
            if (i43 % 2 != 0 ? jLongValue > 0 : jLongValue > 1) {
                int i45 = ((i44 ^ 89) | (i44 & 89)) << 1;
                int i46 = -((i44 & (-90)) | ((~i44) & 89));
                int i47 = (i45 & i46) + (i45 | i46);
                f62205c = i47 % 128;
                int i48 = i47 % 2;
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, " too small.").toString());
            }
        }
        int i49 = ((i38 ^ 110) + ((i38 & 110) << 1)) - 1;
        f62206d = i49 % 128;
        int i50 = i49 % 2;
        int i51 = (int) millis;
        int i52 = (i38 | 79) << 1;
        int i53 = -(((~i38) & 79) | (i38 & (-80)));
        int i54 = ((i52 | i53) << 1) - (i53 ^ i52);
        f62206d = i54 % 128;
        if (i54 % 2 != 0) {
            return Integer.valueOf(i51);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0087 A[PHI: r6 r8
      0x0087: PHI (r6v12 char) = (r6v11 char), (r6v30 char) binds: [B:12:0x0085, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r8v4 int) = (r8v3 int), (r8v9 int) binds: [B:12:0x0085, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x009c A[PHI: r6 r8
      0x009c: PHI (r6v25 char) = (r6v11 char), (r6v30 char) binds: [B:12:0x0085, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r8v6 int) = (r8v3 int), (r8v9 int) binds: [B:12:0x0085, B:9:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:18:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x014c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0170  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x01be  */
    /* JADX WARN: Code duplicated, block: B:52:0x0194 A[SYNTHETIC] */
    public static /* synthetic */ Integer r(Object[] objArr) {
        int i10;
        char cCharAt;
        boolean z10;
        int i11;
        int i12;
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i13 = f62206d;
        int i14 = (i13 ^ 35) + ((i13 & 35) << 1);
        f62205c = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i15 = f62206d;
        int i16 = i15 & 71;
        int i17 = ((i15 | 71) & (~i16)) + (i16 << 1);
        f62205c = i17 % 128;
        int i18 = i17 % 2;
        for (int iIntValue2 = ((Number) objArr[1]).intValue(); iIntValue2 < iIntValue; iIntValue2 = i10) {
            int i19 = f62205c;
            int i20 = i19 & 49;
            int i21 = -(-((i19 ^ 49) | i20));
            int i22 = (i20 & i21) + (i21 | i20);
            f62206d = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = iIntValue2 & 69;
                int i24 = ((iIntValue2 ^ 69) | i23) << 1;
                int i25 = -((~i23) & (iIntValue2 | 69));
                i10 = (i24 & i25) + (i24 | i25);
                cCharAt = str.charAt(iIntValue2);
                if (cCharAt == 'z') {
                    int i26 = f62206d;
                    int i27 = i26 & 113;
                    int i28 = (i26 | 113) & (~i27);
                    int i29 = i27 << 1;
                    int i30 = (i28 ^ i29) + ((i28 & i29) << 1);
                    f62205c = i30 % 128;
                    int i31 = i30 % 2;
                    z10 = true;
                } else if (cCharAt == '\n') {
                    int i32 = f62206d;
                    int i33 = i32 & 71;
                    int i34 = (i32 ^ 71) | i33;
                    i12 = (i33 & i34) + (i34 | i33);
                    int i35 = i12 % 128;
                    f62205c = i35;
                    if (i12 % 2 != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int i36 = i35 & 103;
                    int i37 = -(-((i35 ^ 103) | i36));
                    int i38 = (i36 & i37) + (i37 | i36);
                    f62206d = i38 % 128;
                    int i39 = i38 % 2;
                } else {
                    int i40 = f62205c;
                    int i41 = i40 & 27;
                    int i42 = (i40 ^ 27) | i41;
                    int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                    f62206d = i43 % 128;
                    int i44 = i43 % 2;
                    z10 = false;
                }
            } else {
                int i45 = iIntValue2 & (-12);
                int i46 = (iIntValue2 ^ (-12)) | i45;
                int i47 = ((i45 | i46) << 1) - (i45 ^ i46);
                i10 = ((i47 ^ 13) - (~(-(-((i47 & 13) << 1))))) - 1;
                cCharAt = str.charAt(iIntValue2);
                if (cCharAt == '\t') {
                    int i210 = f62206d;
                    int i211 = i210 & 113;
                    int i212 = (i210 | 113) & (~i211);
                    int i213 = i211 << 1;
                    int i310 = (i212 ^ i213) + ((i212 & i213) << 1);
                    f62205c = i310 % 128;
                    int i311 = i310 % 2;
                    z10 = true;
                } else if (cCharAt == '\n') {
                    int i312 = f62206d;
                    int i313 = i312 & 71;
                    int i314 = (i312 ^ 71) | i313;
                    i12 = (i313 & i314) + (i314 | i313);
                    int i315 = i12 % 128;
                    f62205c = i315;
                    if (i12 % 2 != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    int i316 = i315 & 103;
                    int i317 = -(-((i315 ^ 103) | i316));
                    int i318 = (i316 & i317) + (i317 | i316);
                    f62206d = i318 % 128;
                    int i319 = i318 % 2;
                } else {
                    int i48 = f62205c;
                    int i49 = i48 & 27;
                    int i410 = (i48 ^ 27) | i49;
                    int i411 = (i49 ^ i410) + ((i410 & i49) << 1);
                    f62206d = i411 % 128;
                    int i412 = i411 % 2;
                    z10 = false;
                }
            }
            if (z10) {
                int i50 = f62206d;
                int i51 = (i50 ^ 33) + ((i50 & 33) << 1);
                f62205c = i51 % 128;
                int i52 = i51 % 2;
                int i53 = i50 & 107;
                int i54 = i50 | 107;
                int i55 = (i53 ^ i54) + ((i54 & i53) << 1);
                f62205c = i55 % 128;
                int i56 = i55 % 2;
            } else if (cCharAt == '\f') {
                int i57 = f62205c;
                int i58 = (i57 & (-124)) | ((~i57) & 123);
                int i59 = (i57 & 123) << 1;
                int i60 = (i58 & i59) + (i59 | i58);
                int i61 = i60 % 128;
                f62206d = i61;
                int i62 = i60 % 2;
                int i63 = i61 ^ 9;
                int i64 = -(-((i61 & 9) << 1));
                int i65 = (i63 & i64) + (i64 | i63);
                f62205c = i65 % 128;
                int i66 = i65 % 2;
            } else {
                int i67 = f62205c;
                int i68 = (i67 & 105) + (i67 | 105);
                int i69 = i68 % 128;
                f62206d = i69;
                int i70 = i68 % 2;
                if (cCharAt == '\r') {
                    int i71 = ((i69 | 51) << 1) - (i69 ^ 51);
                    f62205c = i71 % 128;
                    if (i71 % 2 == 0) {
                        int i72 = f62206d;
                        int i73 = i72 & 71;
                        int i74 = -(-((i72 ^ 71) | i73));
                        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
                        f62205c = i75 % 128;
                        int i76 = i75 % 2;
                    }
                } else {
                    int i77 = ((i67 ^ 30) + ((i67 & 30) << 1)) - 1;
                    f62206d = i77 % 128;
                    int i78 = i77 % 2;
                }
                if (cCharAt == ' ') {
                    int i79 = f62205c;
                    int i80 = ((i79 | 7) << 1) - (i79 ^ 7);
                    f62206d = i80 % 128;
                    int i81 = i80 % 2;
                    int i82 = ((i79 ^ 32) + ((i79 & 32) << 1)) - 1;
                    f62206d = i82 % 128;
                    int i83 = i82 % 2;
                    i11 = i79 + 1;
                    f62206d = i11 % 128;
                    if (i11 % 2 == 0) {
                        return Integer.valueOf(iIntValue2);
                    }
                    int i84 = 67 / 0;
                    return Integer.valueOf(iIntValue2);
                }
                int i85 = f62206d;
                int i86 = i85 ^ 71;
                int i87 = (((i85 & 71) | i86) << 1) - i86;
                f62205c = i87 % 128;
                int i88 = i87 % 2;
                int i89 = i85 & 29;
                int i90 = ((((i85 ^ 29) | i89) << 1) - (~(-((i85 | 29) & (~i89))))) - 1;
                f62205c = i90 % 128;
                int i91 = i90 % 2;
            }
            int i92 = f62206d;
            int i93 = i92 & 27;
            int i94 = ((i92 | 27) & (~i93)) + (i93 << 1);
            f62205c = i94 % 128;
            if (i94 % 2 == 0) {
                int i710 = f62206d;
                int i711 = i710 & 71;
                int i712 = -(-((i710 ^ 71) | i711));
                int i713 = ((i711 | i712) << 1) - (i712 ^ i711);
                f62205c = i713 % 128;
                int i714 = i713 % 2;
            } else {
                if (cCharAt == ' ') {
                    int i715 = f62205c;
                    int i810 = ((i715 | 7) << 1) - (i715 ^ 7);
                    f62206d = i810 % 128;
                    int i811 = i810 % 2;
                    int i812 = ((i715 ^ 32) + ((i715 & 32) << 1)) - 1;
                    f62206d = i812 % 128;
                    int i813 = i812 % 2;
                    i11 = i715 + 1;
                    f62206d = i11 % 128;
                    if (i11 % 2 == 0) {
                        return Integer.valueOf(iIntValue2);
                    }
                    int i814 = 67 / 0;
                    return Integer.valueOf(iIntValue2);
                }
                int i815 = f62206d;
                int i816 = i815 ^ 71;
                int i817 = (((i815 & 71) | i816) << 1) - i816;
                f62205c = i817 % 128;
                int i818 = i817 % 2;
                int i819 = i815 & 29;
                int i95 = ((((i815 ^ 29) | i819) << 1) - (~(-((i815 | 29) & (~i819))))) - 1;
                f62205c = i95 % 128;
                int i96 = i95 % 2;
            }
        }
        int i97 = f62205c;
        int i98 = (i97 ^ 21) + ((i97 & 21) << 1);
        f62206d = i98 % 128;
        int i99 = i98 % 2;
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x013e  */
    /* JADX WARN: Code duplicated, block: B:34:0x01e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x02ae  */
    public static /* synthetic */ Integer s(Object[] objArr) {
        boolean z10;
        int i10;
        int i11;
        char cCharValue = ((Character) objArr[0]).charValue();
        int i12 = f62206d;
        int i13 = (i12 & 75) + (i12 | 75);
        int i14 = i13 % 128;
        f62205c = i14;
        if (i13 % 2 == 0 ? '0' > cCharValue : 'i' > cCharValue) {
            int i15 = i12 + 3;
            f62205c = i15 % 128;
            int i16 = i15 % 2;
        } else {
            int i17 = ((i14 ^ 29) | (i14 & 29)) << 1;
            int i18 = -((i14 & (-30)) | ((~i14) & 29));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            f62206d = i19 % 128;
            int i20 = i19 % 2;
            if (cCharValue < ':') {
                int i21 = i14 + 75;
                f62206d = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = ((i14 ^ 120) + ((i14 & 120) << 1)) - 1;
                    f62206d = i22 % 128;
                    int i23 = i22 % 2;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i24 = cCharValue * 471;
                    int i25 = ((-22608) & i24) + (i24 | (-22608));
                    int i26 = ~cCharValue;
                    int i27 = ((-48) & i26) | (cCharValue & JsonPointer.SEPARATOR);
                    int i28 = (-48) & cCharValue;
                    int i29 = (((i27 & i28) | (i27 ^ i28)) * (-470)) + i25;
                    int i30 = (i26 | cCharValue) & i26;
                    int i31 = i30 & (-48);
                    int i32 = ~(((~i30) & 47) | i31 | (47 & i30));
                    int i33 = i26 & iCurrentTimeMillis;
                    int i34 = (i26 | iCurrentTimeMillis) & (~i33);
                    int i35 = (~((i34 & i33) | (i34 ^ i33))) | i32;
                    int i36 = ~iCurrentTimeMillis;
                    int i37 = (i36 ^ (-48)) | (i36 & (-48));
                    int i38 = ~((cCharValue & i37) | (i37 ^ cCharValue));
                    int i39 = i35 & i38;
                    int i40 = (((i35 | i38) & (~i39)) | i39) * (-470);
                    int i41 = i29 ^ i40;
                    int i42 = ((((i40 & i29) | i41) << 1) - (~(-i41))) - 1;
                    int i43 = (((-48) | i30) & (~i31)) | i31;
                    int i44 = (i43 & i36) | ((~i43) & iCurrentTimeMillis);
                    int i45 = iCurrentTimeMillis & i43;
                    int i46 = ~((i45 & i44) | (i44 ^ i45));
                    int i47 = -(-(((i38 & i46) | (i46 ^ i38)) * 470));
                    int i48 = i42 & i47;
                    int i49 = (i48 - (~(-(-((i47 ^ i42) | i48))))) - 1;
                    int i50 = f62205c;
                    int i51 = i50 & 29;
                    int i52 = i51 + ((i50 ^ 29) | i51);
                    f62206d = i52 % 128;
                    if (i52 % 2 != 0) {
                        return Integer.valueOf(i49);
                    }
                    throw null;
                }
            } else {
                int i53 = i14 & 53;
                int i54 = (i14 ^ 53) | i53;
                int i55 = (i53 & i54) + (i53 | i54);
                f62206d = i55 % 128;
                int i56 = i55 % 2;
            }
        }
        if ('a' <= cCharValue) {
            int i57 = f62205c;
            int i58 = ((i57 | 45) << 1) - (i57 ^ 45);
            f62206d = i58 % 128;
            int i59 = i58 % 2;
            if (cCharValue < 'g') {
                int i60 = i57 & 97;
                int i61 = i60 + ((97 ^ i57) | i60);
                f62206d = i61 % 128;
                int i62 = i61 % 2;
                z10 = true;
            } else {
                int i63 = i57 & 103;
                int i64 = ((((i57 ^ 103) | i63) << 1) - (~(-((i57 | 103) & (~i63))))) - 1;
                f62206d = i64 % 128;
                int i65 = i64 % 2;
            }
            if (!z10) {
                int i66 = f62206d;
                int i67 = i66 | 21;
                int i68 = i67 << 1;
                int i69 = -((~(i66 & 21)) & i67);
                int i70 = (i68 & i69) + (i69 | i68);
                f62205c = i70 % 128;
                int i71 = i70 % 2;
                int i72 = ((cCharValue & (-96)) + (cCharValue | (-96))) - 1;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i73 = i72 * 185;
                int i74 = ((~i73) & (-1830)) | (i73 & 1829);
                int i75 = (i73 & (-1830)) << 1;
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                int i77 = ((i72 ^ (-11)) | (i72 & (-11))) * (-368);
                int i78 = ((((i76 ^ i77) | (i76 & i77)) << 1) - (~(-((i77 & (~i76)) | ((~i77) & i76))))) - 1;
                int i79 = ~i72;
                int i80 = (i79 | i72) & i79;
                int i81 = (i80 & 10) | (i80 ^ 10);
                int i82 = ~iCurrentTimeMillis2;
                int i83 = i81 & i82;
                int i84 = (i81 | i82) & (~i83);
                int i85 = -(-(((i84 & i83) | (i84 ^ i83)) * 184));
                int i86 = i78 & i85;
                int i87 = (i78 | i85) & (~i86);
                int i88 = i86 << 1;
                int i89 = (i79 & (-11)) | ((-11) ^ i79);
                int i90 = ~i89;
                int i91 = (i89 | i90) & i90;
                int i92 = (i82 & (-11)) | ((~i82) & 10);
                int i93 = i82 & 10;
                int i94 = (i93 & i92) | (i92 ^ i93);
                int i95 = ~i94;
                int i96 = (i94 | i95) & i95;
                int i97 = (i96 & i91) | (i91 ^ i96);
                int i98 = ~((i72 & 10) | (i72 ^ 10));
                int i99 = (((i87 ^ i88) + ((i87 & i88) << 1)) - (~(-(-(((i97 & i98) | (i97 ^ i98)) * 184))))) - 1;
                int i100 = f62206d;
                int i101 = ((i100 | 65) << 1) - (i100 ^ 65);
                f62205c = i101 % 128;
                int i102 = i101 % 2;
                return Integer.valueOf(i99);
            }
            if ('A' <= cCharValue) {
                int i103 = f62205c;
                int i104 = i103 & 45;
                i10 = ((i103 | 45) & (~i104)) + (i104 << 1);
                i11 = i10 % 128;
                f62206d = i11;
                if (i10 % 2 == 0 ? cCharValue < 'G' : cCharValue < 'y') {
                    int i105 = i11 & 95;
                    int i106 = (i105 - (~(-(-((i11 ^ 95) | i105))))) - 1;
                    int i107 = i106 % 128;
                    f62205c = i107;
                    int i108 = i106 % 2;
                    int i109 = i107 + 103;
                    f62206d = i109 % 128;
                    int i110 = i109 % 2;
                    int i111 = cCharValue - '@';
                    int i112 = (i111 ^ (-1)) + (i111 << 1);
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i113 = 3669 - (~(-(-(i112 * 367))));
                    int i114 = ~i112;
                    int i115 = i114 & 10;
                    int i116 = i112 & (-11);
                    int i117 = i115 | i116;
                    int i118 = i112 & 10;
                    int i119 = ((i117 & i118) | (i117 ^ i118)) * (-366);
                    int i120 = (((~i119) & i113) | ((~i113) & i119)) + ((i113 & i119) << 1);
                    int i121 = i114 & iCurrentTimeMillis3;
                    int i122 = (~i121) & (i114 | iCurrentTimeMillis3);
                    int i123 = (i121 & i122) | (i122 ^ i121);
                    int i124 = ~i123;
                    int i125 = (i123 | i124) & i124;
                    int i126 = ((i125 & 10) | (i125 ^ 10)) * (-366);
                    int i127 = i120 | i126;
                    int i128 = ((i127 << 1) - (~(-((~(i126 & i120)) & i127)))) - 1;
                    int i129 = i118 | ((-11) & i114);
                    int i130 = ~((i129 & i116) | (i129 ^ i116));
                    int i131 = ((~i115) & (i114 | 10)) | i115;
                    int i132 = i131 & iCurrentTimeMillis3;
                    int i133 = ~(((iCurrentTimeMillis3 | i131) & (~i132)) | i132);
                    int i134 = i130 ^ i133;
                    int i135 = i133 & i130;
                    int i136 = ((i135 & i134) | (i134 ^ i135)) * 366;
                    int i137 = i128 & i136;
                    int i138 = ((i136 | i128) & (~i137)) + (i137 << 1);
                    int i139 = f62205c;
                    int i140 = (((i139 ^ 49) | (i139 & 49)) << 1) - (((~i139) & 49) | (i139 & (-50)));
                    f62206d = i140 % 128;
                    if (i140 % 2 != 0) {
                        return Integer.valueOf(i138);
                    }
                    int i141 = 2 / 0;
                    return Integer.valueOf(i138);
                }
                int i142 = (i11 ^ 93) + ((i11 & 93) << 1);
                f62205c = i142 % 128;
                int i143 = i142 % 2;
            } else {
                int i144 = f62206d;
                int i145 = (i144 ^ 39) + ((i144 & 39) << 1);
                f62205c = i145 % 128;
                int i146 = i145 % 2;
            }
            int i147 = f62206d + 34;
            int i148 = (i147 ^ (-1)) + (i147 << 1);
            f62205c = i148 % 128;
            int i149 = i148 % 2;
            return -1;
        }
        int i150 = f62205c;
        int i151 = i150 & 17;
        int i152 = (i151 - (~((i150 ^ 17) | i151))) - 1;
        f62206d = i152 % 128;
        int i153 = i152 % 2;
        z10 = false;
        if (!z10) {
            if ('A' <= cCharValue) {
                int i1010 = f62205c;
                int i1011 = i1010 & 45;
                i10 = ((i1010 | 45) & (~i1011)) + (i1011 << 1);
                i11 = i10 % 128;
                f62206d = i11;
                if (i10 % 2 == 0) {
                    int i1410 = (i11 ^ 93) + ((i11 & 93) << 1);
                    f62205c = i1410 % 128;
                    int i1411 = i1410 % 2;
                } else {
                    int i1412 = (i11 ^ 93) + ((i11 & 93) << 1);
                    f62205c = i1412 % 128;
                    int i1413 = i1412 % 2;
                }
            } else {
                int i1414 = f62206d;
                int i1415 = (i1414 ^ 39) + ((i1414 & 39) << 1);
                f62205c = i1415 % 128;
                int i1416 = i1415 % 2;
            }
            int i1417 = f62206d + 34;
            int i1418 = (i1417 ^ (-1)) + (i1417 << 1);
            f62205c = i1418 % 128;
            int i1419 = i1418 % 2;
            return -1;
        }
        int i610 = f62206d;
        int i611 = i610 | 21;
        int i612 = i611 << 1;
        int i613 = -((~(i610 & 21)) & i611);
        int i710 = (i612 & i613) + (i613 | i612);
        f62205c = i710 % 128;
        int i711 = i710 % 2;
        int i712 = ((cCharValue & (-96)) + (cCharValue | (-96))) - 1;
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i713 = i712 * 185;
        int i714 = ((~i713) & (-1830)) | (i713 & 1829);
        int i715 = (i713 & (-1830)) << 1;
        int i716 = ((i714 | i715) << 1) - (i715 ^ i714);
        int i717 = ((i712 ^ (-11)) | (i712 & (-11))) * (-368);
        int i718 = ((((i716 ^ i717) | (i716 & i717)) << 1) - (~(-((i717 & (~i716)) | ((~i717) & i716))))) - 1;
        int i719 = ~i712;
        int i810 = (i719 | i712) & i719;
        int i811 = (i810 & 10) | (i810 ^ 10);
        int i812 = ~iCurrentTimeMillis4;
        int i813 = i811 & i812;
        int i814 = (i811 | i812) & (~i813);
        int i815 = -(-(((i814 & i813) | (i814 ^ i813)) * 184));
        int i816 = i718 & i815;
        int i817 = (i718 | i815) & (~i816);
        int i818 = i816 << 1;
        int i819 = (i719 & (-11)) | ((-11) ^ i719);
        int i910 = ~i819;
        int i911 = (i819 | i910) & i910;
        int i912 = (i812 & (-11)) | ((~i812) & 10);
        int i913 = i812 & 10;
        int i914 = (i913 & i912) | (i912 ^ i913);
        int i915 = ~i914;
        int i916 = (i914 | i915) & i915;
        int i917 = (i916 & i911) | (i911 ^ i916);
        int i918 = ~((i712 & 10) | (i712 ^ 10));
        int i919 = (((i817 ^ i818) + ((i817 & i818) << 1)) - (~(-(-(((i917 & i918) | (i917 ^ i918)) * 184))))) - 1;
        int i1012 = f62206d;
        int i1013 = ((i1012 | 65) << 1) - (i1012 ^ 65);
        f62205c = i1013 % 128;
        int i1014 = i1013 % 2;
        return Integer.valueOf(i919);
    }

    @NotNull
    public static final Throwable setCompoundDrawableTintBlendMode(@NotNull Exception exc, @NotNull List<? extends Exception> list) {
        return (Throwable) setY(new Object[]{exc, list}, 1706771325, -1706771284, (int) System.currentTimeMillis());
    }

    public static final <E> void setDividerPadding(@NotNull List<E> list, E e5) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{list, e5}, 1001339044, -1001339044, (int) System.currentTimeMillis());
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> setOnFocusChangeListener(@NotNull T... tArr) {
        return (List) setY(new Object[]{tArr}, -91536887, 91536895, (int) System.currentTimeMillis());
    }

    public static final void setX(@NotNull Socket socket) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{socket}, 1115286278, -1115286261, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0135  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        Object y7;
        Object obj;
        int i13;
        int i14;
        String[] strArr;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~i12;
        int iValueOf = -1;
        switch ((((~(i10 | i11)) | (~(i15 | i17))) * 564) + ((~(i12 | i15 | i11)) * 1128) + (((~(i16 | i17)) | i15 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563))) {
            case 1:
                aby abyVar = (aby) objArr[0];
                int i18 = f62205c;
                int i19 = i18 & 63;
                int i20 = -(-((i18 ^ 63) | i19));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f62206d = i21 % 128;
                int i22 = i21 % 2;
                Intrinsics.checkNotNullParameter(abyVar, "");
                int iIntValue = ((Integer) setY(new Object[]{Byte.valueOf(abyVar.getNavBarTitleString())}, 572946270, -572946224, (int) System.currentTimeMillis())).intValue() << 16;
                int iIntValue2 = ((Integer) setY(new Object[]{Byte.valueOf(abyVar.getNavBarTitleString())}, 572946270, -572946224, (int) System.currentTimeMillis())).intValue() << 8;
                int i23 = (iIntValue & iIntValue2) | (iIntValue ^ iIntValue2);
                int iIntValue3 = ((Integer) setY(new Object[]{Byte.valueOf(abyVar.getNavBarTitleString())}, 572946270, -572946224, (int) System.currentTimeMillis())).intValue();
                int i24 = (iIntValue3 & i23) | ((~iIntValue3) & i23) | ((~i23) & iIntValue3);
                int i25 = f62205c + 119;
                f62206d = i25 % 128;
                int i26 = i25 % 2;
                return Integer.valueOf(i24);
            case 2:
                return D(objArr);
            case 3:
                return E(objArr);
            case 4:
                String str = (String) objArr[0];
                int i27 = f62206d + 41;
                f62205c = i27 % 128;
                return Integer.valueOf(((Integer) (i27 % 2 != 0 ? setY(new Object[]{str, 1, Integer.valueOf(str.length())}, -1390836990, 1390837019, 1) : setY(new Object[]{str, 0, Integer.valueOf(str.length())}, -1390836990, 1390837019, 0))).intValue());
            case 5:
                return k(objArr);
            case 6:
                yg ygVar = (yg) objArr[0];
                int i28 = f62206d;
                int i29 = (((i28 | 14) << 1) - (i28 ^ 14)) - 1;
                f62205c = i29 % 128;
                Object[] objArr2 = new Object[2];
                if (i29 % 2 != 0) {
                    objArr2[0] = ygVar;
                    objArr2[1] = Boolean.TRUE;
                    y7 = setY(objArr2, -1801936244, 1801936283, (int) System.currentTimeMillis());
                } else {
                    objArr2[0] = ygVar;
                    objArr2[1] = Boolean.FALSE;
                    y7 = setY(objArr2, -1801936244, 1801936283, (int) System.currentTimeMillis());
                }
                obj = (String) y7;
                break;
            case 7:
                u(objArr);
                return null;
            case 8:
                Object[] objArr3 = (Object[]) objArr[0];
                int i30 = f62206d;
                int i31 = (i30 & (-22)) | ((~i30) & 21);
                int i32 = -(-((i30 & 21) << 1));
                int i33 = (i31 & i32) + (i32 | i31);
                f62205c = i33 % 128;
                int i34 = i33 % 2;
                Intrinsics.checkNotNullParameter(objArr3, "");
                Object[] objArr4 = (Object[]) objArr3.clone();
                List listUnmodifiableList = Collections.unmodifiableList(CollectionsKt__CollectionsKt.listOf(Arrays.copyOf(objArr4, objArr4.length)));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
                int i35 = f62206d;
                int i36 = i35 & 105;
                int i37 = (i35 | 105) & (~i36);
                int i38 = -(-(i36 << 1));
                int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
                f62205c = i39 % 128;
                int i40 = i39 % 2;
                return listUnmodifiableList;
            case 9:
                String str2 = (String) objArr[0];
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int i41 = f62206d;
                int i42 = ((i41 | 39) << 1) - (i41 ^ 39);
                f62205c = i42 % 128;
                int i43 = i42 % 2;
                String str3 = (String) setY(new Object[]{str2, 0, Integer.valueOf(iIntValue4)}, -68115487, 68115525, 0);
                int i44 = f62206d;
                int i45 = i44 & 49;
                int i46 = i45 + ((i44 ^ 49) | i45);
                f62205c = i46 % 128;
                int i47 = i46 % 2;
                return str3;
            case 10:
                yd ydVar = (yd) objArr[0];
                xp xpVar = (xp) objArr[1];
                int i48 = f62206d;
                int i49 = i48 & 105;
                int i50 = (i48 ^ 105) | i49;
                int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
                f62205c = i51 % 128;
                int i52 = i51 % 2;
                Intrinsics.checkNotNullParameter(ydVar, "");
                Intrinsics.checkNotNullParameter(xpVar, "");
                int i53 = f62205c + 113;
                f62206d = i53 % 128;
                int i54 = i53 % 2;
                return ydVar;
            case 11:
                return p(objArr);
            case 12:
                return w(objArr);
            case 13:
                return t(objArr);
            case 14:
                int iIntValue5 = ((Number) objArr[0]).intValue();
                int i55 = f62206d + 123;
                f62205c = i55 % 128;
                return Long.valueOf(i55 % 2 != 0 ? ((long) iIntValue5) % 2147483647L : ((long) iIntValue5) & 2147483647L);
            case 15:
                return c(objArr);
            case 16:
                final yd ydVar2 = (yd) objArr[0];
                int i56 = f62206d;
                int i57 = i56 & 99;
                int i58 = (i56 | 99) & (~i57);
                int i59 = -(-(i57 << 1));
                int i60 = (i58 & i59) + (i58 | i59);
                f62205c = i60 % 128;
                int i61 = i60 % 2;
                Intrinsics.checkNotNullParameter(ydVar2, "");
                yd.setX setx = new yd.setX() { // from class: com.mypinpad.tsdk.i.f10
                    @Override // com.mypinpad.tsdk.i.yd.setX
                    public final yd create(xp xpVar2) {
                        byte[] bArr = yt.setX;
                        return (yd) yt.setY(new Object[]{ydVar2, xpVar2}, 458574110, -458574100, (int) System.currentTimeMillis());
                    }
                };
                int i62 = f62206d;
                int i63 = (i62 ^ 29) + ((i62 & 29) << 1);
                f62205c = i63 % 128;
                int i64 = i63 % 2;
                return setx;
            case 17:
                z(objArr);
                return null;
            case 18:
                return g(objArr);
            case 19:
                return b(objArr);
            case 20:
                return o(objArr);
            case 21:
                return F(objArr);
            case 22:
                return v(objArr);
            case 23:
                List list = (List) objArr[0];
                int i65 = f62206d + 31;
                f62205c = i65 % 128;
                if (i65 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullExpressionValue(Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) list)), "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(list, "");
                List listUnmodifiableList2 = Collections.unmodifiableList(CollectionsKt___CollectionsKt.toMutableList((Collection) list));
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList2, "");
                return listUnmodifiableList2;
            case 24:
                return j(objArr);
            case 25:
                return A(objArr);
            case 26:
                return i(objArr);
            case 27:
                return q(objArr);
            case 28:
                return d(objArr);
            case 29:
                return r(objArr);
            case 30:
                return n(objArr);
            case 31:
                return s(objArr);
            case 32:
                return l(objArr);
            case 33:
                abv abvVar = (abv) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int i66 = f62206d;
                int i67 = ((i66 ^ 99) | (i66 & 99)) << 1;
                int i68 = -(((~i66) & 99) | (i66 & (-100)));
                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                f62205c = i69 % 128;
                if (i69 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(abvVar, "");
                    abvVar.setLayoutAnimation((iIntValue6 / 125) & 21626);
                    abvVar.setLayoutAnimation((iIntValue6 >>> 74) & 15610);
                    i13 = iIntValue6 & 3558;
                } else {
                    Intrinsics.checkNotNullParameter(abvVar, "");
                    abvVar.setLayoutAnimation((iIntValue6 >>> 16) & 255);
                    abvVar.setLayoutAnimation((iIntValue6 >>> 8) & 255);
                    i13 = iIntValue6 & 255;
                }
                abvVar.setLayoutAnimation(i13);
                return null;
            case 34:
                return B(objArr);
            case 35:
                return C(objArr);
            case 36:
                return a(objArr);
            case 37:
                List<aab> list2 = (List) objArr[0];
                Intrinsics.checkNotNullParameter(list2, "");
                ye.setOnFocusChangeListener setonfocuschangelistener = new ye.setOnFocusChangeListener();
                int i70 = f62206d;
                int i71 = (i70 & 73) + (i70 | 73);
                f62205c = i71 % 128;
                int i72 = i71 % 2;
                for (aab aabVar : list2) {
                    int i73 = f62206d;
                    int i74 = i73 ^ 71;
                    int i75 = ((((i73 & 71) | i74) << 1) - (~(-i74))) - 1;
                    f62205c = i75 % 128;
                    int i76 = i75 % 2;
                    abw abwVar = (abw) aab.setOnFocusChangeListener(new Object[]{aabVar}, 947465407, -947465407, System.identityHashCode(aabVar));
                    abw abwVar2 = (abw) aab.setOnFocusChangeListener(new Object[]{aabVar}, -1010199198, 1010199200, System.identityHashCode(aabVar));
                    int i77 = f62206d + 91;
                    f62205c = i77 % 128;
                    int i78 = i77 % 2;
                }
                ye yeVar = (ye) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1008790874, 1008790879, System.identityHashCode(setonfocuschangelistener));
                int i79 = f62205c;
                int i80 = i79 & 45;
                int i81 = -(-(i79 | 45));
                int i82 = ((i80 | i81) << 1) - (i81 ^ i80);
                f62206d = i82 % 128;
                int i83 = i82 % 2;
                return yeVar;
            case 38:
                return e(objArr);
            case 39:
                return f(objArr);
            case 40:
                return x(objArr);
            case 41:
                return m(objArr);
            case 42:
                return h(objArr);
            case 43:
                return y(objArr);
            case 44:
                long jLongValue = ((Number) objArr[0]).longValue();
                long jLongValue2 = ((Number) objArr[1]).longValue();
                long jLongValue3 = ((Number) objArr[2]).longValue();
                int i84 = f62205c;
                int i85 = ((i84 ^ 68) + ((i84 & 68) << 1)) - 1;
                int i86 = i85 % 128;
                f62206d = i86;
                if (i85 % 2 != 0 ? (jLongValue2 | jLongValue3) >= 0 : (jLongValue2 ^ jLongValue3) >= 1) {
                    int i87 = ((i86 ^ 106) + ((i86 & 106) << 1)) - 1;
                    f62205c = i87 % 128;
                    int i88 = i87 % 2;
                    if (jLongValue2 <= jLongValue) {
                        int i89 = (i86 ^ 20) + ((i86 & 20) << 1);
                        int i90 = (i89 ^ (-1)) + (i89 << 1);
                        int i91 = i90 % 128;
                        f62205c = i91;
                        int i92 = i90 % 2;
                        if (jLongValue - jLongValue2 >= jLongValue3) {
                            int i93 = i91 ^ 111;
                            int i94 = ((i91 & 111) | i93) << 1;
                            int i95 = -i93;
                            int i96 = (i94 & i95) + (i95 | i94);
                            f62206d = i96 % 128;
                            if (i96 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            case 45:
                String str4 = (String) objArr[0];
                int i97 = f62205c;
                int i98 = ((i97 & 122) + (i97 | 122)) - 1;
                f62206d = i98 % 128;
                int i99 = i98 % 2;
                Intrinsics.checkNotNullParameter(str4, "");
                int length = str4.length();
                int i100 = f62205c + 21;
                f62206d = i100 % 128;
                int i101 = i100 % 2;
                int i102 = 0;
                while (true) {
                    if (i102 < length) {
                        int i103 = f62205c;
                        int i104 = i103 & 89;
                        int i105 = -(-(i103 | 89));
                        int i106 = (i104 & i105) + (i105 | i104);
                        f62206d = i106 % 128;
                        int i107 = i106 % 2;
                        int i108 = i102 & (-64);
                        int i109 = -(-((i102 ^ (-64)) | i108));
                        int i110 = (i108 ^ i109) + ((i108 & i109) << 1) + 65;
                        char cCharAt = str4.charAt(i102);
                        if (Intrinsics.compare((int) cCharAt, 31) > 0) {
                            int i111 = f62205c + 23;
                            f62206d = i111 % 128;
                            int i112 = i111 % 2;
                            if (Intrinsics.compare((int) cCharAt, 127) < 0) {
                                i102 = i110;
                            }
                        }
                    } else {
                        int i113 = f62206d;
                        int i114 = (i113 & 101) + (i113 | 101);
                        f62205c = i114 % 128;
                        if (i114 % 2 != 0) {
                            int i115 = 2 / 0;
                        }
                    }
                    return iValueOf;
                }
                int i116 = f62205c;
                int i117 = ((i116 | 93) << 1) - (i116 ^ 93);
                f62206d = i117 % 128;
                if (i117 % 2 == 0) {
                    throw null;
                }
                iValueOf = Integer.valueOf(i102);
                return iValueOf;
            case 46:
                byte bByteValue = ((Byte) objArr[0]).byteValue();
                int i118 = f62205c;
                int i119 = ((i118 | 48) << 1) - (i118 ^ 48);
                int i120 = (i119 ^ (-1)) + (i119 << 1);
                f62206d = i120 % 128;
                int i121 = i120 % 2 == 0 ? bByteValue & 27545 : bByteValue & 255;
                int i122 = i118 + 101;
                f62206d = i122 % 128;
                if (i122 % 2 != 0) {
                    return Integer.valueOf(i121);
                }
                throw null;
            case 47:
                String str5 = (String) objArr[0];
                int i123 = f62206d;
                int i124 = i123 & 91;
                int i125 = (((i123 | 91) & (~i124)) - (~(i124 << 1))) - 1;
                f62205c = i125 % 128;
                if (i125 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str5, "");
                    if (!l.equals(str5, "Authorization", false)) {
                        if (!l.equals(str5, "Cookie", true)) {
                            int i126 = f62206d;
                            i14 = (i126 ^ 25) + ((i126 & 25) << 1);
                            f62205c = i14 % 128;
                            if (i14 % 2 != 0 ? !l.equals(str5, "Proxy-Authorization", true) : !l.equals(str5, "Proxy-Authorization", false)) {
                                if (!l.equals(str5, "Set-Cookie", true)) {
                                    int i127 = f62206d;
                                    int i128 = i127 & 61;
                                    int i129 = (i127 ^ 61) | i128;
                                    int i130 = (i128 & i129) + (i129 | i128);
                                    f62205c = i130 % 128;
                                    if (i130 % 2 != 0) {
                                        int i131 = 44 / 0;
                                        obj = Boolean.FALSE;
                                    } else {
                                        obj = Boolean.FALSE;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(str5, "");
                    if (!l.equals(str5, "Authorization", true)) {
                        if (!l.equals(str5, "Cookie", true)) {
                            int i1210 = f62206d;
                            i14 = (i1210 ^ 25) + ((i1210 & 25) << 1);
                            f62205c = i14 % 128;
                            if (i14 % 2 != 0) {
                            }
                        }
                    }
                }
                int i132 = f62206d;
                int i133 = i132 | 119;
                int i134 = (i133 << 1) - ((~(i132 & 119)) & i133);
                f62205c = i134 % 128;
                if (i134 % 2 != 0) {
                    throw null;
                }
                obj = Boolean.TRUE;
                break;
                break;
            case 48:
                String[] strArr2 = (String[]) objArr[0];
                String str6 = (String) objArr[1];
                int i135 = f62205c;
                int i136 = i135 & 91;
                int i137 = ((i135 ^ 91) | i136) << 1;
                int i138 = -((i135 | 91) & (~i136));
                int i139 = (i137 & i138) + (i138 | i137);
                f62206d = i139 % 128;
                if (i139 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(strArr2, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Object[] objArrCopyOf = Arrays.copyOf(strArr2, strArr2.length);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    strArr = (String[]) objArrCopyOf;
                    strArr[ArraysKt___ArraysKt.getLastIndex(strArr)] = str6;
                } else {
                    Intrinsics.checkNotNullParameter(strArr2, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Object[] objArrCopyOf2 = Arrays.copyOf(strArr2, strArr2.length - (-1));
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
                    strArr = (String[]) objArrCopyOf2;
                    strArr[ArraysKt___ArraysKt.getLastIndex(strArr)] = str6;
                }
                String[] strArr3 = strArr;
                int i140 = f62206d;
                int i141 = (i140 & (-32)) | ((~i140) & 31);
                int i142 = -(-((i140 & 31) << 1));
                int i143 = ((i141 | i142) << 1) - (i142 ^ i141);
                f62205c = i143 % 128;
                if (i143 % 2 == 0) {
                    return strArr3;
                }
                int i144 = 32 / 0;
                return strArr3;
            default:
                List list3 = (List) objArr[0];
                Object obj2 = objArr[1];
                int i145 = f62205c;
                int i146 = (i145 ^ 93) + ((i145 & 93) << 1);
                f62206d = i146 % 128;
                if (i146 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(list3, "");
                    list3.contains(obj2);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(list3, "");
                if (!list3.contains(obj2)) {
                    int i147 = f62206d;
                    int i148 = i147 & 93;
                    int i149 = -(-(i147 | 93));
                    int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                    f62205c = i150 % 128;
                    if (i150 % 2 != 0) {
                        list3.add(obj2);
                        throw null;
                    }
                    list3.add(obj2);
                }
                int i151 = f62205c + 116;
                int i152 = (i151 ^ (-1)) + (i151 << 1);
                f62206d = i152 % 128;
                if (i152 % 2 != 0) {
                    return null;
                }
                int i153 = 43 / 0;
                return null;
        }
        return obj;
    }

    public static /* synthetic */ Object t(Object[] objArr) {
        String str;
        int i10;
        int length;
        int i11;
        String[] strArr = (String[]) objArr[0];
        String[] strArr2 = (String[]) objArr[1];
        Comparator comparator = (Comparator) objArr[2];
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        ArrayList arrayList = new ArrayList();
        int length2 = strArr.length;
        int i12 = f62206d;
        int i13 = i12 & 3;
        int i14 = (i12 | 3) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        f62205c = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < length2) {
            int i19 = f62206d;
            int i20 = i19 & 31;
            int i21 = (((i19 ^ 31) | i20) << 1) - ((i19 | 31) & (~i20));
            int i22 = i21 % 128;
            f62205c = i22;
            if (i21 % 2 != 0) {
                str = strArr[i18];
                int i23 = i18 & (-46);
                int i24 = (i18 | (-46)) & (~i23);
                int i25 = -(-(i23 << 1));
                int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
                int i27 = i26 ^ 126;
                int i28 = (i26 & 126) << 1;
                i10 = (i27 ^ i28) + ((i27 & i28) << 1);
                length = strArr2.length;
                i11 = 1;
            } else {
                str = strArr[i18];
                int i29 = i18 & (-19);
                int i30 = (i18 ^ (-19)) | i29;
                int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
                int i32 = i31 & 20;
                i10 = (i32 - (~((i31 ^ 20) | i32))) - 1;
                length = strArr2.length;
                i11 = 0;
            }
            int i33 = i22 + 22;
            int i34 = (i33 ^ (-1)) + (i33 << 1);
            f62206d = i34 % 128;
            int i35 = i34 % 2;
            while (i11 < length) {
                int i36 = f62206d;
                int i37 = i36 & 43;
                int i38 = i36 | 43;
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                f62205c = i39 % 128;
                int i40 = i39 % 2;
                String str2 = strArr2[i11];
                int i41 = i11 & 3;
                int i42 = -(-((i11 ^ 3) | i41));
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                int i44 = i43 & (-2);
                i11 = (i44 << 1) + ((~i44) & (i43 | (-2)));
                if (comparator.compare(str, str2) == 0) {
                    int i45 = f62205c;
                    int i46 = (i45 & (-42)) | ((~i45) & 41);
                    int i47 = -(-((i45 & 41) << 1));
                    int i48 = (i46 & i47) + (i47 | i46);
                    f62206d = i48 % 128;
                    if (i48 % 2 != 0) {
                        arrayList.add(str);
                        break;
                    }
                    arrayList.add(str);
                    throw null;
                }
            }
            i18 = i10;
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr3 = (String[]) array;
        int i49 = f62205c;
        int i50 = (i49 & 107) + (i49 | 107);
        f62206d = i50 % 128;
        int i51 = i50 % 2;
        return strArr3;
    }

    public static /* synthetic */ void u(Object[] objArr) {
        Closeable closeable = (Closeable) objArr[0];
        int i10 = f62205c;
        int i11 = ((i10 & 72) + (i10 | 72)) - 1;
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(closeable, "");
        try {
            closeable.close();
            System.currentTimeMillis();
            System.currentTimeMillis();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Integer v(Object[] objArr) {
        Long lValueOf;
        String str = (String) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f62206d;
        int i11 = ((i10 & 108) + (i10 | 108)) - 1;
        f62205c = i11 % 128;
        int i12 = i11 % 2;
        if (str == null) {
            int i13 = (i10 & 15) + (i10 | 15);
            f62205c = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(str));
                int i14 = f62206d;
                int i15 = (((i14 ^ 19) | (i14 & 19)) << 1) - (((~i14) & 19) | (i14 & (-20)));
                f62205c = i15 % 128;
                int i16 = i15 % 2;
            } catch (NumberFormatException unused) {
                return Integer.valueOf(iIntValue);
            }
        }
        if (lValueOf == null) {
            int i17 = f62205c;
            int i18 = ((i17 | 15) << 1) - (i17 ^ 15);
            int i19 = i18 % 128;
            f62206d = i19;
            int i20 = i18 % 2;
            int i21 = i19 & 17;
            int i22 = -(-((i19 ^ 17) | i21));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f62205c = i23 % 128;
            if (i23 % 2 == 0) {
                return Integer.valueOf(iIntValue);
            }
            int i24 = 38 / 0;
            return Integer.valueOf(iIntValue);
        }
        long jLongValue = lValueOf.longValue();
        if (jLongValue > 2147483647L) {
            int i25 = f62205c;
            int i26 = ((i25 ^ 120) + ((i25 & 120) << 1)) - 1;
            int i27 = i26 % 128;
            f62206d = i27;
            int i28 = i26 % 2;
            int i29 = i27 & 7;
            int i30 = i27 | 7;
            int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
            f62205c = i31 % 128;
            int i32 = i31 % 2;
            return Integer.MAX_VALUE;
        }
        if (jLongValue >= 0) {
            int i33 = f62206d;
            int i34 = i33 & 69;
            int i35 = (((i33 ^ 69) | i34) << 1) - ((i33 | 69) & (~i34));
            f62205c = i35 % 128;
            int i36 = i35 % 2;
            return Integer.valueOf((int) jLongValue);
        }
        int i37 = f62206d;
        int i38 = ((((i37 ^ 47) | (i37 & 47)) << 1) - (~(-((i37 & (-48)) | ((~i37) & 47))))) - 1;
        f62205c = i38 % 128;
        int i39 = i38 % 2 != 0 ? 1 : 0;
        int i40 = ((i37 | 39) << 1) - (i37 ^ 39);
        f62205c = i40 % 128;
        if (i40 % 2 == 0) {
            return Integer.valueOf(i39);
        }
        throw null;
    }

    public static /* synthetic */ Long w(Object[] objArr) {
        long j10;
        String str = (String) objArr[0];
        int i10 = f62205c;
        int i11 = i10 | 7;
        int i12 = i11 << 1;
        int i13 = -((~(i10 & 7)) & i11);
        int i14 = (i12 & i13) + (i13 | i12);
        f62206d = i14 % 128;
        int i15 = i14 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            j10 = Long.parseLong(str);
            int i16 = f62205c;
            int i17 = i16 ^ 85;
            int i18 = ((i16 & 85) | i17) << 1;
            int i19 = -i17;
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            f62206d = i20 % 128;
            int i21 = i20 % 2;
        } catch (NumberFormatException unused) {
            j10 = -1;
        }
        int i22 = f62205c;
        int i23 = (i22 & 55) + (i22 | 55);
        f62206d = i23 % 128;
        if (i23 % 2 != 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0079 A[PHI: r4 r5
      0x0079: PHI (r4v15 int) = (r4v13 int), (r4v26 int) binds: [B:13:0x0077, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r5v11 char) = (r5v10 char), (r5v14 char) binds: [B:13:0x0077, B:9:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0096  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b A[SYNTHETIC] */
    public static /* synthetic */ Integer x(Object[] objArr) {
        int i10;
        char cCharAt;
        int i11;
        int i12;
        String str = (String) objArr[0];
        int i13 = (-2) - ((f62206d + 28) ^ (-1));
        f62205c = i13 % 128;
        if (i13 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str.getClass();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        for (int iIntValue = ((Number) objArr[1]).intValue(); iIntValue < length; iIntValue = i10) {
            int i14 = f62205c;
            int i15 = i14 & 119;
            int i16 = ((i14 ^ 119) | i15) << 1;
            int i17 = -((i14 | 119) & (~i15));
            int i18 = (i16 & i17) + (i17 | i16);
            f62206d = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = iIntValue & 4;
                int i20 = (~i19) & (iIntValue | 4);
                int i21 = -(-(i19 << 1));
                i10 = ((i20 | i21) << 1) - (i21 ^ i20);
                cCharAt = str.charAt(iIntValue);
                if (cCharAt == '=') {
                    continue;
                } else if (cCharAt != '\t') {
                    int i22 = f62206d;
                    int i23 = i22 & 115;
                    int i24 = ((i22 ^ 115) | i23) << 1;
                    int i25 = -((i22 | 115) & (~i23));
                    i11 = (i24 & i25) + (i25 | i24);
                    i12 = i11 % 128;
                    f62205c = i12;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    int i26 = ((i12 | 95) << 1) - (i12 ^ 95);
                    f62206d = i26 % 128;
                    int i27 = i26 % 2;
                    return Integer.valueOf(iIntValue);
                }
            } else {
                int i28 = (((iIntValue & 61) | ((~iIntValue) & (-62))) - (~((iIntValue & (-62)) << 1))) - 1;
                int i29 = i28 & 63;
                i10 = ((i28 | 63) & (~i29)) + (i29 << 1);
                cCharAt = str.charAt(iIntValue);
                if (cCharAt == ' ') {
                    continue;
                } else if (cCharAt != '\t') {
                    int i210 = f62206d;
                    int i211 = i210 & 115;
                    int i212 = ((i210 ^ 115) | i211) << 1;
                    int i213 = -((i210 | 115) & (~i211));
                    i11 = (i212 & i213) + (i213 | i212);
                    i12 = i11 % 128;
                    f62205c = i12;
                    if (i11 % 2 == 0) {
                        throw null;
                    }
                    int i214 = ((i12 | 95) << 1) - (i12 ^ 95);
                    f62206d = i214 % 128;
                    int i215 = i214 % 2;
                    return Integer.valueOf(iIntValue);
                }
            }
        }
        int length2 = str.length();
        int i30 = f62205c;
        int i31 = i30 & 15;
        int i32 = (i30 | 15) & (~i31);
        int i33 = -(-(i31 << 1));
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        f62206d = i34 % 128;
        int i35 = i34 % 2;
        return Integer.valueOf(length2);
    }

    public static /* synthetic */ Charset y(Object[] objArr) throws IOException {
        aby abyVar = (aby) objArr[0];
        Charset charset = (Charset) objArr[1];
        int i10 = f62205c;
        int i11 = ((i10 | 5) << 1) - (i10 ^ 5);
        f62206d = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(abyVar, "");
        Intrinsics.checkNotNullParameter(charset, "");
        int y7 = abyVar.setY(f62203a);
        if (y7 == -1) {
            int i13 = f62205c + 44;
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            f62206d = i14 % 128;
            int i15 = i14 % 2;
            return charset;
        }
        if (y7 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset2, "");
            int i16 = f62205c;
            int i17 = ((((i16 ^ 107) | (i16 & 107)) << 1) - (~(-(((~i16) & 107) | (i16 & (-108)))))) - 1;
            f62206d = i17 % 128;
            if (i17 % 2 != 0) {
                return charset2;
            }
            throw null;
        }
        if (y7 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(charset3, "");
            int i18 = f62205c;
            int i19 = ((i18 | 45) << 1) - (i18 ^ 45);
            f62206d = i19 % 128;
            int i20 = i19 % 2;
            return charset3;
        }
        if (y7 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(charset4, "");
            int i21 = f62206d;
            int i22 = ((i21 | 5) << 1) - (i21 ^ 5);
            f62205c = i22 % 128;
            int i23 = i22 % 2;
            return charset4;
        }
        if (y7 != 3) {
            if (y7 != 4) {
                throw new AssertionError();
            }
            Charset charsetUTF32_LE = Charsets.INSTANCE.UTF32_LE();
            int i24 = f62205c;
            int i25 = (i24 & 11) + (i24 | 11);
            f62206d = i25 % 128;
            int i26 = i25 % 2;
            return charsetUTF32_LE;
        }
        Charset charsetUTF32_BE = Charsets.INSTANCE.UTF32_BE();
        int i27 = f62206d;
        int i28 = i27 & 111;
        int i29 = i28 + ((i27 ^ 111) | i28);
        f62205c = i29 % 128;
        if (i29 % 2 == 0) {
            return charsetUTF32_BE;
        }
        throw null;
    }

    public static /* synthetic */ void z(Object[] objArr) {
        Socket socket = (Socket) objArr[0];
        int i10 = f62205c + 65;
        f62206d = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(socket, "");
        try {
            socket.close();
            int i12 = f62205c;
            int i13 = i12 & 19;
            int i14 = i13 + ((i12 ^ 19) | i13);
            f62206d = i14 % 128;
            int i15 = i14 % 2;
        } catch (AssertionError e5) {
            throw e5;
        } catch (RuntimeException e7) {
            if (!Intrinsics.areEqual(e7.getMessage(), "bio == null")) {
                throw e7;
            }
            int i16 = f62206d;
            int i17 = i16 & 85;
            int i18 = (i17 - (~(-(-((i16 ^ 85) | i17))))) - 1;
            f62205c = i18 % 128;
            int i19 = i18 % 2;
        } catch (Exception unused) {
        }
    }

    public static final long setCompoundDrawableTintBlendMode(@NotNull String str) {
        return ((Long) setY(new Object[]{str}, -814104043, 814104055, (int) System.currentTimeMillis())).longValue();
    }

    public static final void setDividerPadding(@NotNull Closeable closeable) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{closeable}, 1911381155, -1911381148, (int) System.currentTimeMillis());
    }

    public static final int setOnFocusChangeListener(@NotNull String str, int i10) {
        return ((Integer) setY(new Object[]{str, Integer.valueOf(i10)}, 150030434, -150030394, i10)).intValue();
    }

    @NotNull
    public static final <T> List<T> setX(@NotNull List<? extends T> list) {
        return (List) setY(new Object[]{list}, 1581148594, -1581148571, (int) System.currentTimeMillis());
    }

    public static final int setCompoundDrawableTintBlendMode(@NotNull String str, long j10, @Nullable TimeUnit timeUnit) {
        return ((Integer) setY(new Object[]{str, Long.valueOf(j10), timeUnit}, 1300379700, -1300379673, (int) System.currentTimeMillis())).intValue();
    }

    @NotNull
    public static final <K, V> Map<K, V> setDividerPadding(@NotNull Map<K, ? extends V> map) {
        return (Map) setY(new Object[]{map}, 439961630, -439961602, (int) System.currentTimeMillis());
    }

    public static final int setOnFocusChangeListener(@NotNull abx abxVar) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        return ((Integer) setY(new Object[]{abxVar}, 1412459959, -1412459940, (int) System.currentTimeMillis())).intValue();
    }

    public static final long setX(@NotNull yr yrVar) {
        return ((Long) setY(new Object[]{yrVar}, 1573843054, -1573843036, (int) System.currentTimeMillis())).longValue();
    }

    @NotNull
    public static final String setCompoundDrawableTintBlendMode(@NotNull String str, int i10, int i11) {
        return (String) setY(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i11)}, -68115487, 68115525, i10);
    }

    public static final int setDividerPadding(@Nullable String str, int i10) {
        return ((Integer) setY(new Object[]{str, Integer.valueOf(i10)}, -1998824873, 1998824895, i10)).intValue();
    }

    public static final boolean setOnFocusChangeListener(@NotNull yg ygVar, @NotNull yg ygVar2) {
        return ((Boolean) setY(new Object[]{ygVar, ygVar2}, 1284993183, -1284993163, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final boolean setX(@NotNull Socket socket, @NotNull aby abyVar) {
        return ((Boolean) setY(new Object[]{socket, abyVar}, -867706719, 867706721, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final long setDividerPadding(int i10) {
        return ((Long) setY(new Object[]{Integer.valueOf(i10)}, 1150301269, -1150301255, i10)).longValue();
    }

    public static final int setOnFocusChangeListener(char c10) {
        return ((Integer) setY(new Object[]{Character.valueOf(c10)}, -1275601009, 1275601040, (int) System.currentTimeMillis())).intValue();
    }

    public static final boolean setX(@NotNull acp acpVar, int i10, @NotNull TimeUnit timeUnit) throws IOException {
        return ((Boolean) setY(new Object[]{acpVar, Integer.valueOf(i10), timeUnit}, -1187644817, 1187644820, i10)).booleanValue();
    }

    public static final int setCompoundDrawableTintBlendMode(@NotNull String[] strArr, @NotNull String str, @NotNull Comparator<String> comparator) {
        return ((Integer) setY(new Object[]{strArr, str, comparator}, 1838081140, -1838081135, (int) System.currentTimeMillis())).intValue();
    }

    @NotNull
    public static final Charset setDividerPadding(@NotNull aby abyVar, @NotNull Charset charset) throws IOException {
        return (Charset) setY(new Object[]{abyVar, charset}, -2095201481, 2095201524, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setOnFocusChangeListener(@NotNull String str, @NotNull Object... objArr) {
        return (String) setY(new Object[]{str, objArr}, -1701904396, 1701904431, (int) System.currentTimeMillis());
    }

    public static final int setX(@NotNull aby abyVar) throws IOException {
        return ((Integer) setY(new Object[]{abyVar}, -155086202, 155086203, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ String setCompoundDrawableTintBlendMode(yg ygVar) {
        return (String) setY(new Object[]{ygVar}, -616378984, 616378990, (int) System.currentTimeMillis());
    }

    public static final boolean setDividerPadding(@NotNull String str) {
        return ((Boolean) setY(new Object[]{str}, 1382524987, -1382524955, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final boolean setOnFocusChangeListener(@NotNull String str) {
        return ((Boolean) setY(new Object[]{str}, -1456569763, 1456569810, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final int setX(byte b10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        return ((Integer) setY(new Object[]{Byte.valueOf(b10)}, 572946270, -572946224, (int) System.currentTimeMillis())).intValue();
    }

    public static final int setDividerPadding(@NotNull String str, char c10, int i10, int i11) {
        return ((Integer) setY(new Object[]{str, Character.valueOf(c10), Integer.valueOf(i10), Integer.valueOf(i11)}, -1105526239, 1105526263, i10)).intValue();
    }

    @NotNull
    public static final yd.setX setX(@NotNull yd ydVar) {
        return (yd.setX) setY(new Object[]{ydVar}, 1123576733, -1123576717, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setDividerPadding(@NotNull yg ygVar, boolean z10) {
        return (String) setY(new Object[]{ygVar, Boolean.valueOf(z10)}, -1801936244, 1801936283, (int) System.currentTimeMillis());
    }

    public static final int setOnFocusChangeListener(@NotNull String str, @NotNull String str2, int i10, int i11) {
        return ((Integer) setY(new Object[]{str, str2, Integer.valueOf(i10), Integer.valueOf(i11)}, -1077986288, 1077986324, i10)).intValue();
    }

    public static final int setX(@NotNull String str) {
        return ((Integer) setY(new Object[]{str}, 437512014, -437511969, (int) System.currentTimeMillis())).intValue();
    }

    @NotNull
    public static final String[] setDividerPadding(@NotNull String[] strArr, @NotNull String[] strArr2, @NotNull Comparator<? super String> comparator) {
        return (String[]) setY(new Object[]{strArr, strArr2, comparator}, 1465570526, -1465570513, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ String setX(String str, int i10) {
        return (String) setY(new Object[]{str, Integer.valueOf(i10)}, 984847446, -984847437, i10);
    }

    public static final boolean setX(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        return ((Boolean) setY(new Object[]{strArr, strArr2, comparator}, 564857492, -564857466, (int) System.currentTimeMillis())).booleanValue();
    }

    @NotNull
    public static final ThreadFactory setX(@NotNull String str, boolean z10) {
        return (ThreadFactory) setY(new Object[]{str, Boolean.valueOf(z10)}, 776175602, -776175568, (int) System.currentTimeMillis());
    }

    public static final void setX(long j10, long j11, long j12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)}, 343603623, -343603579, (int) System.currentTimeMillis());
    }

    public static final boolean setY(@NotNull acp acpVar, @NotNull TimeUnit timeUnit) {
        return ((Boolean) setY(new Object[]{acpVar, timeUnit}, 10544442, -10544417, (int) System.currentTimeMillis())).booleanValue();
    }

    public static final void setY(@NotNull abv abvVar, int i10) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        setY(new Object[]{abvVar, Integer.valueOf(i10)}, -395378202, 395378235, i10);
    }

    public static final int setY(short s4) {
        return ((Integer) setY(new Object[]{Short.valueOf(s4)}, -660143803, 660143833, (int) System.currentTimeMillis())).intValue();
    }

    @NotNull
    public static final ye setY(@NotNull List<aab> list) {
        return (ye) setY(new Object[]{list}, 1913597515, -1913597478, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String[] setY(@NotNull String[] strArr, @NotNull String str) {
        return (String[]) setY(new Object[]{strArr, str}, -1660299830, 1660299878, (int) System.currentTimeMillis());
    }
}
