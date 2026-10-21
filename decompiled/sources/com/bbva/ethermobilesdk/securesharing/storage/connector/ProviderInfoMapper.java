package com.bbva.ethermobilesdk.securesharing.storage.connector;

import android.content.ContentValues;
import android.database.Cursor;
import com.bbva.ethermobilesdk.securesharing.extension.CursorKt;
import com.bbva.ethermobilesdk.securesharing.model.ProviderInfo;
import com.bbva.ethermobilesdk.securesharing.storage.Mapper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProviderInfoConnector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/storage/connector/ProviderInfoMapper;", "Lcom/bbva/ethermobilesdk/securesharing/storage/Mapper;", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "()V", "toContentValues", "Landroid/content/ContentValues;", "value", "toItem", "cursor", "Landroid/database/Cursor;", "toList", "", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ProviderInfoMapper implements Mapper<ProviderInfo> {

    @NotNull
    public static final ProviderInfoMapper INSTANCE = new ProviderInfoMapper();

    @Override // com.bbva.ethermobilesdk.securesharing.storage.Mapper
    @NotNull
    public List<ProviderInfo> toList(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        return CursorKt.toProviderInfoList(cursor);
    }

    @Override // com.bbva.ethermobilesdk.securesharing.storage.Mapper
    @NotNull
    public ContentValues toContentValues(@NotNull ProviderInfo value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.toContentValues();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bbva.ethermobilesdk.securesharing.storage.Mapper
    @NotNull
    public ProviderInfo toItem(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "cursor");
        return CursorKt.toProviderInfo(cursor);
    }
}
