package androidx.window.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WindowInfoTracker.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements WindowInfoTrackerDecorator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f24231a = new e();

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    @NotNull
    public final WindowInfoTracker decorate(@NotNull WindowInfoTracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
