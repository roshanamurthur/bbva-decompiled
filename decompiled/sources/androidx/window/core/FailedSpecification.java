package androidx.window.core;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FailedSpecification<T> extends SpecificationComputer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final T f24105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f24106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f24107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Logger f24108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SpecificationComputer.VerificationMode f24109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final WindowStrictModeException f24110f;

    /* JADX INFO: compiled from: SpecificationComputer.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(@NotNull T value, @NotNull String tag, @NotNull String message, @NotNull Logger logger, @NotNull SpecificationComputer.VerificationMode verificationMode) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.f24105a = value;
        this.f24106b = tag;
        this.f24107c = message;
        this.f24108d = logger;
        this.f24109e = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        Object[] array = ArraysKt___ArraysKt.drop(stackTrace, 2).toArray(new StackTraceElement[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) array);
        this.f24110f = windowStrictModeException;
    }

    @Override // androidx.window.core.SpecificationComputer
    @Nullable
    public final T compute() throws WindowStrictModeException {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.f24109e.ordinal()];
        if (i10 == 1) {
            throw this.f24110f;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        this.f24108d.debug(this.f24106b, createMessage(this.f24105a, this.f24107c));
        return null;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public final SpecificationComputer<T> require(@NotNull String message, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
