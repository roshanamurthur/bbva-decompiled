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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0003\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/UnitType;", "", "Companion", "$serializer", "SP", "DP", "PX", "componentkit_release"}, k = 1, mv = {1, 6, 0})
@Serializable
public final class UnitType {
    private static final /* synthetic */ UnitType[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final UnitType DP;
    public static final UnitType PX;
    public static final UnitType SP;

    /* JADX INFO: compiled from: Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/bbva/cells/componentkit/model/dsl/UnitType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bbva/cells/componentkit/model/dsl/UnitType;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer<UnitType> serializer() {
            return UnitType$$serializer.INSTANCE;
        }
    }

    static {
        UnitType unitType = new UnitType("SP", 0);
        SP = unitType;
        UnitType unitType2 = new UnitType("DP", 1);
        DP = unitType2;
        UnitType unitType3 = new UnitType("PX", 2);
        PX = unitType3;
        $VALUES = new UnitType[]{unitType, unitType2, unitType3};
        INSTANCE = new Companion(null);
    }

    public UnitType() {
        throw null;
    }

    public static UnitType valueOf(String str) {
        return (UnitType) Enum.valueOf(UnitType.class, str);
    }

    public static UnitType[] values() {
        return (UnitType[]) $VALUES.clone();
    }
}
