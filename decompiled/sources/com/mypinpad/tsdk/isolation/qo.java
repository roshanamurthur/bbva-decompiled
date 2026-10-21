package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.PointerIconCompat;
import bk.q;
import com.esotericsoftware.asm.Opcodes;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/qo;", "", "", "p0", "p1", "p2", "p3", "Lcom/mypinpad/tsdk/i/mo;", "setX", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mypinpad/tsdk/i/mo;", "Lcom/mypinpad/tsdk/i/applicationCreated;", "", "Lcom/mypinpad/tsdk/i/setSubtitleTextAppearance;", "setY", "(Lcom/mypinpad/tsdk/i/applicationCreated;Ljava/util/List;)Lcom/mypinpad/tsdk/i/mo;", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
public final class qo {

    @NotNull
    public static final qo INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int[] f57923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f57926d = null;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPayloadSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeContinueAttestationRequest$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n37#2,2:223\n*S KotlinDebug\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeContinueAttestationRequest$1\n*L\n21#1:223,2\n*E\n"})
    public static final class a extends Lambda implements Function1<mo, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final long f57927r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final int f57928s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final char f57929t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f57930u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final int f57931w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final byte[] f57932x0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ applicationCreated f57933p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ List<setSubtitleTextAppearance> f57934q0;

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.qo$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setSubtitleTextAppearance;", "Lcom/mypinpad/tsdk/i/mo;", "setY", "(Lcom/mypinpad/tsdk/i/setSubtitleTextAppearance;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class C0234a extends Lambda implements Function1<setSubtitleTextAppearance, mo> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final C0234a f57935p0 = new C0234a();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f57936q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f57937r0 = 1;

            static {
                int i10 = f57936q0;
                int i11 = (((i10 ^ 77) | (i10 & 77)) << 1) - (((~i10) & 77) | (i10 & (-78)));
                f57937r0 = i11 % 128;
                if (i11 % 2 == 0) {
                    throw null;
                }
            }

            public C0234a() {
                super(1);
            }

            public static /* synthetic */ mo a(Object[] objArr, int i10, int i11, int i12) {
                mo moVarA;
                int i13 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
                int i14 = ~i11;
                int i15 = ~(i14 | i10);
                int i16 = ~(i10 | i12);
                int i17 = ((i15 | i16) * (-814)) + i13;
                int i18 = ~(i14 | (~i12));
                int i19 = ~i10;
                int i20 = ~(i19 | i11);
                if ((((~(i19 | i12)) | i20 | (~(i11 | i12))) * 407) + ((i18 | i20 | i16) * 407) + i17 != 1) {
                    setSubtitleTextAppearance setsubtitletextappearance = (setSubtitleTextAppearance) objArr[1];
                    Intrinsics.checkNotNullParameter(setsubtitletextappearance, "");
                    moVarA = new mo(new t7(setsubtitletextappearance));
                    int i21 = f57937r0;
                    int i22 = i21 & 5;
                    int i23 = (((i21 | 5) & (~i22)) - (~(-(-(i22 << 1))))) - 1;
                    f57936q0 = i23 % 128;
                    if (i23 % 2 != 0) {
                        throw null;
                    }
                } else {
                    C0234a c0234a = (C0234a) objArr[0];
                    Object obj = objArr[1];
                    int i24 = f57936q0;
                    int i25 = i24 & 103;
                    int i26 = -(-(i24 | 103));
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    f57937r0 = i27 % 128;
                    setSubtitleTextAppearance setsubtitletextappearance2 = (setSubtitleTextAppearance) obj;
                    if (i27 % 2 == 0) {
                        a(new Object[]{c0234a, setsubtitletextappearance2}, -1108148918, 1108148918, System.identityHashCode(c0234a));
                        throw null;
                    }
                    moVarA = a(new Object[]{c0234a, setsubtitletextappearance2}, -1108148918, 1108148918, System.identityHashCode(c0234a));
                    int i28 = f57936q0;
                    int i29 = ((i28 & 90) + (i28 | 90)) - 1;
                    f57937r0 = i29 % 128;
                    if (i29 % 2 == 0) {
                        int i30 = 97 / 0;
                    }
                }
                return moVarA;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ mo invoke(setSubtitleTextAppearance setsubtitletextappearance) {
                return a(new Object[]{this, setsubtitletextappearance}, 1634640344, -1634640343, System.identityHashCode(this));
            }
        }

        static {
            c();
            f57931w0 = 1;
            f57930u0 = 0;
            v0 = 1;
            f57929t0 = (char) 30296;
            f57927r0 = 7100234662579257431L;
            f57928s0 = -461867432;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(applicationCreated applicationcreated, List<setSubtitleTextAppearance> list) {
            super(1);
            this.f57933p0 = applicationcreated;
            this.f57934q0 = list;
        }

        public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
            char[] charArray = str2.toCharArray();
            int i11 = f57931w0;
            int i12 = i11 + 43;
            int i13 = i12 % 128;
            int i14 = 2;
            int i15 = i12 % 2;
            char[] charArray2 = "똏炋珊벞".toCharArray();
            int i16 = i11 + 55;
            int i17 = i16 % 128;
            int i18 = i16 % 2;
            char[] charArray3 = str.toCharArray();
            UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
            int length = charArray3.length;
            char[] cArr = new char[length];
            int length2 = charArray2.length;
            char[] cArr2 = new char[length2];
            int i19 = 0;
            System.arraycopy(charArray3, 0, cArr, 0, length);
            System.arraycopy(charArray2, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c10);
            cArr2[2] = (char) (cArr2[2] + ((char) i10));
            int length3 = charArray.length;
            char[] cArr3 = new char[length3];
            uiMessageCallbackKtWhenMappings.setX = 0;
            while (uiMessageCallbackKtWhenMappings.setX < length3) {
                int i20 = i11 + 113;
                int i21 = i20 % 128;
                int i22 = i20 % i14;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i19] = uiMessageCallbackKtWhenMappings;
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(20564334);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (50679 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 38 - TextUtils.indexOf((CharSequence) "", '0', i19, i19), 1785 - AndroidCharacter.getMirror('0'));
                        byte b10 = (byte) i19;
                        Object[] objArr3 = new Object[1];
                        b(b10, b10, (byte) (b10 | 6), objArr3);
                        method = cls.getMethod((String) objArr3[0], Object.class);
                        map.put(20564334, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = {uiMessageCallbackKtWhenMappings};
                    Object method2 = map.get(-68974155);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 37 - TextUtils.getOffsetAfter("", 0), 646 - (ViewConfiguration.getTapTimeout() >> 16));
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr5 = new Object[1];
                        b((byte) (b12 - 3), b11, b12, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class);
                        map.put(-68974155, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method3 = map.get(-1108711559);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 50 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0') + 435);
                        byte b13 = (byte) 0;
                        byte b14 = (byte) (b13 + 5);
                        Object[] objArr7 = new Object[1];
                        b((byte) (b14 - 5), b13, b14, objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str3, Object.class, cls4, cls4);
                        map.put(-1108711559, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method4 = map.get(533021397);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (4450 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 42 - View.MeasureSpec.getSize(0), View.MeasureSpec.getSize(0) + PointerIconCompat.TYPE_GRABBING);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr9 = new Object[1];
                        b(b16, b15, b16, objArr9);
                        String str4 = (String) objArr9[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str4, cls6, cls6);
                        map.put(533021397, method4);
                    }
                    cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                    char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                    cArr[iIntValue2] = c11;
                    int i23 = uiMessageCallbackKtWhenMappings.setX;
                    cArr3[i23] = (char) (((((long) (c11 ^ charArray[i23])) ^ (f57927r0 ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f57928s0) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f57929t0) ^ (-2443367703579691432L)))));
                    uiMessageCallbackKtWhenMappings.setX = i23 + 1;
                    length3 = length3;
                    i11 = i11;
                    i14 = 2;
                    i19 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i24 = i11 + 27;
            int i25 = i24 % 128;
            int i26 = i24 % 2;
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 4
                int r6 = r6 + 1
                int r7 = r7 * 4
                int r7 = r7 + 4
                int r8 = 119 - r8
                byte[] r0 = new byte[r6]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.qo.a.f57932x0
                if (r2 != 0) goto L18
                r8 = r7
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r6
                goto L35
            L18:
                r3 = r1
                r5 = r7
                r7 = r6
                r6 = r8
                r8 = r5
            L1d:
                byte r4 = (byte) r6
                r0[r3] = r4
                int r3 = r3 + 1
                if (r3 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L2c:
                r4 = r2[r8]
                r5 = r9
                r9 = r7
                r7 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r5
            L35:
                int r7 = -r7
                int r6 = r6 + r7
                int r8 = r8 + 1
                r7 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qo.a.b(byte, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57932x0 = new byte[]{115, MessageUtils.MESSAGE_30_RS, -113, MessageUtils.MESSAGE_21_NAK};
        }

        public final void d(@NotNull mo moVar) throws Throwable {
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr = new Object[1];
            a((char) (TextUtils.getOffsetAfter("", 0) + 16488), "祆呺栄㙀", 72645240 - TextUtils.lastIndexOf("", '0'), "榨猎䧕퓞녢", objArr);
            String strIntern = ((String) objArr[0]).intern();
            qo qoVar = qo.INSTANCE;
            mo.setY(new Object[]{moVar, strIntern, (mo) qo.setY(new Object[]{this.f57933p0}, 199793791, -199793789, (int) System.currentTimeMillis())}, 509994867, -509994865, System.identityHashCode(moVar));
            Object[] objArr2 = new Object[1];
            a((char) (23861 - Color.argb(0, 0, 0, 0)), "\uf046ꡈ㕡䁝", ViewConfiguration.getDoubleTapTimeout() >> 16, "\udf87⁻㈷溢", objArr2);
            mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), new mn(this.f57934q0.toArray(new setSubtitleTextAppearance[0]), C0234a.f57935p0)}, 733397612, -733397606, System.identityHashCode(moVar));
            int i10 = f57930u0 + 119;
            v0 = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
            int i10 = v0 + 113;
            f57930u0 = i10 % 128;
            int i11 = i10 % 2;
            d(moVar);
            if (i11 != 0) {
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i12 = f57930u0 + 37;
            v0 = i12 % 128;
            if (i12 % 2 != 0) {
                return unit2;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Lambda implements Function1<mo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f57938p0 = new b();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57939q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57940r0 = 1;

        static {
            int i10 = f57939q0;
            int i11 = i10 & 11;
            int i12 = ((i10 ^ 11) | i11) << 1;
            int i13 = -((i10 | 11) & (~i11));
            int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
            f57940r0 = i14 % 128;
            int i15 = i14 % 2;
        }

        public b() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            Unit unit;
            Unit unit2;
            int i13 = ~i10;
            int i14 = ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
            int i15 = ~i11;
            int i16 = ~i12;
            if ((((~(i10 | i11)) | (~(i16 | i10)) | (~(i13 | i15))) * 184) + ((i10 | i15 | i16) * 184) + i14 != 1) {
                mo moVar = (mo) objArr[1];
                int i17 = f57939q0;
                int i18 = i17 & 45;
                int i19 = ((i17 ^ 45) | i18) << 1;
                int i20 = -((i17 | 45) & (~i18));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f57940r0 = i21 % 128;
                unit2 = null;
                if (i21 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(moVar, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(moVar, "");
                int i22 = f57940r0;
                int i23 = i22 & 57;
                int i24 = (i22 ^ 57) | i23;
                int i25 = (i23 & i24) + (i24 | i23);
                f57939q0 = i25 % 128;
                int i26 = i25 % 2;
            } else {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                int i27 = f57939q0;
                int i28 = i27 & 73;
                int i29 = (i27 ^ 73) | i28;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f57940r0 = i30 % 128;
                mo moVar2 = (mo) obj;
                if (i30 % 2 == 0) {
                    a(new Object[]{bVar, moVar2}, 159577008, -159577008, System.identityHashCode(bVar));
                    unit = Unit.INSTANCE;
                    int i31 = 55 / 0;
                } else {
                    a(new Object[]{bVar, moVar2}, 159577008, -159577008, System.identityHashCode(bVar));
                    unit = Unit.INSTANCE;
                }
                unit2 = unit;
                int i32 = f57940r0;
                int i33 = ((((i32 ^ 21) | (i32 & 21)) << 1) - (~(-(((~i32) & 21) | (i32 & (-22)))))) - 1;
                f57939q0 = i33 % 128;
                if (i33 % 2 != 0) {
                    int i34 = 28 / 0;
                }
            }
            return unit2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(mo moVar) {
            return a(new Object[]{this, moVar}, -2127312500, 2127312501, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function1<mo, Unit> {
        public static int E0;
        public static int F0;
        public static final byte[] G0 = null;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final char f57941t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final char f57942u0;
        public static final char v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final char f57943w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f57944x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static int f57945y0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f57946p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f57947q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f57948r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f57949s0;

        static {
            c();
            E0 = 0;
            F0 = 1;
            f57944x0 = 0;
            f57945y0 = 1;
            f57943w0 = (char) 18466;
            v0 = (char) 27442;
            f57941t0 = (char) 61123;
            f57942u0 = Typography.copyright;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, String str4) {
            super(1);
            this.f57946p0 = str;
            this.f57947q0 = str2;
            this.f57948r0 = str3;
            this.f57949s0 = str4;
        }

        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            int i11;
            int i12 = E0 + 53;
            int i13 = i12 % 128;
            F0 = i13;
            int i14 = 2;
            int i15 = i12 % 2;
            int i16 = i13 + 79;
            E0 = i16 % 128;
            int i17 = i16 % 2;
            char[] charArray = str.toCharArray();
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
            char[] cArr = new char[charArray.length];
            int i18 = 0;
            setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i19 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
                if (i19 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i10);
                    return;
                }
                cArr2[i18] = charArray[i19];
                cArr2[1] = charArray[i19 + 1];
                int i20 = F0 + 111;
                E0 = i20 % 128;
                int i21 = i20 % i14;
                int i22 = 58224;
                int i23 = i18;
                while (i23 < 16) {
                    char c10 = cArr2[1];
                    char c11 = cArr2[i18];
                    int i24 = (c11 + i22) ^ ((c11 << 4) + ((char) (((long) v0) ^ 4333817592127744003L)));
                    int i25 = c11 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f57943w0);
                        objArr2[i14] = Integer.valueOf(i25);
                        objArr2[1] = Integer.valueOf(i24);
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(-1434759016);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (48533 - MotionEvent.axisFromString("")), 46 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 2672);
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr3 = new Object[1];
                            b((byte) (-b11), b11, b10, objArr3);
                            String str2 = (String) objArr3[0];
                            Class<?> cls2 = Integer.TYPE;
                            method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                            map.put(-1434759016, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr2[1] = cCharValue;
                        Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i22) ^ ((cCharValue << 4) + ((char) (((long) f57941t0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57942u0)};
                        Object method2 = map.get(-1434759016);
                        if (method2 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (48534 - View.MeasureSpec.getMode(0)), 48 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 2672);
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 - 1);
                            Object[] objArr5 = new Object[1];
                            b((byte) (-b13), b13, b12, objArr5);
                            String str3 = (String) objArr5[0];
                            Class<?> cls4 = Integer.TYPE;
                            method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                            map.put(-1434759016, method2);
                        }
                        cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i22 -= 40503;
                        i23++;
                        i14 = 2;
                        i18 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i26 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
                cArr[i26] = cArr2[0];
                cArr[i26 + 1] = cArr2[1];
                Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1396159716);
                if (method3 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 38, 2144 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b((byte) (b15 + 1), b15, b14, objArr7);
                    i11 = 2;
                    method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1396159716, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = i11;
                i18 = 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r8, int r9, short r10, java.lang.Object[] r11) {
            /*
                int r8 = r8 * 2
                int r8 = 105 - r8
                int r10 = r10 * 4
                int r10 = 1 - r10
                int r9 = r9 + 4
                byte[] r0 = new byte[r10]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.qo.c.G0
                if (r2 != 0) goto L18
                r8 = r9
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r11
                r11 = r10
                goto L35
            L18:
                r3 = r1
            L19:
                int r9 = r9 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r0[r3] = r5
                if (r4 != r10) goto L2a
                java.lang.String r8 = new java.lang.String
                r8.<init>(r0, r1)
                r11[r1] = r8
                return
            L2a:
                r3 = r2[r9]
                r6 = r9
                r9 = r8
                r8 = r6
                r7 = r11
                r11 = r10
                r10 = r3
                r3 = r2
                r2 = r0
                r0 = r7
            L35:
                int r10 = -r10
                int r9 = r9 + r10
                r10 = r11
                r11 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qo.c.b(byte, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            G0 = new byte[]{GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 52, -84, -118};
        }

        public final void d(@NotNull mo moVar) throws Throwable {
            int i10 = f57944x0 + 11;
            f57945y0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr = new Object[1];
            a("\u1aef\uf7d9䏠䣕ⷅ퍻믲甶↶姮", TextUtils.indexOf((CharSequence) "", '0') + 11, objArr);
            mo.setY(new Object[]{moVar, ((String) objArr[0]).intern(), this.f57946p0}, -52655784, 52655794, System.identityHashCode(moVar));
            Object[] objArr2 = new Object[1];
            a("䠍\uea0a䏠䣕龟ⵗᰚ\uf13c↶姮", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), this.f57947q0}, -52655784, 52655794, System.identityHashCode(moVar));
            Object[] objArr3 = new Object[1];
            a("ϴꆣ䟻튧狮\u2e7b뎫핡↶姮", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, objArr3);
            mo.setY(new Object[]{moVar, ((String) objArr3[0]).intern(), this.f57948r0}, -52655784, 52655794, System.identityHashCode(moVar));
            Object[] objArr4 = new Object[1];
            a("\u18f9꺷嗉ꮁ\uf449棁ᢴ\ueb2a", 8 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr4);
            mo.setY(new Object[]{moVar, ((String) objArr4[0]).intern(), this.f57949s0}, -52655784, 52655794, System.identityHashCode(moVar));
            int i12 = f57944x0 + 65;
            f57945y0 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
            int i10 = f57945y0 + 125;
            f57944x0 = i10 % 128;
            int i11 = i10 % 2;
            d(moVar);
            Unit unit = Unit.INSTANCE;
            int i12 = f57944x0 + 111;
            f57945y0 = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/mo;", "", "d", "(Lcom/mypinpad/tsdk/i/mo;)V"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPayloadSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeAttestationToken$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n37#2,2:223\n37#2,2:225\n37#2,2:227\n*S KotlinDebug\n*F\n+ 1 PayloadSerializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadSerializer$serializeAttestationToken$1\n*L\n173#1:223,2\n180#1:225,2\n181#1:227,2\n*E\n"})
    public static final class d extends Lambda implements Function1<mo, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final char[] f57950q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final byte[] f57951r0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ applicationCreated f57952p0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setIndeterminateDrawableTiled;", "Lcom/mypinpad/tsdk/i/mo;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setIndeterminateDrawableTiled;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a extends Lambda implements Function1<setIndeterminateDrawableTiled, mo> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f57953p0 = new a();

            static {
                int i10 = ((-1) << 1) - (((1 - (-127)) - 1) ^ (-1));
                int i11 = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }

            public a() {
                super(1);
            }

            public static /* synthetic */ mo a(Object[] objArr, int i10, int i11, int i12) {
                int i13 = ~i12;
                int i14 = ~(i13 | i10);
                int i15 = ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
                int i16 = ~((~i10) | i11);
                if ((((~(i10 | (~i11))) | i16 | i14) * 764) + (((~(i13 | i11)) | i16) * (-1528)) + i15 == 1) {
                    a aVar = (a) objArr[0];
                    return a(new Object[]{aVar, (setIndeterminateDrawableTiled) objArr[1]}, -684257430, 684257430, System.identityHashCode(aVar));
                }
                setIndeterminateDrawableTiled setindeterminatedrawabletiled = (setIndeterminateDrawableTiled) objArr[1];
                Intrinsics.checkNotNullParameter(setindeterminatedrawabletiled, "");
                return new mo(new j8(setindeterminatedrawabletiled));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ mo invoke(setIndeterminateDrawableTiled setindeterminatedrawabletiled) {
                return a(new Object[]{this, setindeterminatedrawabletiled}, 922544284, -922544283, System.identityHashCode(this));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setHorizontalScrollBarEnabled;", "Lcom/mypinpad/tsdk/i/mo;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setHorizontalScrollBarEnabled;)Lcom/mypinpad/tsdk/i/mo;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class b extends Lambda implements Function1<setHorizontalScrollBarEnabled, mo> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f57954p0 = new b();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f57955q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f57956r0 = 1;

            static {
                int i10 = f57956r0;
                int i11 = ((i10 | 39) << 1) - (i10 ^ 39);
                f57955q0 = i11 % 128;
                int i12 = i11 % 2;
            }

            public b() {
                super(1);
            }

            public static /* synthetic */ mo a(Object[] objArr, int i10, int i11) {
                mo moVarA;
                int i12 = ~i10;
                if (((i10 | i11) * 624) + ((i12 | i11) * 624) + (i12 * (-624)) + (i11 * (-623)) + (i10 * (-623)) != 1) {
                    setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = (setHorizontalScrollBarEnabled) objArr[1];
                    Intrinsics.checkNotNullParameter(sethorizontalscrollbarenabled, "");
                    moVarA = new mo(new k8(sethorizontalscrollbarenabled));
                    int i13 = f57955q0;
                    int i14 = (i13 | 75) << 1;
                    int i15 = -(((~i13) & 75) | (i13 & (-76)));
                    int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
                    f57956r0 = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                } else {
                    b bVar = (b) objArr[0];
                    Object obj = objArr[1];
                    int i17 = f57956r0;
                    int i18 = i17 & 55;
                    int i19 = (i17 ^ 55) | i18;
                    int i20 = (i18 & i19) + (i19 | i18);
                    f57955q0 = i20 % 128;
                    int i21 = i20 % 2;
                    System.identityHashCode(bVar);
                    moVarA = a(new Object[]{bVar, (setHorizontalScrollBarEnabled) obj}, -428137187, 428137187);
                    int i22 = f57956r0 + 47;
                    f57955q0 = i22 % 128;
                    if (i22 % 2 != 0) {
                        throw null;
                    }
                }
                return moVarA;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ mo invoke(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
                Object[] objArr = {this, sethorizontalscrollbarenabled};
                System.identityHashCode(this);
                return a(objArr, 1860736269, -1860736268);
            }
        }

        static {
            c();
            f57950q0 = new char[]{58885, 59319, 59314, 59327, 59316, 59275, 59274, 59278, 59291, 59288, 59085, 58916, 58936, 58936, 58917, 58930, 58929, 58929, 58934, 58938, 58918, 58942, 58942, 58890, 58893, 59053, 59110, 59130, 59128, 59134, 59121, 59079, 59074, 59122, 59123, 59111, 59107, 59129, 59129, 59111, 59134, 59044, 59132, 59128, 59129, 59133, 59121, 59134, 59131, 59129, 59131, 59082, 59085, 59132, 59132, 59122, 59132, 59129, 59129, 59134, 59111, 59045, 59122, 59135, 59133, 59131, 59129, 59134, 59110, 59105};
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(applicationCreated applicationcreated) {
            super(1);
            this.f57952p0 = applicationcreated;
        }

        public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
            int i10;
            int i11;
            byte[] bytes = str.getBytes("ISO-8859-1");
            setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
            int i12 = 0;
            int i13 = iArr[0];
            int i14 = 1;
            int i15 = iArr[1];
            int i16 = iArr[2];
            int i17 = iArr[3];
            char[] cArr = f57950q0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i18 = 0;
                while (i18 < length) {
                    try {
                        Object[] objArr2 = new Object[i14];
                        objArr2[i12] = Integer.valueOf(cArr[i18]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(-637734149);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) View.combineMeasuredStates(i12, i12), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36, 609 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 3);
                            Object[] objArr3 = new Object[1];
                            b(b11, (byte) (b11 - 3), b10, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(-637734149, method);
                        }
                        cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i18++;
                        cArr = cArr;
                        length = length;
                        i16 = i16;
                        i12 = 0;
                        i14 = 1;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                i10 = i16;
                cArr = cArr2;
            } else {
                i10 = i16;
            }
            char[] cArr3 = new char[i15];
            System.arraycopy(cArr, i13, cArr3, 0, i15);
            if (bytes != null) {
                char[] cArr4 = new char[i15];
                setnavigationonclicklistener.setX = 0;
                char c10 = 0;
                while (true) {
                    int i19 = setnavigationonclicklistener.setX;
                    if (i19 >= i15) {
                        break;
                    }
                    if (bytes[i19] == 1) {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i19]), Integer.valueOf(c10)};
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(1737824323);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 4450), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + PointerIconCompat.TYPE_GRABBING);
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b13, b13, b12, objArr5);
                            String str2 = (String) objArr5[0];
                            Class<?> cls3 = Integer.TYPE;
                            method2 = cls2.getMethod(str2, cls3, cls3);
                            map2.put(1737824323, method2);
                        }
                        cArr4[i19] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    } else {
                        Object[] objArr6 = {Integer.valueOf(cArr3[i19]), Integer.valueOf(c10)};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(-504758789);
                        if (method3 == null) {
                            Class cls4 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), 45 - ExpandableListView.getPackedPositionType(0L), 2627 - TextUtils.getCapsMode("", 0, 0));
                            byte length2 = (byte) f57951r0.length;
                            Object[] objArr7 = new Object[1];
                            b(length2, (byte) (length2 - 4), (byte) 0, objArr7);
                            String str3 = (String) objArr7[0];
                            Class<?> cls5 = Integer.TYPE;
                            method3 = cls4.getMethod(str3, cls5, cls5);
                            map3.put(-504758789, method3);
                        }
                        cArr4[i19] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    }
                    c10 = cArr4[setnavigationonclicklistener.setX];
                    Object[] objArr8 = {setnavigationonclicklistener, setnavigationonclicklistener};
                    Map map4 = setTextScaleX.setMaxEms;
                    Object method4 = map4.get(-265085633);
                    if (method4 == null) {
                        Class cls6 = (Class) setTextScaleX.setX((char) (31347 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 48 - (Process.myPid() >> 22), 840 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 1);
                        Object[] objArr9 = new Object[1];
                        b(b15, (byte) (b15 - 1), b14, objArr9);
                        method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                        map4.put(-265085633, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                }
                cArr3 = cArr4;
            }
            if (i17 > 0) {
                char[] cArr5 = new char[i15];
                i11 = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i15);
                int i20 = i15 - i17;
                System.arraycopy(cArr5, 0, cArr3, i20, i17);
                System.arraycopy(cArr5, i17, cArr3, 0, i20);
            } else {
                i11 = 0;
            }
            if (z10) {
                char[] cArr6 = new char[i15];
                while (true) {
                    setnavigationonclicklistener.setX = i11;
                    int i21 = setnavigationonclicklistener.setX;
                    if (i21 >= i15) {
                        break;
                    }
                    cArr6[i21] = cArr3[(i15 - i21) - 1];
                    i11 = i21 + 1;
                }
                cArr3 = cArr6;
            }
            if (i10 > 0) {
                int i22 = 0;
                while (true) {
                    setnavigationonclicklistener.setX = i22;
                    int i23 = setnavigationonclicklistener.setX;
                    if (i23 >= i15) {
                        break;
                    }
                    cArr3[i23] = (char) (cArr3[i23] - iArr[2]);
                    i22 = i23 + 1;
                }
            }
            objArr[0] = new String(cArr3);
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
        public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 4
                int r9 = r9 + 1
                int r7 = 101 - r7
                int r8 = r8 * 4
                int r8 = r8 + 4
                byte[] r0 = new byte[r9]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.i.qo.d.f57951r0
                if (r2 != 0) goto L18
                r5 = r1
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L32
            L18:
                r3 = r1
            L19:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r0[r3] = r4
                if (r5 != r9) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L28:
                r3 = r2[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L32:
                int r7 = -r7
                int r7 = r7 + r8
                int r8 = r9 + 1
                r9 = r10
                r10 = r0
                r0 = r2
                r2 = r3
                r3 = r5
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qo.d.b(byte, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57951r0 = new byte[]{64, 59, -42, 60};
        }

        public final void d(@NotNull mo moVar) throws Throwable {
            Intrinsics.checkNotNullParameter(moVar, "");
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", false, new int[]{0, 10, 183, 10}, objArr);
            String strIntern = ((String) objArr[0]).intern();
            applicationCreated applicationcreated = this.f57952p0;
            mo.setY(new Object[]{moVar, strIntern, (String) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreated}, -315072230, 315072230, System.identityHashCode(applicationcreated))}, -52655784, 52655794, System.identityHashCode(moVar));
            Object[] objArr2 = new Object[1];
            a("\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{10, 15, 61, 5}, objArr2);
            mo.setY(new Object[]{moVar, ((String) objArr2[0]).intern(), new mn(applicationcreated.setX().toArray(new setIndeterminateDrawableTiled[0]), a.f57953p0)}, 733397612, -733397606, System.identityHashCode(moVar));
            Object[] objArr3 = new Object[1];
            a("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{25, 16, 0, 14}, objArr3);
            mo.setY(new Object[]{moVar, ((String) objArr3[0]).intern(), ((List) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreated}, 601619422, -601619421, System.identityHashCode(applicationcreated))).toArray(new Object[0])}, 1538034737, -1538034736, System.identityHashCode(moVar));
            Object[] objArr4 = new Object[1];
            a("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", false, new int[]{41, 20, 0, 0}, objArr4);
            mo.setY(new Object[]{moVar, ((String) objArr4[0]).intern(), new mn(applicationcreated.setY().toArray(new setHorizontalScrollBarEnabled[0]), b.f57954p0)}, 733397612, -733397606, System.identityHashCode(moVar));
            Object[] objArr5 = new Object[1];
            a("\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", true, new int[]{61, 9, 0, 5}, objArr5);
            mo.setY(new Object[]{moVar, ((String) objArr5[0]).intern(), (String) applicationCreated.setOnFocusChangeListener(new Object[]{applicationcreated}, 1855898331, -1855898326, System.identityHashCode(applicationcreated))}, -52655784, 52655794, System.identityHashCode(moVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(mo moVar) throws Throwable {
            d(moVar);
            return Unit.INSTANCE;
        }
    }

    static {
        c();
        f57924b = 0;
        f57925c = 1;
        e();
        INSTANCE = new qo();
        int i10 = f57925c + 17;
        f57924b = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
        char[] cArr;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = f57923a;
        int i11 = 1;
        int i12 = -1;
        int i13 = 1833429914;
        int i14 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = new Object[i11];
                    objArr2[i14] = Integer.valueOf(iArr2[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForChild(i14, i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i14, i14) == 0L ? 0 : -1)) + i11), 45 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getCapsMode("", i14, i14) + 728);
                        byte b10 = (byte) i12;
                        byte b11 = (byte) (-b10);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 - 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr3[i15] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i15++;
                    iArr2 = iArr2;
                    i11 = 1;
                    i12 = -1;
                    i13 = 1833429914;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = f57923a;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i16 = 0;
            while (i16 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i16])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(1833429914);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (Process.myPid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + 45, Process.getGidForName("") + 729);
                    byte b12 = (byte) (-1);
                    byte b13 = (byte) (-b12);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 - 1), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method2);
                }
                iArr6[i16] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i16++;
                iArr5 = iArr5;
                length3 = length3;
                cArr3 = cArr3;
            }
            cArr = cArr3;
            iArr5 = iArr6;
        } else {
            cArr = cArr3;
        }
        char c10 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i17 = setonlongclicklistener.setDividerPadding;
            if (i17 >= iArr.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i18 = iArr[i17];
            char c11 = (char) (i18 >> 16);
            cArr2[c10] = c11;
            char c12 = (char) i18;
            cArr2[1] = c12;
            int i19 = iArr[i17 + 1];
            char c13 = (char) (i19 >> 16);
            cArr2[2] = c13;
            char c14 = (char) i19;
            cArr2[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            for (int i20 = 0; i20 < 16; i20++) {
                int i21 = setonlongclicklistener.setY ^ iArr4[i20];
                setonlongclicklistener.setY = i21;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i21)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-350984188);
                if (method3 == null) {
                    method3 = ((Class) setTextScaleX.setX((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 41 - (ViewConfiguration.getFadingEdgeLength() >> 16), 179 - TextUtils.indexOf((CharSequence) "", '0', 0))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
            }
            int i22 = setonlongclicklistener.setY;
            int i23 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i24 = i22 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i24;
            int i25 = i23 ^ iArr4[17];
            setonlongclicklistener.setY = i25;
            cArr2[0] = (char) (i25 >>> 16);
            cArr2[1] = (char) i25;
            cArr2[2] = (char) (i24 >>> 16);
            cArr2[3] = (char) i24;
            setOnLongClickListener.setX(iArr4);
            int i26 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i26] = cArr2[0];
            cArr[i26 + 1] = cArr2[1];
            cArr[i26 + 2] = cArr2[2];
            cArr[i26 + 3] = cArr2[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-147294223);
            if (method4 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 1), 41 - View.MeasureSpec.getMode(0), 483 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                byte b14 = (byte) (-1);
                byte b15 = (byte) (b14 + 1);
                Object[] objArr8 = new Object[1];
                b(b14, b15, b15, objArr8);
                method4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method4);
            }
            ((Method) method4).invoke(null, objArr7);
            c10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 108 - r8
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = new byte[r9]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.qo.f57926d
            if (r2 != 0) goto L18
            r8 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L34
        L18:
            r3 = r1
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r0[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r3 = r2[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L34:
            int r7 = r7 + r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qo.b(byte, byte, byte, java.lang.Object[]):void");
    }

    public static void c() {
        f57926d = new byte[]{29, 94, -18, -34};
    }

    public static mo d(onPinPadLaunchRequest onpinpadlaunchrequest) throws Throwable {
        if (onpinpadlaunchrequest instanceof setWebContentsDebuggingEnabled) {
            setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled = (setWebContentsDebuggingEnabled) onpinpadlaunchrequest;
            mo moVar = new mo(new s7(((Boolean) setWebContentsDebuggingEnabled.setCompoundDrawableTintBlendMode(new Object[]{setwebcontentsdebuggingenabled}, 1295836975, -1295836975, System.identityHashCode(setwebcontentsdebuggingenabled))).booleanValue()));
            int i10 = f57924b + 115;
            f57925c = i10 % 128;
            int i11 = i10 % 2;
            return moVar;
        }
        if (onpinpadlaunchrequest instanceof setHapticFeedbackEnabled) {
            setHapticFeedbackEnabled sethapticfeedbackenabled = (setHapticFeedbackEnabled) onpinpadlaunchrequest;
            mo moVar2 = new mo(new y7(((Boolean) setHapticFeedbackEnabled.setDividerPadding(new Object[]{sethapticfeedbackenabled}, 1689880744, -1689880744, System.identityHashCode(sethapticfeedbackenabled))).booleanValue()));
            int i12 = f57924b + 103;
            f57925c = i12 % 128;
            int i13 = i12 % 2;
            return moVar2;
        }
        if (onpinpadlaunchrequest instanceof setTextSelectHandle) {
            setTextSelectHandle settextselecthandle = (setTextSelectHandle) onpinpadlaunchrequest;
            String str = (String) setTextSelectHandle.setY(new Object[]{settextselecthandle}, -2115593116, 2115593118, System.identityHashCode(settextselecthandle));
            String str2 = (String) setTextSelectHandle.setY(new Object[]{settextselecthandle}, -1888958068, 1888958068, System.identityHashCode(settextselecthandle));
            String str3 = (String) setTextSelectHandle.setY(new Object[]{settextselecthandle}, -1138307747, 1138307748, System.identityHashCode(settextselecthandle));
            Object[] objArr = new Object[1];
            a(new int[]{-2077702734, -1737956913}, 3 - (Process.myTid() >> 22), objArr);
            Object[] objArr2 = new Object[1];
            a(new int[]{-1571919329, 1134732733, 964459833, -1954024176}, '7' - AndroidCharacter.getMirror('0'), objArr2);
            Object[] objArr3 = new Object[1];
            a(new int[]{-928177009, -329775664, -2098087803, 596102584}, TextUtils.getTrimmedLength("") + 6, objArr3);
            mo moVar3 = new mo(new x7(q.mapOf(TuplesKt.to(((String) objArr[0]).intern(), str), TuplesKt.to(((String) objArr2[0]).intern(), str2), TuplesKt.to(((String) objArr3[0]).intern(), str3))));
            int i14 = f57925c + 25;
            f57924b = i14 % 128;
            int i15 = i14 % 2;
            return moVar3;
        }
        if (onpinpadlaunchrequest instanceof setJustificationMode) {
            setJustificationMode setjustificationmode = (setJustificationMode) onpinpadlaunchrequest;
            mo moVar4 = new mo(new d8((byte[][]) ((Pair) setJustificationMode.setCompoundDrawableTintBlendMode(new Object[]{setjustificationmode}, 1009725734, -1009725734, System.identityHashCode(setjustificationmode))).getFirst(), (byte[]) ((Pair) setJustificationMode.setCompoundDrawableTintBlendMode(new Object[]{setjustificationmode}, 1009725734, -1009725734, System.identityHashCode(setjustificationmode))).getSecond()));
            int i16 = f57924b + 61;
            f57925c = i16 % 128;
            int i17 = i16 % 2;
            return moVar4;
        }
        if (onpinpadlaunchrequest instanceof setLines) {
            setLines setlines = (setLines) onpinpadlaunchrequest;
            mo moVar5 = new mo(new z7((String) setLines.setDividerPadding(new Object[]{setlines}, -57626913, 57626913, System.identityHashCode(setlines))));
            int i18 = f57925c + 103;
            f57924b = i18 % 128;
            int i19 = i18 % 2;
            return moVar5;
        }
        if (onpinpadlaunchrequest instanceof setOutlineProvider) {
            setOutlineProvider setoutlineprovider = (setOutlineProvider) onpinpadlaunchrequest;
            return (mo) setY(new Object[]{Boolean.valueOf(((Boolean) setOutlineProvider.setOnFocusChangeListener(new Object[]{setoutlineprovider}, 1815248043, -1815248043, System.identityHashCode(setoutlineprovider))).booleanValue())}, 518746154, -518746153, (int) System.currentTimeMillis());
        }
        if (onpinpadlaunchrequest instanceof setOnReceiveContentListener) {
            setOnReceiveContentListener setonreceivecontentlistener = (setOnReceiveContentListener) onpinpadlaunchrequest;
            mo moVar6 = new mo(new i8((setOverScrollMode[]) setOnReceiveContentListener.setOnFocusChangeListener(new Object[]{setonreceivecontentlistener}, 1138677152, -1138677152, System.identityHashCode(setonreceivecontentlistener))));
            int i20 = f57925c + 57;
            f57924b = i20 % 128;
            if (i20 % 2 != 0) {
                int i21 = 23 / 0;
            }
            return moVar6;
        }
        if (onpinpadlaunchrequest instanceof setImageBitmap) {
            setImageBitmap setimagebitmap = (setImageBitmap) onpinpadlaunchrequest;
            mo moVar7 = new mo(new v7((setOnTouchListener[]) setImageBitmap.setDividerPadding(new Object[]{setimagebitmap}, 1672320017, -1672320017, System.identityHashCode(setimagebitmap))));
            int i22 = f57925c + 103;
            f57924b = i22 % 128;
            int i23 = i22 % 2;
            return moVar7;
        }
        if (onpinpadlaunchrequest instanceof clone) {
            clone cloneVar = (clone) onpinpadlaunchrequest;
            mo moVar8 = new mo(new b8((getTotalElapsedTimeout[]) clone.setX(new Object[]{cloneVar}, -415546477, 415546477, System.identityHashCode(cloneVar))));
            int i24 = f57924b;
            int i25 = i24 + 45;
            f57925c = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
            int i26 = i24 + 99;
            f57925c = i26 % 128;
            if (i26 % 2 != 0) {
                return moVar8;
            }
            throw null;
        }
        if (!(!(onpinpadlaunchrequest instanceof setBottom))) {
            int i27 = f57924b + 79;
            f57925c = i27 % 128;
            int i28 = i27 % 2;
            setBottom setbottom = (setBottom) onpinpadlaunchrequest;
            mo moVar9 = new mo(new e8((byte[]) setBottom.setOnFocusChangeListener(new Object[]{setbottom}, -635582197, 635582197, System.identityHashCode(setbottom))));
            int i29 = f57925c + 17;
            f57924b = i29 % 128;
            int i30 = i29 % 2;
            return moVar9;
        }
        if (!(onpinpadlaunchrequest instanceof unregisterForContextMenu)) {
            return new mo(b.f57938p0);
        }
        int i31 = f57924b + 101;
        f57925c = i31 % 128;
        if (i31 % 2 != 0) {
            unregisterForContextMenu unregisterforcontextmenu = (unregisterForContextMenu) onpinpadlaunchrequest;
            mo moVar10 = new mo(new f8(((Long) unregisterForContextMenu.setY(new Object[]{unregisterforcontextmenu}, -1131266999, 1131266999, System.identityHashCode(unregisterforcontextmenu))).longValue()));
            int i32 = f57925c + 87;
            f57924b = i32 % 128;
            int i33 = i32 % 2;
            return moVar10;
        }
        unregisterForContextMenu unregisterforcontextmenu2 = (unregisterForContextMenu) onpinpadlaunchrequest;
        new mo(new f8(((Long) unregisterForContextMenu.setY(new Object[]{unregisterforcontextmenu2}, -1131266999, 1131266999, System.identityHashCode(unregisterforcontextmenu2))).longValue()));
        int i34 = f57925c + 87;
        f57924b = i34 % 128;
        int i35 = i34 % 2;
        throw null;
    }

    public static void e() {
        f57923a = new int[]{-1000059530, -249080230, 921295201, 1150886512, 96018784, -756441604, -1962017635, -1523131665, -1915557378, 393015697, -2078645347, 765230272, -39944586, 249587467, 1000692756, -1114104257, 1146501558, -1999165654};
    }

    public static mo f(applicationCreated applicationcreated) {
        mo moVar = new mo(new d(applicationcreated));
        int i10 = f57925c + 91;
        f57924b = i10 % 128;
        if (i10 % 2 == 0) {
            return moVar;
        }
        throw null;
    }

    public static final /* synthetic */ mo setDividerPadding(applicationCreated applicationcreated) {
        return (mo) setY(new Object[]{applicationcreated}, 199793791, -199793789, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ mo setOnFocusChangeListener(setHorizontalScrollBarEnabled sethorizontalscrollbarenabled) {
        int i10 = f57924b + 113;
        f57925c = i10 % 128;
        int i11 = i10 % 2;
        mo moVar = (mo) setY(new Object[]{sethorizontalscrollbarenabled}, -2132656947, 2132656947, (int) System.currentTimeMillis());
        int i12 = f57925c + 19;
        f57924b = i12 % 128;
        if (i12 % 2 == 0) {
            return moVar;
        }
        throw null;
    }

    public static final /* synthetic */ mo setX(qo qoVar, onPinPadLaunchRequest onpinpadlaunchrequest) throws Throwable {
        int i10 = f57924b + 67;
        f57925c = i10 % 128;
        if (i10 % 2 != 0) {
            return d(onpinpadlaunchrequest);
        }
        mo moVarD = d(onpinpadlaunchrequest);
        int i11 = 11 / 0;
        return moVarD;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
        int i14 = ~i12;
        int i15 = ~i10;
        int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
        int i17 = ~i11;
        int i18 = i15 | i17;
        int i19 = i14 | i17;
        int i20 = (((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16;
        if (i20 == 1) {
            mo moVar = new mo(new c8(((Boolean) objArr[0]).booleanValue()));
            int i21 = f57924b + 49;
            f57925c = i21 % 128;
            int i22 = i21 % 2;
            return moVar;
        }
        if (i20 == 2) {
            applicationCreated applicationcreated = (applicationCreated) objArr[0];
            int i23 = f57924b + 33;
            f57925c = i23 % 128;
            if (i23 % 2 != 0) {
                return f(applicationcreated);
            }
            f(applicationcreated);
            throw null;
        }
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = (setHorizontalScrollBarEnabled) objArr[0];
        int i24 = f57924b + 97;
        f57925c = i24 % 128;
        int i25 = i24 % 2;
        if (sethorizontalscrollbarenabled instanceof setFriction) {
            mo moVar2 = new mo(new g8(sethorizontalscrollbarenabled));
            int i26 = f57925c + 23;
            f57924b = i26 % 128;
            if (i26 % 2 == 0) {
                return moVar2;
            }
            throw null;
        }
        if (sethorizontalscrollbarenabled instanceof setBreakStrategy) {
            return new mo(new r7(sethorizontalscrollbarenabled));
        }
        if (sethorizontalscrollbarenabled instanceof setLogoDescription) {
            return new mo(new m8(sethorizontalscrollbarenabled));
        }
        if (sethorizontalscrollbarenabled instanceof setSupportBackgroundTintList) {
            return new mo(new l8(sethorizontalscrollbarenabled));
        }
        return sethorizontalscrollbarenabled instanceof setDividerHeight ? new mo(new n8(sethorizontalscrollbarenabled)) : new mo(o8.f57427p0);
    }

    @NotNull
    public static mo setX(@NotNull String p4, @NotNull String p10, @NotNull String p11, @NotNull String p12) {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        mo moVar = new mo(new c(p4, p10, p11, p12));
        int i10 = f57925c + 29;
        f57924b = i10 % 128;
        int i11 = i10 % 2;
        return moVar;
    }

    @NotNull
    public static mo setY(@NotNull applicationCreated p4, @NotNull List<setSubtitleTextAppearance> p10) {
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p10, "");
        mo moVar = new mo(new a(p4, p10));
        int i10 = f57924b + 41;
        f57925c = i10 % 128;
        int i11 = i10 % 2;
        return moVar;
    }
}
