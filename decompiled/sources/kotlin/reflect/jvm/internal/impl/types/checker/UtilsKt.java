package kotlin.reflect.jvm.internal.impl.types.checker;

import il.a;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n1747#2,3:109\n*S KotlinDebug\n*F\n+ 1 utils.kt\norg/jetbrains/kotlin/types/checker/UtilsKt\n*L\n51#1:109,3\n*E\n"})
public final class UtilsKt {
    public static final String a(TypeConstructor typeConstructor) {
        StringBuilder sb2 = new StringBuilder();
        b("type: " + typeConstructor, sb2);
        b("hashCode: " + typeConstructor.hashCode(), sb2);
        b("javaClass: " + typeConstructor.getClass().getCanonicalName(), sb2);
        for (DeclarationDescriptor declarationDescriptorMo5778getDeclarationDescriptor = typeConstructor.mo5778getDeclarationDescriptor(); declarationDescriptorMo5778getDeclarationDescriptor != null; declarationDescriptorMo5778getDeclarationDescriptor = declarationDescriptorMo5778getDeclarationDescriptor.getContainingDeclaration()) {
            b("fqName: " + DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptorMo5778getDeclarationDescriptor), sb2);
            b("javaClass: " + declarationDescriptorMo5778getDeclarationDescriptor.getClass().getCanonicalName(), sb2);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final void b(String str, StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        sb2.append(str);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
    }

    @Nullable
    public static final KotlinType findCorrespondingSupertype(@NotNull KotlinType subtype, @NotNull KotlinType supertype, @NotNull TypeCheckingProcedureCallbacks typeCheckingProcedureCallbacks) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        Intrinsics.checkNotNullParameter(typeCheckingProcedureCallbacks, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new a(subtype, null));
        TypeConstructor constructor = supertype.getConstructor();
        while (!arrayDeque.isEmpty()) {
            a aVar = (a) arrayDeque.poll();
            KotlinType type = aVar.getType();
            TypeConstructor constructor2 = type.getConstructor();
            if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = type.isMarkedNullable();
                for (a previous = aVar.getPrevious(); previous != null; previous = previous.getPrevious()) {
                    KotlinType type2 = previous.getType();
                    List<TypeProjection> arguments = type2.getArguments();
                    if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                        Iterator<T> it = arguments.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                type = TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                                Intrinsics.checkNotNull(type);
                                break;
                            }
                            Variance projectionKind = ((TypeProjection) it.next()).getProjectionKind();
                            Variance variance = Variance.INVARIANT;
                            if (projectionKind != variance) {
                                KotlinType kotlinTypeSafeSubstitute = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(TypeConstructorSubstitution.Companion.create(type2), false, 1, null).buildSubstitutor().safeSubstitute(type, variance);
                                Intrinsics.checkNotNullExpressionValue(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
                                type = CapturedTypeApproximationKt.approximateCapturedTypes(kotlinTypeSafeSubstitute).getUpper();
                                break;
                            }
                        }
                    } else {
                        type = TypeConstructorSubstitution.Companion.create(type2).buildSubstitutor().safeSubstitute(type, Variance.INVARIANT);
                        Intrinsics.checkNotNull(type);
                        break;
                    }
                    zIsMarkedNullable = zIsMarkedNullable || type2.isMarkedNullable();
                }
                TypeConstructor constructor3 = type.getConstructor();
                if (typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor)) {
                    return TypeUtils.makeNullableAsSpecified(type, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + a(constructor3) + ", \n\nsupertype: " + a(constructor) + " \n" + typeCheckingProcedureCallbacks.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (KotlinType kotlinType : constructor2.getSupertypes()) {
                Intrinsics.checkNotNull(kotlinType);
                arrayDeque.add(new a(kotlinType, aVar));
            }
        }
        return null;
    }
}
