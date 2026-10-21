package com.bbva.glomohybrid.landing.domain.aem.model;

import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingAEMModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0010\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0003\u001c\u001d\u001eBG\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPriority", "()I", "priority", "", "", "b", "Ljava/util/List;", "getConditions", "()Ljava/util/List;", "conditions", "", "c", "Ljava/util/Map;", "getAnalytics", "()Ljava/util/Map;", LandingAEMContentMapper.ANALYTICS, "d", "Ljava/lang/String;", "getEpiCampaignName", "()Ljava/lang/String;", LandingAEMContentMapper.EPI_CAMPAIGN_NAME, "<init>", "(ILjava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "Companion", "Navigation", "SystemScheme", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public class LandingAEMModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final String f32623e = DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f32624f = ReplenishLogic.ID_SEPARATOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f32625g = "://";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f32626h = HearingDisabilitiesConstants.CLOSE_MODAL;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int priority;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<String> conditions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, String> analytics;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String epiCampaignName;

    /* JADX INFO: compiled from: LandingAEMModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel$Companion;", "", "()V", "ACTION_CLOSE", "", "getACTION_CLOSE", "()Ljava/lang/String;", "CONDITIONS_PARAMS_DELIMITER", "getCONDITIONS_PARAMS_DELIMITER", "MULTIPLE_PARAMS_DELIMITER", "getMULTIPLE_PARAMS_DELIMITER", "SYSTEM_DELIMITER", "getSYSTEM_DELIMITER", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getACTION_CLOSE() {
            return LandingAEMModel.f32626h;
        }

        @NotNull
        public final String getCONDITIONS_PARAMS_DELIMITER() {
            return LandingAEMModel.f32623e;
        }

        @NotNull
        public final String getMULTIPLE_PARAMS_DELIMITER() {
            return LandingAEMModel.f32624f;
        }

        @NotNull
        public final String getSYSTEM_DELIMITER() {
            return LandingAEMModel.f32625g;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel$Navigation[], still in use, count: 1, list:
      (r6v3 com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel$Navigation[]) from 0x003d: INVOKE (r6v3 com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel$Navigation[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:62)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: LandingAEMModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel$Navigation;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "CELLS", "PRIVATE_CELLS", "SYSTEM", "ACTION", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class Navigation {
        CELLS("cells"),
        PRIVATE_CELLS("cellsDeepLink"),
        SYSTEM("system"),
        ACTION("action");

        private static final /* synthetic */ EnumEntries $ENTRIES;

        @NotNull
        private final String value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(navigationArr);
        }

        public Navigation(String str) {
            super(str, i);
            this.value = str;
        }

        @NotNull
        public static EnumEntries<Navigation> getEntries() {
            return $ENTRIES;
        }

        public static Navigation valueOf(String str) {
            return (Navigation) Enum.valueOf(Navigation.class, str);
        }

        public static Navigation[] values() {
            return (Navigation[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel$SystemScheme[], still in use, count: 1, list:
      (r12v3 com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel$SystemScheme[]) from 0x0067: INVOKE (r12v3 com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel$SystemScheme[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:104)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: LandingAEMModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel$SystemScheme;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "APP", "DIALER", "MARKET", "EXTERNAL_BROWSER", "INTERNAL_BROWSER", "INTERNAL_BROWSER_ON_BOARDING", "IMMEDIATE_UPDATE", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final class SystemScheme {
        APP("app"),
        DIALER("phone"),
        MARKET(Action.TYPE_MARKET),
        EXTERNAL_BROWSER("external-browser"),
        INTERNAL_BROWSER("internal-browser"),
        INTERNAL_BROWSER_ON_BOARDING("internal-browser-onboarding"),
        IMMEDIATE_UPDATE("immediate-update");

        private static final /* synthetic */ EnumEntries $ENTRIES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final String value;

        /* JADX INFO: compiled from: LandingAEMModel.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel$SystemScheme$Companion;", "", "()V", "from", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingAEMModel$SystemScheme;", "value", "", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final SystemScheme from(@Nullable String value) {
                SystemScheme systemScheme = SystemScheme.APP;
                if (Intrinsics.areEqual(value, systemScheme.getValue())) {
                    return systemScheme;
                }
                SystemScheme systemScheme2 = SystemScheme.DIALER;
                if (Intrinsics.areEqual(value, systemScheme2.getValue())) {
                    return systemScheme2;
                }
                SystemScheme systemScheme3 = SystemScheme.MARKET;
                if (Intrinsics.areEqual(value, systemScheme3.getValue())) {
                    return systemScheme3;
                }
                SystemScheme systemScheme4 = SystemScheme.EXTERNAL_BROWSER;
                if (Intrinsics.areEqual(value, systemScheme4.getValue())) {
                    return systemScheme4;
                }
                SystemScheme systemScheme5 = SystemScheme.INTERNAL_BROWSER;
                if (Intrinsics.areEqual(value, systemScheme5.getValue())) {
                    return systemScheme5;
                }
                SystemScheme systemScheme6 = SystemScheme.INTERNAL_BROWSER_ON_BOARDING;
                if (Intrinsics.areEqual(value, systemScheme6.getValue())) {
                    return systemScheme6;
                }
                SystemScheme systemScheme7 = SystemScheme.IMMEDIATE_UPDATE;
                if (Intrinsics.areEqual(value, systemScheme7.getValue())) {
                    return systemScheme7;
                }
                return null;
            }
        }

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(new SystemScheme[]{r0, r1, r2, r4, r6, r8, r10});
        }

        public SystemScheme(String str) {
            super(str, i);
            this.value = str;
        }

        @NotNull
        public static EnumEntries<SystemScheme> getEntries() {
            return $ENTRIES;
        }

        public static SystemScheme valueOf(String str) {
            return (SystemScheme) Enum.valueOf(SystemScheme.class, str);
        }

        public static SystemScheme[] values() {
            return (SystemScheme[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public LandingAEMModel() {
        this(0, null, null, null, 15, null);
    }

    @Nullable
    public Map<String, String> getAnalytics() {
        return this.analytics;
    }

    @Nullable
    public List<String> getConditions() {
        return this.conditions;
    }

    @Nullable
    public String getEpiCampaignName() {
        return this.epiCampaignName;
    }

    public int getPriority() {
        return this.priority;
    }

    public LandingAEMModel(int i10, @Nullable List<String> list, @Nullable Map<String, String> map, @Nullable String str) {
        this.priority = i10;
        this.conditions = list;
        this.analytics = map;
        this.epiCampaignName = str;
    }

    public /* synthetic */ LandingAEMModel(int i10, List list, Map map, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : str);
    }
}
