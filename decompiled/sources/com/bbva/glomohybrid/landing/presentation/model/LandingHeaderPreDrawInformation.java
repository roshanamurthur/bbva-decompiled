package com.bbva.glomohybrid.landing.presentation.model;

import androidx.appcompat.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LandingHeaderPreDrawInformation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/model/LandingHeaderPreDrawInformation;", "Landroidx/recyclerview/widget/RecyclerView$ItemAnimator$ItemHolderInfo;", "", "component1", "component2", "startAnimationY", "endAnimationY", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStartAnimationY", "()I", "b", "getEndAnimationY", "<init>", "(II)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LandingHeaderPreDrawInformation extends RecyclerView.ItemAnimator.ItemHolderInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int startAnimationY;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int endAnimationY;

    public LandingHeaderPreDrawInformation(int i10, int i11) {
        this.startAnimationY = i10;
        this.endAnimationY = i11;
    }

    public static /* synthetic */ LandingHeaderPreDrawInformation copy$default(LandingHeaderPreDrawInformation landingHeaderPreDrawInformation, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = landingHeaderPreDrawInformation.startAnimationY;
        }
        if ((i12 & 2) != 0) {
            i11 = landingHeaderPreDrawInformation.endAnimationY;
        }
        return landingHeaderPreDrawInformation.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartAnimationY() {
        return this.startAnimationY;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndAnimationY() {
        return this.endAnimationY;
    }

    @NotNull
    public final LandingHeaderPreDrawInformation copy(int startAnimationY, int endAnimationY) {
        return new LandingHeaderPreDrawInformation(startAnimationY, endAnimationY);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingHeaderPreDrawInformation)) {
            return false;
        }
        LandingHeaderPreDrawInformation landingHeaderPreDrawInformation = (LandingHeaderPreDrawInformation) other;
        return this.startAnimationY == landingHeaderPreDrawInformation.startAnimationY && this.endAnimationY == landingHeaderPreDrawInformation.endAnimationY;
    }

    public final int getEndAnimationY() {
        return this.endAnimationY;
    }

    public final int getStartAnimationY() {
        return this.startAnimationY;
    }

    public int hashCode() {
        return (this.startAnimationY * 31) + this.endAnimationY;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingHeaderPreDrawInformation(startAnimationY=");
        sb2.append(this.startAnimationY);
        sb2.append(", endAnimationY=");
        return a.c(sb2, this.endAnimationY, ")");
    }
}
