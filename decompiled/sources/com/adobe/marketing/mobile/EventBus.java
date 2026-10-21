package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
class EventBus {
    private static final int MAX_LISTENER_TIME_MS = 1000;
    private long lastEventTimestamp = 0;
    private final String logPrefix = String.format("%s(%s)", getClass().getSimpleName(), "EventHub");
    private final ConcurrentHashMap<Integer, ConcurrentLinkedQueue<EventListener>> listenersPerMask = new ConcurrentHashMap<>();
    private final ExecutorService threadPool = Executors.newCachedThreadPool();

    private void notifyListeners(final Event event, int i10) {
        if (event == null) {
            return;
        }
        ArrayList<Future> arrayList = new ArrayList();
        HashMap map = new HashMap();
        ConcurrentLinkedQueue<EventListener> concurrentLinkedQueue = this.listenersPerMask.get(Integer.valueOf(i10));
        if (concurrentLinkedQueue != null) {
            for (final EventListener eventListener : concurrentLinkedQueue) {
                Future<?> futureSubmit = this.threadPool.submit(new Runnable() { // from class: com.adobe.marketing.mobile.EventBus.1
                    @Override // java.lang.Runnable
                    public void run() {
                        eventListener.hear(event);
                    }
                });
                map.put(futureSubmit, eventListener);
                arrayList.add(futureSubmit);
                if (eventListener instanceof OneTimeListener) {
                    concurrentLinkedQueue.remove(eventListener);
                }
            }
            for (Future future : arrayList) {
                try {
                    future.get(1000L, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e5) {
                    Log.error(this.logPrefix, "Listener %s exceeded runtime limit of %d milliseconds (%s)", ((EventListener) map.get(future)).getClass().getName(), 1000, e5);
                } catch (Exception e7) {
                    Log.error(this.logPrefix, "Thread exception while waiting for listener %s (%s)", ((EventListener) map.get(future)).getClass().getName(), e7);
                }
            }
        }
    }

    public void addListener(EventListener eventListener, EventType eventType, EventSource eventSource, String str) {
        if (eventListener == null) {
            return;
        }
        int iGenerateEventMask = Event.generateEventMask(eventType, eventSource, str);
        this.listenersPerMask.putIfAbsent(Integer.valueOf(iGenerateEventMask), new ConcurrentLinkedQueue<>());
        this.listenersPerMask.get(Integer.valueOf(iGenerateEventMask)).add(eventListener);
    }

    public void dispatch(Event event) {
        if (Log.getLogLevel().id >= LoggingMode.VERBOSE.id) {
            Log.trace(this.logPrefix, "Processing event #%d: %s", Integer.valueOf(event.getEventNumber()), event.toString());
        }
        long timestamp = event.getTimestamp();
        if (timestamp < this.lastEventTimestamp) {
            Log.debug(this.logPrefix, "Out of order event timestamp (%d) last event timestamp was (%d)", Long.valueOf(timestamp), Long.valueOf(this.lastEventTimestamp));
        }
        this.lastEventTimestamp = timestamp;
        notifyListeners(event, Event.generateEventMask(EventType.WILDCARD, EventSource.WILDCARD, null));
        notifyListeners(event, event.getEventMask());
    }

    public void removeListener(EventListener eventListener) {
        ConcurrentLinkedQueue<EventListener> concurrentLinkedQueue = this.listenersPerMask.get(Integer.valueOf(Event.generateEventMask(eventListener.getEventType(), eventListener.getEventSource(), null)));
        if (concurrentLinkedQueue == null) {
            return;
        }
        try {
            eventListener.onUnregistered();
        } catch (Exception e5) {
            Log.error(this.logPrefix, "%s.onUnregistered() threw %s", getClass().getName(), e5);
        }
        concurrentLinkedQueue.remove(eventListener);
    }

    public void removeListener(EventListener eventListener, EventType eventType, EventSource eventSource, String str) {
        if (eventListener == null) {
            return;
        }
        ConcurrentLinkedQueue<EventListener> concurrentLinkedQueue = this.listenersPerMask.get(Integer.valueOf(Event.generateEventMask(eventType, eventSource, str)));
        if (concurrentLinkedQueue != null) {
            concurrentLinkedQueue.remove(eventListener);
        }
    }
}
