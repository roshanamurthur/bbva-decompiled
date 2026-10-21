package com.bbva.glomohybrid.base.snackbar;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackBarDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "", "()V", "Hide", "Show", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState$Hide;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState$Show;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SnackbarState {

    /* JADX INFO: compiled from: SnackBarDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarState$Hide;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "()V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Hide extends SnackbarState {

        @NotNull
        public static final Hide INSTANCE = new Hide();

        public Hide() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SnackBarDelegate.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarState$Show;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarState;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "component1", "snackbarSpec", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "getSnackbarSpec", "()Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "<init>", "(Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Show extends SnackbarState {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SnackbarSpec snackbarSpec;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(@NotNull SnackbarSpec snackbarSpec) {
            super(null);
            Intrinsics.checkNotNullParameter(snackbarSpec, "snackbarSpec");
            this.snackbarSpec = snackbarSpec;
        }

        public static /* synthetic */ Show copy$default(Show show, SnackbarSpec snackbarSpec, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                snackbarSpec = show.snackbarSpec;
            }
            return show.copy(snackbarSpec);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SnackbarSpec getSnackbarSpec() {
            return this.snackbarSpec;
        }

        @NotNull
        public final Show copy(@NotNull SnackbarSpec snackbarSpec) {
            Intrinsics.checkNotNullParameter(snackbarSpec, "snackbarSpec");
            return new Show(snackbarSpec);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Show) && Intrinsics.areEqual(this.snackbarSpec, ((Show) other).snackbarSpec);
        }

        @NotNull
        public final SnackbarSpec getSnackbarSpec() {
            return this.snackbarSpec;
        }

        public int hashCode() {
            return this.snackbarSpec.hashCode();
        }

        @NotNull
        public String toString() {
            return "Show(snackbarSpec=" + this.snackbarSpec + ")";
        }
    }

    public SnackbarState() {
    }

    public /* synthetic */ SnackbarState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
