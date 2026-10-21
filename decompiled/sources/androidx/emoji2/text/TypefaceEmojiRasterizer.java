package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@AnyThread
@RequiresApi(19)
public class TypefaceEmojiRasterizer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<MetadataItem> f21305d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MetadataRepo f21307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f21308c = 0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface HasGlyph {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TypefaceEmojiRasterizer(@NonNull MetadataRepo metadataRepo, @IntRange(from = 0) int i10) {
        this.f21307b = metadataRepo;
        this.f21306a = i10;
    }

    public final MetadataItem a() {
        ThreadLocal<MetadataItem> threadLocal = f21305d;
        MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.f21307b.getMetadataList().list(metadataItem, this.f21306a);
        return metadataItem;
    }

    public void draw(@NonNull Canvas canvas, float f6, float f10, @NonNull Paint paint) {
        MetadataRepo metadataRepo = this.f21307b;
        Typeface typeface = metadataRepo.f21298d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(metadataRepo.getEmojiCharArray(), this.f21306a * 2, 2, f6, f10, paint);
        paint.setTypeface(typeface2);
    }

    public int getCodepointAt(int i10) {
        return a().codepoints(i10);
    }

    public int getCodepointsLength() {
        return a().codepointsLength();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getCompatAdded() {
        return a().compatAdded();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getHasGlyph() {
        return this.f21308c & 3;
    }

    public int getHeight() {
        return a().height();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getId() {
        return a().id();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getSdkAdded() {
        return a().sdkAdded();
    }

    @NonNull
    public Typeface getTypeface() {
        return this.f21307b.f21298d;
    }

    public int getWidth() {
        return a().width();
    }

    public boolean isDefaultEmoji() {
        return a().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        return (this.f21308c & 4) > 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.f21308c = 4;
        } else {
            this.f21308c = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setExclusion(boolean z10) {
        int hasGlyph = getHasGlyph();
        if (z10) {
            this.f21308c = hasGlyph | 4;
        } else {
            this.f21308c = hasGlyph;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasGlyph(boolean z10) {
        int i10 = this.f21308c & 4;
        this.f21308c = z10 ? i10 | 2 : i10 | 1;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(getId()));
        sb2.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i10 = 0; i10 < codepointsLength; i10++) {
            sb2.append(Integer.toHexString(getCodepointAt(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
