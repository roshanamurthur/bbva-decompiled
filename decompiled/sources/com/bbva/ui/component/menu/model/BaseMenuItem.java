package com.bbva.ui.component.menu.model;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.huawei.hms.feature.model.b;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import kotlin.Metadata;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BaseMenuItem.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 -2\u00020\u0001:\u0002-.Br\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0014\u0012\u001b\b\u0002\u0010$\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001f\u0018\u00010\u001e\u0012\b\b\u0002\u0010&\u001a\u00020\u0014\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\"\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR*\u0010$\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\t\u0012\u00070\b¢\u0006\u0002\b\u001f\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\u0019\u0010*\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b)\u0010\f¨\u0006/"}, d2 = {"Lcom/bbva/ui/component/menu/model/BaseMenuItem;", "", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "id", "", "b", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "route", "c", "getText", "text", "d", "getClickAccessibilityLabel", "clickAccessibilityLabel", "", "e", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "f", "isCheckable", "setCheckable", "", "Lom/bbva/ui/component/menu/model/BaseMenuItem$Stat;", "g", "Ljava/util/Map;", "getStates", "()Ljava/util/Map;", b.f50432b, "h", "isFeatured", "setFeatured", "i", "getClickAction", "clickAction", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;ZLjava/lang/String;)V", "Companion", "State", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public class BaseMenuItem {

    @NotNull
    public static final String STATE_DISABLED = "disabled";

    @NotNull
    public static final String STATE_ENABLED = "enabled";

    @NotNull
    public static final String STATE_HIDDEN = "hidden";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String text;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String clickAccessibilityLabel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isChecked;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isCheckable;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Map<String, String> states;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isFeatured;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String clickAction;

    /* JADX INFO: compiled from: BaseMenuItem.kt */
    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/bbva/ui/component/menu/model/BaseMenuItem$State;", "", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface State {
    }

    public BaseMenuItem(int i10, @NotNull String route, @NotNull String text, @Nullable String str, boolean z10, boolean z11, @Nullable Map<String, String> map, boolean z12, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(text, "text");
        this.id = i10;
        this.route = route;
        this.text = text;
        this.clickAccessibilityLabel = str;
        this.isChecked = z10;
        this.isCheckable = z11;
        this.states = map;
        this.isFeatured = z12;
        this.clickAction = str2;
    }

    @Nullable
    public final String getClickAccessibilityLabel() {
        return this.clickAccessibilityLabel;
    }

    @Nullable
    public final String getClickAction() {
        return this.clickAction;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @Nullable
    public final Map<String, String> getStates() {
        return this.states;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: isCheckable, reason: from getter */
    public final boolean getIsCheckable() {
        return this.isCheckable;
    }

    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: isFeatured, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    public final void setCheckable(boolean z10) {
        this.isCheckable = z10;
    }

    public final void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public final void setFeatured(boolean z10) {
        this.isFeatured = z10;
    }

    public /* synthetic */ BaseMenuItem(int i10, String str, String str2, String str3, boolean z10, boolean z11, Map map, boolean z12, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? false : z10, (i11 & 32) != 0 ? true : z11, (i11 & 64) != 0 ? null : map, (i11 & 128) != 0 ? false : z12, (i11 & 256) != 0 ? null : str4);
    }
}
