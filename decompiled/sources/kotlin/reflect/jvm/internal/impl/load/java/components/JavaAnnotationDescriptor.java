package kotlin.reflect.jvm.internal.impl.load.java.components;

import bk.q;
import java.util.Collection;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public class JavaAnnotationDescriptor implements AnnotationDescriptor, PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80566f = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FqName f80567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SourceElement f80568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final JavaAnnotationArgument f80570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f80571e;

    /* JADX INFO: compiled from: JavaAnnotationMapper.kt */
    public static final class a extends Lambda implements Function0<SimpleType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaResolverContext f80572p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ JavaAnnotationDescriptor f80573q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
            super(0);
            this.f80572p0 = lazyJavaResolverContext;
            this.f80573q0 = javaAnnotationDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleType invoke() {
            SimpleType defaultType = this.f80572p0.getModule().getBuiltIns().getBuiltInClassByFqName(this.f80573q0.getFqName()).getDefaultType();
            Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
            return defaultType;
        }
    }

    public JavaAnnotationDescriptor(@NotNull LazyJavaResolverContext c10, @Nullable JavaAnnotation javaAnnotation, @NotNull FqName fqName) {
        SourceElement NO_SOURCE;
        Collection<JavaAnnotationArgument> arguments;
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f80567a = fqName;
        if (javaAnnotation == null || (NO_SOURCE = c10.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        }
        this.f80568b = NO_SOURCE;
        this.f80569c = c10.getStorageManager().createLazyValue(new a(c10, this));
        this.f80570d = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (JavaAnnotationArgument) CollectionsKt___CollectionsKt.firstOrNull(arguments);
        boolean z10 = false;
        if (javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation()) {
            z10 = true;
        }
        this.f80571e = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return q.emptyMap();
    }

    @Nullable
    public final JavaAnnotationArgument getFirstArgument() {
        return this.f80570d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public FqName getFqName() {
        return this.f80567a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        return this.f80568b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.f80571e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.f80569c, this, (KProperty<?>) f80566f[0]);
    }
}
