package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.PointerIconCompat;
import com.vasco.digipass.sdk.DigipassSDKConstants;
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
final class j8 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f56612q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f56613r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final char f56614s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56615t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56616u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f56617w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f56618x0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ setIndeterminateDrawableTiled f56619p0;

    static {
        c();
        v0 = 0;
        f56617w0 = 1;
        f56615t0 = 0;
        f56616u0 = 1;
        f56614s0 = (char) 9260;
        f56612q0 = -2443367703579691432L;
        f56613r0 = -461867432;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(setIndeterminateDrawableTiled setindeterminatedrawabletiled) {
        super(1);
        this.f56619p0 = setindeterminatedrawabletiled;
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char[] charArray2;
        int i11;
        int i12 = f56617w0 + 71;
        v0 = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray3 = str2.toCharArray();
        int i15 = v0 + 29;
        int i16 = i15 % 128;
        f56617w0 = i16;
        int i17 = i15 % 2;
        int i18 = i16 + 43;
        v0 = i18 % 128;
        int i19 = 0;
        if (i18 % 2 != 0) {
            charArray = "\u0000\u0000\u0000\u0000".toCharArray();
            int i20 = 65 / 0;
        } else {
            charArray = "\u0000\u0000\u0000\u0000".toCharArray();
        }
        int i21 = v0 + 1;
        int i22 = i21 % 128;
        f56617w0 = i22;
        int i23 = i21 % 2;
        int i24 = i22 + 75;
        v0 = i24 % 128;
        if (i24 % 2 != 0) {
            charArray2 = str.toCharArray();
            int i25 = 90 / 0;
        } else {
            charArray2 = str.toCharArray();
        }
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray2, 0, cArr, 0, length);
        System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i26 = f56617w0 + 71;
            v0 = i26 % 128;
            int i27 = i26 % i13;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i19] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (View.resolveSize(i19, i19) + 50678), (ViewConfiguration.getFadingEdgeLength() >> 16) + 39, 1737 - Color.blue(i19));
                    byte b10 = (byte) i19;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b((byte) (b11 & 6), b10, b11, objArr3);
                    String str3 = (String) objArr3[i19];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i19] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i19] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (Color.rgb(i19, i19, i19) + 16785341), 36 - TextUtils.lastIndexOf("", '0', i19, i19), View.resolveSize(i19, i19) + 646);
                    byte b12 = (byte) i19;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b((byte) (b13 + 4), b12, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getJumpTapTimeout() >> 16) + 49, 434 - View.getDefaultSize(0, 0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b((byte) (b15 & 5), b14, b15, objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (4450 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 42, TextUtils.indexOf("", "") + PointerIconCompat.TYPE_GRABBING);
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr9 = new Object[1];
                    b((byte) (b17 + 1), b16, b17, objArr9);
                    String str5 = (String) objArr9[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i28 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i28] = (char) (((((long) (c11 ^ charArray3[i28])) ^ (f56612q0 ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f56613r0) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f56614s0) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i28 + 1;
                i13 = i11;
                length3 = length3;
                cArr3 = cArr3;
                i19 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r8 = r8 + 4
            int r6 = 119 - r6
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.j8.f56618x0
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L16:
            r3 = r2
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.j8.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f56618x0 = new byte[]{109, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25, -2};
    }

    public final void d(@NotNull mo moVar) throws Throwable {
        int i10 = f56616u0 + 23;
        f56615t0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(moVar, "");
        Object[] objArr = new Object[1];
        a((char) TextUtils.getOffsetAfter("", 0), "蓬뇻쇺ﷵ", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "ṑ욄鉊쮾\uf620ↈ왦猰♅丂", objArr);
        String strIntern = ((String) objArr[0]).intern();
        setIndeterminateDrawableTiled setindeterminatedrawabletiled = this.f56619p0;
        mo.setY(new Object[]{moVar, strIntern, setindeterminatedrawabletiled.setCompoundDrawableTintBlendMode()}, -52655784, 52655794, System.identityHashCode(moVar));
        Object[] objArr2 = new Object[1];
        a((char) (TextUtils.lastIndexOf("", '0') + 1), "⦞\uea10\uf82f畍", ViewConfiguration.getLongPressTimeout() >> 16, "ꇭꩉ얕ᣬꮘ籮굴\uda46︀\uf2e7", objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        int dividerPadding = setindeterminatedrawabletiled.setDividerPadding();
        mo.setY(new Object[]{moVar, strIntern2, Integer.valueOf(dividerPadding)}, -1847276528, 1847276528, dividerPadding);
        Object[] objArr3 = new Object[1];
        a((char) (ViewConfiguration.getTouchSlop() >> 8), "䳡ヹ\uf5b6昐", (-1238304436) - (ViewConfiguration.getScrollBarSize() >> 8), "즭棊\uf184ꥧ佑\ue271⼈睳ダ", objArr3);
        mo.setY(new Object[]{moVar, ((String) objArr3[0]).intern(), setindeterminatedrawabletiled.setY()}, -52655784, 52655794, System.identityHashCode(moVar));
        int i12 = f56615t0 + 71;
        f56616u0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f56615t0 + 47;
        f56616u0 = i10 % 128;
        int i11 = i10 % 2;
        d(moVar);
        if (i11 != 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
