package com.noknok.android.client.asm.akselector.generic;

import android.content.Context;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.noknok.android.client.asm.authenticator.KsUafAuthenticatorKernel;
import com.noknok.android.client.asm.authenticator.KsUafCryptoLayer;
import com.noknok.android.client.asm.core.ICryptoLayer;
import com.noknok.android.client.asm.sdk.IAKSelector;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.asm.sdk.ProtocolType;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class GenericAKSelector implements IAKSelector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAuthenticatorKernel f63108a = null;

    public GenericAKSelector() {
    }

    @Override // com.noknok.android.client.asm.sdk.IAKSelector
    public IAuthenticatorKernel getAuthenticatorKernel() {
        return this.f63108a;
    }

    public void init(Context context, ProtocolType protocolType, IAuthenticatorDescriptor iAuthenticatorDescriptor, IMatcher iMatcher, KSUtils.AkMode akMode, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        this.f63108a = null;
        try {
            ICryptoLayer iCryptoLayer = (ICryptoLayer) KsUafCryptoLayer.class.getConstructor(Context.class, IMatcher.class, KSUtils.AkMode.class, IAuthenticatorDescriptor.AAIDInfo.class).newInstance(context, iMatcher, akMode, aAIDInfo);
            try {
                int i10 = KsUafAuthenticatorKernel.f63143a;
                this.f63108a = (IAuthenticatorKernel) KsUafAuthenticatorKernel.class.getConstructor(ICryptoLayer.class, IAuthenticatorDescriptor.class).newInstance(iCryptoLayer, iAuthenticatorDescriptor);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | RuntimeException | InvocationTargetException e5) {
                throw new IllegalArgumentException("Failed to create com.noknok.android.client.asm.authenticator.KsUafAuthenticatorKernel", e5);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new IllegalArgumentException("Failed to create com.noknok.android.client.asm.authenticator.KsUafCryptoLayer", e7);
        }
    }

    public GenericAKSelector(Context context, ProtocolType protocolType, IAuthenticatorDescriptor iAuthenticatorDescriptor, IMatcher iMatcher, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        init(context, protocolType, iAuthenticatorDescriptor, iMatcher, KSUtils.AkMode.KS, aAIDInfo);
    }
}
