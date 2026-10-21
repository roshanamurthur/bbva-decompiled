package com.noknok.android.client.appsdk;

import android.content.Context;
import com.bbva.notifications.constants.PushConstants;
import com.noknok.android.client.appsdk.common.Fido2Helper;
import com.noknok.android.client.utils.Logger;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes11.dex */
public class AppSDKFactory {

    /* JADX INFO: renamed from: com.noknok.android.client.appsdk.AppSDKFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62865a;

        static {
            int[] iArr = new int[ProtocolType.values().length];
            f62865a = iArr;
            try {
                iArr[ProtocolType.BOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62865a[ProtocolType.UAF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62865a[ProtocolType.FIDO2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static IAppSDK createInstance(ProtocolType protocolType, Context context) {
        String fido2ProxyName;
        IAppSDK iAppSDK;
        Throwable e5;
        int i10 = AnonymousClass1.f62865a[protocolType.ordinal()];
        IAppSDK iAppSDK2 = null;
        if (i10 == 1 || i10 == 2) {
            fido2ProxyName = "com.noknok.android.client.appsdk.uaf.UafAppSDKProxy";
        } else if (i10 != 3) {
            fido2ProxyName = null;
        } else {
            fido2ProxyName = Fido2Helper.getFido2ProxyName(context);
            if (fido2ProxyName == null) {
                throw new AppSDKException(ResultType.NOT_INSTALLED, "FIDO2 service is not available on the device");
            }
        }
        IAppSDK.ClientLocation[] clientLocationArr = {IAppSDK.ClientLocation.LOCAL_CLIENT, IAppSDK.ClientLocation.REMOTE_CLIENT};
        int i11 = 0;
        while (i11 < 2) {
            IAppSDK.ClientLocation clientLocation = clientLocationArr[i11];
            try {
                iAppSDK = (IAppSDK) Class.forName(fido2ProxyName).getConstructor(IAppSDK.ClientLocation.class).newInstance(clientLocation);
                try {
                    Logger.i(Logger.TAG_CONFIG_REPORTER, "Client Proxy: " + protocolType + PushConstants.GE_PARAMS_SEPARATOR + clientLocation);
                    iAppSDK2 = iAppSDK;
                    break;
                } catch (ClassNotFoundException e7) {
                    e5 = e7;
                    Logger.e("AppSDKFactory", "Protocol type not supported", e5);
                    i11++;
                    iAppSDK2 = iAppSDK;
                } catch (IllegalAccessException e10) {
                    e5 = e10;
                    Logger.e("AppSDKFactory", "Protocol type not supported", e5);
                    i11++;
                    iAppSDK2 = iAppSDK;
                } catch (InstantiationException e11) {
                    e5 = e11;
                    Logger.e("AppSDKFactory", "Protocol type not supported", e5);
                    i11++;
                    iAppSDK2 = iAppSDK;
                } catch (NoSuchMethodException e12) {
                    e5 = e12;
                    Logger.e("AppSDKFactory", "Protocol type not supported", e5);
                    i11++;
                    iAppSDK2 = iAppSDK;
                } catch (InvocationTargetException e13) {
                    e5 = e13;
                    Logger.e("AppSDKFactory", "Protocol type not supported", e5);
                    i11++;
                    iAppSDK2 = iAppSDK;
                }
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e14) {
                iAppSDK = iAppSDK2;
                e5 = e14;
            }
        }
        if (iAppSDK2 != null) {
            return iAppSDK2;
        }
        throw new AppSDKException(ResultType.NOT_INSTALLED, "AppSDK for " + protocolType + " is not available");
    }
}
