package com.bbva.glomohybrid.shortcuts;

import android.content.Context;
import bk.p;
import com.bancomer.mbanking.R;
import com.bbva.glomoconfig.constants.CountryShortcutConstants;
import com.bbva.glomoconfig.constants.ShortcutConstants;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagRepositoryExtensionKt;
import com.bbva.glomohybrid.featureflags.repository.FeatureFlagsRepository;
import com.bbva.glomohybrid.shortcuts.model.Action;
import com.bbva.glomohybrid.shortcuts.model.AppShortcut;
import com.bbva.glomohybrid.shortcuts.model.AppShortcutsIds;
import com.bbva.glomohybrid.shortcuts.presentation.CountryAppShortcutsContract;
import dk.e;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CountryAppShortcuts.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/CountryAppShortcuts;", "Lcom/bbva/glomohybrid/shortcuts/presentation/CountryAppShortcutsContract;", "Landroid/content/Context;", "context", "", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "getAppShortcutItems", "Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;", "featureFlagsRepository", "<init>", "(Lcom/bbva/glomohybrid/featureflags/repository/FeatureFlagsRepository;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCountryAppShortcuts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryAppShortcuts.kt\ncom/bbva/glomohybrid/shortcuts/CountryAppShortcuts\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n766#2:101\n857#2,2:102\n1045#2:104\n*S KotlinDebug\n*F\n+ 1 CountryAppShortcuts.kt\ncom/bbva/glomohybrid/shortcuts/CountryAppShortcuts\n*L\n97#1:101\n97#1:102,2\n98#1:104\n*E\n"})
public final class CountryAppShortcuts implements CountryAppShortcutsContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FeatureFlagsRepository f34472a;

    public CountryAppShortcuts(@NotNull FeatureFlagsRepository featureFlagsRepository) {
        Intrinsics.checkNotNullParameter(featureFlagsRepository, "featureFlagsRepository");
        this.f34472a = featureFlagsRepository;
    }

    @Override // com.bbva.glomohybrid.shortcuts.presentation.CountryAppShortcutsContract
    @NotNull
    public List<AppShortcut> getAppShortcutItems(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppShortcut[] appShortcutArr = new AppShortcut[6];
        AppShortcutsIds appShortcutsIds = AppShortcutsIds.TRANSFER;
        String string = context.getString(R.string.transfer);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(R.string.transfer);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        String string3 = context.getString(R.string.transfer);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        appShortcutArr[0] = new AppShortcut(appShortcutsIds, string, string2, string3, true, R.drawable.ic_transfer_shortcut, 1, null, p.mapOf(TuplesKt.to(ShortcutConstants.EXTRA_SHORTCUT_ID, CountryShortcutConstants.TRANSFER)), 128, null);
        AppShortcutsIds appShortcutsIds2 = AppShortcutsIds.CARDLESS_WITHDRAWAL;
        String string4 = context.getString(R.string.cardless_withdrawal_short);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        String string5 = context.getString(R.string.cardless_withdrawal_short);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        String string6 = context.getString(R.string.cardless_withdrawal_short);
        Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
        FeatureFlagsRepository featureFlagsRepository = this.f34472a;
        appShortcutArr[1] = new AppShortcut(appShortcutsIds2, string4, string5, string6, true, R.drawable.ic_cardless_with_drawal, FeatureFlagRepositoryExtensionKt.isTopUpEnabled(featureFlagsRepository) ? 3 : 2, null, p.mapOf(TuplesKt.to(ShortcutConstants.EXTRA_SHORTCUT_ID, CountryShortcutConstants.CARDLESS_WITHDRAWAL)), 128, null);
        AppShortcutsIds appShortcutsIds3 = AppShortcutsIds.BILL_PAY;
        String string7 = context.getString(R.string.payment_service);
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        String string8 = context.getString(R.string.payment_service);
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        String string9 = context.getString(R.string.payment_service);
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        appShortcutArr[2] = new AppShortcut(appShortcutsIds3, string7, string8, string9, true, R.drawable.ic_payment_service, FeatureFlagRepositoryExtensionKt.isTopUpEnabled(featureFlagsRepository) ? 5 : 3, null, p.mapOf(TuplesKt.to(ShortcutConstants.EXTRA_SHORTCUT_ID, CountryShortcutConstants.PAYMENT_SERVICE)), 128, null);
        AppShortcutsIds appShortcutsIds4 = AppShortcutsIds.CREDIT_CARD;
        String string10 = context.getString(R.string.rejected_card);
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        String string11 = context.getString(R.string.rejected_card);
        Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
        String string12 = context.getString(R.string.rejected_card);
        Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
        appShortcutArr[3] = new AppShortcut(appShortcutsIds4, string10, string11, string12, true, R.drawable.ic_card, 4, new Action(null, "com.bbva.glomohybrid.splash.presentation.view.SplashActivity", null, 5, null), p.mapOf(TuplesKt.to(ShortcutConstants.EXTRA_SHORTCUT_ID, ShortcutConstants.REJECTED_CARD)));
        AppShortcutsIds appShortcutsIds5 = AppShortcutsIds.TOP_UP;
        String string13 = context.getString(R.string.topUp);
        Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
        String string14 = context.getString(R.string.topUp);
        Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
        String string15 = context.getString(R.string.topUp);
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        appShortcutArr[4] = new AppShortcut(appShortcutsIds5, string13, string14, string15, true, R.drawable.ic_recharge_more, FeatureFlagRepositoryExtensionKt.isTopUpEnabled(featureFlagsRepository) ? 2 : 5, null, p.mapOf(TuplesKt.to(ShortcutConstants.EXTRA_SHORTCUT_ID, CountryShortcutConstants.TOP_UP)), 128, null);
        AppShortcutsIds appShortcutsIds6 = AppShortcutsIds.CREDIT_CARD_PAYMENT;
        String string16 = context.getString(R.string.credit_card_payment);
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        String string17 = context.getString(R.string.credit_card_payment);
        Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
        String string18 = context.getString(R.string.credit_card_payment);
        Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
        appShortcutArr[5] = new AppShortcut(appShortcutsIds6, string16, string17, string18, true, R.drawable.ic_card, 6, null, p.mapOf(TuplesKt.to(ShortcutConstants.EXTRA_SHORTCUT_ID, CountryShortcutConstants.ID_CREDIT_CARD_PAYMENT)), 128, null);
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) appShortcutArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (((AppShortcut) obj).getEnabled()) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.bbva.glomohybrid.shortcuts.CountryAppShortcuts$getAppShortcutItems$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return e.compareValues(Integer.valueOf(((AppShortcut) t10).getRank()), Integer.valueOf(((AppShortcut) t11).getRank()));
            }
        });
    }
}
