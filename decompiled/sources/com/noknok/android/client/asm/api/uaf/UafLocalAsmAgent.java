package com.noknok.android.client.asm.api.uaf;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.noknok.android.client.asm.core.uaf.AsmFactory;

/* JADX INFO: loaded from: classes11.dex */
public class UafLocalAsmAgent implements IUafAsmBinder {
    public static final String TAG = "UafLocalAsmAgent";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UafLocalAsmAgent f63118a;
    protected final Drawable mIcon = null;
    protected final ComponentName mInfo;
    protected final IUafAsmApi mUafAsmApi;

    private UafLocalAsmAgent(Context context) {
        this.mUafAsmApi = AsmFactory.createAsmInstance(context);
        this.mInfo = new ComponentName(context.getPackageName(), UafLocalAsmAgent.class.getName());
    }

    public static synchronized UafLocalAsmAgent instance(Context context) {
        try {
            if (f63118a == null) {
                f63118a = new UafLocalAsmAgent(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63118a;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public boolean bind() {
        return false;
    }

    @Override // com.noknok.android.client.asm.api.uaf.IUafAsmBinder
    public IUafAsmApi getAsmApi() {
        return this.mUafAsmApi;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public ComponentName getComponentName() {
        return this.mInfo;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public Drawable getIcon() {
        return this.mIcon;
    }

    @Override // com.noknok.android.client.asm.api.IAsmBinder
    public void unbind() {
    }
}
