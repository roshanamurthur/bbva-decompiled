package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import java.util.Arrays;

/* JADX INFO: compiled from: AutoValue_TransportContext.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c extends TransportContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f43739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Priority f43740c;

    /* JADX INFO: compiled from: AutoValue_TransportContext.java */
    public static final class a extends TransportContext.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f43742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Priority f43743c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext build() {
            String strConcat = this.f43741a == null ? " backendName" : "";
            if (this.f43743c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new c(this.f43741a, this.f43742b, this.f43743c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder setBackendName(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f43741a = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder setExtras(@Nullable byte[] bArr) {
            this.f43742b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public final TransportContext.Builder setPriority(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.f43743c = priority;
            return this;
        }
    }

    public c(String str, byte[] bArr, Priority priority) {
        this.f43738a = str;
        this.f43739b = bArr;
        this.f43740c = priority;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f43738a.equals(transportContext.getBackendName())) {
            if (Arrays.equals(this.f43739b, transportContext instanceof c ? ((c) transportContext).f43739b : transportContext.getExtras()) && this.f43740c.equals(transportContext.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public final String getBackendName() {
        return this.f43738a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @Nullable
    public final byte[] getExtras() {
        return this.f43739b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Priority getPriority() {
        return this.f43740c;
    }

    public final int hashCode() {
        return ((((this.f43738a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43739b)) * 1000003) ^ this.f43740c.hashCode();
    }
}
