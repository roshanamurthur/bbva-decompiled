package com.mypinpad.tsdk.isolation;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/mypinpad/tsdk/i/ri;", "", "Ljava/io/Serializable;", "setX", "setY", "setCompoundDrawableTintBlendMode", "setDividerPadding", "setOnFocusChangeListener", "setLayoutAnimation"}, k = 1, mv = {1, 8, 0})
public final class ri implements Serializable {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final /* synthetic */ ri[] getNavBarTitleString;
    public static final ri setCompoundDrawableTintBlendMode;
    public static final ri setDividerPadding;
    public static final ri setLayoutAnimation;
    private static int setNavigationOnClickListener;
    private static int setOnDragListener;
    public static final ri setOnFocusChangeListener;
    private static long setOnLongClickListener;
    public static final ri setX;
    public static final ri setY;

    static {
        ri[] riVarArr;
        c();
        $10 = 0;
        $11 = 1;
        setNavigationOnClickListener = 0;
        setOnDragListener = 1;
        d();
        Object[] objArr = new Object[1];
        a("\ud850煪訨⏚粕閹⽳砖釕⫨䎺鵋㘗传飤ㆈ䭁\ue411㴳囸\uef98㥉剧\ueb2b", KeyEvent.keyCodeFromString("") + 43313, objArr);
        ri riVar = new ri(((String) objArr[0]).intern(), 0);
        setX = riVar;
        Object[] objArr2 = new Object[1];
        a("\ud85a屮鲆뽢凁瑘ᘫ⢜쭲\uedc0职ꈶ䒕杣㧽\udc5e︢邜덲嗾", TextUtils.getCapsMode("", 0, 0) + 8807, objArr2);
        ri riVar2 = new ri(((String) objArr2[0]).intern(), 1);
        setY = riVar2;
        Object[] objArr3 = new Object[1];
        a("\ud85a䵞\uf242杘豉ㅂꙟ쭮灢\ue572\u0a78뽬⑽䤜︊挜蠚㴂ꈇ휀簶\ue128ᘶ묬 唯韛濋铗", 38148 - Process.getGidForName(""), objArr3);
        ri riVar3 = new ri(((String) objArr3[0]).intern(), 2);
        setCompoundDrawableTintBlendMode = riVar3;
        Object[] objArr4 = new Object[1];
        a("\ud857엣\ue32c腂꺀䰯橭ិ㗙판\uf0b2黽밵婛", 7604 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr4);
        ri riVar4 = new ri(((String) objArr4[0]).intern(), 3);
        setDividerPadding = riVar4;
        Object[] objArr5 = new Object[1];
        a("\ud84bḑ哏誈셊܋緗뎋\uea42‒曐岊鍓줝࿔䖃뱁\uf206⣈溒ꕅ鬘퇗ស乃萕𧻓れ睍괍", 50753 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr5);
        ri riVar5 = new ri(((String) objArr5[0]).intern(), 4);
        setOnFocusChangeListener = riVar5;
        Object[] objArr6 = new Object[1];
        a("\ud84a릤᮲ﶮ徫ㆫ鎥疫ힹꦧ\u0ba7\uedbf侵↤莢斦잺妸㮱鶿羻톦뎱ᖳ\uf7a9䦠⮽趯", (ViewConfiguration.getLongPressTimeout() >> 16) + 25087, objArr6);
        ri riVar6 = new ri(((String) objArr6[0]).intern(), 5);
        setLayoutAnimation = riVar6;
        int i10 = setNavigationOnClickListener;
        int i11 = i10 + 3;
        setOnDragListener = i11 % 128;
        if (i11 % 2 == 0) {
            riVarArr = new ri[62];
            riVarArr[1] = riVar;
            riVarArr[0] = riVar2;
            riVarArr[2] = riVar3;
            riVarArr[5] = riVar4;
            riVarArr[3] = riVar5;
            riVarArr[5] = riVar6;
        } else {
            riVarArr = new ri[]{riVar, riVar2, riVar3, riVar4, riVar5, riVar6};
        }
        getNavBarTitleString = riVarArr;
        int i12 = i10 + 103;
        setOnDragListener = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public ri() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0182  */
    /* JADX WARN: Code duplicated, block: B:34:0x0183  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = $11 + 39;
        $10 = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = $11 + 11;
            $10 = i15 % 128;
            int i16 = i15 % i12;
            char c10 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i12] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c10);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 32 - MotionEvent.axisFromString(""), 1194 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (-b11), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (setOnLongClickListener ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 44 - (ViewConfiguration.getScrollBarSize() >> 8), 728 - View.getDefaultSize(0, 0));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 1), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i12 = 2;
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
            int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i17] = (char) jArr[i17];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (Process.myTid() >> 22) + 44, 728 - View.resolveSize(0, 0));
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                b(b14, b15, (byte) (b15 + 1), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 107
            byte[] r0 = com.mypinpad.tsdk.isolation.ri.$$a
            int r8 = r8 + 4
            int r7 = r7 * 2
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r8 = r8 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ri.b(byte, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        $$a = new byte[]{12, -82, -41, -21};
        $$b = 196;
    }

    public static void d() {
        setOnLongClickListener = 4273829296235625353L;
    }

    public static ri valueOf(String str) {
        int i10 = setNavigationOnClickListener + 59;
        setOnDragListener = i10 % 128;
        int i11 = i10 % 2;
        ri riVar = (ri) Enum.valueOf(ri.class, str);
        if (i11 == 0) {
            int i12 = 71 / 0;
        }
        int i13 = setOnDragListener + 19;
        setNavigationOnClickListener = i13 % 128;
        int i14 = i13 % 2;
        return riVar;
    }

    public static ri[] values() {
        int i10 = setNavigationOnClickListener + 111;
        setOnDragListener = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        ri[] riVarArr = (ri[]) getNavBarTitleString.clone();
        int i11 = setOnDragListener + 69;
        setNavigationOnClickListener = i11 % 128;
        if (i11 % 2 == 0) {
            return riVarArr;
        }
        throw null;
    }
}
