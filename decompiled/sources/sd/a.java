package sd;

import ad.d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.k;
import androidx.camera.core.processing.f;
import com.bbva.component.dm.naturalauth.Constants;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.cct.internal.AndroidClientInfo;
import com.google.android.datatransport.cct.internal.BatchedLogRequest;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.LogEvent;
import com.google.android.datatransport.cct.internal.LogRequest;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.retries.Retries;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.DataEncoder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: CctTransportBackend.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements TransportBackend {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f93163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f93164c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Clock f93166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Clock f93167f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataEncoder f93162a = BatchedLogRequest.createDataEncoder();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final URL f93165d = a(CCTDestination.f43570c);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f93168g = 130000;

    /* JADX INFO: renamed from: sd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class C0490a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f93169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BatchedLogRequest f93170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f93171c;

        public C0490a(URL url, BatchedLogRequest batchedLogRequest, @Nullable String str) {
            this.f93169a = url;
            this.f93170b = batchedLogRequest;
            this.f93171c = str;
        }
    }

    /* JADX INFO: compiled from: CctTransportBackend.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f93172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final URL f93173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f93174c;

        public b(int i10, @Nullable URL url, long j10) {
            this.f93172a = i10;
            this.f93173b = url;
            this.f93174c = j10;
        }
    }

    public a(Context context, Clock clock, Clock clock2) {
        this.f93164c = context;
        this.f93163b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f93166e = clock2;
        this.f93167f = clock;
    }

    public static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e5) {
            throw new IllegalArgumentException(f.d("Invalid url: ", str), e5);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final EventInternal decorate(EventInternal eventInternal) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f93163b.getActiveNetworkInfo();
        EventInternal.Builder builderAddMetadata = eventInternal.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata(Constants.device, Build.DEVICE).addMetadata("product", Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata(Constants.manufacturer, Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        EventInternal.Builder builderAddMetadata2 = builderAddMetadata.addMetadata("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000).addMetadata("net-type", activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.getValue() : activeNetworkInfo.getType());
        int i10 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(subtype) == null) {
                subtype = 0;
            }
        }
        EventInternal.Builder builderAddMetadata3 = builderAddMetadata2.addMetadata("mobile-subtype", subtype).addMetadata("country", Locale.getDefault().getCountry()).addMetadata("locale", Locale.getDefault().getLanguage());
        Context context = this.f93164c;
        EventInternal.Builder builderAddMetadata4 = builderAddMetadata3.addMetadata("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
        try {
            i10 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e5) {
            Logging.e("CctTransportBackend", "Unable to find version code for package", e5);
        }
        return builderAddMetadata4.addMetadata("application_build", Integer.toString(i10)).build();
    }

    @Override // com.google.android.datatransport.runtime.backends.TransportBackend
    public final BackendResponse send(BackendRequest backendRequest) {
        LogEvent.Builder builderProtoBuilder;
        HashMap map = new HashMap();
        for (EventInternal eventInternal : backendRequest.getEvents()) {
            String transportName = eventInternal.getTransportName();
            if (map.containsKey(transportName)) {
                ((List) map.get(transportName)).add(eventInternal);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eventInternal);
                map.put(transportName, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            EventInternal eventInternal2 = (EventInternal) ((List) entry.getValue()).get(0);
            LogRequest.Builder clientInfo = LogRequest.builder().setQosTier(QosTier.DEFAULT).setRequestTimeMs(this.f93167f.getTime()).setRequestUptimeMs(this.f93166e.getTime()).setClientInfo(ClientInfo.builder().setClientType(ClientInfo.ClientType.ANDROID_FIREBASE).setAndroidClientInfo(AndroidClientInfo.builder().setSdkVersion(Integer.valueOf(eventInternal2.getInteger("sdk-version"))).setModel(eventInternal2.get("model")).setHardware(eventInternal2.get("hardware")).setDevice(eventInternal2.get(Constants.device)).setProduct(eventInternal2.get("product")).setOsBuild(eventInternal2.get("os-uild")).setManufacturer(eventInternal2.get(Constants.manufacturer)).setFingerprint(eventInternal2.get("fingerprint")).setCountry(eventInternal2.get("country")).setLocale(eventInternal2.get("locale")).setMccMnc(eventInternal2.get("mcc_mnc")).setApplicationBuild(eventInternal2.get("application_build")).build()).build());
            try {
                clientInfo.setSource(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                clientInfo.setSource((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (EventInternal eventInternal3 : (List) entry.getValue()) {
                EncodedPayload encodedPayload = eventInternal3.getEncodedPayload();
                Encoding encoding = encodedPayload.getEncoding();
                if (encoding.equals(Encoding.of("proto"))) {
                    builderProtoBuilder = LogEvent.protoBuilder(encodedPayload.getBytes());
                } else if (encoding.equals(Encoding.of("json"))) {
                    builderProtoBuilder = LogEvent.jsonBuilder(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    Logging.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                builderProtoBuilder.setEventTimeMs(eventInternal3.getEventMillis()).setEventUptimeMs(eventInternal3.getUptimeMillis()).setTimezoneOffsetSeconds(eventInternal3.getLong("tz-offset")).setNetworkConnectionInfo(NetworkConnectionInfo.builder().setNetworkType(NetworkConnectionInfo.NetworkType.forNumber(eventInternal3.getInteger("net-type"))).setMobileSubtype(NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal3.getInteger("mobile-subtype"))).build());
                if (eventInternal3.getCode() != null) {
                    builderProtoBuilder.setEventCode(eventInternal3.getCode());
                }
                arrayList3.add(builderProtoBuilder.build());
            }
            clientInfo.setLogEvents(arrayList3);
            arrayList2.add(clientInfo.build());
        }
        BatchedLogRequest batchedLogRequestCreate = BatchedLogRequest.create(arrayList2);
        byte[] extras = backendRequest.getExtras();
        String aPIKey = null;
        URL urlA = this.f93165d;
        if (extras != null) {
            try {
                CCTDestination cCTDestinationFromByteArray = CCTDestination.fromByteArray(backendRequest.getExtras());
                aPIKey = cCTDestinationFromByteArray.getAPIKey() != null ? cCTDestinationFromByteArray.getAPIKey() : null;
                if (cCTDestinationFromByteArray.getEndPoint() != null) {
                    urlA = a(cCTDestinationFromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.fatalError();
            }
        }
        try {
            b bVar = (b) Retries.retry(5, new C0490a(urlA, batchedLogRequestCreate, aPIKey), new k(this), new d());
            int i10 = bVar.f93172a;
            if (i10 == 200) {
                return BackendResponse.ok(bVar.f93174c);
            }
            if (i10 < 500 && i10 != 404) {
                return i10 == 400 ? BackendResponse.invalidPayload() : BackendResponse.fatalError();
            }
            return BackendResponse.transientError();
        } catch (IOException e5) {
            Logging.e("CctTransportBackend", "Could not make request to the backend", e5);
            return BackendResponse.transientError();
        }
    }
}
