package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.content.ContentValues;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContentResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/extension/ContentItem;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "b", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "getValue", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "value", "c", "getScope", "scope", "Landroid/content/ContentValues;", "values", "<init>", "(Landroid/content/ContentValues;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class ContentItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StorageEntry value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String scope;

    public ContentItem(@NotNull ContentValues values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.key = ContentResolverKt.access$key(values);
        this.value = ContentResolverKt.access$value(values);
        this.scope = ContentResolverKt.access$scope(values);
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    @NotNull
    public final String getScope() {
        return this.scope;
    }

    @NotNull
    public final StorageEntry getValue() {
        return this.value;
    }
}
