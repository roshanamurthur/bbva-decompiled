package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: com.google.mlkit:common@@18.11.0 */
/* JADX INFO: loaded from: classes10.dex */
@KeepForSdk
public final class ModelType {

    @NonNull
    @KeepForSdk
    public static final ModelType BASE;

    @NonNull
    @KeepForSdk
    public static final ModelType CUSTOM;

    @NonNull
    @KeepForSdk
    public static final ModelType DIGITAL_INK;

    @NonNull
    @KeepForSdk
    public static final ModelType DIGITAL_INK_SEGMENTATION;

    @NonNull
    @KeepForSdk
    public static final ModelType ENTITY_EXTRACTION;

    @NonNull
    @KeepForSdk
    public static final ModelType IMAGE_CAPTIONING;

    @NonNull
    @KeepForSdk
    public static final ModelType TOXICITY_DETECTION;

    @NonNull
    @KeepForSdk
    public static final ModelType TRANSLATE;

    @NonNull
    @KeepForSdk
    public static final ModelType UNKNOWN;
    private static final /* synthetic */ ModelType[] zza;

    static {
        ModelType modelType = new ModelType("UNKNOWN", 0);
        UNKNOWN = modelType;
        ModelType modelType2 = new ModelType("BASE", 1);
        BASE = modelType2;
        ModelType modelType3 = new ModelType("TRANSLATE", 2);
        TRANSLATE = modelType3;
        ModelType modelType4 = new ModelType("ENTITY_EXTRACTION", 3);
        ENTITY_EXTRACTION = modelType4;
        ModelType modelType5 = new ModelType("CUSTOM", 4);
        CUSTOM = modelType5;
        ModelType modelType6 = new ModelType("DIGITAL_INK", 5);
        DIGITAL_INK = modelType6;
        ModelType modelType7 = new ModelType("DIGITAL_INK_SEGMENTATION", 6);
        DIGITAL_INK_SEGMENTATION = modelType7;
        ModelType modelType8 = new ModelType("TOXICITY_DETECTION", 7);
        TOXICITY_DETECTION = modelType8;
        ModelType modelType9 = new ModelType("IMAGE_CAPTIONING", 8);
        IMAGE_CAPTIONING = modelType9;
        zza = new ModelType[]{modelType, modelType2, modelType3, modelType4, modelType5, modelType6, modelType7, modelType8, modelType9};
    }

    @NonNull
    public static ModelType[] values() {
        return (ModelType[]) zza.clone();
    }
}
