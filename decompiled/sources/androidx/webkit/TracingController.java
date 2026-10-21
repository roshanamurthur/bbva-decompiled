package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.webkit.internal.TracingControllerImpl;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TracingController {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TracingControllerImpl f24029a = new TracingControllerImpl();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TracingController() {
    }

    @NonNull
    public static TracingController getInstance() {
        return a.f24029a;
    }

    public abstract boolean isTracing();

    public abstract void start(@NonNull TracingConfig tracingConfig);

    public abstract boolean stop(@Nullable OutputStream outputStream, @NonNull Executor executor);
}
