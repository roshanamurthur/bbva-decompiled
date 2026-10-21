package kotlin.properties;

import androidx.camera.core.impl.v;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0019"}, d2 = {"Lkotlin/properties/ObservableProperty;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/properties/ReadWriteProperty;", "", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", "beforeChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)Z", "", "afterChange", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "thisRef", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "", "toString", "initialValue", "<init>", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public abstract class ObservableProperty<V> implements ReadWriteProperty<Object, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V f79765a;

    public ObservableProperty(V v3) {
        this.f79765a = v3;
    }

    public void afterChange(@NotNull KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public boolean beforeChange(@NotNull KProperty<?> property, V oldValue, V newValue) {
        Intrinsics.checkNotNullParameter(property, "property");
        return true;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public V getValue(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f79765a;
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object thisRef, @NotNull KProperty<?> property, V value) {
        Intrinsics.checkNotNullParameter(property, "property");
        V v3 = this.f79765a;
        if (beforeChange(property, v3, value)) {
            this.f79765a = value;
            afterChange(property, v3, value);
        }
    }

    @NotNull
    public String toString() {
        return v.d(new StringBuilder("ObservableProperty(value="), this.f79765a, RootService.CLOSE_BRACKET);
    }
}
