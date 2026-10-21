package kotlin.reflect.jvm.internal.impl.load.java.components;

import bk.p;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JavaAnnotationMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaDeprecatedAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80581h = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(JavaDeprecatedAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final NotNullLazyValue f80582g;

    /* JADX INFO: compiled from: JavaAnnotationMapper.kt */
    public static final class a extends Lambda implements Function0<Map<Name, ? extends StringValue>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80583p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<Name, ? extends StringValue> invoke() {
            return p.mapOf(TuplesKt.to(JavaAnnotationMapper.INSTANCE.getDEPRECATED_ANNOTATION_MESSAGE$descriptors_jvm(), new StringValue("Deprecated in Java")));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaDeprecatedAnnotationDescriptor(@Nullable JavaAnnotation javaAnnotation, @NotNull LazyJavaResolverContext c10) {
        super(c10, javaAnnotation, StandardNames.FqNames.deprecated);
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f80582g = c10.getStorageManager().createLazyValue(a.f80583p0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f80582g, this, (KProperty<?>) f80581h[0]);
    }
}
