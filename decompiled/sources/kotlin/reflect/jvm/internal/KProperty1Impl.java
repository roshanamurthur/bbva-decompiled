package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B+\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0019J\u0017\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u0018\u0010\n\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u0007R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "receiver", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public class KProperty1Impl<T, V> extends KPropertyImpl<V> implements KProperty1<T, V> {

    @NotNull
    public final Lazy<Getter<T, V>> H0;

    @NotNull
    public final Lazy<Member> I0;

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0006\b\u0003\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty1$Getter;", "receiver", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "y0", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty1Impl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class Getter<T, V> extends KPropertyImpl.Getter<V> implements KProperty1.Getter<T, V> {

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final KProperty1Impl<T, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty1Impl<T, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // kotlin.jvm.functions.Function1
        public V invoke(T receiver) {
            return getProperty().get(receiver);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.KProperty.Accessor
        @NotNull
        public KProperty1Impl<T, V> getProperty() {
            return this.property;
        }
    }

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    public static final class a extends Lambda implements Function0<Getter<T, ? extends V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KProperty1Impl<T, V> f79994p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            super(0);
            this.f79994p0 = kProperty1Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Getter<T, V> invoke() {
            return new Getter<>(this.f79994p0);
        }
    }

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    public static final class b extends Lambda implements Function0<Member> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KProperty1Impl<T, V> f79995p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(KProperty1Impl<T, ? extends V> kProperty1Impl) {
            super(0);
            this.f79995p0 = kProperty1Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Member invoke() {
            return this.f79995p0.computeDelegateSource();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.H0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a(this));
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
    }

    @Override // kotlin.reflect.KProperty1
    public V get(T receiver) {
        return getGetter().call(receiver);
    }

    @Override // kotlin.reflect.KProperty1
    @Nullable
    public Object getDelegate(T receiver) {
        return getDelegateImpl(this.I0.getValue(), receiver, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public V invoke(T receiver) {
        return get(receiver);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty1Impl(@NotNull KDeclarationContainerImpl container, @NotNull PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.H0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a(this));
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl, kotlin.reflect.KProperty
    @NotNull
    public Getter<T, V> getGetter() {
        return this.H0.getValue();
    }
}
