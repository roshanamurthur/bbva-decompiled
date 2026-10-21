package com.bbva.component.ui.landing.access;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.ActionSpec;
import com.bbva.cells.componentkit.JsonDeserializer;
import com.bbva.cells.componentkit.ViewModel;
import com.bbva.component.ui.landing.access.model.LandingAccessButton;
import com.bbva.component.ui.landing.access.model.LandingAccessConfiguration;
import com.bbva.component.ui.landing.access.model.LandingAccessLink;
import com.bbva.component.ui.landing.access.model.LandingAccessState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingAccessViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\u0005R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/ui/landing/access/LandingAccessViewModel;", "Lcom/bbva/cells/componentkit/ViewModel;", "Lcom/bbva/component/ui/landing/access/model/LandingAccessState;", "", "linkTap$component_ui_landing_access_release", "()V", "linkTap", "buttonTap$component_ui_landing_access_release", "buttonTap", "Lkotlinx/coroutines/flow/Flow;", "", "w0", "Lkotlinx/coroutines/flow/Flow;", "getOnTapEvents", "()Lkotlinx/coroutines/flow/Flow;", "onTapEvents", "<init>", "Companion", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0})
public final class LandingAccessViewModel extends ViewModel<LandingAccessState> {

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<String> onTapEvents;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f28399x0 = new ActionSpec<>("on-item-tapped");

    /* JADX INFO: compiled from: LandingAccessViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/component/ui/landing/access/LandingAccessViewModel$Companion;", "", "()V", "onItemTapped", "Lcom/bbva/cells/componentkit/ActionSpec;", "", "getOnItemTapped", "()Lcom/bbva/cells/componentkit/ActionSpec;", "component-ui-landing-access_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<String> getOnItemTapped() {
            return LandingAccessViewModel.f28399x0;
        }
    }

    public LandingAccessViewModel() {
        super(new JsonDeserializer(LandingAccessState.INSTANCE.serializer()));
        this.onTapEvents = events(f28399x0);
    }

    public final void buttonTap$component_ui_landing_access_release() {
        String id;
        LandingAccessState model = getModel();
        if (model == null) {
            return;
        }
        if (model instanceof LandingAccessState.Loading) {
            id = ((LandingAccessState.Loading) model).getButton().getId();
        } else {
            if (!(model instanceof LandingAccessState.Ready)) {
                throw new NoWhenBranchMatchedException();
            }
            LandingAccessButton button = ((LandingAccessState.Ready) model).getLandingAccessConfiguration().getButton();
            id = button != null ? button.getId() : null;
        }
        fire(f28399x0, id);
    }

    @NotNull
    public final Flow<String> getOnTapEvents() {
        return this.onTapEvents;
    }

    public final void linkTap$component_ui_landing_access_release() {
        LandingAccessConfiguration landingAccessConfiguration;
        LandingAccessLink link;
        LandingAccessState model = getModel();
        LandingAccessState.Ready ready = model instanceof LandingAccessState.Ready ? (LandingAccessState.Ready) model : null;
        if (ready == null || (landingAccessConfiguration = ready.getLandingAccessConfiguration()) == null || (link = landingAccessConfiguration.getLink()) == null) {
            return;
        }
        fire(f28399x0, link.getId());
    }
}
