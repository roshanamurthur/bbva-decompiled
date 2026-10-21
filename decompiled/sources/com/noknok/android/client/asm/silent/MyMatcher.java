package com.noknok.android.client.asm.silent;

import android.content.Context;
import com.noknok.android.client.asm.authenticator.UVTHelper;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import com.noknok.android.client.asm.sdk.UVTMatcherInParams;
import com.noknok.android.client.asm.sdk.UVTMatcherOutParams;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class MyMatcher implements IMatcher {
    public MyMatcher(Context context, ProtocolType protocolType) {
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams authenticate(IMatcher.MatcherInParams matcherInParams) {
        return new UVTMatcherOutParams(IMatcher.RESULT.SUCCESS, null, new ArrayList(), new UVTHelper(matcherInParams.getAAID(), matcherInParams.getFinalChallenge()).createUVT());
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherDefinedParamsClassList getMatcherDefinedParamsClassList() {
        return new IMatcher.MatcherDefinedParamsClassList(UVTMatcherInParams.class, UVTMatcherOutParams.class, IMatcher.MatcherSettingsInParams.class, IMatcher.MatcherSettingsOutParams.class);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.EnrollState isUserEnrolled() {
        return IMatcher.EnrollState.UNAVAILABLE;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public boolean isUserIDValid(byte[] bArr) {
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherOutParams register(IMatcher.MatcherInParams matcherInParams) {
        return new UVTMatcherOutParams(IMatcher.RESULT.SUCCESS, null, new ArrayList(), new UVTHelper(matcherInParams.getAAID(), matcherInParams.getFinalChallenge()).createUVT());
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public IMatcher.MatcherSettingsOutParams settings(IMatcher.MatcherSettingsInParams matcherSettingsInParams) {
        return new IMatcher.MatcherSettingsOutParams(IMatcher.RESULT.SUCCESS);
    }

    @Override // com.noknok.android.client.asm.sdk.IMatcher
    public void cancel() {
    }
}
