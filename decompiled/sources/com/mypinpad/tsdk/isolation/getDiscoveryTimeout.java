package com.mypinpad.tsdk.isolation;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/getDiscoveryTimeout;", "Ljava/security/SecureRandom;", "Ljava/security/SecureRandomSpi;", "p0", "Ljava/security/Provider;", "p1", "<init>", "(Ljava/security/SecureRandomSpi;Ljava/security/Provider;)V", "setX"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getDiscoveryTimeout extends SecureRandom {

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    static {
        setCompoundDrawableTintBlendMode();
        KeyEvent.keyCodeFromString("");
        ViewConfiguration.getJumpTapTimeout();
        INSTANCE = new Companion(null);
        int i10 = 77 % 128;
        int i11 = 77 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getDiscoveryTimeout(@NotNull SecureRandomSpi secureRandomSpi, @NotNull Provider provider) {
        super(secureRandomSpi, provider);
        Intrinsics.checkNotNullParameter(secureRandomSpi, "");
        Intrinsics.checkNotNullParameter(provider, "");
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getDiscoveryTimeout$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/getDiscoveryTimeout$setX;", "", "Lcom/mypinpad/tsdk/i/setTextSelectHandleLeft;", "p0", "Lcom/mypinpad/tsdk/i/getDiscoveryTimeout;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setTextSelectHandleLeft;)Lcom/mypinpad/tsdk/i/getDiscoveryTimeout;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            setTextSelectHandleLeft settextselecthandleleft = (setTextSelectHandleLeft) objArr[0];
            Intrinsics.checkNotNullParameter(settextselecthandleleft, "");
            return new getDiscoveryTimeout(new x8(settextselecthandleleft), t8.f60993p0);
        }

        @NotNull
        public static getDiscoveryTimeout setCompoundDrawableTintBlendMode(@NotNull setTextSelectHandleLeft p4) {
            return (getDiscoveryTimeout) setCompoundDrawableTintBlendMode(new Object[]{p4}, 423056054, -423056054, (int) System.currentTimeMillis());
        }
    }

    public static void setCompoundDrawableTintBlendMode() {
    }
}
