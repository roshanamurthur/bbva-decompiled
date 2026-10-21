package kotlin.reflect.jvm.internal.impl.load.java.components;

import bk.p;
import bk.q;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80584h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80585g;

    /* JADX INFO: compiled from: JavaAnnotationMapper.kt */
    @SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaRetentionAnnotationDescriptor$allValueArguments$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
    public static final class a extends Lambda implements Function0<Map<Name, ? extends ConstantValue<?>>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<Name, ? extends ConstantValue<?>> invoke() {
            ConstantValue<?> constantValueMapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(JavaRetentionAnnotationDescriptor.this.getFirstArgument());
            Map<Name, ? extends ConstantValue<?>> mapMapOf = constantValueMapJavaRetentionArgument$descriptors_jvm != null ? p.mapOf(TuplesKt.to(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), constantValueMapJavaRetentionArgument$descriptors_jvm)) : null;
            return mapMapOf == null ? q.emptyMap() : mapMapOf;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(@NotNull JavaAnnotation annotation, @NotNull LazyJavaResolverContext c10) {
        super(c10, annotation, StandardNames.FqNames.retention);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f80585g = c10.getStorageManager().createLazyValue(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f80585g, this, (KProperty<?>) f80584h[0]);
    }
}
