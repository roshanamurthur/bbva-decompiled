package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class VisualStateCallbackAdapter implements VisualStateCallbackBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewCompat.VisualStateCallback f24071a;

    public VisualStateCallbackAdapter(@NonNull WebViewCompat.VisualStateCallback visualStateCallback) {
        this.f24071a = visualStateCallback;
    }

    @Override // org.chromium.support_lib_boundary.VisualStateCallbackBoundaryInterface
    public void onComplete(long j10) {
        this.f24071a.onComplete(j10);
    }
}
