package com.mypinpad.tsdk.isolation;

import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.ethermobilesdk.plugin.command.hmac.HmacCommand;
import com.bbva.qrcreatorplugin.command.GenerateCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00060\u0006j\u0002`\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00060\u0006j\u0002`\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/mypinpad/security/implementation/entropy/HmacDrbg;", "", "", "numberOfBytes", "Lcom/mypinpad/security/implementation/entropy/HmacAdditionalInput;", "additionalInput", "", GenerateCommand.ID, "Lcom/mypinpad/security/implementation/entropy/HmacDrbgEntropy;", "entropy", "Lcom/mypinpad/security/implementation/entropy/HmacDrbgNonce;", IAppSDKPlus.EXTRA_KEY_NONCE, "Lcom/mypinpad/security/implementation/entropy/HmacPersonalizationString;", "personalizationString", "", "initialise", "reseed", "material", "update", "Lcom/mypinpad/security/implementation/entropy/Hmac;", HmacCommand.ID, "Lcom/mypinpad/security/implementation/entropy/Hmac;", "reseedCounter", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Lcom/mypinpad/security/implementation/entropy/HmacDrbgKey;", "workingKey", "[B", "Lcom/mypinpad/security/implementation/entropy/HmacDrbgValue;", "workingValue", "<init>", "(Lcom/mypinpad/security/implementation/entropy/Hmac;)V", "Companion", "android-security-module.implementation"}, k = 1, mv = {1, 5, 1})
public final class setRight {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f60404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f60408i = null;

    @NotNull
    public static final setOnFocusChangeListener setOnFocusChangeListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setTextLocale f60409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f60411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f60412d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/setRight$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/setForegroundGravity;", "p0", "", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setForegroundGravity;)I", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f60413a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f60414b = 1;

        public /* synthetic */ class setY {
            public static final /* synthetic */ int[] setDividerPadding;

            static {
                int[] iArr = new int[setForegroundGravity.values().length];
                iArr[setForegroundGravity.setX.ordinal()] = 1;
                iArr[setForegroundGravity.setOnFocusChangeListener.ordinal()] = 2;
                iArr[setForegroundGravity.setCompoundDrawableTintBlendMode.ordinal()] = 3;
                iArr[setForegroundGravity.setDividerPadding.ordinal()] = 4;
                setDividerPadding = iArr;
                int i10 = 81 & (~0);
                int i11 = -(-0);
                int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
                int i13 = i12 % 128;
                int i14 = i12 % 2;
            }
        }

        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int setOnFocusChangeListener(@NotNull setForegroundGravity p4) {
            return ((Integer) setX(new Object[]{p4}, -1066917021, 1066917021, (int) System.currentTimeMillis())).intValue();
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            setForegroundGravity setforegroundgravity = (setForegroundGravity) objArr[0];
            int i13 = f60413a;
            int i14 = ((i13 | 42) << 1) - (i13 ^ 42);
            int i15 = (i14 ^ (-1)) + (i14 << 1);
            f60414b = i15 % 128;
            if (i15 % 2 == 0) {
                Intrinsics.checkNotNullParameter(setforegroundgravity, "");
                int i16 = setY.setDividerPadding[setforegroundgravity.ordinal()];
                throw null;
            }
            Intrinsics.checkNotNullParameter(setforegroundgravity, "");
            int i17 = setY.setDividerPadding[setforegroundgravity.ordinal()];
            if (i17 == 1) {
                int i18 = f60414b;
                int i19 = i18 ^ 125;
                int i20 = (i18 & 125) << 1;
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f60413a = i21 % 128;
                int i22 = i21 % 2;
                return 24;
            }
            if (i17 == 2) {
                int i23 = f60413a + 27;
                f60414b = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
            } else if (i17 == 3) {
                int i24 = f60414b;
                int i25 = ((i24 & 83) - (~(i24 | 83))) - 1;
                f60413a = i25 % 128;
                if (i25 % 2 != 0) {
                    throw null;
                }
            } else {
                if (i17 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i26 = f60413a;
                int i27 = (((i26 | 25) << 1) - (~(-(i26 ^ 25)))) - 1;
                f60414b = i27 % 128;
                int i28 = i27 % 2;
            }
            return 32;
        }
    }

    static {
        b();
        f60407h = 0;
        f60405f = 0;
        f60406g = 1;
        c();
        setOnFocusChangeListener = new setOnFocusChangeListener(null);
        int i10 = f60405f + 7;
        f60406g = i10 % 128;
        int i11 = i10 % 2;
    }

    public setRight(@NotNull setTextLocale settextlocale) {
        Intrinsics.checkNotNullParameter(settextlocale, "");
        this.f60409a = settextlocale;
        this.f60410b = 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0105 A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:6:0x0041, B:10:0x009a, B:12:0x00a9, B:22:0x0123, B:15:0x00bd, B:19:0x00ff, B:21:0x0105, B:25:0x012e, B:9:0x0066), top: B:34:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x012e A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #0 {all -> 0x012c, blocks: (B:6:0x0041, B:10:0x009a, B:12:0x00a9, B:22:0x0123, B:15:0x00bd, B:19:0x00ff, B:21:0x0105, B:25:0x012e, B:9:0x0066), top: B:34:0x0041 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0131 -> B:27:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r20, int r21, java.lang.Object[] r22) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setRight.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60408i = new byte[]{122, -107, 66, -93};
    }

    public static void c() {
        f60404e = 2040568594969463745L;
    }

    public static void setDividerPadding(setRight setright, setNextFocusUpId setnextfocusupid) {
        equals equalsVar = new equals(new byte[0]);
        synchronized (setright) {
            try {
                int i10 = f60406g + 89;
                f60405f = i10 % 128;
                if (i10 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(setnextfocusupid, "");
                    Intrinsics.checkNotNullParameter(equalsVar, "");
                    setright.d(ArraysKt___ArraysJvmKt.plus(setnextfocusupid.setCompoundDrawableTintBlendMode(), equalsVar.setDividerPadding()));
                } else {
                    Intrinsics.checkNotNullParameter(setnextfocusupid, "");
                    Intrinsics.checkNotNullParameter(equalsVar, "");
                    setright.d(ArraysKt___ArraysJvmKt.plus(setnextfocusupid.setCompoundDrawableTintBlendMode(), equalsVar.setDividerPadding()));
                }
                setright.f60410b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i11 = f60406g + 95;
        f60405f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void setOnFocusChangeListener(setRight setright, setNextFocusUpId setnextfocusupid, getAmountFieldTextSizeSp getamountfieldtextsizesp) {
        setright.setCompoundDrawableTintBlendMode(setnextfocusupid, getamountfieldtextsizesp, new setScaleY(new byte[0]));
        int i10 = f60406g + 95;
        f60405f = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 70 / 0;
        }
    }

    public static byte[] setY(setRight setright, int i10) {
        byte[] bArrCopyOfRange;
        int i11;
        equals equalsVar = new equals(new byte[0]);
        synchronized (setright) {
            try {
                Intrinsics.checkNotNullParameter(equalsVar, "");
                if (i10 >= 65536) {
                    Object[] objArr = new Object[1];
                    a("々〽膗ꨴꚹ\ue43eꌄ", 1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
                    throw new setChildIndicatorBoundsRelative(((String) objArr[0]).intern());
                }
                if (setright.f60410b > Integer.MAX_VALUE) {
                    Object[] objArr2 = new Object[1];
                    a("\uf1df\uf1e7屜셞筲轗\uab1c", View.MeasureSpec.getMode(0), objArr2);
                    throw new setChildIndicatorBoundsRelative(((String) objArr2[0]).intern());
                }
                if (equalsVar.setOnFocusChangeListener()) {
                    setright.d(equalsVar.setDividerPadding());
                }
                byte[] bArrPlus = new byte[0];
                while (bArrPlus.length < i10) {
                    setTextLocale settextlocale = setright.f60409a;
                    byte[] bArr = setright.f60411c;
                    byte[] bArr2 = null;
                    if (bArr == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bArr = null;
                    }
                    byte[] bArr3 = setright.f60412d;
                    if (bArr3 == null) {
                        int i12 = f60405f + 69;
                        f60406g = i12 % 128;
                        if (i12 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bArr3 = null;
                    }
                    byte[] dividerPadding = settextlocale.setDividerPadding(bArr, bArr3);
                    setright.f60412d = dividerPadding;
                    if (dividerPadding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    } else {
                        bArr2 = dividerPadding;
                    }
                    bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, bArr2);
                }
                setright.d(equalsVar.setDividerPadding());
                setright.f60410b++;
                bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArrPlus, 0, i10);
                Random.INSTANCE.nextBytes(bArrPlus);
                i11 = f60405f;
                int i13 = i11 + 51;
                f60406g = i13 % 128;
                int i14 = i13 % 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i15 = i11 + 123;
        f60406g = i15 % 128;
        int i16 = i15 % 2;
        return bArrCopyOfRange;
    }

    public final void d(byte[] bArr) {
        int i10 = f60405f + 63;
        int i11 = i10 % 128;
        f60406g = i11;
        byte[] bArr2 = null;
        if (i10 % 2 == 0) {
            throw null;
        }
        byte[] bArr3 = this.f60411c;
        if (bArr3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bArr3 = null;
        } else {
            int i12 = i11 + 79;
            f60405f = i12 % 128;
            int i13 = i12 % 2;
        }
        byte[] bArr4 = this.f60412d;
        if (bArr4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bArr4 = null;
        }
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArr4, (byte) 0), bArr);
        setTextLocale settextlocale = this.f60409a;
        byte[] dividerPadding = settextlocale.setDividerPadding(bArr3, bArrPlus);
        this.f60411c = dividerPadding;
        if (dividerPadding == null) {
            int i14 = f60406g + 95;
            f60405f = i14 % 128;
            if (i14 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            dividerPadding = null;
        }
        byte[] bArr5 = this.f60412d;
        if (bArr5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bArr5 = null;
        }
        this.f60412d = settextlocale.setDividerPadding(dividerPadding, bArr5);
        if (bArr.length == 0) {
            return;
        }
        int i15 = f60406g;
        int i16 = i15 + 45;
        f60405f = i16 % 128;
        int i17 = i16 % 2;
        int i18 = i15 + 35;
        f60405f = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
        byte[] bArr6 = this.f60411c;
        if (bArr6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i19 = f60406g + 15;
            f60405f = i19 % 128;
            int i20 = i19 % 2;
            bArr6 = null;
        }
        byte[] bArr7 = this.f60412d;
        if (bArr7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bArr7 = null;
        }
        byte[] dividerPadding2 = settextlocale.setDividerPadding(bArr6, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArr7, (byte) 1), bArr));
        this.f60411c = dividerPadding2;
        if (dividerPadding2 == null) {
            int i21 = f60406g + 19;
            f60405f = i21 % 128;
            int i22 = i21 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            dividerPadding2 = null;
        }
        byte[] bArr8 = this.f60412d;
        if (bArr8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            bArr2 = bArr8;
        }
        this.f60412d = settextlocale.setDividerPadding(dividerPadding2, bArr2);
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull setNextFocusUpId setnextfocusupid, @NotNull getAmountFieldTextSizeSp getamountfieldtextsizesp, @NotNull setScaleY setscaley) {
        int i10 = f60406g + 49;
        f60405f = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(setnextfocusupid, "");
        Intrinsics.checkNotNullParameter(getamountfieldtextsizesp, "");
        Intrinsics.checkNotNullParameter(setscaley, "");
        byte[] bArr = new byte[this.f60409a.setOnFocusChangeListener().setCompoundDrawableTintBlendMode() / 8];
        ArraysKt___ArraysJvmKt.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
        Unit unit = Unit.INSTANCE;
        this.f60411c = bArr;
        byte[] bArr2 = new byte[this.f60409a.setOnFocusChangeListener().setCompoundDrawableTintBlendMode() / 8];
        ArraysKt___ArraysJvmKt.fill$default(bArr2, (byte) 1, 0, 0, 6, (Object) null);
        this.f60412d = bArr2;
        d(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(setnextfocusupid.setCompoundDrawableTintBlendMode(), getamountfieldtextsizesp.setDividerPadding()), setscaley.setX()));
        int i12 = f60406g + 105;
        f60405f = i12 % 128;
        int i13 = i12 % 2;
    }
}
