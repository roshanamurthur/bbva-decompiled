package com.bbva.glomohybrid.ui.modals;

import ad.d;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.camera.camera2.internal.n1;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.cellscore.app.Reactor;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.ui.toolbar.Toolbar;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.ui.R;
import com.bbva.glomohybrid.ui.databinding.LayoutFullmodalBinding;
import com.bbva.glomohybrid.ui.modals.changeuser.ui.InfoView;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z0.c;

/* JADX INFO: compiled from: FullScreenModal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 )2\u00020\u0001:\u0004)*+,B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J&\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R*\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R0\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006-"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/FullScreenModal;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "outState", "onSaveInstanceState", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "onDestroyView", "Lkotlin/Function0;", "r0", "Lkotlin/jvm/functions/Function0;", "getConfirmListener", "()Lkotlin/jvm/functions/Function0;", "setConfirmListener", "(Lkotlin/jvm/functions/Function0;)V", "confirmListener", "s0", "getCancelListener", "setCancelListener", "cancelListener", "Lkotlin/Function1;", "", "t0", "Lkotlin/jvm/functions/Function1;", "getOpenLinkListener", "()Lkotlin/jvm/functions/Function1;", "setOpenLinkListener", "(Lkotlin/jvm/functions/Function1;)V", "openLinkListener", "<init>", "()V", "Companion", "FeaturesList", "FullScreenModalConfig", "InfoBoxConfig", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nFullScreenModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenModal.kt\ncom/bbva/glomohybrid/ui/modals/FullScreenModal\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
public final class FullScreenModal extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Void> f34617u0 = new ActionSpec<>("action-full-modal-success");

    @NotNull
    public static final ActionSpec<Void> v0 = new ActionSpec<>("action-full-modal-error");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f34618w0 = new ActionSpec<>("action-full-modal-info-button");

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Void> f34619x0 = new ActionSpec<>("action-full-modal-close");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public LayoutFullmodalBinding f34620p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public FullScreenModalConfig f34621q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> confirmListener;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> cancelListener;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super String, Unit> openLinkListener;

    /* JADX INFO: compiled from: FullScreenModal.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u000e\u0010\u000f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$Companion;", "", "()V", "ACTION_CLOSE_MODAL", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Ljava/lang/Void;", "getACTION_CLOSE_MODAL", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_INFO_BUTTON_CLICK", "", "getACTION_INFO_BUTTON_CLICK", "ACTION_NEGATIVE_BUTTON_CLICK", "getACTION_NEGATIVE_BUTTON_CLICK", "ACTION_POSITIVE_BUTTON_CLICK", "getACTION_POSITIVE_BUTTON_CLICK", "FULL_MODAL_CONFIG", "getInstance", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal;", "config", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFullScreenModal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullScreenModal.kt\ncom/bbva/glomohybrid/ui/modals/FullScreenModal$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1#2:171\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Void> getACTION_CLOSE_MODAL() {
            return FullScreenModal.f34619x0;
        }

        @NotNull
        public final ActionSpec<String> getACTION_INFO_BUTTON_CLICK() {
            return FullScreenModal.f34618w0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_NEGATIVE_BUTTON_CLICK() {
            return FullScreenModal.v0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_POSITIVE_BUTTON_CLICK() {
            return FullScreenModal.f34617u0;
        }

        @NotNull
        public final FullScreenModal getInstance(@NotNull FullScreenModalConfig config) {
            Intrinsics.checkNotNullParameter(config, "config");
            FullScreenModal fullScreenModal = new FullScreenModal();
            Bundle bundle = new Bundle();
            bundle.putParcelable("config", config);
            fullScreenModal.setArguments(bundle);
            return fullScreenModal;
        }
    }

    /* JADX INFO: compiled from: FullScreenModal.kt */
    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eHÖ\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FeaturesList;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "softokenConnected", "notificstionsConnected", "quickLoginConnected", "wearableConnected", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Z", "getSoftokenConnected", "()Z", "q0", "getNotificstionsConnected", "r0", "getQuickLoginConnected", "s0", "getWearableConnected", "<init>", "(ZZZZ)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class FeaturesList implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FeaturesList> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final boolean softokenConnected;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public final boolean notificstionsConnected;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        public final boolean quickLoginConnected;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        public final boolean wearableConnected;

        /* JADX INFO: compiled from: FullScreenModal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FeaturesList> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FeaturesList createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeaturesList(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FeaturesList[] newArray(int i10) {
                return new FeaturesList[i10];
            }
        }

        public FeaturesList(boolean z10, boolean z11, boolean z12, boolean z13) {
            this.softokenConnected = z10;
            this.notificstionsConnected = z11;
            this.quickLoginConnected = z12;
            this.wearableConnected = z13;
        }

        public static /* synthetic */ FeaturesList copy$default(FeaturesList featuresList, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = featuresList.softokenConnected;
            }
            if ((i10 & 2) != 0) {
                z11 = featuresList.notificstionsConnected;
            }
            if ((i10 & 4) != 0) {
                z12 = featuresList.quickLoginConnected;
            }
            if ((i10 & 8) != 0) {
                z13 = featuresList.wearableConnected;
            }
            return featuresList.copy(z10, z11, z12, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSoftokenConnected() {
            return this.softokenConnected;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getNotificstionsConnected() {
            return this.notificstionsConnected;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getQuickLoginConnected() {
            return this.quickLoginConnected;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getWearableConnected() {
            return this.wearableConnected;
        }

        @NotNull
        public final FeaturesList copy(boolean softokenConnected, boolean notificstionsConnected, boolean quickLoginConnected, boolean wearableConnected) {
            return new FeaturesList(softokenConnected, notificstionsConnected, quickLoginConnected, wearableConnected);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FeaturesList)) {
                return false;
            }
            FeaturesList featuresList = (FeaturesList) other;
            return this.softokenConnected == featuresList.softokenConnected && this.notificstionsConnected == featuresList.notificstionsConnected && this.quickLoginConnected == featuresList.quickLoginConnected && this.wearableConnected == featuresList.wearableConnected;
        }

        public final boolean getNotificstionsConnected() {
            return this.notificstionsConnected;
        }

        public final boolean getQuickLoginConnected() {
            return this.quickLoginConnected;
        }

        public final boolean getSoftokenConnected() {
            return this.softokenConnected;
        }

        public final boolean getWearableConnected() {
            return this.wearableConnected;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v3, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v8 */
        public int hashCode() {
            boolean z10 = this.softokenConnected;
            ?? r1 = z10;
            if (z10) {
                r1 = 1;
            }
            int i10 = r1 * 31;
            boolean z11 = this.notificstionsConnected;
            ?? r3 = z11;
            if (z11) {
                r3 = 1;
            }
            int i11 = (i10 + r3) * 31;
            boolean z12 = this.quickLoginConnected;
            ?? r4 = z12;
            if (z12) {
                r4 = 1;
            }
            int i12 = (i11 + r4) * 31;
            boolean z13 = this.wearableConnected;
            return i12 + (z13 ? 1 : z13);
        }

        @NotNull
        public String toString() {
            return "FeaturesList(softokenConnected=" + this.softokenConnected + ", notificstionsConnected=" + this.notificstionsConnected + ", quickLoginConnected=" + this.quickLoginConnected + ", wearableConnected=" + this.wearableConnected + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.softokenConnected ? 1 : 0);
            parcel.writeInt(this.notificstionsConnected ? 1 : 0);
            parcel.writeInt(this.quickLoginConnected ? 1 : 0);
            parcel.writeInt(this.wearableConnected ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: FullScreenModal.kt */
    @Parcelize
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006'"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$InfoBoxConfig;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "component3", "component4", "warningBoxIcon", "warningBoxText", "warningBoxActionText", "warningBoxActionValue", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getWarningBoxIcon", "()I", "q0", "Ljava/lang/String;", "getWarningBoxText", "()Ljava/lang/String;", "r0", "getWarningBoxActionText", "s0", "getWarningBoxActionValue", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class InfoBoxConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InfoBoxConfig> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public final int warningBoxIcon;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String warningBoxText;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String warningBoxActionText;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String warningBoxActionValue;

        /* JADX INFO: compiled from: FullScreenModal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<InfoBoxConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final InfoBoxConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoBoxConfig(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final InfoBoxConfig[] newArray(int i10) {
                return new InfoBoxConfig[i10];
            }
        }

        public InfoBoxConfig(int i10, @NotNull String warningBoxText, @NotNull String warningBoxActionText, @NotNull String warningBoxActionValue) {
            Intrinsics.checkNotNullParameter(warningBoxText, "warningBoxText");
            Intrinsics.checkNotNullParameter(warningBoxActionText, "warningBoxActionText");
            Intrinsics.checkNotNullParameter(warningBoxActionValue, "warningBoxActionValue");
            this.warningBoxIcon = i10;
            this.warningBoxText = warningBoxText;
            this.warningBoxActionText = warningBoxActionText;
            this.warningBoxActionValue = warningBoxActionValue;
        }

        public static /* synthetic */ InfoBoxConfig copy$default(InfoBoxConfig infoBoxConfig, int i10, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = infoBoxConfig.warningBoxIcon;
            }
            if ((i11 & 2) != 0) {
                str = infoBoxConfig.warningBoxText;
            }
            if ((i11 & 4) != 0) {
                str2 = infoBoxConfig.warningBoxActionText;
            }
            if ((i11 & 8) != 0) {
                str3 = infoBoxConfig.warningBoxActionValue;
            }
            return infoBoxConfig.copy(i10, str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWarningBoxIcon() {
            return this.warningBoxIcon;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getWarningBoxText() {
            return this.warningBoxText;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getWarningBoxActionText() {
            return this.warningBoxActionText;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getWarningBoxActionValue() {
            return this.warningBoxActionValue;
        }

        @NotNull
        public final InfoBoxConfig copy(int warningBoxIcon, @NotNull String warningBoxText, @NotNull String warningBoxActionText, @NotNull String warningBoxActionValue) {
            Intrinsics.checkNotNullParameter(warningBoxText, "warningBoxText");
            Intrinsics.checkNotNullParameter(warningBoxActionText, "warningBoxActionText");
            Intrinsics.checkNotNullParameter(warningBoxActionValue, "warningBoxActionValue");
            return new InfoBoxConfig(warningBoxIcon, warningBoxText, warningBoxActionText, warningBoxActionValue);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoBoxConfig)) {
                return false;
            }
            InfoBoxConfig infoBoxConfig = (InfoBoxConfig) other;
            return this.warningBoxIcon == infoBoxConfig.warningBoxIcon && Intrinsics.areEqual(this.warningBoxText, infoBoxConfig.warningBoxText) && Intrinsics.areEqual(this.warningBoxActionText, infoBoxConfig.warningBoxActionText) && Intrinsics.areEqual(this.warningBoxActionValue, infoBoxConfig.warningBoxActionValue);
        }

        @NotNull
        public final String getWarningBoxActionText() {
            return this.warningBoxActionText;
        }

        @NotNull
        public final String getWarningBoxActionValue() {
            return this.warningBoxActionValue;
        }

        public final int getWarningBoxIcon() {
            return this.warningBoxIcon;
        }

        @NotNull
        public final String getWarningBoxText() {
            return this.warningBoxText;
        }

        public int hashCode() {
            return this.warningBoxActionValue.hashCode() + n1.c(this.warningBoxActionText, n1.c(this.warningBoxText, this.warningBoxIcon * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("InfoBoxConfig(warningBoxIcon=");
            sb2.append(this.warningBoxIcon);
            sb2.append(", warningBoxText=");
            sb2.append(this.warningBoxText);
            sb2.append(", warningBoxActionText=");
            sb2.append(this.warningBoxActionText);
            sb2.append(", warningBoxActionValue=");
            return d.f(sb2, this.warningBoxActionValue, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeInt(this.warningBoxIcon);
            parcel.writeString(this.warningBoxText);
            parcel.writeString(this.warningBoxActionText);
            parcel.writeString(this.warningBoxActionValue);
        }
    }

    /* JADX INFO: compiled from: FullScreenModal.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ InfoBoxConfig f34642q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InfoBoxConfig infoBoxConfig) {
            super(0);
            this.f34642q0 = infoBoxConfig;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FullScreenModal fullScreenModal = FullScreenModal.this;
            Function1<String, Unit> openLinkListener = fullScreenModal.getOpenLinkListener();
            InfoBoxConfig infoBoxConfig = this.f34642q0;
            if (openLinkListener != null) {
                openLinkListener.invoke(infoBoxConfig.getWarningBoxActionValue());
            }
            FullScreenModal.access$fire(fullScreenModal, FullScreenModal.INSTANCE.getACTION_INFO_BUTTON_CLICK(), infoBoxConfig.getWarningBoxActionValue());
            fullScreenModal.dismiss();
            return Unit.INSTANCE;
        }
    }

    public static final void access$fire(FullScreenModal fullScreenModal, ActionSpec actionSpec, Object obj) {
        FullScreenModalConfig fullScreenModalConfig = fullScreenModal.f34621q0;
        if (fullScreenModalConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig = null;
        }
        Reactor.inside(fullScreenModalConfig.getId()).doAction(actionSpec).with(obj).fire();
    }

    @Nullable
    public final Function0<Unit> getCancelListener() {
        return this.cancelListener;
    }

    @Nullable
    public final Function0<Unit> getConfirmListener() {
        return this.confirmListener;
    }

    @Nullable
    public final Function1<String, Unit> getOpenLinkListener() {
        return this.openLinkListener;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, R.style.Glomo_FullModal);
        if (savedInstanceState == null) {
            savedInstanceState = getArguments();
        }
        FullScreenModalConfig fullScreenModalConfig = null;
        FullScreenModalConfig fullScreenModalConfig2 = savedInstanceState != null ? (FullScreenModalConfig) savedInstanceState.getParcelable("config") : null;
        if (fullScreenModalConfig2 == null) {
            throw new IllegalArgumentException("No config passed");
        }
        this.f34621q0 = fullScreenModalConfig2;
        FragmentActivity activity = getActivity();
        int iHashCode = activity != null ? activity.hashCode() : 0;
        FullScreenModalConfig fullScreenModalConfig3 = this.f34621q0;
        if (fullScreenModalConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
        } else {
            fullScreenModalConfig = fullScreenModalConfig3;
        }
        ComponentManager.addComponentToPage(iHashCode, fullScreenModalConfig.getId(), this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        LayoutFullmodalBinding layoutFullmodalBindingInflate = LayoutFullmodalBinding.inflate(inflater, container, false);
        this.f34620p0 = layoutFullmodalBindingInflate;
        if (layoutFullmodalBindingInflate != null) {
            return layoutFullmodalBindingInflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f34620p0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        FullScreenModalConfig fullScreenModalConfig = this.f34621q0;
        if (fullScreenModalConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig = null;
        }
        outState.putParcelable("config", fullScreenModalConfig);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setWindowAnimations(R.style.Glomo_FullModal_Animation);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LayoutFullmodalBinding layoutFullmodalBinding = this.f34620p0;
        if (layoutFullmodalBinding == null) {
            return;
        }
        CellsTextView cellsTextView = layoutFullmodalBinding.toolbarTitleLabel;
        FullScreenModalConfig fullScreenModalConfig = this.f34621q0;
        FullScreenModalConfig fullScreenModalConfig2 = null;
        if (fullScreenModalConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig = null;
        }
        cellsTextView.setText(fullScreenModalConfig.getTitle());
        Toolbar toolbar = layoutFullmodalBinding.fullScreenToolbar;
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setOnMenuItemClickListener(new c(this));
        InfoView infoView = layoutFullmodalBinding.infoView;
        FullScreenModalConfig fullScreenModalConfig3 = this.f34621q0;
        if (fullScreenModalConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig3 = null;
        }
        infoView.headerIcon(fullScreenModalConfig3.getIcon());
        FullScreenModalConfig fullScreenModalConfig4 = this.f34621q0;
        if (fullScreenModalConfig4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig4 = null;
        }
        infoView.setHeader(fullScreenModalConfig4.getHeader());
        FullScreenModalConfig fullScreenModalConfig5 = this.f34621q0;
        if (fullScreenModalConfig5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig5 = null;
        }
        infoView.setMessage(fullScreenModalConfig5.getText());
        FullScreenModalConfig fullScreenModalConfig6 = this.f34621q0;
        if (fullScreenModalConfig6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig6 = null;
        }
        List<String> featuresList = fullScreenModalConfig6.getFeaturesList();
        if (featuresList != null) {
            infoView.setFeaturesList(featuresList);
        }
        FullScreenModalConfig fullScreenModalConfig7 = this.f34621q0;
        if (fullScreenModalConfig7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig7 = null;
        }
        InfoBoxConfig infoBoxConfig = fullScreenModalConfig7.getInfoBoxConfig();
        if (infoBoxConfig != null) {
            infoView.setInfoDetailBox(infoBoxConfig.getWarningBoxIcon(), infoBoxConfig.getWarningBoxText(), infoBoxConfig.getWarningBoxActionText(), new a(infoBoxConfig));
        }
        FullScreenModalConfig fullScreenModalConfig8 = this.f34621q0;
        if (fullScreenModalConfig8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig8 = null;
        }
        int i10 = 2;
        if (fullScreenModalConfig8.getPositiveButtonText() != null) {
            CellsButton cellsButton = layoutFullmodalBinding.positiveButton;
            FullScreenModalConfig fullScreenModalConfig9 = this.f34621q0;
            if (fullScreenModalConfig9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
                fullScreenModalConfig9 = null;
            }
            cellsButton.setText(fullScreenModalConfig9.getPositiveButtonText());
            cellsButton.setVisibility(0);
            cellsButton.setOnClickListener(new r5.c(this, i10));
        }
        FullScreenModalConfig fullScreenModalConfig10 = this.f34621q0;
        if (fullScreenModalConfig10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("config");
            fullScreenModalConfig10 = null;
        }
        if (fullScreenModalConfig10.getNegativeButtonText() != null) {
            CellsButton cellsButton2 = layoutFullmodalBinding.negativeButton;
            cellsButton2.setVisibility(0);
            FullScreenModalConfig fullScreenModalConfig11 = this.f34621q0;
            if (fullScreenModalConfig11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("config");
            } else {
                fullScreenModalConfig2 = fullScreenModalConfig11;
            }
            cellsButton2.setText(fullScreenModalConfig2.getNegativeButtonText());
            cellsButton2.setOnClickListener(new r5.d(this, i10));
        }
    }

    public final void setCancelListener(@Nullable Function0<Unit> function0) {
        this.cancelListener = function0;
    }

    public final void setConfirmListener(@Nullable Function0<Unit> function0) {
        this.confirmListener = function0;
    }

    public final void setOpenLinkListener(@Nullable Function1<? super String, Unit> function1) {
        this.openLinkListener = function1;
    }

    /* JADX INFO: compiled from: FullScreenModal.kt */
    @Parcelize
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b?\u0010@J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003Js\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001J\u0019\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(¨\u0006A"}, d2 = {"Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$FullScreenModalConfig;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "component5", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$InfoBoxConfig;", "component6", "", "component7", "component8", "component9", "id", "title", "header", "icon", "text", "infoBoxConfig", "featuresList", "positiveButtonText", "negativeButtonText", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "q0", "getTitle", "r0", "getHeader", "s0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIcon", "()I", "t0", "getText", "u0", "Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$InfoBoxConfig;", "getInfoBoxConfig", "()Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$InfoBoxConfig;", "v0", "Ljava/util/List;", "getFeaturesList", "()Ljava/util/List;", "w0", "getPositiveButtonText", "x0", "getNegativeButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/bbva/glomohybrid/ui/modals/FullScreenModal$InfoBoxConfig;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class FullScreenModalConfig implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FullScreenModalConfig> CREATOR = new Creator();

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String id;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String title;

        /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String header;

        /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
        public final int icon;

        /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String text;

        /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final InfoBoxConfig infoBoxConfig;

        /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
        @Nullable
        public final List<String> featuresList;

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String positiveButtonText;

        /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String negativeButtonText;

        /* JADX INFO: compiled from: FullScreenModal.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<FullScreenModalConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FullScreenModalConfig createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FullScreenModalConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : InfoBoxConfig.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public final FullScreenModalConfig[] newArray(int i10) {
                return new FullScreenModalConfig[i10];
            }
        }

        public FullScreenModalConfig(@NotNull String id, @NotNull String title, @Nullable String str, int i10, @NotNull String text, @Nullable InfoBoxConfig infoBoxConfig, @Nullable List<String> list, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = id;
            this.title = title;
            this.header = str;
            this.icon = i10;
            this.text = text;
            this.infoBoxConfig = infoBoxConfig;
            this.featuresList = list;
            this.positiveButtonText = str2;
            this.negativeButtonText = str3;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHeader() {
            return this.header;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final int getIcon() {
            return this.icon;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final InfoBoxConfig getInfoBoxConfig() {
            return this.infoBoxConfig;
        }

        @Nullable
        public final List<String> component7() {
            return this.featuresList;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        @NotNull
        public final FullScreenModalConfig copy(@NotNull String id, @NotNull String title, @Nullable String header, int icon, @NotNull String text, @Nullable InfoBoxConfig infoBoxConfig, @Nullable List<String> featuresList, @Nullable String positiveButtonText, @Nullable String negativeButtonText) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(text, "text");
            return new FullScreenModalConfig(id, title, header, icon, text, infoBoxConfig, featuresList, positiveButtonText, negativeButtonText);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FullScreenModalConfig)) {
                return false;
            }
            FullScreenModalConfig fullScreenModalConfig = (FullScreenModalConfig) other;
            return Intrinsics.areEqual(this.id, fullScreenModalConfig.id) && Intrinsics.areEqual(this.title, fullScreenModalConfig.title) && Intrinsics.areEqual(this.header, fullScreenModalConfig.header) && this.icon == fullScreenModalConfig.icon && Intrinsics.areEqual(this.text, fullScreenModalConfig.text) && Intrinsics.areEqual(this.infoBoxConfig, fullScreenModalConfig.infoBoxConfig) && Intrinsics.areEqual(this.featuresList, fullScreenModalConfig.featuresList) && Intrinsics.areEqual(this.positiveButtonText, fullScreenModalConfig.positiveButtonText) && Intrinsics.areEqual(this.negativeButtonText, fullScreenModalConfig.negativeButtonText);
        }

        @Nullable
        public final List<String> getFeaturesList() {
            return this.featuresList;
        }

        @Nullable
        public final String getHeader() {
            return this.header;
        }

        public final int getIcon() {
            return this.icon;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final InfoBoxConfig getInfoBoxConfig() {
            return this.infoBoxConfig;
        }

        @Nullable
        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        @Nullable
        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        @NotNull
        public final String getText() {
            return this.text;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iC = n1.c(this.title, this.id.hashCode() * 31, 31);
            String str = this.header;
            int iC2 = n1.c(this.text, (((iC + (str == null ? 0 : str.hashCode())) * 31) + this.icon) * 31, 31);
            InfoBoxConfig infoBoxConfig = this.infoBoxConfig;
            int iHashCode = (iC2 + (infoBoxConfig == null ? 0 : infoBoxConfig.hashCode())) * 31;
            List<String> list = this.featuresList;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.positiveButtonText;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.negativeButtonText;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FullScreenModalConfig(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", header=");
            sb2.append(this.header);
            sb2.append(", icon=");
            sb2.append(this.icon);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", infoBoxConfig=");
            sb2.append(this.infoBoxConfig);
            sb2.append(", featuresList=");
            sb2.append(this.featuresList);
            sb2.append(", positiveButtonText=");
            sb2.append(this.positiveButtonText);
            sb2.append(", negativeButtonText=");
            return d.f(sb2, this.negativeButtonText, ")");
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.header);
            parcel.writeInt(this.icon);
            parcel.writeString(this.text);
            InfoBoxConfig infoBoxConfig = this.infoBoxConfig;
            if (infoBoxConfig == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                infoBoxConfig.writeToParcel(parcel, flags);
            }
            parcel.writeStringList(this.featuresList);
            parcel.writeString(this.positiveButtonText);
            parcel.writeString(this.negativeButtonText);
        }

        public /* synthetic */ FullScreenModalConfig(String str, String str2, String str3, int i10, String str4, InfoBoxConfig infoBoxConfig, List list, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, i10, str4, (i11 & 32) != 0 ? null : infoBoxConfig, (i11 & 64) != 0 ? null : list, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6);
        }
    }
}
