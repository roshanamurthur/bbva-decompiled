package nk;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Delegates.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T> implements ReadWriteProperty<Object, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T f85224a;

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @NotNull
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        T t10 = this.f85224a;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @Override // kotlin.properties.ReadWriteProperty
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f85224a = value;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("NotNullProperty(");
        if (this.f85224a != null) {
            str = "value=" + this.f85224a;
        } else {
            str = "value not initialized yet";
        }
        return y2.b(sb2, str, RootService.CLOSE_BRACKET);
    }
}
