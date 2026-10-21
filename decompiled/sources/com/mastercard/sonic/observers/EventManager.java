package com.mastercard.sonic.observers;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EventManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u000f\"\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005J\u001d\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003¨\u0006\u0013"}, d2 = {"Lcom/mastercard/sonic/observers/EventManager;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "eventType", "Lcom/mastercard/sonic/observers/EventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "subscribe", "unsubscribe", "event", "notify", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "totalListenersForEventType", "", "operations", "<init>", "([Ljava/lang/String;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class EventManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap<String, List<EventListener<T>>> f51534a;

    public EventManager(@NotNull String... operations) {
        Intrinsics.checkNotNullParameter(operations, "operations");
        this.f51534a = new HashMap<>();
        for (String str : operations) {
            this.f51534a.put(str, new ArrayList());
        }
    }

    public final void notify(@NotNull String eventType, T event) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        List<EventListener<T>> list = this.f51534a.get(eventType);
        if (list != null) {
            Iterator<EventListener<T>> it = list.iterator();
            while (it.hasNext()) {
                it.next().update(eventType, event);
            }
        }
    }

    public final void subscribe(@NotNull String eventType, @NotNull EventListener<T> listener) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<EventListener<T>> list = this.f51534a.get(eventType);
        if (list != null) {
            list.add(listener);
        }
    }

    public final int totalListenersForEventType(@NotNull String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        List<EventListener<T>> list = this.f51534a.get(eventType);
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void unsubscribe(@NotNull String eventType, @NotNull EventListener<T> listener) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<EventListener<T>> list = this.f51534a.get(eventType);
        if (list != null) {
            list.remove(listener);
        }
    }
}
