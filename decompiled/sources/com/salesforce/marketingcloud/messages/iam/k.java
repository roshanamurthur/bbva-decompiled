package com.salesforce.marketingcloud.messages.iam;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.media.o;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f64675g = com.salesforce.marketingcloud.g.a("MessageHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InAppMessage f64676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f64677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f64678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f64679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f64680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f64681f;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(Parcel parcel) {
        this((InAppMessage) parcel.readParcelable(InAppMessage.class.getClassLoader()));
        this.f64678c = parcel.readLong();
        this.f64679d = parcel.readLong();
        this.f64681f = parcel.readInt() == 1;
    }

    private void h() {
        if (this.f64681f) {
            this.f64679d = (SystemClock.elapsedRealtime() - this.f64680e) + this.f64679d;
        }
    }

    @Nullable
    public PendingIntent a(@NonNull Context context, @NonNull InAppMessage.Button button) {
        UrlHandler urlHandler;
        String strAction = button.action();
        if (button.actionType() == InAppMessage.Button.ActionType.url && strAction != null && (urlHandler = this.f64677b.urlHandler()) != null) {
            try {
                return urlHandler.handleUrl(context, strAction, "action");
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f64675g, e5, "Exception thrown by %s while handling url", urlHandler.getClass().getName());
            }
        }
        return null;
    }

    public long b() {
        return this.f64679d;
    }

    public Date c() {
        return new Date(this.f64678c);
    }

    public InAppMessage d() {
        return this.f64676a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public o e() {
        i iVar = this.f64677b;
        if (iVar != null) {
            return iVar.imageHandler();
        }
        return null;
    }

    public void f() {
        h();
    }

    public void g() {
        if (this.f64678c == -1) {
            this.f64678c = System.currentTimeMillis();
        }
        this.f64680e = SystemClock.elapsedRealtime();
    }

    public int i() {
        i iVar = this.f64677b;
        if (iVar != null) {
            return iVar.getStatusBarColor();
        }
        return 0;
    }

    public void j() {
        h();
        this.f64681f = false;
    }

    @Nullable
    public Typeface k() {
        i iVar = this.f64677b;
        if (iVar != null) {
            return iVar.getTypeface();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f64676a, i10);
        parcel.writeLong(this.f64678c);
        parcel.writeLong(this.f64679d);
        parcel.writeInt(this.f64681f ? 1 : 0);
    }

    public k(@NonNull InAppMessage inAppMessage) {
        MarketingCloudSdk marketingCloudSdk;
        this.f64678c = -1L;
        this.f64681f = true;
        this.f64676a = inAppMessage;
        if ((MarketingCloudSdk.isInitializing() || MarketingCloudSdk.isReady()) && (marketingCloudSdk = MarketingCloudSdk.getInstance()) != null) {
            this.f64677b = (i) marketingCloudSdk.getInAppMessageManager();
        }
    }

    public void a(@NonNull j jVar) {
        i iVar = this.f64677b;
        if (iVar != null) {
            InAppMessage inAppMessage = this.f64676a;
            if (jVar == null) {
                jVar = j.e();
            }
            iVar.handleMessageFinished(inAppMessage, jVar);
        }
    }

    public boolean a() {
        i iVar;
        InAppMessage inAppMessage = this.f64676a;
        return (inAppMessage == null || (iVar = this.f64677b) == null || !iVar.canDisplay(inAppMessage)) ? false : true;
    }
}
