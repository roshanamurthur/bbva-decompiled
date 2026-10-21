package com.bbva.ethermobilesdk.securesharing.storage;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ProviderConnector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/storage/Mapper;", ExifInterface.GPS_DIRECTION_TRUE, "", "toContentValues", "Landroid/content/ContentValues;", "value", "(Ljava/lang/Object;)Landroid/content/ContentValues;", "toItem", "cursor", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)Ljava/lang/Object;", "toList", "", "securesharing_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface Mapper<T> {
    @NotNull
    ContentValues toContentValues(T value);

    T toItem(@NotNull Cursor cursor);

    @NotNull
    List<T> toList(@NotNull Cursor cursor);
}
