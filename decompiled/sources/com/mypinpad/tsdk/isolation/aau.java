package com.mypinpad.tsdk.isolation;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0018B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r¢\u0006\u0002\b\u000e0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/aau;", "Lcom/mypinpad/tsdk/i/aaw;", "Ljavax/net/ssl/SSLContext;", "e_", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "setCompoundDrawableTintBlendMode", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "p0", "", "p1", "", "Lcom/mypinpad/tsdk/i/yi;", "Lkotlin/jvm/JvmSuppressWildcards;", "p2", "", "setX", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljavax/net/ssl/SSLSocketFactory;", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "<init>", "()V", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class aau extends aaw {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f52231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f52232g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52233h = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Provider f52234e;

    public static final class setOnFocusChangeListener implements ConscryptHostnameVerifier {

        @NotNull
        public static final setOnFocusChangeListener setDividerPadding = new setOnFocusChangeListener();

        static {
            int i10 = 1 & 43;
            int i11 = 1 | 43;
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            int i14 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, companion.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                int i10 = f52233h;
                int i11 = ((i10 | 38) << 1) - (i10 ^ 38);
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                f52232g = i12 % 128;
                if (i12 % 2 != 0) {
                    ((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[0], 367250363, -367250363, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) Companion.setCompoundDrawableTintBlendMode(new Object[0], 367250363, -367250363, (int) System.currentTimeMillis())).booleanValue()) {
                    int i13 = f52233h;
                    int i14 = i13 & 21;
                    int i15 = (i13 | 21) & (~i14);
                    int i16 = -(-(i14 << 1));
                    int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                    f52232g = i17 % 128;
                    int i18 = i17 % 2;
                    z10 = true;
                } else {
                    int i19 = f52232g;
                    int i20 = i19 & 65;
                    int i21 = -(-((i19 ^ 65) | i20));
                    int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                    f52233h = i22 % 128;
                    int i23 = i22 % 2;
                }
            } else {
                int i110 = f52232g;
                int i24 = i110 & 65;
                int i25 = -(-((i110 ^ 65) | i24));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                f52233h = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = f52232g;
            int i29 = (i28 & (-124)) | ((~i28) & 123);
            int i30 = -(-((i28 & 123) << 1));
            int i31 = (i29 & i30) + (i30 | i29);
            f52233h = i31 % 128;
            int i32 = i31 % 2;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f52231f = z10;
        int i33 = f52232g;
        int i34 = (i33 & 9) + (i33 | 9);
        f52233h = i34 % 128;
        int i35 = i34 % 2;
    }

    public aau() {
        Provider providerNewProvider = Conscrypt.newProvider();
        Intrinsics.checkNotNullExpressionValue(providerNewProvider, "");
        this.f52234e = providerNewProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0081, code lost:
    
        if (r10 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
    
        org.conscrypt.Conscrypt.setApplicationProtocols(r3, (java.lang.String[]) r10);
        r10 = com.mypinpad.tsdk.isolation.aau.f52232g;
        r0 = ((r10 | 15) << 1) - (r10 ^ 15);
        com.mypinpad.tsdk.isolation.aau.f52233h = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0099, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0064, code lost:
    
        if (r10 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(java.lang.Object[] r10) {
        /*
            r0 = 0
            r1 = r10[r0]
            com.mypinpad.tsdk.i.aau r1 = (com.mypinpad.tsdk.isolation.aau) r1
            r2 = 1
            r3 = r10[r2]
            javax.net.ssl.SSLSocket r3 = (javax.net.ssl.SSLSocket) r3
            r4 = 2
            r5 = r10[r4]
            java.lang.String r5 = (java.lang.String) r5
            r6 = 3
            r10 = r10[r6]
            java.util.List r10 = (java.util.List) r10
            int r6 = com.mypinpad.tsdk.isolation.aau.f52233h
            r7 = r6 & (-52)
            int r8 = ~r6
            r9 = 51
            r8 = r8 & r9
            r7 = r7 | r8
            r6 = r6 & r9
            int r6 = r6 << r2
            int r6 = ~r6
            int r7 = r7 - r6
            int r7 = r7 - r2
            int r6 = r7 % 128
            com.mypinpad.tsdk.isolation.aau.f52232g = r6
            int r7 = r7 % r4
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r6)
            boolean r6 = org.conscrypt.Conscrypt.isConscrypt(r3)
            if (r6 == 0) goto La2
            int r1 = com.mypinpad.tsdk.isolation.aau.f52233h
            int r1 = r1 + 124
            r1 = r1 ^ (-1)
            int r1 = (-2) - r1
            int r5 = r1 % 128
            com.mypinpad.tsdk.isolation.aau.f52232g = r5
            int r1 = r1 % r4
            r5 = -530048479(0xffffffffe0681a21, float:-6.6898866E19)
            r6 = 530048483(0x1f97e5e3, float:6.43313E-20)
            if (r1 == 0) goto L67
            org.conscrypt.Conscrypt.setUseSessionTickets(r3, r0)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r0] = r10
            long r7 = java.lang.System.currentTimeMillis()
            int r10 = (int) r7
            java.lang.Object r10 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.setOnFocusChangeListener(r1, r6, r5, r10)
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r10 = r10.toArray(r0)
            if (r10 == 0) goto L9a
            goto L83
        L67:
            org.conscrypt.Conscrypt.setUseSessionTickets(r3, r2)
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r0] = r10
            long r7 = java.lang.System.currentTimeMillis()
            int r10 = (int) r7
            java.lang.Object r10 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.setOnFocusChangeListener(r1, r6, r5, r10)
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r10 = r10.toArray(r0)
            if (r10 == 0) goto L9a
        L83:
            java.lang.String[] r10 = (java.lang.String[]) r10
            org.conscrypt.Conscrypt.setApplicationProtocols(r3, r10)
            int r10 = com.mypinpad.tsdk.isolation.aau.f52232g
            r0 = r10 | 15
            int r0 = r0 << r2
            r10 = r10 ^ 15
            int r0 = r0 - r10
            int r10 = r0 % 128
            com.mypinpad.tsdk.isolation.aau.f52233h = r10
            int r0 = r0 % r4
            if (r0 == 0) goto L98
            return
        L98:
            r10 = 0
            throw r10
        L9a:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r10.<init>(r0)
            throw r10
        La2:
            super.setX(r3, r5, r10)
            int r10 = com.mypinpad.tsdk.isolation.aau.f52232g
            r0 = r10 & 85
            int r1 = ~r0
            r10 = r10 | 85
            r10 = r10 & r1
            int r0 = r0 << r2
            int r0 = -r0
            int r0 = -r0
            r1 = r10 ^ r0
            r10 = r10 & r0
            int r10 = r10 << r2
            int r1 = r1 + r10
            int r10 = r1 % 128
            com.mypinpad.tsdk.isolation.aau.f52233h = r10
            int r1 = r1 % r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aau.a(java.lang.Object[]):void");
    }

    public static /* synthetic */ String b(Object[] objArr) {
        aau aauVar = (aau) objArr[0];
        SSLSocket sSLSocket = (SSLSocket) objArr[1];
        int i10 = f52232g;
        int i11 = ((i10 ^ 29) | (i10 & 29)) << 1;
        int i12 = -(((~i10) & 29) | (i10 & (-30)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52233h = i13 % 128;
        if (i13 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            Conscrypt.isConscrypt(sSLSocket);
            throw null;
        }
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            String x4 = super.setX(sSLSocket);
            int i14 = f52233h + 7;
            f52232g = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 82 / 0;
            }
            return x4;
        }
        int i16 = f52232g;
        int i17 = ((i16 ^ 10) + ((i16 & 10) << 1)) - 1;
        f52233h = i17 % 128;
        int i18 = i17 % 2;
        String applicationProtocol = Conscrypt.getApplicationProtocol(sSLSocket);
        int i19 = f52232g;
        int i20 = (i19 & 33) + (i19 | 33);
        f52233h = i20 % 128;
        int i21 = i20 % 2;
        return applicationProtocol;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0154  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        SSLContext sSLContextE_;
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        int i19 = ((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14;
        if (i19 == 1) {
            int i20 = f52233h + 24;
            int i21 = (i20 ^ (-1)) + (i20 << 1);
            f52232g = i21 % 128;
            int i22 = i21 % 2;
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNull(trustManagers);
            if (trustManagers.length == 1) {
                int i23 = f52232g;
                int i24 = i23 + 109;
                f52233h = i24 % 128;
                int i25 = i24 % 2;
                TrustManager trustManager = trustManagers[0];
                if (!(!(trustManager instanceof X509TrustManager))) {
                    int i26 = i23 & 31;
                    int i27 = ((i23 ^ 31) | i26) << 1;
                    int i28 = -((i23 | 31) & (~i26));
                    int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
                    f52233h = i29 % 128;
                    if (i29 % 2 != 0) {
                        if (trustManager == null) {
                            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                        }
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        Conscrypt.setHostnameVerifier(x509TrustManager, setOnFocusChangeListener.setDividerPadding);
                        int i30 = f52232g;
                        int i31 = (i30 & (-4)) | ((~i30) & 3);
                        int i32 = (i30 & 3) << 1;
                        int i33 = (i31 & i32) + (i32 | i31);
                        f52233h = i33 % 128;
                        int i34 = i33 % 2;
                        return x509TrustManager;
                    }
                } else {
                    int i35 = f52233h;
                    int i36 = ((i35 | 93) << 1) - (i35 ^ 93);
                    f52232g = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else {
                int i38 = f52233h;
                int i39 = ((i38 | 93) << 1) - (i38 ^ 93);
                f52232g = i39 % 128;
                int i310 = i39 % 2;
            }
            String string = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(string, "");
            throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
        }
        if (i19 == 2) {
            int i40 = f52233h;
            int i41 = i40 & 27;
            int i42 = -(-((i40 ^ 27) | i41));
            int i43 = ((i41 | i42) << 1) - (i41 ^ i42);
            f52232g = i43 % 128;
            if (i43 % 2 != 0) {
                throw null;
            }
            int i44 = i40 + 51;
            f52232g = i44 % 128;
            if (i44 % 2 == 0) {
                return Boolean.valueOf(f52231f);
            }
            throw null;
        }
        if (i19 == 3) {
            aau aauVar = (aau) objArr[0];
            int i45 = f52232g;
            int i46 = i45 & 45;
            int i47 = (i46 - (~(-(-((i45 ^ 45) | i46))))) - 1;
            f52233h = i47 % 128;
            int i48 = i47 % 2;
            SSLContext sSLContext = SSLContext.getInstance("TLS", aauVar.f52234e);
            Intrinsics.checkNotNullExpressionValue(sSLContext, "");
            if (i48 == 0) {
                int i49 = 47 / 0;
            }
            return sSLContext;
        }
        if (i19 == 4) {
            return b(objArr);
        }
        if (i19 != 5) {
            a(objArr);
            return null;
        }
        aau aauVar2 = (aau) objArr[0];
        X509TrustManager x509TrustManager2 = (X509TrustManager) objArr[1];
        int i50 = f52233h;
        int i51 = i50 & 3;
        int i52 = i51 + ((3 ^ i50) | i51);
        f52232g = i52 % 128;
        if (i52 % 2 != 0) {
            Intrinsics.checkNotNullParameter(x509TrustManager2, "");
            sSLContextE_ = aauVar2.e_();
            TrustManager[] trustManagerArr = new TrustManager[0];
            trustManagerArr[1] = x509TrustManager2;
            sSLContextE_.init(null, trustManagerArr, null);
        } else {
            Intrinsics.checkNotNullParameter(x509TrustManager2, "");
            sSLContextE_ = aauVar2.e_();
            sSLContextE_.init(null, new TrustManager[]{x509TrustManager2}, null);
        }
        SSLSocketFactory socketFactory = sSLContextE_.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "");
        int i53 = f52232g;
        int i54 = ((i53 & 104) + (i53 | 104)) - 1;
        f52233h = i54 % 128;
        if (i54 % 2 != 0) {
            return socketFactory;
        }
        int i55 = 9 / 0;
        return socketFactory;
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final SSLContext e_() {
        return (SSLContext) setDividerPadding(new Object[]{this}, -956842308, 956842311, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final SSLSocketFactory setCompoundDrawableTintBlendMode(@NotNull X509TrustManager p4) {
        return (SSLSocketFactory) setDividerPadding(new Object[]{this, p4}, -256047291, 256047296, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @NotNull
    public final X509TrustManager setCompoundDrawableTintBlendMode() {
        return (X509TrustManager) setDividerPadding(new Object[]{this}, -1219711017, 1219711018, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    @Nullable
    public final String setX(@NotNull SSLSocket p4) {
        return (String) setDividerPadding(new Object[]{this, p4}, 1794940550, -1794940546, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aau$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\n\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/aau$setX;", "", "", "p0", "p1", "p2", "", "setDividerPadding", "()Z", "Lcom/mypinpad/tsdk/i/aau;", "setX", "()Lcom/mypinpad/tsdk/i/aau;", "setOnFocusChangeListener", "Z", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52235a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52236b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
        
            if (r1.major() <= 2) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.aau.Companion.f52236b;
            r3 = ((((r1 ^ 69) | (r1 & 69)) << 1) - (~(-((r1 & (-70)) | ((~r1) & 69))))) - 1;
            com.mypinpad.tsdk.isolation.aau.Companion.f52235a = r3 % 128;
            r3 = r3 % 2;
            r3 = ((r1 & 106) + (r1 | 106)) - 1;
            com.mypinpad.tsdk.isolation.aau.Companion.f52235a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.aau.Companion.f52236b;
            r3 = ((r1 ^ 111) - (~((r1 & 111) << 1))) - 1;
            com.mypinpad.tsdk.isolation.aau.Companion.f52235a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
        
            if ((r3 % 2) == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        
            r0 = 82 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
        
            if (r1.minor() == 1) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        
            r4 = com.mypinpad.tsdk.isolation.aau.Companion.f52235a;
            r5 = r4 & 115;
            r5 = (r5 - (~((r4 ^ 115) | r5))) - 1;
            com.mypinpad.tsdk.isolation.aau.Companion.f52236b = r5 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
        
            if ((r5 % 2) != 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
        
            if (r1.minor() <= 0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
        
            if (r1.minor() <= 1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.aau.Companion.f52235a;
            r4 = r1 & 5;
            r5 = (~r4) & (r1 | 5);
            r4 = r4 << 1;
            r6 = ((r5 | r4) << 1) - (r4 ^ r5);
            com.mypinpad.tsdk.isolation.aau.Companion.f52236b = r6 % 128;
            r6 = r6 % 2;
            r4 = r1 ^ 27;
            r1 = (r1 & 27) << 1;
            r2 = (r4 & r1) + (r1 | r4);
            com.mypinpad.tsdk.isolation.aau.Companion.f52236b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        
            if ((r2 % 2) != 0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
        
            r3 = 79 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c0, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00c1, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.aau.Companion.f52235a;
            r3 = r1 & 113;
            r1 = (((r1 | 113) & (~r3)) - (~(r3 << 1))) - 1;
            com.mypinpad.tsdk.isolation.aau.Companion.f52236b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
        
            if (r1.patch() < 0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00db, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.aau.Companion.f52236b;
            r2 = ((r1 & 42) + (r1 | 42)) - 1;
            com.mypinpad.tsdk.isolation.aau.Companion.f52235a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        
            return java.lang.Boolean.TRUE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ec, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.aau.Companion.f52236b;
            r3 = ((r1 & (-40)) | ((~r1) & 39)) + ((r1 & 39) << 1);
            com.mypinpad.tsdk.isolation.aau.Companion.f52235a = r3 % 128;
            r3 = r3 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ff, code lost:
        
            return java.lang.Boolean.FALSE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
        
            if (r1.major() != 5) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
        
            if (r1.major() != 2) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Boolean a() {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aau.Companion.a():java.lang.Boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 253) + (i10 * 253);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = i11 | i10;
            int i20 = ~(i12 | i19);
            int i21 = (((~(i17 | i10)) | i20) * 252) + (i19 * (-252)) + ((i18 | i20) * (-252)) + i13;
            aau aauVar = null;
            Object[] objArr2 = 0;
            if (i21 == 1) {
                int i22 = f52235a;
                int i23 = i22 & 63;
                int i24 = i23 + ((i22 ^ 63) | i23);
                f52236b = i24 % 128;
                int i25 = i24 % 2;
                boolean zBooleanValue = ((Boolean) aau.setDividerPadding(new Object[0], -1058456668, 1058456670, (int) System.currentTimeMillis())).booleanValue();
                int i26 = f52235a;
                int i27 = i26 ^ 93;
                int i28 = (((i26 & 93) | i27) << 1) - i27;
                f52236b = i28 % 128;
                if (i28 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            }
            if (i21 != 2) {
                return a();
            }
            int i29 = f52235a;
            int i30 = (i29 ^ 105) + ((i29 & 105) << 1);
            f52236b = i30 % 128;
            int i31 = i30 % 2;
            if (((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -119956110, 119956111, (int) System.currentTimeMillis())).booleanValue()) {
                aau aauVar2 = new aau(objArr2 == true ? 1 : 0);
                int i32 = f52235a + 103;
                f52236b = i32 % 128;
                if (i32 % 2 == 0) {
                    throw null;
                }
                aauVar = aauVar2;
            } else {
                int i33 = f52236b;
                int i34 = (i33 & (-8)) | ((~i33) & 7);
                int i35 = (i33 & 7) << 1;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f52235a = i36 % 128;
                if (i36 % 2 != 0) {
                    throw null;
                }
            }
            return aauVar;
        }

        public static boolean setDividerPadding() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], 367250363, -367250363, (int) System.currentTimeMillis())).booleanValue();
        }

        @Nullable
        public static aau setX() {
            return (aau) setCompoundDrawableTintBlendMode(new Object[0], 2045107767, -2045107765, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        public static boolean setCompoundDrawableTintBlendMode() {
            return ((Boolean) setCompoundDrawableTintBlendMode(new Object[0], -119956110, 119956111, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    public /* synthetic */ aau(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // com.mypinpad.tsdk.isolation.aaw
    public final void setX(@NotNull SSLSocket p4, @Nullable String p10, @NotNull List<yi> p11) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        setDividerPadding(new Object[]{this, p4, p10, p11}, -405028952, 405028952, System.identityHashCode(this));
    }
}
