package com.noknok.android.client.asm.authenticator;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Base64;
import com.noknok.android.client.asm.core.AKDigestMethod;
import com.noknok.android.client.asm.sdk.IAKDigestMethod;
import com.noknok.android.client.asm.sdk.IAuthenticatorKernel;
import com.noknok.android.client.asm.sdk.IMatcher;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.tee.fidocryptoservice.IFidoCryptoService;
import java.nio.ByteBuffer;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes11.dex */
public class TeeUafAuthenticatorKernel implements IAuthenticatorKernel {
    private static final String TAG = "TeeUafAuthenticatorKernel";
    private static Context mContext;
    private final ServiceConnection mRemoteConnection;
    private IFidoCryptoService mRemoteService;
    private final Semaphore mSemaphore = new Semaphore(0, true);

    public TeeUafAuthenticatorKernel(Context context, IMatcher iMatcher) {
        mContext = context.getApplicationContext();
        this.mRemoteConnection = new ServiceConnection() { // from class: com.noknok.android.client.asm.authenticator.TeeUafAuthenticatorKernel.1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                TeeUafAuthenticatorKernel.this.mRemoteService = IFidoCryptoService.Stub.asInterface(iBinder);
                TeeUafAuthenticatorKernel.this.mSemaphore.release();
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                TeeUafAuthenticatorKernel.this.mRemoteService = null;
            }
        };
    }

    public void ServiceBind() {
        Intent intent = new Intent(IFidoCryptoService.DESCRIPTOR);
        intent.setPackage("com.noknok.android.tee.fidocryptoservice");
        if (this.mRemoteService == null) {
            mContext.bindService(intent, this.mRemoteConnection, 1);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Logger.w(TAG, "ServiceBind: the function is called on the main thread.");
                return;
            }
            try {
                this.mSemaphore.acquire();
            } catch (InterruptedException e5) {
                throw new IllegalArgumentException("ServiceBind: wait for remote connection was interrupted.", e5);
            }
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public EnumSet<IAuthenticatorKernel.AttachmentHint> getAttachmentHint() {
        return EnumSet.of(IAuthenticatorKernel.AttachmentHint.ATTACHMENT_HINT_INTERNAL);
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public IAKDigestMethod getDigestMethod() {
        return new AKDigestMethod();
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public boolean postProcess() {
        return true;
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public byte[] processRequest(byte[] bArr, Map<IAuthenticatorKernel.AKDataKeys, Object> map) {
        if (this.mRemoteService == null) {
            Logger.e(TAG, "processRequest: The remote service is unavailable");
            return null;
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length);
            byteBufferAllocate.put(bArr);
            return Base64.decode(this.mRemoteService.process(Base64.encodeToString(byteBufferAllocate.array(), 0)), 0);
        } catch (RemoteException e5) {
            Logger.e(TAG, "Failed to process the UAF request", e5);
            return null;
        }
    }

    @Override // com.noknok.android.client.asm.sdk.IAuthenticatorKernel
    public boolean requiresKeyHandleForDereg() {
        return false;
    }
}
