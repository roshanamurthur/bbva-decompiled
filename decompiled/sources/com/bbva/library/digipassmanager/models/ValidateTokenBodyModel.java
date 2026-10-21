package com.bbva.library.digipassmanager.models;

import bk.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.mypinpad.tsdk.isolation.y2;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BodyModels.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u0003HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/bbva/library/digipassmanager/models/ValidateTokenBodyModel;", "", "", "", "toMap", "component1", "component2", DigipassManagerConstants.TOKEN_CHALLENGE, DigipassManagerConstants.TOKEN_CODE_MODEL, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTokenChallenge", "()Ljava/lang/String;", "b", "getTokenCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ValidateTokenBodyModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenChallenge;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenCode;

    public ValidateTokenBodyModel(@NotNull String tokenChallenge, @NotNull String tokenCode) {
        Intrinsics.checkNotNullParameter(tokenChallenge, "tokenChallenge");
        Intrinsics.checkNotNullParameter(tokenCode, "tokenCode");
        this.tokenChallenge = tokenChallenge;
        this.tokenCode = tokenCode;
    }

    public static /* synthetic */ ValidateTokenBodyModel copy$default(ValidateTokenBodyModel validateTokenBodyModel, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = validateTokenBodyModel.tokenChallenge;
        }
        if ((i10 & 2) != 0) {
            str2 = validateTokenBodyModel.tokenCode;
        }
        return validateTokenBodyModel.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenChallenge() {
        return this.tokenChallenge;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenCode() {
        return this.tokenCode;
    }

    @NotNull
    public final ValidateTokenBodyModel copy(@NotNull String tokenChallenge, @NotNull String tokenCode) {
        Intrinsics.checkNotNullParameter(tokenChallenge, "tokenChallenge");
        Intrinsics.checkNotNullParameter(tokenCode, "tokenCode");
        return new ValidateTokenBodyModel(tokenChallenge, tokenCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidateTokenBodyModel)) {
            return false;
        }
        ValidateTokenBodyModel validateTokenBodyModel = (ValidateTokenBodyModel) other;
        return Intrinsics.areEqual(this.tokenChallenge, validateTokenBodyModel.tokenChallenge) && Intrinsics.areEqual(this.tokenCode, validateTokenBodyModel.tokenCode);
    }

    @NotNull
    public final String getTokenChallenge() {
        return this.tokenChallenge;
    }

    @NotNull
    public final String getTokenCode() {
        return this.tokenCode;
    }

    public int hashCode() {
        return this.tokenCode.hashCode() + (this.tokenChallenge.hashCode() * 31);
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return q.mapOf(TuplesKt.to(DigipassManagerConstants.TOKEN_CHALLENGE, this.tokenChallenge), TuplesKt.to(DigipassManagerConstants.TOKEN_CODE_MODEL, this.tokenCode));
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ValidateTokenBodyModel(tokenChallenge=");
        sb2.append(this.tokenChallenge);
        sb2.append(", tokenCode=");
        return y2.b(sb2, this.tokenCode, RootService.CLOSE_BRACKET);
    }
}
