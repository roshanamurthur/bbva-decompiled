package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import ud.e;

/* JADX INFO: compiled from: TransportImpl.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d<T> implements Transport<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportContext f43744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Encoding f43746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer<T, byte[]> f43747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f43748e;

    public d(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, e eVar) {
        this.f43744a = transportContext;
        this.f43745b = str;
        this.f43746c = encoding;
        this.f43747d = transformer;
        this.f43748e = eVar;
    }

    @Override // com.google.android.datatransport.Transport
    public final void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        b.a aVar = new b.a();
        aVar.setTransportContext(this.f43744a);
        aVar.b(event);
        aVar.setTransportName(this.f43745b);
        aVar.c(this.f43747d);
        aVar.a(this.f43746c);
        this.f43748e.send(aVar.build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public final void send(Event<T> event) {
        schedule(event, new ad.e());
    }
}
