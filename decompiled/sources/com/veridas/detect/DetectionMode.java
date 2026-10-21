package com.veridas.detect;

import com.bbva.cellscore.web.model.page.components.TemplateDTO;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/veridas/detect/DetectionMode;", "", ExpectedUserActionOnPoiTypes.NONE, "XML", TemplateDTO.TEMPLATE, "PASSPORT", "RECTANGLE", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class DetectionMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DetectionMode[] $VALUES;
    public static final DetectionMode NONE;
    public static final DetectionMode PASSPORT;
    public static final DetectionMode RECTANGLE;
    public static final DetectionMode TEMPLATE;
    public static final DetectionMode XML;

    static {
        DetectionMode detectionMode = new DetectionMode(ExpectedUserActionOnPoiTypes.NONE, 0);
        NONE = detectionMode;
        DetectionMode detectionMode2 = new DetectionMode("XML", 1);
        XML = detectionMode2;
        DetectionMode detectionMode3 = new DetectionMode(TemplateDTO.TEMPLATE, 2);
        TEMPLATE = detectionMode3;
        DetectionMode detectionMode4 = new DetectionMode("PASSPORT", 3);
        PASSPORT = detectionMode4;
        DetectionMode detectionMode5 = new DetectionMode("RECTANGLE", 4);
        RECTANGLE = detectionMode5;
        DetectionMode[] detectionModeArr = {detectionMode, detectionMode2, detectionMode3, detectionMode4, detectionMode5};
        $VALUES = detectionModeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(detectionModeArr);
    }

    public DetectionMode() {
        throw null;
    }

    @NotNull
    public static EnumEntries<DetectionMode> getEntries() {
        return $ENTRIES;
    }

    public static DetectionMode valueOf(String str) {
        return (DetectionMode) Enum.valueOf(DetectionMode.class, str);
    }

    public static DetectionMode[] values() {
        return (DetectionMode[]) $VALUES.clone();
    }
}
