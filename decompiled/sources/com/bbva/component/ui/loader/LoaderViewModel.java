package com.bbva.component.ui.loader;

import android.app.Application;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.Reactor;
import com.bbva.nativesettings.common.Constants;
import com.bbva.plugin.showinfo.command.HideCommand;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoaderViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u001d\u0010\u000b\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u000f\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0019\u0010\u0015\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0014R\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010\u001e\u001a\u0004\b,\u0010 R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b/\u0010 ¨\u00066"}, d2 = {"Lcom/bbva/component/ui/loader/LoaderViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", "", HideCommand.ID, "show", "nextStep", "", "", "messages", "storeMessages$component_ui_loader_release", "(Ljava/util/List;)V", "storeMessages", "lastStepFinish$component_ui_loader_release", "()V", "lastStepFinish", "showSecondaryMessage", "hideSecondaryMessage", "", "secondaryMessage", "storeSecondaryMessage$component_ui_loader_release", "(Ljava/lang/String;)V", "storeSecondaryMessage", "v0", "Ljava/lang/String;", "getSecondaryMessage$component_ui_loader_release", "()Ljava/lang/String;", "setSecondaryMessage$component_ui_loader_release", "getSecondaryMessage$component_ui_loader_release$annotations", "Landroidx/lifecycle/LiveData;", "w0", "Landroidx/lifecycle/LiveData;", "getShowLiveData$component_ui_loader_release", "()Landroidx/lifecycle/LiveData;", "showLiveData", "x0", "getNextStepLiveData$component_ui_loader_release", "nextStepLiveData", "y0", "getLastStepLiveData$component_ui_loader_release", "lastStepLiveData", "E0", "getHideLiveData$component_ui_loader_release", "hideLiveData", "F0", "getShowSecondaryMessageLiveData$component_ui_loader_release", "showSecondaryMessageLiveData", "G0", "getHideSecondaryMessageLiveData$component_ui_loader_release", "hideSecondaryMessageLiveData", "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Companion", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoaderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderViewModel.kt\ncom/bbva/component/ui/loader/LoaderViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class LoaderViewModel extends ViewModel {

    @NotNull
    public final MutableLiveData E0;

    @NotNull
    public final MutableLiveData F0;

    @NotNull
    public final MutableLiveData G0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f28438r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public List<? extends CharSequence> f28439s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f28440t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f28441u0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public String secondaryMessage;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f28442w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f28443x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData f28444y0;

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_LAST_STEP_FINISH = new ActionSpec<>("last-step-finish");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoaderViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f28439s0 = CollectionsKt__CollectionsKt.emptyList();
        MutableLiveData mutableLiveDataNewProperty = newProperty("PROPERTY_SHOW");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty, "newProperty(...)");
        this.f28442w0 = mutableLiveDataNewProperty;
        MutableLiveData mutableLiveDataNewProperty2 = newProperty("PROPERTY_NEXT_STEP");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty2, "newProperty(...)");
        this.f28443x0 = mutableLiveDataNewProperty2;
        MutableLiveData mutableLiveDataNewProperty3 = newProperty("PROPERTY_LAST_STEP");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty3, "newProperty(...)");
        this.f28444y0 = mutableLiveDataNewProperty3;
        MutableLiveData mutableLiveDataNewProperty4 = newProperty("PROPERTY_HIDE");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty4, "newProperty(...)");
        this.E0 = mutableLiveDataNewProperty4;
        MutableLiveData mutableLiveDataNewProperty5 = newProperty("PROPERTY_SHOW_CONNECTIVITY_MESSAGE");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty5, "newProperty(...)");
        this.F0 = mutableLiveDataNewProperty5;
        MutableLiveData mutableLiveDataNewProperty6 = newProperty("PROPERTY_HIDE_CONNECTIVITY_MESSAGE");
        Intrinsics.checkNotNullExpressionValue(mutableLiveDataNewProperty6, "newProperty(...)");
        this.G0 = mutableLiveDataNewProperty6;
    }

    @NotNull
    public final LiveData<Unit> getHideLiveData$component_ui_loader_release() {
        return this.E0;
    }

    @NotNull
    public final LiveData<String> getHideSecondaryMessageLiveData$component_ui_loader_release() {
        return this.G0;
    }

    @NotNull
    public final LiveData<Unit> getLastStepLiveData$component_ui_loader_release() {
        return this.f28444y0;
    }

    @NotNull
    public final LiveData<String> getNextStepLiveData$component_ui_loader_release() {
        return this.f28443x0;
    }

    @Nullable
    /* JADX INFO: renamed from: getSecondaryMessage$component_ui_loader_release, reason: from getter */
    public final String getSecondaryMessage() {
        return this.secondaryMessage;
    }

    @NotNull
    public final LiveData<String> getShowLiveData$component_ui_loader_release() {
        return this.f28442w0;
    }

    @NotNull
    public final LiveData<String> getShowSecondaryMessageLiveData$component_ui_loader_release() {
        return this.F0;
    }

    public final void hide() {
        if (this.f28440t0) {
            this.f28440t0 = false;
            setProperty("PROPERTY_HIDE", Unit.INSTANCE);
        }
    }

    public final void hideSecondaryMessage() {
        if (this.f28441u0) {
            this.f28441u0 = false;
            String str = this.secondaryMessage;
            if (str != null) {
                setProperty("PROPERTY_HIDE_CONNECTIVITY_MESSAGE", str);
            }
        }
    }

    public final void lastStepFinish$component_ui_loader_release() {
        Reactor.inside(getF32219p0()).doAction(ACTION_LAST_STEP_FINISH).fire();
    }

    public final void nextStep() {
        int i10 = this.f28438r0 + 1;
        this.f28438r0 = i10;
        CharSequence charSequence = (CharSequence) CollectionsKt___CollectionsKt.getOrNull(this.f28439s0, i10);
        boolean z10 = charSequence != null;
        if (z10) {
            setProperty("PROPERTY_NEXT_STEP", charSequence);
        } else {
            if (z10 || i10 != this.f28439s0.size()) {
                return;
            }
            setProperty("PROPERTY_LAST_STEP", Unit.INSTANCE);
        }
    }

    public final void setSecondaryMessage$component_ui_loader_release(@Nullable String str) {
        this.secondaryMessage = str;
    }

    public final void show() {
        if (this.f28440t0) {
            return;
        }
        this.f28441u0 = false;
        this.f28440t0 = true;
        this.f28438r0 = 0;
        setProperty("PROPERTY_SHOW", CollectionsKt___CollectionsKt.firstOrNull((List) this.f28439s0));
    }

    public final void showSecondaryMessage() {
        if (this.f28441u0) {
            return;
        }
        this.f28441u0 = true;
        String str = this.secondaryMessage;
        if (str != null) {
            setProperty("PROPERTY_SHOW_CONNECTIVITY_MESSAGE", str);
        }
    }

    public final void storeMessages$component_ui_loader_release(@NotNull List<? extends CharSequence> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.f28439s0 = messages;
    }

    public final void storeSecondaryMessage$component_ui_loader_release(@Nullable String secondaryMessage) {
        this.secondaryMessage = secondaryMessage;
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getSecondaryMessage$component_ui_loader_release$annotations() {
    }
}
