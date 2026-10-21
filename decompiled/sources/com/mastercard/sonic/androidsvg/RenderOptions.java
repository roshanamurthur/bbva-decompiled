package com.mastercard.sonic.androidsvg;

import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RenderOptions.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0015\b\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b9\u0010:J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J&\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0004J&\u0010\u0013\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0017\u001a\u00020\u0004R$\u0010\u0003\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\u0011\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010&\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R$\u0010\u0013\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101¨\u0006<"}, d2 = {"Lcom/mastercard/sonic/androidsvg/RenderOptions;", "", "", "css", "", "hasCss", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "preserveAspectRatio", "hasPreserveAspectRatio", "viewId", "view", "hasView", "", "minX", "minY", "width", "height", "viewBox", "hasViewBox", "viewPort", "hasViewPort", "targetId", "target", "hasTarget", "Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;", "a", "Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;", "getCss", "()Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;", "setCss", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;)V", "b", "Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "getPreserveAspectRatio", "()Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;", "setPreserveAspectRatio", "(Lcom/mastercard/sonic/androidsvg/PreserveAspectRatio;)V", "c", "Ljava/lang/String;", "getTargetId", "()Ljava/lang/String;", "setTargetId", "(Ljava/lang/String;)V", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "d", "Lcom/mastercard/sonic/androidsvg/SVG$Box;", "getViewBox", "()Lcom/mastercard/sonic/androidsvg/SVG$Box;", "setViewBox", "(Lcom/mastercard/sonic/androidsvg/SVG$Box;)V", "e", "getViewId", "setViewId", "f", "getViewPort", "setViewPort", "other", "<init>", "(Lcom/mastercard/sonic/androidsvg/RenderOptions;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class RenderOptions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public CSSParser.Ruleset css;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PreserveAspectRatio preserveAspectRatio;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String targetId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SVG.Box viewBox;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String viewId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SVG.Box viewPort;

    /* JADX INFO: compiled from: RenderOptions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/RenderOptions$Companion;", "", "()V", "create", "Lcom/mastercard/sonic/androidsvg/RenderOptions;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        @NotNull
        public final RenderOptions create() {
            return new RenderOptions(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public RenderOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmStatic
    @NotNull
    public static final RenderOptions create() {
        return INSTANCE.create();
    }

    @NotNull
    public final RenderOptions css(@NotNull String css) {
        Intrinsics.checkNotNullParameter(css, "css");
        this.css = new CSSParser(CSSParser.Source.RenderOptions).parse(css);
        return this;
    }

    @Nullable
    public final CSSParser.Ruleset getCss() {
        return this.css;
    }

    @Nullable
    public final PreserveAspectRatio getPreserveAspectRatio() {
        return this.preserveAspectRatio;
    }

    @Nullable
    public final String getTargetId() {
        return this.targetId;
    }

    @Nullable
    public final SVG.Box getViewBox() {
        return this.viewBox;
    }

    @Nullable
    public final String getViewId() {
        return this.viewId;
    }

    @Nullable
    public final SVG.Box getViewPort() {
        return this.viewPort;
    }

    public final boolean hasCss() {
        CSSParser.Ruleset ruleset = this.css;
        if (ruleset != null) {
            Intrinsics.checkNotNull(ruleset);
            if (ruleset.ruleCount() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasPreserveAspectRatio() {
        return this.preserveAspectRatio != null;
    }

    public final boolean hasTarget() {
        return this.targetId != null;
    }

    public final boolean hasView() {
        return this.viewId != null;
    }

    public final boolean hasViewBox() {
        return this.viewBox != null;
    }

    public final boolean hasViewPort() {
        return this.viewPort != null;
    }

    @NotNull
    public final RenderOptions preserveAspectRatio(@Nullable PreserveAspectRatio preserveAspectRatio) {
        this.preserveAspectRatio = preserveAspectRatio;
        return this;
    }

    public final void setCss(@Nullable CSSParser.Ruleset ruleset) {
        this.css = ruleset;
    }

    public final void setPreserveAspectRatio(@Nullable PreserveAspectRatio preserveAspectRatio) {
        this.preserveAspectRatio = preserveAspectRatio;
    }

    public final void setTargetId(@Nullable String str) {
        this.targetId = str;
    }

    public final void setViewBox(@Nullable SVG.Box box) {
        this.viewBox = box;
    }

    public final void setViewId(@Nullable String str) {
        this.viewId = str;
    }

    public final void setViewPort(@Nullable SVG.Box box) {
        this.viewPort = box;
    }

    @NotNull
    public final RenderOptions target(@Nullable String targetId) {
        this.targetId = targetId;
        return this;
    }

    @NotNull
    public final RenderOptions view(@Nullable String viewId) {
        this.viewId = viewId;
        return this;
    }

    @NotNull
    public final RenderOptions viewBox(float minX, float minY, float width, float height) {
        this.viewBox = new SVG.Box(minX, minY, width, height);
        return this;
    }

    @NotNull
    public final RenderOptions viewPort(float minX, float minY, float width, float height) {
        this.viewPort = new SVG.Box(minX, minY, width, height);
        return this;
    }

    @JvmOverloads
    public RenderOptions(@Nullable RenderOptions renderOptions) {
        if (renderOptions != null) {
            this.css = renderOptions.css;
            this.preserveAspectRatio = renderOptions.preserveAspectRatio;
            this.viewBox = renderOptions.viewBox;
            this.viewId = renderOptions.viewId;
            this.viewPort = renderOptions.viewPort;
        }
    }

    public /* synthetic */ RenderOptions(RenderOptions renderOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : renderOptions);
    }
}
