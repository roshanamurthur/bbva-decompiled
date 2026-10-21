package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nconstantValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 constantValues.kt\norg/jetbrains/kotlin/resolve/constants/EnumValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ClassId f81544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Name f81545c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(@NotNull ClassId enumClassId, @NotNull Name enumEntryName) {
        super(TuplesKt.to(enumClassId, enumEntryName));
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        this.f81544b = enumClassId;
        this.f81545c = enumEntryName;
    }

    @NotNull
    public final Name getEnumEntryName() {
        return this.f81545c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        ClassId classId = this.f81544b;
        ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, classId);
        SimpleType defaultType = null;
        if (classDescriptorFindClassAcrossModuleDependencies != null) {
            if (!DescriptorUtils.isEnumClass(classDescriptorFindClassAcrossModuleDependencies)) {
                classDescriptorFindClassAcrossModuleDependencies = null;
            }
            if (classDescriptorFindClassAcrossModuleDependencies != null) {
                defaultType = classDescriptorFindClassAcrossModuleDependencies.getDefaultType();
            }
        }
        if (defaultType != null) {
            return defaultType;
        }
        ErrorTypeKind errorTypeKind = ErrorTypeKind.ERROR_ENUM_TYPE;
        String string = classId.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String string2 = this.f81545c.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return ErrorUtils.createErrorType(errorTypeKind, string, string2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f81544b.getShortClassName());
        sb2.append('.');
        sb2.append(this.f81545c);
        return sb2.toString();
    }
}
