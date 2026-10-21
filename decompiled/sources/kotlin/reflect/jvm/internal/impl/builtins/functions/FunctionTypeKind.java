package kotlin.reflect.jvm.internal.impl.builtins.functions;

import com.mypinpad.tsdk.isolation.y2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FunctionTypeKind.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class FunctionTypeKind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FqName f80126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f80127b;

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class Function extends FunctionTypeKind {

        @NotNull
        public static final Function INSTANCE = new Function();

        public Function() {
            super(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null);
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class KFunction extends FunctionTypeKind {

        @NotNull
        public static final KFunction INSTANCE = new KFunction();

        public KFunction() {
            super(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null);
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class KSuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final KSuspendFunction INSTANCE = new KSuspendFunction();

        public KSuspendFunction() {
            super(StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null);
        }
    }

    /* JADX INFO: compiled from: FunctionTypeKind.kt */
    public static final class SuspendFunction extends FunctionTypeKind {

        @NotNull
        public static final SuspendFunction INSTANCE = new SuspendFunction();

        public SuspendFunction() {
            super(StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null);
        }
    }

    public FunctionTypeKind(@NotNull FqName packageFqName, @NotNull String classNamePrefix, boolean z10, @Nullable ClassId classId) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f80126a = packageFqName;
        this.f80127b = classNamePrefix;
    }

    @NotNull
    public final String getClassNamePrefix() {
        return this.f80127b;
    }

    @NotNull
    public final FqName getPackageFqName() {
        return this.f80126a;
    }

    @NotNull
    public final Name numberedClassName(int i10) {
        Name nameIdentifier = Name.identifier(this.f80127b + i10);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return nameIdentifier;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f80126a);
        sb2.append('.');
        return y2.b(sb2, this.f80127b, 'N');
    }
}
