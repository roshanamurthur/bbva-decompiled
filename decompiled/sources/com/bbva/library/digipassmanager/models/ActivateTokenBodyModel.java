package com.bbva.library.digipassmanager.models;

import bk.p;
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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/library/digipassmanager/models/ActivateTokenBodyModel;", "", "", "", "toMap", "component1", DigipassManagerConstants.TOKEN_CODE_MODEL, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getTokenCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "digipassmanager-library_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ActivateTokenBodyModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenCode;

    public ActivateTokenBodyModel(@NotNull String tokenCode) {
        Intrinsics.checkNotNullParameter(tokenCode, "tokenCode");
        this.tokenCode = tokenCode;
    }

    public static /* synthetic */ ActivateTokenBodyModel copy$default(ActivateTokenBodyModel activateTokenBodyModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = activateTokenBodyModel.tokenCode;
        }
        return activateTokenBodyModel.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTokenCode() {
        return this.tokenCode;
    }

    @NotNull
    public final ActivateTokenBodyModel copy(@NotNull String tokenCode) {
        Intrinsics.checkNotNullParameter(tokenCode, "tokenCode");
        return new ActivateTokenBodyModel(tokenCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActivateTokenBodyModel) && Intrinsics.areEqual(this.tokenCode, ((ActivateTokenBodyModel) other).tokenCode);
    }

    @NotNull
    public final String getTokenCode() {
        return this.tokenCode;
    }

    public int hashCode() {
        return this.tokenCode.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return p.mapOf(TuplesKt.to(DigipassManagerConstants.TOKEN_CODE_MODEL, this.tokenCode));
    }

    @NotNull
    public String toString() {
        return y2.b(new StringBuilder("ActivateTokenBodyModel(tokenCode="), this.tokenCode, RootService.CLOSE_BRACKET);
    }
}
