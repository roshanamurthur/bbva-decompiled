package mx.openpay.library.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import mx.openpay.library.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentSelectorBinding implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f83825a;

    @NonNull
    public final ImageView closeButton;

    @NonNull
    public final Button continueButton;

    @NonNull
    public final RecyclerView recyclerContent;

    @NonNull
    public final TextView titleTextView;

    public FragmentSelectorBinding(FrameLayout frameLayout, ImageView imageView, Button button, RecyclerView recyclerView, TextView textView) {
        this.f83825a = frameLayout;
        this.closeButton = imageView;
        this.continueButton = button;
        this.recyclerContent = recyclerView;
        this.titleTextView = textView;
    }

    @NonNull
    public static FragmentSelectorBinding bind(@NonNull View view) {
        int i10 = R.id.close_button;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i10);
        if (imageView != null) {
            i10 = R.id.continue_button;
            Button button = (Button) ViewBindings.findChildViewById(view, i10);
            if (button != null) {
                i10 = R.id.recycler_content;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i10);
                if (recyclerView != null) {
                    i10 = R.id.title_text_view;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i10);
                    if (textView != null) {
                        return new FragmentSelectorBinding((FrameLayout) view, imageView, button, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static FragmentSelectorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSelectorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83825a;
    }
}
