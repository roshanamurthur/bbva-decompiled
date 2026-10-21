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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B1\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\u0013"}, d2 = {"Lcom/bbva/localstorage/delegate/StringDelegate;", "Lcom/bbva/localstorage/delegate/Delegate;", "", "", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "value", "", "setValue", "Lcom/bbva/localstorage/storage/Storage;", "storage", "name", "default", "", "decrypt", "<init>", "(Lcom/bbva/localstorage/storage/Storage;Ljava/lang/String;Ljava/lang/String;Z)V", "local-storage_release"}, k = 1, mv = {1, 8, 0})
public final class StringDelegate implements Delegate<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f35004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f35005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f35006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f35007d;

    public StringDelegate(@NotNull Storage storage, @Nullable String str, @Nullable String str2, boolean z10) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f35004a = storage;
        this.f35005b = str;
        this.f35006c = str2;
        this.f35007d = z10;
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Object getValue(Object obj, KProperty kProperty) {
        return getValue(obj, (KProperty<?>) kProperty);
    }

    @Override // kotlin.properties.ReadWriteProperty
    public /* bridge */ /* synthetic */ void setValue(Object obj, KProperty kProperty, Object obj2) {
        setValue(obj, (KProperty<?>) kProperty, (String) obj2);
    }

    @Override // kotlin.properties.ReadWriteProperty, kotlin.properties.ReadOnlyProperty
    @Nullable
    public String getValue(@NotNull Object thisRef, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String name = this.f35005b;
        if (name == null) {
            name = property.getName();
        }
        return this.f35004a.getString(name, this.f35006c, this.f35007d);
    }

    public void setValue(@NotNull Object thisRef, @NotNull KProperty<?> property, @Nullable String value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        String name = this.f35005b;
        if (name == null) {
            name = property.getName();
        }
        this.f35004a.set(name, value, this.f35007d);
    }

    public /* synthetic */ StringDelegate(Storage storage, String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? false : z10);
    }
}
