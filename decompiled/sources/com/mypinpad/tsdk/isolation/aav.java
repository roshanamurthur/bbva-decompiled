package com.mypinpad.tsdk.isolation;

import android.net.http.X509TrustManagerExtensions;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/mypinpad/tsdk/i/aav;", "Lcom/mypinpad/tsdk/i/abo;", "", "Ljava/security/cert/Certificate;", "p0", "", "p1", "setDividerPadding", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "", "", "equals", "(Ljava/lang/Object;)Z", "", GenerateActivationFormCommand.HASH_CODE, "()I", "Ljavax/net/ssl/X509TrustManager;", "Landroid/net/http/X509TrustManagerExtensions;", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V"}, k = 1, mv = {1, 6, 0})
public final class aav extends abo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52237c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52238d = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X509TrustManager f52239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final X509TrustManagerExtensions f52240b;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aav$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/aav$setDividerPadding;", "", "Ljavax/net/ssl/X509TrustManager;", "p0", "Lcom/mypinpad/tsdk/i/aav;", "setCompoundDrawableTintBlendMode", "(Ljavax/net/ssl/X509TrustManager;)Lcom/mypinpad/tsdk/i/aav;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52241a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52242b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static aav setCompoundDrawableTintBlendMode(@NotNull X509TrustManager p4) {
            return (aav) setX(new Object[]{p4}, -1928241639, 1928241639, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            X509TrustManager x509TrustManager = (X509TrustManager) objArr[0];
            Intrinsics.checkNotNullParameter(x509TrustManager, "");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
                int i13 = f52241a + 25;
                f52242b = i13 % 128;
                int i14 = i13 % 2;
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                aav aavVar = new aav(x509TrustManager, x509TrustManagerExtensions);
                int i15 = f52241a;
                int i16 = i15 & 49;
                int i17 = (((i15 | 49) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
                f52242b = i17 % 128;
                if (i17 % 2 != 0) {
                    return aavVar;
                }
                throw null;
            }
            int i18 = f52242b;
            int i19 = ((i18 ^ 25) | (i18 & 25)) << 1;
            int i20 = -(((~i18) & 25) | (i18 & (-26)));
            int i21 = (i19 & i20) + (i20 | i19);
            f52241a = i21 % 128;
            if (i21 % 2 == 0) {
                return null;
            }
            throw null;
        }
    }

    static {
        int i10 = f52238d;
        int i11 = i10 & 97;
        int i12 = (i11 - (~(-(-((i10 ^ 97) | i11))))) - 1;
        f52237c = i12 % 128;
        int i13 = i12 % 2;
    }

    public aav(@NotNull X509TrustManager x509TrustManager, @NotNull X509TrustManagerExtensions x509TrustManagerExtensions) {
        Intrinsics.checkNotNullParameter(x509TrustManager, "");
        Intrinsics.checkNotNullParameter(x509TrustManagerExtensions, "");
        this.f52239a = x509TrustManager;
        this.f52240b = x509TrustManagerExtensions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a1, code lost:
    
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a5, code lost:
    
        r5 = r6.f52240b.checkServerTrusted((java.security.cert.X509Certificate[]) r8, "RSA", r5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b0, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.aav.f52237c;
        r8 = (r6 & (-2)) | ((~r6) & 1);
        r6 = -(-((r6 & 1) << 1));
        r2 = (r8 ^ r6) + ((r6 & r8) << 1);
        com.mypinpad.tsdk.isolation.aav.f52238d = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c5, code lost:
    
        if ((r2 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ca, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cb, code lost:
    
        r6 = new javax.net.ssl.SSLPeerUnverifiedException(r5.getMessage());
        r6.initCause(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d7, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00df, code lost:
    
        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0090, code lost:
    
        if (r8 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r5, int r6, int r7, int r8) throws javax.net.ssl.SSLPeerUnverifiedException {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.aav.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1251570152, 1251570153, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 664746548, -664746548, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.abo
    @NotNull
    public final List<Certificate> setDividerPadding(@NotNull List<? extends Certificate> p4, @NotNull String p10) throws SSLPeerUnverifiedException {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, -1107879237, 1107879239, System.identityHashCode(this));
    }
}
