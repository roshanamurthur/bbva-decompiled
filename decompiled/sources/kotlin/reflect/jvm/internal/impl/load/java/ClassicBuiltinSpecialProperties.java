package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ClassicBuiltinSpecialProperties.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1747#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
public final class ClassicBuiltinSpecialProperties {

    @NotNull
    public static final ClassicBuiltinSpecialProperties INSTANCE = new ClassicBuiltinSpecialProperties();

    /* JADX INFO: compiled from: ClassicBuiltinSpecialProperties.kt */
    public static final class a extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80492p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(it));
        }
    }

    @Nullable
    public final String getBuiltinSpecialPropertyGetterName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor), false, a.f80492p0, 1, null);
        if (callableMemberDescriptorFirstOverridden$default == null || (name = BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(callableMemberDescriptorFirstOverridden$default))) == null) {
            return null;
        }
        return name.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        BuiltinSpecialProperties builtinSpecialProperties = BuiltinSpecialProperties.INSTANCE;
        if (!builtinSpecialProperties.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (!CollectionsKt___CollectionsKt.contains(builtinSpecialProperties.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor)) || !callableMemberDescriptor.getValueParameters().isEmpty()) {
            if (!KotlinBuiltIns.isBuiltIn(callableMemberDescriptor)) {
                return false;
            }
            Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
            Collection<? extends CallableMemberDescriptor> collection = overriddenDescriptors;
            if (collection.isEmpty()) {
                return false;
            }
            for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = INSTANCE;
                Intrinsics.checkNotNull(callableMemberDescriptor2);
                if (classicBuiltinSpecialProperties.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor2)) {
                }
            }
            return false;
        }
        return true;
    }
}
