package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final RequestCoordinator f38807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Request f38809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Request f38810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f38811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f38812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @GuardedBy("requestLock")
    public boolean f38813g;

    public ThumbnailRequestCoordinator(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f38811e = requestState;
        this.f38812f = requestState;
        this.f38808b = obj;
        this.f38807a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.Request
    public void begin() {
        synchronized (this.f38808b) {
            try {
                this.f38813g = true;
                try {
                    if (this.f38811e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f38812f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f38812f = requestState2;
                            this.f38810d.begin();
                        }
                    }
                    if (this.f38813g) {
                        RequestCoordinator.RequestState requestState3 = this.f38811e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.f38811e = requestState4;
                            this.f38809c.begin();
                        }
                    }
                    this.f38813g = false;
                } catch (Throwable th2) {
                    this.f38813g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyCleared(Request request) {
        boolean z10;
        synchronized (this.f38808b) {
            try {
                RequestCoordinator requestCoordinator = this.f38807a;
                z10 = (requestCoordinator == null || requestCoordinator.canNotifyCleared(this)) && request.equals(this.f38809c) && this.f38811e != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canNotifyStatusChanged(Request request) {
        boolean z10;
        synchronized (this.f38808b) {
            try {
                RequestCoordinator requestCoordinator = this.f38807a;
                z10 = (requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this)) && request.equals(this.f38809c) && !isAnyResourceSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean canSetImage(Request request) {
        boolean z10;
        synchronized (this.f38808b) {
            try {
                RequestCoordinator requestCoordinator = this.f38807a;
                z10 = (requestCoordinator == null || requestCoordinator.canSetImage(this)) && (request.equals(this.f38809c) || this.f38811e != RequestCoordinator.RequestState.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public void clear() {
        synchronized (this.f38808b) {
            this.f38813g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f38811e = requestState;
            this.f38812f = requestState;
            this.f38810d.clear();
            this.f38809c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f38808b) {
            try {
                RequestCoordinator requestCoordinator = this.f38807a;
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
        synchronized (this.f38808b) {
            try {
                z10 = this.f38810d.isAnyResourceSet() || this.f38809c.isAnyResourceSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isCleared() {
        boolean z10;
        synchronized (this.f38808b) {
            z10 = this.f38811e == RequestCoordinator.RequestState.CLEARED;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f38808b) {
            z10 = this.f38811e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        if (this.f38809c == null) {
            if (thumbnailRequestCoordinator.f38809c != null) {
                return false;
            }
        } else if (!this.f38809c.isEquivalentTo(thumbnailRequestCoordinator.f38809c)) {
            return false;
        }
        if (this.f38810d == null) {
            if (thumbnailRequestCoordinator.f38810d != null) {
                return false;
            }
        } else if (!this.f38810d.isEquivalentTo(thumbnailRequestCoordinator.f38810d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.Request
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f38808b) {
            z10 = this.f38811e == RequestCoordinator.RequestState.RUNNING;
        }
        return z10;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestFailed(Request request) {
        synchronized (this.f38808b) {
            try {
                if (!request.equals(this.f38809c)) {
                    this.f38812f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.f38811e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f38807a;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestFailed(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void onRequestSuccess(Request request) {
        synchronized (this.f38808b) {
            try {
                if (request.equals(this.f38810d)) {
                    this.f38812f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.f38811e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f38807a;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
                }
                if (!this.f38812f.a()) {
                    this.f38810d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public void pause() {
        synchronized (this.f38808b) {
            try {
                if (!this.f38812f.a()) {
                    this.f38812f = RequestCoordinator.RequestState.PAUSED;
                    this.f38810d.pause();
                }
                if (!this.f38811e.a()) {
                    this.f38811e = RequestCoordinator.RequestState.PAUSED;
                    this.f38809c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setRequests(Request request, Request request2) {
        this.f38809c = request;
        this.f38810d = request2;
    }
}
