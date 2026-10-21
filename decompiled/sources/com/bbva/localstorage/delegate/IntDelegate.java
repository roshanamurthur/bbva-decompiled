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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0015"}, d2 = {"Lcom/bbva/localstorage/delegate/IntDelegate;", "Lcom/bbva/localstorage/delegate/Delegate;", "", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Integer;", "value", "", "setValue", "Lcom/bbva/localstorage/storage/Storage;", "storage", "", "name", "default", "", "decrypt", "<init>", "(Lcom/bbva/localstorage/storage/Storage;Ljava/lang/String;IZ)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class IntDelegate implements Delegate<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f34996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f34997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f34999d;

    public IntDelegate(@NotNull Storage storage, @Nullable String str, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f34996a = storage;
        this.f34997b = str;
        this.f34998c = i10;
        this.f34999d = z10;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue(obj, (KProperty<?>) kProperty, ((Number) obj2).intValue());
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @NotNull
    public Integer getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String name = this.f34997b;
        if (name == null) {
            name = property.getName();
        }
        boolean z10 = this.f34999d;
        Storage storage = this.f34996a;
        int iIntValue = this.f34998c;
        Integer num = storage.getInt(name, iIntValue, z10);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public void setValue(@NotNull Object thisRef, @NotNull KProperty<?> property, int value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String name = this.f34997b;
        if (name == null) {
            name = property.getName();
        }
        this.f34996a.set(name, value, this.f34999d);
    }

    public /* synthetic */ IntDelegate(Storage storage, String str, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10);
    }
}
