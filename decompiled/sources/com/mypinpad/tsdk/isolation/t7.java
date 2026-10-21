package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
final class t7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f60987q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f60988r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f60989s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f60990t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f60991u0;
    public static final byte[] v0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setSubtitleTextAppearance f60992p0;

    static {
        c();
        f60990t0 = 0;
        f60991u0 = 1;
        f60988r0 = 0;
        f60989s0 = 1;
        f60987q0 = -2422931728150047565L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(setSubtitleTextAppearance setsubtitletextappearance) {
        super(1);
        this.f60992p0 = setsubtitletextappearance;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0181  */
    /* JADX WARN: Code duplicated, block: B:33:0x0182  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = f60991u0 + 79;
        f60990t0 = i11 % 128;
        char c10 = 2;
        int i12 = i11 % 2;
        char[] charArray = str.toCharArray();
        int i13 = f60990t0 + 41;
        f60991u0 = i13 % 128;
        int i14 = i13 % 2;
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i15 >= charArray.length) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 1), 33 - (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionGroup(0L) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b11, b10, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f60987q0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) Color.blue(0), 44 - TextUtils.getOffsetBefore("", 0), Gravity.getAbsoluteGravity(0, 0) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b((byte) (b13 + 1), b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = f60991u0 + 49;
            f60990t0 = i17 % 128;
            int i18 = i17 % 2;
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) Color.alpha(0), 44 - KeyEvent.keyCodeFromString(""), 776 - AndroidCharacter.getMirror('0'));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b((byte) (b15 + 1), b14, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = 110 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.t7.v0
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r2[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.t7.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        v0 = new byte[]{73, 126, -52, 98};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f60989s0 + 31;
        f60988r0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a("㝀헮\uf206齄뷁娗", 58027 - View.MeasureSpec.getMode(0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        setSubtitleTextAppearance setsubtitletextappearance = this.f60992p0;
        mo.setY(new Object[]{moVar, strIntern, (String) setSubtitleTextAppearance.setCompoundDrawableTintBlendMode(new Object[]{setsubtitletextappearance}, 1525765535, -1525765535, System.identityHashCode(setsubtitletextappearance))}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a("㝀웠퐚\ue3aa", (ViewConfiguration.getWindowTouchSlop() >> 8) + 61861, objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), qo.setX(qo.INSTANCE, (onPinPadLaunchRequest) setSubtitleTextAppearance.setCompoundDrawableTintBlendMode(new Object[]{setsubtitletextappearance}, -480585336, 480585337, System.identityHashCode(setsubtitletextappearance)))}, 509994867, -509994865, System.identityHashCode(moVar));
        Object[] objArr3 = new Object[1];
        a("㝒\uf61a뗠獆㈡\uf18c뽨", View.combineMeasuredStates(0, 0) + 49499, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        int iIntValue = ((Integer) setSubtitleTextAppearance.setCompoundDrawableTintBlendMode(new Object[]{setsubtitletextappearance}, 1931512686, -1931512683, System.identityHashCode(setsubtitletextappearance))).intValue();
        mo.setY(new Object[]{moVar, strIntern2, Integer.valueOf(iIntValue)}, -1847276528, 1847276528, iIntValue);
        Object[] objArr4 = new Object[1];
        a("㝇\u2cf46摵妽뷼鄪\uf578\ueab8컒∦", (ViewConfiguration.getPressedStateDuration() >> 16) + 7103, objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        int iIntValue2 = ((Integer) setSubtitleTextAppearance.setCompoundDrawableTintBlendMode(new Object[]{setsubtitletextappearance}, -1003832922, 1003832924, System.identityHashCode(setsubtitletextappearance))).intValue();
        mo.setY(new Object[]{moVar, strIntern3, Integer.valueOf(iIntValue2)}, -1847276528, 1847276528, iIntValue2);
        int i12 = f60988r0 + 59;
        f60989s0 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f60988r0 + 29;
        f60989s0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f60989s0 + 27;
        f60988r0 = i12 % 128;
        if (i12 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
