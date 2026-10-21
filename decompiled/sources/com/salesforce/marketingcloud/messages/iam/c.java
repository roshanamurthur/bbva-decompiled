package com.salesforce.marketingcloud.messages.iam;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.salesforce.marketingcloud.R;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class c extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f64648a;

    private int a(InAppMessage inAppMessage) {
        return inAppMessage.type() == InAppMessage.Type.bannerTop ? R.layout.mcsdk_iam_banner_top : R.layout.mcsdk_iam_banner_bottom;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f64648a = (k) getArguments().getParcelable("messageHandler");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        View view;
        Animation animationOnCreateAnimation = super.onCreateAnimation(i10, z10, i11);
        if (animationOnCreateAnimation == null && i11 != 0) {
            animationOnCreateAnimation = AnimationUtils.loadAnimation(getActivity(), i11);
        }
        if (animationOnCreateAnimation != null && (view = getView()) != null) {
            view.setLayerType(2, null);
            animationOnCreateAnimation.setAnimationListener(new a(z10));
        }
        return animationOnCreateAnimation;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        k kVar = this.f64648a;
        if (kVar == null) {
            return null;
        }
        View viewInflate = layoutInflater.inflate(a(kVar.d()), viewGroup, false);
        b bVar = new b(getActivity() instanceof View.OnClickListener ? (View.OnClickListener) getActivity() : null, this.f64648a.k());
        bVar.a(viewInflate, this.f64648a);
        SwipeDismissConstraintLayout swipeDismissConstraintLayout = (SwipeDismissConstraintLayout) viewInflate.findViewById(bVar.g());
        if (swipeDismissConstraintLayout != null && (getActivity() instanceof SwipeDismissConstraintLayout.SwipeDismissListener)) {
            swipeDismissConstraintLayout.setListener((SwipeDismissConstraintLayout.SwipeDismissListener) getActivity());
        }
        return viewInflate;
    }

    public static c a(k kVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("messageHandler", kVar);
        c cVar = new c();
        cVar.setArguments(bundle);
        return cVar;
    }

    public class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f64649a;

        public a(boolean z10) {
            this.f64649a = z10;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            FragmentActivity activity;
            View view = c.this.getView();
            if (view != null) {
                view.setLayerType(0, null);
            }
            if (this.f64649a || (activity = c.this.getActivity()) == null) {
                return;
            }
            activity.finish();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
