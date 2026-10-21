package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import bk.p;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nOkHttpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,128:1\n483#2,7:129\n442#2:136\n392#2:137\n1238#3,4:138\n7#4,8:142\n*S KotlinDebug\n*F\n+ 1 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt\n*L\n31#1:129,7\n32#1:136\n32#1:137\n32#1:138,4\n40#1:142,8\n*E\n"})
public final class qe {

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.qe$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setX", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nOkHttpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt$addHttpLoggingInterceptor$1\n*L\n1#1,128:1\n*E\n"})
    public static final class AnonymousClass1 implements abr.setDividerPadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f57849a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f57850b = 1;
        public static final AnonymousClass1 setCompoundDrawableTintBlendMode = new AnonymousClass1();

        static {
            int i10 = f57849a;
            int i11 = (i10 & 40) + (i10 | 40);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            f57850b = i12 % 128;
            int i13 = i12 % 2;
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            String str = (String) objArr[1];
            int i13 = f57849a;
            int i14 = ((i13 ^ 24) + ((i13 & 24) << 1)) - 1;
            f57850b = i14 % 128;
            int i15 = i14 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            mt.setX(new Object[]{mr.getAmountFieldTextColor, str}, -225944049, 225944051, (int) System.currentTimeMillis());
            int i16 = f57850b;
            int i17 = i16 & 91;
            int i18 = ((i16 | 91) & (~i17)) + (i17 << 1);
            f57849a = i18 % 128;
            int i19 = i18 % 2;
            return null;
        }

        @Override // com.mypinpad.tsdk.i.abr.setDividerPadding
        public final void setX(@NotNull String str) {
            setCompoundDrawableTintBlendMode(new Object[]{this, str}, 796192381, -796192381, System.identityHashCode(this));
        }
    }

    @SourceDebugExtension({"SMAP\nOkHttpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt$addNonStandardCertPinning$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Util.kt\nokhttp3/internal/Util\n*L\n1#1,128:1\n1549#2:129\n1620#2,3:130\n1747#2,2:141\n1747#2,3:143\n1749#2:146\n629#3,8:133\n*S KotlinDebug\n*F\n+ 1 OkHttpUtils.kt\ncom/mypinpad/tsdk/internal/remote/OkHttpUtilsKt$addNonStandardCertPinning$1\n*L\n53#1:129\n53#1:130,3\n60#1:141,2\n71#1:143,3\n60#1:146\n56#1:133,8\n*E\n"})
    public static final class setY extends yd {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final char[] f57851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f57852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f57853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f57854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f57855h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f57856i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f57857j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f57858k = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<xn.setOnFocusChangeListener> f57859c;

        static {
            p();
            f57855h = 0;
            f57856i = 1;
            f57853f = 0;
            f57854g = 1;
            f57852e = -3272114952865835420L;
            f57851d = new char[]{24585, 45162, 49387, 4383, 8584, 29239, 33468, 50799, 5644, 26253, 46918, 34761, 54386, 50761, 5642, 26271, 46849, 34700, 54324, 9379, 29990, 17832, 37441, 58056, 13076, 989, 20584, 41195, 61819, 49646, 4493, 28184, 48796, 36625, 50783, 5644, 26249, 46871, 34711, 54372, 9386, 30005, 17845, 37448, 58057, 13136, 925, 49389, 4259, 24621, 45490, 33057, 53915, 8727, 29596, 17163, 38130, 58430, 13797, 1382, 22227, 42589, 63437, 50958, 5913, 26773, 47207};
        }

        public setY(List<xn.setOnFocusChangeListener> list) {
            this.f57859c = list;
        }

        /* JADX WARN: Code duplicated, block: B:39:0x01fa  */
        /* JADX WARN: Code duplicated, block: B:40:0x01fb  */
        public static void n(char c10, int i10, int i11, Object[] objArr) throws Throwable {
            Throwable cause;
            setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
            long[] jArr = new long[i11];
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            int i12 = f57856i + 93;
            f57855h = i12 % 128;
            int i13 = 2;
            int i14 = i12 % 2;
            while (true) {
                int i15 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i15 >= i11) {
                    break;
                }
                try {
                    Object[] objArr2 = {Integer.valueOf(f57851d[i10 + i15])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1832327647);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 43, MotionEvent.axisFromString("") + 729);
                        byte b10 = (byte) (-1);
                        Object[] objArr3 = new Object[1];
                        o((byte) (f57858k - i13), b10, (byte) (b10 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1832327647, method);
                    }
                    Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f57852e), Integer.valueOf(c10)};
                    Object method2 = map.get(2012362404);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (View.resolveSize(0, 0) + 46116), Drawable.resolveOpacity(0, 0) + 43, AndroidCharacter.getMirror('0') + 1728);
                        byte length = (byte) f57857j.length;
                        byte b11 = (byte) (length - 5);
                        Object[] objArr5 = new Object[1];
                        o(length, b11, (byte) (b11 + 1), objArr5);
                        String str = (String) objArr5[0];
                        Class<?> cls3 = Long.TYPE;
                        method2 = cls2.getMethod(str, cls3, cls3, cls3, Integer.TYPE);
                        map.put(2012362404, method2);
                    }
                    jArr[i15] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                    Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                    Object method3 = map.get(1606688712);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), 27 - TextUtils.getTrimmedLength(""), 2311 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr7 = new Object[1];
                        o(b12, b13, (byte) (b13 + 1), objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map.put(1606688712, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    i13 = 2;
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
            char[] cArr = new char[i11];
            setcompounddrawabletintblendmode.setDividerPadding = 0;
            while (true) {
                int i16 = setcompounddrawabletintblendmode.setDividerPadding;
                if (i16 >= i11) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i17 = f57855h + 29;
                f57856i = i17 % 128;
                int i18 = i17 % 2;
                cArr[i16] = (char) jArr[i16];
                Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Map map2 = setTextScaleX.setMaxEms;
                Object method4 = map2.get(1606688712);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 27 - (ViewConfiguration.getEdgeSlop() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 2311);
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr9 = new Object[1];
                    o(b14, b15, (byte) (b15 + 1), objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map2.put(1606688712, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0032). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void o(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 4
                int r6 = 72 - r6
                int r8 = r8 * 2
                int r0 = r8 + 1
                byte[] r0 = new byte[r0]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.qe.setY.f57857j
                if (r2 != 0) goto L16
                r6 = r7
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                goto L32
            L16:
                r3 = r1
            L17:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L28:
                r3 = r2[r7]
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r5
            L32:
                int r7 = r7 + r8
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qe.setY.o(short, short, short, java.lang.Object[]):void");
        }

        public static void p() {
            f57857j = new byte[]{85, -69, 57, -93};
            f57858k = 7;
        }

        @Override // com.mypinpad.tsdk.isolation.yd
        public final void setDividerPadding(@NotNull xp xpVar, @Nullable yf yfVar) throws Exception {
            Iterator it;
            Intrinsics.checkNotNullParameter(xpVar, "");
            Intrinsics.checkNotNull(yfVar);
            List<Certificate> list = (List) yf.setX(new Object[]{yfVar}, 937432037, -937432031, System.identityHashCode(yfVar));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Certificate certificate : list) {
                int i10 = f57853f + 103;
                f57854g = i10 % 128;
                int i11 = i10 % 2;
                Intrinsics.checkNotNull(certificate, "");
                arrayList.add((X509Certificate) certificate);
            }
            List<xn.setOnFocusChangeListener> list2 = this.f57859c;
            List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            Iterator<T> it2 = list2.iterator();
            int i12 = f57854g + 33;
            f57853f = i12 % 128;
            int i13 = i12 % 2;
            while (it2.hasNext()) {
                int i14 = f57853f + 45;
                f57854g = i14 % 128;
                if (i14 % 2 == 0) {
                    xn.setOnFocusChangeListener setonfocuschangelistener = (xn.setOnFocusChangeListener) it2.next();
                    yk compoundDrawableTintBlendMode = xpVar.setCompoundDrawableTintBlendMode();
                    yg ygVar = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode}, -534472234, 534472239, System.identityHashCode(compoundDrawableTintBlendMode));
                    ((Boolean) xn.setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener, (String) yg.setOnFocusChangeListener(new Object[]{ygVar}, -1565741557, 1565741570, System.identityHashCode(ygVar))}, -110600466, 110600471, System.identityHashCode(setonfocuschangelistener))).booleanValue();
                    throw null;
                }
                Object next = it2.next();
                xn.setOnFocusChangeListener setonfocuschangelistener2 = (xn.setOnFocusChangeListener) next;
                yk compoundDrawableTintBlendMode2 = xpVar.setCompoundDrawableTintBlendMode();
                yg ygVar2 = (yg) yk.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode2}, -534472234, 534472239, System.identityHashCode(compoundDrawableTintBlendMode2));
                if (!(!((Boolean) xn.setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener2, (String) yg.setOnFocusChangeListener(new Object[]{ygVar2}, -1565741557, 1565741570, System.identityHashCode(ygVar2))}, -110600466, 110600471, System.identityHashCode(setonfocuschangelistener2))).booleanValue())) {
                    if (listEmptyList.isEmpty()) {
                        listEmptyList = new ArrayList();
                    }
                    TypeIntrinsics.asMutableList(listEmptyList).add(next);
                    int i15 = f57853f + 85;
                    f57854g = i15 % 128;
                    int i16 = i15 % 2;
                }
            }
            if (listEmptyList.isEmpty()) {
                return;
            }
            long j10 = 0;
            if (!arrayList.isEmpty()) {
                int i17 = f57853f + 33;
                f57854g = i17 % 128;
                if (i17 % 2 == 0) {
                    it = arrayList.iterator();
                    int i18 = 57 / 0;
                } else {
                    it = arrayList.iterator();
                }
                while (it.hasNext()) {
                    X509Certificate x509Certificate = (X509Certificate) it.next();
                    Object[] objArr = new Object[1];
                    n((char) (Color.blue(0) + 42566), TextUtils.getOffsetBefore("", 0), 7 - ExpandableListView.getPackedPositionType(j10), objArr);
                    MessageDigest messageDigest = MessageDigest.getInstance(((String) objArr[0]).intern());
                    messageDigest.update(x509Certificate.getPublicKey().getEncoded(), 0, x509Certificate.getPublicKey().getEncoded().length);
                    byte[] bArrDigest = messageDigest.digest();
                    List<xn.setOnFocusChangeListener> list3 = listEmptyList;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        for (xn.setOnFocusChangeListener setonfocuschangelistener3 : list3) {
                            String str = (String) xn.setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener3}, -1501571853, 1501571853, System.identityHashCode(setonfocuschangelistener3));
                            Object[] objArr2 = new Object[1];
                            n((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ExpandableListView.getPackedPositionForGroup(0) > j10 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j10 ? 0 : -1)) + 7, View.combineMeasuredStates(0, 0) + 6, objArr2);
                            if (!Intrinsics.areEqual(str, ((String) objArr2[0]).intern())) {
                                Object[] objArr3 = new Object[1];
                                n((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + 13, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 21, objArr3);
                                throw new AssertionError(((String) objArr3[0]).intern());
                            }
                            abw abwVar = (abw) xn.setOnFocusChangeListener.setX(new Object[]{setonfocuschangelistener3}, 1361647551, -1361647550, System.identityHashCode(setonfocuschangelistener3));
                            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
                            if (abwVar.setOnFocusChangeListener(0, bArrDigest, 0, bArrDigest.length)) {
                                int i19 = f57854g + 41;
                                f57853f = i19 % 128;
                                int i20 = i19 % 2;
                                mr mrVar = mr.getAmountFieldTextColor;
                                Object[] objArr4 = new Object[1];
                                n((char) (KeyEvent.getDeadChar(0, 0) + 1714), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                                mt.setX(new Object[]{mrVar, ((String) objArr4[0]).intern()}, -225944049, 225944051, (int) System.currentTimeMillis());
                                return;
                            }
                            j10 = 0;
                        }
                    }
                    j10 = 0;
                }
            }
            Object[] objArr5 = new Object[1];
            n((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 34, KeyEvent.getDeadChar(0, 0) + 13, objArr5);
            throw new Exception(((String) objArr5[0]).intern());
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0171 A[Catch: all -> 0x0146, TRY_ENTER, TryCatch #2 {all -> 0x0146, blocks: (B:7:0x0038, B:34:0x0142, B:37:0x0148, B:46:0x0171, B:47:0x0174), top: B:53:0x0038 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v24 */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Throwable th2;
        ?? r10;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        int i19 = ((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16;
        if (i19 == 1) {
            yo yoVar = (yo) objArr[0];
            Intrinsics.checkNotNullParameter(yoVar, "");
            abx abxVar = new abx();
            yoVar.setY(abxVar);
            return abxVar.setOnEditorActionListener();
        }
        if (i19 == 2) {
            ym.setX setx = (ym.setX) objArr[0];
            List list = (List) objArr[1];
            Intrinsics.checkNotNullParameter(setx, "");
            Intrinsics.checkNotNullParameter(list, "");
            return setx;
        }
        ym ymVar = (ym) objArr[0];
        yk ykVar = (yk) objArr[1];
        Intrinsics.checkNotNullParameter(ymVar, "");
        Intrinsics.checkNotNullParameter(ykVar, "");
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                try {
                    yr dividerPadding = ((xp) ym.setY(new Object[]{ymVar, ykVar}, -1465602249, 1465602275, System.identityHashCode(ymVar))).setDividerPadding();
                    try {
                        Map<String, List<String>> y7 = qj.setY((ye) yr.setX(new Object[]{dividerPadding}, 1547100838, -1547100838, System.identityHashCode(dividerPadding)));
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, List<String>> entry : y7.entrySet()) {
                            if (!entry.getValue().isEmpty()) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p.mapCapacity(linkedHashMap.size()));
                        for (Object obj : linkedHashMap.entrySet()) {
                            linkedHashMap2.put(((Map.Entry) obj).getKey(), (String) CollectionsKt___CollectionsKt.first((List) ((Map.Entry) obj).getValue()));
                        }
                        int iIntValue = ((Integer) yr.setX(new Object[]{dividerPadding}, 151122101, -151122100, System.identityHashCode(dividerPadding))).intValue();
                        yn ynVar = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
                        String str = ynVar != null ? (String) yn.setX(new Object[]{ynVar}, 2103810995, -2103810994, System.identityHashCode(ynVar)) : null;
                        yn ynVar2 = (yn) yr.setX(new Object[]{dividerPadding}, -428621868, 428621887, System.identityHashCode(dividerPadding));
                        pw pwVar = new pw(iIntValue, linkedHashMap2, str, ynVar2 != null ? ynVar2.setX() : null);
                        if (dividerPadding != null) {
                            dividerPadding.close();
                        }
                        return Result.m5535constructorimpl(pwVar);
                    } catch (IOException e5) {
                        e = e5;
                        TerminalException terminalException = new TerminalException(10025, null, e);
                        mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                        throw terminalException;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    r10 = ykVar;
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th2;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th4) {
                th2 = th4;
                r10 = 0;
                if (r10 != 0) {
                    r10.close();
                }
                throw th2;
            }
        } catch (Throwable th5) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(th5));
        }
    }

    @NotNull
    public static final byte[] setOnFocusChangeListener(@NotNull yo yoVar) {
        return (byte[]) setDividerPadding(new Object[]{yoVar}, -1744861220, 1744861221, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final ym.setX setY(@NotNull ym.setX setx, @NotNull List<xn.setOnFocusChangeListener> list) {
        return (ym.setX) setDividerPadding(new Object[]{setx, list}, 1156490892, -1156490890, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final Object setDividerPadding(@NotNull ym ymVar, @NotNull yk ykVar) {
        return setDividerPadding(new Object[]{ymVar, ykVar}, -664672934, 664672934, (int) System.currentTimeMillis());
    }
}
