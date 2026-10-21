package org.junit.runner.notification;

import java.io.Serializable;
import org.junit.internal.Throwables;
import org.junit.runner.Description;

/* JADX INFO: loaded from: classes13.dex */
public class Failure implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Description f91999p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Throwable f92000q0;

    public Failure(Description description, Throwable th2) {
        this.f92000q0 = th2;
        this.f91999p0 = description;
    }

    public Description getDescription() {
        return this.f91999p0;
    }

    public Throwable getException() {
        return this.f92000q0;
    }

    public String getMessage() {
        return getException().getMessage();
    }

    public String getTestHeader() {
        return this.f91999p0.getDisplayName();
    }

    public String getTrace() {
        return Throwables.getStacktrace(getException());
    }

    public String getTrimmedTrace() {
        return Throwables.getTrimmedStackTrace(getException());
    }

    public String toString() {
        return getTestHeader() + ": " + this.f92000q0.getMessage();
    }
}
