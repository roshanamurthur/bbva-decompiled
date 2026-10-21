package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import ud.e;

/* JADX INFO: loaded from: classes9.dex */
@Singleton
public class TransportRuntime implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile ud.a f43695e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f43696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f43697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f43698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uploader f43699d;

    @Inject
    public TransportRuntime(@WallTime Clock clock, @Monotonic Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f43696a = clock;
        this.f43697b = clock2;
        this.f43698c = scheduler;
        this.f43699d = uploader;
        workInitializer.ensureContextsScheduled();
    }

    public static TransportRuntime getInstance() {
        ud.a aVar = f43695e;
        if (aVar != null) {
            return aVar.E0.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f43695e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f43695e == null) {
                        ud.a.C0500a c0500a = new ud.a.C0500a();
                        c0500a.f93787a = (Context) Preconditions.checkNotNull(context);
                        f43695e = c0500a.a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Uploader getUploader() {
        return this.f43699d;
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new ud.d(Collections.singleton(Encoding.of("proto")), TransportContext.builder().setBackendName(str).build(), this);
    }

    @Override // ud.e
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f43698c.schedule(sendRequest.d().withPriority(sendRequest.b().getPriority()), EventInternal.builder().setEventMillis(this.f43696a.getTime()).setUptimeMillis(this.f43697b.getTime()).setTransportName(sendRequest.e()).setEncodedPayload(new EncodedPayload(sendRequest.a(), sendRequest.c().apply(sendRequest.b().getPayload()))).setCode(sendRequest.b().getCode()).build(), transportScheduleCallback);
    }

    public TransportFactory newFactory(Destination destination) {
        Set setSingleton;
        if (destination instanceof EncodedDestination) {
            setSingleton = Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings());
        } else {
            setSingleton = Collections.singleton(Encoding.of("proto"));
        }
        return new ud.d(setSingleton, TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }
}
