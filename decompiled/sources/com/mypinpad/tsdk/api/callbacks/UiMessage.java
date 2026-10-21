package com.mypinpad.tsdk.api.callbacks;

import com.mypinpad.tsdk.api.models.Iso4217Currency;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/UiMessage;", "", "Lcom/mypinpad/tsdk/api/models/Iso4217Currency;", "Lcom/mypinpad/tsdk/api/models/Currency;", "getCurrency", "()Lcom/mypinpad/tsdk/api/models/Iso4217Currency;", "currency", "", "getHoldTime", "()J", "holdTime", "Lcom/mypinpad/tsdk/api/callbacks/UiMessageId;", "getId", "()Lcom/mypinpad/tsdk/api/callbacks/UiMessageId;", "id", "Lcom/mypinpad/tsdk/api/callbacks/LanguagePreference;", "getPreferredLanguage", "()Lcom/mypinpad/tsdk/api/callbacks/LanguagePreference;", "preferredLanguage", "getValue", "()Ljava/lang/Long;", "value", "Lcom/mypinpad/tsdk/api/callbacks/ValueQualifier;", "getValueQualifier", "()Lcom/mypinpad/tsdk/api/callbacks/ValueQualifier;", "valueQualifier"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface UiMessage {
    @JvmName(name = "getCurrency")
    @Nullable
    Iso4217Currency getCurrency();

    @JvmName(name = "getHoldTime")
    long getHoldTime();

    @JvmName(name = "getId")
    @NotNull
    UiMessageId getId();

    @JvmName(name = "getPreferredLanguage")
    @Nullable
    LanguagePreference getPreferredLanguage();

    @JvmName(name = "getValue")
    @Nullable
    Long getValue();

    @JvmName(name = "getValueQualifier")
    @NotNull
    ValueQualifier getValueQualifier();
}
