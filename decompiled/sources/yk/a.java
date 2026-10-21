package yk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyJavaScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function0<NullableLazyValue<? extends ConstantValue<?>>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ LazyJavaScope f94863p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ JavaField f94864q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<PropertyDescriptorImpl> f94865r0;

    /* JADX INFO: renamed from: yk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LazyJavaScope.kt */
    public static final class C0511a extends Lambda implements Function0<ConstantValue<?>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyJavaScope f94866p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ JavaField f94867q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<PropertyDescriptorImpl> f94868r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0511a(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef<PropertyDescriptorImpl> objectRef) {
            super(0);
            this.f94866p0 = lazyJavaScope;
            this.f94867q0 = javaField;
            this.f94868r0 = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final ConstantValue<?> invoke() {
            return this.f94866p0.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.f94867q0, this.f94868r0.element);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LazyJavaScope lazyJavaScope, JavaField javaField, Ref.ObjectRef<PropertyDescriptorImpl> objectRef) {
        super(0);
        this.f94863p0 = lazyJavaScope;
        this.f94864q0 = javaField;
        this.f94865r0 = objectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NullableLazyValue<? extends ConstantValue<?>> invoke() {
        LazyJavaScope lazyJavaScope = this.f94863p0;
        return lazyJavaScope.getC().getStorageManager().createNullableLazyValue(new C0511a(lazyJavaScope, this.f94864q0, this.f94865r0));
    }
}
