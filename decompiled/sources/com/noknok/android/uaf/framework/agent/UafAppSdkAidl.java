package com.noknok.android.uaf.framework.agent;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.noknok.android.client.appsdk.ResultType;
import com.noknok.android.client.appsdk.uaf.UafIntentParser;
import com.noknok.android.client.commlib.ICommunicationClientResponse;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.AppFinder;
import java.util.concurrent.Semaphore;
import org.fidoalliance.aidl.IUAFOperation;
import org.fidoalliance.aidl.IUAFResponseListener;

/* JADX INFO: loaded from: classes11.dex */
public class UafAppSdkAidl {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static UafAppSdkAidl f63539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f63540f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f63541a = new Semaphore(0, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Connection f63542b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f63543c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f63544d = new Handler(Looper.getMainLooper()) { // from class: com.noknok.android.uaf.framework.agent.UafAppSdkAidl.1
        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            UafAppSdkAidl.this.f63541a.release();
        }
    };

    public static class Connection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IUAFOperation f63546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ServiceConnection f63547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f63548c;

        public /* synthetic */ Connection(Context context, Handler handler, int i10) {
            this(context, handler);
        }

        private Connection(Context context, final Handler handler) throws ServiceException {
            if (handler == null || context == null) {
                throw new ServiceException("Invalid parameter exception", 0);
            }
            this.f63548c = context;
            this.f63546a = null;
            this.f63547b = new ServiceConnection() { // from class: com.noknok.android.uaf.framework.agent.UafAppSdkAidl.Connection.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    Connection.this.f63546a = IUAFOperation.Stub.asInterface(iBinder);
                    handler.sendEmptyMessage(0);
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    Connection.this.f63546a = null;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(String str) {
            Intent intent = new Intent(AppFinder.SERVICE_ACTION).setPackage(str);
            AppSDKConfig appSDKConfig = AppSDKConfig.getInstance(this.f63548c);
            AppSDKConfig.Key key = AppSDKConfig.Key.customClient;
            if (appSDKConfig.get(key) == null || AppSDKConfig.getInstance(this.f63548c).get(key).getAsString() == null) {
                intent.setType(AppFinder.MIME_TYPE_CLIENT);
            }
            return this.f63548c.bindService(intent, this.f63547b, 1);
        }
    }

    public static class IUAFResponseListenerImpl extends IUAFResponseListener.Stub {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ICommunicationClientResponse f63551a;

        public IUAFResponseListenerImpl(ICommunicationClientResponse iCommunicationClientResponse) {
            this.f63551a = iCommunicationClientResponse;
        }

        @Override // org.fidoalliance.aidl.IUAFResponseListener
        public void onResult(Intent intent) {
            this.f63551a.onResponse(null, UafIntentParser.parseUafResponseIntent(intent));
        }
    }

    public static class ServiceException extends Exception {
        public /* synthetic */ ServiceException(String str, int i10) {
            this(str);
        }

        private ServiceException(String str) {
            super(str);
        }
    }

    private UafAppSdkAidl() {
    }

    public static UafAppSdkAidl Instance() {
        synchronized (UafAppSdkAidl.class) {
            try {
                if (f63539e == null) {
                    f63539e = new UafAppSdkAidl();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f63539e;
    }

    public ResultType init(Context context, Handler handler, String str) {
        this.f63543c = str;
        synchronized (UafAppSdkAidl.class) {
            try {
                Context context2 = f63540f;
                if (context2 == null) {
                    f63540f = context;
                } else if (!context2.equals(context)) {
                    a();
                    f63540f = context;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int i10 = 0;
        if (this.f63542b != null) {
            Logger.i("UafAppSdkAidl", "Connection already exist");
            handler.sendEmptyMessage(0);
            return ResultType.SUCCESS;
        }
        try {
            Connection connection = new Connection(f63540f, handler, i10);
            if (connection.a(str)) {
                this.f63542b = connection;
                return ResultType.SUCCESS;
            }
            handler.sendEmptyMessage(0);
            return ResultType.NOT_INSTALLED;
        } catch (ServiceException unused) {
            f63539e.a();
            return ResultType.NOT_INSTALLED;
        }
    }

    public void process(Intent intent, ICommunicationClientResponse iCommunicationClientResponse) throws ServiceException {
        String str = "Fido not connected";
        Connection connection = this.f63542b;
        if ((connection != null && connection.f63546a == null) || (connection != null && !connection.f63546a.asBinder().pingBinder())) {
            f63539e.a();
        }
        int i10 = 0;
        if (this.f63542b == null) {
            try {
                if (!f63539e.init(f63540f, this.f63544d, this.f63543c).equals(ResultType.SUCCESS)) {
                    throw new InterruptedException();
                }
                this.f63541a.acquire();
                if (this.f63542b == null) {
                    throw new ServiceException(str, i10);
                }
            } catch (InterruptedException unused) {
                throw new ServiceException(str, i10);
            }
        }
        Connection connection2 = this.f63542b;
        connection2.getClass();
        try {
            IUAFOperation iUAFOperation = connection2.f63546a;
            if (iUAFOperation != null) {
                iUAFOperation.process(intent, new IUAFResponseListenerImpl(iCommunicationClientResponse));
            } else {
                f63539e.a();
                throw new ServiceException("Service disconnected", i10);
            }
        } catch (RemoteException unused2) {
            f63539e.a();
            throw new ServiceException("Remote exception", i10);
        }
    }

    private void a() {
        Connection connection = this.f63542b;
        if (connection != null) {
            try {
                connection.f63548c.unbindService(connection.f63547b);
            } catch (IllegalArgumentException e5) {
                Logger.e("Connection", "failed unbinding service", e5);
            }
            connection.f63546a = null;
        }
        this.f63542b = null;
    }
}
