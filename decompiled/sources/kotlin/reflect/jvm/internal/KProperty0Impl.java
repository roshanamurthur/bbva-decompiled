package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty0;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KProperty0Impl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0018B\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B+\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0017J\u000f\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "get", "()Ljava/lang/Object;", "", "getDelegate", "invoke", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public class KProperty0Impl<V> extends KPropertyImpl<V> implements KProperty0<V> {

    @NotNull
    public final Lazy<Getter<V>> H0;

    @NotNull
    public final Lazy<Object> I0;

    /* JADX INFO: compiled from: KProperty0Impl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty0$Getter;", "invoke", "()Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "y0", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty0Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty0Impl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class Getter<R> extends KPropertyImpl.Getter<R> implements KProperty0.Getter<R> {

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final KProperty0Impl<R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty0Impl<? extends R> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // kotlin.jvm.functions.Function0
        public R invoke() {
            return getProperty().get();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.KProperty.Accessor
        @NotNull
        public KProperty0Impl<R> getProperty() {
            return this.property;
        }
    }

    /* JADX INFO: compiled from: KProperty0Impl.kt */
    public static final class a extends Lambda implements Function0<Getter<? extends V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KProperty0Impl<V> f79991p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty0Impl<? extends V> kProperty0Impl) {
            super(0);
            this.f79991p0 = kProperty0Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Getter<V> invoke() {
            return new Getter<>(this.f79991p0);
        }
    }

    /* JADX INFO: compiled from: KProperty0Impl.kt */
    public static final class b extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KProperty0Impl<V> f79992p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(KProperty0Impl<? extends V> kProperty0Impl) {
            super(0);
            this.f79992p0 = kProperty0Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            KProperty0Impl<V> kProperty0Impl = this.f79992p0;
            return kProperty0Impl.getDelegateImpl(kProperty0Impl.computeDelegateSource(), null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@NotNull KDeclarationContainerImpl container, @NotNull PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.H0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a(this));
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
    }

    @Override // kotlin.reflect.KProperty0
    public V get() {
        return getGetter().call(new Object[0]);
    }

    @Override // kotlin.reflect.KProperty0
    @Nullable
    public Object getDelegate() {
        return this.I0.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public V invoke() {
        return get();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty0Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.H0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a(this));
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl, kotlin.reflect.KProperty
    @NotNull
    public Getter<V> getGetter() {
        return this.H0.getValue();
    }
}
