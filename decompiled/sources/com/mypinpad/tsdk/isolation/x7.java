package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import bk.s;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "c", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPayloadSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeCommonLibVersions$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n37#2,2:223\n*S KotlinDebug\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeCommonLibVersions$1\n*L\n143#1:223,2\n*E\n"})
final class x7 extends Lambda implements Function1<mo, Unit> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f61747q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f61748r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f61749s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f61750t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final byte[] f61751u0 = null;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f61752p0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Pair;", "", "Lcom/mypinpad/tsdk/i/mo;", "setY", "(Lkotlin/Pair;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<Pair<? extends String, ? extends String>, mo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f61753p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61754q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f61755r0;

        static {
            int i10 = f61754q0 + 63;
            f61755r0 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 16 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ mo a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i12;
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = i13 | (~(i14 | i15));
            int i17 = ~(i10 | i11);
            if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) == 1) {
                Pair pair = (Pair) objArr[1];
                Intrinsics.checkNotNullParameter(pair, "");
                mo moVar = new mo(new w7(pair));
                int i18 = f61755r0 + 73;
                f61754q0 = i18 % 128;
                int i19 = i18 % 2;
                return moVar;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int iIdentityHashCode = System.identityHashCode(aVar);
            int i20 = ~iIdentityHashCode;
            int i21 = ((-1112329217) & i20) | (1112329216 & iIdentityHashCode);
            int i22 = (-1112329217) & iIdentityHashCode;
            int i23 = ~((i22 & i21) | (i21 ^ i22));
            int i24 = ((i20 | iIdentityHashCode) & i20) | (-1314704389);
            int i25 = i24 ^ 1659759736;
            int i26 = i24 & 1659759736;
            int i27 = ~((i26 & i25) | (i25 ^ i26));
            int i28 = i23 & i27;
            int i29 = (i23 | i27) & (~i28);
            int i30 = ((i29 & i28) | (i29 ^ i28)) * 497;
            int i31 = 911383488 & i30;
            int i32 = ((((911383488 ^ i30) | i31) << 1) - (~(-((i30 | 911383488) & (~i31))))) - 1;
            int i33 = (-1659759737) ^ i20;
            int i34 = i20 & (-1659759737);
            int i35 = ~((i34 & i33) | (i33 ^ i34));
            int i36 = (i35 & 547430520) | (i35 ^ 547430520);
            int i37 = (-202375173) ^ iIdentityHashCode;
            int i38 = iIdentityHashCode & (-202375173);
            int i39 = ((~((i38 & i37) | (i37 ^ i38))) | i36) * 497;
            int i40 = i32 & i39;
            int i41 = -(-((i39 ^ i32) | i40));
            int i42 = (i40 & i41) + (i41 | i40);
            int iIdentityHashCode2 = System.identityHashCode(aVar);
            int i43 = ~iIdentityHashCode2;
            int i44 = i43 & 1347890435;
            int i45 = (i43 ^ 1347890435) | i44;
            int i46 = ~i45;
            int i47 = (i45 | i46) & i46;
            int i48 = -(~(((i47 & (-2128496858)) | ((-2128496858) ^ i47)) * (-1042)));
            int i49 = (497812836 ^ i48) + ((i48 & 497812836) << 1);
            int i50 = (i49 ^ (-1)) + (i49 << 1);
            int i51 = (i44 | ((-1347890436) & iIdentityHashCode2) | (1347890435 & iIdentityHashCode2)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
            int i52 = i50 ^ i51;
            int i53 = ((i50 & i51) | i52) << 1;
            int i54 = -i52;
            int i55 = (i53 ^ i54) + ((i53 & i54) << 1);
            int i56 = 2128496857 ^ iIdentityHashCode2;
            int i57 = iIdentityHashCode2 & 2128496857;
            int i58 = ~((i57 & i56) | (i56 ^ i57));
            int i59 = 75010 ^ i58;
            int i60 = i58 & 75010;
            int i61 = (i60 & i59) | (i59 ^ i60);
            int i62 = (i43 & (-2128496858)) | (2128496857 & i43) | ((~i43) & (-2128496858));
            int i63 = i62 & 1347890435;
            int i64 = (i62 | 1347890435) & (~i63);
            int i65 = ~((i64 & i63) | (i64 ^ i63));
            int i66 = ((i61 & i65) | ((~i65) & i61) | ((~i61) & i65)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
            Pair pair2 = (Pair) obj;
            Object[] objArr2 = new Object[2];
            if (i42 <= (i55 & i66) + (i66 | i55)) {
                objArr2[0] = aVar;
                objArr2[1] = pair2;
                return a(objArr2, -1487479209, 1487479210, System.identityHashCode(aVar));
            }
            objArr2[0] = aVar;
            objArr2[1] = pair2;
            mo moVarA = a(objArr2, -1487479209, 1487479210, System.identityHashCode(aVar));
            int i67 = 59 / 0;
            return moVarA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ mo invoke(Pair<? extends String, ? extends String> pair) {
            return a(new Object[]{this, pair}, -744005872, 744005872, System.identityHashCode(this));
        }
    }

    static {
        b();
        f61749s0 = 0;
        f61750t0 = 1;
        f61748r0 = 1;
        f61747q0 = -443079951;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(Map<String, String> map) {
        super(1);
        this.f61752p0 = map;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r7 = r7 + 1
            int r9 = r9 + 65
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.x7.f61751u0
            if (r2 != 0) goto L18
            r9 = r7
            r5 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r8
            goto L37
        L18:
            r3 = r1
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1d:
            int r9 = r9 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r8) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2e:
            r3 = r2[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L37:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.x7.a(int, short, int, java.lang.Object[]):void");
    }

    public static void b() {
        f61751u0 = new byte[]{27, 123, 116, -20};
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01de  */
    /* JADX WARN: Code duplicated, block: B:36:0x01df  */
    public final void c(@NotNull mo moVar) throws Throwable {
        int i10;
        int i11;
        Throwable cause;
        Intrinsics.checkNotNullParameter(moVar, "");
        int i12 = 0;
        int size = 8 - View.MeasureSpec.getSize(0);
        int scrollBarFadeDuration = 152 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
        int iMyTid = 6 - (Process.myTid() >> 22);
        char c10 = 1;
        Object[] objArr = new Object[1];
        int i13 = f61750t0 + 87;
        f61749s0 = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = "\u0000\ufffa\u0004\u0003\ufff6\u0007\u0004\uffff".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[size];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i16 = getnavbartitlestring.setY;
            if (i16 >= size) {
                break;
            }
            char c11 = charArray[i16];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
            char c12 = (char) (c11 + scrollBarFadeDuration);
            cArr[i16] = c12;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[c10] = Integer.valueOf(f61747q0);
                objArr2[i12] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(i12, i12), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 40, View.MeasureSpec.getMode(i12) + 483);
                    byte b10 = (byte) i12;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    a(b10, b11, (byte) (b11 + 1), objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55966 - (Process.myPid() >> 22)), 43 - Color.argb(0, 0, 0, 0), 2268 - (ViewConfiguration.getEdgeSlop() >> 16));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    a(b12, b13, b13, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                scrollBarFadeDuration = scrollBarFadeDuration;
                charArray = charArray;
                i12 = 0;
                c10 = 1;
                i14 = 2;
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
        if (iMyTid > 0) {
            getnavbartitlestring.setOnFocusChangeListener = iMyTid;
            char[] cArr2 = new char[size];
            System.arraycopy(cArr, 0, cArr2, 0, size);
            int i17 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, size - i17, i17);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i18, cArr, 0, size - i18);
            int i19 = f61749s0 + 105;
            f61750t0 = i19 % 128;
            i10 = 2;
            int i20 = i19 % 2;
        } else {
            i10 = 2;
        }
        int i21 = f61749s0 + 49;
        f61750t0 = i21 % 128;
        int i22 = i21 % i10;
        char[] cArr3 = new char[size];
        getnavbartitlestring.setY = 0;
        while (true) {
            int i23 = getnavbartitlestring.setY;
            if (i23 >= size) {
                break;
            }
            int i24 = f61749s0 + 115;
            f61750t0 = i24 % 128;
            int i25 = i24 % 2;
            cArr3[i23] = cArr[(size - i23) - 1];
            Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1860518195);
            if (method3 == null) {
                Class cls4 = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 55966), (ViewConfiguration.getWindowTouchSlop() >> 8) + 43, 2268 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                a(b14, b15, b15, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1860518195, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i26 = f61750t0 + 21;
            f61749s0 = i26 % 128;
            int i27 = i26 % 2;
        }
        String str2 = new String(cArr3);
        int i28 = f61749s0 + 117;
        f61750t0 = i28 % 128;
        if (i28 % 2 == 0) {
            i11 = 0;
            int i29 = 94 / 0;
            objArr[0] = str2;
        } else {
            i11 = 0;
            objArr[0] = str2;
        }
        String strIntern = ((String) objArr[i11]).intern();
        mn mnVar = new mn(s.toList(this.f61752p0).toArray(new Pair[i11]), a.f61753p0);
        Object[] objArr8 = new Object[3];
        objArr8[i11] = moVar;
        objArr8[1] = strIntern;
        objArr8[2] = mnVar;
        mo.setY(objArr8, 733397612, -733397606, System.identityHashCode(moVar));
        int i30 = f61748r0 + 27;
        int i31 = i30 % 128;
        if (i30 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
        int i10 = f61748r0;
        int i11 = i10 + 67;
        int i12 = i11 % 128;
        int i13 = i11 % 2;
        c(moVar);
        Unit unit = Unit.INSTANCE;
        if (i13 != 0) {
            int i14 = 50 / 0;
        }
        int i15 = i10 + 117;
        int i16 = i15 % 128;
        if (i15 % 2 == 0) {
            return unit;
        }
        throw null;
    }
}
