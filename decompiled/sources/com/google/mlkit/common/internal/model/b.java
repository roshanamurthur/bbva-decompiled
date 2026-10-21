package com.google.mlkit.common.internal.model;

import androidx.appcompat.app.i;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends ModelUtils.ModelLoggingInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49373c;

    public b(long j10, boolean z10, String str) {
        this.f49371a = j10;
        this.f49372b = str;
        this.f49373c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.ModelLoggingInfo) {
            ModelUtils.ModelLoggingInfo modelLoggingInfo = (ModelUtils.ModelLoggingInfo) obj;
            if (this.f49371a == modelLoggingInfo.getSize() && this.f49372b.equals(modelLoggingInfo.getHash()) && this.f49373c == modelLoggingInfo.isManifestModel()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @KeepForSdk
    public final String getHash() {
        return this.f49372b;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @KeepForSdk
    public final long getSize() {
        return this.f49371a;
    }

    public final int hashCode() {
        long j10 = this.f49371a;
        return ((((((int) ((j10 >>> 32) ^ j10)) ^ 1000003) * 1000003) ^ this.f49372b.hashCode()) * 1000003) ^ (true != this.f49373c ? 1237 : 1231);
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    @KeepForSdk
    public final boolean isManifestModel() {
        return this.f49373c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelLoggingInfo{size=");
        sb2.append(this.f49371a);
        sb2.append(", hash=");
        sb2.append(this.f49372b);
        sb2.append(", manifestModel=");
        return i.c(sb2, this.f49373c, "}");
    }
}
