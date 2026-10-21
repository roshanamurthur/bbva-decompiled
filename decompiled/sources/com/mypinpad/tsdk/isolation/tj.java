package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.camera2.internal.n1;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import h2.e;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class tj {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f61090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f61091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f61092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f61094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f61095l = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ti f61096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final op f61097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f61098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final UUID f61099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final nr f61100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Future<?> f61101f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006*\u00020\u00000\u00002\n\u0010\u0003\u001a\u0006*\u00020\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/lang/Void;", "p0", "", "p1", "", "setX", "(Ljava/lang/Void;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAuthorisationHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AuthorisationHandler.kt\ncom/mypinpad/tsdk/internal/terminal/authorisation/AuthorisationHandler$handleAuthorisationRequestWithPin$2\n+ 2 Junkification.kt\ncom/mypinpad/common/bytes/JunkificationKt\n*L\n1#1,152:1\n13#2:153\n*S KotlinDebug\n*F\n+ 1 AuthorisationHandler.kt\ncom/mypinpad/tsdk/internal/terminal/authorisation/AuthorisationHandler$handleAuthorisationRequestWithPin$2\n*L\n77#1:153\n*E\n"})
    public static final class a extends Lambda implements Function2<Void, Throwable, Unit> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61102t0 = 0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61103u0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ byte[] f61104p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ th f61105q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ tj f61106r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<ro, Throwable, Unit> f61107s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(byte[] bArr, th thVar, tj tjVar, Function2<? super ro, ? super Throwable, Unit> function2) {
            super(2);
            this.f61104p0 = bArr;
            this.f61105q0 = thVar;
            this.f61106r0 = tjVar;
            this.f61107s0 = function2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x007a  */
        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            if (((i10 | i12) * 104) + ((~(i11 | (~i12) | i10)) * (-104)) + (((~(i13 | i14)) | (~(i14 | i12))) * 104) + (i11 * (-103)) + (i10 * (-103)) == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                int i15 = f61102t0;
                int i16 = i15 ^ 99;
                int i17 = (((i15 & 99) | i16) << 1) - i16;
                f61103u0 = i17 % 128;
                int i18 = i17 % 2;
                a(new Object[]{aVar, (Void) obj, (Throwable) obj2}, -649171460, 649171460, System.identityHashCode(aVar));
                Unit unit = Unit.INSTANCE;
                int i19 = f61102t0 + 121;
                f61103u0 = i19 % 128;
                if (i19 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            Throwable th2 = (Throwable) objArr[2];
            int i20 = f61102t0;
            int i21 = (i20 & 57) + (i20 | 57);
            f61103u0 = i21 % 128;
            if (i21 % 2 == 0) {
                Random.INSTANCE.nextBytes(aVar2.f61104p0);
                th thVar = aVar2.f61105q0;
                th.setX(new Object[]{thVar}, -1983854825, 1983854826, System.identityHashCode(thVar));
                tj.setCompoundDrawableTintBlendMode(aVar2.f61106r0);
                int i22 = 38 / 0;
                if (th2 != null) {
                    int i23 = f61103u0 + 57;
                    f61102t0 = i23 % 128;
                    int i24 = i23 % 2;
                    aVar2.f61107s0.invoke(rx.setDividerPadding(rx.setOnFocusChangeListener(th2)), th2);
                    int i25 = f61102t0;
                    int i26 = i25 & 63;
                    int i27 = i26 + ((i25 ^ 63) | i26);
                    f61103u0 = i27 % 128;
                    int i28 = i27 % 2;
                }
            } else {
                Random.INSTANCE.nextBytes(aVar2.f61104p0);
                th thVar2 = aVar2.f61105q0;
                th.setX(new Object[]{thVar2}, -1983854825, 1983854826, System.identityHashCode(thVar2));
                tj.setCompoundDrawableTintBlendMode(aVar2.f61106r0);
                if (th2 != null) {
                    int i29 = f61103u0 + 57;
                    f61102t0 = i29 % 128;
                    int i210 = i29 % 2;
                    aVar2.f61107s0.invoke(rx.setDividerPadding(rx.setOnFocusChangeListener(th2)), th2);
                    int i211 = f61102t0;
                    int i212 = i211 & 63;
                    int i213 = i212 + ((i211 ^ 63) | i212);
                    f61103u0 = i213 % 128;
                    int i214 = i213 % 2;
                }
            }
            int i30 = f61103u0;
            int i31 = (i30 & 35) + (i30 | 35);
            f61102t0 = i31 % 128;
            if (i31 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Void r3, Throwable th2) {
            return a(new Object[]{this, r3, th2}, -902263431, 902263432, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/getVersion;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/getVersion;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<getVersion, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<tg, Unit> f61108p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super tg, Unit> function1) {
            super(1);
            this.f61108p0 = function1;
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
            int i14 = ~i11;
            if ((((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13 != 1) {
                b bVar = (b) objArr[0];
                a(new Object[]{bVar, (getVersion) objArr[1]}, 117754958, -117754957, System.identityHashCode(bVar));
                return Unit.INSTANCE;
            }
            b bVar2 = (b) objArr[0];
            getVersion getversion = (getVersion) objArr[1];
            Function1<tg, Unit> function1 = bVar2.f61108p0;
            UUID uuidFromString = UUID.fromString(getversion.setCompoundDrawableTintBlendMode());
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
            function1.invoke(new tg(uuidFromString, getversion.setX(), getversion.setOnFocusChangeListener()));
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(getVersion getversion) {
            return a(new Object[]{this, getversion}, 1071287364, -1071287364, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006*\u00020\u00000\u00002\n\u0010\u0003\u001a\u0006*\u00020\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljava/lang/Void;", "p0", "", "p1", "", "c", "(Ljava/lang/Void;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function2<Void, Throwable, Unit> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int[] f61109s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61110t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f61111u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f61112w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final byte[] f61113x0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ th f61114p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ tj f61115q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<ro, Throwable, Unit> f61116r0;

        static {
            b();
            v0 = 0;
            f61112w0 = 1;
            f61110t0 = 0;
            f61111u0 = 1;
            f61109s0 = new int[]{1874305261, -1145272918, 300458528, -579397395, -12887918, 1965039500, -1234810443, 1814994017, 656787561, 700401333, 2054419058, 1234690519, 1254150181, -113006705, -1480053733, 1538342157, -410540606, 127441600};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(th thVar, tj tjVar, Function2<? super ro, ? super Throwable, Unit> function2) {
            super(2);
            this.f61114p0 = thVar;
            this.f61115q0 = tjVar;
            this.f61116r0 = function2;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = 108 - r7
                int r8 = r8 * 3
                int r0 = 1 - r8
                int r6 = r6 + 4
                byte[] r0 = new byte[r0]
                r1 = 0
                int r8 = 0 - r8
                byte[] r2 = com.mypinpad.tsdk.i.tj.c.f61113x0
                if (r2 != 0) goto L1a
                r7 = r6
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                goto L36
            L1a:
                r3 = r1
            L1b:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L2c:
                r3 = r2[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L36:
                int r6 = -r6
                int r6 = r6 + r8
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.tj.c.a(byte, int, short, java.lang.Object[]):void");
        }

        public static void b() {
            f61113x0 = new byte[]{92, -47, 0, -97};
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0063  */
        public final void c(Void r29, Throwable th2) throws Throwable {
            TerminalException terminalException;
            getDynamicButtonIconTextSpacingDp y7;
            int[] iArr;
            int i10;
            char[] cArr;
            Object method;
            int i11 = f61111u0 + 71;
            f61110t0 = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            tj tjVar = this.f61115q0;
            th thVar = this.f61114p0;
            char c10 = 0;
            int i14 = 1;
            if (i13 != 0) {
                th.setX(new Object[]{thVar}, -1983854825, 1983854826, System.identityHashCode(thVar));
                tj.setCompoundDrawableTintBlendMode(tjVar);
                throw null;
            }
            th.setX(new Object[]{thVar}, -1983854825, 1983854826, System.identityHashCode(thVar));
            tj.setCompoundDrawableTintBlendMode(tjVar);
            if (th2 == null) {
                return;
            }
            int i15 = f61111u0;
            int i16 = i15 + 89;
            f61110t0 = i16 % 128;
            int i17 = i16 % 2;
            if (th2 instanceof TerminalException) {
                terminalException = (TerminalException) th2;
                int i18 = i15 + 67;
                f61110t0 = i18 % 128;
                int i19 = i18 % 2;
            } else {
                terminalException = null;
            }
            if (terminalException != null) {
                int i20 = f61110t0 + 13;
                f61111u0 = i20 % 128;
                int i21 = i20 % 2;
                String string = Integer.valueOf(terminalException.getErrorCode()).toString();
                if (string != null) {
                    y7 = getDisplayExponent.setY(string);
                } else {
                    y7 = null;
                }
            } else {
                y7 = null;
            }
            mu.setCompoundDrawableTintBlendMode(new Object[]{130016, y7, th2}, -1087921663, 1087921663, 130016);
            mr mrVar = mr.setOnFocusChangeListener;
            int[] iArr2 = {935532753, 980647331, 728225253, -1392730794, -1201040919, -716222616, -1972326331, -1102398519, -614222979, -1972791552};
            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20;
            setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
            char[] cArr2 = new char[4];
            char[] cArr3 = new char[20];
            int[] iArr3 = f61109s0;
            byte[] bArr = f61113x0;
            if (iArr3 != null) {
                int i22 = v0 + 119;
                f61112w0 = i22 % 128;
                int i23 = i22 % 2;
                int length = iArr3.length;
                iArr = new int[length];
                int i24 = 0;
                while (i24 < length) {
                    int i25 = v0 + 75;
                    f61112w0 = i25 % 128;
                    int i26 = i25 % i12;
                    try {
                        Object[] objArr = new Object[i14];
                        objArr[c10] = Integer.valueOf(iArr3[i24]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(1833429914);
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(0L), '\\' - AndroidCharacter.getMirror('0'), ExpandableListView.getPackedPositionGroup(0L) + 728);
                            byte b10 = bArr[2];
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr2 = new Object[1];
                            a(b11, (byte) (-b11), b10, objArr2);
                            method2 = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(1833429914, method2);
                        }
                        iArr[i24] = ((Integer) ((Method) method2).invoke(null, objArr)).intValue();
                        i24++;
                        length = length;
                        i12 = 2;
                        c10 = 0;
                        i14 = 1;
                    } catch (Throwable th3) {
                        Throwable cause = th3.getCause();
                        if (cause == null) {
                            throw th3;
                        }
                        throw cause;
                    }
                }
            } else {
                iArr = iArr3;
            }
            int length2 = iArr.length;
            int[] iArr4 = new int[length2];
            if (iArr3 != null) {
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int i27 = 0;
                while (i27 < length3) {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i27])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1833429914);
                    if (method3 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionGroup(0L) + 44, TextUtils.getOffsetBefore("", 0) + 728);
                        byte b12 = bArr[2];
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr4 = new Object[1];
                        a(b13, (byte) (-b13), b12, objArr4);
                        method3 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                        map2.put(1833429914, method3);
                    }
                    iArr5[i27] = ((Integer) ((Method) method3).invoke(null, objArr3)).intValue();
                    i27++;
                    length3 = length3;
                    iArr3 = iArr3;
                    scrollBarFadeDuration = scrollBarFadeDuration;
                    cArr3 = cArr3;
                }
                i10 = scrollBarFadeDuration;
                cArr = cArr3;
                int i28 = f61112w0 + 115;
                v0 = i28 % 128;
                int i29 = i28 % 2;
                iArr3 = iArr5;
            } else {
                i10 = scrollBarFadeDuration;
                cArr = cArr3;
            }
            char c11 = 0;
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            setonlongclicklistener.setDividerPadding = 0;
            while (true) {
                int i30 = setonlongclicklistener.setDividerPadding;
                if (i30 >= 10) {
                    mt.setX(new Object[]{new String(cArr, 0, i10).intern()}, 1189439426, -1189439420, (int) System.currentTimeMillis());
                    this.f61116r0.invoke(rx.setDividerPadding(rx.setOnFocusChangeListener(th2)), th2);
                    int i31 = f61110t0 + 43;
                    f61111u0 = i31 % 128;
                    int i32 = i31 % 2;
                    return;
                }
                int i33 = iArr2[i30];
                char c12 = (char) (i33 >> 16);
                cArr2[c11] = c12;
                char c13 = (char) i33;
                cArr2[1] = c13;
                int i34 = iArr2[i30 + 1];
                char c14 = (char) (i34 >> 16);
                cArr2[2] = c14;
                char c15 = (char) i34;
                cArr2[3] = c15;
                setonlongclicklistener.setY = (c12 << 16) + c13;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c14 << 16) + c15;
                setOnLongClickListener.setX(iArr4);
                int i35 = 0;
                for (int i36 = 16; i35 < i36; i36 = 16) {
                    int i37 = setonlongclicklistener.setY ^ iArr4[i35];
                    setonlongclicklistener.setY = i37;
                    Object[] objArr5 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i37)), setonlongclicklistener, setonlongclicklistener};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method4 = map3.get(-350984188);
                    if (method4 == null) {
                        method4 = ((Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 41 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.getOffsetBefore("", 0) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(-350984188, method4);
                    }
                    int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr5)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i35++;
                }
                int i38 = setonlongclicklistener.setY;
                int i39 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                int i40 = i38 ^ iArr4[16];
                setonlongclicklistener.setCompoundDrawableTintBlendMode = i40;
                int i41 = i39 ^ iArr4[17];
                setonlongclicklistener.setY = i41;
                cArr2[0] = (char) (i41 >>> 16);
                cArr2[1] = (char) i41;
                cArr2[2] = (char) (i40 >>> 16);
                cArr2[3] = (char) i40;
                setOnLongClickListener.setX(iArr4);
                int i42 = setonlongclicklistener.setDividerPadding * 2;
                cArr[i42] = cArr2[0];
                cArr[i42 + 1] = cArr2[1];
                cArr[i42 + 2] = cArr2[2];
                cArr[i42 + 3] = cArr2[3];
                Object[] objArr6 = {setonlongclicklistener, setonlongclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object obj = map4.get(-147294223);
                if (obj != null) {
                    method = obj;
                } else {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 1), TextUtils.lastIndexOf("", '0') + 42, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 482);
                    byte b14 = bArr[2];
                    Object[] objArr7 = new Object[1];
                    a((byte) (b14 - 1), b14, b14, objArr7);
                    method = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map4.put(-147294223, method);
                }
                ((Method) method).invoke(null, objArr6);
                c11 = 0;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Void r3, Throwable th2) throws Throwable {
            int i10 = f61111u0 + 67;
            f61110t0 = i10 % 128;
            int i11 = i10 % 2;
            c(r3, th2);
            if (i11 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i12 = f61110t0 + 105;
            f61111u0 = i12 % 128;
            if (i12 % 2 != 0) {
                return unit2;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006*\u00020\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/ti$setOnFocusChangeListener;", "p0", "", "c", "(Lcom/mypinpad/tsdk/i/ti$setOnFocusChangeListener;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends Lambda implements Function1<ti.setOnFocusChangeListener, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f61117q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61118r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61119s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f61120t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f61121u0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<tg, Unit> f61122p0;

        static {
            b();
            f61120t0 = 0;
            f61118r0 = 0;
            f61119s0 = 1;
            f61117q0 = -443080031;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super tg, Unit> function1) {
            super(1);
            this.f61122p0 = function1;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0030  */
        /* JADX WARN: Code duplicated, block: B:8:0x0028  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:11:0x003a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0030
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r0 = 1 - r6
                int r7 = r7 * 4
                int r7 = 3 - r7
                int r8 = 66 - r8
                byte[] r0 = new byte[r0]
                r1 = 0
                int r6 = 0 - r6
                byte[] r2 = com.mypinpad.tsdk.i.tj.d.f61121u0
                if (r2 != 0) goto L1b
                r8 = r7
                r4 = r1
                r3 = r2
                r7 = r6
                r2 = r0
                r0 = r9
                r9 = r8
                goto L3a
            L1b:
                r3 = r1
                r5 = r8
                r8 = r7
                r7 = r5
            L1f:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r8 = r8 + 1
                int r4 = r3 + 1
                if (r3 != r6) goto L30
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L30:
                r3 = r2[r8]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L3a:
                int r6 = r6 + r8
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.tj.d.a(byte, byte, byte, java.lang.Object[]):void");
        }

        public static void b() {
            f61121u0 = new byte[]{6, 118, -83, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE};
        }

        public final void c(ti.setOnFocusChangeListener setonfocuschangelistener) throws Throwable {
            char c10;
            long j10;
            int i10 = 0;
            String string = ((UUID) ti.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1488568400, 1488568400, System.identityHashCode(setonfocuschangelistener))).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            getDynamicButtonIconTextSpacingDp y7 = getDisplayExponent.setY(string);
            int i11 = 2;
            mu.setCompoundDrawableTintBlendMode(new Object[]{130015, y7, null, 4}, -1968587119, 1968587120, 130015);
            mr mrVar = mr.setCompoundDrawableTintBlendMode;
            int packedPositionGroup = 31 - ExpandableListView.getPackedPositionGroup(0L);
            int iBlue = Color.blue(0) + 224;
            int iMakeMeasureSpec = 24 - View.MeasureSpec.makeMeasureSpec(0, 0);
            int i12 = f61120t0 + 123;
            int i13 = i12 % 128;
            int i14 = i12 % 2;
            int i15 = i13 + 43;
            f61120t0 = i15 % 128;
            int i16 = i15 % 2;
            char[] charArray = "\f\ufffa\r\u0002\b\u0007ﾹ\u000b\ufffe\f\t\b\u0007\f\ufffeﾹ\u000b\ufffe￼\ufffe\u0002\u000f\ufffe�\ufffa\u000e\r\u0001\b\u000b\u0002".toCharArray();
            getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
            char[] cArr = new char[packedPositionGroup];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i17 = getnavbartitlestring.setY;
                if (i17 >= packedPositionGroup) {
                    break;
                }
                int i18 = f61120t0 + 79;
                int i19 = i18 % 128;
                int i20 = i18 % i11;
                char c11 = charArray[i17];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
                char c12 = (char) (c11 + iBlue);
                cArr[i17] = c12;
                try {
                    Object[] objArr = new Object[i11];
                    objArr[1] = Integer.valueOf(f61117q0);
                    objArr[i10] = Integer.valueOf(c12);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(133002375);
                    if (method != null) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        Class cls = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 41, 484 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        byte b10 = (byte) i10;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b10, b11, b11, objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2);
                        map.put(133002375, method);
                    }
                    cArr[i17] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                    Object method2 = map.get(1860518195);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 55966), 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), TextUtils.getOffsetBefore("", 0) + 2268);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        a(b12, b13, (byte) (b13 + 1), objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(1860518195, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    iBlue = iBlue;
                    i11 = 2;
                    i10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            if (iMakeMeasureSpec > 0) {
                getnavbartitlestring.setOnFocusChangeListener = iMakeMeasureSpec;
                char[] cArr2 = new char[packedPositionGroup];
                c10 = 0;
                System.arraycopy(cArr, 0, cArr2, 0, packedPositionGroup);
                int i21 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, 0, cArr, packedPositionGroup - i21, i21);
                int i22 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, i22, cArr, 0, packedPositionGroup - i22);
            } else {
                c10 = 0;
            }
            String strF = n1.f(cArr);
            Object[] objArr5 = new Object[2];
            objArr5[c10] = mrVar;
            objArr5[1] = strF;
            mt.setX(objArr5, 135701020, -135701017, (int) System.currentTimeMillis());
            Object[] objArr6 = new Object[1];
            objArr6[c10] = setonfocuschangelistener;
            UUID uuid = (UUID) ti.setOnFocusChangeListener.setOnFocusChangeListener(objArr6, -1488568400, 1488568400, System.identityHashCode(setonfocuschangelistener));
            Object[] objArr7 = new Object[1];
            objArr7[c10] = setonfocuschangelistener;
            byte[] bArr = (byte[]) ti.setOnFocusChangeListener.setOnFocusChangeListener(objArr7, 1392057310, -1392057309, System.identityHashCode(setonfocuschangelistener));
            Object[] objArr8 = new Object[1];
            objArr8[c10] = setonfocuschangelistener;
            this.f61122p0.invoke(new tg(uuid, bArr, (byte[]) ti.setOnFocusChangeListener.setOnFocusChangeListener(objArr8, -1484013095, 1484013098, System.identityHashCode(setonfocuschangelistener))));
            int i23 = f61119s0 + 29;
            f61118r0 = i23 % 128;
            int i24 = i23 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ti.setOnFocusChangeListener setonfocuschangelistener) throws Throwable {
            int i10 = f61119s0 + 125;
            f61118r0 = i10 % 128;
            int i11 = i10 % 2;
            c(setonfocuschangelistener);
            Unit unit = Unit.INSTANCE;
            int i12 = f61118r0 + 79;
            f61119s0 = i12 % 128;
            if (i12 % 2 != 0) {
                return unit;
            }
            throw null;
        }
    }

    static {
        e();
        f61094k = 1;
        f61092i = 0;
        f61093j = 1;
        f61090g = -1228586415049612591L;
        f61091h = -443080100;
    }

    public tj(@NotNull ti tiVar, @NotNull op opVar, @NotNull String str, @NotNull UUID uuid, @NotNull nr nrVar) {
        Intrinsics.checkNotNullParameter(tiVar, "");
        Intrinsics.checkNotNullParameter(opVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(nrVar, "");
        this.f61096a = tiVar;
        this.f61097b = opVar;
        this.f61098c = str;
        this.f61099d = uuid;
        this.f61100e = nrVar;
    }

    public static getVersion a(getEnableLocalAttestationForDebugBuilds getenablelocalattestationfordebugbuilds, setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled, byte[] bArr, tj tjVar, th thVar) {
        Intrinsics.checkNotNullParameter(getenablelocalattestationfordebugbuilds, "");
        Intrinsics.checkNotNullParameter(setmeasurewithlargestchildenabled, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(tjVar, "");
        Intrinsics.checkNotNullParameter(thVar, "");
        byte[] bArr2 = (byte[]) bArr.clone();
        String str = tjVar.f61098c;
        String string = tjVar.f61099d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        so soVar = (so) th.setX(new Object[]{thVar}, -1103467503, 1103467506, System.identityHashCode(thVar));
        String string2 = tjVar.f61097b.toString();
        byte[] bArr3 = (byte[]) th.setX(new Object[]{thVar}, 1654300703, -1654300701, System.identityHashCode(thVar));
        String str2 = (String) th.setX(new Object[]{thVar}, -969777703, 969777707, System.identityHashCode(thVar));
        byte[] bArr4 = (byte[]) ((byte[]) th.setX(new Object[]{thVar}, -1109730590, 1109730595, System.identityHashCode(thVar))).clone();
        UUID uuid = (UUID) th.setX(new Object[]{thVar}, -464429737, 464429737, System.identityHashCode(thVar));
        return getenablelocalattestationfordebugbuilds.setOnFocusChangeListener(setmeasurewithlargestchildenabled, bArr2, new qg(str, string, soVar, string2, bArr3, str2, bArr4, uuid != null ? uuid.toString() : null)).get();
    }

    public static void b(int i10, Object[] objArr) throws Throwable {
        int i11 = f61094k;
        int i12 = i11 + 15;
        int i13 = i12 % 128;
        if (i12 % 2 != 0) {
            "໒ມꍄ﹦洯戔\uf33b饵㛊欈똵儭绊匾滪⧈ꘉ\u1bf8⚤\ue180\uee5d쎯Ỉ롃ឯ詸흕瀜忱爅".toCharArray();
            throw null;
        }
        char[] charArray = "໒ມꍄ﹦洯戔\uf33b饵㛊欈똵儭绊匾滪⧈ꘉ\u1bf8⚤\ue180\uee5d쎯Ỉ롃ឯ詸흕瀜忱爅".toCharArray();
        int i14 = i11 + 83;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        setOnDragListener setondraglistener = new setOnDragListener();
        long j10 = f61090g;
        char[] y7 = setOnDragListener.setY(2122665171656649951L ^ j10, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i17 = setondraglistener.setDividerPadding;
            if (i17 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i18 = i17 - 4;
            setondraglistener.setX = i18;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i17] ^ y7[i17 % 4]), Long.valueOf(i18), Long.valueOf(j10)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9779 - KeyEvent.normalizeMetaState(0)), 43 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") + 3187);
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.blue(0) + 52, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3028);
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr4 = new Object[1];
                    d(b11, b11, b10, objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void c(int i10, int i11, int i12, Object[] objArr) throws Throwable {
        char[] charArray;
        int i13 = f61094k;
        int i14 = i13 + 5;
        int i15 = i14 % 128;
        int i16 = 2;
        int i17 = 0;
        if (i14 % 2 != 0) {
            charArray = "\u0007\ufff9\ufff8�\u0007\u0004\u0003".toCharArray();
            int i18 = 23 / 0;
        } else {
            charArray = "\u0007\ufff9\ufff8�\u0007\u0004\u0003".toCharArray();
        }
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i19 = getnavbartitlestring.setY;
            if (i19 >= i10) {
                break;
            }
            char c10 = charArray[i19];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i19] = c11;
            try {
                Object[] objArr2 = new Object[i16];
                objArr2[1] = Integer.valueOf(f61091h);
                objArr2[i17] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0', i17, i17) + 1), 41 - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 483);
                    byte b10 = (byte) (-1);
                    byte b11 = (byte) (b10 + 1);
                    Object[] objArr3 = new Object[1];
                    d(b11, (byte) (b11 | 51), b10, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 55966), 42 - TextUtils.indexOf((CharSequence) "", '0'), 2267 - TextUtils.lastIndexOf("", '0'));
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    d(b13, (byte) (b13 | 52), b12, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                charArray = charArray;
                i16 = 2;
                i17 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        if (i12 > 0) {
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i20, i20);
            int i21 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i21, cArr, 0, i10 - i21);
        }
        int i22 = i13 + 117;
        int i23 = i22 % 128;
        int i24 = i22 % 2;
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void d(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r9 = r9 + 4
            int r8 = 117 - r8
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.tj.f61095l
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L33
        L17:
            r3 = r1
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r0[r3] = r5
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r2[r9]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L33:
            int r7 = -r7
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tj.d(byte, byte, int, java.lang.Object[]):void");
    }

    public static void e() {
        f61095l = new byte[]{122, -107, 66, -93};
    }

    public static final /* synthetic */ void setCompoundDrawableTintBlendMode(tj tjVar) {
        int i10 = f61092i;
        int i11 = i10 + 77;
        f61093j = i11 % 128;
        int i12 = i11 % 2;
        tjVar.f61101f = null;
        int i13 = i10 + 59;
        f61093j = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i13 = f61093j + 11;
        f61092i = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i15 = f61092i + 69;
        f61093j = i15 % 128;
        int i16 = i15 % 2;
        return null;
    }

    public final synchronized void setY() {
        int i10;
        try {
            int i11 = f61093j + 105;
            f61092i = i11 % 128;
            int i12 = i11 % 2;
            mr mrVar = mr.setCompoundDrawableTintBlendMode;
            Object[] objArr = new Object[1];
            c(6 - ((byte) KeyEvent.getModifierMetaStateMask()), View.MeasureSpec.getMode(0) + 240, 1 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
            Future<?> future = this.f61101f;
            if (future != null && !future.isDone()) {
                Future<?> future2 = this.f61101f;
                if (future2 != null) {
                    future2.cancel(true);
                    i10 = f61092i + 15;
                    f61093j = i10 % 128;
                } else {
                    i10 = f61092i + 87;
                    f61093j = i10 % 128;
                }
                int i13 = i10 % 2;
                this.f61101f = null;
            }
            int i14 = f61092i + 119;
            f61093j = i14 % 128;
            int i15 = i14 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [com.mypinpad.tsdk.i.r9] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.mypinpad.tsdk.i.q9] */
    public final synchronized void setDividerPadding(@NotNull final setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled, @NotNull final getEnableLocalAttestationForDebugBuilds getenablelocalattestationfordebugbuilds, @NotNull final th thVar, @NotNull Function1<? super tg, Unit> function1, @NotNull Function2<? super ro, ? super Throwable, Unit> function2) {
        int i10 = f61092i + 13;
        f61093j = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setmeasurewithlargestchildenabled, "");
        Intrinsics.checkNotNullParameter(getenablelocalattestationfordebugbuilds, "");
        Intrinsics.checkNotNullParameter(thVar, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        if (!this.f61100e.setOnFocusChangeListener()) {
            int i12 = f61092i + 25;
            f61093j = i12 % 128;
            if (i12 % 2 == 0) {
                function2.invoke(ro.setCompoundDrawableTintBlendMode, null);
                int i13 = 53 / 0;
            } else {
                function2.invoke(ro.setCompoundDrawableTintBlendMode, null);
            }
            return;
        }
        uv.Companion companion = uv.INSTANCE;
        final byte[] onFocusChangeListener = uv.Companion.setOnFocusChangeListener((byte[]) th.setX(new Object[]{thVar}, 1654300703, -1654300701, System.identityHashCode(thVar)));
        CompletableFuture completableFutureSupplyAsync = CompletableFuture.supplyAsync(new Supplier() { // from class: com.mypinpad.tsdk.i.q9
            @Override // java.util.function.Supplier
            public final Object get() {
                return tj.a(getenablelocalattestationfordebugbuilds, setmeasurewithlargestchildenabled, onFocusChangeListener, this, thVar);
            }
        });
        this.f61101f = completableFutureSupplyAsync;
        CompletableFuture completableFutureThenAccept = completableFutureSupplyAsync.thenAccept((Consumer) new e(new b(function1), 1));
        final a aVar = new a(onFocusChangeListener, thVar, this, function2);
        completableFutureThenAccept.whenComplete((BiConsumer) new BiConsumer() { // from class: com.mypinpad.tsdk.i.r9
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Function2 function3 = aVar;
                int i14 = tj.f61092i + 7;
                tj.f61093j = i14 % 128;
                int i15 = i14 % 2;
                Intrinsics.checkNotNullParameter(function3, "");
                function3.invoke(obj, obj2);
                int i16 = tj.f61093j + 103;
                tj.f61092i = i16 % 128;
                int i17 = i16 % 2;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [com.mypinpad.tsdk.i.p9] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.mypinpad.tsdk.i.o9] */
    public final synchronized void setDividerPadding(@NotNull th thVar, @NotNull Function1<? super tg, Unit> function1, @NotNull Function2<? super ro, ? super Throwable, Unit> function2) {
        try {
            Intrinsics.checkNotNullParameter(thVar, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function2, "");
            mr mrVar = mr.setCompoundDrawableTintBlendMode;
            Object[] objArr = new Object[1];
            b(ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr);
            mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
            mu.setCompoundDrawableTintBlendMode(new Object[]{130013, null, null, 6}, -1968587119, 1968587120, 130013);
            pc.setY(new pi(this.f61099d));
            if (!this.f61100e.setOnFocusChangeListener()) {
                int i10 = f61093j + 19;
                f61092i = i10 % 128;
                int i11 = i10 % 2;
                function2.invoke(ro.setCompoundDrawableTintBlendMode, null);
                int i12 = f61092i + 121;
                f61093j = i12 % 128;
                int i13 = i12 % 2;
            }
            CompletableFuture x4 = ti.setX(this.f61096a, (byte[]) th.setX(new Object[]{thVar}, 1654300703, -1654300701, System.identityHashCode(thVar)), (so) th.setX(new Object[]{thVar}, -1103467503, 1103467506, System.identityHashCode(thVar)), this.f61099d, (String) th.setX(new Object[]{thVar}, -969777703, 969777707, System.identityHashCode(thVar)), (byte[]) ((byte[]) th.setX(new Object[]{thVar}, -1109730590, 1109730595, System.identityHashCode(thVar))).clone(), (UUID) th.setX(new Object[]{thVar}, -464429737, 464429737, System.identityHashCode(thVar)));
            this.f61101f = x4;
            final d dVar = new d(function1);
            CompletableFuture completableFutureThenAccept = x4.thenAccept((Consumer) new Consumer() { // from class: com.mypinpad.tsdk.i.o9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Function1 function3 = dVar;
                    int i14 = tj.f61091h;
                    tj.setDividerPadding(new Object[]{function3, obj}, -1341239782, 1341239782, (int) System.currentTimeMillis());
                }
            });
            final c cVar = new c(thVar, this, function2);
            completableFutureThenAccept.whenComplete((BiConsumer) new BiConsumer() { // from class: com.mypinpad.tsdk.i.p9
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Function2 function3 = cVar;
                    int i14 = tj.f61093j + 39;
                    tj.f61092i = i14 % 128;
                    if (i14 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(function3, "");
                        function3.invoke(obj, obj2);
                    } else {
                        Intrinsics.checkNotNullParameter(function3, "");
                        function3.invoke(obj, obj2);
                        int i15 = 4 / 0;
                    }
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
