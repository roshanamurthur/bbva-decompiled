package com.mypinpad.tsdk.isolation;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/aay;", "Lcom/mypinpad/tsdk/i/abg;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "p2", "", "setY", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "setX", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "setOnFocusChangeListener", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z", "<init>", "()V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"NewApi"})
public final class aay implements abg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f52255a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52256b = 1;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    static {
        int i10 = f52256b;
        int i11 = ((i10 & (-78)) | ((~i10) & 77)) + ((i10 & 77) << 1);
        f52255a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 60 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00da, code lost:
    
        if ((r9 % 2) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f6, code lost:
    
        if (r8 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f8, code lost:
    
        r7 = com.mypinpad.tsdk.isolation.aay.f52255a;
        r8 = ((r7 ^ 106) + ((r7 & 106) << 1)) - 1;
        com.mypinpad.tsdk.isolation.aay.f52256b = r8 % 128;
        r8 = r8 % 2;
        r8 = ((r7 & (-72)) | ((~r7) & 71)) + ((r7 & 71) << 1);
        com.mypinpad.tsdk.isolation.aay.f52256b = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
    
        r8 = com.mypinpad.tsdk.isolation.aay.f52256b;
        r9 = (r8 ^ 63) + ((r8 & 63) << 1);
        com.mypinpad.tsdk.isolation.aay.f52255a = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r7, int r8, int r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aay.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setY(new Object[]{this}, 979629415, -979629412, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    @SuppressLint({"NewApi"})
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setY(new Object[]{this, p4}, 616236967, -616236965, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aay$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/aay$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/abg;", "setY", "()Lcom/mypinpad/tsdk/i/abg;", "", "setCompoundDrawableTintBlendMode", "()Z", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52257a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52258b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x00dd  */
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            Boolean bool;
            int i13 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
            int i14 = ~i10;
            if ((((~((~i11) | i14)) | (~((~i12) | i11))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i14) * (-420)) + i13 != 1) {
                int i15 = f52258b;
                int i16 = i15 & 27;
                int i17 = -(-((i15 ^ 27) | i16));
                int i18 = (i16 & i17) + (i17 | i16);
                f52257a = i18 % 128;
                Object[] objArr2 = new Object[0];
                if (i18 % 2 != 0) {
                    ((Boolean) setCompoundDrawableTintBlendMode(objArr2, 1503564735, -1503564734, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (!((Boolean) setCompoundDrawableTintBlendMode(objArr2, 1503564735, -1503564734, (int) System.currentTimeMillis())).booleanValue()) {
                    int i19 = f52258b;
                    int i20 = (i19 & 111) + (i19 | 111);
                    f52257a = i20 % 128;
                    int i21 = i20 % 2;
                    return null;
                }
                aay aayVar = new aay();
                int i22 = f52258b;
                int i23 = ((i22 ^ 55) | (i22 & 55)) << 1;
                int i24 = -(((~i22) & 55) | (i22 & (-56)));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f52257a = i25 % 128;
                int i26 = i25 % 2;
                return aayVar;
            }
            int i27 = f52258b;
            int i28 = (i27 ^ 28) + ((i27 & 28) << 1);
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            f52257a = i29 % 128;
            if (i29 % 2 != 0) {
                aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                ((Boolean) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -662658218, 662658220, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            aaw.setOnFocusChangeListener setonfocuschangelistener2 = aaw.setCompoundDrawableTintBlendMode;
            if (((Boolean) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -662658218, 662658220, (int) System.currentTimeMillis())).booleanValue()) {
                int i30 = f52258b;
                int i31 = (i30 & 53) + (i30 | 53);
                f52257a = i31 % 128;
                int i32 = i31 % 2;
                if (Build.VERSION.SDK_INT >= 29) {
                    int i33 = f52257a + 105;
                    f52258b = i33 % 128;
                    int i34 = i33 % 2;
                    bool = Boolean.TRUE;
                } else {
                    int i35 = f52258b;
                    int i36 = i35 & 27;
                    int i37 = i36 + ((i35 ^ 27) | i36);
                    f52257a = i37 % 128;
                    int i38 = i37 % 2;
                    bool = Boolean.FALSE;
                }
            } else {
                int i39 = f52258b;
                int i310 = i39 & 27;
                int i311 = i310 + ((i39 ^ 27) | i310);
                f52257a = i311 % 128;
                int i312 = i311 % 2;
                bool = Boolean.FALSE;
            }
            return bool;
        }

        @Nullable
        public static abg setY() {
            return (abg) setCompoundDrawableTintBlendMode(new Object[0], 124736756, -124736756, (int) System.currentTimeMillis());
        }

        public static boolean setCompoundDrawableTintBlendMode() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], 1503564735, -1503564734, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener(@NotNull SSLSocket p4) {
        return ((Boolean) setY(new Object[]{this, p4}, -1752230420, 1752230420, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    @SuppressLint({"NewApi"})
    public final void setY(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<? extends yi> p11) throws IOException {
        setY(new Object[]{this, p4, p10, p11}, -764416652, 764416653, System.identityHashCode(this));
    }
}
