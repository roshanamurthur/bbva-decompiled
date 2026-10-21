package k3;

import androidx.window.core.FailedSpecification;
import androidx.window.core.Logger;
import androidx.window.core.SpecificationComputer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends SpecificationComputer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f79182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f79183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SpecificationComputer.VerificationMode f79184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Logger f79185d;

    public a(@NotNull T value, @NotNull String tag, @NotNull SpecificationComputer.VerificationMode verificationMode, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f79182a = value;
        this.f79183b = tag;
        this.f79184c = verificationMode;
        this.f79185d = logger;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public final T compute() {
        return this.f79182a;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public final SpecificationComputer<T> require(@NotNull String message, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return condition.invoke(this.f79182a).booleanValue() ? this : new FailedSpecification(this.f79182a, this.f79183b, message, this.f79185d, this.f79184c);
    }
}
