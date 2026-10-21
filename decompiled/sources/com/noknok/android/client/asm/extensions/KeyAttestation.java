package com.noknok.android.client.asm.extensions;

import android.app.Activity;
import android.content.Context;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.extension.IExtensionProcessor;
import com.noknok.android.client.extension.a;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class KeyAttestation implements IExtensionProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IExtensionProcessor.ExtensionMode f63272b = IExtensionProcessor.ExtensionMode.never;

    /* JADX INFO: renamed from: com.noknok.android.client.asm.extensions.KeyAttestation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63273a;

        static {
            int[] iArr = new int[IExtensionProcessor.ExtensionMode.values().length];
            f63273a = iArr;
            try {
                iArr[IExtensionProcessor.ExtensionMode.never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63273a[IExtensionProcessor.ExtensionMode.requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63273a[IExtensionProcessor.ExtensionMode.always.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KeyAttestation(Context context) {
        this.f63271a = context;
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        if (this.f63272b == IExtensionProcessor.ExtensionMode.never) {
            return;
        }
        String str = map == null ? "a" : map.get(IExtensionProcessor.ExtProcParamKey.KS_ATTESTATION_KEY);
        if (str == null || "".equals(str)) {
            str = "a";
        }
        if (this.f63272b == IExtensionProcessor.ExtensionMode.always && ("p".equals(str) || "a".equals(str))) {
            return;
        }
        iExtensionList.addExtension("fido.uaf.android.key_attestation", str, false);
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public final /* synthetic */ void start(IExtensionList iExtensionList, HashMap map, Activity activity) {
        a.a(this, iExtensionList, map, activity);
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        boolean z10 = iExtensionList.getExtension("fido.uaf.android.key_attestation") != null;
        if (z10) {
            iExtensionList.removeExtension("fido.uaf.android.key_attestation");
        }
        int i10 = AnonymousClass1.f63273a[IExtensionProcessor.ExtensionMode.valueOf(AppSDKConfig.getInstance(this.f63271a).get(AppSDKConfig.Key.sendKSAttestation).getAsString()).ordinal()];
        if (i10 == 1) {
            this.f63272b = IExtensionProcessor.ExtensionMode.never;
        } else if (i10 == 2) {
            this.f63272b = z10 ? IExtensionProcessor.ExtensionMode.requested : IExtensionProcessor.ExtensionMode.never;
        } else if (i10 == 3) {
            this.f63272b = z10 ? IExtensionProcessor.ExtensionMode.requested : IExtensionProcessor.ExtensionMode.always;
        }
        if (this.f63272b == IExtensionProcessor.ExtensionMode.never || map == null) {
            return;
        }
        map.put(IExtensionProcessor.ExtProcParamKey.KS_ATTESTATION_KEY, null);
    }
}
