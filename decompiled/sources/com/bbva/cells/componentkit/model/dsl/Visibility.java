package com.bbva.cells.componentkit.model.dsl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Visibility;", "", "Companion", "$serializer", "Visible", "Invisible", "Gone", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final class Visibility {
    private static final /* synthetic */ Visibility[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final Visibility Gone;
    public static final Visibility Invisible;
    public static final Visibility Visible;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/Visibility$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/Visibility;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<Visibility> serializer() {
            return Visibility$$serializer.INSTANCE;
        }
    }

    static {
        Visibility visibility = new Visibility("Visible", 0);
        Visible = visibility;
        Visibility visibility2 = new Visibility("Invisible", 1);
        Invisible = visibility2;
        Visibility visibility3 = new Visibility("Gone", 2);
        Gone = visibility3;
        $VALUES = new Visibility[]{visibility, visibility2, visibility3};
        INSTANCE = new Companion(null);
    }

    public Visibility() {
        throw null;
    }

    public static Visibility valueOf(String str) {
        return (Visibility) Enum.valueOf(Visibility.class, str);
    }

    public static Visibility[] values() {
        return (Visibility[]) $VALUES.clone();
    }
}
