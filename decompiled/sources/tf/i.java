package tf;

import androidx.annotation.GuardedBy;
import com.google.firebase.components.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: EventBus.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements Subscriber, Publisher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final HashMap f93576a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public ArrayDeque f93577b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f93578c;

    public i(Executor executor) {
        this.f93578c = executor;
    }

    public final synchronized Set<Map.Entry<EventHandler<Object>, Executor>> a(Event<?> event) {
        Map map;
        try {
            map = (Map) this.f93576a.get(event.getType());
        } catch (Throwable th2) {
            throw th2;
        }
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    @Override // com.google.firebase.events.Publisher
    public final void publish(Event<?> event) {
        Preconditions.checkNotNull(event);
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f93577b;
                if (arrayDeque != null) {
                    arrayDeque.add(event);
                    return;
                }
                for (Map.Entry<EventHandler<Object>, Executor> entry : a(event)) {
                    entry.getValue().execute(new com.dasnano.vddocumentcapture.managers.e(entry, event, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized <T> void subscribe(Class<T> cls, Executor executor, EventHandler<? super T> eventHandler) {
        try {
            Preconditions.checkNotNull(cls);
            Preconditions.checkNotNull(eventHandler);
            Preconditions.checkNotNull(executor);
            if (!this.f93576a.containsKey(cls)) {
                this.f93576a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f93576a.get(cls)).put(eventHandler, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized <T> void unsubscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(eventHandler);
        if (this.f93576a.containsKey(cls)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f93576a.get(cls);
            concurrentHashMap.remove(eventHandler);
            if (concurrentHashMap.isEmpty()) {
                this.f93576a.remove(cls);
            }
        }
    }

    @Override // com.google.firebase.events.Subscriber
    public final <T> void subscribe(Class<T> cls, EventHandler<? super T> eventHandler) {
        subscribe(cls, this.f93578c, eventHandler);
    }
}
