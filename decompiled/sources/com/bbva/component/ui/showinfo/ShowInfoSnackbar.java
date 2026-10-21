package com.bbva.component.ui.showinfo;

import a6.a;
import android.content.Context;
import android.content.res.TypedArray;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.cells.component.kit.common.RxComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.showinfo.InfoSnackbar;
import com.bbva.showinfo.model.snackbar.InfoSnackbarTextAlignment;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.google.android.material.snackbar.Snackbar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ShowInfoSnackbar.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00040\u0004J\u001c\u0010\n\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004J\u001c\u0010\u000b\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004J\u001c\u0010\f\u001a\u00020\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/ui/showinfo/ShowInfoSnackbar;", "Lcom/bbva/cells/component/kit/common/RxComponent;", "", "getId", "", "message", "", "setTextMessage", "", "config", "setDurationInMillis", "setTextGravity", "setTextMaxLines", "show", "dismiss", "Landroid/content/Context;", "context", "id", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "component-ui-showinfo_release"}, k = 1, mv = {1, 4, 0})
public final class ShowInfoSnackbar extends RxComponent {
    public final int F0;
    public final int G0;
    public final a H0;
    public final ShowInfoSnackbar$setOnAnimationDismissed$1 I0;
    public final Context J0;
    public final String K0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public InfoSnackbar f28763t0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final float f28766x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f28767y0;

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_SNACKBAR_CLICK = new ActionSpec<>("snackbar-click");

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_SNACKBAR_DISMISSED = new ActionSpec<>("snackbar-dismissed");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f28764u0 = "";
    public int v0 = WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public InfoSnackbarTextAlignment f28765w0 = InfoSnackbarTextAlignment.START;
    public int E0 = 5;

    /* JADX WARN: Type inference failed for: r5v3, types: [com.bbva.component.ui.showinfo.ShowInfoSnackbar$setOnAnimationDismissed$1] */
    public ShowInfoSnackbar(@NotNull Context context, @NotNull String str) {
        this.J0 = context;
        this.K0 = str;
        this.f28766x0 = 14.0f;
        ShowInfoSnackbarDynamicPropertyBinder.a(this);
        TypedArray array = context.obtainStyledAttributes(null, R.styleable.SnackbarView, 0, R.style.SnackbarView);
        Intrinsics.checkExpressionValueIsNotNull(array, "array");
        int i10 = R.styleable.SnackbarView_snackbar_font;
        this.G0 = array.hasValue(i10) ? array.getResourceId(i10, 0) : 0;
        int i11 = R.styleable.SnackbarView_snackbar_font_size;
        this.f28766x0 = array.hasValue(i11) ? array.getFloat(i11, 14.0f) : 14.0f;
        int i12 = R.styleable.SnackbarView_snackbar_text_color;
        this.f28767y0 = array.hasValue(i12) ? array.getColor(i12, 0) : 0;
        int i13 = R.styleable.SnackbarView_snackbar_background_color;
        this.F0 = array.hasValue(i13) ? array.getColor(i13, 0) : 0;
        array.recycle();
        this.H0 = new a(this);
        this.I0 = new Snackbar.Callback() { // from class: com.bbva.component.ui.showinfo.ShowInfoSnackbar$setOnAnimationDismissed$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(@Nullable Snackbar transientBottomBar, int event) {
                super.onDismissed(transientBottomBar, event);
                this.f28768a.fire(ShowInfoSnackbar.ACTION_SNACKBAR_DISMISSED);
            }
        };
    }

    public static InfoSnackbarTextAlignment b(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1364013995) {
            if (iHashCode != 100571) {
                if (iHashCode == 109757538 && str.equals(EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                    return InfoSnackbarTextAlignment.START;
                }
            } else if (str.equals("end")) {
                return InfoSnackbarTextAlignment.END;
            }
        } else if (str.equals("center")) {
            return InfoSnackbarTextAlignment.CENTER;
        }
        return InfoSnackbarTextAlignment.START;
    }

    public final void dismiss() {
        InfoSnackbar infoSnackbar = this.f28763t0;
        if (infoSnackbar != null) {
            infoSnackbar.dismiss();
        }
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getK0() {
        return this.K0;
    }

    public final void setDurationInMillis(@NotNull Map<String, ? extends Object> config) {
        Object obj = config.get("value");
        if (!(obj instanceof Double)) {
            obj = null;
        }
        Double d2 = (Double) obj;
        if (d2 != null) {
            this.v0 = (int) d2.doubleValue();
        }
    }

    public final void setTextGravity(@NotNull Map<String, ? extends Object> config) {
        Object obj = config.get("value");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            this.f28765w0 = b(str);
        }
    }

    public final void setTextMaxLines(@NotNull Map<String, ? extends Object> config) {
        Object obj = config.get("value");
        if (!(obj instanceof Double)) {
            obj = null;
        }
        Double d2 = (Double) obj;
        if (d2 != null) {
            this.E0 = (int) d2.doubleValue();
        }
    }

    public final void setTextMessage(@NotNull Map<String, ? extends Map<String, String>> message) {
        String strLoadString = PropertiesHelper.loadString(this.J0, PropertiesHelper.Property.from(message.get("text")));
        Intrinsics.checkExpressionValueIsNotNull(strLoadString, "PropertiesHelper.loadStr…context, messageProperty)");
        this.f28764u0 = strLoadString;
    }

    public final void show() {
        InfoSnackbar.Companion companion = InfoSnackbar.Companion;
        InfoSnackbar.Builder builder = new InfoSnackbar.Builder(this.J0);
        builder.setMessage(this.f28764u0);
        builder.setDurationInMillis(this.v0);
        builder.setGravity(this.f28765w0);
        builder.setSize(this.f28766x0);
        builder.setColor(this.f28767y0);
        builder.setBackgroundColor(this.F0);
        builder.setFont(Integer.valueOf(this.G0));
        builder.setMaxLines(this.E0);
        builder.setOnClickListener(this.H0);
        builder.setOnDismissedCallback(this.I0);
        InfoSnackbar infoSnackbarBuild = builder.build();
        this.f28763t0 = infoSnackbarBuild;
        if (infoSnackbarBuild != null) {
            infoSnackbarBuild.show();
        }
    }
}
