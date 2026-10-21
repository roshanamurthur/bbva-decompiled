package kotlin.reflect.jvm.internal.impl.util;

import androidx.camera.core.processing.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class ReturnsCheck implements Check {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<KotlinBuiltIns, KotlinType> f82084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f82085b;

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {

        @NotNull
        public static final ReturnsBoolean INSTANCE = new ReturnsBoolean();

        /* JADX INFO: compiled from: modifierChecks.kt */
        public static final class a extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f82086p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType booleanType = kotlinBuiltIns.getBooleanType();
                Intrinsics.checkNotNullExpressionValue(booleanType, "getBooleanType(...)");
                return booleanType;
            }
        }

        public ReturnsBoolean() {
            super("Boolean", a.f82086p0, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {

        @NotNull
        public static final ReturnsInt INSTANCE = new ReturnsInt();

        /* JADX INFO: compiled from: modifierChecks.kt */
        public static final class a extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f82087p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType intType = kotlinBuiltIns.getIntType();
                Intrinsics.checkNotNullExpressionValue(intType, "getIntType(...)");
                return intType;
            }
        }

        public ReturnsInt() {
            super("Int", a.f82087p0, null);
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {

        @NotNull
        public static final ReturnsUnit INSTANCE = new ReturnsUnit();

        /* JADX INFO: compiled from: modifierChecks.kt */
        public static final class a extends Lambda implements Function1<KotlinBuiltIns, KotlinType> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f82088p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final KotlinType invoke(@NotNull KotlinBuiltIns kotlinBuiltIns) {
                Intrinsics.checkNotNullParameter(kotlinBuiltIns, "$this$null");
                SimpleType unitType = kotlinBuiltIns.getUnitType();
                Intrinsics.checkNotNullExpressionValue(unitType, "getUnitType(...)");
                return unitType;
            }
        }

        public ReturnsUnit() {
            super("Unit", a.f82088p0, null);
        }
    }

    public ReturnsCheck() {
        throw null;
    }

    public ReturnsCheck(String str, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this.f82084a = function1;
        this.f82085b = f.d("must return ", str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Intrinsics.areEqual(functionDescriptor.getReturnType(), this.f82084a.invoke(DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f82085b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    public String invoke(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.invoke(this, functionDescriptor);
    }
}
