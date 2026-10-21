package kotlin.reflect.jvm.internal.impl.types.error;

import ai.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ErrorTypeConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ErrorTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ErrorTypeKind f82044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String[] f82045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f82046c;

    public ErrorTypeConstructor(@NotNull ErrorTypeKind kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.f82044a = kind;
        this.f82045b = formatParams;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.f82046c = a.i(new Object[]{a.i(objArrCopyOf, objArrCopyOf.length, debugMessage, "format(...)")}, 1, debugText, "format(...)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return DefaultBuiltIns.Companion.getInstance();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo5778getDeclarationDescriptor() {
        return ErrorUtils.INSTANCE.getErrorClass();
    }

    @NotNull
    public final ErrorTypeKind getKind() {
        return this.f82044a;
    }

    @NotNull
    public final String getParam(int i10) {
        return this.f82045b[i10];
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public String toString() {
        return this.f82046c;
    }
}
