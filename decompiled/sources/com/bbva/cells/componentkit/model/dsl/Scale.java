package com.bbva.cells.componentkit.model.dsl;

import com.bbva.image.transform.CenterCropImageTransformer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Scale;", "", "Companion", "$serializer", "Center", CenterCropImageTransformer.ID, "FitXY", "FitCenter", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final class Scale {
    private static final /* synthetic */ Scale[] $VALUES;
    public static final Scale Center;
    public static final Scale CenterCrop;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Scale FitCenter;
    public static final Scale FitXY;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Scale$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/Scale;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Scale> serializer() {
            return Scale$$serializer.INSTANCE;
        }
    }

    static {
        Scale scale = new Scale("Center", 0);
        Center = scale;
        Scale scale2 = new Scale(CenterCropImageTransformer.ID, 1);
        CenterCrop = scale2;
        Scale scale3 = new Scale("FitXY", 2);
        FitXY = scale3;
        Scale scale4 = new Scale("FitCenter", 3);
        FitCenter = scale4;
        $VALUES = new Scale[]{scale, scale2, scale3, scale4};
        INSTANCE = new Companion(null);
    }

    public Scale() {
        throw null;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) $VALUES.clone();
    }
}
