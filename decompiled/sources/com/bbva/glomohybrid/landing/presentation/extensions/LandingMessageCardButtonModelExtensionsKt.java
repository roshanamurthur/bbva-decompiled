package com.bbva.glomohybrid.landing.presentation.extensions;

import bk.q;
import com.bbva.component.dm.analytics.model.AnalyticsEvent;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingMessageCardButtonModel;
import com.bbva.glomohybrid.landing.presentation.model.LandingAnalyticLinkType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingMessageCardButtonModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\u001a\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003*\u00020\u0000H\u0000\u001a\u0016\u0010\t\u001a\u00020\b*\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\u0004H\u0000¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingMessageCardButtonModel;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "toDeepLink", "", "", "getFormattedNavigationParams", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "user", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingAnalyticLinkType;", "getAnalyticLinkType", "", "isFunnel", "Lcom/bbva/component/dm/analytics/model/AnalyticsEvent;", "getAnalyticsCampaignEvent", "action", "orCloseAnalyticButton", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingMessageCardButtonModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingMessageCardButtonModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingMessageCardButtonModelExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1603#2,9:92\n1855#2:101\n1856#2:104\n1612#2:105\n1#3:102\n1#3:103\n*S KotlinDebug\n*F\n+ 1 LandingMessageCardButtonModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingMessageCardButtonModelExtensionsKt\n*L\n23#1:92,9\n23#1:101\n23#1:104\n23#1:105\n23#1:103\n*E\n"})
public final class LandingMessageCardButtonModelExtensionsKt {

    /* JADX INFO: compiled from: LandingMessageCardButtonModelExtensions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LandingAEMModel.SystemScheme.values().length];
            try {
                iArr[LandingAEMModel.SystemScheme.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LandingAEMModel.SystemScheme.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LandingAEMModel.SystemScheme.DIALER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LandingAEMModel.SystemScheme.INTERNAL_BROWSER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LandingAEMModel.SystemScheme.EXTERNAL_BROWSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LandingAEMModel.SystemScheme.IMMEDIATE_UPDATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final LandingAnalyticLinkType getAnalyticLinkType(@Nullable LandingMessageCardButtonModel landingMessageCardButtonModel, @NotNull UserProfileConfiguration user) {
        String action;
        Intrinsics.checkNotNullParameter(user, "user");
        String navigationType = landingMessageCardButtonModel != null ? landingMessageCardButtonModel.getNavigationType() : null;
        if (!Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.SYSTEM.getValue())) {
            return Intrinsics.areEqual(navigationType, LandingAEMModel.Navigation.ACTION.getValue()) ? UserProfileExtensionsKt.getLandingInteractionLinkAnalytic(user) : UserProfileExtensionsKt.getLandingInternalLinkAnalytic(user);
        }
        List listSplit$default = (landingMessageCardButtonModel == null || (action = landingMessageCardButtonModel.getAction()) == null) ? null : StringsKt__StringsKt.split$default((CharSequence) action, new String[]{LandingAEMModel.INSTANCE.getSYSTEM_DELIMITER()}, false, 2, 2, (Object) null);
        LandingAEMModel.SystemScheme systemSchemeFrom = LandingAEMModel.SystemScheme.INSTANCE.from(listSplit$default != null ? (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default, 0) : null);
        switch (systemSchemeFrom == null ? -1 : WhenMappings.$EnumSwitchMapping$0[systemSchemeFrom.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return UserProfileExtensionsKt.getLandingExternalLinkAnalytic(user);
            default:
                return UserProfileExtensionsKt.getLandingInternalLinkAnalytic(user);
        }
    }

    @NotNull
    public static final AnalyticsEvent getAnalyticsCampaignEvent(@Nullable LandingMessageCardButtonModel landingMessageCardButtonModel, boolean z10, @NotNull UserProfileConfiguration user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (Intrinsics.areEqual(landingMessageCardButtonModel != null ? landingMessageCardButtonModel.getAction() : null, LandingAEMModel.INSTANCE.getACTION_CLOSE())) {
            return UserProfileExtensionsKt.getLandingCloseCampaignEvent(user);
        }
        if (z10) {
            return UserProfileExtensionsKt.getLandingStartCampaignEvent(user);
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return UserProfileExtensionsKt.getLandingCampaignEvent(user);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0078  */
    @Nullable
    public static final Map<String, String> getFormattedNavigationParams(@NotNull LandingMessageCardButtonModel landingMessageCardButtonModel) {
        List listSplit$default;
        Pair pair;
        String str;
        Intrinsics.checkNotNullParameter(landingMessageCardButtonModel, "<this>");
        String navigationParams = landingMessageCardButtonModel.getNavigationParams();
        if (navigationParams == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) navigationParams, new String[]{LandingAEMModel.INSTANCE.getMULTIPLE_PARAMS_DELIMITER()}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{LandingAEMModel.INSTANCE.getCONDITIONS_PARAMS_DELIMITER()}, false, 2, 2, (Object) null);
            String str2 = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default2, 0);
            if (str2 == null) {
                pair = null;
            } else {
                if (!(!l.isBlank(str2))) {
                    str2 = null;
                }
                if (str2 == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(listSplit$default2, 1)) == null) {
                    pair = null;
                } else {
                    if (!(true ^ l.isBlank(str))) {
                        str = null;
                    }
                    if (str != null) {
                        pair = new Pair(str2, str);
                    } else {
                        pair = null;
                    }
                }
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            return q.toMap(arrayList);
        }
        return null;
    }

    @Nullable
    public static final LandingMessageCardButtonModel orCloseAnalyticButton(@Nullable LandingMessageCardButtonModel landingMessageCardButtonModel, @NotNull String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (landingMessageCardButtonModel != null) {
            return landingMessageCardButtonModel;
        }
        LandingAEMModel.Companion companion = LandingAEMModel.INSTANCE;
        return !Intrinsics.areEqual(action, companion.getACTION_CLOSE()) ? landingMessageCardButtonModel : new LandingMessageCardButtonModel("cerrar", "", companion.getACTION_CLOSE(), LandingAEMModel.Navigation.ACTION.getValue(), null, null, 48, null);
    }

    @Nullable
    public static final DeepLinkModel toDeepLink(@NotNull LandingMessageCardButtonModel landingMessageCardButtonModel) {
        Intrinsics.checkNotNullParameter(landingMessageCardButtonModel, "<this>");
        if (Intrinsics.areEqual(landingMessageCardButtonModel.getNavigationType(), LandingAEMModel.Navigation.PRIVATE_CELLS.getValue())) {
            return new DeepLinkModel(null, landingMessageCardButtonModel.getAction(), null, getFormattedNavigationParams(landingMessageCardButtonModel), 4, null);
        }
        return null;
    }
}
