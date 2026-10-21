package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/mypinpad/tsdk/i/uy;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "a", "[B", "setX", "()[B", "setOnFocusChangeListener", "<init>", "([B)V", "setY"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tag.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tag/Tag\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,135:1\n7#2,8:136\n7#2,8:144\n7#2,8:152\n7#2,8:160\n7#2,8:168\n13654#3,3:176\n*S KotlinDebug\n*F\n+ 1 Tag.kt\ncom/mypinpad/tsdk/internal/utils/bertlv/tag/Tag\n*L\n32#1:136,8\n46#1:144,8\n51#1:152,8\n55#1:160,8\n63#1:168,8\n73#1:176,3\n*E\n"})
public final class uy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f61432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f61433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f61435g = null;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] setOnFocusChangeListener;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.uy$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/uy$setY;", "", "Ljava/nio/ByteBuffer;", "p0", "Lcom/mypinpad/tsdk/i/uy;", "setDividerPadding", "(Ljava/nio/ByteBuffer;)Lcom/mypinpad/tsdk/i/uy;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f61437a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f61438b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static uy setDividerPadding(@NotNull ByteBuffer p4) {
            return (uy) setOnFocusChangeListener(new Object[]{p4}, -1915935166, 1915935166, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:6:0x002a  */
        /* JADX WARN: Code duplicated, block: B:7:0x002c  */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13;
            byte b10;
            ByteBuffer byteBuffer = (ByteBuffer) objArr[0];
            int i14 = f61437a;
            int i15 = i14 & 95;
            int i16 = (((i14 ^ 95) | i15) << 1) - ((i14 | 95) & (~i15));
            f61438b = i16 % 128;
            if (i16 % 2 == 0) {
                Intrinsics.checkNotNullParameter(byteBuffer, "");
                if ((byteBuffer.get() & 113) == 18) {
                    i13 = 1;
                    do {
                        b10 = byteBuffer.get();
                        int i17 = i13 & 1;
                        int i18 = (i13 | 1) & (~i17);
                        int i19 = -(-(i17 << 1));
                        i13 = ((i18 & i19) << 1) + (i18 ^ i19);
                    } while ((b10 & 128) == 128);
                } else {
                    i13 = 1;
                }
            } else {
                Intrinsics.checkNotNullParameter(byteBuffer, "");
                if ((byteBuffer.get() & 31) == 31) {
                    i13 = 1;
                    do {
                        b10 = byteBuffer.get();
                        int i110 = i13 & 1;
                        int i111 = (i13 | 1) & (~i110);
                        int i112 = -(-(i110 << 1));
                        i13 = ((i111 & i112) << 1) + (i111 ^ i112);
                    } while ((b10 & 128) == 128);
                } else {
                    i13 = 1;
                }
            }
            byte[] bArr = new byte[i13];
            int iPosition = byteBuffer.position();
            int i20 = -i13;
            System.currentTimeMillis();
            int i21 = (i20 * (-623)) - (~(iPosition * (-623)));
            int i22 = (i21 ^ (-1)) + (i21 << 1);
            int i23 = ~i20;
            int i24 = (-2) - (((i22 - (~(-(~(-(-(((i23 | i20) & i23) * (-624)))))))) - 1) ^ (-1));
            int i25 = iPosition ^ i23;
            int i26 = i23 & iPosition;
            int i27 = -(-(((i25 & i26) | (i25 ^ i26)) * 624));
            int i28 = i24 & i27;
            int i29 = (i24 | i27) & (~i28);
            int i30 = -(-(i28 << 1));
            int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
            int i32 = i26 | ((~iPosition) & i20);
            int i33 = iPosition & i20;
            int i34 = ((i33 & i32) | (i32 ^ i33)) * 624;
            byteBuffer.position(((i31 | i34) << 1) - (i34 ^ i31));
            byteBuffer.get(bArr, 0, i13);
            uy uyVar = new uy(bArr);
            int i35 = f61438b;
            int i36 = (i35 & 111) + (i35 | 111);
            f61437a = i36 % 128;
            if (i36 % 2 == 0) {
                return uyVar;
            }
            throw null;
        }
    }

    static {
        b();
        f61433e = 0;
        f61434f = 1;
        f61431c = 0;
        f61432d = 1;
        c();
        INSTANCE = new Companion(null);
        int i10 = f61431c + 45;
        f61432d = i10 % 128;
        int i11 = i10 % 2;
    }

    public uy(@NotNull byte[] bArr) throws Throwable {
        int length;
        Intrinsics.checkNotNullParameter(bArr, "");
        this.setOnFocusChangeListener = bArr;
        char c10 = 1;
        int i10 = 2;
        int i11 = 0;
        if (bArr.length == 0) {
            int i12 = f61431c + 43;
            f61432d = i12 % 128;
            int i13 = i12 % 2;
            TerminalException terminalException = new TerminalException(10021, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        if (bArr.length != 1) {
            if ((bArr[bArr.length - 1] & 128) != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bArr.length - 1);
                sb2.append(AbstractJsonLexerKt.COLON);
                sb2.append((int) bArr[bArr.length - 1]);
                TerminalException terminalException2 = new TerminalException(10021, sb2.toString(), null);
                mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException2;
            }
            if (bArr.length <= 2 || (length = bArr.length - 2) <= 0) {
                return;
            }
            int i14 = 1;
            while ((bArr[i14] & 128) == 128) {
                if (i14 == length) {
                    return;
                }
                int i15 = f61432d + 25;
                f61431c = i15 % 128;
                int i16 = i15 % 2;
                i14++;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i14);
            sb3.append(AbstractJsonLexerKt.COLON);
            sb3.append((int) bArr[i14]);
            TerminalException terminalException3 = new TerminalException(10021, sb3.toString(), null);
            mt.setX(new Object[]{terminalException3}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException3;
        }
        int i17 = f61431c + 97;
        f61432d = i17 % 128;
        int i18 = i17 % 2;
        if ((bArr[0] & 31) == 31) {
            StringBuilder sb4 = new StringBuilder();
            int bitsPerPixel = 1 - ImageFormat.getBitsPerPixel(0);
            int modifierMetaStateMask = 128 - ((byte) KeyEvent.getModifierMetaStateMask());
            int touchSlop = 1 - (ViewConfiguration.getTouchSlop() >> 8);
            char[] charArray = "\u0005\ufffb".toCharArray();
            getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
            char[] cArr = new char[bitsPerPixel];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i19 = getnavbartitlestring.setY;
                if (i19 >= bitsPerPixel) {
                    break;
                }
                char c11 = charArray[i19];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
                char c12 = (char) (c11 + modifierMetaStateMask);
                cArr[i19] = c12;
                try {
                    Object[] objArr = new Object[i10];
                    objArr[c10] = Integer.valueOf(f61430b);
                    objArr[i11] = Integer.valueOf(c12);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(133002375);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(i11, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i11, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 41, Color.red(i11) + 483);
                        byte b10 = (byte) i11;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr2 = new Object[1];
                        a(b11, (byte) (b11 - 1), b10, objArr2);
                        String str = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str, cls2, cls2);
                        map.put(133002375, method);
                    }
                    cArr[i19] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    Object[] objArr3 = {getnavbartitlestring, getnavbartitlestring};
                    Object method2 = map.get(1860518195);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getSize(0) + 55966), 44 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2268 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr4 = new Object[1];
                        a(b13, b13, b12, objArr4);
                        method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                        map.put(1860518195, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                    modifierMetaStateMask = modifierMetaStateMask;
                    c10 = 1;
                    i10 = 2;
                    i11 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            if (touchSlop > 0) {
                int i20 = f61433e + 113;
                f61434f = i20 % 128;
                int i21 = i20 % 2;
                getnavbartitlestring.setOnFocusChangeListener = touchSlop;
                char[] cArr2 = new char[bitsPerPixel];
                System.arraycopy(cArr, 0, cArr2, 0, bitsPerPixel);
                int i22 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, 0, cArr, bitsPerPixel - i22, i22);
                int i23 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, i23, cArr, 0, bitsPerPixel - i23);
                int i24 = f61434f + 33;
                f61433e = i24 % 128;
                int i25 = i24 % 2;
            }
            String str2 = new String(cArr);
            int i26 = f61434f + 1;
            f61433e = i26 % 128;
            int i27 = i26 % 2;
            sb4.append(str2.intern());
            sb4.append((int) bArr[0]);
            TerminalException terminalException4 = new TerminalException(10021, sb4.toString(), null);
            mt.setX(new Object[]{terminalException4}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException4;
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
    public static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = r6 + 65
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.uy.f61435g
            if (r2 != 0) goto L17
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L36
        L17:
            r3 = r1
        L18:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = r6 + r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.uy.a(byte, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f61435g = new byte[]{64, 59, -42, 60};
    }

    public static void c() {
        f61430b = -443080044;
    }

    public final boolean equals(@Nullable Object p4) {
        int i10 = f61432d;
        int i11 = i10 + 89;
        f61431c = i11 % 128;
        int i12 = i11 % 2;
        if (p4 != null && (p4 instanceof uy)) {
            int i13 = i10 + 61;
            f61431c = i13 % 128;
            int i14 = i13 % 2;
            byte[] bArr = this.setOnFocusChangeListener;
            uy uyVar = (uy) p4;
            if (bArr.length == uyVar.setOnFocusChangeListener.length) {
                int length = bArr.length;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length) {
                    int i17 = i16 + 1;
                    if (bArr[i15] != uyVar.setOnFocusChangeListener[i16]) {
                        int i18 = f61432d;
                        int i19 = i18 + 29;
                        f61431c = i19 % 128;
                        int i20 = i19 % 2;
                        int i21 = i18 + 79;
                        f61431c = i21 % 128;
                        if (i21 % 2 == 0) {
                            return false;
                        }
                        throw null;
                    }
                    i15++;
                    i16 = i17;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f61431c + 67;
        f61432d = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        byte[] bArr = this.setOnFocusChangeListener;
        int iHashCode = i11 == 0 ? 1 << uy.class.getName().hashCode() : uy.class.getName().hashCode() + 1;
        int length = bArr.length;
        while (i12 < length) {
            iHashCode = (iHashCode * 31) + bArr[i12];
            i12++;
            int i13 = f61431c + 45;
            f61432d = i13 % 128;
            int i14 = i13 % 2;
        }
        return iHashCode;
    }

    @JvmName(name = "setX")
    @NotNull
    public final byte[] setX() {
        int i10 = f61431c;
        int i11 = i10 + 81;
        f61432d = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 75;
        f61432d = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr = this.setOnFocusChangeListener;
        if (i14 == 0) {
            int i15 = 58 / 0;
        }
        return bArr;
    }
}
