package s1;

import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final State<Object> f93138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final d f93139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f93140c;

    public d(@NotNull State<? extends Object> resolveResult, @Nullable d dVar) {
        Intrinsics.checkNotNullParameter(resolveResult, "resolveResult");
        this.f93138a = resolveResult;
        this.f93139b = dVar;
        this.f93140c = resolveResult.getValue();
    }

    public final boolean a() {
        d dVar;
        return this.f93138a.getValue() != this.f93140c || ((dVar = this.f93139b) != null && dVar.a());
    }
}
