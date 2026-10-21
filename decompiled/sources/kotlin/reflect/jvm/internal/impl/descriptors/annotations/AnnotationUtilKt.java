package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import bk.q;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: annotationUtil.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class AnnotationUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Name f80243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Name f80244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Name f80245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Name f80246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Name f80247e;

    /* JADX INFO: compiled from: annotationUtil.kt */
    public static final class a extends Lambda implements Function1<ModuleDescriptor, KotlinType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KotlinBuiltIns f80248p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KotlinBuiltIns kotlinBuiltIns) {
            super(1);
            this.f80248p0 = kotlinBuiltIns;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final KotlinType invoke(@NotNull ModuleDescriptor module) {
            Intrinsics.checkNotNullParameter(module, "module");
            SimpleType arrayType = module.getBuiltIns().getArrayType(Variance.INVARIANT, this.f80248p0.getStringType());
            Intrinsics.checkNotNullExpressionValue(arrayType, "getArrayType(...)");
            return arrayType;
        }
    }

    static {
        Name nameIdentifier = Name.identifier("message");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        f80243a = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("replaceWith");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        f80244b = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("level");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        f80245c = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("expression");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        f80246d = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("imports");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        f80247e = nameIdentifier5;
    }

    @NotNull
    public static final AnnotationDescriptor createDeprecatedAnnotation(@NotNull KotlinBuiltIns kotlinBuiltIns, @NotNull String message, @NotNull String replaceWith, @NotNull String level, boolean z10) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(kotlinBuiltIns, StandardNames.FqNames.replaceWith, q.mapOf(TuplesKt.to(f80246d, new StringValue(replaceWith)), TuplesKt.to(f80247e, new ArrayValue(CollectionsKt__CollectionsKt.emptyList(), new a(kotlinBuiltIns)))), false, 8, null);
        FqName fqName = StandardNames.FqNames.deprecated;
        StringValue stringValue = new StringValue(message);
        AnnotationValue annotationValue = new AnnotationValue(builtInAnnotationDescriptor);
        ClassId classId = ClassId.topLevel(StandardNames.FqNames.deprecationLevel);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        Name nameIdentifier = Name.identifier(level);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new BuiltInAnnotationDescriptor(kotlinBuiltIns, fqName, q.mapOf(TuplesKt.to(f80243a, stringValue), TuplesKt.to(f80244b, annotationValue), TuplesKt.to(f80245c, new EnumValue(classId, nameIdentifier))), z10);
    }

    public static /* synthetic */ AnnotationDescriptor createDeprecatedAnnotation$default(KotlinBuiltIns kotlinBuiltIns, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return createDeprecatedAnnotation(kotlinBuiltIns, str, str2, str3, z10);
    }
}
