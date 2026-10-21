package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuiltInAnnotationDescriptor.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KotlinBuiltIns f80252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FqName f80253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<Name, ConstantValue<?>> f80254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f80255d;

    /* JADX INFO: compiled from: BuiltInAnnotationDescriptor.kt */
    public static final class a extends Lambda implements Function0<SimpleType> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleType invoke() {
            BuiltInAnnotationDescriptor builtInAnnotationDescriptor = BuiltInAnnotationDescriptor.this;
            return builtInAnnotationDescriptor.f80252a.getBuiltInClassByFqName(builtInAnnotationDescriptor.getFqName()).getDefaultType();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BuiltInAnnotationDescriptor(@NotNull KotlinBuiltIns builtIns, @NotNull FqName fqName, @NotNull Map<Name, ? extends ConstantValue<?>> allValueArguments, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f80252a = builtIns;
        this.f80253b = fqName;
        this.f80254c = allValueArguments;
        this.f80255d = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return this.f80254c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.f80253b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        Object value = this.f80255d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (KotlinType) value;
    }

    public /* synthetic */ BuiltInAnnotationDescriptor(KotlinBuiltIns kotlinBuiltIns, FqName fqName, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinBuiltIns, fqName, map, (i10 & 8) != 0 ? false : z10);
    }
}
