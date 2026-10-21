package androidx.compose.ui.window;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SecureFlagPolicy.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/window/SecureFlagPolicy;", "", "Inherit", "SecureOn", "SecureOff", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class SecureFlagPolicy {
    private static final /* synthetic */ SecureFlagPolicy[] $VALUES;
    public static final SecureFlagPolicy Inherit;
    public static final SecureFlagPolicy SecureOff;
    public static final SecureFlagPolicy SecureOn;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        Inherit = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        SecureOn = secureFlagPolicy2;
        SecureFlagPolicy secureFlagPolicy3 = new SecureFlagPolicy("SecureOff", 2);
        SecureOff = secureFlagPolicy3;
        $VALUES = new SecureFlagPolicy[]{secureFlagPolicy, secureFlagPolicy2, secureFlagPolicy3};
    }

    public SecureFlagPolicy() {
        throw null;
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) $VALUES.clone();
    }
}
