package com.google.android.play.core.review;

import android.app.PendingIntent;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.1 */
/* JADX INFO: loaded from: classes10.dex */
final class zza extends ReviewInfo {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PendingIntent f46234p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f46235q0;

    public zza(PendingIntent pendingIntent, boolean z10) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f46234p0 = pendingIntent;
        this.f46235q0 = z10;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final PendingIntent a() {
        return this.f46234p0;
    }

    @Override // com.google.android.play.core.review.ReviewInfo
    public final boolean b() {
        return this.f46235q0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f46234p0.equals(reviewInfo.a()) && this.f46235q0 == reviewInfo.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f46234p0.hashCode() ^ 1000003) * 1000003) ^ (true != this.f46235q0 ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f46234p0.toString() + ", isNoOp=" + this.f46235q0 + "}";
    }
}
