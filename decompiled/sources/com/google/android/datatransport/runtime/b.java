package com.google.android.datatransport.runtime;

import androidx.camera.camera2.internal.compat.u;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;

/* JADX INFO: compiled from: AutoValue_SendRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b extends SendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportContext f43717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Event<?> f43719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Transformer<?, byte[]> f43720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Encoding f43721e;

    /* JADX INFO: compiled from: AutoValue_SendRequest.java */
    public static final class a extends SendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TransportContext f43722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Event<?> f43724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Transformer<?, byte[]> f43725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Encoding f43726e;

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public final a a(Encoding encoding) {
            if (encoding == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f43726e = encoding;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public final a b(Event event) {
            if (event == null) {
                throw new NullPointerException("Null event");
            }
            this.f43724c = event;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public final SendRequest build() {
            String strF = this.f43722a == null ? " transportContext" : "";
            if (this.f43723b == null) {
                strF = strF.concat(" transportName");
            }
            if (this.f43724c == null) {
                strF = u.f(strF, " event");
            }
            if (this.f43725d == null) {
                strF = u.f(strF, " transformer");
            }
            if (this.f43726e == null) {
                strF = u.f(strF, " encoding");
            }
            if (strF.isEmpty()) {
                return new b(this.f43722a, this.f43723b, this.f43724c, this.f43725d, this.f43726e);
            }
            throw new IllegalStateException("Missing required properties:".concat(strF));
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public final a c(Transformer transformer) {
            if (transformer == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f43725d = transformer;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public final SendRequest.Builder setTransportContext(TransportContext transportContext) {
            if (transportContext == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f43722a = transportContext;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.SendRequest.Builder
        public final SendRequest.Builder setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f43723b = str;
            return this;
        }
    }

    public b(TransportContext transportContext, String str, Event event, Transformer transformer, Encoding encoding) {
        this.f43717a = transportContext;
        this.f43718b = str;
        this.f43719c = event;
        this.f43720d = transformer;
        this.f43721e = encoding;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Encoding a() {
        return this.f43721e;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Event<?> b() {
        return this.f43719c;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final Transformer<?, byte[]> c() {
        return this.f43720d;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final TransportContext d() {
        return this.f43717a;
    }

    @Override // com.google.android.datatransport.runtime.SendRequest
    public final String e() {
        return this.f43718b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendRequest)) {
            return false;
        }
        SendRequest sendRequest = (SendRequest) obj;
        return this.f43717a.equals(sendRequest.d()) && this.f43718b.equals(sendRequest.e()) && this.f43719c.equals(sendRequest.b()) && this.f43720d.equals(sendRequest.c()) && this.f43721e.equals(sendRequest.a());
    }

    public final int hashCode() {
        return ((((((((this.f43717a.hashCode() ^ 1000003) * 1000003) ^ this.f43718b.hashCode()) * 1000003) ^ this.f43719c.hashCode()) * 1000003) ^ this.f43720d.hashCode()) * 1000003) ^ this.f43721e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f43717a + ", transportName=" + this.f43718b + ", event=" + this.f43719c + ", transformer=" + this.f43720d + ", encoding=" + this.f43721e + "}";
    }
}
