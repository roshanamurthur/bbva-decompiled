package androidx.core.view;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class ContentInfoCompat {
    public static final int FLAG_CONVERT_TO_PLAIN_TEXT = 1;
    public static final int SOURCE_APP = 0;
    public static final int SOURCE_AUTOFILL = 4;
    public static final int SOURCE_CLIPBOARD = 1;
    public static final int SOURCE_DRAG_AND_DROP = 3;
    public static final int SOURCE_INPUT_METHOD = 2;
    public static final int SOURCE_PROCESS_TEXT = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final f f20173a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Flags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    @RequiresApi(31)
    public static final class a {
        @NonNull
        @DoNotInline
        public static Pair<ContentInfo, ContentInfo> a(@NonNull ContentInfo contentInfo, @NonNull final Predicate<ClipData.Item> predicate) {
            ClipData clip = contentInfo.getClip();
            if (clip.getItemCount() == 1) {
                boolean zTest = predicate.test(clip.getItemAt(0));
                ContentInfo contentInfo2 = zTest ? contentInfo : null;
                if (zTest) {
                    contentInfo = null;
                }
                return Pair.create(contentInfo2, contentInfo);
            }
            Objects.requireNonNull(predicate);
            Pair<ClipData, ClipData> pairC = ContentInfoCompat.c(clip, new androidx.core.util.Predicate() { // from class: androidx.core.view.c
                @Override // androidx.core.util.Predicate
                public final /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate2) {
                    return androidx.core.util.i.a(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final /* synthetic */ androidx.core.util.Predicate negate() {
                    return androidx.core.util.i.b(this);
                }

                @Override // androidx.core.util.Predicate
                public final /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate2) {
                    return androidx.core.util.i.c(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj) {
                    return predicate.test((ClipData.Item) obj);
                }
            });
            if (pairC.first == null) {
                return Pair.create(null, contentInfo);
            }
            return pairC.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairC.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairC.second).build());
        }
    }

    public interface c {
        void a(int i10);

        void b(@Nullable Uri uri);

        @NonNull
        ContentInfoCompat build();

        void c(@NonNull ClipData clipData);

        void d(int i10);

        void setExtras(@Nullable Bundle bundle);
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public ClipData f20176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f20177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f20178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Uri f20179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public Bundle f20180e;

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void a(int i10) {
            this.f20177b = i10;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void b(@Nullable Uri uri) {
            this.f20179d = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new g(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void c(@NonNull ClipData clipData) {
            this.f20176a = clipData;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void d(int i10) {
            this.f20178c = i10;
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void setExtras(@Nullable Bundle bundle) {
            this.f20180e = bundle;
        }
    }

    @RequiresApi(31)
    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ContentInfo f20181a;

        public e(@NonNull ContentInfo contentInfo) {
            this.f20181a = androidx.core.view.b.a(Preconditions.checkNotNull(contentInfo));
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public final Uri a() {
            return this.f20181a.getLinkUri();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @NonNull
        public final ContentInfo b() {
            return this.f20181a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public final int c() {
            return this.f20181a.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @NonNull
        public final ClipData getClip() {
            return this.f20181a.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public final Bundle getExtras() {
            return this.f20181a.getExtras();
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public final int getSource() {
            return this.f20181a.getSource();
        }

        @NonNull
        public final String toString() {
            return "ContentInfoCompat{" + this.f20181a + "}";
        }
    }

    public interface f {
        @Nullable
        Uri a();

        @Nullable
        ContentInfo b();

        int c();

        @NonNull
        ClipData getClip();

        @Nullable
        Bundle getExtras();

        int getSource();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ClipData f20182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Uri f20185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Bundle f20186e;

        public g(d dVar) {
            this.f20182a = (ClipData) Preconditions.checkNotNull(dVar.f20176a);
            this.f20183b = Preconditions.checkArgumentInRange(dVar.f20177b, 0, 5, "source");
            this.f20184c = Preconditions.checkFlagsArgument(dVar.f20178c, 1);
            this.f20185d = dVar.f20179d;
            this.f20186e = dVar.f20180e;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public final Uri a() {
            return this.f20185d;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public final ContentInfo b() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public final int c() {
            return this.f20184c;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @NonNull
        public final ClipData getClip() {
            return this.f20182a;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        @Nullable
        public final Bundle getExtras() {
            return this.f20186e;
        }

        @Override // androidx.core.view.ContentInfoCompat.f
        public final int getSource() {
            return this.f20183b;
        }

        @NonNull
        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
            sb2.append(this.f20182a.getDescription());
            sb2.append(", source=");
            sb2.append(ContentInfoCompat.d(this.f20183b));
            sb2.append(", flags=");
            sb2.append(ContentInfoCompat.b(this.f20184c));
            Uri uri = this.f20185d;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb2.append(str);
            return ad.d.f(sb2, this.f20186e != null ? ", hasExtras" : "", "}");
        }
    }

    public ContentInfoCompat(@NonNull f fVar) {
        this.f20173a = fVar;
    }

    @NonNull
    public static ClipData a(@NonNull ClipDescription clipDescription, @NonNull List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipData.addItem(list.get(i10));
        }
        return clipData;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String b(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    @NonNull
    public static Pair<ClipData, ClipData> c(@NonNull ClipData clipData, @NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i10 = 0; i10 < clipData.getItemCount(); i10++) {
            ClipData.Item itemAt = clipData.getItemAt(i10);
            if (predicate.test(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        if (arrayList == null) {
            return Pair.create(null, clipData);
        }
        return arrayList2 == null ? Pair.create(clipData, null) : Pair.create(a(clipData.getDescription(), arrayList), a(clipData.getDescription(), arrayList2));
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static String d(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    @NonNull
    @RequiresApi(31)
    public static ContentInfoCompat toContentInfoCompat(@NonNull ContentInfo contentInfo) {
        return new ContentInfoCompat(new e(contentInfo));
    }

    @NonNull
    public ClipData getClip() {
        return this.f20173a.getClip();
    }

    @Nullable
    public Bundle getExtras() {
        return this.f20173a.getExtras();
    }

    public int getFlags() {
        return this.f20173a.c();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.f20173a.a();
    }

    public int getSource() {
        return this.f20173a.getSource();
    }

    @NonNull
    public Pair<ContentInfoCompat, ContentInfoCompat> partition(@NonNull androidx.core.util.Predicate<ClipData.Item> predicate) {
        ClipData clip = this.f20173a.getClip();
        if (clip.getItemCount() == 1) {
            boolean zTest = predicate.test(clip.getItemAt(0));
            return Pair.create(zTest ? this : null, zTest ? null : this);
        }
        Pair<ClipData, ClipData> pairC = c(clip, predicate);
        if (pairC.first == null) {
            return Pair.create(null, this);
        }
        return pairC.second == null ? Pair.create(this, null) : Pair.create(new Builder(this).setClip((ClipData) pairC.first).build(), new Builder(this).setClip((ClipData) pairC.second).build());
    }

    @NonNull
    @RequiresApi(31)
    public ContentInfo toContentInfo() {
        ContentInfo contentInfoB = this.f20173a.b();
        Objects.requireNonNull(contentInfoB);
        return androidx.core.view.b.a(contentInfoB);
    }

    @NonNull
    public String toString() {
        return this.f20173a.toString();
    }

    @RequiresApi(31)
    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ContentInfo.Builder f20175a;

        public b(@NonNull ClipData clipData, int i10) {
            this.f20175a = androidx.compose.ui.platform.c.c(clipData, i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void a(int i10) {
            this.f20175a.setSource(i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void b(@Nullable Uri uri) {
            this.f20175a.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new e(this.f20175a.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void c(@NonNull ClipData clipData) {
            this.f20175a.setClip(clipData);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void d(int i10) {
            this.f20175a.setFlags(i10);
        }

        @Override // androidx.core.view.ContentInfoCompat.c
        public final void setExtras(@Nullable Bundle bundle) {
            this.f20175a.setExtras(bundle);
        }

        public b(@NonNull ContentInfoCompat contentInfoCompat) {
            k.a();
            this.f20175a = j.a(contentInfoCompat.toContentInfo());
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final c f20174a;

        public Builder(@NonNull ContentInfoCompat contentInfoCompat) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f20174a = new b(contentInfoCompat);
                return;
            }
            d dVar = new d();
            dVar.f20176a = contentInfoCompat.getClip();
            dVar.f20177b = contentInfoCompat.getSource();
            dVar.f20178c = contentInfoCompat.getFlags();
            dVar.f20179d = contentInfoCompat.getLinkUri();
            dVar.f20180e = contentInfoCompat.getExtras();
            this.f20174a = dVar;
        }

        @NonNull
        public ContentInfoCompat build() {
            return this.f20174a.build();
        }

        @NonNull
        public Builder setClip(@NonNull ClipData clipData) {
            this.f20174a.c(clipData);
            return this;
        }

        @NonNull
        public Builder setExtras(@Nullable Bundle bundle) {
            this.f20174a.setExtras(bundle);
            return this;
        }

        @NonNull
        public Builder setFlags(int i10) {
            this.f20174a.d(i10);
            return this;
        }

        @NonNull
        public Builder setLinkUri(@Nullable Uri uri) {
            this.f20174a.b(uri);
            return this;
        }

        @NonNull
        public Builder setSource(int i10) {
            this.f20174a.a(i10);
            return this;
        }

        public Builder(@NonNull ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f20174a = new b(clipData, i10);
                return;
            }
            d dVar = new d();
            dVar.f20176a = clipData;
            dVar.f20177b = i10;
            this.f20174a = dVar;
        }
    }

    @NonNull
    @RequiresApi(31)
    public static Pair<ContentInfo, ContentInfo> partition(@NonNull ContentInfo contentInfo, @NonNull Predicate<ClipData.Item> predicate) {
        return a.a(contentInfo, predicate);
    }
}
