package com.viergegroup.sdk.taptophone.ui;

import com.mypinpad.android.hapticslibrary.CardScheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/viergegroup/sdk/taptophone/ui/DisplaySchemeHapticsViewData;", "Lcom/viergegroup/sdk/taptophone/ui/ViewData;", "cardScheme", "Lcom/mypinpad/android/hapticslibrary/CardScheme;", "(Lcom/mypinpad/android/hapticslibrary/CardScheme;)V", "getCardScheme", "()Lcom/mypinpad/android/hapticslibrary/CardScheme;", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DisplaySchemeHapticsViewData extends ViewData {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CardScheme f67604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplaySchemeHapticsViewData(@NotNull CardScheme cardScheme) {
        super(HoldStrategy.UiControlled.INSTANCE, null);
        Intrinsics.checkNotNullParameter(cardScheme, "");
        this.f67604b = cardScheme;
    }

    @NotNull
    /* JADX INFO: renamed from: getCardScheme, reason: from getter */
    public final CardScheme getF67604b() {
        return this.f67604b;
    }
}
