package com.bbva.glomohybrid.ui.options.profileselector.model;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProfileSelectedItem.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "", "", "component1", "", "component2", "position", "title", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPosition", "()I", "b", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ProfileSelectedItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int position;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String title;

    public ProfileSelectedItem(int i10, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.position = i10;
        this.title = title;
    }

    public static /* synthetic */ ProfileSelectedItem copy$default(ProfileSelectedItem profileSelectedItem, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = profileSelectedItem.position;
        }
        if ((i11 & 2) != 0) {
            str = profileSelectedItem.title;
        }
        return profileSelectedItem.copy(i10, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final ProfileSelectedItem copy(int position, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ProfileSelectedItem(position, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileSelectedItem)) {
            return false;
        }
        ProfileSelectedItem profileSelectedItem = (ProfileSelectedItem) other;
        return this.position == profileSelectedItem.position && Intrinsics.areEqual(this.title, profileSelectedItem.title);
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (this.position * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileSelectedItem(position=");
        sb2.append(this.position);
        sb2.append(", title=");
        return d.f(sb2, this.title, ")");
    }
}
