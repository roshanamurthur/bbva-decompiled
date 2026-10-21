package com.veridas.thread;

import com.veridas.log.Log;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class QueuedThread<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f67474a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingDeque<E> f67475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f67477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final QueuedThreadRunnable<E> f67478e;

    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                QueuedThread queuedThread = QueuedThread.this;
                if (!queuedThread.f67474a.get()) {
                    return;
                }
                try {
                    queuedThread.f67478e.run(queuedThread.f67475b.take());
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public QueuedThread(QueuedThreadRunnable<E> queuedThreadRunnable, int i10, String str) {
        this.f67478e = queuedThreadRunnable;
        this.f67476c = str;
        this.f67475b = new LinkedBlockingDeque<>(i10);
    }

    public synchronized void clear() {
        this.f67475b.clear();
    }

    public synchronized int getNumberOfElementsInQueue() {
        return this.f67475b.size();
    }

    public boolean isRunning() {
        return this.f67474a.get();
    }

    public synchronized E makeRoom() {
        if (this.f67475b.remainingCapacity() != 0) {
            return null;
        }
        return this.f67475b.removeFirst();
    }

    public synchronized boolean push(E e5) {
        return this.f67475b.offerLast(e5);
    }

    public synchronized void start() {
        if (this.f67474a.get()) {
            throw new IllegalStateException("This queued thread is already running.");
        }
        this.f67474a.set(true);
        a aVar = new a();
        this.f67477d = aVar;
        aVar.setName(String.format(Locale.ROOT, "%s-%d", this.f67476c, Long.valueOf(Thread.currentThread().getId())));
        this.f67477d.setPriority(10);
        this.f67477d.start();
    }

    public synchronized void stop() {
        if (this.f67474a.get()) {
            this.f67475b.clear();
            if (this.f67477d != null) {
                this.f67474a.set(false);
                this.f67477d.interrupt();
                try {
                    this.f67477d.join(500L);
                } catch (InterruptedException e5) {
                    Log.e("QueuedThread", e5);
                }
                this.f67477d = null;
            }
        }
    }
}
