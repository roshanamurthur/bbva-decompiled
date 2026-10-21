package com.bbva.component.dm.storage.domain.model;

import androidx.camera.core.impl.a;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Entry.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/storage/domain/model/Entry;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "component2", "()Ljava/lang/Object;", "key", "value", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/bbva/component/dm/storage/domain/model/Entry;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "Ljava/lang/Object;", "getValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class Entry<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final T value;

    public Entry(@NotNull String str, @Nullable T t10) {
        this.key = str;
        this.value = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ Entry copy$default(Entry entry, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = entry.key;
        }
        if ((i10 & 2) != 0) {
            obj = entry.value;
        }
        return entry.copy(str, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final T component2() {
        return this.value;
    }

    @NotNull
    public final Entry<T> copy(@NotNull String key, @Nullable T value) {
        return new Entry<>(key, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) other;
        return Intrinsics.areEqual(this.key, entry.key) && Intrinsics.areEqual(this.value, entry.value);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.value;
        return iHashCode + (t10 != null ? t10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Entry(key=");
        sb2.append(this.key);
        sb2.append(", value=");
        return a.e(sb2, this.value, ")");
    }
}
