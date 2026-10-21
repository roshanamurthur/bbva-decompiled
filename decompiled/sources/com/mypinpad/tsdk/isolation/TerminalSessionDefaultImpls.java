package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraManager;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.nulabinc.zxcvbn.Guess;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TerminalSessionDefaultImpls implements getValueQualifier {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f51864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f51865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f51866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f51867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f51868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f51869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f51870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f51871l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f51872n = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TerminalErrorCodes f51874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setColorFilter f51875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setContentInsetStartWithNavigation f51876d;

    public static final class setY implements TransactionParameters {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f51877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f51878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final char f51879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f51880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f51881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f51882h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f51883i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f51884j = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Map<getTransactionPortrait, Future<setAutoSizeTextTypeUniformWithPresetSizes>> f51885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ TerminalSessionDefaultImpls f51886b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "p0", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends Lambda implements Function1<setAutoSizeTextTypeUniformWithPresetSizes, CharSequence> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f51887p0 = new a();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f51888q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f51889r0 = 1;

            static {
                int i10 = f51889r0;
                int i11 = ((i10 | 56) << 1) - (i10 ^ 56);
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                f51888q0 = i12 % 128;
                int i13 = i12 % 2;
            }

            public a() {
                super(1);
            }

            public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
                CharSequence charSequenceA;
                int i13 = ~i10;
                int i14 = ~i11;
                int i15 = (((~(i14 | i12)) | (~(i13 | i14)) | (~(i13 | i12))) * (-880)) + (i11 * 881) + (i10 * 881);
                int i16 = i11 | (~(i13 | (~i12)));
                int i17 = ~(i10 | i12);
                if ((i17 * 880) + ((i16 | i17) * (-880)) + i15 != 1) {
                    setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) objArr[1];
                    int i18 = f51888q0;
                    int i19 = i18 & 97;
                    int i20 = i19 + ((i18 ^ 97) | i19);
                    f51889r0 = i20 % 128;
                    int i21 = i20 % 2;
                    Intrinsics.checkNotNullParameter(setautosizetexttypeuniformwithpresetsizes, "");
                    setAutoSizeTextTypeUniformWithPresetSizes.Companion companion = setAutoSizeTextTypeUniformWithPresetSizes.INSTANCE;
                    charSequenceA = (String) setAutoSizeTextTypeUniformWithPresetSizes.Companion.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, 682845536, -682845535, (int) System.currentTimeMillis());
                    int i22 = f51888q0;
                    int i23 = ((i22 | 87) << 1) - (i22 ^ 87);
                    f51889r0 = i23 % 128;
                    if (i23 % 2 == 0) {
                        int i24 = 9 / 0;
                    }
                } else {
                    a aVar = (a) objArr[0];
                    Object obj = objArr[1];
                    int i25 = f51889r0;
                    int i26 = i25 & 79;
                    int i27 = -(-((i25 ^ 79) | i26));
                    int i28 = (i26 & i27) + (i27 | i26);
                    f51888q0 = i28 % 128;
                    int i29 = i28 % 2;
                    charSequenceA = a(new Object[]{aVar, (setAutoSizeTextTypeUniformWithPresetSizes) obj}, 1316314989, -1316314989, System.identityHashCode(aVar));
                    int i30 = f51889r0;
                    int i31 = i30 & 63;
                    int i32 = ((i30 ^ 63) | i31) << 1;
                    int i33 = -((i30 | 63) & (~i31));
                    int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                    f51888q0 = i34 % 128;
                    int i35 = i34 % 2;
                }
                return charSequenceA;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ CharSequence invoke(setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes) {
                return a(new Object[]{this, setautosizetexttypeuniformwithpresetsizes}, -2047848989, 2047848990, System.identityHashCode(this));
            }
        }

        public static final class setX implements getDynamicButtonIconTextSpacingDp {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ String f51890p0;

            public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
                return ((setX) objArr[0]).f51890p0;
            }

            @Override // com.mypinpad.tsdk.isolation.getDynamicButtonIconTextSpacingDp
            @NotNull
            public final String setX() {
                return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 952855947, -952855947, System.identityHashCode(this));
            }
        }

        static {
            c();
            f51882h = 0;
            f51883i = 1;
            f51880f = 0;
            f51881g = 1;
            f51879e = (char) 30296;
            f51877c = 6179130717949174605L;
            f51878d = -461867432;
        }

        public setY() {
            throw null;
        }

        public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
            String str3 = "";
            int i11 = f51883i + 21;
            int i12 = i11 % 128;
            f51882h = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 11;
            f51883i = i14 % 128;
            int i15 = i14 % 2;
            char[] charArray = str2.toCharArray();
            char[] charArray2 = "픕걨쒢诗".toCharArray();
            int i16 = f51882h + 69;
            f51883i = i16 % 128;
            if (i16 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            char[] charArray3 = str.toCharArray();
            UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
            int length = charArray3.length;
            char[] cArr = new char[length];
            int length2 = charArray2.length;
            char[] cArr2 = new char[length2];
            int i17 = 0;
            System.arraycopy(charArray3, 0, cArr, 0, length);
            System.arraycopy(charArray2, 0, cArr2, 0, length2);
            cArr[0] = (char) (cArr[0] ^ c10);
            cArr2[2] = (char) (cArr2[2] + ((char) i10));
            int length3 = charArray.length;
            char[] cArr3 = new char[length3];
            uiMessageCallbackKtWhenMappings.setX = 0;
            while (uiMessageCallbackKtWhenMappings.setX < length3) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i17] = uiMessageCallbackKtWhenMappings;
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(20564334);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (50678 - (ViewConfiguration.getEdgeSlop() >> 16)), 40 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1737);
                        byte b10 = (byte) i17;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 1), objArr3);
                        String str4 = (String) objArr3[i17];
                        Class<?>[] clsArr = new Class[1];
                        clsArr[i17] = Object.class;
                        method = cls.getMethod(str4, clsArr);
                        map.put(20564334, method);
                    }
                    int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    Object[] objArr4 = new Object[1];
                    objArr4[i17] = uiMessageCallbackKtWhenMappings;
                    Object method2 = map.get(-68974155);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (TypedValue.complexToFraction(i17, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i17, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 37 - (Process.myPid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 646);
                        byte b12 = (byte) 3;
                        byte b13 = (byte) (b12 - 4);
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, (byte) (b13 + 1), objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class);
                        map.put(-68974155, method2);
                    }
                    int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method3 = map.get(-1108711559);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (Process.getGidForName(str3) + 1), 49 - View.getDefaultSize(0, 0), TextUtils.getOffsetAfter(str3, 0) + 434);
                        byte b14 = (byte) 1;
                        byte b15 = (byte) (-b14);
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, (byte) (b15 + 1), objArr7);
                        String str5 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                        map.put(-1108711559, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                    Object method4 = map.get(533021397);
                    if (method4 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (4449 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 42 - (Process.myTid() >> 22), 1021 - ExpandableListView.getPackedPositionType(0L));
                        byte b16 = (byte) (-1);
                        Object[] objArr9 = new Object[1];
                        b((byte) 6, b16, (byte) (b16 + 1), objArr9);
                        String str6 = (String) objArr9[0];
                        Class<?> cls6 = Integer.TYPE;
                        method4 = cls5.getMethod(str6, cls6, cls6);
                        map.put(533021397, method4);
                    }
                    cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                    char c11 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                    cArr[iIntValue2] = c11;
                    int i18 = uiMessageCallbackKtWhenMappings.setX;
                    cArr3[i18] = (char) (((((long) (c11 ^ charArray[i18])) ^ (f51877c ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f51878d) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f51879e) ^ (-2443367703579691432L)))));
                    uiMessageCallbackKtWhenMappings.setX = i18 + 1;
                    str3 = str3;
                    i17 = 0;
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

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0034). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 113
                int r7 = r7 + 4
                int r8 = r8 * 3
                int r0 = 1 - r8
                byte[] r0 = new byte[r0]
                r1 = 0
                int r8 = 0 - r8
                byte[] r2 = com.mypinpad.tsdk.i.TerminalSessionDefaultImpls.setY.f51884j
                if (r2 != 0) goto L18
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L34
            L18:
                r3 = r1
            L19:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r8) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L26:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r2[r7]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r5
            L34:
                int r7 = -r7
                int r6 = r6 + r7
                r7 = r8
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.TerminalSessionDefaultImpls.setY.b(byte, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f51884j = new byte[]{37, 60, 72, GenerateAcResponseApdu.DDA_HEADER};
        }

        @Override // com.mypinpad.tsdk.isolation.TransactionParameters
        @NotNull
        public final hashCode setCompoundDrawableTintBlendMode() throws Throwable {
            Map<getTransactionPortrait, Future<setAutoSizeTextTypeUniformWithPresetSizes>> map = this.f51885a;
            ArrayList arrayList = new ArrayList(map.size());
            int i10 = f51880f + 33;
            f51881g = i10 % 128;
            int i11 = i10 % 2;
            for (Map.Entry<getTransactionPortrait, Future<setAutoSizeTextTypeUniformWithPresetSizes>> entry : map.entrySet()) {
                int i12 = f51880f + 65;
                f51881g = i12 % 128;
                int i13 = i12 % 2;
                arrayList.add(setTextDirection.setX(entry.getValue(), entry.getKey()));
            }
            TerminalSessionDefaultImpls terminalSessionDefaultImpls = this.f51886b;
            setColorFilter onFocusChangeListener = TerminalSessionDefaultImpls.setOnFocusChangeListener(terminalSessionDefaultImpls);
            Object[] objArr = new Object[1];
            a((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 55438), "꿶栨躐뛘", (-1872222034) - ExpandableListView.getPackedPositionChild(0L), "ڳ", objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener, 2, getDisplayExponent.setY(CollectionsKt___CollectionsKt.joinToString$default(arrayList, ((String) objArr[0]).intern(), null, null, 0, null, a.f51887p0, 30, null)), null, 4}, 1173867142, -1173867141, 2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                int i14 = f51880f + 37;
                f51881g = i14 % 128;
                int i15 = i14 % 2;
                setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) obj;
                if (!((Boolean) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -418746983, 418746985, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes))).booleanValue()) {
                    int i16 = f51881g + 41;
                    int i17 = i16 % 128;
                    f51880f = i17;
                    int i18 = i16 % 2;
                    int i19 = i17 + 33;
                    f51881g = i19 % 128;
                    if (i19 % 2 == 0) {
                        arrayList2.add(obj);
                        int i20 = 60 / 0;
                    } else {
                        arrayList2.add(obj);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                TerminalSessionDefaultImpls.setOnFocusChangeListener(terminalSessionDefaultImpls);
                Object[] objArr2 = new Object[1];
                a((char) (ViewConfiguration.getPressedStateDuration() >> 16), "똋⚯틊煪", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "쐆\ue8bb䷜\ue21aⴧ嚚뉰邻\uf05d䗕ᕯ픬羯ꗒ氮̟怈\uaaf8零Ꮡ\ue1abᳺ莰륿", objArr2);
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{TerminalSessionDefaultImpls.setOnFocusChangeListener(terminalSessionDefaultImpls), 3, null, null, 6}, 1173867142, -1173867141, 3);
                return hashCode.setOnFocusChangeListener.INSTANCE;
            }
            setAutoSizeTextTypeUniformWithPresetSizes.Companion companion = setAutoSizeTextTypeUniformWithPresetSizes.INSTANCE;
            String str = (String) setAutoSizeTextTypeUniformWithPresetSizes.Companion.setCompoundDrawableTintBlendMode(new Object[]{arrayList2}, -698795434, 698795434, (int) System.currentTimeMillis());
            TerminalSessionDefaultImpls.setOnFocusChangeListener(terminalSessionDefaultImpls);
            Object[] objArr3 = new Object[1];
            a((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 52850), "쎐\udddc猈࿎", View.MeasureSpec.getSize(0) + 148757699, "꒧\uf4d5ᶽ녤\ue368ゴ拀몚萰촀ᯅ\uf42a⣥篰캱ࡋ蓍쩽䘷\ue13a㭖终몺\ue873㊽肋\uddaa럚⨖櫴䷂ﮌ約\u2d71饊\ue281䪓챳ﾁ", objArr3);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{Intrinsics.stringPlus(((String) objArr3[0]).intern(), str)}, 2054013026, -2054013023, (int) System.currentTimeMillis());
            setColorFilter onFocusChangeListener2 = TerminalSessionDefaultImpls.setOnFocusChangeListener(terminalSessionDefaultImpls);
            setX setx = new setX();
            setx.f51890p0 = str;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{onFocusChangeListener2, 4, setx, null, 4}, 1173867142, -1173867141, 4);
            return new hashCode.setX(str, arrayList2, null, 4, null);
        }
    }

    static {
        d();
        f51871l = 0;
        m = 1;
        f51869j = 0;
        f51870k = 1;
        f51864e = 1809834479;
        f51865f = -1454817102;
        f51866g = 1798922675;
        f51867h = new byte[]{-97, -58, -107, -13, 109, -63, -50, -111, Constants.CVR_B2b87_11_RFU, -13, 1, 46, -61, -55, 6, 45, -102, -12, -102, 11, 44, -53, -101, -59, 9, 92, -106, -51, 1, 91, -98, -103, -55, -103, Constants.CVR_B2b87_11_RFU, -53, -103, -59, 3, 82, -97, -58, -107, -13, 109, -63, -50, -111, Constants.CVR_B2b87_11_RFU, -13, 1, 39, -12, -102, 11, Constants.CVR_B1b85_0101_MOBILE_APP, -101, -63, Constants.CVR_B2b65_CLEAR_BITS, -110, -94, -85, -92, -34, -68, -88, -45, -72, -87, -34, -24, 102, -72, -44, -81, -47, -66, 31, 102, -72, -94, -33, -93, -68, -34, -63, -105, -52, -57, 15, 41, -108, -106, -112, 49, 45, -3, 2, Constants.CVR_B1b85_0101_MOBILE_APP, -107, 107, -63, -60, 105, Constants.CVR_B1b41_1110_ONLINE_PIN, 82, -107, -50, -97, -15, 103, -61, -58, -109, -52, -47, -108, -108, -108};
        f51868i = new int[]{-2003988900, 848624132, 843556193, -1570668362, -449278846, 1166316965, 1095697086, 1441117218, -2003947945, 986188138, 1493697700, 1078710305, -573974940, -70747513, -1330999004, 986439376, -1497793608, 1491812176};
    }

    public TerminalSessionDefaultImpls(@NotNull Context context, @NotNull TerminalErrorCodes terminalErrorCodes, @NotNull setColorFilter setcolorfilter, @NotNull setContentInsetStartWithNavigation setcontentinsetstartwithnavigation) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(terminalErrorCodes, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(setcontentinsetstartwithnavigation, "");
        this.f51873a = context;
        this.f51874b = terminalErrorCodes;
        this.f51875c = setcolorfilter;
        this.f51876d = setcontentinsetstartwithnavigation;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x01ab A[PHI: r1
      0x01ab: PHI (r1v9 int) = (r1v8 int), (r1v33 int) binds: [B:42:0x01a9, B:39:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x01ad A[PHI: r1
      0x01ad: PHI (r1v30 int) = (r1v8 int), (r1v33 int) binds: [B:42:0x01a9, B:39:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        int i14;
        byte[] bArr;
        int i15;
        boolean z10;
        int length;
        int i16;
        byte[] bArr2;
        int i17 = f51865f;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i18 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i17)};
            int i19 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0) + 50, (ViewConfiguration.getWindowTouchSlop() >> 8) + 434);
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 + 3);
                Object[] objArr3 = new Object[1];
                c(b11, (byte) (b12 - 3), b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            int i20 = f51864e;
            byte[] bArr3 = f51867h;
            if (z11) {
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr2 = new byte[length2];
                    int i21 = 0;
                    while (i21 < length2) {
                        Object[] objArr4 = new Object[i18];
                        objArr4[i19] = Integer.valueOf(bArr3[i21]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (49111 - KeyEvent.getDeadChar(i19, i19)), ImageFormat.getBitsPerPixel(i19) + 42, 51 - (ExpandableListView.getPackedPositionForChild(i19, i19) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i19, i19) == 0L ? 0 : -1)))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i21] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i21++;
                        length2 = length2;
                        i18 = 1;
                        i19 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i20)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) KeyEvent.normalizeMetaState(0), Process.getGidForName("") + 50, 434 - TextUtils.getOffsetAfter("", 0));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 3);
                    Object[] objArr6 = new Object[1];
                    c(b13, (byte) (b14 - 3), b14, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i17) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                int i22 = m + 23;
                f51871l = i22 % 128;
                if (i22 % 2 != 0) {
                    i13 = ((i12 + iIntValue) - 2) * ((int) (((long) i20) - 7616081452308447380L));
                    if (z11) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                } else {
                    i13 = ((i12 + iIntValue) - 2) + ((int) (((long) i20) ^ 7616081452308447380L));
                    if (z11) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                }
                settextalignment.setX = i13 + i14;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f51866g), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 41, TextUtils.getTrimmedLength("") + 2803);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    c(b15, b16, b16, objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int i23 = f51871l + 3;
                    m = i23 % 128;
                    if (i23 % 2 == 0) {
                        length = bArr3.length;
                        bArr = new byte[length];
                        i16 = 1;
                    } else {
                        length = bArr3.length;
                        bArr = new byte[length];
                        i16 = 0;
                    }
                    while (i16 < length) {
                        bArr[i16] = (byte) (((long) bArr3[i16]) ^ 7616081452308447380L);
                        i16++;
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i24 = m + 27;
                    f51871l = i24 % 128;
                    int i25 = i24 % 2;
                    i15 = 1;
                    z10 = true;
                } else {
                    i15 = 1;
                    z10 = false;
                }
                while (true) {
                    settextalignment.setDividerPadding = i15;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    int i26 = f51871l + 125;
                    m = i26 % 128;
                    int i27 = i26 % 2;
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i28 = settextalignment.setX;
                    settextalignment.setX = i28 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i28]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i15 = settextalignment.setDividerPadding + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void b(int[] iArr, int i10, Object[] objArr) throws Throwable {
        int[] iArr2;
        byte[] bArr;
        byte[] bArr2;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr = new char[4];
        int i11 = 2;
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f51868i;
        int i12 = 1;
        byte[] bArr3 = f51872n;
        int i13 = 1833429914;
        int i14 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            iArr2 = new int[length];
            int i15 = 0;
            while (i15 < length) {
                int i16 = f51871l + 5;
                m = i16 % 128;
                int i17 = i16 % i11;
                try {
                    Object[] objArr2 = new Object[i12];
                    objArr2[i14] = Integer.valueOf(iArr3[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, (ViewConfiguration.getFadingEdgeLength() >> 16) + 728);
                        byte b10 = (byte) i14;
                        Object[] objArr3 = new Object[1];
                        c(b10, b10, (byte) (-bArr3[2]), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr2[i15] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i15++;
                    int i18 = m + 91;
                    f51871l = i18 % 128;
                    int i19 = i18 % 2;
                    length = length;
                    i11 = 2;
                    i12 = 1;
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
        } else {
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        if (iArr3 != null) {
            int i20 = m + 107;
            f51871l = i20 % 128;
            int i21 = i20 % 2;
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i22 = 0;
            while (i22 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr3[i22])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(1833429914);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (MotionEvent.axisFromString("") + 1), Process.getGidForName("") + 45, (ViewConfiguration.getEdgeSlop() >> 16) + 728);
                    byte b11 = (byte) 0;
                    byte b12 = (byte) (-bArr3[2]);
                    Object[] objArr5 = new Object[1];
                    c(b11, b11, b12, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method2);
                }
                iArr5[i22] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i22++;
                iArr3 = iArr3;
                length3 = length3;
                bArr3 = bArr3;
            }
            bArr = bArr3;
            iArr3 = iArr5;
        } else {
            bArr = bArr3;
        }
        char c10 = 0;
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i23 = setonlongclicklistener.setDividerPadding;
            if (i23 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            int i24 = iArr[i23];
            char c11 = (char) (i24 >> 16);
            cArr[c10] = c11;
            char c12 = (char) i24;
            cArr[1] = c12;
            int i25 = iArr[i23 + 1];
            char c13 = (char) (i25 >> 16);
            cArr[2] = c13;
            char c14 = (char) i25;
            cArr[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            int i26 = 0;
            for (int i27 = 16; i26 < i27; i27 = 16) {
                int i28 = f51871l + 31;
                m = i28 % 128;
                int i29 = i28 % 2;
                int i30 = setonlongclicklistener.setY ^ iArr4[i26];
                setonlongclicklistener.setY = i30;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i30)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-350984188);
                if (method3 == null) {
                    method3 = ((Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 41 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i26++;
            }
            int i31 = setonlongclicklistener.setY;
            int i32 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i33 = i31 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i33;
            int i34 = i32 ^ iArr4[17];
            setonlongclicklistener.setY = i34;
            cArr[0] = (char) (i34 >>> 16);
            cArr[1] = (char) i34;
            cArr[2] = (char) (i33 >>> 16);
            cArr[3] = (char) i33;
            setOnLongClickListener.setX(iArr4);
            int i35 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i35] = cArr[0];
            cArr2[i35 + 1] = cArr[1];
            cArr2[i35 + 2] = cArr[2];
            cArr2[i35 + 3] = cArr[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-147294223);
            if (method4 != null) {
                bArr2 = bArr;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 483 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                bArr2 = bArr;
                byte length4 = (byte) bArr2.length;
                Object[] objArr8 = new Object[1];
                c((byte) 0, (byte) (length4 - 4), length4, objArr8);
                method4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method4);
            }
            ((Method) method4).invoke(null, objArr7);
            bArr = bArr2;
            c10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 112 - r8
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.TerminalSessionDefaultImpls.f51872n
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.TerminalSessionDefaultImpls.c(int, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f51872n = new byte[]{25, -9, -8, 9};
    }

    public static int e(Throwable th2) {
        if (!(!(th2 instanceof setTitleMarginBottom))) {
            int i10 = f51869j + 113;
            f51870k = i10 % 128;
            if (i10 % 2 == 0) {
                return 30769;
            }
            return PointerIconCompat.TYPE_VERTICAL_TEXT;
        }
        if (th2 instanceof UiMessageId) {
            int i11 = f51870k + 57;
            f51869j = i11 % 128;
            int i12 = i11 % 2;
            return PointerIconCompat.TYPE_ALIAS;
        }
        if (th2 instanceof setClipBounds) {
            return 2004;
        }
        if (th2 instanceof getStackTrace) {
            int i13 = f51870k + 99;
            f51869j = i13 % 128;
            int i14 = i13 % 2;
            return 2005;
        }
        if (th2 instanceof setOutlineAmbientShadowColor) {
            setOutlineAmbientShadowColor setoutlineambientshadowcolor = (setOutlineAmbientShadowColor) th2;
            int iIntValue = ((Integer) setOutlineAmbientShadowColor.setOnFocusChangeListener(new Object[]{setoutlineambientshadowcolor}, 958029167, -958029167, System.identityHashCode(setoutlineambientshadowcolor))).intValue();
            int i15 = f51870k + 7;
            f51869j = i15 % 128;
            int i16 = i15 % 2;
            return iIntValue;
        }
        if (th2 instanceof setOnCapturedPointerListener) {
            return Guess.REFERENCE_YEAR;
        }
        if (!(th2 instanceof addSuppressed)) {
            return th2 instanceof setScrollX ? 2007 : 1007;
        }
        int i17 = f51869j + 67;
        f51870k = i17 % 128;
        return i17 % 2 == 0 ? 5142 : 2006;
    }

    public static Throwable f(Exception exc) {
        int i10 = f51869j + 97;
        int i11 = i10 % 128;
        f51870k = i11;
        int i12 = i10 % 2;
        if (exc instanceof ExecutionException) {
            int i13 = i11 + 91;
            f51869j = i13 % 128;
            if (i13 % 2 != 0) {
                exc.getCause();
                throw null;
            }
            Throwable cause = exc.getCause();
            if (cause != null) {
                int i14 = f51869j + 105;
                f51870k = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 56 / 0;
                }
                return cause;
            }
        }
        return exc;
    }

    public static final /* synthetic */ setColorFilter setOnFocusChangeListener(TerminalSessionDefaultImpls terminalSessionDefaultImpls) {
        int i10 = f51869j + 107;
        f51870k = i10 % 128;
        int i11 = i10 % 2;
        setColorFilter setcolorfilter = terminalSessionDefaultImpls.f51875c;
        if (i11 == 0) {
            int i12 = 31 / 0;
        }
        return setcolorfilter;
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i14 = ~i10;
        if ((((~(i14 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 == 1) {
            TerminalSessionDefaultImpls terminalSessionDefaultImpls = (TerminalSessionDefaultImpls) objArr[0];
            int i15 = f51869j + 87;
            f51870k = i15 % 128;
            int i16 = i15 % 2;
            long compoundDrawableTintBlendMode = terminalSessionDefaultImpls.f51876d.setCompoundDrawableTintBlendMode();
            int i17 = f51869j + 113;
            f51870k = i17 % 128;
            if (i17 % 2 != 0) {
                return Long.valueOf(compoundDrawableTintBlendMode);
            }
            throw null;
        }
        TerminalSessionDefaultImpls terminalSessionDefaultImpls2 = (TerminalSessionDefaultImpls) objArr[0];
        int i18 = f51870k + 73;
        f51869j = i18 % 128;
        int i19 = i18 % 2;
        terminalSessionDefaultImpls2.getClass();
        Context context = terminalSessionDefaultImpls2.f51873a;
        Object systemService = context.getSystemService((Class<Object>) AudioManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService, "");
        setColorFilter setcolorfilter = terminalSessionDefaultImpls2.f51875c;
        fillInStackTrace fillinstacktrace = new fillInStackTrace((AudioManager) systemService, setcolorfilter);
        Object systemService2 = context.getSystemService((Class<Object>) CameraManager.class);
        Intrinsics.checkNotNullExpressionValue(systemService2, "");
        setProgressBackgroundTintMode setprogressbackgroundtintmode = new setProgressBackgroundTintMode(fillinstacktrace, new setFastScrollStyle((CameraManager) systemService2, setcolorfilter));
        int i20 = f51870k;
        int i21 = i20 + 105;
        f51869j = i21 % 128;
        if (i21 % 2 != 0) {
            throw null;
        }
        int i22 = i20 + 3;
        f51869j = i22 % 128;
        int i23 = i22 % 2;
        return setprogressbackgroundtintmode;
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final /* synthetic */ setAccessibilityDelegate setCompoundDrawableTintBlendMode() {
        return (setAccessibilityDelegate) setX(new Object[]{this}, 1778522184, -1778522184, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final void setDividerPadding() {
        int i10 = f51870k + 65;
        f51869j = i10 % 128;
        int i11 = i10 % 2;
        this.f51874b.setY();
        int i12 = f51869j + 97;
        f51870k = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final void setY(@NotNull Duration duration, @NotNull List<? extends getTransactionPortrait> list) {
        int i10 = f51870k + 15;
        f51869j = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f51874b.setCompoundDrawableTintBlendMode(duration, list);
        int i12 = f51869j + 9;
        f51870k = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final void setOnFocusChangeListener(@NotNull byte[] bArr) throws Throwable {
        setColorFilter setcolorfilter = this.f51875c;
        Intrinsics.checkNotNullParameter(bArr, "");
        Object obj = null;
        try {
            Object[] objArr = new Object[1];
            a(23 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (short) ((ViewConfiguration.getEdgeSlop() >> 16) - 48), 1032838987 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1030315653, objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 2001, null, null, 6}, 1173867142, -1173867141, 2001);
            new CurrencyKt().setDividerPadding(bArr);
        } catch (Exception e5) {
            Object[] objArr2 = new Object[1];
            b(new int[]{1869173728, 1321526015, -2006523593, -874518620, 1482014691, 645990362, -1331616098, 1137038057, -662087333, 481126145, -1294502287, 402496854, -1278551104, 1845985791, 432010158, 414012568, -2046098854, -532008787, 174342133, -1294873860}, 38 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr2);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, -821746216, 821746227, (int) System.currentTimeMillis());
            int iE = e(e5);
            if (e5 instanceof getDynamicButtonIconTextSpacingDp) {
                obj = e5;
            } else {
                int i10 = f51869j + 17;
                f51870k = i10 % 128;
                int i11 = i10 % 2;
            }
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, Integer.valueOf(iE), (getDynamicButtonIconTextSpacingDp) obj, e5}, -1999045713, 1999045717, iE);
        }
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    @NotNull
    public final synchronized hashCode setDividerPadding(@NotNull setChildIndicatorBounds setchildindicatorbounds, long j10, boolean z10) {
        hashCode hashcode;
        int i10 = f51870k + 91;
        f51869j = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
        Object[] objArr = new Object[1];
        a((-11) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3), (short) ((-58) - TextUtils.getOffsetBefore("", 0)), 1032838974 - ((Process.getThreadPriority(0) + 20) >> 6), ExpandableListView.getPackedPositionType(0L) + 1030315713, objArr);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        String x4 = null;
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f51875c, 1005, getDisplayExponent.setY(String.valueOf(j10)), null, 4}, 1173867142, -1173867141, 1005);
        try {
            this.f51876d.setY(setchildindicatorbounds, j10, z10);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f51875c, 1006, null, null, 6}, 1173867142, -1173867141, 1006);
            hashcode = hashCode.setOnFocusChangeListener.INSTANCE;
        } catch (Exception e5) {
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getJumpTapTimeout() >> 16) - 6, (byte) ((-16777173) - Color.rgb(0, 0, 0)), (short) ((-45) - (KeyEvent.getMaxKeyCode() >> 16)), 1032838938 - Drawable.resolveOpacity(0, 0), 1030315739 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, -821746216, 821746227, (int) System.currentTimeMillis());
            Throwable thF = f(e5);
            int iE = e(thF);
            Object obj = thF instanceof getDynamicButtonIconTextSpacingDp ? thF : null;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f51875c, Integer.valueOf(iE), (getDynamicButtonIconTextSpacingDp) obj, thF}, -1999045713, 1999045717, iE);
            if (obj == null) {
                int i12 = f51869j + 73;
                f51870k = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 7 / 0;
                }
            } else {
                x4 = ((getDynamicButtonIconTextSpacingDp) obj).setX();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iE);
            sb2.append((Object) x4);
            Object[] objArr3 = new Object[1];
            b(new int[]{628384917, 1642318729}, TextUtils.getCapsMode("", 0, 0) + 2, objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append((Object) thF.getClass().getSimpleName());
            hashCode.setX setx = new hashCode.setX(sb2.toString(), null, thF, 2, null);
            int i14 = f51870k + 101;
            f51869j = i14 % 128;
            int i15 = i14 % 2;
            hashcode = setx;
        }
        return hashcode;
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    @NotNull
    public final synchronized TransactionParameters setY(@NotNull List<? extends getTransactionPortrait> list) {
        setY sety;
        Intrinsics.checkNotNullParameter(list, "");
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f51875c, 1, null, null, 6}, 1173867142, -1173867141, 1);
        Map<getTransactionPortrait, Future<setAutoSizeTextTypeUniformWithPresetSizes>> onFocusChangeListener = this.f51874b.setOnFocusChangeListener(list);
        sety = new setY();
        sety.f51885a = onFocusChangeListener;
        sety.f51886b = this;
        int i10 = f51870k + 113;
        f51869j = i10 % 128;
        int i11 = i10 % 2;
        return sety;
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final long setOnFocusChangeListener() {
        return ((Long) setX(new Object[]{this}, 1016809037, -1016809036, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final synchronized void setY() {
        int i10 = f51869j + 95;
        f51870k = i10 % 128;
        int i11 = i10 % 2;
        this.f51876d.setY();
        int i12 = f51870k + 111;
        f51869j = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getValueQualifier
    public final void setX() {
        int i10 = f51869j + 15;
        f51870k = i10 % 128;
        int i11 = i10 % 2;
        this.f51874b.setCompoundDrawableTintBlendMode();
        int i12 = f51870k + 9;
        f51869j = i12 % 128;
        int i13 = i12 % 2;
    }
}
