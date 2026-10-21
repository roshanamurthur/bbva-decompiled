package com.google.android.gms.auth.api.signin;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zbb implements PendingResultUtil.ResultConverter {
    private zbb() {
        throw null;
    }

    public /* synthetic */ zbb(zba zbaVar) {
    }

    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    @Nullable
    public final /* synthetic */ Object convert(Result result) {
        return ((GoogleSignInResult) result).getSignInAccount();
    }
}
