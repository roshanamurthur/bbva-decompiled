package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Member;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty2;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KProperty2Impl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0006\b\u0002\u0010\u0003 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005:\u0001\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u001aJ\u001f\u0010\b\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\tJ \u0010\f\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\tR&\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl;", "D", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/KProperty2;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "receiver1", "receiver2", "get", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "getDelegate", "invoke", "Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;)V", "Getter", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public class KProperty2Impl<D, E, V> extends KPropertyImpl<V> implements KProperty2<D, E, V> {

    @NotNull
    public final Lazy<Getter<D, E, V>> H0;

    @NotNull
    public final Lazy<Member> I0;

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0003\u0010\u0001*\u0004\b\u0004\u0010\u0002*\u0006\b\u0005\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00050\u00042\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0005B!\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00028\u00052\u0006\u0010\u0006\u001a\u00028\u00032\u0006\u0010\u0007\u001a\u00028\u0004H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty2Impl$Getter;", "D", ExifInterface.LONGITUDE_EAST, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "Lkotlin/reflect/KProperty2$Getter;", "receiver1", "receiver2", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "y0", "Lkotlin/reflect/jvm/internal/KProperty2Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KProperty2Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KProperty2Impl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class Getter<D, E, V> extends KPropertyImpl.Getter<V> implements KProperty2.Getter<D, E, V> {

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final KProperty2Impl<D, E, V> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Getter(@NotNull KProperty2Impl<D, E, ? extends V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        @Override // kotlin.jvm.functions.Function2
        public V invoke(D receiver1, E receiver2) {
            return getProperty().get(receiver1, receiver2);
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.KProperty.Accessor
        @NotNull
        public KProperty2Impl<D, E, V> getProperty() {
            return this.property;
        }
    }

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    public static final class a extends Lambda implements Function0<Getter<D, E, ? extends V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KProperty2Impl<D, E, V> f79997p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            super(0);
            this.f79997p0 = kProperty2Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Getter<D, E, V> invoke() {
            return new Getter<>(this.f79997p0);
        }
    }

    /* JADX INFO: compiled from: KProperty2Impl.kt */
    public static final class b extends Lambda implements Function0<Member> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KProperty2Impl<D, E, V> f79998p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(KProperty2Impl<D, E, ? extends V> kProperty2Impl) {
            super(0);
            this.f79998p0 = kProperty2Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Member invoke() {
            return this.f79998p0.computeDelegateSource();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature) {
        super(container, name, signature, CallableReference.NO_RECEIVER);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.H0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a(this));
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
    }

    @Override // kotlin.reflect.KProperty2
    public V get(D receiver1, E receiver2) {
        return getGetter().call(receiver1, receiver2);
    }

    @Override // kotlin.reflect.KProperty2
    @Nullable
    public Object getDelegate(D receiver1, E receiver2) {
        return getDelegateImpl(this.I0.getValue(), receiver1, receiver2);
    }

    @Override // kotlin.jvm.functions.Function2
    public V invoke(D receiver1, E receiver2) {
        return get(receiver1, receiver2);
    }

    @Override // kotlin.reflect.jvm.internal.KPropertyImpl, kotlin.reflect.KProperty
    @NotNull
    public Getter<D, E, V> getGetter() {
        return this.H0.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KProperty2Impl(@NotNull KDeclarationContainerImpl container, @NotNull PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.H0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a(this));
        this.I0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b(this));
    }
}
