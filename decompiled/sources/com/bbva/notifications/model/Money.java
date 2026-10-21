package com.bbva.notifications.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VariablesMessageData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/notifications/model/Money;", "", PushConstants.AMOUNT, "", "currency", "currentBalance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getCurrentBalance", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Money {

    @Nullable
    private final String amount;

    @Nullable
    private final String currency;

    @Nullable
    private final String currentBalance;

    public Money() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Money copy$default(Money money, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = money.amount;
        }
        if ((i10 & 2) != 0) {
            str2 = money.currency;
        }
        if ((i10 & 4) != 0) {
            str3 = money.currentBalance;
        }
        return money.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentBalance() {
        return this.currentBalance;
    }

    @NotNull
    public final Money copy(@Nullable String amount, @Nullable String currency, @Nullable String currentBalance) {
        return new Money(amount, currency, currentBalance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money)) {
            return false;
        }
        Money money = (Money) other;
        return Intrinsics.areEqual(this.amount, money.amount) && Intrinsics.areEqual(this.currency, money.currency) && Intrinsics.areEqual(this.currentBalance, money.currentBalance);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrentBalance() {
        return this.currentBalance;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentBalance;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.amount;
        String str2 = this.currency;
        return d.f(a.c("Money(amount=", str, ", currency=", str2, ", currentBalance="), this.currentBalance, ")");
    }

    public Money(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.amount = str;
        this.currency = str2;
        this.currentBalance = str3;
    }

    public /* synthetic */ Money(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
