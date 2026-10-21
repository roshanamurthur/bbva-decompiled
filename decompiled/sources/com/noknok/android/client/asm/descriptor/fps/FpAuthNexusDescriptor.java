package com.noknok.android.client.asm.descriptor.fps;

import android.content.Context;
import android.os.Build;
import com.noknok.android.client.asm.api.AsmException;
import com.noknok.android.client.asm.authui.fps.R;
import com.noknok.android.client.utils.Outcome;

/* JADX INFO: loaded from: classes11.dex */
public class FpAuthNexusDescriptor extends FpAuthDescriptor {
    public FpAuthNexusDescriptor(Context context) {
        super(context);
        if (!Build.MODEL.startsWith("Nexus")) {
            throw new AsmException(Outcome.FAILURE, "Not a Nexus device");
        }
        this.mAAIDInfoList.get("NNL_KS_UAF").aaid = "4e4e#4012";
    }

    @Override // com.noknok.android.client.asm.descriptor.fps.FpAuthDescriptor, com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor
    public int getDescription() {
        return R.string.nnl_asm_native_fps_nexus_description;
    }
}
