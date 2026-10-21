package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import androidx.collection.h;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f48751e;

    /* JADX INFO: renamed from: com.google.firebase.remoteconfig.interop.rollouts.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
    public static final class C0216a extends RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f48752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f48753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f48754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f48755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f48756e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f48757f;

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment build() {
            if (this.f48757f == 1 && this.f48752a != null && this.f48753b != null && this.f48754c != null && this.f48755d != null) {
                return new a(this.f48752a, this.f48753b, this.f48754c, this.f48755d, this.f48756e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f48752a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f48753b == null) {
                sb2.append(" variantId");
            }
            if (this.f48754c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f48755d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f48757f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder setParameterKey(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f48754c = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder setParameterValue(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f48755d = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder setRolloutId(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f48752a = str;
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder setTemplateVersion(long j10) {
            this.f48756e = j10;
            this.f48757f = (byte) (this.f48757f | 1);
            return this;
        }

        @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.Builder
        public final RolloutAssignment.Builder setVariantId(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f48753b = str;
            return this;
        }
    }

    public a(String str, String str2, String str3, String str4, long j10) {
        this.f48747a = str;
        this.f48748b = str2;
        this.f48749c = str3;
        this.f48750d = str4;
        this.f48751e = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f48747a.equals(rolloutAssignment.getRolloutId()) && this.f48748b.equals(rolloutAssignment.getVariantId()) && this.f48749c.equals(rolloutAssignment.getParameterKey()) && this.f48750d.equals(rolloutAssignment.getParameterValue()) && this.f48751e == rolloutAssignment.getTemplateVersion();
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public final String getParameterKey() {
        return this.f48749c;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public final String getParameterValue() {
        return this.f48750d;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public final String getRolloutId() {
        return this.f48747a;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    public final long getTemplateVersion() {
        return this.f48751e;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment
    @NonNull
    public final String getVariantId() {
        return this.f48748b;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f48747a.hashCode() ^ 1000003) * 1000003) ^ this.f48748b.hashCode()) * 1000003) ^ this.f48749c.hashCode()) * 1000003) ^ this.f48750d.hashCode()) * 1000003;
        long j10 = this.f48751e;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f48747a);
        sb2.append(", variantId=");
        sb2.append(this.f48748b);
        sb2.append(", parameterKey=");
        sb2.append(this.f48749c);
        sb2.append(", parameterValue=");
        sb2.append(this.f48750d);
        sb2.append(", templateVersion=");
        return h.d(sb2, this.f48751e, "}");
    }
}
