package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.i;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class RequestTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Request> f38700a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f38701b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38702c;

    public boolean clearAndRemove(@Nullable Request request) {
        boolean z10 = true;
        if (request == null) {
            return true;
        }
        boolean zRemove = this.f38700a.remove(request);
        if (!this.f38701b.remove(request) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            request.clear();
        }
        return z10;
    }

    public void clearRequests() {
        Iterator it = Util.getSnapshot(this.f38700a).iterator();
        while (it.hasNext()) {
            clearAndRemove((Request) it.next());
        }
        this.f38701b.clear();
    }

    public boolean isPaused() {
        return this.f38702c;
    }

    public void pauseAllRequests() {
        this.f38702c = true;
        for (Request request : Util.getSnapshot(this.f38700a)) {
            if (request.isRunning() || request.isComplete()) {
                request.clear();
                this.f38701b.add(request);
            }
        }
    }

    public void pauseRequests() {
        this.f38702c = true;
        for (Request request : Util.getSnapshot(this.f38700a)) {
            if (request.isRunning()) {
                request.pause();
                this.f38701b.add(request);
            }
        }
    }

    public void restartRequests() {
        for (Request request : Util.getSnapshot(this.f38700a)) {
            if (!request.isComplete() && !request.isCleared()) {
                request.clear();
                if (this.f38702c) {
                    this.f38701b.add(request);
                } else {
                    request.begin();
                }
            }
        }
    }

    public void resumeRequests() {
        this.f38702c = false;
        for (Request request : Util.getSnapshot(this.f38700a)) {
            if (!request.isComplete() && !request.isRunning()) {
                request.begin();
            }
        }
        this.f38701b.clear();
    }

    public void runRequest(@NonNull Request request) {
        this.f38700a.add(request);
        if (!this.f38702c) {
            request.begin();
        } else {
            request.clear();
            this.f38701b.add(request);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{numRequests=");
        sb2.append(this.f38700a.size());
        sb2.append(", isPaused=");
        return i.c(sb2, this.f38702c, "}");
    }
}
