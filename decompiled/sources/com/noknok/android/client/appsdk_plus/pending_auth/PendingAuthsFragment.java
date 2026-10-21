package com.noknok.android.client.appsdk_plus.pending_auth;

import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.c;
import androidx.recyclerview.widget.RecyclerView;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk_plus.R;
import com.noknok.android.client.appsdk_plus.RestResponse;
import com.noknok.android.client.appsdk_plus.databinding.NnlPendingAuthItemBinding;
import com.noknok.android.client.appsdk_plus.databinding.NnlPendingAuthsFragmentBinding;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.ViewWrapper;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import l5.j;
import l5.k;
import l5.l;

/* JADX INFO: loaded from: classes11.dex */
public class PendingAuthsFragment extends BasePendingAuthsFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<PendingAuth> f63044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NnlPendingAuthsFragmentBinding f63045b;

    public class PendingAuthsAdapter extends RecyclerView.Adapter<ViewHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<PendingAuth> f63046a;

        public class ViewHolder extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final NnlPendingAuthItemBinding f63048a;

            public ViewHolder(@NonNull PendingAuthsAdapter pendingAuthsAdapter, NnlPendingAuthItemBinding nnlPendingAuthItemBinding) {
                super(nnlPendingAuthItemBinding.getRoot());
                this.f63048a = nnlPendingAuthItemBinding;
            }
        }

        public PendingAuthsAdapter(List<PendingAuth> list) {
            this.f63046a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f63046a.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(PendingAuth pendingAuth, View view) {
            PendingAuthsFragment pendingAuthsFragment = PendingAuthsFragment.this;
            pendingAuthsFragment.mController.onApprovePendingAuth(pendingAuthsFragment.getActivity(), PendingAuthsFragment.this.mModel, pendingAuth.rawData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(PendingAuth pendingAuth, View view) {
            PendingAuthsFragment pendingAuthsFragment = PendingAuthsFragment.this;
            pendingAuthsFragment.mController.onRejectPendingAuth(pendingAuthsFragment.getActivity(), PendingAuthsFragment.this.mModel, pendingAuth.rawData);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i10) {
            String str;
            new ViewWrapper(viewHolder.f63048a.getRoot()).onShow();
            final PendingAuth pendingAuth = this.f63046a.get(i10);
            if (pendingAuth.title != null) {
                String text = UiConfig.getText(PendingAuthsFragment.this.getContext(), UIConfigTags.LEVELS_PENDING_AUTHS_VIEW, UIConfigTags.TAG_PENDING_AUTH_TRANSACTION_TEXT_PREFIX, R.string.nnl_appsdk_plus_transaction_text_prefix);
                TextView textView = viewHolder.f63048a.title;
                StringBuilder sbD = c.d(text);
                sbD.append(pendingAuth.title);
                textView.setText(sbD.toString());
            } else {
                viewHolder.f63048a.title.setText(UiConfig.getText(PendingAuthsFragment.this.getContext(), UIConfigTags.LEVELS_PENDING_AUTHS_VIEW, UIConfigTags.TAG_PENDING_AUTH_REQUEST_TO_SIGN_IN, R.string.nnl_appsdk_plus_request_to_sign_in));
            }
            String text2 = UiConfig.getText(PendingAuthsFragment.this.getContext(), UIConfigTags.LEVELS_PENDING_AUTHS_VIEW, UIConfigTags.TAG_PENDING_AUTH_REMAINING_TIME_PREFIX, R.string.nnl_appsdk_plus_remaining_time);
            TextView textView2 = viewHolder.f63048a.remainingTime;
            PendingAuthsFragment pendingAuthsFragment = PendingAuthsFragment.this;
            String str2 = pendingAuth.remainingTime;
            pendingAuthsFragment.getClass();
            try {
                long j10 = Long.parseLong(str2) / 1000;
                str = MessageFormat.format(text2, Integer.valueOf((int) (j10 / 60)), Integer.valueOf((int) (j10 % 60)));
            } catch (NumberFormatException e5) {
                Logger.e("PendingAuthsFragment", "Failed to parse remaining time", e5);
                str = MessageFormat.format(text2, 0, 0);
            }
            textView2.setText(str);
            if (RestResponse.SERVER_SUCCESS.equals(pendingAuth.statusCode) && pendingAuth.deviceInfo != null) {
                String text3 = UiConfig.getText(PendingAuthsFragment.this.getContext(), UIConfigTags.LEVELS_PENDING_AUTHS_VIEW, UIConfigTags.TAG_PENDING_AUTH_PUSH_STATUS_PREFIX, R.string.nnl_appsdk_plus_status);
                viewHolder.f63048a.statusCode.setVisibility(0);
                viewHolder.f63048a.statusCode.setText(MessageFormat.format(text3, pendingAuth.deviceInfo));
            }
            viewHolder.f63048a.approveButton.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.pending_auth.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f63058p0.a(pendingAuth, view);
                }
            });
            viewHolder.f63048a.rejectButton.setOnClickListener(new View.OnClickListener() { // from class: com.noknok.android.client.appsdk_plus.pending_auth.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f63060p0.b(pendingAuth, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            return new ViewHolder(this, NnlPendingAuthItemBinding.inflate(LayoutInflater.from(viewGroup.getContext())));
        }
    }

    public PendingAuthsFragment() {
        super(null);
        this.f63044a = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NnlPendingAuthsFragmentBinding nnlPendingAuthsFragmentBindingInflate = NnlPendingAuthsFragmentBinding.inflate(layoutInflater, viewGroup, false);
        this.f63045b = nnlPendingAuthsFragmentBindingInflate;
        return nnlPendingAuthsFragmentBindingInflate.getRoot();
    }

    @Override // com.noknok.android.client.appsdk_plus.pending_auth.BasePendingAuthsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        new ViewWrapper(this.f63045b.getRoot()).onShow();
        int i10 = 2;
        this.mModel.getPendingAuthsLiveData().observe(getViewLifecycleOwner(), new j(this, i10));
        this.mModel.getApproveCompletedLiveData().observe(getViewLifecycleOwner(), new k(this, i10));
        this.mModel.getRejectCompletedLiveData().observe(getViewLifecycleOwner(), new l(this, 1));
        if (bundle == null) {
            this.mController.onRefresh(getContext(), this.mModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void a(PendingAuthsViewModel.PendingAuthResult pendingAuthResult) {
        if (pendingAuthResult.resultType != ResultType.SUCCESS) {
            Toast.makeText(getContext(), pendingAuthResult.message, 0).show();
        }
        List<PendingAuth> list = pendingAuthResult.pendingAuths;
        this.f63044a.clear();
        if (list == null || list.isEmpty()) {
            this.f63045b.emptyText.setVisibility(0);
            return;
        }
        this.f63045b.emptyText.setVisibility(8);
        this.f63044a.addAll(list);
        this.f63045b.pendingAuthsList.setAdapter(new PendingAuthsAdapter(this.f63044a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Pair pair) {
        if (pair.second != null) {
            Toast.makeText(getContext(), (CharSequence) pair.second, 0).show();
        }
    }

    public PendingAuthsFragment(PendingAuthsController pendingAuthsController) {
        super(pendingAuthsController);
        this.f63044a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Pair pair) {
        if (pair.second != null) {
            Toast.makeText(getContext(), (CharSequence) pair.second, 0).show();
        }
    }
}
