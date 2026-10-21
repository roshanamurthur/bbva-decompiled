package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.deviceinfo.component.Sys;
import com.bbva.glomohybrid.logs.LogKeysKt;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objenesis.strategy.PlatformDescription;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0010¢\u0006\u0002\b\u00110\u000fH\u0016J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0006\u0010\u001b\u001a\u00020\u0002J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\u0002H\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J&\u0010%\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00182\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001a\u0010'\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020*2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010-\u001a\u00020*H\u0016¨\u00061"}, d2 = {"Lokhttp3/internal/platform/Platform;", "", "", "toString", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "afterHandshake", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/tls/CertificateChainCleaner;", "buildCertificateChainCleaner", "Lokhttp3/internal/tls/TrustRootIndex;", "buildTrustRootIndex", "hostname", "", "Lokhttp3/Protocol;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "configureTlsExtensions", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "connectSocket", "getPrefix", "getSelectedProtocol", "closer", "getStackTraceForCloseable", "", "isCleartextTrafficPermitted", "message", "level", "", "t", LogKeysKt.LOG, "stackTrace", "logCloseableLeak", "Ljavax/net/ssl/SSLContext;", "newSSLContext", "Ljavax/net/ssl/SSLSocketFactory;", "newSslSocketFactory", "platformTrustManager", "sslSocketFactory", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 6, 0})
public class aaw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static volatile aaw f52243a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f52244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52245c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52246d = 1;

    @NotNull
    public static final setOnFocusChangeListener setCompoundDrawableTintBlendMode;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000fR\u0018\u0010\u0012\u001a\u0006*\u00020\u00100\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/aaw$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/aaw;", "setX", "()Lcom/mypinpad/tsdk/i/aaw;", "", "Lcom/mypinpad/tsdk/i/yi;", "p0", "", "setDividerPadding", "(Ljava/util/List;)Ljava/util/List;", "", "setOnFocusChangeListener", "(Ljava/util/List;)[B", "", "()Z", "Ljava/util/logging/Logger;", "Ljava/util/logging/Logger;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/aaw;", "setLayoutAnimation", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52247a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52248b = 1;

        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
        
            if ((r2 % 2) != 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
        
            r6 = (com.mypinpad.tsdk.isolation.aaw) setOnFocusChangeListener(new java.lang.Object[0], -1740706377, 1740706386, (int) java.lang.System.currentTimeMillis());
            r0 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b;
            r1 = r0 & 39;
            r0 = (r0 | 39) & (~r1);
            r1 = -(-(r1 << 1));
            r2 = (r0 ^ r1) + ((r0 & r1) << 1);
            com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[0], -662658218, 662658220, (int) java.lang.System.currentTimeMillis())).booleanValue() != true) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
        
            if (((java.lang.Boolean) setOnFocusChangeListener(new java.lang.Object[0], -662658218, 662658220, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
        
            r6 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a;
            r1 = (r6 ^ 107) + ((r6 & 107) << 1);
            com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b = r1 % 128;
            r1 = r1 % 2;
            r6 = (com.mypinpad.tsdk.isolation.aaw) setOnFocusChangeListener(new java.lang.Object[0], -767136788, 767136789, (int) java.lang.System.currentTimeMillis());
            r0 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b;
            r1 = ((r0 ^ 9) | (r0 & 9)) << 1;
            r0 = -(((~r0) & 9) | (r0 & (-10)));
            r2 = (r1 ^ r0) + ((r0 & r1) << 1);
            com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a = r2 % 128;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ com.mypinpad.tsdk.isolation.aaw a(java.lang.Object[] r6) {
            /*
                r0 = 0
                r6 = r6[r0]
                com.mypinpad.tsdk.i.aaw$setOnFocusChangeListener r6 = (com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener) r6
                int r6 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b
                int r6 = r6 + 111
                int r1 = r6 % 128
                com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a = r1
                int r6 = r6 % 2
                r1 = 662658220(0x277f5cac, float:3.5438596E-15)
                r2 = -662658218(0xffffffffd880a356, float:-1.1315121E15)
                r3 = 1
                if (r6 == 0) goto L2f
                java.lang.Object[] r6 = new java.lang.Object[r0]
                long r4 = java.lang.System.currentTimeMillis()
                int r4 = (int) r4
                java.lang.Object r6 = setOnFocusChangeListener(r6, r2, r1, r4)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                r1 = 65
                int r1 = r1 / r0
                if (r6 == r3) goto L42
                goto L82
            L2f:
                java.lang.Object[] r6 = new java.lang.Object[r0]
                long r4 = java.lang.System.currentTimeMillis()
                int r4 = (int) r4
                java.lang.Object r6 = setOnFocusChangeListener(r6, r2, r1, r4)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L82
            L42:
                int r6 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a
                r1 = r6 ^ 107(0x6b, float:1.5E-43)
                r6 = r6 & 107(0x6b, float:1.5E-43)
                int r6 = r6 << r3
                int r1 = r1 + r6
                int r6 = r1 % 128
                com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b = r6
                int r1 = r1 % 2
                java.lang.Object[] r6 = new java.lang.Object[r0]
                long r0 = java.lang.System.currentTimeMillis()
                int r0 = (int) r0
                r1 = -767136788(0xffffffffd2466bec, float:-2.1305354E11)
                r2 = 767136789(0x2db99415, float:2.1097827E-11)
                java.lang.Object r6 = setOnFocusChangeListener(r6, r1, r2, r0)
                com.mypinpad.tsdk.i.aaw r6 = (com.mypinpad.tsdk.isolation.aaw) r6
                int r0 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b
                r1 = r0 ^ 9
                r2 = r0 & 9
                r1 = r1 | r2
                int r1 = r1 << r3
                r2 = r0 & (-10)
                int r0 = ~r0
                r0 = r0 & 9
                r0 = r0 | r2
                int r0 = -r0
                r2 = r1 ^ r0
                r0 = r0 & r1
                int r0 = r0 << r3
                int r2 = r2 + r0
                int r0 = r2 % 128
                com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a = r0
                int r2 = r2 % 2
                if (r2 != 0) goto L80
                return r6
            L80:
                r6 = 0
                throw r6
            L82:
                java.lang.Object[] r6 = new java.lang.Object[r0]
                long r0 = java.lang.System.currentTimeMillis()
                int r0 = (int) r0
                r1 = -1740706377(0xffffffff983eedb7, float:-2.467694E-24)
                r2 = 1740706386(0x67c11252, float:1.8235094E24)
                java.lang.Object r6 = setOnFocusChangeListener(r6, r1, r2, r0)
                com.mypinpad.tsdk.i.aaw r6 = (com.mypinpad.tsdk.isolation.aaw) r6
                int r0 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b
                r1 = r0 & 39
                int r2 = ~r1
                r0 = r0 | 39
                r0 = r0 & r2
                int r1 = r1 << r3
                int r1 = -r1
                int r1 = -r1
                r2 = r0 ^ r1
                r0 = r0 & r1
                int r0 = r0 << r3
                int r2 = r2 + r0
                int r0 = r2 % 128
                com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a = r0
                int r2 = r2 % 2
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.a(java.lang.Object[]):com.mypinpad.tsdk.i.aaw");
        }

        public static /* synthetic */ Object b(Object[] objArr) {
            List list = (List) objArr[0];
            Intrinsics.checkNotNullParameter(list, "");
            abx abxVar = new abx();
            Iterator it = ((List) setOnFocusChangeListener(new Object[]{list}, 530048483, -530048479, (int) System.currentTimeMillis())).iterator();
            int i10 = f52248b;
            int i11 = (i10 & 5) + (i10 | 5);
            f52247a = i11 % 128;
            while (true) {
                int i12 = i11 % 2;
                if (!it.hasNext()) {
                    byte[] onEditorActionListener = abxVar.setOnEditorActionListener();
                    int i13 = f52247a;
                    int i14 = i13 & 9;
                    int i15 = (((i13 | 9) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
                    f52248b = i15 % 128;
                    int i16 = i15 % 2;
                    return onEditorActionListener;
                }
                int i17 = f52248b + 79;
                f52247a = i17 % 128;
                if (i17 % 2 != 0) {
                    String str = (String) it.next();
                    int length = str.length();
                    int i18 = 11 / 0;
                } else {
                    String str2 = (String) it.next();
                    int length2 = str2.length();
                }
                i11 = f52247a + 53;
                f52248b = i11 % 128;
            }
        }

        public static /* synthetic */ Boolean c() {
            int i10 = f52247a;
            int i11 = i10 & 59;
            int i12 = (i10 | 59) & (~i11);
            int i13 = i11 << 1;
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            f52248b = i14 % 128;
            int i15 = i14 % 2;
            boolean zAreEqual = Intrinsics.areEqual("Conscrypt", Security.getProviders()[0].getName());
            int i16 = f52247a;
            int i17 = i16 & 97;
            int i18 = ((((i16 ^ 97) | i17) << 1) - (~(-((i16 | 97) & (~i17))))) - 1;
            f52248b = i18 % 128;
            if (i18 % 2 != 0) {
                return Boolean.valueOf(zAreEqual);
            }
            int i19 = 62 / 0;
            return Boolean.valueOf(zAreEqual);
        }

        public static /* synthetic */ Boolean d() {
            int i10 = f52247a;
            int i11 = ((i10 ^ 98) + ((i10 & 98) << 1)) - 1;
            f52248b = i11 % 128;
            int i12 = i11 % 2;
            boolean zAreEqual = Intrinsics.areEqual("OpenJSSE", Security.getProviders()[0].getName());
            int i13 = f52247a;
            int i14 = i13 & 27;
            int i15 = ((i13 ^ 27) | i14) << 1;
            int i16 = -((i13 | 27) & (~i14));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f52248b = i17 % 128;
            if (i17 % 2 != 0) {
                return Boolean.valueOf(zAreEqual);
            }
            int i18 = 81 / 0;
            return Boolean.valueOf(zAreEqual);
        }

        public static /* synthetic */ Boolean e() {
            int i10 = f52248b;
            int i11 = i10 & 99;
            int i12 = (i10 | 99) & (~i11);
            int i13 = i11 << 1;
            int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
            f52247a = i14 % 128;
            int i15 = i14 % 2;
            boolean zAreEqual = Intrinsics.areEqual(PlatformDescription.DALVIK, System.getProperty(Sys.VM_NAME));
            if (i15 != 0) {
                int i16 = 67 / 0;
            }
            int i17 = f52248b;
            int i18 = (i17 ^ 79) + ((i17 & 79) << 1);
            f52247a = i18 % 128;
            int i19 = i18 % 2;
            return Boolean.valueOf(zAreEqual);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0062  */
        /* JADX WARN: Code duplicated, block: B:13:0x0085  */
        /* JADX WARN: Code duplicated, block: B:9:0x0041  */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
        
            if (r0 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0143, code lost:
        
            if (r0 != null) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0145, code lost:
        
            r2 = com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52247a;
            r3 = ((r2 & 115) - (~(r2 | 115))) - 1;
            com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b = r3 % 128;
            r3 = r3 % 2;
            r2 = r2 + 66;
            r3 = (r2 ^ (-1)) + (r2 << 1);
            com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f52248b = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0162, code lost:
        
            if ((r3 % 2) == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0164, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0165, code lost:
        
            throw null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ com.mypinpad.tsdk.isolation.aaw f() {
            /*
                Method dump skipped, instruction units count: 486
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.aaw.setOnFocusChangeListener.f():com.mypinpad.tsdk.i.aaw");
        }

        public static /* synthetic */ aaw g() {
            int i10 = f52248b;
            int i11 = i10 & 105;
            int i12 = i11 + ((i10 ^ 105) | i11);
            f52247a = i12 % 128;
            int i13 = i12 % 2;
            aba abaVar = aba.INSTANCE;
            aba.setCompoundDrawableTintBlendMode(new Object[0], -1751110146, 1751110146, (int) System.currentTimeMillis());
            aaq.Companion companion = aaq.INSTANCE;
            aaw aawVar = (aaw) aaq.Companion.setDividerPadding(new Object[0], 484673849, -484673848, (int) System.currentTimeMillis());
            if (aawVar == null) {
                int i14 = f52248b;
                int i15 = (i14 & (-28)) | ((~i14) & 27);
                int i16 = (i14 & 27) << 1;
                int i17 = (i15 & i16) + (i16 | i15);
                f52247a = i17 % 128;
                int i18 = i17 % 2;
                aas.Companion companion2 = aas.INSTANCE;
                aawVar = (aaw) aas.Companion.setCompoundDrawableTintBlendMode(new Object[0], -315912774, 315912775, (int) System.currentTimeMillis());
                Intrinsics.checkNotNull(aawVar);
                int i19 = f52247a;
                int i20 = i19 & 97;
                int i21 = ((i19 | 97) & (~i20)) + (i20 << 1);
                f52248b = i21 % 128;
                int i22 = i21 % 2;
            }
            int i23 = f52248b;
            int i24 = i23 & 73;
            int i25 = (i23 ^ 73) | i24;
            int i26 = (i24 & i25) + (i25 | i24);
            f52247a = i26 % 128;
            if (i26 % 2 == 0) {
                return aawVar;
            }
            throw null;
        }

        public static /* synthetic */ aaw h(Object[] objArr) {
            setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
            int i10 = f52247a;
            int i11 = (((i10 | 48) << 1) - (i10 ^ 48)) - 1;
            f52248b = i11 % 128;
            if (i11 % 2 != 0) {
                return (aaw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1696998588, 1696998596, System.identityHashCode(setonfocuschangelistener));
            }
            int i12 = 49 / 0;
            return (aaw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1696998588, 1696998596, System.identityHashCode(setonfocuschangelistener));
        }

        @NotNull
        public static List<String> setDividerPadding(@NotNull List<? extends yi> p4) {
            return (List) setOnFocusChangeListener(new Object[]{p4}, 530048483, -530048479, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ((~(i10 | i12)) * 216) + (i11 * (-215)) + (i10 * 217);
            int i14 = (~i11) | i10;
            int i15 = ~i12;
            switch ((((~(i10 | i15)) | i11) * 216) + ((i14 | i15) * (-216)) + i13) {
                case 1:
                    return g();
                case 2:
                    return e();
                case 3:
                    int i16 = f52247a;
                    int i17 = ((i16 | 71) << 1) - (i16 ^ 71);
                    f52248b = i17 % 128;
                    boolean zAreEqual = Intrinsics.areEqual(BouncyCastleProvider.PROVIDER_NAME, (i17 % 2 == 0 ? Security.getProviders()[0] : Security.getProviders()[0]).getName());
                    int i18 = f52248b;
                    int i19 = (-2) - (((i18 ^ 52) + ((i18 & 52) << 1)) ^ (-1));
                    f52247a = i19 % 128;
                    int i20 = i19 % 2;
                    return Boolean.valueOf(zAreEqual);
                case 4:
                    List list = (List) objArr[0];
                    Intrinsics.checkNotNullParameter(list, "");
                    ArrayList arrayList = new ArrayList();
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    for (Object obj : list) {
                        int i21 = f52247a + 13;
                        f52248b = i21 % 128;
                        int i22 = i21 % 2;
                        if (((yi) obj) != yi.setCompoundDrawableTintBlendMode) {
                            int i23 = f52247a;
                            int i24 = i23 & 45;
                            int i25 = -(-((i23 ^ 45) | i24));
                            int i26 = (i24 & i25) + (i24 | i25);
                            f52248b = i26 % 128;
                            int i27 = i26 % 2;
                            int i28 = i23 + 79;
                            f52248b = i28 % 128;
                            int i29 = i28 % 2;
                            int i30 = i23 ^ 3;
                            int i31 = -(-((i23 & 3) << 1));
                            int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
                            f52248b = i32 % 128;
                            int i33 = i32 % 2;
                            arrayList.add(obj);
                            int i34 = f52247a;
                            int i35 = i34 & 29;
                            int i36 = (i34 ^ 29) | i35;
                            int i37 = (i35 & i36) + (i36 | i35);
                            f52248b = i37 % 128;
                            int i38 = i37 % 2;
                        } else {
                            int i39 = (-2) - ((f52247a + 82) ^ (-1));
                            f52248b = i39 % 128;
                            int i40 = i39 % 2;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    while (!(!it.hasNext())) {
                        int i41 = f52248b;
                        int i42 = (((i41 & (-98)) | ((~i41) & 97)) - (~((i41 & 97) << 1))) - 1;
                        f52247a = i42 % 128;
                        int i43 = i42 % 2;
                        arrayList2.add(((yi) it.next()).toString());
                        int i44 = f52248b;
                        int i45 = i44 & 121;
                        int i46 = (i44 ^ 121) | i45;
                        int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                        f52247a = i47 % 128;
                        int i48 = i47 % 2;
                    }
                    int i49 = f52248b + 75;
                    f52247a = i49 % 128;
                    int i50 = i49 % 2;
                    return arrayList2;
                case 5:
                    return h(objArr);
                case 6:
                    int i51 = f52248b;
                    int i52 = i51 ^ 91;
                    int i53 = ((((i51 & 91) | i52) << 1) - (~(-i52))) - 1;
                    f52247a = i53 % 128;
                    int i54 = i53 % 2;
                    aaw aawVar = (aaw) aaw.setCompoundDrawableTintBlendMode(new Object[0], -1107376333, 1107376333, (int) System.currentTimeMillis());
                    int i55 = f52248b;
                    int i56 = i55 & 125;
                    int i57 = -(-((i55 ^ 125) | i56));
                    int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                    f52247a = i58 % 128;
                    int i59 = i58 % 2;
                    return aawVar;
                case 7:
                    return b(objArr);
                case 8:
                    return a(objArr);
                case 9:
                    return f();
                case 10:
                    return d();
                default:
                    return c();
            }
        }

        public static final /* synthetic */ aaw setX(setOnFocusChangeListener setonfocuschangelistener) {
            return (aaw) setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -37930060, 37930065, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @NotNull
        public static aaw setX() {
            return (aaw) setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis());
        }

        @NotNull
        public static byte[] setOnFocusChangeListener(@NotNull List<? extends yi> p4) {
            return (byte[]) setOnFocusChangeListener(new Object[]{p4}, -1475766957, 1475766964, (int) System.currentTimeMillis());
        }

        @JvmName(name = "setOnFocusChangeListener")
        public static boolean setOnFocusChangeListener() {
            return ((Boolean) setOnFocusChangeListener(new Object[0], -662658218, 662658220, (int) System.currentTimeMillis())).booleanValue();
        }
    }

    static {
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener(null);
        setCompoundDrawableTintBlendMode = setonfocuschangelistener;
        f52243a = (aaw) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -37930060, 37930065, (int) System.currentTimeMillis());
        f52244b = Logger.getLogger(ym.class.getName());
        int i10 = f52246d;
        int i11 = i10 & 67;
        int i12 = ((i10 ^ 67) | i11) << 1;
        int i13 = -((i10 | 67) & (~i11));
        int i14 = (i12 & i13) + (i13 | i12);
        f52245c = i14 % 128;
        int i15 = i14 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Level level;
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        int i16 = ((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13;
        if (i16 == 1) {
            String str = (String) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i17 = f52246d;
            int i18 = (((i17 ^ 79) | (i17 & 79)) << 1) - (((~i17) & 79) | (i17 & (-80)));
            int i19 = i18 % 128;
            f52245c = i19;
            int i20 = i18 % 2;
            if ((iIntValue2 & 2) != 0) {
                int i21 = i19 & 71;
                int i22 = -(-(i19 | 71));
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                f52246d = i23 % 128;
                iIntValue = i23 % 2 != 0 ? 4 : 5;
            }
            setCompoundDrawableTintBlendMode(new Object[]{str, Integer.valueOf(iIntValue), null}, 1271727973, -1271727970, iIntValue);
            int i24 = f52245c;
            int i25 = i24 & 33;
            int i26 = (i24 ^ 33) | i25;
            int i27 = (i25 & i26) + (i26 | i25);
            f52246d = i27 % 128;
            int i28 = i27 % 2;
            return null;
        }
        if (i16 == 2) {
            int i29 = f52246d;
            int i30 = ((i29 & 69) - (~(-(-(i29 | 69))))) - 1;
            f52245c = i30 % 128;
            if (i30 % 2 != 0) {
                throw null;
            }
            int i31 = i29 | 25;
            int i32 = ((i31 << 1) - (~(-((~(i29 & 25)) & i31)))) - 1;
            f52245c = i32 % 128;
            if (i32 % 2 == 0) {
                return "OkHttp";
            }
            throw null;
        }
        if (i16 != 3) {
            int i33 = f52246d;
            int i34 = (i33 ^ 23) + ((i33 & 23) << 1);
            f52245c = i34 % 128;
            if (i34 % 2 == 0) {
                return f52243a;
            }
            throw null;
        }
        String str2 = (String) objArr[0];
        int iIntValue3 = ((Number) objArr[1]).intValue();
        Throwable th2 = (Throwable) objArr[2];
        int i35 = f52246d;
        int i36 = (i35 ^ 47) + ((i35 & 47) << 1);
        f52245c = i36 % 128;
        if (i36 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str2, "");
            if (iIntValue3 == 2) {
                level = Level.WARNING;
                int i37 = f52246d;
                int i38 = i37 ^ 23;
                int i39 = -(-((i37 & 23) << 1));
                int i40 = (i38 & i39) + (i39 | i38);
                f52245c = i40 % 128;
                int i41 = i40 % 2;
            } else {
                level = Level.INFO;
                int i42 = f52245c;
                int i43 = i42 & 97;
                int i44 = ((i42 | 97) & (~i43)) + (i43 << 1);
                f52246d = i44 % 128;
                int i45 = i44 % 2;
            }
        } else {
            Intrinsics.checkNotNullParameter(str2, "");
            if (iIntValue3 == 5) {
                level = Level.WARNING;
                int i310 = f52246d;
                int i311 = i310 ^ 23;
                int i312 = -(-((i310 & 23) << 1));
                int i46 = (i311 & i312) + (i312 | i311);
                f52245c = i46 % 128;
                int i47 = i46 % 2;
            } else {
                level = Level.INFO;
                int i48 = f52245c;
                int i49 = i48 & 97;
                int i410 = ((i48 | 97) & (~i49)) + (i49 << 1);
                f52246d = i410 % 128;
                int i411 = i410 % 2;
            }
        }
        f52244b.log(level, str2, th2);
        int i50 = f52246d;
        int i51 = i50 & 79;
        int i52 = i51 + ((i50 ^ 79) | i51);
        f52245c = i52 % 128;
        if (i52 % 2 == 0) {
            return null;
        }
        throw null;
    }

    @NotNull
    public static String setLayoutAnimation() {
        return (String) setCompoundDrawableTintBlendMode(new Object[0], -1856562752, 1856562754, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ aaw setOnLongClickListener() {
        return (aaw) setCompoundDrawableTintBlendMode(new Object[0], -1107376333, 1107376333, (int) System.currentTimeMillis());
    }

    @NotNull
    public SSLContext e_() throws NoSuchAlgorithmException {
        int i10 = f52245c;
        int i11 = i10 & 1;
        int i12 = (i11 - (~(-(-((i10 ^ 1) | i11))))) - 1;
        f52246d = i12 % 128;
        int i13 = i12 % 2;
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Intrinsics.checkNotNullExpressionValue(sSLContext, "");
        int i14 = f52245c;
        int i15 = i14 & 79;
        int i16 = -(-((i14 ^ 79) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f52246d = i17 % 128;
        if (i17 % 2 != 0) {
            return sSLContext;
        }
        throw null;
    }

    public void setDividerPadding(@NotNull String str, @Nullable Object obj) {
        int i10 = f52246d;
        int i11 = i10 & 35;
        int i12 = -(-((i10 ^ 35) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f52245c = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (obj == null) {
            int i15 = f52245c;
            int i16 = (i15 ^ 97) + ((i15 & 97) << 1);
            f52246d = i16 % 128;
            if (i16 % 2 == 0) {
                str = Intrinsics.stringPlus(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                int i17 = 88 / 0;
            } else {
                str = Intrinsics.stringPlus(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            }
            int i18 = f52246d;
            int i19 = i18 & 75;
            int i20 = -(-(i18 | 75));
            int i21 = (i19 & i20) + (i20 | i19);
            f52245c = i21 % 128;
            int i22 = i21 % 2;
        }
        setCompoundDrawableTintBlendMode(new Object[]{str, 5, (Throwable) obj}, 1271727973, -1271727970, 5);
        int i23 = f52245c;
        int i24 = i23 & 13;
        int i25 = ((i23 ^ 13) | i24) << 1;
        int i26 = -((i23 | 13) & (~i24));
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        f52246d = i27 % 128;
        if (i27 % 2 == 0) {
            throw null;
        }
    }

    public void setX(@NotNull SSLSocket sSLSocket, @Nullable String str, @NotNull List<yi> list) {
        int i10 = f52245c;
        int i11 = i10 | 111;
        int i12 = ((i11 << 1) - (~(-((~(i10 & 111)) & i11)))) - 1;
        f52246d = i12 % 128;
        int i13 = i12 % 2;
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        Intrinsics.checkNotNullParameter(list, "");
        int i14 = f52246d;
        int i15 = i14 & 69;
        int i16 = (i14 | 69) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f52245c = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public void setY(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int i10) throws IOException {
        int i11 = f52245c + 89;
        f52246d = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(socket, "");
            Intrinsics.checkNotNullParameter(inetSocketAddress, "");
            socket.connect(inetSocketAddress, i10);
            throw null;
        }
        Intrinsics.checkNotNullParameter(socket, "");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "");
        socket.connect(inetSocketAddress, i10);
        int i12 = f52246d;
        int i13 = i12 & 111;
        int i14 = (i13 - (~(-(-((i12 ^ 111) | i13))))) - 1;
        f52245c = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 76 / 0;
        }
    }

    @NotNull
    public String toString() {
        int i10 = f52245c;
        int i11 = i10 & 59;
        int i12 = (i11 - (~((i10 ^ 59) | i11))) - 1;
        f52246d = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(getClass().getSimpleName(), "");
            throw null;
        }
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName;
    }

    @Nullable
    public String setX(@NotNull SSLSocket sSLSocket) {
        int i10 = f52246d + 96;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f52245c = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(sSLSocket, "");
        int i13 = f52246d;
        int i14 = ((i13 ^ 88) + ((i13 & 88) << 1)) - 1;
        f52245c = i14 % 128;
        int i15 = i14 % 2;
        return null;
    }

    @Nullable
    public Object setX(@NotNull String str) {
        int i10 = f52246d;
        int i11 = ((-1) << 1) - ((((i10 | 102) << 1) - (i10 ^ 102)) ^ (-1));
        f52245c = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (f52244b.isLoggable(Level.FINE)) {
            Throwable th2 = new Throwable(str);
            int i13 = f52245c + 59;
            f52246d = i13 % 128;
            int i14 = i13 % 2;
            return th2;
        }
        int i15 = f52245c;
        int i16 = ((((i15 ^ 31) | (i15 & 31)) << 1) - (~(-(((~i15) & 31) | (i15 & (-32)))))) - 1;
        f52246d = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    public boolean setY(@NotNull String str) {
        int i10 = f52245c;
        int i11 = i10 & 57;
        int i12 = (i10 ^ 57) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        f52246d = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        int i15 = f52246d;
        int i16 = (i15 & 106) + (i15 | 106);
        int i17 = (i16 ^ (-1)) + (i16 << 1);
        f52245c = i17 % 128;
        if (i17 % 2 == 0) {
            return true;
        }
        throw null;
    }

    @NotNull
    public abo setDividerPadding(@NotNull X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "");
        abm abmVar = new abm(setY(x509TrustManager));
        int i10 = f52246d;
        int i11 = ((i10 | 101) << 1) - (i10 ^ 101);
        f52245c = i11 % 128;
        int i12 = i11 % 2;
        return abmVar;
    }

    @NotNull
    public abt setY(@NotNull X509TrustManager x509TrustManager) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "");
        abl ablVar = new abl((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
        int i10 = f52246d + 19;
        f52245c = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 28 / 0;
        }
        return ablVar;
    }

    @NotNull
    public X509TrustManager setCompoundDrawableTintBlendMode() throws NoSuchAlgorithmException, KeyStoreException {
        int i10 = f52246d + 67;
        f52245c = i10 % 128;
        int i11 = i10 % 2;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Intrinsics.checkNotNull(trustManagers);
        if (trustManagers.length == 1) {
            int i12 = f52246d;
            int i13 = i12 | 41;
            int i14 = i13 << 1;
            int i15 = -((~(i12 & 41)) & i13);
            int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
            int i17 = i16 % 128;
            f52245c = i17;
            if (i16 % 2 == 0 ? (trustManagers[0] instanceof X509TrustManager) : (trustManagers[1] instanceof X509TrustManager)) {
                int i18 = i17 & 35;
                int i19 = -(-((i17 ^ 35) | i18));
                int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
                f52246d = i20 % 128;
                int i21 = i20 % 2;
                TrustManager trustManager = trustManagers[0];
                if (trustManager == null) {
                    throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                int i22 = ((((i17 ^ 57) | (i17 & 57)) << 1) - (~(-(((~i17) & 57) | (i17 & (-58)))))) - 1;
                f52246d = i22 % 128;
                if (i22 % 2 == 0) {
                    int i23 = 62 / 0;
                }
                return x509TrustManager;
            }
        }
        int i24 = f52245c;
        int i25 = i24 & 63;
        int i26 = (i24 | 63) & (~i25);
        int i27 = -(-(i25 << 1));
        int i28 = ((i26 | i27) << 1) - (i26 ^ i27);
        f52246d = i28 % 128;
        int i29 = i28 % 2;
        String string = Arrays.toString(trustManagers);
        Intrinsics.checkNotNullExpressionValue(string, "");
        throw new IllegalStateException(Intrinsics.stringPlus("Unexpected default trust managers: ", string).toString());
    }

    public void setCompoundDrawableTintBlendMode(@NotNull SSLSocket sSLSocket) {
        int i10 = f52246d;
        int i11 = i10 & 95;
        int i12 = i11 + ((i10 ^ 95) | i11);
        f52245c = i12 % 128;
        if (i12 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
        } else {
            Intrinsics.checkNotNullParameter(sSLSocket, "");
            int i13 = 35 / 0;
        }
    }

    @NotNull
    public SSLSocketFactory setCompoundDrawableTintBlendMode(@NotNull X509TrustManager x509TrustManager) {
        SSLSocketFactory socketFactory;
        int i10 = f52246d + 105;
        f52245c = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(x509TrustManager, "");
                SSLContext sSLContextE_ = e_();
                TrustManager[] trustManagerArr = new TrustManager[1];
                trustManagerArr[1] = x509TrustManager;
                sSLContextE_.init(null, trustManagerArr, null);
                socketFactory = sSLContextE_.getSocketFactory();
            } else {
                Intrinsics.checkNotNullParameter(x509TrustManager, "");
                SSLContext sSLContextE_2 = e_();
                sSLContextE_2.init(null, new TrustManager[]{x509TrustManager}, null);
                socketFactory = sSLContextE_2.getSocketFactory();
            }
            Intrinsics.checkNotNullExpressionValue(socketFactory, "");
            int i11 = f52246d;
            int i12 = (i11 | 111) << 1;
            int i13 = -(((~i11) & 111) | (i11 & (-112)));
            int i14 = (i12 & i13) + (i13 | i12);
            f52245c = i14 % 128;
            int i15 = i14 % 2;
            return socketFactory;
        } catch (GeneralSecurityException e5) {
            throw new AssertionError(Intrinsics.stringPlus("No System TLS: ", e5), e5);
        }
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull String str, int i10, @Nullable Throwable th2) {
        setCompoundDrawableTintBlendMode(new Object[]{str, Integer.valueOf(i10), th2}, 1271727973, -1271727970, i10);
    }
}
