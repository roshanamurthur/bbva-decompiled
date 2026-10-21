package com.mastercard.sonic.observers;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventListener.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/mastercard/sonic/observers/EventListener;", ExifInterface.GPS_DIRECTION_TRUE, "", "update", "", "eventType", "", "event", "(Ljava/lang/String;Ljava/lang/Object;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface EventListener<T> {
    void update(@NotNull String eventType, T event);
}
