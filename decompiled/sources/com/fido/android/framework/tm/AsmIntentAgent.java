package com.fido.android.framework.tm;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.api.uaf.IUafAsmApi;
import com.noknok.android.client.asm.api.uaf.IUafAsmBinder;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.Outcome;

/* JADX INFO: loaded from: classes9.dex */
public class AsmIntentAgent implements IUafAsmBinder, IUafAsmApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f43536a;

    public AsmIntentAgent(ResolveInfo resolveInfo) {
        this.f43536a = null;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f43536a = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public boolean bind() {
        return true;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public ComponentName getComponentName() {
        return this.f43536a;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public Drawable getIcon() {
        return null;
    }

    @Override // com.noknok.android.client.asm.api.uaf.IUafAsmApi
    public String process(String str, ActivityProxy activityProxy, String str2) {
        Logger.i("AsmIntentAgent", "process() inParam = " + str);
        Intent intent = new Intent(activityProxy.getApplicationContext(), (Class<?>) AsmIntentHelperActivity.class);
        intent.putExtra("COMPONENT_NAME", this.f43536a);
        intent.putExtra("IN_PARAM", str);
        if (!activityProxy.hasActivity()) {
            intent.addFlags(134217728);
        }
        String str3 = (String) activityProxy.startActivityForResult(intent, null);
        if (str3 == null) {
            throw new AsmException(Outcome.FAILURE);
        }
        Logger.i("AsmIntentAgent", "process() response = ".concat(str3));
        return str3;
    }

    public AsmIntentAgent() {
        this.f43536a = null;
    }

    @Override // com.noknok.android.client.asm.api.uaf.IUafAsmBinder
    public IUafAsmApi getAsmApi() {
        return this;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public void unbind() {
    }
}
