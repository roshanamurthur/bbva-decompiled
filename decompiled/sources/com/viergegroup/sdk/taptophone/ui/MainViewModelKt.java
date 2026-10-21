package com.viergegroup.sdk.taptophone.ui;

import com.mypinpad.tsdk.api.models.CardScheme;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"mapCardScheme", "Lcom/mypinpad/android/hapticslibrary/CardScheme;", "Lcom/mypinpad/tsdk/api/models/CardScheme;", "PinPadSdk1032_1.0.32E_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MainViewModelKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardScheme.values().length];
            try {
                iArr[CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardScheme.VISA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardScheme.AMERICAN_EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CardScheme.DISCOVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CardScheme.EFTPOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
