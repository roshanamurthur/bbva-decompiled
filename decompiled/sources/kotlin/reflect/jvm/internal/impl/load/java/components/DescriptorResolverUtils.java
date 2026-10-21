package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xk.a;

/* JADX INFO: loaded from: classes12.dex */
public final class DescriptorResolverUtils {
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    @NotNull
    public static LinkedHashSet b(@NotNull Name name, @NotNull Collection collection, @NotNull Collection collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil, boolean z10) {
        if (name == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (classDescriptor == null) {
            a(15);
            throw null;
        }
        if (errorReporter == null) {
            a(16);
            throw null;
        }
        if (overridingUtil == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        overridingUtil.generateOverridesInFunctionGroup(name, collection, collection2, classDescriptor, new a(errorReporter, linkedHashSet, z10));
        return linkedHashSet;
    }

    @Nullable
    public static ValueParameterDescriptor getAnnotationParameterByName(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        if (name == null) {
            a(19);
            throw null;
        }
        if (classDescriptor == null) {
            a(20);
            throw null;
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (ValueParameterDescriptor valueParameterDescriptor : constructors.iterator().next().getValueParameters()) {
            if (valueParameterDescriptor.getName().equals(name)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForNonStaticMembers(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil) {
        if (name == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(1);
            throw null;
        }
        if (collection2 == null) {
            a(2);
            throw null;
        }
        if (classDescriptor == null) {
            a(3);
            throw null;
        }
        if (errorReporter == null) {
            a(4);
            throw null;
        }
        if (overridingUtil != null) {
            return b(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, false);
        }
        a(5);
        throw null;
    }

    @NotNull
    public static <D extends CallableMemberDescriptor> Collection<D> resolveOverridesForStaticMembers(@NotNull Name name, @NotNull Collection<D> collection, @NotNull Collection<D> collection2, @NotNull ClassDescriptor classDescriptor, @NotNull ErrorReporter errorReporter, @NotNull OverridingUtil overridingUtil) {
        if (name == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (collection2 == null) {
            a(8);
            throw null;
        }
        if (classDescriptor == null) {
            a(9);
            throw null;
        }
        if (errorReporter == null) {
            a(10);
            throw null;
        }
        if (overridingUtil != null) {
            return b(name, collection, collection2, classDescriptor, errorReporter, overridingUtil, true);
        }
        a(11);
        throw null;
    }
}
