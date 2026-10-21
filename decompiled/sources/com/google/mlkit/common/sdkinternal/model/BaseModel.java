package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public final class BaseModel {

    @NonNull
    @KeepForSdk
    public static final BaseModel ENTITY_EXTRACTION;

    @NonNull
    @KeepForSdk
    public static final BaseModel IMAGE_CAPTIONING;

    @NonNull
    @KeepForSdk
    public static final BaseModel TOXICITY_DETECTION;

    @NonNull
    @KeepForSdk
    public static final BaseModel TRANSLATE;

    @NonNull
    public static final BaseModel zza;

    @NonNull
    public static final BaseModel zzb;
    private static final /* synthetic */ BaseModel[] zzc;

    static {
        BaseModel baseModel = new BaseModel("FACE_DETECTION", 0);
        zza = baseModel;
        BaseModel baseModel2 = new BaseModel("SMART_REPLY", 1);
        zzb = baseModel2;
        BaseModel baseModel3 = new BaseModel("TRANSLATE", 2);
        TRANSLATE = baseModel3;
        BaseModel baseModel4 = new BaseModel("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = baseModel4;
        BaseModel baseModel5 = new BaseModel("TOXICITY_DETECTION", 4);
        TOXICITY_DETECTION = baseModel5;
        BaseModel baseModel6 = new BaseModel("IMAGE_CAPTIONING", 5);
        IMAGE_CAPTIONING = baseModel6;
        zzc = new BaseModel[]{baseModel, baseModel2, baseModel3, baseModel4, baseModel5, baseModel6};
    }

    @NonNull
    public static BaseModel[] values() {
        return (BaseModel[]) zzc.clone();
    }
}
