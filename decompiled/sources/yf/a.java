package yf;

import com.google.firebase.crashlytics.internal.metadata.RolloutAssignment;

/* JADX INFO: compiled from: AutoValue_RolloutAssignment.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f94800e;

    public a(String str, String str2, String str3, String str4, long j10) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f94796a = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f94797b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f94798c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f94799d = str4;
        this.f94800e = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        return this.f94796a.equals(rolloutAssignment.getRolloutId()) && this.f94797b.equals(rolloutAssignment.getParameterKey()) && this.f94798c.equals(rolloutAssignment.getParameterValue()) && this.f94799d.equals(rolloutAssignment.getVariantId()) && this.f94800e == rolloutAssignment.getTemplateVersion();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String getParameterKey() {
        return this.f94797b;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String getParameterValue() {
        return this.f94798c;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String getRolloutId() {
        return this.f94796a;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final long getTemplateVersion() {
        return this.f94800e;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.RolloutAssignment
    public final String getVariantId() {
        return this.f94799d;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f94796a.hashCode() ^ 1000003) * 1000003) ^ this.f94797b.hashCode()) * 1000003) ^ this.f94798c.hashCode()) * 1000003) ^ this.f94799d.hashCode()) * 1000003;
        long j10 = this.f94800e;
        return iHashCode ^ ((int) ((j10 >>> 32) ^ j10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutId=");
        sb2.append(this.f94796a);
        sb2.append(", parameterKey=");
        sb2.append(this.f94797b);
        sb2.append(", parameterValue=");
        sb2.append(this.f94798c);
        sb2.append(", variantId=");
        sb2.append(this.f94799d);
        sb2.append(", templateVersion=");
        return androidx.collection.h.d(sb2, this.f94800e, "}");
    }
}
