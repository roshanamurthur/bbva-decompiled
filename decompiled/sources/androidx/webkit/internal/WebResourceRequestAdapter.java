package androidx.webkit.internal;

import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* JADX INFO: loaded from: classes2.dex */
public class WebResourceRequestAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebResourceRequestBoundaryInterface f24079a;

    public WebResourceRequestAdapter(@NonNull WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f24079a = webResourceRequestBoundaryInterface;
    }

    public boolean isRedirect() {
        return this.f24079a.isRedirect();
    }
}
