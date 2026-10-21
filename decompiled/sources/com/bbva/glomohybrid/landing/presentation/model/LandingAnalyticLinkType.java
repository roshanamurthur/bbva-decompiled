package com.bbva.glomohybrid.landing.presentation.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LandingAnalyticLinkType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingAnalyticLinkType;", "", "INTERNAL", "INTERACTION", "EXTERNAL", "PUBLIC_INTERNAL", "PUBLIC_INTERACTION", "PUBLIC_EXTERNAL", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LandingAnalyticLinkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LandingAnalyticLinkType[] $VALUES;
    public static final LandingAnalyticLinkType EXTERNAL;
    public static final LandingAnalyticLinkType INTERACTION;
    public static final LandingAnalyticLinkType INTERNAL;
    public static final LandingAnalyticLinkType PUBLIC_EXTERNAL;
    public static final LandingAnalyticLinkType PUBLIC_INTERACTION;
    public static final LandingAnalyticLinkType PUBLIC_INTERNAL;

    static {
        LandingAnalyticLinkType landingAnalyticLinkType = new LandingAnalyticLinkType("INTERNAL", 0);
        INTERNAL = landingAnalyticLinkType;
        LandingAnalyticLinkType landingAnalyticLinkType2 = new LandingAnalyticLinkType("INTERACTION", 1);
        INTERACTION = landingAnalyticLinkType2;
        LandingAnalyticLinkType landingAnalyticLinkType3 = new LandingAnalyticLinkType("EXTERNAL", 2);
        EXTERNAL = landingAnalyticLinkType3;
        LandingAnalyticLinkType landingAnalyticLinkType4 = new LandingAnalyticLinkType("PUBLIC_INTERNAL", 3);
        PUBLIC_INTERNAL = landingAnalyticLinkType4;
        LandingAnalyticLinkType landingAnalyticLinkType5 = new LandingAnalyticLinkType("PUBLIC_INTERACTION", 4);
        PUBLIC_INTERACTION = landingAnalyticLinkType5;
        LandingAnalyticLinkType landingAnalyticLinkType6 = new LandingAnalyticLinkType("PUBLIC_EXTERNAL", 5);
        PUBLIC_EXTERNAL = landingAnalyticLinkType6;
        LandingAnalyticLinkType[] landingAnalyticLinkTypeArr = {landingAnalyticLinkType, landingAnalyticLinkType2, landingAnalyticLinkType3, landingAnalyticLinkType4, landingAnalyticLinkType5, landingAnalyticLinkType6};
        $VALUES = landingAnalyticLinkTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(landingAnalyticLinkTypeArr);
    }

    public LandingAnalyticLinkType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LandingAnalyticLinkType> getEntries() {
        return $ENTRIES;
    }

    public static LandingAnalyticLinkType valueOf(String str) {
        return (LandingAnalyticLinkType) Enum.valueOf(LandingAnalyticLinkType.class, str);
    }

    public static LandingAnalyticLinkType[] values() {
        return (LandingAnalyticLinkType[]) $VALUES.clone();
    }
}
