package com.bbva.component.dm.storage.domain.model;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EntryKey.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/storage/domain/model/EntryKey;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "component1", "Ljava/lang/Class;", "component2", "key", "clazz", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "Ljava/lang/Class;", "getClazz", "()Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EntryKey<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<T> clazz;

    public EntryKey(@NotNull String str, @NotNull Class<T> cls) {
        this.key = str;
        this.clazz = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, Class cls, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.key;
        }
        if ((i10 & 2) != 0) {
            cls = entryKey.clazz;
        }
        return entryKey.copy(str, cls);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final Class<T> component2() {
        return this.clazz;
    }

    @NotNull
    public final EntryKey<T> copy(@NotNull String key, @NotNull Class<T> clazz) {
        return new EntryKey<>(key, clazz);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) other;
        return Intrinsics.areEqual(this.key, entryKey.key) && Intrinsics.areEqual(this.clazz, entryKey.clazz);
    }

    @NotNull
    public final Class<T> getClazz() {
        return this.clazz;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Class<T> cls = this.clazz;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EntryKey(key=" + this.key + ", clazz=" + this.clazz + ")";
    }
}
