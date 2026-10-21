package com.noknok.android.client.asm.keyguard;

import android.content.Context;
import com.noknok.android.client.asm.akselector.generic.GenericAKSelector;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;

/* JADX INFO: loaded from: classes11.dex */
public class KgAkSelector extends GenericAKSelector {
    public KgAkSelector(Context context, ProtocolType protocolType, IAuthenticatorDescriptor iAuthenticatorDescriptor, IMatcher iMatcher, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        init(context, protocolType, iAuthenticatorDescriptor, iMatcher, KSUtils.AkMode.KG, aAIDInfo);
    }
}
