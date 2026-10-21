package com.google.mlkit.common.internal.model;

import ad.d;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends ModelUtils.AutoMLManifest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49370c;

    public a(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null modelType");
        }
        this.f49368a = str;
        if (str2 == null) {
            throw new NullPointerException("Null modelFile");
        }
        this.f49369b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null labelsFile");
        }
        this.f49370c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.AutoMLManifest) {
            ModelUtils.AutoMLManifest autoMLManifest = (ModelUtils.AutoMLManifest) obj;
            if (this.f49368a.equals(autoMLManifest.getModelType()) && this.f49369b.equals(autoMLManifest.getModelFile()) && this.f49370c.equals(autoMLManifest.getLabelsFile())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public final String getLabelsFile() {
        return this.f49370c;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public final String getModelFile() {
        return this.f49369b;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    @KeepForSdk
    public final String getModelType() {
        return this.f49368a;
    }

    public final int hashCode() {
        return ((((this.f49368a.hashCode() ^ 1000003) * 1000003) ^ this.f49369b.hashCode()) * 1000003) ^ this.f49370c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoMLManifest{modelType=");
        sb2.append(this.f49368a);
        sb2.append(", modelFile=");
        sb2.append(this.f49369b);
        sb2.append(", labelsFile=");
        return d.f(sb2, this.f49370c, "}");
    }
}
