package com.noknok.android.client.appsdk_plus.pending_auth;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.noknok.android.client.appsdk.ResultType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class PendingAuthsViewModel extends ViewModel implements IPendingAuthsLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<PendingAuthResult> f63050a = new MutableLiveData<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MutableLiveData<Pair<ResultType, String>> f63051b = new MutableLiveData<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MutableLiveData<Pair<ResultType, String>> f63052c = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PendingAuthsController f63053d = null;

    public static class PendingAuthResult {
        public final String message;
        public final List<PendingAuth> pendingAuths;
        public final ResultType resultType;

        public PendingAuthResult(List<PendingAuth> list, ResultType resultType, String str) {
            this.pendingAuths = list;
            this.resultType = resultType;
            this.message = str;
        }
    }

    public MutableLiveData<Pair<ResultType, String>> getApproveCompletedLiveData() {
        return this.f63051b;
    }

    public PendingAuthsController getController() {
        return this.f63053d;
    }

    public MutableLiveData<PendingAuthResult> getPendingAuthsLiveData() {
        return this.f63050a;
    }

    public MutableLiveData<Pair<ResultType, String>> getRejectCompletedLiveData() {
        return this.f63052c;
    }

    @Override // com.noknok.android.client.appsdk_plus.pending_auth.IPendingAuthsLiveData
    public void onApproveCompleted(ResultType resultType, String str) {
        this.f63051b.postValue(new Pair<>(resultType, str));
    }

    @Override // com.noknok.android.client.appsdk_plus.pending_auth.IPendingAuthsLiveData
    public void onRejectCompleted(ResultType resultType, String str) {
        this.f63052c.postValue(new Pair<>(resultType, str));
    }

    public void setController(PendingAuthsController pendingAuthsController) {
        this.f63053d = pendingAuthsController;
    }

    @Override // com.noknok.android.client.appsdk_plus.pending_auth.IPendingAuthsLiveData
    public void setPendingAuths(List<PendingAuth> list, ResultType resultType, String str) {
        this.f63050a.postValue(new PendingAuthResult(list, resultType, str));
    }
}
