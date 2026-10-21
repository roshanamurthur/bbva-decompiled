package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformLocale.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "a", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "getPlatformLocaleDelegate", "()Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "platformLocaleDelegate", "ui-text_release"}, k = 2, mv = {1, 8, 0})
public final class PlatformLocaleKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PlatformLocaleDelegate f18178a = AndroidPlatformLocale_androidKt.createPlatformLocaleDelegate();

    @NotNull
    public static final PlatformLocaleDelegate getPlatformLocaleDelegate() {
        return f18178a;
    }
}
