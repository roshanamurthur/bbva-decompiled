package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f38766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Request f38767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Request f38768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f38769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f38770f;

    public ErrorRequestCoordinator(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f38769e = requestState;
        this.f38770f = requestState;
        this.f38765a = obj;
        this.f38766b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.f38765a) {
            try {
                RequestCoordinator.RequestState requestState = this.f38769e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f38769e = requestState2;
                    this.f38767c.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z10;
        synchronized (this.f38765a) {
            RequestCoordinator requestCoordinator = this.f38766b;
            z10 = (requestCoordinator == null || requestCoordinator.canNotifyCleared(this)) && request.equals(this.f38767c);
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request) {
        RequestCoordinator.RequestState requestState;
        boolean z10;
        synchronized (this.f38765a) {
            RequestCoordinator requestCoordinator = this.f38766b;
            if (requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this)) {
                RequestCoordinator.RequestState requestState2 = this.f38769e;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3) {
                    if (request.equals(this.f38767c)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else if (request.equals(this.f38768d) && ((requestState = this.f38770f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request) {
        boolean z10;
        synchronized (this.f38765a) {
            RequestCoordinator requestCoordinator = this.f38766b;
            z10 = requestCoordinator == null || requestCoordinator.canSetImage(this);
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f38765a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.f38769e = requestState;
                this.f38767c.clear();
                if (this.f38770f != requestState) {
                    this.f38770f = requestState;
                    this.f38768d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f38765a) {
            try {
                RequestCoordinator requestCoordinator = this.f38766b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        boolean z10;
        synchronized (this.f38765a) {
            try {
                z10 = this.f38767c.isAnyResourceSet() || this.f38768d.isAnyResourceSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f38765a) {
            try {
                RequestCoordinator.RequestState requestState = this.f38769e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z10 = requestState == requestState2 && this.f38770f == requestState2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f38765a) {
            try {
                RequestCoordinator.RequestState requestState = this.f38769e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z10 = requestState == requestState2 || this.f38770f == requestState2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ErrorRequestCoordinator)) {
            return false;
        }
        ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
        return this.f38767c.isEquivalentTo(errorRequestCoordinator.f38767c) && this.f38768d.isEquivalentTo(errorRequestCoordinator.f38768d);
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f38765a) {
            try {
                RequestCoordinator.RequestState requestState = this.f38769e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z10 = requestState == requestState2 || this.f38770f == requestState2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        synchronized (this.f38765a) {
            try {
                if (request.equals(this.f38768d)) {
                    this.f38770f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f38766b;
                    if (requestCoordinator != null) {
                        requestCoordinator.onRequestFailed(this);
                    }
                    return;
                }
                this.f38769e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f38770f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f38770f = requestState2;
                    this.f38768d.begin();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request) {
        synchronized (this.f38765a) {
            try {
                if (request.equals(this.f38767c)) {
                    this.f38769e = RequestCoordinator.RequestState.SUCCESS;
                } else if (request.equals(this.f38768d)) {
                    this.f38770f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f38766b;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f38765a) {
            try {
                RequestCoordinator.RequestState requestState = this.f38769e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.f38769e = RequestCoordinator.RequestState.PAUSED;
                    this.f38767c.pause();
                }
                if (this.f38770f == requestState2) {
                    this.f38770f = RequestCoordinator.RequestState.PAUSED;
                    this.f38768d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.f38767c = request;
        this.f38768d = request2;
    }
}
