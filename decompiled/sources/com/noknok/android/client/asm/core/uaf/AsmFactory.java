package com.noknok.android.client.asm.core.uaf;

import android.annotation.SuppressLint;
import android.content.Context;
import com.noknok.android.client.asm.core.shared.DescriptorLoader;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.asm.ASM;

/* JADX INFO: loaded from: classes11.dex */
public class AsmFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static ASM f63240a;

    public static synchronized ASM createAsmInstance(Context context) {
        ASM asm = f63240a;
        if (asm != null) {
            return asm;
        }
        Logger.i("AsmFactory", "Creating asm instance");
        f63240a = new ASM(context);
        for (IAuthenticatorDescriptor iAuthenticatorDescriptor : DescriptorLoader.enumerateAndLoadRegisteredDescriptors(context)) {
            for (IAuthenticatorDescriptor.AAIDInfo aAIDInfo : iAuthenticatorDescriptor.getAAIDInfo().values()) {
                try {
                    AuthenticatorCore authenticatorCore = new AuthenticatorCore(iAuthenticatorDescriptor);
                    authenticatorCore.initialize(context, aAIDInfo);
                    f63240a.addAuthenticator(authenticatorCore);
                    Logger.i("AsmFactory", String.format("Adding %s for %s", aAIDInfo.aaid, aAIDInfo.label));
                } catch (RuntimeException e5) {
                    Logger.w("AsmFactory", String.format("Failed to Instantiate Authenticator for AAID: %s", aAIDInfo.aaid), e5);
                }
            }
        }
        return f63240a;
    }
}
