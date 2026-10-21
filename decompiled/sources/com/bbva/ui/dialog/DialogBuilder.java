package com.bbva.ui.dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.afollestad.materialdialogs.MaterialDialog;
import com.afollestad.materialdialogs.customview.DialogCustomViewExtKt;
import com.afollestad.materialdialogs.input.DialogInputExtKt;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogBuilder.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J \u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\"\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ)\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u000f\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tJ\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014J$\u0010\u0018\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\u0017J\b\u0010\u001a\u001a\u00020\u0019H\u0007¨\u0006\u001f"}, d2 = {"Lcom/bbva/ui/dialog/DialogBuilder;", "", "", "titleResId", "title", "", "messageResId", "message", "positiveLabelResId", "Lkotlin/Function0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "positiveButton", "positiveLabel", "negativeLabelResId", "negativeButton", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)Lcom/bbva/ui/dialog/DialogBuilder;", "negativeLabel", "Landroid/view/View;", "customView", "", "wrapInScrollView", "inputText", "Lkotlin/Function1;", "input", "Landroid/app/Dialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
public final class DialogBuilder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f37631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f37632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f37633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View f37634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f37636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f37637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public String f37638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f37639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f37640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f37641k;

    /* JADX INFO: compiled from: DialogBuilder.kt */
    public static final class a extends Lambda implements Function1<MaterialDialog, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MaterialDialog materialDialog) {
            MaterialDialog it = materialDialog;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0 function0 = DialogBuilder.this.f37639i;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DialogBuilder.kt */
    public static final class b extends Lambda implements Function1<MaterialDialog, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MaterialDialog materialDialog) {
            MaterialDialog it = materialDialog;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0 function0 = DialogBuilder.this.f37640j;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DialogBuilder.kt */
    public static final class c extends Lambda implements Function2<MaterialDialog, CharSequence, Unit> {
        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(MaterialDialog materialDialog, CharSequence charSequence) {
            CharSequence input = charSequence;
            Intrinsics.checkNotNullParameter(materialDialog, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(input, "input");
            Function1 function1 = DialogBuilder.this.f37641k;
            if (function1 != null) {
                function1.invoke(input.toString());
            }
            return Unit.INSTANCE;
        }
    }

    public DialogBuilder(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37631a = context;
    }

    public static /* synthetic */ DialogBuilder customView$default(DialogBuilder dialogBuilder, View view, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return dialogBuilder.customView(view, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogBuilder negativeButton$default(DialogBuilder dialogBuilder, Integer num, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        return dialogBuilder.negativeButton(num, (Function0<Unit>) function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogBuilder positiveButton$default(DialogBuilder dialogBuilder, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function0 = null;
        }
        return dialogBuilder.positiveButton(i10, (Function0<Unit>) function0);
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final Dialog build() {
        MaterialDialog materialDialog = new MaterialDialog(this.f37631a, null, 2, null);
        if (!TextUtils.isEmpty(this.f37632b)) {
            MaterialDialog.title$default(materialDialog, null, this.f37632b, 1, null);
        }
        if (!TextUtils.isEmpty(this.f37633c)) {
            MaterialDialog.message$default(materialDialog, null, this.f37633c, null, 5, null);
        }
        if (!TextUtils.isEmpty(this.f37637g)) {
            MaterialDialog.positiveButton$default(materialDialog, null, this.f37637g, new a(), 1, null);
        }
        if (!TextUtils.isEmpty(this.f37638h)) {
            MaterialDialog.negativeButton$default(materialDialog, null, this.f37638h, new b(), 1, null);
        }
        if (this.f37641k != null) {
            DialogInputExtKt.input$default(materialDialog, null, null, this.f37636f, null, 0, null, false, false, new c(), 251, null);
        }
        View view = this.f37634d;
        if (view != null) {
            DialogCustomViewExtKt.customView$default(materialDialog, null, view, this.f37635e, false, false, false, 57, null);
        }
        return materialDialog;
    }

    @NotNull
    public final DialogBuilder customView(@NotNull View customView, boolean wrapInScrollView) {
        Intrinsics.checkNotNullParameter(customView, "customView");
        this.f37634d = customView;
        this.f37635e = wrapInScrollView;
        return this;
    }

    @NotNull
    public final DialogBuilder input(@Nullable String inputText, @NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f37636f = inputText;
        this.f37641k = listener;
        return this;
    }

    @NotNull
    public final DialogBuilder message(int messageResId) {
        return message(this.f37631a.getString(messageResId));
    }

    @NotNull
    public final DialogBuilder negativeButton(@Nullable Integer negativeLabelResId, @Nullable Function0<Unit> listener) {
        return negativeLabelResId != null ? negativeButton(this.f37631a.getString(negativeLabelResId.intValue()), listener) : this;
    }

    @NotNull
    public final DialogBuilder positiveButton(int positiveLabelResId, @Nullable Function0<Unit> listener) {
        return positiveButton(this.f37631a.getString(positiveLabelResId), listener);
    }

    @NotNull
    public final DialogBuilder title(int titleResId) {
        String string = this.f37631a.getString(titleResId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return title(string);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogBuilder negativeButton$default(DialogBuilder dialogBuilder, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        return dialogBuilder.negativeButton(str, (Function0<Unit>) function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogBuilder positiveButton$default(DialogBuilder dialogBuilder, String str, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function0 = null;
        }
        return dialogBuilder.positiveButton(str, (Function0<Unit>) function0);
    }

    @NotNull
    public final DialogBuilder message(@Nullable String message) {
        this.f37633c = message;
        return this;
    }

    @NotNull
    public final DialogBuilder negativeButton(@Nullable String negativeLabel, @Nullable Function0<Unit> listener) {
        this.f37638h = negativeLabel;
        this.f37640j = listener;
        return this;
    }

    @NotNull
    public final DialogBuilder positiveButton(@Nullable String positiveLabel, @Nullable Function0<Unit> listener) {
        this.f37637g = positiveLabel;
        this.f37639i = listener;
        return this;
    }

    @NotNull
    public final DialogBuilder title(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f37632b = title;
        return this;
    }
}
