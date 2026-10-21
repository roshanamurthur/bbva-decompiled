package com.mypinpad.tsdk.isolation;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/abo;", "", "", "Ljava/security/cert/Certificate;", "p0", "", "p1", "setDividerPadding", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "<init>", "()V", "setX"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class abo {

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abo$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/abo$setX;", "", "Ljavax/net/ssl/X509TrustManager;", "p0", "Lcom/mypinpad/tsdk/i/abo;", "setDividerPadding", "(Ljavax/net/ssl/X509TrustManager;)Lcom/mypinpad/tsdk/i/abo;", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            X509TrustManager x509TrustManager = (X509TrustManager) objArr[0];
            Intrinsics.checkNotNullParameter(x509TrustManager, "");
            aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
            return ((aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis())).setDividerPadding(x509TrustManager);
        }

        @NotNull
        public static abo setDividerPadding(@NotNull X509TrustManager p4) {
            return (abo) setCompoundDrawableTintBlendMode(new Object[]{p4}, -1947548204, 1947548204, (int) System.currentTimeMillis());
        }
    }

    static {
        int i10 = 87 % 128;
        int i11 = 87 % 2;
    }

    @NotNull
    public abstract List<Certificate> setDividerPadding(@NotNull List<? extends Certificate> p4, @NotNull String p10) throws SSLPeerUnverifiedException;
}
