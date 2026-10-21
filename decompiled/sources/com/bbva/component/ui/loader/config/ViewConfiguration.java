package com.bbva.component.ui.loader.config;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewConfiguration.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/ui/loader/config/ViewConfiguration;", "", "", "component1", "component2", "enterAnimation", "exitAnimation", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getEnterAnimation", "()I", "b", "getExitAnimation", "<init>", "(II)V", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class ViewConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int enterAnimation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int exitAnimation;

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewConfiguration() {
        int i10 = 0;
        this(i10, i10, 3, null);
    }

    public static /* synthetic */ ViewConfiguration copy$default(ViewConfiguration viewConfiguration, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = viewConfiguration.enterAnimation;
        }
        if ((i12 & 2) != 0) {
            i11 = viewConfiguration.exitAnimation;
        }
        return viewConfiguration.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEnterAnimation() {
        return this.enterAnimation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getExitAnimation() {
        return this.exitAnimation;
    }

    @NotNull
    public final ViewConfiguration copy(int enterAnimation, int exitAnimation) {
        return new ViewConfiguration(enterAnimation, exitAnimation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewConfiguration)) {
            return false;
        }
        ViewConfiguration viewConfiguration = (ViewConfiguration) other;
        return this.enterAnimation == viewConfiguration.enterAnimation && this.exitAnimation == viewConfiguration.exitAnimation;
    }

    public final int getEnterAnimation() {
        return this.enterAnimation;
    }

    public final int getExitAnimation() {
        return this.exitAnimation;
    }

    public int hashCode() {
        return (this.enterAnimation * 31) + this.exitAnimation;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ViewConfiguration(enterAnimation=");
        sb2.append(this.enterAnimation);
        sb2.append(", exitAnimation=");
        return a.c(sb2, this.exitAnimation, ")");
    }

    public ViewConfiguration(int i10, int i11) {
        this.enterAnimation = i10;
        this.exitAnimation = i11;
    }

    public /* synthetic */ ViewConfiguration(int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i10, (i12 & 2) != 0 ? -1 : i11);
    }
}
