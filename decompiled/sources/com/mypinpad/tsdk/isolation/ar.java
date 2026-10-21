package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class ar extends FunctionReferenceImpl implements Function1<ro, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f53641p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f53642q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final char f53643r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f53644s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final byte[] f53645t0 = null;

    static {
        c();
        f53644s0 = 1;
        f53643r0 = (char) 30296;
        f53641p0 = -2443367703579691432L;
        f53642q0 = -937694217;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ar(Object obj) throws Throwable {
        Object[] objArr = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), "잛⧊柣픎", ViewConfiguration.getKeyRepeatTimeout() >> 16, "窧절僯쩫π嬼꒪액⻉⑯ꜵ捑\ud8cf\ue893㴅\ud887䱚ᅛ좃핣汀\uf67d⛟\uebef", objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 7752), "榋늣䧅缞", (-1) - TextUtils.lastIndexOf("", '0', 0), "䨢꤁\ue5e5蟵\uf300굱骠쳭봦훳\uf8a0㬇\u0382\ued04\uf84aஶ鷑㆙붭뉘毃ꚑ뱥悚舉\ue983㢖欝怊謺揯\udde6讛䔈㿅굤꧃⫼ᶋ嶎뛒䨉㜧焯㨞ី멨紡뉷뭩\uda48䆪歆\ude89椘\uf1f8璍㧻긠矊梅\uf407\u0cdfㅸ鷰灒剡ꎢ\ufade퀴瀞擹郢ꮓ枞㩙暰㽄꺍䆅ﰌ轩ꑳⶹ쑠鑹瀩喇\ue702⼥坁⡌픰ີ", objArr2);
        super(1, obj, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        int i11;
        String str3 = "";
        int i12 = f53644s0;
        int i13 = i12 + 53;
        int i14 = i13 % 128;
        int i15 = 2;
        int i16 = i13 % 2;
        char[] charArray = str2.toCharArray();
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = str.toCharArray();
        int i17 = i12 + 77;
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        int i20 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i21 = i12 + 29;
            int i22 = i21 % 128;
            int i23 = i21 % i15;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i20] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - Color.blue(i20)), 39 - KeyEvent.getDeadChar(i20, i20), View.MeasureSpec.getSize(i20) + 1737);
                    byte b10 = (byte) i20;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Object.class);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - View.resolveSizeAndState(0, 0, 0)), TextUtils.lastIndexOf(str3, '0') + 38, 645 - Process.getGidForName(str3));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 3);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 - 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getLongPressTimeout() >> 16), 49 - (ViewConfiguration.getJumpTapTimeout() >> 16), 434 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, (byte) (b15 - 1), objArr7);
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
                    Class cls5 = (Class) setTextScaleX.setX((char) (4449 - View.resolveSize(0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, Color.rgb(0, 0, 0) + 16778237);
                    byte b16 = (byte) 0;
                    Object[] objArr9 = new Object[1];
                    b(b16, (byte) (b16 | 6), b16, objArr9);
                    String str5 = (String) objArr9[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c11;
                int i24 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i24] = (char) (((((long) (c11 ^ charArray[i24])) ^ (f53641p0 ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f53642q0) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f53643r0) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i24 + 1;
                length3 = length3;
                i15 = i11;
                i12 = i12;
                str3 = str3;
                i20 = 0;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 113
            int r6 = r6 * 2
            int r6 = 1 - r6
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = new byte[r6]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.ar.f53645t0
            if (r2 != 0) goto L15
            r4 = r7
            r3 = r1
            r7 = r6
            goto L2a
        L15:
            r3 = r1
        L16:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L25:
            r4 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r8 = r8 + 1
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ar.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f53645t0 = new byte[]{72, 66, 70, -36};
    }

    public final void d(@NotNull ro roVar) throws Throwable {
        Intrinsics.checkNotNullParameter(roVar, "");
        ul.setOnFocusChangeListener((ul) this.receiver, roVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ro roVar) throws Throwable {
        d(roVar);
        return Unit.INSTANCE;
    }
}
