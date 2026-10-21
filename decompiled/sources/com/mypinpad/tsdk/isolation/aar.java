package com.mypinpad.tsdk.isolation;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/aar;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljavax/net/ssl/SSLContext;", "e_", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "setCompoundDrawableTintBlendMode", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "<init>", "()V", "setY"}, k = 1, mv = {1, 6, 0})
public final class aar extends aaw {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f52200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52201g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52202h = 1;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Provider f52203e;

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, companion.getClass().getClassLoader());
            int i10 = f52202h;
            int i11 = ((i10 | 95) << 1) - (i10 ^ 95);
            f52201g = i11 % 128;
            int i12 = i11 % 2;
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f52200f = z10;
        int i13 = f52201g;
        int i14 = ((i13 ^ 81) | (i13 & 81)) << 1;
        int i15 = -(((~i13) & 81) | (i13 & (-82)));
        int i16 = (i14 & i15) + (i15 | i14);
        f52202h = i16 % 128;
        int i17 = i16 % 2;
    }

    public aar() {
        this.f52203e = new BouncyCastleJsseProvider();
    }

    public static /* synthetic */ String a(Object[] objArr) {
        aar aarVar = (aar) objArr[0];
        BCSSLSocket bCSSLSocket = (SSLSocket) objArr[1];
        System.identityHashCode(aarVar);
        System.identityHashCode(aarVar);
        Intrinsics.checkNotNullParameter(bCSSLSocket, "");
        if (!(bCSSLSocket instanceof BCSSLSocket)) {
            String x4 = super.setX((SSLSocket) bCSSLSocket);
            int i10 = f52202h;
            int i11 = ((i10 | 65) << 1) - (i10 ^ 65);
            f52201g = i11 % 128;
            int i12 = i11 % 2;
            return x4;
        }
        int i13 = f52201g + 77;
        f52202h = i13 % 128;
        int i14 = i13 % 2;
        String applicationProtocol = bCSSLSocket.getApplicationProtocol();
        if (applicationProtocol == null) {
            int i15 = f52201g;
            int i16 = i15 & 69;
            int i17 = (~i16) & (i15 | 69);
            int i18 = -(-(i16 << 1));
            int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
            f52202h = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((i15 ^ 122) + ((i15 & 122) << 1)) - 1;
            f52202h = i21 % 128;
            int i22 = i21 % 2;
        } else {
            boolean zAreEqual = Intrinsics.areEqual(applicationProtocol, "");
            int i23 = f52202h;
            int i24 = (i23 | 35) << 1;
            int i25 = -(((~i23) & 35) | (i23 & (-36)));
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            int i27 = i26 % 128;
            f52201g = i27;
            int i28 = i26 % 2;
            if (!zAreEqual) {
                int i29 = i27 & 31;
                int i30 = ((((i27 ^ 31) | i29) << 1) - (~(-((i27 | 31) & (~i29))))) - 1;
                f52202h = i30 % 128;
                int i31 = i30 % 2;
                return applicationProtocol;
            }
        }
        int i32 = f52201g;
        int i33 = (((i32 | 104) << 1) - (i32 ^ 104)) - 1;
        f52202h = i33 % 128;
        int i34 = i33 % 2;
        int i35 = i32 + 65;
        f52202h = i35 % 128;
        if (i35 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
    
        if (r10 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
    
        r5.setApplicationProtocols((java.lang.String[]) r10);
        r3.setParameters(r5);
        r10 = com.mypinpad.tsdk.isolation.aar.f52201g;
        r0 = ((r10 | 119) << 1) - (r10 ^ 119);
        com.mypinpad.tsdk.isolation.aar.f52202h = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x009b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
    
        if (r10 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void b(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            com.mypinpad.tsdk.i.aar r1 = (com.mypinpad.tsdk.isolation.aar) r1
            r2 = 1
            r3 = r10[r2]
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            r4 = 2
            r5 = r10[r4]
            java.lang.String r5 = (java.lang.String) r5
            r6 = 3
            r10 = r10[r6]
            java.util.List r10 = (java.util.List) r10
            int r6 = com.mypinpad.tsdk.isolation.aar.f52201g
            r7 = r6 ^ 35
            r6 = r6 & 35
            int r6 = r6 << r2
            int r7 = r7 + r6
            int r6 = r7 % 128
            com.mypinpad.tsdk.isolation.aar.f52202h = r6
            int r7 = r7 % r4
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)
            boolean r6 = r3 instanceof org.bouncycastle.jsse.BCSSLSocket
            if (r6 == 0) goto La6
            int r1 = com.mypinpad.tsdk.isolation.aar.f52201g
            r5 = r1 & 119(0x77, float:1.67E-43)
            r1 = r1 | 119(0x77, float:1.67E-43)
            int r5 = r5 + r1
            int r1 = r5 % 128
            com.mypinpad.tsdk.isolation.aar.f52202h = r1
            int r5 = r5 % r4
            r1 = -530048479(0xffffffffe0681a21, float:-6.6898866E19)
            r6 = 530048483(0x1f97e5e3, float:6.43313E-20)
            if (r5 != 0) goto L62
            r5 = r3
            org.bouncycastle.jsse.BCSSLSocket r5 = (org.bouncycastle.jsse.BCSSLSocket) r5
            org.bouncycastle.jsse.BCSSLParameters r5 = r5.getParameters()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r0] = r10
            long r8 = java.lang.System.currentTimeMillis()
            int r10 = (int) r8
            java.lang.Object r10 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.setOnFocusChangeListener(r7, r6, r1, r10)
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r10 = r10.toArray(r0)
            if (r10 == 0) goto L9e
            goto L82
        L62:
            r5 = r3
            org.bouncycastle.jsse.BCSSLSocket r5 = (org.bouncycastle.jsse.BCSSLSocket) r5
            org.bouncycastle.jsse.BCSSLParameters r5 = r5.getParameters()
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r0] = r10
            long r8 = java.lang.System.currentTimeMillis()
            int r10 = (int) r8
            java.lang.Object r10 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.setOnFocusChangeListener(r7, r6, r1, r10)
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r10 = r10.toArray(r0)
            if (r10 == 0) goto L9e
        L82:
            java.lang.String[] r10 = (java.lang.String[]) r10
            r5.setApplicationProtocols(r10)
            org.bouncycastle.jsse.BCSSLSocket r3 = (org.bouncycastle.jsse.BCSSLSocket) r3
            r3.setParameters(r5)
            int r10 = com.mypinpad.tsdk.isolation.aar.f52201g
            r0 = r10 | 119(0x77, float:1.67E-43)
            int r0 = r0 << r2
            r10 = r10 ^ 119(0x77, float:1.67E-43)
            int r0 = r0 - r10
            int r10 = r0 % 128
            com.mypinpad.tsdk.isolation.aar.f52202h = r10
            int r0 = r0 % r4
            if (r0 == 0) goto L9c
            return
        L9c:
            r10 = 0
            throw r10
        L9e:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r10.<init>(r0)
            throw r10
        La6:
            super.setX(r3, r5, r10)
            int r10 = com.mypinpad.tsdk.isolation.aar.f52202h
            int r10 = r10 + 39
            int r0 = r10 % 128
            com.mypinpad.tsdk.isolation.aar.f52201g = r0
            int r10 = r10 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aar.b(java.lang.Object[]):void");
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        Object objValueOf;
        int i13 = (i11 * (-463)) + (i10 * 465);
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~(i14 | i15);
        int i17 = ~(i14 | i10);
        int i18 = (((~(i10 | i12)) | i17) * 464) + ((i14 | (~i10) | i12) * (-464)) + (((~(i15 | i10)) | i16 | i17) * 464) + i13;
        if (i18 == 1) {
            b(objArr);
            return null;
        }
        if (i18 == 2) {
            return a(objArr);
        }
        if (i18 == 3) {
            int i19 = f52202h;
            int i20 = (-2) - ((((i19 | 46) << 1) - (i19 ^ 46)) ^ (-1));
            f52201g = i20 % 128;
            int i21 = i20 % 2;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNull(trustManagers);
            if (trustManagers.length == 1) {
                int i22 = f52201g + 21;
                int i23 = i22 % 128;
                f52202h = i23;
                if (i22 % 2 != 0 ? (trustManagers[0] instanceof X509TrustManager) : (trustManagers[0] instanceof X509TrustManager)) {
                    int i24 = (i23 & 46) + (i23 | 46);
                    int i25 = (i24 ^ (-1)) + (i24 << 1);
                    f52201g = i25 % 128;
                    int i26 = i25 % 2;
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager == null) {
                        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    }
                    objValueOf = (X509TrustManager) trustManager;
                    int i27 = i23 + 37;
                    f52201g = i27 % 128;
                    if (i27 % 2 != 0) {
                        throw null;
                    }
                }
            }
            int i28 = f52202h;
            int i29 = ((i28 & 52) + (i28 | 52)) - 1;
            f52201g = i29 % 128;
            int i30 = i29 % 2;
            String string = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(string, "");
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
        }
        if (i18 != 4) {
            aar aarVar = (aar) objArr[0];
            int i31 = f52202h;
            int i32 = i31 | 81;
            int i33 = i32 << 1;
            int i34 = -((~(i31 & 81)) & i32);
            int i35 = (i33 & i34) + (i34 | i33);
            f52201g = i35 % 128;
            int i36 = i35 % 2;
            Provider provider = aarVar.f52203e;
            if (i36 != 0) {
                Intrinsics.checkNotNullExpressionValue(SSLContext.getInstance("TLS", provider), "");
                throw null;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
            Intrinsics.checkNotNullExpressionValue(sSLContext, "");
            int i37 = f52201g;
            int i38 = ((i37 & (-108)) | ((~i37) & 107)) + ((i37 & 107) << 1);
            f52202h = i38 % 128;
            int i39 = i38 % 2;
            return sSLContext;
        }
        int i40 = f52201g;
        int i41 = i40 + 57;
        f52202h = i41 % 128;
        if (i41 % 2 == 0) {
            throw null;
        }
        int i42 = i40 & 91;
        int i43 = (i40 | 91) & (~i42);
        int i44 = i42 << 1;
        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
        f52202h = i45 % 128;
        int i46 = i45 % 2;
        boolean z10 = f52200f;
        if (i46 == 0) {
            int i47 = 33 / 0;
        }
        objValueOf = Boolean.valueOf(z10);
        return objValueOf;
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final SSLContext e_() {
        return (SSLContext) setDividerPadding(new Object[]{this}, -296263832, 296263832, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final X509TrustManager setCompoundDrawableTintBlendMode() {
        return (X509TrustManager) setDividerPadding(new Object[]{this}, -1191412913, 1191412916, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setDividerPadding(new Object[]{this, p4}, 404545207, -404545205, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aar$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/aar$setY;", "", "Lcom/mypinpad/tsdk/i/aar;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/aar;", "", "setDividerPadding", "Z", "()Z", "setX", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52204a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52205b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v25, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v11 */
        /* JADX WARN: Type inference failed for: r5v18 */
        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r5v4 */
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i12 | i11);
            int i15 = (((~(i13 | i11)) | (~(i10 | (~i11)))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109));
            ?? r10 = 0;
            r10 = 0;
            if (i15 != 1) {
                int i16 = f52204a;
                int i17 = ((i16 ^ 72) + ((i16 & 72) << 1)) - 1;
                f52205b = i17 % 128;
                if (i17 % 2 == 0) {
                    ((Boolean) aar.setDividerPadding(new Object[0], -412151339, 412151343, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                boolean zBooleanValue = ((Boolean) aar.setDividerPadding(new Object[0], -412151339, 412151343, (int) System.currentTimeMillis())).booleanValue();
                int i18 = f52204a;
                int i19 = (i18 & 13) + (i18 | 13);
                f52205b = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 9 / 0;
                }
                return Boolean.valueOf(zBooleanValue);
            }
            int i21 = f52205b + 13;
            f52204a = i21 % 128;
            if (i21 % 2 != 0) {
                ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -1382957913, 1382957913, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -1382957913, 1382957913, (int) System.currentTimeMillis())).booleanValue()) {
                aar aarVar = new aar(r10);
                int i22 = f52204a;
                int i23 = i22 & 103;
                int i24 = (i22 ^ 103) | i23;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f52205b = i25 % 128;
                int i26 = i25 % 2;
                r10 = aarVar;
            } else {
                int i27 = f52204a;
                int i28 = ((i27 | 62) << 1) - (i27 ^ 62);
                int i29 = (i28 ^ (-1)) + (i28 << 1);
                f52205b = i29 % 128;
                if (i29 % 2 == 0) {
                    int i30 = 8 / 0;
                }
            }
            return r10;
        }

        @JvmName(name = "setDividerPadding")
        public static boolean setDividerPadding() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -1382957913, 1382957913, (int) System.currentTimeMillis())).booleanValue();
        }

        @Nullable
        public static aar setCompoundDrawableTintBlendMode() {
            return (aar) setCompoundDrawableTintBlendMode(new Object[0], -1437953086, 1437953087, (int) System.currentTimeMillis());
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<yi> p11) throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        setDividerPadding(new Object[]{this, p4, p10, p11}, -1137176163, 1137176164, System.identityHashCode(this));
    }

    public /* synthetic */ aar(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
