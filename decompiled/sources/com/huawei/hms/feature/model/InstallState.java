package com.huawei.hms.feature.model;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.feature.utils.Logger;
import com.huawei.secure.android.common.intent.SafeBundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class InstallState implements Parcelable {
    public static final Parcelable.Creator<InstallState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f50415a = "InstallState";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f50419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f50420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f50421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<String> f50422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f50423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PendingIntent f50424j;
    public List<Intent> mInternalIntents;

    public class a implements Parcelable.Creator<InstallState> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstallState createFromParcel(Parcel parcel) {
            return new InstallState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InstallState[] newArray(int i10) {
            return new InstallState[i10];
        }
    }

    private InstallState(int i10, int i11, int i12, long j10, long j11, List<String> list, List<String> list2, List<String> list3, PendingIntent pendingIntent, List<Intent> list4) {
        this.f50416b = i10;
        this.f50417c = i11;
        this.f50418d = i12;
        this.f50419e = j10;
        this.f50420f = j11;
        this.f50421g = list;
        this.f50422h = list2;
        this.f50423i = list3;
        this.f50424j = pendingIntent;
        this.mInternalIntents = list4;
    }

    public static InstallState getStateFromBundle(Bundle bundle) {
        SafeBundle safeBundle = new SafeBundle(bundle);
        return new InstallState(safeBundle.getInt(b.f50436f), safeBundle.getInt("status"), safeBundle.getInt("error_code"), safeBundle.getLong(b.f50433c), safeBundle.getLong(b.f50437g), safeBundle.getStringArrayList(b.f50440j), safeBundle.getStringArrayList(b.f50441k), safeBundle.getStringArrayList(b.f50443n), safeBundle.getParcelable(b.f50438h) instanceof PendingIntent ? (PendingIntent) safeBundle.getParcelable(b.f50438h) : null, safeBundle.getParcelableArrayList(b.f50439i));
    }

    public static Bundle makeInvaildRequestBundle(List<String> list, List<String> list2) {
        Bundle bundle = new Bundle();
        bundle.putInt(b.f50436f, 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!list.isEmpty()) {
            bundle.putStringArrayList(b.f50440j, new ArrayList<>(list));
        }
        if (!list2.isEmpty()) {
            bundle.putStringArrayList(b.f50443n, new ArrayList<>(list2));
        }
        bundle.putLong(b.f50437g, 0L);
        bundle.putLong(b.f50433c, 0L);
        return bundle;
    }

    public static Intent makeRemoteStateUpdateIntent(InstallState installState) {
        Bundle bundle = new Bundle();
        bundle.putInt(b.f50436f, installState.f50416b);
        bundle.putInt("status", installState.status());
        bundle.putInt("error_code", installState.errorCode());
        bundle.putLong(b.f50433c, installState.bytesDownloaded());
        bundle.putLong(b.f50437g, installState.totalBytesToDownload());
        bundle.putStringArrayList(b.f50440j, (ArrayList) installState.moduleNames());
        bundle.putStringArrayList(b.f50441k, (ArrayList) installState.moduleFiles());
        bundle.putStringArrayList(b.f50443n, (ArrayList) installState.languages());
        bundle.putParcelable(b.f50438h, installState.f50424j);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("state", bundle);
        Intent intent = new Intent();
        Logger.d(f50415a, "set result remoteSessionState");
        intent.putExtra(b.f50444o, bundle2);
        return intent;
    }

    public static List<InstallState> makeSessionStatesList(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b.f50432b);
        if (parcelableArrayList != null) {
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(getStateFromBundle((Bundle) it.next()));
            }
        }
        return arrayList;
    }

    public final long bytesDownloaded() {
        return this.f50419e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int errorCode() {
        return this.f50418d;
    }

    public final List<String> languages() {
        return this.f50423i != null ? new ArrayList(this.f50423i) : new ArrayList();
    }

    public InstallState makeSessionState(int i10, int i11) {
        return new InstallState(this.f50416b, i10, i11, this.f50419e, this.f50420f, this.f50421g, this.f50422h, this.f50423i, this.f50424j, this.mInternalIntents);
    }

    public final List<String> moduleFiles() {
        return this.f50422h != null ? new ArrayList(this.f50422h) : new ArrayList();
    }

    public final List<String> moduleNames() {
        return this.f50421g != null ? new ArrayList(this.f50421g) : new ArrayList();
    }

    public final PendingIntent resolutionIntent() {
        return this.f50424j;
    }

    public final int sessionId() {
        return this.f50416b;
    }

    public final int status() {
        return this.f50417c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallState { installId=");
        sb2.append(this.f50416b);
        sb2.append(", status=");
        sb2.append(this.f50417c);
        sb2.append(", errorCode=");
        sb2.append(this.f50418d);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f50419e);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f50420f);
        sb2.append(", moduleNames=");
        sb2.append(this.f50421g);
        sb2.append(", moduleFiles=");
        sb2.append(this.f50422h);
        sb2.append(", languages=");
        return androidx.camera.core.imagecapture.a.c(sb2, this.f50423i, "}");
    }

    public final long totalBytesToDownload() {
        return this.f50420f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f50416b);
        parcel.writeInt(this.f50417c);
        parcel.writeInt(this.f50418d);
        parcel.writeLong(this.f50419e);
        parcel.writeLong(this.f50420f);
        parcel.writeStringList(this.f50421g);
        parcel.writeStringList(this.f50422h);
        parcel.writeStringList(this.f50423i);
        parcel.writeParcelable(this.f50424j, i10);
        parcel.writeTypedList(this.mInternalIntents);
    }

    public InstallState(Parcel parcel) {
        this.f50416b = parcel.readInt();
        this.f50417c = parcel.readInt();
        this.f50418d = parcel.readInt();
        this.f50419e = parcel.readLong();
        this.f50420f = parcel.readLong();
        this.f50421g = parcel.createStringArrayList();
        this.f50422h = parcel.createStringArrayList();
        this.f50423i = parcel.createStringArrayList();
        this.f50424j = (PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader());
        this.mInternalIntents = parcel.createTypedArrayList(Intent.CREATOR);
    }

    public static InstallState makeSessionState(Bundle bundle) {
        Bundle bundle2 = (Bundle) bundle.getParcelable("state");
        if (bundle2 == null) {
            Logger.w(f50415a, "Get state info form bundle failed.");
            bundle2 = new Bundle();
        }
        return getStateFromBundle(bundle2);
    }
}
