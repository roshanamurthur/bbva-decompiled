package il;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d extends FunctionReference implements Function2<KotlinType, KotlinType, Boolean> {
    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "isStrictSupertype";
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(TypeIntersector.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public final Boolean invoke(@NotNull KotlinType p4, @NotNull KotlinType p10) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        Intrinsics.checkNotNullParameter(p10, "p1");
        return Boolean.valueOf(TypeIntersector.access$isStrictSupertype((TypeIntersector) this.receiver, p4, p10));
    }
}
