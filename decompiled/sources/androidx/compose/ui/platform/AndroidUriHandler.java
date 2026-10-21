package androidx.compose.ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidUriHandler.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "", "uri", "", "openUri", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f17139a;

    public AndroidUriHandler(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f17139a = context;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public void openUri(@NotNull String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f17139a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
    }
}
