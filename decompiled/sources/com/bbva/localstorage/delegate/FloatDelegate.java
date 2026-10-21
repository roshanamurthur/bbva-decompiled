package com.bbva.localstorage.delegate;

import com.bbva.localstorage.storage.Storage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Delegates.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0015"}, d2 = {"Lcom/bbva/localstorage/delegate/FloatDelegate;", "Lcom/bbva/localstorage/delegate/Delegate;", "", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Float;", "value", "", "setValue", "Lcom/bbva/localstorage/storage/Storage;", "storage", "", "name", "default", "", "decrypt", "<init>", "(Lcom/bbva/localstorage/storage/Storage;Ljava/lang/String;FZ)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class FloatDelegate implements Delegate<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f34992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f34993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34995d;

    public FloatDelegate(@NotNull Storage storage, @Nullable String str, float f6, boolean z10) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f34992a = storage;
        this.f34993b = str;
        this.f34994c = f6;
        this.f34995d = z10;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue(obj, (KProperty<?>) kProperty, ((Number) obj2).floatValue());
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @NotNull
    public Float getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String name = this.f34993b;
        if (name == null) {
            name = property.getName();
        }
        boolean z10 = this.f34995d;
        Storage storage = this.f34992a;
        float fFloatValue = this.f34994c;
        Float f6 = storage.getFloat(name, fFloatValue, z10);
        if (f6 != null) {
            fFloatValue = f6.floatValue();
        }
        return Float.valueOf(fFloatValue);
    }

    public void setValue(@NotNull Object thisRef, @NotNull KProperty<?> property, float value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String name = this.f34993b;
        if (name == null) {
            name = property.getName();
        }
        this.f34992a.set(name, value, this.f34995d);
    }

    public /* synthetic */ FloatDelegate(Storage storage, String str, float f6, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? 0.0f : f6, (i10 & 8) != 0 ? false : z10);
    }
}
