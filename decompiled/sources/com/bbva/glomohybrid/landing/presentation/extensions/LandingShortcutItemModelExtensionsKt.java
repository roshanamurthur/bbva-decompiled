package com.bbva.glomohybrid.landing.presentation.extensions;

import com.bbva.cells.componentkit.model.dsl.SettingsKt;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.component.ui.shortcuts.model.ShortcutItem;
import com.bbva.glomo.user.domain.model.UserProfileConfiguration;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingAEMModel;
import com.bbva.glomohybrid.landing.domain.aem.model.LandingShortcutItemModel;
import com.bbva.glomohybrid.landing.presentation.model.LandingAnalyticLinkType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import m9.e;
import m9.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingShortcutItemModelExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0001H\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\n"}, d2 = {"", "Lcom/bbva/glomohybrid/landing/domain/aem/model/LandingShortcutItemModel;", "Lcom/bbva/component/ui/shortcuts/model/ShortcutItem;", "toView", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "toDeepLink", "Lcom/bbva/glomo/user/domain/model/UserProfileConfiguration;", "user", "Lcom/bbva/glomohybrid/landing/presentation/model/LandingAnalyticLinkType;", "getAnalyticLinkType", "Landing_mexicoRelease"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingShortcutItemModelExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingShortcutItemModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingShortcutItemModelExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1549#2:62\n1620#2,3:63\n*S KotlinDebug\n*F\n+ 1 LandingShortcutItemModelExtensions.kt\ncom/bbva/glomohybrid/landing/presentation/extensions/LandingShortcutItemModelExtensionsKt\n*L\n16#1:62\n16#1:63,3\n*E\n"})
public final class LandingShortcutItemModelExtensionsKt {

    /* JADX INFO: compiled from: LandingShortcutItemModelExtensions.kt */
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
                iArr[LandingAEMModel.SystemScheme.DIALER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LandingAEMModel.SystemScheme.EXTERNAL_BROWSER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final LandingAnalyticLinkType getAnalyticLinkType(@NotNull LandingShortcutItemModel landingShortcutItemModel, @NotNull UserProfileConfiguration user) {
        Intrinsics.checkNotNullParameter(landingShortcutItemModel, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        if (!Intrinsics.areEqual(landingShortcutItemModel.getNavigationType(), LandingAEMModel.Navigation.SYSTEM.getValue())) {
            return UserProfileExtensionsKt.getLandingInternalLinkAnalytic(user);
        }
        LandingAEMModel.SystemScheme systemSchemeFrom = LandingAEMModel.SystemScheme.INSTANCE.from((String) CollectionsKt___CollectionsKt.getOrNull(StringsKt__StringsKt.split$default((CharSequence) landingShortcutItemModel.getRoute(), new String[]{LandingAEMModel.INSTANCE.getSYSTEM_DELIMITER()}, false, 2, 2, (Object) null), 0));
        int i10 = systemSchemeFrom == null ? -1 : WhenMappings.$EnumSwitchMapping$0[systemSchemeFrom.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? UserProfileExtensionsKt.getLandingExternalLinkAnalytic(user) : UserProfileExtensionsKt.getLandingInternalLinkAnalytic(user);
    }

    @Nullable
    public static final DeepLinkModel toDeepLink(@NotNull LandingShortcutItemModel landingShortcutItemModel) {
        Intrinsics.checkNotNullParameter(landingShortcutItemModel, "<this>");
        if (Intrinsics.areEqual(landingShortcutItemModel.getNavigationType(), LandingAEMModel.Navigation.PRIVATE_CELLS.getValue())) {
            return new DeepLinkModel(null, landingShortcutItemModel.getRoute(), null, null, 12, null);
        }
        return null;
    }

    @NotNull
    public static final List<ShortcutItem> toView(@NotNull List<LandingShortcutItemModel> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<LandingShortcutItemModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(toView((LandingShortcutItemModel) it.next()));
        }
        return arrayList;
    }

    @NotNull
    public static final ShortcutItem toView(@NotNull LandingShortcutItemModel landingShortcutItemModel) {
        Intrinsics.checkNotNullParameter(landingShortcutItemModel, "<this>");
        return new ShortcutItem(landingShortcutItemModel.getRoute(), SettingsKt.imageSettings(new e(landingShortcutItemModel)), SettingsKt.textSettings(new f(landingShortcutItemModel.getText())), (ViewSettings) null, 8, (DefaultConstructorMarker) null);
    }
}
