package com.bbva.ethermobilesdk.securesharing.config;

import androidx.camera.camera2.internal.h0;
import androidx.datastore.preferences.protobuf.q;
import androidx.room.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;", "", "Companion", "Signature", "Fingerprint", "SignatureFingerprint", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class SecurityLevel {
    private static final /* synthetic */ SecurityLevel[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SecurityLevel Fingerprint;
    public static final SecurityLevel Signature;
    public static final SecurityLevel SignatureFingerprint;

    /* JADX INFO: compiled from: Configuration.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel$Companion;", "", "()V", "from", "Lcom/bbva/ethermobilesdk/securesharing/config/SecurityLevel;", "name", "", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SecurityLevel from(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Locale locale = Locale.ROOT;
            String strD = a.d(locale, "ROOT", name, locale, "(this as java.lang.String).toLowerCase(locale)");
            int iHashCode = strD.hashCode();
            if (iHashCode != -1375934236) {
                if (iHashCode != 1073584312) {
                    if (iHashCode == 1857896271 && strD.equals("signature-fingerprint")) {
                        return SecurityLevel.SignatureFingerprint;
                    }
                } else if (strD.equals("signature")) {
                    return SecurityLevel.Signature;
                }
            } else if (strD.equals("fingerprint")) {
                return SecurityLevel.Fingerprint;
            }
            throw q.d(h0.b("Could not find a valid security level for [", name, "] value"), null, 2, null);
        }
    }

    static {
        SecurityLevel securityLevel = new SecurityLevel("Signature", 0);
        Signature = securityLevel;
        SecurityLevel securityLevel2 = new SecurityLevel("Fingerprint", 1);
        Fingerprint = securityLevel2;
        SecurityLevel securityLevel3 = new SecurityLevel("SignatureFingerprint", 2);
        SignatureFingerprint = securityLevel3;
        $VALUES = new SecurityLevel[]{securityLevel, securityLevel2, securityLevel3};
        INSTANCE = new Companion(null);
    }

    public SecurityLevel() {
        throw null;
    }

    public static SecurityLevel valueOf(String str) {
        return (SecurityLevel) Enum.valueOf(SecurityLevel.class, str);
    }

    public static SecurityLevel[] values() {
        return (SecurityLevel[]) $VALUES.clone();
    }
}
