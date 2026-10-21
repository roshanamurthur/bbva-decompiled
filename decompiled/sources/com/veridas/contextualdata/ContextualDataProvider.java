package com.veridas.contextualdata;

import android.content.Context;
import com.veridas.contextualdata.location.GeoPoint;
import com.veridas.contextualdata.location.ILocationContextualDataProvider;
import com.veridas.contextualdata.location.LocationContextualDataProvider;
import com.veridas.contextualdata.memory.IMemoryContextualDataProvider;
import com.veridas.contextualdata.memory.MemoryContextualDataProvider;
import com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider;
import com.veridas.contextualdata.miscellaneous.MiscellaneousContextualDataProvider;
import com.veridas.contextualdata.network.INetworkContextualDataProvider;
import com.veridas.contextualdata.network.NetworkContextualDataProvider;
import com.veridas.contextualdata.network.NetworkType;
import com.veridas.contextualdata.nfc.INfcContextualDataProvider;
import com.veridas.contextualdata.nfc.NfcContextualDataProvider;
import com.veridas.contextualdata.telephony.ITelephonyContextualDataProvider;
import com.veridas.contextualdata.telephony.TelephonyContextualDataProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextualDataProvider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\t\u0010\t\u001a\u00020\bH\u0096\u0001J\t\u0010\n\u001a\u00020\bH\u0096\u0001J\t\u0010\u000b\u001a\u00020\bH\u0096\u0001J\t\u0010\f\u001a\u00020\bH\u0096\u0001J\t\u0010\u000e\u001a\u00020\rH\u0096\u0001J\t\u0010\u000f\u001a\u00020\bH\u0096\u0001J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0012J\t\u0010\u0014\u001a\u00020\u0010H\u0096\u0001J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0001J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\rH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u0096\u0001J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010!\u001a\u00020 H\u0096A¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010 H\u0096A¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010 H\u0096A¢\u0006\u0004\b&\u0010%J\u000b\u0010'\u001a\u0004\u0018\u00010\bH\u0096\u0001J\t\u0010(\u001a\u00020\u001dH\u0096\u0001¨\u0006-"}, d2 = {"Lcom/veridas/contextualdata/ContextualDataProvider;", "Lcom/veridas/contextualdata/IContextualDataProvider;", "Lcom/veridas/contextualdata/miscellaneous/IMiscellaneousContextualDataProvider;", "Lcom/veridas/contextualdata/memory/IMemoryContextualDataProvider;", "Lcom/veridas/contextualdata/network/INetworkContextualDataProvider;", "Lcom/veridas/contextualdata/location/ILocationContextualDataProvider;", "Lcom/veridas/contextualdata/telephony/ITelephonyContextualDataProvider;", "Lcom/veridas/contextualdata/nfc/INfcContextualDataProvider;", "", "getDeviceModel", "getLanguage", "getOsName", "getOsVersionName", "", "getOsVersionNumber", "getSdkVersionName", "", "getExternalStorageSizeBytes", "()Ljava/lang/Float;", "getInternalStorageSizeBytes", "getRamSizeBytes", "getIpAddress", "Lcom/veridas/contextualdata/network/NetworkType;", "getNetworkConnectionType", "getWifiBssid", "getWifiRssi", "()Ljava/lang/Integer;", "getWifiSignalLevel", "getWifiSsid", "", "isWifiEnabled", "()Ljava/lang/Boolean;", "Lcom/veridas/contextualdata/location/GeoPoint;", "geoPoint", "getCountry", "(Lcom/veridas/contextualdata/location/GeoPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastKnownLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocation", "getMobileCarrierName", "isNfcSupported", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class ContextualDataProvider implements IContextualDataProvider, IMiscellaneousContextualDataProvider, IMemoryContextualDataProvider, INetworkContextualDataProvider, ILocationContextualDataProvider, ITelephonyContextualDataProvider, INfcContextualDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MiscellaneousContextualDataProvider f66678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MemoryContextualDataProvider f66679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NetworkContextualDataProvider f66680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LocationContextualDataProvider f66681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ TelephonyContextualDataProvider f66682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ NfcContextualDataProvider f66683f;

    public ContextualDataProvider(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66678a = new MiscellaneousContextualDataProvider();
        this.f66679b = new MemoryContextualDataProvider(context);
        this.f66680c = new NetworkContextualDataProvider(context);
        this.f66681d = new LocationContextualDataProvider(context);
        this.f66682e = new TelephonyContextualDataProvider(context);
        this.f66683f = new NfcContextualDataProvider(context);
    }

    @Override // com.veridas.contextualdata.location.ILocationContextualDataProvider
    @Nullable
    public Object getCountry(@NotNull GeoPoint geoPoint, @NotNull Continuation<? super String> continuation) {
        return this.f66681d.getCountry(geoPoint, continuation);
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getDeviceModel() {
        return this.f66678a.getDeviceModel();
    }

    @Override // com.veridas.contextualdata.memory.IMemoryContextualDataProvider
    @Nullable
    public Float getExternalStorageSizeBytes() {
        return this.f66679b.getExternalStorageSizeBytes();
    }

    @Override // com.veridas.contextualdata.memory.IMemoryContextualDataProvider
    @Nullable
    public Float getInternalStorageSizeBytes() {
        return this.f66679b.getInternalStorageSizeBytes();
    }

    @Override // com.veridas.contextualdata.network.INetworkContextualDataProvider
    @Nullable
    public String getIpAddress() {
        return this.f66680c.getIpAddress();
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getLanguage() {
        return this.f66678a.getLanguage();
    }

    @Override // com.veridas.contextualdata.location.ILocationContextualDataProvider
    @Nullable
    public Object getLastKnownLocation(@NotNull Continuation<? super GeoPoint> continuation) {
        return this.f66681d.getLastKnownLocation(continuation);
    }

    @Override // com.veridas.contextualdata.location.ILocationContextualDataProvider
    @Nullable
    public Object getLocation(@NotNull Continuation<? super GeoPoint> continuation) {
        return this.f66681d.getLocation(continuation);
    }

    @Override // com.veridas.contextualdata.telephony.ITelephonyContextualDataProvider
    @Nullable
    public String getMobileCarrierName() {
        return this.f66682e.getMobileCarrierName();
    }

    @Override // com.veridas.contextualdata.network.INetworkContextualDataProvider
    @Nullable
    public NetworkType getNetworkConnectionType() {
        return this.f66680c.getNetworkConnectionType();
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getOsName() {
        return this.f66678a.getOsName();
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getOsVersionName() {
        return this.f66678a.getOsVersionName();
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    public int getOsVersionNumber() {
        return this.f66678a.getOsVersionNumber();
    }

    @Override // com.veridas.contextualdata.memory.IMemoryContextualDataProvider
    public float getRamSizeBytes() {
        return this.f66679b.getRamSizeBytes();
    }

    @Override // com.veridas.contextualdata.miscellaneous.IMiscellaneousContextualDataProvider
    @NotNull
    public String getSdkVersionName() {
        return this.f66678a.getSdkVersionName();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public String getWifiBssid() {
        return this.f66680c.getWifiBssid();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Integer getWifiRssi() {
        return this.f66680c.getWifiRssi();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Integer getWifiSignalLevel() {
        return this.f66680c.getWifiSignalLevel();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public String getWifiSsid() {
        return this.f66680c.getWifiSsid();
    }

    @Override // com.veridas.contextualdata.nfc.INfcContextualDataProvider
    public boolean isNfcSupported() {
        return this.f66683f.isNfcSupported();
    }

    @Override // com.veridas.contextualdata.network.wifi.IWifiContextualDataProvider
    @Nullable
    public Boolean isWifiEnabled() {
        return this.f66680c.isWifiEnabled();
    }
}
