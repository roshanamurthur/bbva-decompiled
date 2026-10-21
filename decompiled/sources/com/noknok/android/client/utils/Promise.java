package com.noknok.android.client.utils;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class Promise {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Listener f63467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Type f63468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Promise f63469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f63470d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Type f63471e = Type.None;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f63472f;

    public class HandleListenerRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Semaphore f63473a;

        public /* synthetic */ HandleListenerRunnable(Promise promise, int i10) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Promise promise = Promise.this;
                Object objOnDone = promise.f63472f;
                if (promise.f63468b == promise.f63471e) {
                    objOnDone = promise.f63467a.onDone(objOnDone);
                    if (objOnDone instanceof Promise) {
                        Promise.this.a((Promise) objOnDone);
                        return;
                    }
                }
                Promise promise2 = Promise.this;
                Promise promise3 = promise2.f63469c;
                if (promise3 != null) {
                    promise3.a(promise2.f63471e, objOnDone);
                }
            } finally {
                this.f63473a.release();
            }
        }

        private HandleListenerRunnable() {
            this.f63473a = new Semaphore(0, true);
        }
    }

    public interface Listener {
        Object onDone(Object obj);
    }

    public enum Type {
        None,
        Then,
        Error
    }

    public Promise error(Listener listener) {
        return a(Type.Error, listener);
    }

    public void reject(Object obj) {
        a(Type.Error, obj);
    }

    public void resolve(Object obj) {
        a(Type.Then, obj);
    }

    public Promise then(Listener listener) {
        return a(Type.Then, listener);
    }

    private Promise a(Type type, Listener listener) {
        if (this.f63469c != null) {
            throw new IllegalStateException("Listener must be added at end of chain");
        }
        this.f63467a = listener;
        this.f63468b = type;
        this.f63469c = new Promise();
        a();
        return this.f63469c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object b(Object obj) {
        this.f63469c.reject(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Type type, Object obj) {
        if (this.f63471e == Type.None) {
            this.f63471e = type;
            this.f63472f = obj;
            a();
            return;
        }
        throw new IllegalStateException("Promise is already settled");
    }

    private void a() {
        HandleListenerRunnable handleListenerRunnable = new HandleListenerRunnable(this, 0);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            handleListenerRunnable.run();
        } else {
            this.f63470d.post(handleListenerRunnable);
        }
        try {
            handleListenerRunnable.f63473a.acquire();
        } catch (InterruptedException e5) {
            throw new IllegalStateException("Problem during wait", e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Promise promise) {
        promise.getClass();
        while (true) {
            Promise promise2 = promise.f63469c;
            if (promise2 == null) {
                promise.then(new z0.e(this)).error(new androidx.camera.core.impl.utils.futures.a(this));
                return;
            }
            promise = promise2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object a(Object obj) {
        this.f63469c.resolve(obj);
        return obj;
    }
}
