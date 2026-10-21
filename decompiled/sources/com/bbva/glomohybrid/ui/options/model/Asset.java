package com.bbva.glomohybrid.ui.options.model;

import ad.d;
import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Option.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/Asset;", "", "()V", "Icon", "InitialsIcon", "Lcom/bbva/glomohybrid/ui/options/model/Asset$Icon;", "Lcom/bbva/glomohybrid/ui/options/model/Asset$InitialsIcon;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Asset {

    /* JADX INFO: compiled from: Option.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/Asset$Icon;", "Lcom/bbva/glomohybrid/ui/options/model/Asset;", "", "component1", "iconResId", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIconResId", "()I", "<init>", "(I)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Icon extends Asset {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int iconResId;

        public Icon(int i10) {
            super(null);
            this.iconResId = i10;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = icon.iconResId;
            }
            return icon.copy(i10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        @NotNull
        public final Icon copy(int iconResId) {
            return new Icon(iconResId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Icon) && this.iconResId == ((Icon) other).iconResId;
        }

        public final int getIconResId() {
            return this.iconResId;
        }

        public int hashCode() {
            return this.iconResId;
        }

        @NotNull
        public String toString() {
            return a.c(new StringBuilder("Icon(iconResId="), this.iconResId, ")");
        }
    }

    /* JADX INFO: compiled from: Option.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/model/Asset$InitialsIcon;", "Lcom/bbva/glomohybrid/ui/options/model/Asset;", "", "component1", "initials", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getInitials", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class InitialsIcon extends Asset {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String initials;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitialsIcon(@NotNull String initials) {
            super(null);
            Intrinsics.checkNotNullParameter(initials, "initials");
            this.initials = initials;
        }

        public static /* synthetic */ InitialsIcon copy$default(InitialsIcon initialsIcon, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = initialsIcon.initials;
            }
            return initialsIcon.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInitials() {
            return this.initials;
        }

        @NotNull
        public final InitialsIcon copy(@NotNull String initials) {
            Intrinsics.checkNotNullParameter(initials, "initials");
            return new InitialsIcon(initials);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitialsIcon) && Intrinsics.areEqual(this.initials, ((InitialsIcon) other).initials);
        }

        @NotNull
        public final String getInitials() {
            return this.initials;
        }

        public int hashCode() {
            return this.initials.hashCode();
        }

        @NotNull
        public String toString() {
            return d.f(new StringBuilder("InitialsIcon(initials="), this.initials, ")");
        }
    }

    public Asset() {
    }

    public /* synthetic */ Asset(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
