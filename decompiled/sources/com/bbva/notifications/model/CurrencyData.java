package com.bbva.notifications.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CurrencyData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/bbva/notifications/model/CurrencyData;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getSymbol", "symbol", "Lcom/bbva/notifications/model/CurrencyPositionData;", "c", "Lcom/bbva/notifications/model/CurrencyPositionData;", "getPosition", "()Lcom/bbva/notifications/model/CurrencyPositionData;", "position", "Companion", "Lcom/bbva/notifications/model/ArsCurrency;", "Lcom/bbva/notifications/model/CopCurrency;", "Lcom/bbva/notifications/model/DollarCurrency;", "Lcom/bbva/notifications/model/EuroCurrency;", "Lcom/bbva/notifications/model/MxnCurrency;", "Lcom/bbva/notifications/model/SolCurrency;", "Lcom/bbva/notifications/model/UnknownCurrency;", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class CurrencyData {

    @NotNull
    public static final String ARS_CURRENCY = "ARS";

    @NotNull
    public static final String COP_CURRENCY = "COP";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DOLLAR_CURRENCY = "USD";

    @NotNull
    public static final String EURO_CURRENCY = "EUR";

    @NotNull
    public static final String MXN_CURRENCY = "MXN";

    @NotNull
    public static final String SOL_CURRENCY = "PEN";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CurrencyPositionData position;

    /* JADX INFO: compiled from: CurrencyData.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/notifications/model/CurrencyData$Companion;", "", "()V", "ARS_CURRENCY", "", "COP_CURRENCY", "DOLLAR_CURRENCY", "EURO_CURRENCY", "MXN_CURRENCY", "SOL_CURRENCY", "getCurrency", "Lcom/bbva/notifications/model/CurrencyData;", "name", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @NotNull
        public final CurrencyData getCurrency(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            switch (name.hashCode()) {
                case 65090:
                    if (name.equals(CurrencyData.ARS_CURRENCY)) {
                        return new ArsCurrency();
                    }
                    break;
                case 66916:
                    if (name.equals(CurrencyData.COP_CURRENCY)) {
                        return new CopCurrency();
                    }
                    break;
                case 69026:
                    if (name.equals(CurrencyData.EURO_CURRENCY)) {
                        return new EuroCurrency();
                    }
                    break;
                case 76803:
                    if (name.equals("MXN")) {
                        return new MxnCurrency();
                    }
                    break;
                case 79097:
                    if (name.equals(CurrencyData.SOL_CURRENCY)) {
                        return new SolCurrency();
                    }
                    break;
                case 84326:
                    if (name.equals(CurrencyData.DOLLAR_CURRENCY)) {
                        return new DollarCurrency();
                    }
                    break;
            }
            return new UnknownCurrency(name);
        }
    }

    public CurrencyData(String str, String str2, CurrencyPositionData currencyPositionData, DefaultConstructorMarker defaultConstructorMarker) {
        this.name = str;
        this.symbol = str2;
        this.position = currencyPositionData;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final CurrencyPositionData getPosition() {
        return this.position;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }
}
