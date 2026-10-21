package com.adobe.marketing.mobile.services;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class PersistentHitQueue implements HitQueuing {
    private final HitProcessing processor;
    private final DataQueue queue;
    private AtomicBoolean suspended = new AtomicBoolean(true);
    private final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
    private final AtomicBoolean isTaskScheduled = new AtomicBoolean(false);

    public PersistentHitQueue(DataQueue dataQueue, HitProcessing hitProcessing) throws IllegalArgumentException {
        if (dataQueue == null || hitProcessing == null) {
            throw new IllegalArgumentException("Null value is not allowed in PersistentHitQueue Constructor.");
        }
        this.queue = dataQueue;
        this.processor = hitProcessing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNextHit() {
        if (!this.suspended.get() && this.isTaskScheduled.compareAndSet(false, true)) {
            this.scheduledExecutorService.execute(new Runnable() { // from class: com.adobe.marketing.mobile.services.PersistentHitQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    DataEntity dataEntityPeek = PersistentHitQueue.this.queue.peek();
                    if (dataEntityPeek == null) {
                        PersistentHitQueue.this.isTaskScheduled.set(false);
                        return;
                    }
                    if (!PersistentHitQueue.this.processor.processHit(dataEntityPeek)) {
                        PersistentHitQueue.this.scheduledExecutorService.schedule(new Runnable() { // from class: com.adobe.marketing.mobile.services.PersistentHitQueue.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                PersistentHitQueue.this.isTaskScheduled.set(false);
                                PersistentHitQueue.this.processNextHit();
                            }
                        }, PersistentHitQueue.this.processor.retryInterval(dataEntityPeek), TimeUnit.SECONDS);
                    } else {
                        PersistentHitQueue.this.queue.remove();
                        PersistentHitQueue.this.isTaskScheduled.set(false);
                        PersistentHitQueue.this.processNextHit();
                    }
                }
            });
        }
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void beginProcessing() {
        this.suspended.set(false);
        processNextHit();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void clear() {
        this.queue.clear();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void close() {
        suspend();
        this.queue.close();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public int count() {
        return this.queue.count();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public boolean queue(DataEntity dataEntity) {
        boolean zAdd = this.queue.add(dataEntity);
        processNextHit();
        return zAdd;
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public void suspend() {
        this.suspended.set(true);
    }
}
