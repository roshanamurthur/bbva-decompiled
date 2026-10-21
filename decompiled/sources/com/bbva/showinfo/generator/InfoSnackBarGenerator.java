package com.bbva.showinfo.generator;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bbva.plugin.showinfo.command.HideCommand;
import com.bbva.showinfo.InfoSnackBarExtensionsKt;
import com.bbva.showinfo.model.InfoSnackBar;
import com.bbva.showinfo.model.SnackBarDuration;
import com.google.android.material.snackbar.Snackbar;
import da.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InfoSnackBarGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/showinfo/generator/InfoSnackBarGenerator;", "Lcom/bbva/showinfo/generator/ElementInfoable;", "Lcom/bbva/showinfo/model/InfoSnackBar;", "Landroid/content/Context;", "context", "element", "", "create", HideCommand.ID, "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class InfoSnackBarGenerator implements ElementInfoable<InfoSnackBar> {

    @NotNull
    public static final InfoSnackBarGenerator INSTANCE = new InfoSnackBarGenerator();

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void create(@NotNull Context context, @NotNull InfoSnackBar element) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        String message = element.getMessage();
        if (message == null || l.isBlank(message)) {
            throw new IllegalArgumentException("SnackBar message cannot be empty");
        }
        View viewFindViewById = ((Activity) context).findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException();
        }
        InfoSnackBarGenerator infoSnackBarGenerator = INSTANCE;
        infoSnackBarGenerator.getClass();
        SnackBarDuration duration = element.getDuration();
        Snackbar snackbarMake = Snackbar.make(viewFindViewById, "", duration != null ? duration.getSnackBarValue() : -1);
        Intrinsics.checkNotNull(snackbarMake);
        Integer id = element.getId();
        infoSnackBarGenerator.getClass();
        InfoSnackBarExtensionsKt.hideMessageText(snackbarMake);
        View view = snackbarMake.getView();
        Intrinsics.checkNotNull(view);
        InfoSnackBarExtensionsKt.sbIdentifier(view, id);
        view.setPadding(0, 0, 0, 0);
        InfoSnackBarExtensionsKt.sbClickListener(view, element.getOnClickListener());
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        View viewInflate = LayoutInflater.from(context2).inflate(context2.getResources().getLayout(com.bbva.showinfo.R.layout.layout_snackbar), (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(com.bbva.showinfo.R.id.snackbar);
        if (linearLayout != null) {
            InfoSnackBarExtensionsKt.sbBackgroundColor(linearLayout, element.getType());
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(com.bbva.showinfo.R.id.snackbar_message);
        if (appCompatTextView != null) {
            appCompatTextView.setText(element.getMessage());
            String messageAccessibility = element.getMessageAccessibility();
            if (messageAccessibility == null) {
                messageAccessibility = element.getMessage();
            }
            appCompatTextView.setContentDescription(messageAccessibility);
            appCompatTextView.setMaxLines(3);
            Integer imageResourceId = element.getImageResourceId();
            if (imageResourceId != null) {
                int iIntValue = imageResourceId.intValue();
                String message2 = element.getMessage();
                if (message2 != null) {
                    InfoSnackBarExtensionsKt.withSpannableImage(appCompatTextView, message2, iIntValue);
                }
            }
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) viewInflate.findViewById(com.bbva.showinfo.R.id.snackbar_action);
        if (appCompatTextView2 != null) {
            String actionName = element.getActionName();
            if (actionName == null || actionName.length() == 0 || element.getOnActionClickListener() == null) {
                appCompatTextView2.setVisibility(8);
            } else {
                appCompatTextView2.setText(element.getActionName());
                Function0<Unit> onActionClickListener = element.getOnActionClickListener();
                if (onActionClickListener != null && element.getActionListenToUserDidTap()) {
                    appCompatTextView2.setOnClickListener(new e(onActionClickListener, 1));
                }
            }
        }
        Intrinsics.checkNotNull(viewInflate);
        View view2 = snackbarMake.getView();
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(viewInflate, 0);
        InfoSnackBarExtensionsKt.dismissCallback(snackbarMake, element.getOnDismissedCallback());
        SnackbarHolder.INSTANCE.hold(snackbarMake);
        snackbarMake.show();
    }

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void hide(@NotNull Context context, @NotNull InfoSnackBar element) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        ElementInfoable.DefaultImpls.hide(this, context, element);
        SnackbarHolder.INSTANCE.dismiss();
    }
}
