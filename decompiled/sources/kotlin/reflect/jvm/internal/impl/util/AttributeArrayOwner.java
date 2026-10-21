package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AttributeArrayOwner.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public ArrayMap<T> f82065p0;

    public AttributeArrayOwner(@NotNull ArrayMap<T> arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f82065p0 = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public final ArrayMap<T> getArrayMap() {
        return this.f82065p0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final void registerComponent(@NotNull String keyQualifiedName, @NotNull T value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int id = getTypeRegistry().getId(keyQualifiedName);
        int size = this.f82065p0.getSize();
        if (size == 0) {
            this.f82065p0 = new OneElementArrayMap(value, id);
            return;
        }
        if (size == 1) {
            ArrayMap<T> arrayMap = this.f82065p0;
            Intrinsics.checkNotNull(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap;
            if (oneElementArrayMap.getIndex() == id) {
                this.f82065p0 = new OneElementArrayMap(value, id);
                return;
            } else {
                ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                this.f82065p0 = arrayMapImpl;
                arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
            }
        }
        this.f82065p0.set(id, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        Intrinsics.checkNotNull(emptyArrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(emptyArrayMap);
    }
}
