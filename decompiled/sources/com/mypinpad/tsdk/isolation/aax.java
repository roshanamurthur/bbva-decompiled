package com.mypinpad.tsdk.isolation;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjsse.javax.net.ssl.SSLSocket;
import org.openjsse.net.ssl.OpenJSSE;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/aax;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljavax/net/ssl/SSLContext;", "e_", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "setCompoundDrawableTintBlendMode", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "<init>", "()V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class aax extends aaw {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f52249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52250g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52251h = 1;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Provider f52252e;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aax$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/aax$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/aax;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/aax;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52253a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52254b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static aax setCompoundDrawableTintBlendMode() {
            return (aax) setDividerPadding(new Object[0], 1693813221, -1693813221, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~(i13 | i11);
            int i17 = ((i16 | i12 | (~(i10 | (~i11)))) * 397) + (i16 * (-397)) + (((~(i14 | i11)) | i15 | i16) * (-397)) + (i11 * (-396)) + (i10 * 398);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (i17 == 1) {
                int i18 = f52254b;
                int i19 = ((i18 & (-82)) | ((~i18) & 81)) + ((i18 & 81) << 1);
                f52253a = i19 % 128;
                int i20 = i19 % 2;
                boolean zBooleanValue = ((Boolean) aax.setY(new Object[0], -317406576, 317406576, (int) System.currentTimeMillis())).booleanValue();
                int i21 = f52253a;
                int i22 = (i21 & (-36)) | ((~i21) & 35);
                int i23 = (i21 & 35) << 1;
                int i24 = (i22 & i23) + (i23 | i22);
                f52254b = i24 % 128;
                if (i24 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            }
            int i25 = f52253a + 64;
            int i26 = (i25 ^ (-1)) + (i25 << 1);
            f52254b = i26 % 128;
            int i27 = i26 % 2;
            Object[] objArr2 = new Object[0];
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i27 == 0) {
                ((Boolean) setDividerPadding(objArr2, -876683137, 876683138, (int) jCurrentTimeMillis)).booleanValue();
                throw null;
            }
            if (((Boolean) setDividerPadding(objArr2, -876683137, 876683138, (int) jCurrentTimeMillis)).booleanValue()) {
                aax aaxVar = new aax(defaultConstructorMarker);
                int i28 = f52253a;
                int i29 = (i28 ^ 29) + ((i28 & 29) << 1);
                f52254b = i29 % 128;
                int i30 = i29 % 2;
                return aaxVar;
            }
            int i31 = f52253a;
            int i32 = i31 & 69;
            int i33 = (i31 ^ 69) | i32;
            int i34 = (i32 & i33) + (i33 | i32);
            f52254b = i34 % 128;
            if (i34 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, companion.getClass().getClassLoader());
            int i10 = f52251h + 59;
            f52250g = i10 % 128;
            int i11 = i10 % 2;
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f52249f = z10;
        int i12 = f52251h + 31;
        f52250g = i12 % 128;
        int i13 = i12 % 2;
    }

    public aax() {
        this.f52252e = new OpenJSSE();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        if (r11 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
    
        r5.setApplicationProtocols((java.lang.String[]) r11);
        r3.setSSLParameters(r1);
        r11 = com.mypinpad.tsdk.isolation.aax.f52251h;
        r0 = r11 & 53;
        r11 = (((r11 | 53) & (~r0)) - (~(-(-(r0 << 1))))) - 1;
        com.mypinpad.tsdk.isolation.aax.f52250g = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
    
        if ((r11 % 2) != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aax.a(java.lang.Object[]):void");
    }

    public static /* synthetic */ String b(Object[] objArr) {
        aax aaxVar = (aax) objArr[0];
        SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) objArr[1];
        int i10 = f52251h;
        int i11 = ((i10 | 117) << 1) - (i10 ^ 117);
        f52250g = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            boolean z10 = sSLSocket instanceof SSLSocket;
            throw null;
        }
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        if (!(sSLSocket instanceof SSLSocket)) {
            String x4 = super.setX((javax.net.ssl.SSLSocket) sSLSocket);
            int i12 = f52250g;
            int i13 = (i12 ^ 25) + ((i12 & 25) << 1);
            f52251h = i13 % 128;
            int i14 = i13 % 2;
            return x4;
        }
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            int i15 = f52251h;
            int i16 = i15 & 125;
            int i17 = (i16 - (~((i15 ^ 125) | i16))) - 1;
            f52250g = i17 % 128;
            int i18 = i17 % 2;
            int i19 = i15 & 79;
            int i20 = -(-(i15 | 79));
            int i21 = (i19 & i20) + (i20 | i19);
            f52250g = i21 % 128;
            int i22 = i21 % 2;
        } else {
            boolean zAreEqual = Intrinsics.areEqual(applicationProtocol, "");
            int i23 = f52251h;
            int i24 = ((i23 ^ 105) | (i23 & 105)) << 1;
            int i25 = -(((~i23) & 105) | (i23 & (-106)));
            int i26 = (i24 & i25) + (i25 | i24);
            int i27 = i26 % 128;
            f52250g = i27;
            int i28 = i26 % 2;
            if (!zAreEqual) {
                int i29 = (i27 ^ 117) + ((i27 & 117) << 1);
                f52251h = i29 % 128;
                int i30 = i29 % 2;
                return applicationProtocol;
            }
        }
        int i31 = f52250g;
        int i32 = i31 | 21;
        int i33 = ((i32 << 1) - (~(-((~(i31 & 21)) & i32)))) - 1;
        int i34 = i33 % 128;
        f52251h = i34;
        int i35 = i33 % 2;
        int i36 = i34 & 107;
        int i37 = (i34 | 107) & (~i36);
        int i38 = i36 << 1;
        int i39 = ((i37 | i38) << 1) - (i37 ^ i38);
        f52250g = i39 % 128;
        if (i39 % 2 != 0) {
            int i40 = 11 / 0;
        }
        return null;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, KeyStoreException {
        Object sSLContext;
        int i13 = (i11 * (-489)) + (i10 * 491);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ((i14 | i15 | (~i12)) * (-490)) + i13;
        int i17 = (i14 * 490) + (((~(i10 | i15)) | (~(i15 | i12))) * 490) + i16;
        if (i17 != 1) {
            if (i17 == 2) {
                return b(objArr);
            }
            if (i17 == 3) {
                a(objArr);
                return null;
            }
            if (i17 != 4) {
                int i18 = f52251h;
                int i19 = (i18 | 89) << 1;
                int i20 = -(((~i18) & 89) | (i18 & (-90)));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f52250g = i21 % 128;
                if (i21 % 2 != 0) {
                    int i22 = 54 / 0;
                }
                return Boolean.valueOf(f52249f);
            }
            aax aaxVar = (aax) objArr[0];
            int i23 = f52250g;
            int i24 = i23 ^ 85;
            int i25 = -(-((i23 & 85) << 1));
            int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
            f52251h = i26 % 128;
            int i27 = i26 % 2;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), aaxVar.f52252e);
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNull(trustManagers);
            if (trustManagers.length == 1) {
                int i28 = f52251h;
                int i29 = i28 & 89;
                int i30 = -(-(i28 | 89));
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = i31 % 128;
                f52250g = i32;
                int i33 = i31 % 2;
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    int i34 = (i32 ^ 66) + ((i32 & 66) << 1);
                    int i35 = (i34 ^ (-1)) + (i34 << 1);
                    f52251h = i35 % 128;
                    int i36 = i35 % 2;
                    int i37 = i32 + 23;
                    f52251h = i37 % 128;
                    int i38 = i37 % 2;
                    if (trustManager == null) {
                        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    }
                    sSLContext = (X509TrustManager) trustManager;
                    int i39 = i32 & 107;
                    int i40 = (i32 | 107) & (~i39);
                    int i41 = i39 << 1;
                    int i42 = (i40 & i41) + (i41 | i40);
                    f52251h = i42 % 128;
                    int i43 = i42 % 2;
                }
            }
            int i44 = f52251h;
            int i45 = i44 & 59;
            int i46 = ((i44 ^ 59) | i45) << 1;
            int i47 = -((i44 | 59) & (~i45));
            int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
            f52250g = i48 % 128;
            int i49 = i48 % 2;
            String string = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(string, "");
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
        }
        aax aaxVar2 = (aax) objArr[0];
        int i50 = f52251h;
        int i51 = ((i50 | 85) << 1) - (i50 ^ 85);
        f52250g = i51 % 128;
        int i52 = i51 % 2;
        sSLContext = SSLContext.getInstance("TLSv1.3", aaxVar2.f52252e);
        Intrinsics.checkNotNullExpressionValue(sSLContext, "");
        if (i52 != 0) {
            int i53 = 15 / 0;
        }
        int i54 = f52251h + 91;
        f52250g = i54 % 128;
        if (i54 % 2 != 0) {
            throw null;
        }
        return sSLContext;
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final SSLContext e_() {
        return (SSLContext) setY(new Object[]{this}, 419292370, -419292369, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final X509TrustManager setCompoundDrawableTintBlendMode() {
        return (X509TrustManager) setY(new Object[]{this}, 405809943, -405809939, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull javax.net.ssl.SSLSocket p4) {
        return (String) setY(new Object[]{this, p4}, -1370889925, 1370889927, System.identityHashCode(this));
    }

    public /* synthetic */ aax(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull javax.net.ssl.SSLSocket p4, @Nullable String p10, @NotNull List<yi> p11) throws NoSuchAlgorithmException, KeyStoreException {
        setY(new Object[]{this, p4, p10, p11}, -2093009840, 2093009843, System.identityHashCode(this));
    }
}
