package com.noknok.android.client.extension;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.HelperActivity;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.client.utils.MobileServicesAvailabilityChecker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class LocationTracker implements IExtensionProcessor, ILocationServiceListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Semaphore f63317f = new Semaphore(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f63319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StatusCode f63321d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f63318a = new Semaphore(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Location f63322e = null;

    /* JADX INFO: renamed from: com.noknok.android.client.extension.LocationTracker$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63323a;

        static {
            int[] iArr = new int[IExtensionProcessor.ExtensionMode.values().length];
            f63323a = iArr;
            try {
                iArr[IExtensionProcessor.ExtensionMode.never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63323a[IExtensionProcessor.ExtensionMode.requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63323a[IExtensionProcessor.ExtensionMode.silently.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63323a[IExtensionProcessor.ExtensionMode.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class LocationParams {

        @Expose
        public Float accuracy;

        @Expose
        public String countryCode;

        @Expose
        public Double latitude;

        @Expose
        public Double longitude;

        @Expose
        public int status;
    }

    public enum StatusCode {
        OK(0, "Location fetched successfully."),
        UNKNOWN(1, "Unknown error has occurred."),
        LOCATION_SENSOR_UNAVAILABLE(2, "Location sensor is not available."),
        LOCATION_SERVICES_NOT_INSTALLED(3, "Location services not installed."),
        LOCATION_SIGNAL_UNAVAILABLE(4, "Location signal is not available."),
        NO_APP_PERMISSION(5, "Permission denied for location signal.");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f63325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f63326b;

        StatusCode(int i10, String str) {
            this.f63325a = i10;
            this.f63326b = str;
        }

        public int getCode() {
            return this.f63325a;
        }

        public String getDescription() {
            return this.f63326b;
        }
    }

    public LocationTracker(Context context) {
        this.f63319b = context.getApplicationContext();
    }

    private boolean a() {
        return ContextCompat.checkSelfPermission(this.f63319b, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this.f63319b, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        StatusCode statusCode;
        if (this.f63320c) {
            LocationParams locationParams = new LocationParams();
            if (this.f63321d == StatusCode.OK) {
                try {
                    this.f63318a.tryAcquire(2000L, TimeUnit.MILLISECONDS);
                    Context context = this.f63319b;
                    Location location = this.f63322e;
                    if (location == null) {
                        LocationManager locationManager = (LocationManager) context.getSystemService("location");
                        if (locationManager == null) {
                            Logger.w("LocationTracker", "Failed to get LocationManager");
                            statusCode = StatusCode.LOCATION_SERVICES_NOT_INSTALLED;
                        } else {
                            boolean zIsProviderEnabled = false;
                            for (String str : Arrays.asList("gps", DeepLinkListenerAdapter.Constants.ERROR_NETWORK)) {
                                try {
                                    zIsProviderEnabled = locationManager.isProviderEnabled("gps");
                                    if (zIsProviderEnabled) {
                                        break;
                                    }
                                    Logger.w("LocationTracker", "Sensor " + str + " is disabled");
                                } catch (RuntimeException e5) {
                                    Logger.w("LocationTracker", "Failed checking " + str + ". exception: " + e5);
                                }
                            }
                            statusCode = !zIsProviderEnabled ? StatusCode.LOCATION_SENSOR_UNAVAILABLE : StatusCode.LOCATION_SIGNAL_UNAVAILABLE;
                        }
                    } else {
                        locationParams.longitude = Double.valueOf(location.getLongitude());
                        locationParams.latitude = Double.valueOf(this.f63322e.getLatitude());
                        locationParams.accuracy = Float.valueOf(this.f63322e.getAccuracy());
                        try {
                            List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(locationParams.latitude.doubleValue(), locationParams.longitude.doubleValue(), 1);
                            if (fromLocation != null && fromLocation.size() > 0) {
                                locationParams.countryCode = fromLocation.get(0).getCountryCode();
                            }
                        } catch (IOException unused) {
                            Logger.w("LocationTracker", "Failed to get country code from location");
                        }
                        statusCode = StatusCode.OK;
                    }
                    this.f63321d = statusCode;
                } catch (InterruptedException e7) {
                    throw new IllegalStateException(e7);
                }
            }
            locationParams.status = this.f63321d.getCode();
            iExtensionList.addExtension(ExtensionManager.LOCATION_SIGNAL_EXT_ID, new Gson().toJson(locationParams), false);
            this.f63320c = false;
        }
    }

    @Override // com.noknok.android.client.extension.ILocationServiceListener
    public void onFailure(@NonNull Exception exc) {
        Logger.w("LocationTracker", "Connection failed. Error Code: " + exc.getMessage());
        this.f63318a.release();
    }

    @Override // com.noknok.android.client.extension.ILocationServiceListener
    public void onSuccess(Location location) {
        this.f63322e = location;
        this.f63318a.release();
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public final /* synthetic */ void start(IExtensionList iExtensionList, HashMap map, Activity activity) {
        a.a(this, iExtensionList, map, activity);
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        this.f63320c = false;
        boolean z10 = iExtensionList.getExtension(ExtensionManager.LOCATION_SIGNAL_EXT_ID) != null;
        int i10 = AnonymousClass1.f63323a[ExtensionConfigHelper.getConfigExtensionMode(this.f63319b, AppSDKConfig.Key.sendLocation.name(), map.get(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE)).ordinal()];
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    this.f63320c = true;
                }
            } else if (a()) {
                this.f63320c = true;
            }
        } else if (z10) {
            this.f63320c = true;
        }
        if (this.f63320c) {
            this.f63321d = StatusCode.OK;
            if (z10) {
                iExtensionList.removeExtension(ExtensionManager.LOCATION_SIGNAL_EXT_ID);
            }
            KeyguardManager keyguardManager = (KeyguardManager) this.f63319b.getSystemService("keyguard");
            if (keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode()) {
                this.f63321d = StatusCode.NO_APP_PERMISSION;
                Logger.w("LocationTracker", "status: NO_APP_PERMISSION, reason: The device is locked");
                return;
            }
            if ((!MobileServicesAvailabilityChecker.isGMSAvailable(this.f63319b) || !MobileServicesAvailabilityChecker.isGMSLocationLibraryAvailable(this.f63319b)) && (!MobileServicesAvailabilityChecker.isHMSAvailable(this.f63319b) || !MobileServicesAvailabilityChecker.isHMSLocationLibraryAvailable(this.f63319b))) {
                this.f63321d = StatusCode.LOCATION_SERVICES_NOT_INSTALLED;
                Logger.w("LocationTracker", "status: LOCATION_SERVICES_NOT_INSTALLED, reason: Neither GooglePlayServices nor HMS CORE is available");
                return;
            }
            try {
                try {
                    Semaphore semaphore = f63317f;
                    semaphore.acquire();
                    if (a()) {
                        semaphore.release();
                    } else {
                        if (!activityProxy.hasActivity()) {
                            throw new IllegalArgumentException("Caller Activity is required for showing request permission dialog");
                        }
                        activityProxy.startActivityForResult(activityProxy.createIntent(HelperActivity.class), null);
                        boolean zA = a();
                        semaphore.release();
                        if (!zA) {
                            this.f63321d = StatusCode.NO_APP_PERMISSION;
                            Logger.w("LocationTracker", "status: NO_APP_PERMISSION, reason: User has disabled location visibility");
                            return;
                        }
                    }
                    if (MobileServicesAvailabilityChecker.isGMSAvailable(this.f63319b)) {
                        new GMSLocationService().instantiate(this, this.f63319b);
                        return;
                    }
                    try {
                        Class<?> cls = Class.forName("com.noknok.android.client.extension.HMSLocationService");
                        cls.getDeclaredMethod("instantiate", ILocationServiceListener.class, Context.class).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), this, this.f63319b);
                    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                        this.f63321d = StatusCode.LOCATION_SERVICES_NOT_INSTALLED;
                    }
                } catch (InterruptedException e5) {
                    throw new IllegalStateException("Problem during wait", e5);
                }
            } catch (Throwable th2) {
                f63317f.release();
                throw th2;
            }
        }
    }
}
