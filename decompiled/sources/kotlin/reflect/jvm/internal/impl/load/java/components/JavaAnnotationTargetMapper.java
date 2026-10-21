package kotlin.reflect.jvm.internal.impl.load.java.components;

import bk.g;
import bk.q;
import bk.w;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n800#2,11:183\n1360#2:194\n1446#2,5:195\n1549#2:200\n1620#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
public final class JavaAnnotationTargetMapper {

    @NotNull
    public static final JavaAnnotationTargetMapper INSTANCE = new JavaAnnotationTargetMapper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<String, EnumSet<KotlinTarget>> f80578a = q.mapOf(TuplesKt.to("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), TuplesKt.to(ConstantsKt.TYPE, EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), TuplesKt.to("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), TuplesKt.to("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), TuplesKt.to("FIELD", EnumSet.of(KotlinTarget.FIELD)), TuplesKt.to("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), TuplesKt.to("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), TuplesKt.to("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), TuplesKt.to("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), TuplesKt.to("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, KotlinRetention> f80579b = q.mapOf(TuplesKt.to("RUNTIME", KotlinRetention.RUNTIME), TuplesKt.to("CLASS", KotlinRetention.BINARY), TuplesKt.to("SOURCE", KotlinRetention.SOURCE));

    /* JADX INFO: compiled from: JavaAnnotationMapper.kt */
    public static final class a extends Lambda implements Function1<ModuleDescriptor, KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80580p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), module.getBuiltIns().getBuiltInClassByFqName(StandardNames.FqNames.target));
            KotlinType type = annotationParameterByName != null ? annotationParameterByName.getType() : null;
            return type == null ? ErrorUtils.createErrorType(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
        }
    }

    @Nullable
    public final ConstantValue<?> mapJavaRetentionArgument$descriptors_jvm(@Nullable JavaAnnotationArgument javaAnnotationArgument) {
        JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
        if (javaEnumValueAnnotationArgument == null) {
            return null;
        }
        Name entryName = javaEnumValueAnnotationArgument.getEntryName();
        KotlinRetention kotlinRetention = f80579b.get(entryName != null ? entryName.asString() : null);
        if (kotlinRetention == null) {
            return null;
        }
        ClassId classId = ClassId.topLevel(StandardNames.FqNames.annotationRetention);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        Name nameIdentifier = Name.identifier(kotlinRetention.name());
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new EnumValue(classId, nameIdentifier);
    }

    @NotNull
    public final Set<KotlinTarget> mapJavaTargetArgumentByName(@Nullable String str) {
        EnumSet<KotlinTarget> enumSet = f80578a.get(str);
        return enumSet != null ? enumSet : w.emptySet();
    }

    @NotNull
    public final ConstantValue<?> mapJavaTargetArguments$descriptors_jvm(@NotNull List<? extends JavaAnnotationArgument> arguments) {
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        ArrayList<JavaEnumValueAnnotationArgument> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof JavaEnumValueAnnotationArgument) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument : arrayList) {
            JavaAnnotationTargetMapper javaAnnotationTargetMapper = INSTANCE;
            Name entryName = javaEnumValueAnnotationArgument.getEntryName();
            g.addAll(arrayList2, javaAnnotationTargetMapper.mapJavaTargetArgumentByName(entryName != null ? entryName.asString() : null));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            ClassId classId = ClassId.topLevel(StandardNames.FqNames.annotationTarget);
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
            Name nameIdentifier = Name.identifier(kotlinTarget.name());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            arrayList3.add(new EnumValue(classId, nameIdentifier));
        }
        return new ArrayValue(arrayList3, a.f80580p0);
    }
}
