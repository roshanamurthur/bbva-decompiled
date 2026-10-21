package com.bbva.ethermobilesdk.securesharing.model;

import android.content.ContentValues;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.securesharing.database.EntryTable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Entry.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J1\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/model/Entry;", "", "Landroid/content/ContentValues;", "values", "copy", "toContentValues", "", "component1", "component2", "", "component3", "component4", "key", "value", "createAt", EntryTable.MODIFIED_AT, "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "getValue", "c", "J", "getCreateAt", "()J", "d", "getModifiedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long createAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final long modifiedAt;

    public Entry(@NotNull String key, @NotNull String value, long j10, long j11) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.key = key;
        this.value = value;
        this.createAt = j10;
        this.modifiedAt = j11;
    }

    public static /* synthetic */ Entry copy$default(Entry entry, String str, String str2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entry.key;
        }
        if ((i10 & 2) != 0) {
            str2 = entry.value;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            j10 = entry.createAt;
        }
        long j12 = j10;
        if ((i10 & 8) != 0) {
            j11 = entry.modifiedAt;
        }
        return entry.copy(str, str3, j12, j11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreateAt() {
        return this.createAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getModifiedAt() {
        return this.modifiedAt;
    }

    @NotNull
    public final Entry copy(@NotNull String key, @NotNull String value, long createAt, long modifiedAt) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Entry(key, value, createAt, modifiedAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) other;
        return Intrinsics.areEqual(this.key, entry.key) && Intrinsics.areEqual(this.value, entry.value) && this.createAt == entry.createAt && this.modifiedAt == entry.modifiedAt;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final long getModifiedAt() {
        return this.modifiedAt;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iC = n1.c(this.value, this.key.hashCode() * 31, 31);
        long j10 = this.createAt;
        long j11 = this.modifiedAt;
        return ((iC + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)));
    }

    @NotNull
    public final ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", getKey());
        contentValues.put("value", getValue());
        contentValues.put(EntryTable.CREATED_AT, Long.valueOf(getCreateAt()));
        contentValues.put(EntryTable.MODIFIED_AT, Long.valueOf(getModifiedAt()));
        return contentValues;
    }

    @NotNull
    public String toString() {
        return "Entry(key=" + this.key + ", value=" + this.value + ", createAt=" + this.createAt + ", modifiedAt=" + this.modifiedAt + RootService.CLOSE_BRACKET;
    }

    @NotNull
    public final Entry copy(@NotNull ContentValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        String value = values.getAsString("value");
        Intrinsics.checkNotNullExpressionValue(value, "value");
        return copy$default(this, null, value, 0L, System.currentTimeMillis(), 5, null);
    }
}
