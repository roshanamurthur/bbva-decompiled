package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLSocket;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/abd;", "Lcom/mypinpad/tsdk/i/abg;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "p2", "", "setY", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "setX", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "setOnFocusChangeListener", "()Z", "(Ljavax/net/ssl/SSLSocket;)Z", "<init>", "()V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class abd implements abg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52273b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52274c = 1;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final setX f52272a = new setX();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abd$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/abd$setCompoundDrawableTintBlendMode;", "", "Lcom/mypinpad/tsdk/i/abi$setY;", "setX", "Lcom/mypinpad/tsdk/i/abi$setY;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/abi$setY;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            return (abi.setY) abd.setCompoundDrawableTintBlendMode(new Object[0], -2120356221, 2120356223, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public static abi.setY setOnFocusChangeListener() {
            return (abi.setY) setOnFocusChangeListener(new Object[0], 335602431, -335602431, (int) System.currentTimeMillis());
        }
    }

    public static final class setX implements abi.setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52275a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52276b = 1;

        public static /* synthetic */ Boolean a(Object[] objArr) {
            SSLSocket sSLSocket = (SSLSocket) objArr[1];
            int i10 = f52275a;
            int i11 = (i10 ^ 15) + ((i10 & 15) << 1);
            f52276b = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            aar.Companion companion = aar.INSTANCE;
            if (((Boolean) aar.Companion.setCompoundDrawableTintBlendMode(new Object[0], -1382957913, 1382957913, (int) System.currentTimeMillis())).booleanValue()) {
                int i13 = f52275a;
                int i14 = i13 & 97;
                int i15 = ((((i13 ^ 97) | i14) << 1) - (~(-((i13 | 97) & (~i14))))) - 1;
                int i16 = i15 % 128;
                f52276b = i16;
                boolean z10 = sSLSocket instanceof BCSSLSocket;
                if (i15 % 2 == 0) {
                    throw null;
                }
                if (z10) {
                    int i17 = (-2) - ((i16 + 6) ^ (-1));
                    f52275a = i17 % 128;
                    int i18 = i17 % 2;
                    return Boolean.TRUE;
                }
            }
            int i19 = f52276b + 43;
            f52275a = i19 % 128;
            if (i19 % 2 == 0) {
                return Boolean.FALSE;
            }
            throw null;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
            int i14 = ~i10;
            int i15 = ((~(i14 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i13;
            int i16 = ~(i10 | (~i11));
            if (((i16 | (~(i11 | (~i12) | i14))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i16 * (-1042)) + i15 == 1) {
                return a(objArr);
            }
            Intrinsics.checkNotNullParameter((SSLSocket) objArr[1], "");
            abd abdVar = new abd();
            int i17 = f52276b;
            int i18 = ((i17 ^ 45) | (i17 & 45)) << 1;
            int i19 = -(((~i17) & 45) | (i17 & (-46)));
            int i20 = (i18 & i19) + (i19 | i18);
            f52275a = i20 % 128;
            int i21 = i20 % 2;
            return abdVar;
        }

        @Override // com.mypinpad.tsdk.i.abi.setY
        public final boolean setOnFocusChangeListener(@NotNull SSLSocket sSLSocket) {
            return ((Boolean) setX(new Object[]{this, sSLSocket}, -695980344, 695980345, System.identityHashCode(this))).booleanValue();
        }

        @Override // com.mypinpad.tsdk.i.abi.setY
        @NotNull
        public final abg setY(@NotNull SSLSocket sSLSocket) {
            return (abg) setX(new Object[]{this, sSLSocket}, 1893735027, -1893735027, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f52273b;
        int i11 = (-2) - ((((i10 | 4) << 1) - (i10 ^ 4)) ^ (-1));
        f52274c = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a5, code lost:
    
        if (r10 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a7, code lost:
    
        r6.setApplicationProtocols((java.lang.String[]) r10);
        r3.setParameters(r6);
        r10 = com.mypinpad.tsdk.isolation.abd.f52274c + 107;
        com.mypinpad.tsdk.isolation.abd.f52273b = r10 % 128;
        r10 = r10 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c0, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0083, code lost:
    
        if (r10 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.abd.a(java.lang.Object[]):void");
    }

    public static /* synthetic */ Boolean b(Object[] objArr) {
        boolean z10;
        SSLSocket sSLSocket = (SSLSocket) objArr[1];
        int i10 = f52274c;
        int i11 = (i10 ^ 17) + ((i10 & 17) << 1);
        f52273b = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            z10 = sSLSocket instanceof BCSSLSocket;
            int i12 = 50 / 0;
        } else {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            z10 = sSLSocket instanceof BCSSLSocket;
        }
        int i13 = f52274c;
        int i14 = i13 & 107;
        int i15 = -(-((i13 ^ 107) | i14));
        int i16 = (i14 & i15) + (i15 | i14);
        f52273b = i16 % 128;
        if (i16 % 2 == 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ String c(Object[] objArr) {
        BCSSLSocket bCSSLSocket = (SSLSocket) objArr[1];
        int i10 = f52273b;
        int i11 = (((i10 & (-14)) | ((~i10) & 13)) - (~(-(-((i10 & 13) << 1))))) - 1;
        f52274c = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bCSSLSocket, "");
            bCSSLSocket.getApplicationProtocol();
            throw null;
        }
        Intrinsics.checkNotNullParameter(bCSSLSocket, "");
        String applicationProtocol = bCSSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            int i12 = f52274c;
            int i13 = ((i12 ^ 24) + ((i12 & 24) << 1)) - 1;
            f52273b = i13 % 128;
            int i14 = i13 % 2;
        } else {
            boolean zAreEqual = Intrinsics.areEqual(applicationProtocol, "");
            int i15 = f52274c;
            int i16 = ((i15 & 22) + (i15 | 22)) - 1;
            f52273b = i16 % 128;
            int i17 = i16 % 2;
            if (!zAreEqual) {
                int i18 = i15 + 3;
                f52273b = i18 % 128;
                int i19 = i18 % 2;
                return applicationProtocol;
            }
        }
        int i20 = f52274c;
        int i21 = i20 & 97;
        int i22 = (i20 | 97) & (~i21);
        int i23 = i21 << 1;
        int i24 = (i22 & i23) + (i22 | i23);
        f52273b = i24 % 128;
        if (i24 % 2 != 0) {
            int i25 = 70 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        boolean zBooleanValue;
        int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
        int i14 = ~i10;
        int i15 = ((~(i14 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i13;
        int i16 = ~(i10 | (~i11));
        int i17 = ((i16 | (~(i11 | (~i12) | i14))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i16 * (-1042)) + i15;
        if (i17 == 1) {
            return c(objArr);
        }
        if (i17 == 2) {
            int i18 = f52274c + 105;
            int i19 = i18 % 128;
            f52273b = i19;
            int i20 = i18 % 2;
            int i21 = ((i19 ^ 11) | (i19 & 11)) << 1;
            int i22 = -(((~i19) & 11) | (i19 & (-12)));
            int i23 = (i21 & i22) + (i21 | i22);
            f52274c = i23 % 128;
            if (i23 % 2 != 0) {
                return f52272a;
            }
            throw null;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return b(objArr);
            }
            a(objArr);
            return null;
        }
        int i24 = f52274c;
        int i25 = i24 & 41;
        int i26 = i25 + ((i24 ^ 41) | i25);
        f52273b = i26 % 128;
        if (i26 % 2 != 0) {
            aar.Companion companion = aar.INSTANCE;
            zBooleanValue = ((Boolean) aar.Companion.setCompoundDrawableTintBlendMode(new Object[0], -1382957913, 1382957913, (int) System.currentTimeMillis())).booleanValue();
            int i27 = 31 / 0;
        } else {
            aar.Companion companion2 = aar.INSTANCE;
            zBooleanValue = ((Boolean) aar.Companion.setCompoundDrawableTintBlendMode(new Object[0], -1382957913, 1382957913, (int) System.currentTimeMillis())).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static final /* synthetic */ abi.setY setY() {
        return (abi.setY) setCompoundDrawableTintBlendMode(new Object[0], -2120356221, 2120356223, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1277673312, -1277673309, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 716514090, -716514089, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final boolean setOnFocusChangeListener(@NotNull SSLSocket p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1316594790, 1316594794, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abg
    public final void setY(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<? extends yi> p11) {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10, p11}, 1681731974, -1681731974, System.identityHashCode(this));
    }
}
