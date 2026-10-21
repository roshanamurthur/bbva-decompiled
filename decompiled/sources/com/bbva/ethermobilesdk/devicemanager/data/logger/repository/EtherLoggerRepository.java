package com.bbva.ethermobilesdk.devicemanager.data.logger.repository;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherLoggerRepository.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J$\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/logger/repository/EtherLoggerRepository;", "", LogKeysKt.LOG, "", "message", "", "logError", ExifInterface.GPS_DIRECTION_TRUE, "ex", "", "origin", "Ljava/lang/Class;", "devicemanager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EtherLoggerRepository {
    void log(@NotNull String message);

    <T> void logError(@NotNull Throwable ex, @NotNull Class<T> origin);
}
