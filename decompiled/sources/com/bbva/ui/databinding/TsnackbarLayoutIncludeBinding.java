package com.bbva.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bbva.ui.R;

/* JADX INFO: loaded from: classes9.dex */
public final class TsnackbarLayoutIncludeBinding implements ViewBinding {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final View f37627p0;

    @NonNull
    public final Button snackbarAction;

    @NonNull
    public final TextView snackbarText;

    public TsnackbarLayoutIncludeBinding(@NonNull View view, @NonNull Button button, @NonNull TextView textView) {
        this.f37627p0 = view;
        this.snackbarAction = button;
        this.snackbarText = textView;
    }

    @NonNull
    public static TsnackbarLayoutIncludeBinding bind(@NonNull View view) {
        int i10 = R.id.snackbar_action;
        Button button = (Button) ViewBindings.findChildViewById(view, i10);
        if (button != null) {
            i10 = R.id.snackbar_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
            if (textView != null) {
                return new TsnackbarLayoutIncludeBinding(view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static TsnackbarLayoutIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.tsnackbar_layout_include, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f37627p0;
    }
}
