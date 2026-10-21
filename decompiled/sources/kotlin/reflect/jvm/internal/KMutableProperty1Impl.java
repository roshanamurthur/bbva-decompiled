package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KProperty1Impl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B+\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0012\u0010\u0019J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "receiver", "value", "", SetCommand.ID, "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "setter", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "", "name", "signature", "", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public final class KMutableProperty1Impl<T, V> extends KProperty1Impl<T, V> implements KMutableProperty1<T, V> {

    @NotNull
    public final Lazy<Setter<T, V>> J0;

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\b\u0012\u0004\u0012\u00028\u00030\u00032\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty1$Setter;", "receiver", "value", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "y0", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "property", "<init>", "(Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class Setter<T, V> extends KPropertyImpl.Setter<V> implements KMutableProperty1.Setter<T, V> {

        /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final KMutableProperty1Impl<T, V> property;

        public Setter(@NotNull KMutableProperty1Impl<T, V> property) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.property = property;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2) throws IllegalCallableAccessException {
            invoke2(obj, obj2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.KProperty.Accessor
        @NotNull
        public KMutableProperty1Impl<T, V> getProperty() {
            return this.property;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(T receiver, V value) throws IllegalCallableAccessException {
            getProperty().set(receiver, value);
        }
    }

    /* JADX INFO: compiled from: KProperty1Impl.kt */
    public static final class a extends Lambda implements Function0<Setter<T, V>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KMutableProperty1Impl<T, V> f79960p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(KMutableProperty1Impl<T, V> kMutableProperty1Impl) {
            super(0);
            this.f79960p0 = kMutableProperty1Impl;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Setter<T, V> invoke() {
            return new Setter<>(this.f79960p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.J0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a(this));
    }

    @Override // kotlin.reflect.KMutableProperty1
    public void set(T receiver, V value) throws IllegalCallableAccessException {
        getSetter().call(receiver, value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty1Impl(@NotNull KDeclarationContainerImpl container, @NotNull PropertyDescriptor descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.J0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a(this));
    }

    @Override // kotlin.reflect.KMutableProperty1, kotlin.reflect.KMutableProperty
    @NotNull
    public Setter<T, V> getSetter() {
        return this.J0.getValue();
    }
}
