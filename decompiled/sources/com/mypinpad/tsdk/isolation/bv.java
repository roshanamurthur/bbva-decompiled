package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
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
final /* synthetic */ class bv extends FunctionReferenceImpl implements Function1<px, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f54733p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54734q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f54735r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f54736s0 = null;

    static {
        c();
        f54734q0 = 0;
        f54735r0 = 1;
        f54733p0 = -7629105110765938516L;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bv(ul ulVar) throws Throwable {
        Object[] objArr = new Object[1];
        a("㭓ⵝ\u175b祊捋啽뽒ꅥ譭ﵰ\ue714줘㌚┅།焠嬪䴢뜶駟菔\uf5dc\udfc8쇵⯽᷄߿槩厜䖕꾚醑﮲\uedb2ힲ㦙⎮ᑌ繙恺䩊뱊Ꙙ衸\uf27b\ue472츀", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 5639, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("㭓ቻ椗䀼鿓\uf6fb춾⒳牝䥦ꀘ＾훂ⷳҡ厦ꥊ聤\udf1a㘩\u0dcc擺뎄誣\ue04d㽒ᘓ洯䓄鏣\uea96솷ὲ瘔䴾ꓯ\uf3f6쪊↵罬噺괜萔폞⫣Ƅ墬똜赇\ue409㌦ૅ憠뢃鞴\ued5c쑪ጌ樱䇁飣\uf7c9캱\u2457猟䨱ꆖ\uf8f1힑⺪ј卮ꨝ脳\ud8dd㞿ງ斿덛詤\ue10a㠮ឆ滘䖆鲠\uea6e셭᠓眶仔ꗲﲂ쮔⅀硷圮껖藭\udcc3⯶Ũ", 10528 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
        super(1, ulVar, ul.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0169  */
    /* JADX WARN: Code duplicated, block: B:33:0x016a  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i11 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i11 >= charArray.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(charArray[i11]), setlayoutanimation, setlayoutanimation};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.getDefaultSize(0, 0) + 33, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1194);
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, (byte) (b11 - 1), b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i11] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f54733p0 ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Process.getGidForName("") + 45, 728 - Color.green(0));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
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
            int i12 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i12 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i12] = (char) jArr[i12];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 44, 729 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = 3 - r7
            int r8 = r8 * 3
            int r8 = r8 + 107
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.bv.f54736s0
            r2 = 0
            if (r1 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L1a:
            r3 = r2
        L1b:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bv.b(int, byte, int, java.lang.Object[]):void");
    }

    public static void c() {
        f54736s0 = new byte[]{64, 59, -42, 60};
    }

    public final void d(@NotNull px pxVar) throws Throwable {
        int i10 = f54735r0 + 75;
        f54734q0 = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(pxVar, "");
            ul.setDividerPadding((ul) this.receiver, pxVar);
        } else {
            Intrinsics.checkNotNullParameter(pxVar, "");
            ul.setDividerPadding((ul) this.receiver, pxVar);
            int i11 = 39 / 0;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(px pxVar) throws Throwable {
        int i10 = f54734q0 + 61;
        f54735r0 = i10 % 128;
        int i11 = i10 % 2;
        d(pxVar);
        Unit unit = Unit.INSTANCE;
        int i12 = f54735r0 + 11;
        f54734q0 = i12 % 128;
        if (i12 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
