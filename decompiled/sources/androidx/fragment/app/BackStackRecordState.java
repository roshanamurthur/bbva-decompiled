package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a();
    public final CharSequence E0;
    public final ArrayList<String> F0;
    public final ArrayList<String> G0;
    public final boolean H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f21462p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList<String> f21463q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int[] f21464r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int[] f21465s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f21466t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f21467u0;
    public final int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final int f21468w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final CharSequence f21469x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f21470y0;

    public class a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(b bVar) {
        int size = bVar.f21625c.size();
        this.f21462p0 = new int[size * 6];
        if (!bVar.f21631i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f21463q0 = new ArrayList<>(size);
        this.f21464r0 = new int[size];
        this.f21465s0 = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            FragmentTransaction.a aVar = bVar.f21625c.get(i11);
            int i12 = i10 + 1;
            this.f21462p0[i10] = aVar.f21641a;
            ArrayList<String> arrayList = this.f21463q0;
            Fragment fragment = aVar.f21642b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f21462p0;
            iArr[i12] = aVar.f21643c ? 1 : 0;
            iArr[i10 + 2] = aVar.f21644d;
            iArr[i10 + 3] = aVar.f21645e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f21646f;
            i10 += 6;
            iArr[i13] = aVar.f21647g;
            this.f21464r0[i11] = aVar.f21648h.ordinal();
            this.f21465s0[i11] = aVar.f21649i.ordinal();
        }
        this.f21466t0 = bVar.f21630h;
        this.f21467u0 = bVar.f21633k;
        this.v0 = bVar.f21671v;
        this.f21468w0 = bVar.f21634l;
        this.f21469x0 = bVar.m;
        this.f21470y0 = bVar.f21635n;
        this.E0 = bVar.f21636o;
        this.F0 = bVar.f21637p;
        this.G0 = bVar.f21638q;
        this.H0 = bVar.f21639r;
    }

    public final void a(@NonNull b bVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f21462p0;
            boolean z10 = true;
            if (i10 >= iArr.length) {
                bVar.f21630h = this.f21466t0;
                bVar.f21633k = this.f21467u0;
                bVar.f21631i = true;
                bVar.f21634l = this.f21468w0;
                bVar.m = this.f21469x0;
                bVar.f21635n = this.f21470y0;
                bVar.f21636o = this.E0;
                bVar.f21637p = this.F0;
                bVar.f21638q = this.G0;
                bVar.f21639r = this.H0;
                return;
            }
            FragmentTransaction.a aVar = new FragmentTransaction.a();
            int i12 = i10 + 1;
            aVar.f21641a = iArr[i10];
            if (FragmentManager.isLoggingEnabled(2)) {
                Objects.toString(bVar);
                int i13 = iArr[i12];
            }
            aVar.f21648h = Lifecycle.State.values()[this.f21464r0[i11]];
            aVar.f21649i = Lifecycle.State.values()[this.f21465s0[i11]];
            int i14 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f21643c = z10;
            int i15 = iArr[i14];
            aVar.f21644d = i15;
            int i16 = iArr[i10 + 3];
            aVar.f21645e = i16;
            int i17 = i10 + 5;
            int i18 = iArr[i10 + 4];
            aVar.f21646f = i18;
            i10 += 6;
            int i19 = iArr[i17];
            aVar.f21647g = i19;
            bVar.f21626d = i15;
            bVar.f21627e = i16;
            bVar.f21628f = i18;
            bVar.f21629g = i19;
            bVar.b(aVar);
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f21462p0);
        parcel.writeStringList(this.f21463q0);
        parcel.writeIntArray(this.f21464r0);
        parcel.writeIntArray(this.f21465s0);
        parcel.writeInt(this.f21466t0);
        parcel.writeString(this.f21467u0);
        parcel.writeInt(this.v0);
        parcel.writeInt(this.f21468w0);
        TextUtils.writeToParcel(this.f21469x0, parcel, 0);
        parcel.writeInt(this.f21470y0);
        TextUtils.writeToParcel(this.E0, parcel, 0);
        parcel.writeStringList(this.F0);
        parcel.writeStringList(this.G0);
        parcel.writeInt(this.H0 ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f21462p0 = parcel.createIntArray();
        this.f21463q0 = parcel.createStringArrayList();
        this.f21464r0 = parcel.createIntArray();
        this.f21465s0 = parcel.createIntArray();
        this.f21466t0 = parcel.readInt();
        this.f21467u0 = parcel.readString();
        this.v0 = parcel.readInt();
        this.f21468w0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f21469x0 = (CharSequence) creator.createFromParcel(parcel);
        this.f21470y0 = parcel.readInt();
        this.E0 = (CharSequence) creator.createFromParcel(parcel);
        this.F0 = parcel.createStringArrayList();
        this.G0 = parcel.createStringArrayList();
        this.H0 = parcel.readInt() != 0;
    }
}
