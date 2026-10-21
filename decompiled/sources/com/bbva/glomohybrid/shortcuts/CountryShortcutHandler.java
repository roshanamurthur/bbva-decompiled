package com.bbva.glomohybrid.shortcuts;

import com.bbva.glomoconfig.constants.CountryShortcutConstants;
import com.bbva.glomohybrid.base.behaviors.HandlerShortcutBehaviour;
import com.bbva.glomohybrid.base.extensions.ShortcutExtensionKt;
import com.bbva.glomohybrid.base.models.ShortcutModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CountryShortcutHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/CountryShortcutHandler;", "Lcom/bbva/glomohybrid/base/behaviors/HandlerShortcutBehaviour;", "", "shortcutId", "Lcom/bbva/glomohybrid/base/models/ShortcutModel;", "handle", "<init>", "()V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class CountryShortcutHandler implements HandlerShortcutBehaviour {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ShortcutModel f34476a = new ShortcutModel(ShortcutExtensionKt.PRIVATE_SHORTCUT_MANAGER_KEY, CountryShortcutConstants.TRANSFER_PAGE, null, 4, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ShortcutModel f34477b = new ShortcutModel(ShortcutExtensionKt.PRIVATE_SHORTCUT_MANAGER_KEY, CountryShortcutConstants.CARDLESS_WITHDRAWAL_PAGE, null, 4, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ShortcutModel f34478c = new ShortcutModel(ShortcutExtensionKt.PRIVATE_SHORTCUT_MANAGER_KEY, CountryShortcutConstants.PAYMENT_SERVICE_PAGE, null, 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ShortcutModel f34479d = new ShortcutModel(ShortcutExtensionKt.PRIVATE_SHORTCUT_MANAGER_KEY, CountryShortcutConstants.TOP_UP_PAGE, null, 4, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ShortcutModel f34480e = new ShortcutModel(ShortcutExtensionKt.PRIVATE_SHORTCUT_MANAGER_KEY, CountryShortcutConstants.CREDIT_CARD_PAYMENT_PAGE, null, 4, null);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bbva.glomohybrid.base.behaviors.HandlerShortcutBehaviour
    @Nullable
    public ShortcutModel handle(@NotNull String shortcutId) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        switch (shortcutId.hashCode()) {
            case -1814683163:
                if (shortcutId.equals(CountryShortcutConstants.TOP_UP)) {
                    return this.f34479d;
                }
                return null;
            case -1383370947:
                if (shortcutId.equals("CREDIT_CARD_PAYMENT")) {
                    return this.f34480e;
                }
                return null;
            case -613456373:
                if (shortcutId.equals(CountryShortcutConstants.CARDLESS_WITHDRAWAL)) {
                    return this.f34477b;
                }
                return null;
            case 234189116:
                if (shortcutId.equals(CountryShortcutConstants.PAYMENT_SERVICE)) {
                    return this.f34478c;
                }
                return null;
            case 2063509483:
                if (shortcutId.equals(CountryShortcutConstants.TRANSFER)) {
                    return this.f34476a;
                }
                return null;
            default:
                return null;
        }
    }
}
