package com.bbva.ethermobilesdk.sharedstorage.model;

import android.content.ContentValues;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedStorageResult.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J9\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "", "", "key", "scope", "Landroid/content/ContentValues;", "toContentValues", "component1", "component2", "component3", "component4", "value", "created", "modified", "version", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "getCreated", "c", "getModified", "d", "getVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class StorageEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    @Nullable
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("created")
    @Nullable
    private final String created;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("modified")
    @Nullable
    private final String modified;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("version")
    @Nullable
    private final String version;

    public StorageEntry(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.value = str;
        this.created = str2;
        this.modified = str3;
        this.version = str4;
    }

    public static /* synthetic */ StorageEntry copy$default(StorageEntry storageEntry, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = storageEntry.value;
        }
        if ((i10 & 2) != 0) {
            str2 = storageEntry.created;
        }
        if ((i10 & 4) != 0) {
            str3 = storageEntry.modified;
        }
        if ((i10 & 8) != 0) {
            str4 = storageEntry.version;
        }
        return storageEntry.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreated() {
        return this.created;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModified() {
        return this.modified;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final StorageEntry copy(@Nullable String value, @Nullable String created, @Nullable String modified, @Nullable String version) {
        return new StorageEntry(value, created, modified, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageEntry)) {
            return false;
        }
        StorageEntry storageEntry = (StorageEntry) other;
        return Intrinsics.areEqual(this.value, storageEntry.value) && Intrinsics.areEqual(this.created, storageEntry.created) && Intrinsics.areEqual(this.modified, storageEntry.modified) && Intrinsics.areEqual(this.version, storageEntry.version);
    }

    @Nullable
    public final String getCreated() {
        return this.created;
    }

    @Nullable
    public final String getModified() {
        return this.modified;
    }

    @Nullable
    public final String getValue() {
        return this.value;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.value;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.created;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.modified;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final ContentValues toContentValues(@NotNull String key, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scope, "scope");
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", key);
        contentValues.put("scope", scope);
        contentValues.put("value", this.value);
        contentValues.put("created", this.created);
        contentValues.put("modified", this.modified);
        contentValues.put("version", this.version);
        return contentValues;
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.created;
        return c.b(a.c("StorageEntry(value=", str, ", created=", str2, ", modified="), this.modified, ", version=", this.version, ")");
    }
}
