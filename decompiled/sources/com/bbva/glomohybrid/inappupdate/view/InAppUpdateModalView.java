package com.bbva.glomohybrid.inappupdate.view;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import bk.d;
import com.bancomer.mbanking.R;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.component.ui.modal.halfmodal.model.ButtonConfig;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.component.ui.modal.halfmodal.model.HalfModalType;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal;
import com.bbva.glomohybrid.base.inappupdate.view.model.InAppUpdateModalConfiguration;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v8.b;

/* JADX INFO: compiled from: InAppUpdateModalView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\"\u0010\f\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/inappupdate/view/InAppUpdateModalView;", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal;", "Lkotlinx/coroutines/CoroutineScope;", "", "show", "", "t0", "Z", "getEnable", "()Z", "setEnable", "(Z)V", EnableHandler.ID, "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/base/inappupdate/view/InAppUpdateModal$Intent;", "v0", "Lkotlinx/coroutines/flow/Flow;", "getIntents", "()Lkotlinx/coroutines/flow/Flow;", "intents", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/glomohybrid/base/inappupdate/view/model/InAppUpdateModalConfiguration;", "configuration", "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;", "halfModalComponent", "<init>", "(Lcom/bbva/glomohybrid/base/inappupdate/view/model/InAppUpdateModalConfiguration;Landroidx/fragment/app/FragmentActivity;Lcom/bbva/component/ui/modal/halfmodal/HalfModalComponent;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class InAppUpdateModalView implements InAppUpdateModal, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final InAppUpdateModalConfiguration f32197p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f32198q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final HalfModalComponent f32199r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f32200s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public boolean enable;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Channel<InAppUpdateModal.Intent> f32202u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Flow<InAppUpdateModal.Intent> intents;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final List<String> f32203w0;

    public InAppUpdateModalView(@NotNull InAppUpdateModalConfiguration configuration, @NotNull FragmentActivity activity, @NotNull HalfModalComponent halfModalComponent) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(halfModalComponent, "halfModalComponent");
        this.f32197p0 = configuration;
        this.f32198q0 = activity;
        this.f32199r0 = halfModalComponent;
        this.f32200s0 = CoroutineScopeKt.MainScope();
        this.enable = true;
        Channel<InAppUpdateModal.Intent> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f32202u0 = channelChannel$default;
        this.intents = FlowKt.receiveAsFlow(channelChannel$default);
        this.f32203w0 = d.listOf(InAppUpdateModal.Type.Simple.INSTANCE.getFragmentTag());
        activity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(new FragmentManager.FragmentLifecycleCallbacks() { // from class: com.bbva.glomohybrid.inappupdate.view.InAppUpdateModalView$lifecycleCallback$1
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public void onFragmentViewCreated(@NotNull FragmentManager fm, @NotNull Fragment f6, @NotNull View v3, @Nullable Bundle b10) {
                Intrinsics.checkNotNullParameter(fm, "fm");
                Intrinsics.checkNotNullParameter(f6, "f");
                Intrinsics.checkNotNullParameter(v3, "v");
                InAppUpdateModalView.access$handleFragmentViewCreated(this.f32204p0, (DialogFragment) f6, v3);
            }
        }, false);
    }

    public static final void access$handleFragmentViewCreated(InAppUpdateModalView inAppUpdateModalView, DialogFragment dialogFragment, View view) {
        CellsButton cellsButton;
        inAppUpdateModalView.getClass();
        String tag = dialogFragment.getTag();
        if (tag == null || !inAppUpdateModalView.f32203w0.contains(tag) || (cellsButton = (CellsButton) view.findViewById(R.id.positiveButton)) == null) {
            return;
        }
        CellsButton.setOnClickListenerBlocked$default(cellsButton, 0L, new b(dialogFragment, inAppUpdateModalView), 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f32200s0.getCoroutineContext();
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal
    public boolean getEnable() {
        return this.enable;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal
    @NotNull
    public Flow<InAppUpdateModal.Intent> getIntents() {
        return this.intents;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal
    public void setEnable(boolean z10) {
        this.enable = z10;
    }

    @Override // com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal
    public void show() {
        InAppUpdateModalConfiguration inAppUpdateModalConfiguration = this.f32197p0;
        int message = inAppUpdateModalConfiguration.getMessage();
        FragmentActivity fragmentActivity = this.f32198q0;
        String string = fragmentActivity.getString(message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = fragmentActivity.getString(inAppUpdateModalConfiguration.getPositiveButton());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f32199r0.configure(new HalfModalState(HalfModalType.DEFAULT, "", R.drawable.ic_close_cross, Integer.valueOf(R.drawable.ic_warning_status), (String) null, string, new ButtonConfig(string2, true), (ButtonConfig) null, 144, (DefaultConstructorMarker) null)).show(fragmentActivity);
    }
}
