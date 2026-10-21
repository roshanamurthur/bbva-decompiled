package com.bbva.notifications.model;

import kotlin.Metadata;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: CurrencyData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/notifications/model/MxnCurrency;", "Lcom/bbva/notifications/model/CurrencyData;", "()V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MxnCurrency extends CurrencyData {
    public MxnCurrency() {
        super("MXN", Constant.MXN_SYMBOL, CurrencyPositionLeft.INSTANCE, null);
    }
}
