package com.bbva.cellswidgets.edittext;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: CellsInputType.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/bbva/cellswidgets/edittext/CellsInputType;", "", "Companion", "DEFAULT", "NUMBER", "PASSWORD", "PASSWORD_NUMBER", "CUSTOM", "PASSWORD_CUSTOM", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
public final class CellsInputType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CellsInputType[] $VALUES;
    public static final CellsInputType CUSTOM;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final CellsInputType DEFAULT;

    @NotNull
    public static final String INPUT_TYPE_CUSTOM = "custom";

    @NotNull
    public static final String INPUT_TYPE_CUSTOM_PASSWORD = "customPassword";

    @NotNull
    public static final String INPUT_TYPE_DEFAULT = "default";

    @NotNull
    public static final String INPUT_TYPE_NUMBER = "number";

    @NotNull
    public static final String INPUT_TYPE_NUMBER_PASSWORD = "numberPassword";

    @NotNull
    public static final String INPUT_TYPE_PASSWORD = "password";
    public static final CellsInputType NUMBER;
    public static final CellsInputType PASSWORD;
    public static final CellsInputType PASSWORD_CUSTOM;
    public static final CellsInputType PASSWORD_NUMBER;

    /* JADX INFO: compiled from: CellsInputType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bbva/cellswidgets/edittext/CellsInputType$Companion;", "", "()V", "INPUT_TYPE_CUSTOM", "", "INPUT_TYPE_CUSTOM_PASSWORD", "INPUT_TYPE_DEFAULT", "INPUT_TYPE_NUMBER", "INPUT_TYPE_NUMBER_PASSWORD", "INPUT_TYPE_PASSWORD", "from", "Lcom/bbva/cellswidgets/edittext/CellsInputType;", "value", TypedValues.TransitionType.S_TO, "", "type", "mask", "cells-widgets_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: CellsInputType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CellsInputType.values().length];
                try {
                    iArr[CellsInputType.NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CellsInputType.PASSWORD_NUMBER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CellsInputType.PASSWORD.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CellsInputType.CUSTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CellsInputType.PASSWORD_CUSTOM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[CellsInputType.DEFAULT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ int to$default(Companion companion, CellsInputType cellsInputType, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.to(cellsInputType, str);
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final CellsInputType from(@Nullable String value) {
            if (value != null) {
                switch (value.hashCode()) {
                    case -1602967252:
                        if (value.equals("customPassword")) {
                            return CellsInputType.PASSWORD_CUSTOM;
                        }
                        break;
                    case -1349088399:
                        if (value.equals("custom")) {
                            return CellsInputType.CUSTOM;
                        }
                        break;
                    case -1034364087:
                        if (value.equals("number")) {
                            return CellsInputType.NUMBER;
                        }
                        break;
                    case 154509572:
                        if (value.equals("numberPassword")) {
                            return CellsInputType.PASSWORD_NUMBER;
                        }
                        break;
                    case 1216985755:
                        if (value.equals("password")) {
                            return CellsInputType.PASSWORD;
                        }
                        break;
                    case 1544803905:
                        if (value.equals("default")) {
                            return CellsInputType.DEFAULT;
                        }
                        break;
                }
            }
            return CellsInputType.DEFAULT;
        }

        public final int to(@NotNull CellsInputType type, @Nullable String mask) {
            Intrinsics.checkNotNullParameter(type, "type");
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    return 2;
                case 2:
                    return 18;
                case 3:
                case 5:
                    return 129;
                case 4:
                    return 1;
                case 6:
                    return ((mask == null || l.isBlank(mask)) ? 0 : 144) | 1;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        CellsInputType cellsInputType = new CellsInputType("DEFAULT", 0);
        DEFAULT = cellsInputType;
        CellsInputType cellsInputType2 = new CellsInputType("NUMBER", 1);
        NUMBER = cellsInputType2;
        CellsInputType cellsInputType3 = new CellsInputType("PASSWORD", 2);
        PASSWORD = cellsInputType3;
        CellsInputType cellsInputType4 = new CellsInputType("PASSWORD_NUMBER", 3);
        PASSWORD_NUMBER = cellsInputType4;
        CellsInputType cellsInputType5 = new CellsInputType("CUSTOM", 4);
        CUSTOM = cellsInputType5;
        CellsInputType cellsInputType6 = new CellsInputType("PASSWORD_CUSTOM", 5);
        PASSWORD_CUSTOM = cellsInputType6;
        CellsInputType[] cellsInputTypeArr = {cellsInputType, cellsInputType2, cellsInputType3, cellsInputType4, cellsInputType5, cellsInputType6};
        $VALUES = cellsInputTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(cellsInputTypeArr);
        INSTANCE = new Companion(null);
    }

    public CellsInputType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<CellsInputType> getEntries() {
        return $ENTRIES;
    }

    public static CellsInputType valueOf(String str) {
        return (CellsInputType) Enum.valueOf(CellsInputType.class, str);
    }

    public static CellsInputType[] values() {
        return (CellsInputType[]) $VALUES.clone();
    }
}
