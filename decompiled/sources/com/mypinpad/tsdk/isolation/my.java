package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.vierge.pinpadsdk.message.base.MessageUtils;
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
final /* synthetic */ class my extends FunctionReferenceImpl implements Function1<rs, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f57164p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f57165q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f57166r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57167s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57168t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57169u0;
    public static final byte[] v0 = null;

    static {
        c();
        f57168t0 = 0;
        f57169u0 = 1;
        f57166r0 = 0;
        f57167s0 = 1;
        f57165q0 = (char) 53959;
        f57164p0 = new char[]{59177, 59145, 59191, 59250, 59159, 59144, 59178, 59196, 59184, 59182, 59149, 59198, 59192, 59232, 58560, 58561, 59176, 59151, 59189, 59185, 59187, 59251, 59194, 59195, 59199, 59193, 59179, 59183, 59197, 59252, 59186, 59190, 59180, 59188, 59181, 59170};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public my(Object obj) throws Throwable {
        Object[] objArr = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 23, "\u0015\u0017\u0018\u001e\u0005\b\f\u0005\u0017\u0013\u0016\u001c\u000f\u0018\u001f\"\u0013\u0000\n\u0011\b\u0003㙧", (byte) (121 - KeyEvent.keyCodeFromString("")), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a(AndroidCharacter.getMirror('0') + RootService.CLOSE_BRACKET, "\u0015\u0017\u0018\u001e\u0005\b\f\u0005\u0017\u0013\u0016\u001c\u000f\u0018\u001f\"\u0013\u0000\n\u0011\b\u0003!\u001b\u0000\u0010\" \u0019# \u001d\u0000\u0018\u001c\u0014\u0019\u0018\u001c\u000f\u001a\u0006\u0018#\u0015\u0018\u0006\u0005\u0013\u0017\u0005\u001a\f\u001c\u000b\u001a\u0010\u0012㙐㙐\u001c\u0013\u000e\u0006\u0011\u001c\u0000\u001d\u000b\u000e\u0004\u0012\u0016\f\u0012\u0010\u0018!\u001e\u0015\u0005\u0007\u000f\n\u0003\u001a\u000f\u0001㘦", (byte) (90 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr2);
        super(1, obj, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12;
        int i13 = f57168t0;
        int i14 = i13 + 37;
        f57169u0 = i14 % 128;
        int i15 = 0;
        if (i14 % 2 == 0) {
            int i16 = 87 / 0;
        }
        int i17 = i13 + 73;
        f57169u0 = i17 % 128;
        if (i17 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f57164p0;
        int i18 = 290255894;
        if (cArr != null) {
            int i19 = f57168t0 + 99;
            f57169u0 = i19 % 128;
            int i20 = i19 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i21 = 0;
            while (i21 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i21])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i18));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 45 - View.getDefaultSize(0, 0), Color.blue(0) + 1116);
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b12, b11, (byte) (b12 | 7), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i21] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i21++;
                    i18 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f57165q0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        char c10 = '0';
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 46, 1116 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            b(b14, b13, (byte) (b14 | 7), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i22 = setincludefontpadding.setDividerPadding;
                if (i22 >= i11) {
                    break;
                }
                char c11 = charArray[i22];
                setincludefontpadding.setY = c11;
                int i23 = i22 + 1;
                char c12 = charArray[i23];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                if (c11 == c12) {
                    cArr3[i22] = (char) (c11 - b10);
                    cArr3[i23] = (char) (c12 - b10);
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[i15] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", c10, i15) + 1), 27 - (ViewConfiguration.getScrollBarSize() >> 8), 2311 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b15 = (byte) i15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b15, (byte) v0.length, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i24 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i24) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 49103), 35 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 2544);
                            byte b16 = (byte) 0;
                            byte b17 = b16;
                            Object[] objArr9 = new Object[1];
                            b(b17, b16, b17, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i25 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i26 = setincludefontpadding.setDividerPadding;
                        cArr3[i26] = cArr[iIntValue2];
                        cArr3[i26 + 1] = cArr[i25];
                    } else {
                        int i27 = setincludefontpadding.setX;
                        int i28 = setincludefontpadding.setOnFocusChangeListener;
                        if (i27 == i28) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i24, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i29 = (i28 * cCharValue) + iA2;
                            int i30 = setincludefontpadding.setDividerPadding;
                            cArr3[i30] = cArr[(i27 * cCharValue) + iA];
                            cArr3[i30 + 1] = cArr[i29];
                        } else {
                            int i31 = (i27 * cCharValue) + i24;
                            int i32 = (i28 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i33 = setincludefontpadding.setDividerPadding;
                            cArr3[i33] = cArr[i31];
                            cArr3[i33 + 1] = cArr[i32];
                            int i34 = f57169u0 + 105;
                            f57168t0 = i34 % 128;
                            i12 = 2;
                            int i35 = i34 % 2;
                        }
                        setincludefontpadding.setDividerPadding += i12;
                        i15 = 0;
                        c10 = '0';
                    }
                }
                i12 = 2;
                setincludefontpadding.setDividerPadding += i12;
                i15 = 0;
                c10 = '0';
            }
        }
        for (int i36 = 0; i36 < i10; i36++) {
            cArr3[i36] = (char) (cArr3[i36] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r8 = 106 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            int r6 = 0 - r6
            r2 = -1
            byte[] r3 = com.mypinpad.tsdk.isolation.my.v0
            if (r3 != 0) goto L1c
            r8 = r7
            r4 = r3
            r7 = r6
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L38
        L1c:
            r5 = r8
            r8 = r7
            r7 = r5
        L1f:
            int r2 = r2 + 1
            byte r4 = (byte) r7
            r0[r2] = r4
            if (r2 != r6) goto L2e
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2e:
            r4 = r3[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L38:
            int r8 = r8 + 1
            int r6 = -r6
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.my.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        v0 = new byte[]{54, 83, MessageUtils.MESSAGE_21_NAK, -119};
    }

    public final void d(@NotNull rs rsVar) throws Throwable {
        int i10 = f57166r0 + 115;
        f57167s0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(rsVar, "");
            ul.setX((ul) this.receiver, rsVar);
        } else {
            Intrinsics.checkNotNullParameter(rsVar, "");
            ul.setX((ul) this.receiver, rsVar);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(rs rsVar) throws Throwable {
        int i10 = f57167s0 + 57;
        f57166r0 = i10 % 128;
        int i11 = i10 % 2;
        d(rsVar);
        if (i11 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f57167s0 + 81;
        f57166r0 = i12 % 128;
        if (i12 % 2 == 0) {
            return unit2;
        }
        throw null;
    }
}
