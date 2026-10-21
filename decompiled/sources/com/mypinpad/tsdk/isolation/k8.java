package com.mypinpad.tsdk.isolation;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.noknok.android.client.asm.authenticator.KSUtils;
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
final class k8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f56759q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56760r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56761s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f56762t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f56763u0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setHorizontalScrollBarEnabled f56764p0;

    static {
        c();
        f56762t0 = 1;
        f56760r0 = 0;
        f56761s0 = 1;
        f56759q0 = -443079937;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        super(1);
        this.f56764p0 = sethorizontalscrollbarenabled;
    }

    public static void a(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
        char c10;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        int i13 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i14 = getnavbartitlestring.setY;
            if (i14 >= i10) {
                break;
            }
            char c11 = charArray[i14];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
            char c12 = (char) (i11 + c11);
            cArr[i14] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(f56759q0);
                objArr2[i13] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 41 - Drawable.resolveOpacity(i13, i13), 484 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte b10 = (byte) i13;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 55965), Drawable.resolveOpacity(0, 0) + 43, MotionEvent.axisFromString("") + 2269);
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 - 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i13 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        int i15 = f56762t0;
        if (i12 > 0) {
            int i16 = i15 + 95;
            int i17 = i16 % 128;
            int i18 = i16 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            c10 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i19, i19);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i20, cArr, 0, i10 - i20);
        } else {
            c10 = 0;
        }
        objArr[c10] = new String(cArr);
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
    public static void b(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 66 - r8
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.k8.f56763u0
            r2 = 0
            if (r1 != 0) goto L18
            r8 = r7
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r9 = r9 + 1
            if (r3 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.k8.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f56763u0 = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 31, KSUtils.PLAIN_BUFFER, 108};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f56761s0 + 69;
        f56760r0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a(3 - TextUtils.indexOf((CharSequence) "", '0'), 143 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.getTrimmedLength("") + 2, "\u0005�\u0006\ufff9", objArr);
        String strIntern = ((String) objArr[0]).intern();
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = this.f56764p0;
        mo.setY(new Object[]{moVar, strIntern, (String) setHorizontalScrollBarEnabled.setOnFocusChangeListener(new Object[]{sethorizontalscrollbarenabled}, 1383818273, -1383818273, System.identityHashCode(sethorizontalscrollbarenabled))}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a(4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 141 - TextUtils.getOffsetBefore("", 0), 4 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\ufffb\u000e\ufffb\ufffe", objArr2);
        mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), qo.setOnFocusChangeListener(sethorizontalscrollbarenabled)}, 509994867, -509994865, System.identityHashCode(moVar));
        int i12 = f56760r0 + 67;
        f56761s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f56760r0 + 21;
        f56761s0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f56761s0 + 71;
        f56760r0 = i12 % 128;
        int i13 = i12 % 2;
        return unit;
    }
}
