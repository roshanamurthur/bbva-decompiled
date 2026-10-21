package androidx.compose.animation;

import androidx.compose.runtime.Immutable;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b&\u0010'J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Landroidx/compose/animation/TransitionData;", "", "Landroidx/compose/animation/Fade;", "component1", "Landroidx/compose/animation/Slide;", "component2", "Landroidx/compose/animation/ChangeSize;", "component3", "Landroidx/compose/animation/Scale;", "component4", "fade", "slide", "changeSize", ImageScaleTypeHandler.ID, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/animation/Fade;", "getFade", "()Landroidx/compose/animation/Fade;", "b", "Landroidx/compose/animation/Slide;", "getSlide", "()Landroidx/compose/animation/Slide;", "c", "Landroidx/compose/animation/ChangeSize;", "getChangeSize", "()Landroidx/compose/animation/ChangeSize;", "d", "Landroidx/compose/animation/Scale;", "getScale", "()Landroidx/compose/animation/Scale;", "<init>", "(Landroidx/compose/animation/Fade;Landroidx/compose/animation/Slide;Landroidx/compose/animation/ChangeSize;Landroidx/compose/animation/Scale;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TransitionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Fade fade;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Slide slide;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final ChangeSize changeSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Scale scale;

    public TransitionData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TransitionData copy$default(TransitionData transitionData, Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fade = transitionData.fade;
        }
        if ((i10 & 2) != 0) {
            slide = transitionData.slide;
        }
        if ((i10 & 4) != 0) {
            changeSize = transitionData.changeSize;
        }
        if ((i10 & 8) != 0) {
            scale = transitionData.scale;
        }
        return transitionData.copy(fade, slide, changeSize, scale);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Fade getFade() {
        return this.fade;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Slide getSlide() {
        return this.slide;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    @NotNull
    public final TransitionData copy(@Nullable Fade fade, @Nullable Slide slide, @Nullable ChangeSize changeSize, @Nullable Scale scale) {
        return new TransitionData(fade, slide, changeSize, scale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) other;
        return Intrinsics.areEqual(this.fade, transitionData.fade) && Intrinsics.areEqual(this.slide, transitionData.slide) && Intrinsics.areEqual(this.changeSize, transitionData.changeSize) && Intrinsics.areEqual(this.scale, transitionData.scale);
    }

    @Nullable
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    @Nullable
    public final Fade getFade() {
        return this.fade;
    }

    @Nullable
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    public final Slide getSlide() {
        return this.slide;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return iHashCode3 + (scale != null ? scale.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + RootService.CLOSE_BRACKET;
    }

    public TransitionData(@Nullable Fade fade, @Nullable Slide slide, @Nullable ChangeSize changeSize, @Nullable Scale scale) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : fade, (i10 & 2) != 0 ? null : slide, (i10 & 4) != 0 ? null : changeSize, (i10 & 8) != 0 ? null : scale);
    }
}
