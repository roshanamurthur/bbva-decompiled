package com.veridas.lifecycle;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.veridas.config.Configuration;
import com.veridas.display.DisplayOrientation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DasViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000b\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000eR\u0010\u0010\u0006\u001a\u00028\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/veridas/lifecycle/DasViewModel;", "C", "Lcom/veridas/config/Configuration;", "Landroidx/lifecycle/ViewModel;", "state", "Landroidx/lifecycle/SavedStateHandle;", "configuration", "(Landroidx/lifecycle/SavedStateHandle;Lcom/veridas/config/Configuration;)V", "Lcom/veridas/config/Configuration;", "getState", "()Landroidx/lifecycle/SavedStateHandle;", "getConfiguration", "()Lcom/veridas/config/Configuration;", "getDisplayOrientation", "Lcom/veridas/display/DisplayOrientation;", "setConfiguration", "", "(Lcom/veridas/config/Configuration;)V", "setDisplayOrientation", "displayOrientation", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DasViewModel<C extends Configuration> extends ViewModel {

    @NotNull
    private C configuration;

    @NotNull
    private final SavedStateHandle state;

    public DasViewModel(@NotNull SavedStateHandle state, @NotNull C configuration) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.state = state;
        this.configuration = configuration;
        configuration.load(state);
    }

    @NotNull
    public final C getConfiguration() {
        return this.configuration;
    }

    @NotNull
    public final DisplayOrientation getDisplayOrientation() {
        String str = (String) this.state.get(DasViewModelKt.KEY_DISPLAY_ORIENTATION);
        return str != null ? DisplayOrientation.valueOf(str) : DisplayOrientation.PORTRAIT;
    }

    @NotNull
    public final SavedStateHandle getState() {
        return this.state;
    }

    public final void setConfiguration(@NotNull C configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        configuration.store(this.state);
        this.configuration = configuration;
    }

    public final void setDisplayOrientation(@NotNull DisplayOrientation displayOrientation) {
        Intrinsics.checkNotNullParameter(displayOrientation, "displayOrientation");
        this.state.set(DasViewModelKt.KEY_DISPLAY_ORIENTATION, displayOrientation.toString());
    }
}
