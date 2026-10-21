package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.Arrays;
import java.util.Set;
import v2.i;

/* JADX INFO: compiled from: EmojiProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final EmojiCompat.SpanFactory f21315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MetadataRepo f21316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final EmojiCompat.GlyphChecker f21317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final int[] f21319e;

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class a implements b<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public i f21320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EmojiCompat.SpanFactory f21321b;

        public a(@Nullable i iVar, EmojiCompat.SpanFactory spanFactory) {
            this.f21320a = iVar;
            this.f21321b = spanFactory;
        }

        @Override // androidx.emoji2.text.d.b
        public final boolean a(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (typefaceEmojiRasterizer.isPreferredSystemRender()) {
                return true;
            }
            if (this.f21320a == null) {
                this.f21320a = new i(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
            }
            this.f21320a.setSpan(this.f21321b.createSpan(typefaceEmojiRasterizer), i10, i11, 33);
            return true;
        }

        @Override // androidx.emoji2.text.d.b
        public final i getResult() {
            return this.f21320a;
        }
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public interface b<T> {
        boolean a(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer);

        T getResult();
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21326a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MetadataRepo.a f21327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public MetadataRepo.a f21328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public MetadataRepo.a f21329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f21331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f21332g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f21333h;

        public e(MetadataRepo.a aVar, boolean z10, int[] iArr) {
            this.f21327b = aVar;
            this.f21328c = aVar;
            this.f21332g = z10;
            this.f21333h = iArr;
        }

        public final int a(int i10) {
            SparseArray<MetadataRepo.a> sparseArray = this.f21328c.f21299a;
            MetadataRepo.a aVar = sparseArray == null ? null : sparseArray.get(i10);
            int i11 = 1;
            int i12 = 2;
            if (this.f21326a == 2) {
                if (aVar != null) {
                    this.f21328c = aVar;
                    this.f21331f++;
                } else if (i10 == 65038) {
                    b();
                } else if (i10 != 65039) {
                    MetadataRepo.a aVar2 = this.f21328c;
                    if (aVar2.f21300b != null) {
                        i12 = 3;
                        if (this.f21331f != 1) {
                            this.f21329d = aVar2;
                            b();
                        } else if (c()) {
                            this.f21329d = this.f21328c;
                            b();
                        } else {
                            b();
                        }
                    } else {
                        b();
                    }
                }
                i11 = i12;
            } else if (aVar == null) {
                b();
            } else {
                this.f21326a = 2;
                this.f21328c = aVar;
                this.f21331f = 1;
                i11 = i12;
            }
            this.f21330e = i10;
            return i11;
        }

        public final void b() {
            this.f21326a = 1;
            this.f21328c = this.f21327b;
            this.f21331f = 0;
        }

        public final boolean c() {
            int[] iArr;
            if (this.f21328c.f21300b.isDefaultEmoji() || this.f21330e == 65039) {
                return true;
            }
            return this.f21332g && ((iArr = this.f21333h) == null || Arrays.binarySearch(iArr, this.f21328c.f21300b.getCodepointAt(0)) < 0);
        }
    }

    public d(@NonNull MetadataRepo metadataRepo, @NonNull EmojiCompat.SpanFactory spanFactory, @NonNull EmojiCompat.GlyphChecker glyphChecker, boolean z10, @Nullable int[] iArr, @NonNull Set<int[]> set) {
        this.f21315a = spanFactory;
        this.f21316b = metadataRepo;
        this.f21317c = glyphChecker;
        this.f21318d = z10;
        this.f21319e = iArr;
        if (set.isEmpty()) {
            return;
        }
        for (int[] iArr2 : set) {
            String str = new String(iArr2, 0, iArr2.length);
            c(str, 0, str.length(), 1, true, new C0082d(str));
        }
    }

    public static boolean a(@NonNull Editable editable, @NonNull KeyEvent keyEvent, boolean z10) {
        EmojiSpan[] emojiSpanArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, selectionEnd, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = editable.getSpanStart(emojiSpan);
                int spanEnd = editable.getSpanEnd(emojiSpan);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final int b(@NonNull CharSequence charSequence, int i10) {
        e eVar = new e(this.f21316b.f21297c, this.f21318d, this.f21319e);
        int length = charSequence.length();
        int iCharCount = 0;
        int i11 = 0;
        int i12 = 0;
        while (iCharCount < length) {
            int iCodePointAt = Character.codePointAt(charSequence, iCharCount);
            int iA = eVar.a(iCodePointAt);
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = eVar.f21328c.f21300b;
            if (iA == 1) {
                iCharCount += Character.charCount(iCodePointAt);
                i12 = 0;
            } else if (iA == 2) {
                iCharCount += Character.charCount(iCodePointAt);
            } else if (iA == 3) {
                typefaceEmojiRasterizer = eVar.f21329d.f21300b;
                if (typefaceEmojiRasterizer.getCompatAdded() <= i10) {
                    i11++;
                }
            }
            if (typefaceEmojiRasterizer != null && typefaceEmojiRasterizer.getCompatAdded() <= i10) {
                i12++;
            }
        }
        if (i11 != 0) {
            return 2;
        }
        if (eVar.f21326a != 2 || eVar.f21328c.f21300b == null || ((eVar.f21331f <= 1 && !eVar.c()) || eVar.f21328c.f21300b.getCompatAdded() > i10)) {
            return i12 == 0 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    public final <T> T c(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, boolean z10, b<T> bVar) {
        int i13;
        e eVar = new e(this.f21316b.f21297c, this.f21318d, this.f21319e);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        boolean zA = true;
        int i14 = 0;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zA) {
                    int iA = eVar.a(iCodePointAt);
                    if (iA == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (iA == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (iA == 3) {
                        if (!z10) {
                            TypefaceEmojiRasterizer typefaceEmojiRasterizer = eVar.f21329d.f21300b;
                            if (typefaceEmojiRasterizer.getHasGlyph() == 0) {
                                typefaceEmojiRasterizer.setHasGlyph(this.f21317c.hasGlyph(charSequence, i13, iCharCount, typefaceEmojiRasterizer.getSdkAdded()));
                            }
                            if (typefaceEmojiRasterizer.getHasGlyph() == 2) {
                                break;
                            }
                        }
                        zA = bVar.a(charSequence, i13, iCharCount, eVar.f21329d.f21300b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (eVar.f21326a == 2 && eVar.f21328c.f21300b != null && ((eVar.f21331f > 1 || eVar.c()) && i14 < i12 && zA)) {
            if (z10) {
                bVar.a(charSequence, i13, iCharCount, eVar.f21328c.f21300b);
            } else {
                TypefaceEmojiRasterizer typefaceEmojiRasterizer2 = eVar.f21328c.f21300b;
                if (typefaceEmojiRasterizer2.getHasGlyph() == 0) {
                    typefaceEmojiRasterizer2.setHasGlyph(this.f21317c.hasGlyph(charSequence, i13, iCharCount, typefaceEmojiRasterizer2.getSdkAdded()));
                }
                if (typefaceEmojiRasterizer2.getHasGlyph() != 2) {
                    bVar.a(charSequence, i13, iCharCount, eVar.f21328c.f21300b);
                }
            }
        }
        return bVar.getResult();
    }

    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class c implements b<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f21322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f21323b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f21324c = -1;

        public c(int i10) {
            this.f21322a = i10;
        }

        @Override // androidx.emoji2.text.d.b
        public final boolean a(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            int i12 = this.f21322a;
            if (i10 > i12 || i12 >= i11) {
                return i11 <= i12;
            }
            this.f21323b = i10;
            this.f21324c = i11;
            return false;
        }

        @Override // androidx.emoji2.text.d.b
        public final c getResult() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EmojiProcessor.java */
    public static class C0082d implements b<C0082d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21325a;

        public C0082d(String str) {
            this.f21325a = str;
        }

        @Override // androidx.emoji2.text.d.b
        public final boolean a(@NonNull CharSequence charSequence, int i10, int i11, TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.f21325a)) {
                return true;
            }
            typefaceEmojiRasterizer.setExclusion(true);
            return false;
        }

        @Override // androidx.emoji2.text.d.b
        public final C0082d getResult() {
            return this;
        }
    }
}
