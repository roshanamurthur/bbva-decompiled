package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setGravity implements Serializable {
    public static final long I0;
    public static int J0;
    public static int K0;
    public static int L0;
    public static int M0;
    public static final byte[] N0 = null;

    @Nullable
    public final byte[] E0;

    @Nullable
    public final byte[] F0;
    public final float G0;
    public final int H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f59752p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f59753q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f59754r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final float f59755s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final float f59756t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final int f59757u0;

    @NotNull
    public final String v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final String f59758w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final String f59759x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public final byte[] f59760y0;

    static {
        b();
        L0 = 0;
        M0 = 1;
        J0 = 0;
        K0 = 1;
        I0 = -192814903052897253L;
    }

    public setGravity(int i10, int i11, int i12, float f6, float f10, int i13, @NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3, float f11, int i14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.f59752p0 = i10;
        this.f59753q0 = i11;
        this.f59754r0 = i12;
        this.f59755s0 = f6;
        this.f59756t0 = f10;
        this.f59757u0 = i13;
        this.v0 = str;
        this.f59758w0 = str2;
        this.f59759x0 = str3;
        this.f59760y0 = bArr;
        this.E0 = bArr2;
        this.F0 = bArr3;
        this.G0 = f11;
        this.H0 = i14;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r8, int r9, short r10, java.lang.Object[] r11) {
        /*
            int r10 = r10 + 4
            int r9 = r9 * 3
            int r9 = r9 + 107
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.setGravity.N0
            r2 = 0
            if (r1 != 0) goto L18
            r9 = r8
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L35
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r2)
            r11[r2] = r8
            return
        L28:
            int r10 = r10 + 1
            r3 = r1[r10]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L35:
            int r10 = -r10
            int r8 = r8 + r10
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setGravity.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        N0 = new byte[]{42, 50, -1, -90};
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * 502) + ((~((~i12) | i13 | i10)) * (-502)) + (((~(i11 | i10)) | (~(i13 | i12))) * (-502)) + (i11 * 503) + (i10 * (-501));
        if (i14 == 1) {
            setGravity setgravity = (setGravity) objArr[0];
            int i15 = K0 + 97;
            J0 = i15 % 128;
            int i16 = i15 % 2;
            float f6 = setgravity.f59756t0;
            if (i16 == 0) {
                return Float.valueOf(f6);
            }
            throw null;
        }
        if (i14 == 2) {
            setGravity setgravity2 = (setGravity) objArr[0];
            int i17 = K0 + 1;
            J0 = i17 % 128;
            int i18 = i17 % 2;
            int i19 = setgravity2.f59757u0;
            if (i18 != 0) {
                int i20 = 25 / 0;
            }
            return Integer.valueOf(i19);
        }
        setGravity setgravity3 = (setGravity) objArr[0];
        int i21 = K0 + 119;
        int i22 = i21 % 128;
        J0 = i22;
        int i23 = i21 % 2;
        byte[] bArr = setgravity3.f59760y0;
        int i24 = i22 + 109;
        K0 = i24 % 128;
        if (i24 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    @Nullable
    public final byte[] UiMessageCallbackKtWhenMappings() {
        int i10 = K0 + 107;
        int i11 = i10 % 128;
        J0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 75;
        K0 = i13 % 128;
        int i14 = i13 % 2;
        return this.E0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x022e  */
    /* JADX WARN: Code duplicated, block: B:53:0x022f  */
    public final boolean equals(@Nullable Object obj) throws Throwable {
        boolean z10;
        byte[] bArr;
        Throwable cause;
        if (this == obj) {
            return true;
        }
        int i10 = 0;
        if (!Intrinsics.areEqual(setGravity.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        char c10 = 2;
        if (obj != null) {
            setGravity setgravity = (setGravity) obj;
            if (this.f59752p0 != setgravity.f59752p0) {
                return false;
            }
            if (this.f59753q0 != setgravity.f59753q0) {
                int i11 = J0 + 7;
                K0 = i11 % 128;
                return i11 % 2 == 0;
            }
            if (this.f59754r0 != setgravity.f59754r0 || this.f59755s0 != setgravity.f59755s0) {
                return false;
            }
            if (this.f59756t0 != setgravity.f59756t0) {
                int i12 = J0 + 113;
                K0 = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            int i14 = J0 + 123;
            K0 = i14 % 128;
            int i15 = i14 % 2;
            if (!Intrinsics.areEqual(this.v0, setgravity.v0) || !Intrinsics.areEqual(this.f59758w0, setgravity.f59758w0)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.f59759x0, setgravity.f59759x0)) {
                int i16 = K0 + 95;
                J0 = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            byte[] bArr2 = setgravity.f59760y0;
            byte[] bArr3 = this.f59760y0;
            if (bArr3 != null) {
                if (bArr2 == null) {
                    int i18 = K0 + 9;
                    J0 = i18 % 128;
                    return i18 % 2 != 0;
                }
                if (!Arrays.equals(bArr3, bArr2)) {
                    return false;
                }
            } else if (bArr2 != null) {
                return false;
            }
            byte[] bArr4 = setgravity.E0;
            byte[] bArr5 = this.E0;
            if (bArr5 != null) {
                if (bArr4 == null) {
                    int i19 = J0 + 17;
                    K0 = i19 % 128;
                    int i20 = i19 % 2;
                    return false;
                }
                if (!Arrays.equals(bArr5, bArr4)) {
                    return false;
                }
                z10 = false;
            } else {
                if (bArr4 != null) {
                    int i21 = J0 + 89;
                    int i22 = i21 % 128;
                    K0 = i22;
                    int i23 = i21 % 2;
                    int i24 = i22 + 19;
                    J0 = i24 % 128;
                    if (i24 % 2 == 0) {
                        return false;
                    }
                    throw null;
                }
                z10 = false;
            }
            byte[] bArr6 = setgravity.F0;
            byte[] bArr7 = this.F0;
            if (bArr7 != null) {
                if (bArr6 == null) {
                    return z10;
                }
                if (!Arrays.equals(bArr7, bArr6)) {
                    int i25 = K0 + 101;
                    J0 = i25 % 128;
                    int i26 = i25 % 2;
                    return z10;
                }
            } else if (bArr6 != null) {
                int i27 = K0 + 19;
                J0 = i27 % 128;
                int i28 = i27 % 2;
                return z10;
            }
            if (this.G0 == setgravity.G0 && this.H0 == setgravity.H0) {
                return true;
            }
            return z10;
        }
        long j10 = 0;
        int i29 = 16300 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        int i30 = L0 + 79;
        M0 = i30 % 128;
        int i31 = i30 % 2;
        char[] charArray = "韢ꡔ\ue8ba⣧椘ꦎ\ue9e3⩙檊꫶\ueb3a⯃毲갠\uecdaⳌ洽궂\uedd2\u2e7b湼껒\uef72⽩濛ꀇ\ue033⃝愕ꅹ\ue1a6≟托ꊸ\ue306⍎揸ꏮ\ue44dⒺ撪ꕔ\ue597◳晙ꚋ\ue6ea✮枘ꞿ\uf835㢞磋뤨呂㧎稠며敖㬺筮믁ﰏ㱸精봀ﵢ㶢縗빃ﻬ㼇罍뾷ﾠで点냶\uf14aㆃ燽뉈\uf2b5㋾猼뎉\uf3fb㐩璓듚".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i29;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i32 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            int length2 = charArray.length;
            bArr = N0;
            if (i32 >= length2) {
                break;
            }
            char c11 = charArray[i32];
            try {
                Object[] objArr = new Object[3];
                objArr[c10] = setlayoutanimation;
                objArr[1] = setlayoutanimation;
                objArr[i10] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 32 - ExpandableListView.getPackedPositionChild(j10), 1195 - View.MeasureSpec.makeMeasureSpec(i10, i10));
                    byte b10 = bArr[c10];
                    byte b11 = (byte) (b10 + 1);
                    byte b12 = b10;
                    Object[] objArr2 = new Object[1];
                    a(b11, (byte) (-b12), b12, objArr2);
                    method = cls.getMethod((String) objArr2[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i32] = ((Long) ((Method) method).invoke(null, objArr)).longValue() ^ (I0 ^ 1779209353347916695L);
                Object[] objArr3 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43, 728 - Color.green(0));
                    byte b13 = bArr[2];
                    byte b14 = (byte) (b13 + 1);
                    byte b15 = b13;
                    Object[] objArr4 = new Object[1];
                    a(b14, (byte) (b15 + 1), b15, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                c10 = 2;
                i10 = 0;
                j10 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th2;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i33 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i33 >= charArray.length) {
                String str = new String(cArr);
                int i34 = M0 + 77;
                L0 = i34 % 128;
                if (i34 % 2 == 0) {
                    throw new NullPointerException(str.intern());
                }
                throw null;
            }
            int i35 = M0 + 1;
            L0 = i35 % 128;
            if (i35 % 2 != 0) {
                cArr[i33] = (char) jArr[i33];
                Object[] objArr5 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 45 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 728);
                    byte b16 = bArr[2];
                    byte b17 = (byte) (b16 + 1);
                    byte b18 = b16;
                    Object[] objArr6 = new Object[1];
                    a(b17, (byte) (b18 + 1), b18, objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                throw null;
            }
            cArr[i33] = (char) jArr[i33];
            Object[] objArr7 = {setlayoutanimation, setlayoutanimation};
            Map map3 = setTextScaleX.setMaxEms;
            Object method4 = map3.get(645183118);
            if (method4 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 43 - ImageFormat.getBitsPerPixel(0), 729 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                byte b19 = bArr[2];
                byte b20 = (byte) (b19 + 1);
                byte b21 = b19;
                Object[] objArr8 = new Object[1];
                a(b20, (byte) (b21 + 1), b21, objArr8);
                method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                map3.put(645183118, method4);
            }
            ((Method) method4).invoke(null, objArr7);
        }
    }

    @NotNull
    public final String getNavBarTitleString() {
        int i10 = J0 + 89;
        K0 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.v0;
        }
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = (this.f59759x0.hashCode() + ((this.f59758w0.hashCode() + ((this.v0.hashCode() + ((z1.a(this.f59756t0, z1.a(this.f59755s0, ((((this.f59752p0 * 31) + this.f59753q0) * 31) + this.f59754r0) * 31, 31), 31) + this.f59757u0) * 31)) * 31)) * 31)) * 31;
        byte[] bArr = this.f59760y0;
        if (bArr == null) {
            int i10 = J0 + 81;
            K0 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode = 0;
        } else {
            iHashCode = Arrays.hashCode(bArr);
        }
        int i12 = (iHashCode2 + iHashCode) * 31;
        byte[] bArr2 = this.E0;
        int iHashCode3 = (i12 + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.F0;
        int iA = z1.a(this.G0, (iHashCode3 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0)) * 31, 31) + this.H0;
        int i13 = K0 + 95;
        J0 = i13 % 128;
        if (i13 % 2 == 0) {
            return iA;
        }
        throw null;
    }

    public final int setCompoundDrawableTintBlendMode() {
        int i10 = J0;
        int i11 = i10 + 33;
        K0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 63;
        K0 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = this.f59753q0;
        if (i13 == 0) {
            int i15 = 60 / 0;
        }
        return i14;
    }

    public final int setDividerPadding() {
        int i10 = J0;
        int i11 = i10 + 13;
        K0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 115;
        K0 = i13 % 128;
        if (i13 % 2 != 0) {
            return this.f59752p0;
        }
        throw null;
    }

    public final int setIncludeFontPadding() {
        int i10 = K0;
        int i11 = i10 + 23;
        J0 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = i10 + 119;
        J0 = i12 % 128;
        int i13 = i12 % 2;
        return this.H0;
    }

    @NotNull
    public final String setLayoutAnimation() {
        int i10 = J0;
        int i11 = i10 + 65;
        K0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 99;
        K0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f59759x0;
    }

    public final int setNavigationOnClickListener() {
        return ((Integer) setOnFocusChangeListener(new Object[]{this}, -1593987793, 1593987795, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final String setOnDragListener() {
        int i10 = J0 + 63;
        int i11 = i10 % 128;
        K0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 91;
        J0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f59758w0;
        }
        throw null;
    }

    @Nullable
    public final byte[] setOnLongClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1362835856, -1362835856, System.identityHashCode(this));
    }

    @Nullable
    public final byte[] setTextAlignment() {
        int i10 = K0 + 29;
        int i11 = i10 % 128;
        J0 = i11;
        if (i10 % 2 != 0) {
            int i12 = 31 / 0;
        }
        int i13 = i11 + 95;
        K0 = i13 % 128;
        int i14 = i13 % 2;
        return this.F0;
    }

    public final float setX() {
        int i10 = J0 + 45;
        K0 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 51 / 0;
        }
        return this.f59755s0;
    }

    public final int setY() {
        int i10 = J0;
        int i11 = i10 + 107;
        K0 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 113;
        K0 = i12 % 128;
        if (i12 % 2 != 0) {
            return this.f59754r0;
        }
        throw null;
    }

    public final float setZ() {
        int i10 = J0 + 113;
        int i11 = i10 % 128;
        K0 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 115;
        J0 = i13 % 128;
        int i14 = i13 % 2;
        return this.G0;
    }

    public final float setOnFocusChangeListener() {
        return ((Float) setOnFocusChangeListener(new Object[]{this}, 1296442730, -1296442729, System.identityHashCode(this))).floatValue();
    }
}
