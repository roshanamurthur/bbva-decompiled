package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_BackendRequest.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends BackendRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable<EventInternal> f43732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f43733b;

    /* JADX INFO: renamed from: com.google.android.datatransport.runtime.backends.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_BackendRequest.java */
    public static final class C0196a extends BackendRequest.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable<EventInternal> f43734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f43735b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest build() {
            String str = this.f43734a == null ? " events" : "";
            if (str.isEmpty()) {
                return new a(this.f43734a, this.f43735b);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder setEvents(Iterable<EventInternal> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f43734a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public final BackendRequest.Builder setExtras(@Nullable byte[] bArr) {
            this.f43735b = bArr;
            return this;
        }
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f43732a = iterable;
        this.f43733b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f43732a.equals(backendRequest.getEvents())) {
            if (Arrays.equals(this.f43733b, backendRequest instanceof a ? ((a) backendRequest).f43733b : backendRequest.getExtras())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public final Iterable<EventInternal> getEvents() {
        return this.f43732a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    @Nullable
    public final byte[] getExtras() {
        return this.f43733b;
    }

    public final int hashCode() {
        return ((this.f43732a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43733b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f43732a + ", extras=" + Arrays.toString(this.f43733b) + "}";
    }
}
