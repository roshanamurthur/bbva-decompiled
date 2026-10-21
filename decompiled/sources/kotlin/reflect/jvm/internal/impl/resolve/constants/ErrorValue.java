package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ErrorValue create(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ErrorValueWithMessage(message);
        }
    }

    /* JADX INFO: compiled from: constantValues.kt */
    public static final class ErrorValueWithMessage extends ErrorValue {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f81546b;

        public ErrorValueWithMessage(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.f81546b = message;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        public String toString() {
            return this.f81546b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        public ErrorType getType(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            return ErrorUtils.createErrorType(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f81546b);
        }
    }

    public ErrorValue() {
        super(Unit.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public Unit getValue() {
        throw new UnsupportedOperationException();
    }
}
