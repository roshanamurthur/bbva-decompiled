package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setFooterDividersEnabled implements Serializable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final long f59737r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f59738s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f59739t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f59740u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final byte[] f59741w0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final setIndeterminate f59742p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final setGravity f59743q0;

    static {
        b();
        f59740u0 = 0;
        v0 = 1;
        f59738s0 = 0;
        f59739t0 = 1;
        f59737r0 = -7197113803019712309L;
    }

    public setFooterDividersEnabled(@NotNull setIndeterminate setindeterminate, @NotNull setGravity setgravity) {
        Intrinsics.checkNotNullParameter(setindeterminate, "");
        Intrinsics.checkNotNullParameter(setgravity, "");
        this.f59742p0 = setindeterminate;
        this.f59743q0 = setgravity;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r8 = r8 * 3
            int r8 = r8 + 107
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = new byte[r9]
            byte[] r1 = com.mypinpad.tsdk.isolation.setFooterDividersEnabled.f59741w0
            r2 = 0
            if (r1 != 0) goto L1a
            r8 = r7
            r3 = r1
            r5 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L32
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r1[r7]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L32:
            int r7 = r7 + 1
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setFooterDividersEnabled.a(int, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f59741w0 = new byte[]{82, 39, 71, -7};
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c4  */
    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Throwable cause;
        int i13 = 0;
        setFooterDividersEnabled setfooterdividersenabled = (setFooterDividersEnabled) objArr[0];
        Object obj = objArr[1];
        int i14 = f59738s0 + 23;
        f59739t0 = i14 % 128;
        char c10 = 2;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (setfooterdividersenabled == obj) {
            return Boolean.TRUE;
        }
        if (!Intrinsics.areEqual(setfooterdividersenabled.getClass(), obj == null ? null : obj.getClass())) {
            return Boolean.FALSE;
        }
        if (obj != null) {
            if (setfooterdividersenabled.f59742p0 == ((setFooterDividersEnabled) obj).f59742p0) {
                return Boolean.TRUE;
            }
            int i15 = f59738s0;
            int i16 = i15 + 31;
            f59739t0 = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i15 + 67;
            f59739t0 = i18 % 128;
            int i19 = i18 % 2;
            return Boolean.FALSE;
        }
        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1362;
        int i20 = v0 + 35;
        f59740u0 = i20 % 128;
        int i21 = i20 % 2;
        char[] charArray = "\ueb32\uee78\ue192\ue4c3︸\uf1aa\uf4db츅솺쓪\ude02턇퓲긤ꄒꒀ븭녎뒚蹿腼蒖龊酵钫濛態撹翵焝瑎侳䄈䑔忮優吘⾊ℵ⑦㿚㋈㑯ྷ˙Џᾢዢᐈ\ueff3\ue2fd\ue41aｋ\uf2ec\uf438콒슐쐬\udf28튞헎꽥ꊧꗔ뽮늬뗊輆芷藧齔鉛闽漫战斷缹牯疱䣌䉢䖛壇剸".toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = packedPositionChild;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i22 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i22 >= charArray.length) {
                break;
            }
            char c11 = charArray[i22];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33, 1195 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                    byte b10 = (byte) i13;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    a(b10, b11, (byte) (b11 - 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i22] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f59737r0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.green(0) + 44, Process.getGidForName("") + 729);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    a(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i23 = f59740u0 + 79;
                v0 = i23 % 128;
                int i24 = i23 % 2;
                i13 = 0;
                c10 = 2;
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
            int i25 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i25 >= charArray.length) {
                throw new NullPointerException(n1.f(cArr));
            }
            cArr[i25] = (char) jArr[i25];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 44, 728 - ExpandableListView.getPackedPositionType(0L));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                a(b14, b15, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, obj}, 1909309497, -1909309497, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        int i10 = f59739t0 + 39;
        f59738s0 = i10 % 128;
        int i11 = i10 % 2;
        setIndeterminate setindeterminate = this.f59742p0;
        int iHashCode = i11 != 0 ? (setindeterminate.hashCode() % 29) % 1237 : (setindeterminate.hashCode() * 31) + 1237;
        int i12 = f59738s0 + 87;
        f59739t0 = i12 % 128;
        if (i12 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    @NotNull
    public final setGravity setCompoundDrawableTintBlendMode() {
        int i10 = f59739t0;
        int i11 = i10 + 81;
        f59738s0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 63;
        f59738s0 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.f59743q0;
        }
        throw null;
    }

    public final boolean setDividerPadding() {
        int i10 = f59739t0;
        int i11 = i10 + 41;
        f59738s0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 69;
        f59738s0 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    @NotNull
    public final setIndeterminate setY() {
        int i10 = f59738s0;
        int i11 = i10 + 37;
        f59739t0 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 117;
        f59739t0 = i13 % 128;
        int i14 = i13 % 2;
        return this.f59742p0;
    }
}
