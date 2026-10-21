package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.camera.core.impl.utils.c;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/uv;", "", "", "setY", "()[B", "Lcom/mypinpad/tsdk/i/uy;", "a", "Lcom/mypinpad/tsdk/i/uy;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/uy;", "b", "[B", "setX", "setDividerPadding", "p0", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/uy;[B)V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBerTlv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BerTlv.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tlv/BerTlv\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n7#2,8:157\n1#3:165\n*S KotlinDebug\n*F\n+ 1 BerTlv.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tlv/BerTlv\n*L\n41#1:157,8\n*E\n"})
public final class uv {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61417c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61418d = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final uy setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setDividerPadding;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.uv$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/mypinpad/tsdk/i/uv$setDividerPadding;", "", "Ljava/nio/ByteBuffer;", "p0", "Lcom/mypinpad/tsdk/i/uv;", "setX", "(Ljava/nio/ByteBuffer;)Lcom/mypinpad/tsdk/i/uv;", "", "setOnFocusChangeListener", "([B)[B", "", "setCompoundDrawableTintBlendMode", "([B)Ljava/util/List;", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nBerTlv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BerTlv.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tlv/BerTlv$Companion\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 HexEncoding.kt\ncom/mypinpad/common/bytes/encoding/hex/HexEncodingKt\n*L\n1#1,156:1\n7#2,8:157\n7#2,8:169\n7#2,8:269\n288#3,2:165\n288#3,2:167\n71#4,7:177\n114#4:184\n90#4,18:185\n78#4:203\n119#4:204\n90#4,18:205\n79#4,3:223\n13#4,6:226\n30#4,34:232\n19#4,3:266\n*S KotlinDebug\n*F\n+ 1 BerTlv.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tlv/BerTlv$Companion\n*L\n71#1:157,8\n91#1:169,8\n99#1:269,8\n87#1:165,2\n89#1:167,2\n96#1:177,7\n96#1:184\n96#1:185,18\n96#1:203\n96#1:204\n96#1:205,18\n96#1:223,3\n97#1:226,6\n97#1:232,34\n97#1:266,3\n*E\n"})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f61421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f61423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f61424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f61425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final byte[] f61426f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f61427g = 0;

        static {
            c();
            f61424d = 0;
            f61425e = 1;
            f61422b = 0;
            f61423c = 1;
            f61421a = new int[]{-663298455, -1514355518, -1686916538, -1423814013, -607303319, 2130593168, -230965150, 1422820841, -1138133719, -731695440, 1868369176, -171495410, -1483878533, 1424384543, 835615367, 1545491629, -1413498118, 2018627029};
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
            char[] cArr;
            int[] iArr2;
            Object method;
            setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
            char[] cArr2 = new char[4];
            int i11 = 2;
            char[] cArr3 = new char[iArr.length * 2];
            int[] iArr3 = f61421a;
            int i12 = 1;
            int i13 = f61427g;
            int i14 = 1833429914;
            int i15 = 0;
            if (iArr3 != null) {
                int length = iArr3.length;
                iArr2 = new int[length];
                int i16 = 0;
                while (i16 < length) {
                    int i17 = f61424d + 25;
                    f61425e = i17 % 128;
                    int i18 = i17 % i11;
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i15] = Integer.valueOf(iArr3[i16]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method2 = map.get(Integer.valueOf(i14));
                        if (method2 == null) {
                            Class cls = (Class) setTextScaleX.setX((char) Color.argb(i15, i15, i15, i15), TextUtils.lastIndexOf("", '0', i15, i15) + 45, 728 - ExpandableListView.getPackedPositionGroup(0L));
                            byte b10 = (byte) (i13 & 3);
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b11, b10, objArr3);
                            method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1833429914, method2);
                        }
                        iArr2[i16] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                        i16++;
                        length = length;
                        cArr3 = cArr3;
                        i11 = 2;
                        i14 = 1833429914;
                        i15 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                cArr = cArr3;
            } else {
                cArr = cArr3;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            if (iArr3 != null) {
                int length3 = iArr3.length;
                int[] iArr5 = new int[length3];
                int i19 = 0;
                while (i19 < length3) {
                    int i20 = f61424d + 33;
                    f61425e = i20 % 128;
                    int i21 = i20 % 2;
                    Object[] objArr4 = new Object[i12];
                    objArr4[0] = Integer.valueOf(iArr3[i19]);
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1833429914);
                    if (method3 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43, 728 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        byte b12 = (byte) (i13 & 3);
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, b13, b12, objArr5);
                        method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1833429914, method3);
                    }
                    iArr5[i19] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                    i19++;
                    iArr3 = iArr3;
                    i13 = i13;
                    length3 = length3;
                    i12 = 1;
                }
                iArr3 = iArr5;
            }
            System.arraycopy(iArr3, 0, iArr4, 0, length2);
            setonlongclicklistener.setDividerPadding = 0;
            while (true) {
                int i22 = setonlongclicklistener.setDividerPadding;
                if (i22 >= iArr.length) {
                    objArr[0] = new String(cArr, 0, i10);
                    return;
                }
                int i23 = f61424d + 49;
                f61425e = i23 % 128;
                int i24 = i23 % 2;
                int i25 = iArr[i22];
                char c10 = (char) (i25 >> 16);
                cArr2[0] = c10;
                char c11 = (char) i25;
                cArr2[1] = c11;
                int i26 = iArr[i22 + 1];
                char c12 = (char) (i26 >> 16);
                cArr2[2] = c12;
                char c13 = (char) i26;
                cArr2[3] = c13;
                setonlongclicklistener.setY = (c10 << 16) + c11;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
                setOnLongClickListener.setX(iArr4);
                int i27 = 0;
                for (int i28 = 16; i27 < i28; i28 = 16) {
                    int i29 = f61425e + 85;
                    f61424d = i29 % 128;
                    if (i29 % 2 != 0) {
                        int i30 = setonlongclicklistener.setY ^ iArr4[i27];
                        setonlongclicklistener.setY = i30;
                        Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i30)), setonlongclicklistener, setonlongclicklistener};
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method4 = map3.get(-350984188);
                        if (method4 == null) {
                            method4 = ((Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 41 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                            map3.put(-350984188, method4);
                        }
                        int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                        setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                        setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                        i27 += 54;
                    } else {
                        int i31 = setonlongclicklistener.setY ^ iArr4[i27];
                        setonlongclicklistener.setY = i31;
                        Object[] objArr7 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i31)), setonlongclicklistener, setonlongclicklistener};
                        Map map4 = setTextScaleX.setMaxEms;
                        Object obj = map4.get(-350984188);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", 0), 41 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 180 - TextUtils.getCapsMode("", 0, 0))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                            map4.put(-350984188, method);
                        }
                        int iIntValue2 = ((Integer) ((Method) method).invoke(null, objArr7)).intValue();
                        setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                        setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue2;
                        i27++;
                    }
                }
                int i32 = setonlongclicklistener.setY;
                int i33 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                int i34 = i32 ^ iArr4[16];
                setonlongclicklistener.setCompoundDrawableTintBlendMode = i34;
                int i35 = i33 ^ iArr4[17];
                setonlongclicklistener.setY = i35;
                cArr2[0] = (char) (i35 >>> 16);
                cArr2[1] = (char) i35;
                cArr2[2] = (char) (i34 >>> 16);
                cArr2[3] = (char) i34;
                setOnLongClickListener.setX(iArr4);
                int i36 = setonlongclicklistener.setDividerPadding * 2;
                cArr[i36] = cArr2[0];
                cArr[i36 + 1] = cArr2[1];
                cArr[i36 + 2] = cArr2[2];
                cArr[i36 + 3] = cArr2[3];
                Object[] objArr8 = {setonlongclicklistener, setonlongclicklistener};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(-147294223);
                if (method5 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 41, KeyEvent.getDeadChar(0, 0) + 483);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr9 = new Object[1];
                    b(b15, b15, b14, objArr9);
                    method5 = cls3.getMethod((String) objArr9[0], Object.class, Object.class);
                    map5.put(-147294223, method5);
                }
                ((Method) method5).invoke(null, objArr8);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002e  */
        /* JADX WARN: Code duplicated, block: B:8:0x0026  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r9 = r9 * 4
                int r9 = 108 - r9
                int r8 = r8 * 4
                int r8 = 1 - r8
                byte[] r0 = new byte[r8]
                r1 = 0
                byte[] r2 = com.mypinpad.tsdk.isolation.uv.Companion.f61426f
                if (r2 != 0) goto L1a
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r10
                r10 = r8
                r8 = r7
                goto L36
            L1a:
                r3 = r1
                r6 = r8
                r8 = r7
                r7 = r9
                r9 = r6
            L1f:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r0[r3] = r5
                if (r4 != r9) goto L2e
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r1)
                r10[r1] = r7
                return
            L2e:
                r3 = r2[r8]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r2
                r2 = r0
                r0 = r6
            L36:
                int r9 = -r9
                int r7 = r7 + r9
                int r8 = r8 + 1
                r9 = r10
                r10 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.uv.Companion.b(int, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f61426f = new byte[]{76, -66, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 25};
            f61427g = 85;
        }

        public static int d(@NotNull ByteBuffer byteBuffer) {
            int i10 = f61422b + 125;
            f61423c = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(byteBuffer, "");
            byte b10 = byteBuffer.get();
            int i12 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i12;
            }
            int i13 = f61423c + 79;
            f61422b = i13 % 128;
            int i14 = i13 % 2;
            int i15 = b10 & 127;
            int i16 = 0;
            int i17 = 0;
            while (i16 < i15) {
                i17 = (i17 << 8) + (byteBuffer.get() & 255);
                i16++;
                int i18 = f61423c + 85;
                f61422b = i18 % 128;
                int i19 = i18 % 2;
            }
            return i17;
        }

        @NotNull
        public static List<uv> setCompoundDrawableTintBlendMode(@NotNull byte[] p4) {
            Intrinsics.checkNotNullParameter(p4, "");
            ArrayList arrayList = new ArrayList();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(p4);
            int i10 = f61422b + 119;
            f61423c = i10 % 128;
            int i11 = i10 % 2;
            while (!(!byteBufferWrap.hasRemaining())) {
                int i12 = f61422b + 57;
                f61423c = i12 % 128;
                int i13 = i12 % 2;
                Companion companion = uv.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "");
                arrayList.add(setX(byteBufferWrap));
            }
            return arrayList;
        }

        @NotNull
        public static byte[] setOnFocusChangeListener(@NotNull byte[] p4) throws Throwable {
            byte b10;
            Object next;
            String str;
            char c10;
            char c11;
            String strIntern;
            byte b11;
            int i10;
            Object next2;
            uy uyVar;
            uy.Companion companion;
            Object[] objArr;
            Intrinsics.checkNotNullParameter(p4, "");
            List<uv> compoundDrawableTintBlendMode = setCompoundDrawableTintBlendMode(p4);
            Iterator<T> it = compoundDrawableTintBlendMode.iterator();
            while (true) {
                b10 = 1;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                uv uvVar = (uv) next;
                uy uyVar2 = (uy) uv.setDividerPadding(new Object[]{uvVar}, -79307481, 79307483, System.identityHashCode(uvVar));
                uy.Companion companion2 = uy.INSTANCE;
                Object[] objArr2 = new Object[1];
                a(new int[]{1457982690, -1819505748}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr2);
                if (Intrinsics.areEqual(uyVar2, (uy) uw.setY(new Object[]{companion2, ((String) objArr2[0]).intern()}, 1283421674, -1283421674, (int) System.currentTimeMillis()))) {
                    int i11 = f61423c + 53;
                    f61422b = i11 % 128;
                    int i12 = i11 % 2;
                    break;
                }
            }
            uv uvVar2 = (uv) next;
            char c12 = '1';
            if (uvVar2 == null) {
                Iterator<T> it2 = compoundDrawableTintBlendMode.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    int i13 = f61422b + 49;
                    f61423c = i13 % 128;
                    int i14 = i13 % 2;
                    next2 = it2.next();
                    uv uvVar3 = (uv) next2;
                    uyVar = (uy) uv.setDividerPadding(new Object[]{uvVar3}, -79307481, 79307483, System.identityHashCode(uvVar3));
                    companion = uy.INSTANCE;
                    objArr = new Object[1];
                    a(new int[]{-2147045986, -1198164181}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, objArr);
                } while (!Intrinsics.areEqual(uyVar, (uy) uw.setY(new Object[]{companion, ((String) objArr[0]).intern()}, 1283421674, -1283421674, (int) System.currentTimeMillis())));
                uvVar2 = (uv) next2;
                if (uvVar2 == null) {
                    TerminalException terminalException = new TerminalException(10077, null, null);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                }
            }
            uy uyVar3 = (uy) uv.setDividerPadding(new Object[]{uvVar2}, -79307481, 79307483, System.identityHashCode(uvVar2));
            uy.Companion companion3 = uy.INSTANCE;
            Object[] objArr3 = new Object[1];
            a(new int[]{1457982690, -1819505748}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2, objArr3);
            if (Intrinsics.areEqual(uyVar3, (uy) uw.setY(new Object[]{companion3, ((String) objArr3[0]).intern()}, 1283421674, -1283421674, (int) System.currentTimeMillis()))) {
                return (byte[]) uv.setDividerPadding(new Object[]{uvVar2}, -15189601, 15189602, System.identityHashCode(uvVar2));
            }
            Object[] objArr4 = new Object[1];
            a(new int[]{-2147045986, -1198164181}, 2 - (Process.myPid() >> 22), objArr4);
            if (!Intrinsics.areEqual(uyVar3, (uy) uw.setY(new Object[]{companion3, ((String) objArr4[0]).intern()}, 1283421674, -1283421674, (int) System.currentTimeMillis()))) {
                TerminalException terminalException2 = new TerminalException(10077, ((uy) uv.setDividerPadding(new Object[]{uvVar2}, -79307481, 79307483, System.identityHashCode(uvVar2))).toString(), null);
                mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException2;
            }
            byte[] bArr = (byte[]) uv.setDividerPadding(new Object[]{uvVar2}, -15189601, 15189602, System.identityHashCode(uvVar2));
            if (bArr.length == 0) {
                str = "";
            } else {
                char[] cArr = new char[bArr.length << 1];
                for (int i15 = 0; i15 < bArr.length; i15++) {
                    byte b12 = bArr[i15];
                    int i16 = i15 << 1;
                    byte b13 = (byte) ((b12 >>> 4) & 15);
                    switch (b13) {
                        case 0:
                            c10 = '0';
                            break;
                        case 1:
                            c10 = '1';
                            break;
                        case 2:
                            c10 = '2';
                            break;
                        case 3:
                            int i17 = f61423c + 103;
                            f61422b = i17 % 128;
                            int i18 = i17 % 2;
                            c10 = '3';
                            break;
                        case 4:
                            c10 = '4';
                            break;
                        case 5:
                            c10 = '5';
                            break;
                        case 6:
                            c10 = '6';
                            break;
                        case 7:
                            c10 = '7';
                            break;
                        case 8:
                            c10 = '8';
                            break;
                        case 9:
                            c10 = '9';
                            break;
                        case 10:
                            c10 = 'a';
                            break;
                        case 11:
                            c10 = 'b';
                            break;
                        case 12:
                            c10 = 'c';
                            break;
                        case 13:
                            c10 = 'd';
                            break;
                        case 14:
                            c10 = 'e';
                            break;
                        case 15:
                            c10 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b13));
                    }
                    cArr[i16] = c10;
                    int i19 = i16 + 1;
                    byte b14 = (byte) (b12 & 15);
                    switch (b14) {
                        case 0:
                            c11 = '0';
                            break;
                        case 1:
                            c11 = '1';
                            break;
                        case 2:
                            c11 = '2';
                            break;
                        case 3:
                            c11 = '3';
                            break;
                        case 4:
                            c11 = '4';
                            break;
                        case 5:
                            c11 = '5';
                            break;
                        case 6:
                            c11 = '6';
                            break;
                        case 7:
                            c11 = '7';
                            break;
                        case 8:
                            c11 = '8';
                            break;
                        case 9:
                            c11 = '9';
                            break;
                        case 10:
                            c11 = 'a';
                            break;
                        case 11:
                            c11 = 'b';
                            break;
                        case 12:
                            c11 = 'c';
                            break;
                        case 13:
                            c11 = 'd';
                            break;
                        case 14:
                            c11 = 'e';
                            break;
                        case 15:
                            c11 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b14));
                    }
                    cArr[i19] = c11;
                }
                str = new String(cArr);
            }
            String strSubstringBefore$default = StringsKt__StringsKt.substringBefore$default(str, 'd', (String) null, 2, (Object) null);
            StringBuilder sbD = c.d(strSubstringBefore$default);
            if (strSubstringBefore$default.length() % 2 == 0) {
                strIntern = "";
            } else {
                Object[] objArr5 = new Object[1];
                a(new int[]{369694617, -2057160868}, ExpandableListView.getPackedPositionGroup(0L) + 1, objArr5);
                strIntern = ((String) objArr5[0]).intern();
            }
            sbD.append(strIntern);
            String strReplace = setNetworkAvailable.setY().replace(sbD.toString(), "");
            if (strReplace.length() % 2 != 0) {
                Object[] objArr6 = new Object[1];
                a(new int[]{1962230133, -1299865251, 1408819765, 1588192651, -1610277620, -1852211973, -1262581210, 1892356406, 708646626, 1492208167}, 18 - ImageFormat.getBitsPerPixel(0), objArr6);
                throw new IllegalArgumentException(((String) objArr6[0]).intern().toString());
            }
            byte[] bArr2 = new byte[strReplace.length() / 2];
            int i20 = 0;
            while (i20 < strReplace.length()) {
                int i21 = i20 / 2;
                Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i20)), Character.valueOf(strReplace.charAt(i20 + 1)));
                char cCharValue = ((Character) pair.getFirst()).charValue();
                if (cCharValue == '0') {
                    int i22 = f61422b + 125;
                    f61423c = i22 % 128;
                    int i23 = i22 % 2;
                    b11 = 0;
                } else if (cCharValue == c12) {
                    b11 = b10;
                } else if (cCharValue == '2') {
                    b11 = 2;
                } else if (cCharValue == '3') {
                    b11 = 3;
                } else if (cCharValue == '4') {
                    b11 = 4;
                } else if (cCharValue == '5') {
                    b11 = 5;
                } else if (cCharValue == '6') {
                    b11 = 6;
                } else if (cCharValue == '7') {
                    int i24 = f61422b + 91;
                    f61423c = i24 % 128;
                    b11 = i24 % 2 == 0 ? (byte) 126 : (byte) 7;
                } else if (cCharValue == '8') {
                    b11 = 8;
                } else if (cCharValue == '9') {
                    int i25 = f61423c + 107;
                    f61422b = i25 % 128;
                    b11 = i25 % 2 != 0 ? (byte) 113 : (byte) 9;
                } else if (cCharValue == 'a' || cCharValue == 'A') {
                    b11 = 10;
                } else if (cCharValue == 'b') {
                    int i26 = f61423c + 63;
                    f61422b = i26 % 128;
                    b11 = i26 % 2 != 0 ? (byte) 25 : (byte) 11;
                } else if (cCharValue == 'B') {
                    int i27 = f61422b + 123;
                    f61423c = i27 % 128;
                    int i28 = i27 % 2;
                } else if (cCharValue == 'c' || cCharValue == 'C') {
                    b11 = 12;
                } else if (cCharValue == 'd' || cCharValue == 'D') {
                    b11 = 13;
                } else if (cCharValue == 'e' || cCharValue == 'E') {
                    b11 = Constants.CVR_B1b41_1110_ONLINE_PIN;
                } else {
                    if (cCharValue != 'f' && cCharValue != 'F') {
                        throw new IllegalArgumentException(String.valueOf(cCharValue));
                    }
                    b11 = 15;
                }
                int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl(b11) & 255));
                char cCharValue2 = ((Character) pair.getSecond()).charValue();
                if (cCharValue2 == '0') {
                    i10 = 0;
                } else if (cCharValue2 == c12) {
                    i10 = 1;
                } else if (cCharValue2 == '2') {
                    i10 = 2;
                } else if (cCharValue2 == '3') {
                    i10 = 3;
                } else if (cCharValue2 == '4') {
                    i10 = 4;
                } else if (cCharValue2 == '5') {
                    i10 = 5;
                } else {
                    if (cCharValue2 == '6') {
                        i10 = 6;
                    } else if (cCharValue2 == '7') {
                        i10 = 7;
                    } else if (cCharValue2 == '8') {
                        i10 = 8;
                    } else if (cCharValue2 == '9') {
                        i10 = 9;
                    } else if (cCharValue2 == 'a' || cCharValue2 == 'A') {
                        i10 = 10;
                    } else if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                        i10 = 11;
                    } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                        i10 = 12;
                    } else if (cCharValue2 == 'd') {
                        i10 = 13;
                    } else if (cCharValue2 == 'D') {
                        int i29 = f61422b + 113;
                        f61423c = i29 % 128;
                        int i30 = i29 % 2;
                        i10 = 13;
                    } else if (cCharValue2 == 'e') {
                        i10 = 14;
                    } else if (cCharValue2 == 'E') {
                        int i31 = f61423c + 111;
                        f61422b = i31 % 128;
                        int i32 = i31 % 2;
                        i10 = 14;
                    } else {
                        if (cCharValue2 != 'f' && cCharValue2 != 'F') {
                            throw new IllegalArgumentException(String.valueOf(cCharValue2));
                        }
                        i10 = 15;
                    }
                    bArr2[i21] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) + iM5570constructorimpl);
                    i20 += 2;
                    c12 = '1';
                    b10 = 1;
                }
                bArr2[i21] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) + iM5570constructorimpl);
                i20 += 2;
                c12 = '1';
                b10 = 1;
            }
            return bArr2;
        }

        @NotNull
        public static uv setX(@NotNull ByteBuffer p4) throws TerminalException {
            Intrinsics.checkNotNullParameter(p4, "");
            try {
                uy.Companion companion = uy.INSTANCE;
                uy uyVar = (uy) uy.Companion.setOnFocusChangeListener(new Object[]{p4}, -1915935166, 1915935166, (int) System.currentTimeMillis());
                Companion companion2 = uv.INSTANCE;
                byte[] bArr = new byte[d(p4)];
                p4.get(bArr);
                uv uvVar = new uv(uyVar, bArr);
                int i10 = f61422b + 107;
                f61423c = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 7 / 0;
                }
                return uvVar;
            } catch (Exception e5) {
                TerminalException terminalException = new TerminalException(10023, e5.getClass().getSimpleName(), null);
                mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException;
            }
        }
    }

    static {
        int i10 = f61418d;
        int i11 = ((i10 | 125) << 1) - (i10 ^ 125);
        f61417c = i11 % 128;
        int i12 = i11 % 2;
    }

    public uv(@NotNull uy uyVar, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(uyVar, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setOnFocusChangeListener = uyVar;
        this.setDividerPadding = bArr;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws TerminalException {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = (((~(i10 | i14)) | (~((~i12) | i14))) * (-964)) + ((i13 | (~(i14 | i12))) * (-964)) + (i11 * 965) + ((i10 * (-963)) - 964);
        int i16 = 2;
        if (i15 == 1) {
            uv uvVar = (uv) objArr[0];
            int i17 = f61417c + 59;
            int i18 = i17 % 128;
            f61418d = i18;
            int i19 = i17 % 2;
            byte[] bArr = uvVar.setDividerPadding;
            int i20 = (i18 ^ 120) + ((i18 & 120) << 1);
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f61417c = i21 % 128;
            int i22 = i21 % 2;
            return bArr;
        }
        if (i15 == 2) {
            uv uvVar2 = (uv) objArr[0];
            int i23 = f61417c;
            int i24 = i23 & 59;
            int i25 = (((~i24) & (i23 | 59)) - (~(-(-(i24 << 1))))) - 1;
            f61418d = i25 % 128;
            int i26 = i25 % 2;
            uy uyVar = uvVar2.setOnFocusChangeListener;
            int i27 = i23 + 81;
            f61418d = i27 % 128;
            int i28 = i27 % 2;
            return uyVar;
        }
        if (i15 != 3) {
            uv uvVar3 = (uv) objArr[0];
            int i29 = f61418d;
            int i30 = ((i29 | 24) << 1) - (i29 ^ 24);
            int i31 = (i30 ^ (-1)) + (i30 << 1);
            f61417c = i31 % 128;
            int i32 = i31 % 2;
            int length = uvVar3.setDividerPadding.length;
            byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(uvVar3.setOnFocusChangeListener.setX(), (byte[]) setDividerPadding(new Object[]{Integer.valueOf(length)}, 1922393762, -1922393759, length)), uvVar3.setDividerPadding);
            int i33 = f61418d;
            int i34 = (i33 ^ 37) + ((i33 & 37) << 1);
            f61417c = i34 % 128;
            int i35 = i34 % 2;
            return bArrPlus;
        }
        int iIntValue = ((Number) objArr[0]).intValue();
        int i36 = f61417c;
        int i37 = i36 & 81;
        int i38 = -(-((i36 ^ 81) | i37));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        int i40 = i39 % 128;
        f61418d = i40;
        int i41 = i39 % 2;
        if (iIntValue == 0) {
            int i42 = (i40 & 41) + (i40 | 41);
            f61417c = i42 % 128;
            int i43 = i42 % 2;
            byte[] bArr2 = (byte[]) us.setCompoundDrawableTintBlendMode(new Object[]{new int[]{0}}, -365257144, 365257144, (int) System.currentTimeMillis());
            int i44 = f61418d;
            int i45 = i44 & 27;
            int i46 = (i45 - (~(-(-((i44 ^ 27) | i45))))) - 1;
            f61417c = i46 % 128;
            if (i46 % 2 == 0) {
                return bArr2;
            }
            throw null;
        }
        if (iIntValue <= 127) {
            int i47 = i40 & 11;
            int i48 = (((i40 ^ 11) | i47) << 1) - ((i40 | 11) & (~i47));
            f61417c = i48 % 128;
            if (i48 % 2 == 0) {
                return (byte[]) us.setCompoundDrawableTintBlendMode(new Object[]{new int[]{iIntValue}}, -365257144, 365257144, (int) System.currentTimeMillis());
            }
            int[] iArr = new int[0];
            iArr[0] = iIntValue;
            return (byte[]) us.setCompoundDrawableTintBlendMode(new Object[]{iArr}, -365257144, 365257144, (int) System.currentTimeMillis());
        }
        int i49 = (((i40 | 56) << 1) - (i40 ^ 56)) - 1;
        f61417c = i49 % 128;
        int i50 = i49 % 2;
        int i51 = 256;
        int i52 = 1;
        while (iIntValue >= i51) {
            int i53 = f61417c;
            int i54 = i53 & 93;
            int i55 = ((i53 ^ 93) | i54) << 1;
            int i56 = -((i53 | 93) & (~i54));
            int i57 = (i55 & i56) + (i56 | i55);
            f61418d = i57 % 128;
            if (i57 % 2 == 0) {
                i51 >>>= 41;
                if (i51 == 0) {
                    TerminalException terminalException = new TerminalException(10022, null, null);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                }
            } else {
                int i58 = i52 & 1;
                int i59 = (i52 ^ 1) | i58;
                i52 = ((i58 | i59) << 1) - (i59 ^ i58);
                i51 <<= 8;
                if (i51 == 0) {
                    TerminalException terminalException2 = new TerminalException(10022, null, null);
                    mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException2;
                }
            }
        }
        int i60 = i52 * (-49);
        int i61 = ((~i60) & 51) | (i60 & (-52));
        int i62 = (i60 & 51) << 1;
        int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
        int i64 = -(-(((iIntValue ^ 1) | (iIntValue & 1)) * (-50)));
        int i65 = i63 ^ i64;
        int i66 = (((i64 & i63) | i65) << 1) - i65;
        int i67 = ~i52;
        int i68 = (i67 | i52) & i67;
        int i69 = ((~i68) & (-2)) | (i68 & 1);
        int i70 = i68 & (-2);
        int i71 = (i70 & i69) | (i69 ^ i70);
        int i72 = i71 ^ iIntValue;
        int i73 = ~iIntValue;
        int i74 = i71 & iIntValue;
        int i75 = ~((i74 & i72) | (i72 ^ i74));
        int i76 = i67 & i73;
        int i77 = i76 | ((~i76) & (i67 | i73));
        int i78 = (i77 & 1) | (i77 ^ 1);
        int i79 = ~i78;
        int i80 = (i78 | i79) & i79;
        int i81 = i75 & i80;
        int i82 = (i66 - (~(-(-((((i75 | i80) & (~i81)) | i81) * 50))))) - 1;
        int i83 = (i73 | iIntValue) & i73;
        int i84 = ~((i67 ^ i83) | (i67 & i83));
        int i85 = i67 ^ 1;
        int i86 = i67 & 1;
        int i87 = ~((i86 & i85) | (i85 ^ i86));
        int i88 = (i87 & i84) | (i84 ^ i87);
        int i89 = i73 ^ 1;
        int i90 = i73 & 1;
        int i91 = ~((i89 & i90) | (i89 ^ i90));
        int i92 = -(-(((i88 & i91) | (i88 ^ i91)) * 50));
        int i93 = ((i82 ^ i92) | (i82 & i92)) << 1;
        int i94 = -(((~i82) & i92) | ((~i92) & i82));
        int i95 = ((i93 | i94) << 1) - (i94 ^ i93);
        byte[] bArr3 = new byte[i95];
        int i96 = i52 & 128;
        int i97 = (i52 | 128) & (~i96);
        bArr3[0] = (byte) ((i97 & i96) | (i97 ^ i96));
        int i98 = f61417c;
        int i99 = (i98 ^ 65) + ((i98 & 65) << 1);
        f61418d = i99 % 128;
        int i100 = i99 % 2;
        int i101 = 1;
        while (i101 < i95) {
            int i102 = f61418d + 15;
            int i103 = i102 % 128;
            f61417c = i103;
            int i104 = i102 % i16;
            int i105 = -i101;
            int i106 = i105 * (-183);
            int i107 = -(-(i95 * (-183)));
            int i108 = ((~i107) & i106) | ((~i106) & i107);
            int i109 = (i106 & i107) << 1;
            int i110 = ((i108 | i109) << 1) - (i109 ^ i108);
            int i111 = ~i105;
            int i112 = (i111 ^ i83) | (i111 & i83);
            int i113 = ~i95;
            int i114 = (i112 & i113) | ((~i112) & i95);
            int i115 = i112 & i95;
            int i116 = ~((i114 ^ i115) | (i114 & i115));
            int i117 = i113 & i73;
            int i118 = (~i117) & (i113 | i73);
            int i119 = (i118 ^ i117) | (i118 & i117);
            int i120 = i119 & i105;
            int i121 = (~i120) & (i119 | i105);
            int i122 = (i121 & i120) | (i121 ^ i120);
            int i123 = ~i122;
            int i124 = (i122 | i123) & i123;
            int i125 = i116 ^ i124;
            int i126 = i124 & i116;
            int i127 = -(-(((i126 & i125) | (i125 ^ i126)) * (-184)));
            int i128 = (((i110 ^ i127) | (i110 & i127)) << 1) - ((i127 & (~i110)) | ((~i127) & i110));
            int i129 = i111 & i113;
            int i130 = ~(i129 | ((~i129) & (i111 | i113)));
            int i131 = (i111 ^ i73) | (i111 & i73);
            int i132 = ~i131;
            int i133 = (i131 | i132) & i132;
            int i134 = (i130 & i133) | ((~i133) & i130) | ((~i130) & i133);
            int i135 = ((~i83) & i113) | ((~i113) & i83);
            int i136 = i113 & i83;
            int i137 = ~((i135 & i136) | (i135 ^ i136));
            int i138 = -(-(((i134 & i137) | ((~i137) & i134) | ((~i134) & i137)) * 184));
            int i139 = i128 & i138;
            int i140 = (i138 ^ i128) | i139;
            int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
            int i142 = ((i105 & i113) | (i95 & i111) | (i105 & i95)) * 184;
            int i143 = i141 & i142;
            int i144 = ((i141 ^ i142) | i143) << 1;
            int i145 = -((i142 | i141) & (~i143));
            int i146 = (i144 & i145) + (i145 | i144);
            int i147 = i101 ^ (-1);
            int i148 = -(-(i101 << 1));
            bArr3[i146] = (byte) (iIntValue >> ((((i147 | i148) << 1) - (i147 ^ i148)) * 8));
            int i149 = i101 | 8;
            int i150 = i149 << 1;
            int i151 = -((~(i101 & 8)) & i149);
            int i152 = ((i150 | i151) << 1) - (i151 ^ i150);
            int i153 = (i152 ^ (-6)) + ((i152 & (-6)) << 1);
            i101 = (i153 << 1) + (i153 ^ (-1));
            int i154 = (i103 & 83) + (i103 | 83);
            f61418d = i154 % 128;
            int i155 = i154 % 2;
            i16 = 2;
        }
        int i156 = (-2) - ((f61418d + 80) ^ (-1));
        f61417c = i156 % 128;
        if (i156 % i16 == 0) {
            return bArr3;
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final uy setOnFocusChangeListener() {
        return (uy) setDividerPadding(new Object[]{this}, -79307481, 79307483, System.identityHashCode(this));
    }

    @JvmName(name = "setX")
    @NotNull
    public final byte[] setX() {
        return (byte[]) setDividerPadding(new Object[]{this}, -15189601, 15189602, System.identityHashCode(this));
    }

    @NotNull
    public final byte[] setY() {
        return (byte[]) setDividerPadding(new Object[]{this}, 450567484, -450567484, System.identityHashCode(this));
    }
}
