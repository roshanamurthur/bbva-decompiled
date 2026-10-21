package com.veridas.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.PopupWindow;
import androidx.camera.camera2.internal.compat.u;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.dialog.ConcretePopupWindowBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PopupWindowBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0014H\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006!"}, d2 = {"Lcom/veridas/dialog/ConcretePopupWindowBuilder;", "Lcom/veridas/dialog/PopupWindowBuilder;", "Landroid/content/Context;", "value", "context", "Landroid/view/LayoutInflater;", "layoutInflater", "", "width", "height", "", "focusable", "touchable", "outsideTouchable", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Landroid/view/View$OnTouchListener;", "touchListener", "popupViewId", "popupTextViewId", "", "message", "textColor", "backgroundColor", "verticalScrollbarEnabled", "Landroid/view/ViewGroup;", "container", "Landroid/widget/PopupWindow;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/dialog/PopupWindowRegistry;", "registry", "<init>", "(Landroid/content/Context;Landroid/view/LayoutInflater;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/graphics/drawable/Drawable;Landroid/view/View$OnTouchListener;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Landroid/view/ViewGroup;Lcom/veridas/dialog/PopupWindowRegistry;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class ConcretePopupWindowBuilder implements PopupWindowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Context f67079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public LayoutInflater f67080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f67081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f67082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Boolean f67083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Boolean f67084f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public Boolean f67085g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Drawable f67086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public View.OnTouchListener f67087i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Integer f67088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Integer f67089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f67090l;

    @Nullable
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public Integer f67091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Boolean f67092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public ViewGroup f67093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final PopupWindowRegistry f67094q;

    public ConcretePopupWindowBuilder(@Nullable Context context, @Nullable LayoutInflater layoutInflater, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Drawable drawable, @Nullable View.OnTouchListener onTouchListener, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable String str2, @Nullable Integer num5, @Nullable Boolean bool4, @Nullable ViewGroup viewGroup, @NotNull PopupWindowRegistry registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f67079a = context;
        this.f67080b = layoutInflater;
        this.f67081c = num;
        this.f67082d = num2;
        this.f67083e = bool;
        this.f67084f = bool2;
        this.f67085g = bool3;
        this.f67086h = drawable;
        this.f67087i = onTouchListener;
        this.f67088j = num3;
        this.f67089k = num4;
        this.f67090l = str;
        this.m = str2;
        this.f67091n = num5;
        this.f67092o = bool4;
        this.f67093p = viewGroup;
        this.f67094q = registry;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public PopupWindow build() {
        if (this.f67079a == null) {
            throw new IllegalArgumentException("A required parameter is missing: context".toString());
        }
        LayoutInflater layoutInflater = this.f67080b;
        if (layoutInflater == null) {
            throw new IllegalArgumentException("A required parameter is missing: layoutInflater".toString());
        }
        ViewGroup viewGroup = this.f67093p;
        if (viewGroup == null) {
            throw new IllegalArgumentException("A required parameter is missing: container".toString());
        }
        String str = this.m;
        if (str == null) {
            throw new IllegalArgumentException("A required parameter is missing: textColor".toString());
        }
        String str2 = this.f67090l;
        if (str2 == null) {
            throw new IllegalArgumentException("A required parameter is missing: message".toString());
        }
        String strG = u.g("\n<string name=\"vd_document_help\";>\n    <html>\n        <head></head>\n        <body style=\"text-align:justify;color:", str, ";font-size:20px;background-color:none;margin-left:50;margin-right:50;margin-top:20;margin-bottom:20;\">\n        ", str2, "\n        </body>\n    </html>\n</string>");
        Integer num = this.f67088j;
        if (num == null) {
            throw new IllegalArgumentException("A required parameter is missing: popupViewId".toString());
        }
        View viewInflate = layoutInflater.inflate(num.intValue(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        Integer num2 = this.f67089k;
        if (num2 == null) {
            throw new IllegalArgumentException("A required parameter is missing: popupTextViewId".toString());
        }
        WebView webView = (WebView) viewInflate.findViewById(num2.intValue());
        Boolean bool = this.f67092o;
        if (bool == null) {
            throw new IllegalArgumentException("A required parameter is missing: requireNotNull".toString());
        }
        webView.setVerticalScrollBarEnabled(bool.booleanValue());
        webView.loadDataWithBaseURL(null, strG, "text/html", "UTF-8", null);
        Integer num3 = this.f67091n;
        if (num3 == null) {
            throw new IllegalArgumentException("A required parameter is missing: backgroundColor".toString());
        }
        webView.setBackgroundColor(num3.intValue());
        Integer num4 = this.f67081c;
        if (num4 == null) {
            throw new IllegalArgumentException("A required parameter is missing: width".toString());
        }
        Integer num5 = this.f67082d;
        if (num5 == null) {
            throw new IllegalArgumentException("A required parameter is missing: height".toString());
        }
        Boolean bool2 = this.f67083e;
        if (bool2 == null) {
            throw new IllegalArgumentException("A required parameter is missing: focusable".toString());
        }
        Boolean bool3 = this.f67084f;
        if (bool3 == null) {
            throw new IllegalArgumentException("A required parameter is missing: touchable".toString());
        }
        Boolean bool4 = this.f67085g;
        if (bool4 == null) {
            throw new IllegalArgumentException("A required parameter is missing: outsideTouchable".toString());
        }
        final PopupWindow popupWindow = new PopupWindow(viewInflate, num4.intValue(), num5.intValue(), bool2.booleanValue());
        popupWindow.setTouchable(bool3.booleanValue());
        popupWindow.setOutsideTouchable(bool4.booleanValue());
        Drawable drawable = this.f67086h;
        if (drawable != null) {
            popupWindow.setBackgroundDrawable(drawable);
        }
        popupWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: aj.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PopupWindow created = popupWindow;
                Intrinsics.checkNotNullParameter(created, "$created");
                ConcretePopupWindowBuilder this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                created.dismiss();
                View.OnTouchListener onTouchListener = this$0.f67087i;
                if (onTouchListener != null) {
                    onTouchListener.onTouch(view, motionEvent);
                }
                return motionEvent.getAction() != 4;
            }
        });
        viewInflate.setOnTouchListener(this.f67087i);
        webView.setOnTouchListener(this.f67087i);
        this.f67094q.add(popupWindow);
        return popupWindow;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder backgroundColor(int value) {
        this.f67091n = Integer.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder backgroundDrawable(@NotNull Drawable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67086h = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder container(@NotNull ViewGroup value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67093p = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder context(@NotNull Context value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67079a = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder focusable(boolean value) {
        this.f67083e = Boolean.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder height(int value) {
        this.f67082d = Integer.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder layoutInflater(@NotNull LayoutInflater value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67080b = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder message(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67090l = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder outsideTouchable(boolean value) {
        this.f67085g = Boolean.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder popupTextViewId(int value) {
        this.f67089k = Integer.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder popupViewId(int value) {
        this.f67088j = Integer.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder textColor(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.m = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder touchListener(@NotNull View.OnTouchListener value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67087i = value;
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder touchable(boolean value) {
        this.f67084f = Boolean.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder verticalScrollbarEnabled(boolean value) {
        this.f67092o = Boolean.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.PopupWindowBuilder
    @NotNull
    public ConcretePopupWindowBuilder width(int value) {
        this.f67081c = Integer.valueOf(value);
        return this;
    }

    public /* synthetic */ ConcretePopupWindowBuilder(Context context, LayoutInflater layoutInflater, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Drawable drawable, View.OnTouchListener onTouchListener, Integer num3, Integer num4, String str, String str2, Integer num5, Boolean bool4, ViewGroup viewGroup, PopupWindowRegistry popupWindowRegistry, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : context, (i10 & 2) != 0 ? null : layoutInflater, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : bool2, (i10 & 64) != 0 ? null : bool3, (i10 & 128) != 0 ? null : drawable, (i10 & 256) != 0 ? null : onTouchListener, (i10 & 512) != 0 ? null : num3, (i10 & 1024) != 0 ? null : num4, (i10 & 2048) != 0 ? null : str, (i10 & 4096) != 0 ? null : str2, (i10 & 8192) != 0 ? null : num5, (i10 & 16384) != 0 ? null : bool4, (i10 & 32768) != 0 ? null : viewGroup, popupWindowRegistry);
    }
}
