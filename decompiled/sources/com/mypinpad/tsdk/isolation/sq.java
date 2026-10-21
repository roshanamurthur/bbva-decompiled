package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.android.gms.measurement.internal.a;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nSdkTerminalTransactionParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkTerminalTransactionParams.kt\ncom/mypinpad/tsdk/internal/sdk/models/SdkTransactionParameters\n+ 2 DebugFunctions.kt\ncom/mypinpad/tsdk/common/buildconstants/DebugFunctionsKt\n*L\n1#1,108:1\n30#2:109\n14#2:110\n*S KotlinDebug\n*F\n+ 1 SdkTerminalTransactionParams.kt\ncom/mypinpad/tsdk/internal/sdk/models/SdkTransactionParameters\n*L\n53#1:109\n53#1:110\n*E\n"})
public final class sq implements getDynamicButtonIconTextSpacingDp, Serializable {
    public static int E0;
    public static int F0;
    public static int G0;
    public static int H0;
    public static final byte[] I0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int[] f60905y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f60906p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final Long f60907q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final sl f60908r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public final String f60909s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final so f60910t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final String f60911u0;

    @NotNull
    public final List<String> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final byte[] f60912w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final UUID f60913x0;

    static {
        b();
        G0 = 0;
        H0 = 1;
        E0 = 0;
        F0 = 1;
        f60905y0 = new int[]{1722102969, -1091255007, 1861221495, 1925246432, 1076553861, 38785928, -337677062, 1907546532, -1323367786, -1332677270, 391175580, -35235832, 1982824670, -489442332, 666366286, 1140261569, 1376779536, 703678416};
    }

    public sq(long j10, @Nullable Long l6, @NotNull sl slVar, @Nullable String str, @NotNull so soVar, @NotNull String str2, @NotNull List<String> list, @NotNull byte[] bArr, @Nullable UUID uuid) {
        Intrinsics.checkNotNullParameter(slVar, "");
        Intrinsics.checkNotNullParameter(soVar, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60906p0 = j10;
        this.f60907q0 = l6;
        this.f60908r0 = slVar;
        this.f60909s0 = str;
        this.f60910t0 = soVar;
        this.f60911u0 = str2;
        this.v0 = list;
        this.f60912w0 = bArr;
        this.f60913x0 = uuid;
        tk.setY(str2);
        tk.setCompoundDrawableTintBlendMode(bArr);
    }

    public static void a(byte b10, int i10, short s4, Object[] objArr) {
        int i11 = 108 - (b10 * 4);
        int i12 = i10 * 3;
        int i13 = 3 - (s4 * 3);
        byte[] bArr = new byte[1 - i12];
        int i14 = 0 - i12;
        int i15 = -1;
        byte[] bArr2 = I0;
        if (bArr2 == null) {
            int i16 = (-i14) + i13;
            i13 = i13;
            objArr = objArr;
            bArr = bArr;
            i15 = -1;
            bArr2 = bArr2;
            i14 = i14;
            i11 = i16;
        }
        while (true) {
            int i17 = i15 + 1;
            bArr[i17] = (byte) i11;
            int i18 = i13 + 1;
            if (i17 == i14) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            byte b11 = bArr2[i18];
            int i19 = i11;
            int i20 = i14;
            int i21 = (-b11) + i19;
            i13 = i18;
            objArr = objArr;
            bArr = bArr;
            i15 = i17;
            bArr2 = bArr2;
            i14 = i20;
            i11 = i21;
        }
    }

    public static void b() {
        I0 = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 86, 126, 91};
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = ((i16 | (~(i13 | i17)) | (~(i14 | i17))) * (-1136)) + (i11 * 569) + (i10 * 569);
        int i19 = i10 | i17;
        if ((((~i19) | (~(i11 | i17)) | (~(i15 | i12))) * 568) + (((~(i13 | i12)) | (~(i14 | i12)) | (~(i19 | i11))) * (-568)) + i18 == 1) {
            sq sqVar = (sq) objArr[0];
            int i20 = E0 + 21;
            int i21 = i20 % 128;
            F0 = i21;
            int i22 = i20 % 2;
            byte[] bArr = sqVar.f60912w0;
            int i23 = i21 + 3;
            E0 = i23 % 128;
            int i24 = i23 % 2;
            return bArr;
        }
        sq sqVar2 = (sq) objArr[0];
        int i25 = E0;
        int i26 = i25 + 93;
        F0 = i26 % 128;
        int i27 = i26 % 2;
        Long l6 = sqVar2.f60907q0;
        int i28 = i25 + 47;
        F0 = i28 % 128;
        if (i28 % 2 != 0) {
            return l6;
        }
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i10 = E0 + 121;
            F0 = i10 % 128;
            if (i10 % 2 == 0) {
                obj.getClass();
                throw null;
            }
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(sq.class, cls)) {
            int i11 = E0 + 99;
            F0 = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            throw null;
        }
        Intrinsics.checkNotNull(obj, "");
        sq sqVar = (sq) obj;
        if (this.f60906p0 != sqVar.f60906p0 || !Intrinsics.areEqual(this.f60907q0, sqVar.f60907q0) || !Intrinsics.areEqual(this.f60908r0, sqVar.f60908r0) || this.f60910t0 != sqVar.f60910t0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.f60911u0, sqVar.f60911u0)) {
            int i12 = E0 + 65;
            F0 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.v0, sqVar.v0)) {
            return false;
        }
        if (!Arrays.equals(this.f60912w0, sqVar.f60912w0)) {
            int i14 = F0 + 77;
            E0 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.f60913x0, sqVar.f60913x0)) {
            return true;
        }
        int i16 = E0 + 75;
        F0 = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    @NotNull
    public final String getNavBarTitleString() {
        int i10 = F0 + 81;
        int i11 = i10 % 128;
        E0 = i11;
        if (i10 % 2 != 0) {
            int i12 = 44 / 0;
        }
        int i13 = i11 + 125;
        F0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f60911u0;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i10 = E0 + 15;
        int i11 = i10 % 128;
        F0 = i11;
        int i12 = i10 % 2;
        long j10 = this.f60906p0;
        int i13 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        int i14 = 0;
        Long l6 = this.f60907q0;
        if (l6 != null) {
            int i15 = i11 + 101;
            E0 = i15 % 128;
            if (i15 % 2 != 0) {
                l6.hashCode();
                throw null;
            }
            iHashCode = l6.hashCode();
        } else {
            iHashCode = 0;
        }
        int iHashCode3 = (Arrays.hashCode(this.f60912w0) + a.a(this.v0, (this.f60911u0.hashCode() + ((this.f60910t0.hashCode() + ((this.f60908r0.hashCode() + ((i13 + iHashCode) * 31)) * 31)) * 31)) * 31, 31)) * 31;
        UUID uuid = this.f60913x0;
        if (uuid != null) {
            int i16 = E0 + 67;
            F0 = i16 % 128;
            if (i16 % 2 == 0) {
                iHashCode2 = uuid.hashCode();
                int i17 = 4 / 0;
            } else {
                iHashCode2 = uuid.hashCode();
            }
            i14 = iHashCode2;
        }
        return iHashCode3 + i14;
    }

    public final long setCompoundDrawableTintBlendMode() {
        int i10 = E0 + 25;
        F0 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f60906p0;
        }
        throw null;
    }

    @Nullable
    public final String setDividerPadding() {
        int i10 = E0 + 41;
        int i11 = i10 % 128;
        F0 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 17;
        E0 = i12 % 128;
        if (i12 % 2 == 0) {
            return this.f60909s0;
        }
        throw null;
    }

    @NotNull
    public final so setLayoutAnimation() {
        int i10 = E0;
        int i11 = i10 + 69;
        F0 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 28 / 0;
        }
        int i13 = i10 + 21;
        F0 = i13 % 128;
        int i14 = i13 % 2;
        so soVar = this.f60910t0;
        if (i14 == 0) {
            int i15 = 68 / 0;
        }
        return soVar;
    }

    @Nullable
    public final UUID setNavigationOnClickListener() {
        int i10 = E0 + 91;
        int i11 = i10 % 128;
        F0 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 13;
        E0 = i12 % 128;
        int i13 = i12 % 2;
        return this.f60913x0;
    }

    @NotNull
    public final List<String> setOnDragListener() {
        int i10 = E0 + 23;
        int i11 = i10 % 128;
        F0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 115;
        E0 = i13 % 128;
        int i14 = i13 % 2;
        return this.v0;
    }

    @NotNull
    public final byte[] setOnLongClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 316374583, -316374582, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
    @NotNull
    public final String setX() throws Throwable {
        int i10;
        int[] iArr;
        char[] cArr;
        String strTake;
        String string;
        int length;
        int i11;
        int[] iArr2 = {1706539917, 146208592};
        int fadingEdgeLength = 2 - (ViewConfiguration.getFadingEdgeLength() >> 16);
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[4];
        char c10 = 0;
        int i12 = 1;
        int[] iArr3 = f60905y0;
        if (iArr3 != null) {
            int i13 = H0 + 81;
            int i14 = i13 % 128;
            G0 = i14;
            if (i13 % 2 != 0) {
                length = iArr3.length;
                iArr = new int[length];
                i11 = 1;
            } else {
                length = iArr3.length;
                iArr = new int[length];
                i11 = 0;
            }
            int i15 = i14 + 35;
            H0 = i15 % 128;
            int i16 = i15 % 2;
            while (i11 < length) {
                try {
                    Object[] objArr = new Object[i12];
                    objArr[c10] = Integer.valueOf(iArr3[i11]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1833429914);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 44, 727 - MotionEvent.axisFromString(""));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        a(b11, (byte) (b11 - 1), b10, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr[i11] = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                    i11++;
                    length = length;
                    fadingEdgeLength = fadingEdgeLength;
                    c10 = 0;
                    i12 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            i10 = fadingEdgeLength;
        } else {
            i10 = fadingEdgeLength;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int[] iArr4 = new int[length2];
        char c11 = '0';
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i17 = G0 + 85;
            H0 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = 0;
            while (i19 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr3[i19])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(1833429914);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (AndroidCharacter.getMirror(c11) - '0'), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, KeyEvent.keyCodeFromString("") + 728);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr4 = new Object[1];
                    a(b13, (byte) (b13 - 1), b12, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                    map2.put(1833429914, method2);
                }
                iArr5[i19] = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                i19++;
                length3 = length3;
                iArr3 = iArr3;
                cArr3 = cArr3;
                c11 = '0';
            }
            cArr = cArr3;
            iArr3 = iArr5;
        } else {
            cArr = cArr3;
        }
        char c12 = 0;
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i20 = setonlongclicklistener.setDividerPadding;
            if (i20 >= 2) {
                break;
            }
            int i21 = iArr2[i20];
            char c13 = (char) (i21 >> 16);
            cArr2[c12] = c13;
            char c14 = (char) i21;
            cArr2[1] = c14;
            int i22 = iArr2[i20 + 1];
            char c15 = (char) (i22 >> 16);
            cArr2[2] = c15;
            char c16 = (char) i22;
            cArr2[3] = c16;
            setonlongclicklistener.setY = (c13 << 16) + c14;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c15 << 16) + c16;
            setOnLongClickListener.setX(iArr4);
            int i23 = 0;
            for (int i24 = 16; i23 < i24; i24 = 16) {
                int i25 = H0 + 7;
                G0 = i25 % 128;
                int i26 = i25 % 2;
                int i27 = setonlongclicklistener.setY ^ iArr4[i23];
                setonlongclicklistener.setY = i27;
                Object[] objArr5 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i27)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-350984188);
                if (method3 == null) {
                    method3 = ((Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(0), 41 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 181)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i23++;
            }
            int i28 = setonlongclicklistener.setY;
            int i29 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i30 = i28 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i30;
            int i31 = i29 ^ iArr4[17];
            setonlongclicklistener.setY = i31;
            cArr2[0] = (char) (i31 >>> 16);
            cArr2[1] = (char) i31;
            cArr2[2] = (char) (i30 >>> 16);
            cArr2[3] = (char) i30;
            setOnLongClickListener.setX(iArr4);
            int i32 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i32] = cArr2[0];
            cArr[i32 + 1] = cArr2[1];
            cArr[i32 + 2] = cArr2[2];
            cArr[i32 + 3] = cArr2[3];
            Object[] objArr6 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-147294223);
            if (method4 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), Color.argb(0, 0, 0, 0) + 41, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 483);
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                a(b15, b15, b14, objArr7);
                method4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map4.put(-147294223, method4);
            }
            ((Method) method4).invoke(null, objArr6);
            c12 = 0;
        }
        String strIntern = new String(cArr, 0, i10).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f60906p0);
        sb2.append(strIntern);
        sl slVar = this.f60908r0;
        sb2.append(((Integer) sl.setY(new Object[]{slVar}, -1433045547, 1433045547, System.identityHashCode(slVar))).intValue());
        sb2.append(strIntern);
        sb2.append((int) this.f60910t0.setX());
        sb2.append(strIntern);
        sb2.append(this.f60911u0);
        sb2.append(strIntern);
        sb2.append(this.f60912w0.length);
        sb2.append(strIntern);
        UUID uuid = this.f60913x0;
        if (uuid == null || (string = uuid.toString()) == null) {
            int i33 = E0 + 1;
            F0 = i33 % 128;
            int i34 = i33 % 2;
            strTake = null;
        } else {
            strTake = StringsKt___StringsKt.take(string, 4);
        }
        sb2.append(strTake);
        String string2 = sb2.toString();
        int i35 = E0 + 77;
        F0 = i35 % 128;
        int i36 = i35 % 2;
        return string2;
    }

    @Nullable
    public final Long setY() {
        return (Long) setOnFocusChangeListener(new Object[]{this}, 24211853, -24211853, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        int i10 = E0;
        int i11 = i10 + 55;
        F0 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 10 / 0;
        }
        int i13 = i10 + 13;
        F0 = i13 % 128;
        if (i13 % 2 != 0) {
            return "";
        }
        throw null;
    }

    @NotNull
    public final sl setOnFocusChangeListener() {
        int i10 = E0 + 11;
        int i11 = i10 % 128;
        F0 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 41;
        E0 = i12 % 128;
        int i13 = i12 % 2;
        return this.f60908r0;
    }
}
