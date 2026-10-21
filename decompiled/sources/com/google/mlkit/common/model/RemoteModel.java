package com.google.mlkit.common.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.BaseModel;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class RemoteModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumMap f49393e = new EnumMap(BaseModel.class);

    @NonNull
    @VisibleForTesting
    public static final Map zza = new EnumMap(BaseModel.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f49394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final BaseModel f49395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ModelType f49396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f49397d;

    @KeepForSdk
    public RemoteModel(@Nullable String str, @Nullable BaseModel baseModel, @NonNull ModelType modelType) {
        Preconditions.checkArgument(TextUtils.isEmpty(str) == (baseModel != null), "One of cloud model name and base model cannot be empty");
        this.f49394a = str;
        this.f49395b = baseModel;
        this.f49396c = modelType;
    }

    @KeepForSdk
    public boolean baseModelHashMatches(@NonNull String str) {
        BaseModel baseModel = this.f49395b;
        if (baseModel == null) {
            return false;
        }
        return str.equals(f49393e.get(baseModel));
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteModel)) {
            return false;
        }
        RemoteModel remoteModel = (RemoteModel) obj;
        return Objects.equal(this.f49394a, remoteModel.f49394a) && Objects.equal(this.f49395b, remoteModel.f49395b) && Objects.equal(this.f49396c, remoteModel.f49396c);
    }

    @NonNull
    @KeepForSdk
    public String getModelHash() {
        return this.f49397d;
    }

    @Nullable
    @KeepForSdk
    public String getModelName() {
        return this.f49394a;
    }

    @NonNull
    @KeepForSdk
    public String getModelNameForBackend() {
        String str = this.f49394a;
        if (str != null) {
            return str;
        }
        return (String) zza.get(this.f49395b);
    }

    @NonNull
    @KeepForSdk
    public ModelType getModelType() {
        return this.f49396c;
    }

    @NonNull
    @KeepForSdk
    public String getUniqueModelNameForPersist() {
        String str = this.f49394a;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) zza.get(this.f49395b)));
    }

    public int hashCode() {
        return Objects.hashCode(this.f49394a, this.f49395b, this.f49396c);
    }

    @KeepForSdk
    public boolean isBaseModel() {
        return this.f49395b != null;
    }

    @KeepForSdk
    public void setModelHash(@NonNull String str) {
        this.f49397d = str;
    }

    @NonNull
    public String toString() {
        zzq zzqVarZzb = zzr.zzb("RemoteModel");
        zzqVarZzb.zza("modelName", this.f49394a);
        zzqVarZzb.zza("baseModel", this.f49395b);
        zzqVarZzb.zza("modelType", this.f49396c);
        return zzqVarZzb.toString();
    }
}
