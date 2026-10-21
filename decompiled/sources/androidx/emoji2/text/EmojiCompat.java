package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import v2.i;

/* JADX INFO: loaded from: classes2.dex */
@AnyThread
public class EmojiCompat {
    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f21241o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f21242p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    @GuardedBy("INSTANCE_LOCK")
    public static volatile EmojiCompat f21243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @GuardedBy("CONFIG_LOCK")
    public static volatile boolean f21244r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final ReentrantReadWriteLock f21245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @GuardedBy("mInitLock")
    public final ArraySet f21246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mInitLock")
    public volatile int f21247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Handler f21248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final a f21249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final MetadataRepoLoader f21250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final SpanFactory f21251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f21252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final int[] f21254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f21255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f21256l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final GlyphChecker f21257n;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface CodepointSequenceMatchResult {
    }

    public static abstract class Config {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final MetadataRepoLoader f21258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SpanFactory f21259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f21260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f21261d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public int[] f21262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public ArraySet f21263f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f21264g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f21265h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f21266i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public GlyphChecker f21267j = new androidx.emoji2.text.a();

        public Config(@NonNull MetadataRepoLoader metadataRepoLoader) {
            Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.f21258a = metadataRepoLoader;
        }

        @NonNull
        public final MetadataRepoLoader getMetadataRepoLoader() {
            return this.f21258a;
        }

        @NonNull
        public Config registerInitCallback(@NonNull InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.f21263f == null) {
                this.f21263f = new ArraySet();
            }
            this.f21263f.add(initCallback);
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorColor(@ColorInt int i10) {
            this.f21265h = i10;
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorEnabled(boolean z10) {
            this.f21264g = z10;
            return this;
        }

        @NonNull
        public Config setGlyphChecker(@NonNull GlyphChecker glyphChecker) {
            Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.f21267j = glyphChecker;
            return this;
        }

        @NonNull
        public Config setMetadataLoadStrategy(int i10) {
            this.f21266i = i10;
            return this;
        }

        @NonNull
        public Config setReplaceAll(boolean z10) {
            this.f21260c = z10;
            return this;
        }

        @NonNull
        public Config setSpanFactory(@NonNull SpanFactory spanFactory) {
            this.f21259b = spanFactory;
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z10) {
            return setUseEmojiAsDefaultStyle(z10, null);
        }

        @NonNull
        public Config unregisterInitCallback(@NonNull InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            ArraySet arraySet = this.f21263f;
            if (arraySet != null) {
                arraySet.remove(initCallback);
            }
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z10, @Nullable List<Integer> list) {
            this.f21261d = z10;
            if (!z10 || list == null) {
                this.f21262e = null;
            } else {
                this.f21262e = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    this.f21262e[i10] = it.next().intValue();
                    i10++;
                }
                Arrays.sort(this.f21262e);
            }
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        @NonNull
        @RequiresApi(19)
        public EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    public interface GlyphChecker {
        boolean hasGlyph(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void load(@NonNull MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(@Nullable Throwable th2);

        public abstract void onLoaded(@NonNull MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        @NonNull
        @RequiresApi(19)
        EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    @RequiresApi(19)
    public static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile d f21268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile MetadataRepo f21269c;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EmojiCompat f21270a;

        public b(EmojiCompat emojiCompat) {
            this.f21270a = emojiCompat;
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ArrayList f21271p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Throwable f21272q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f21273r0;

        public c(@NonNull List list, int i10, @Nullable Throwable th2) {
            Preconditions.checkNotNull(list, "initCallbacks cannot be null");
            this.f21271p0 = new ArrayList(list);
            this.f21273r0 = i10;
            this.f21272q0 = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f21271p0;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f21273r0 != 1) {
                while (i10 < size) {
                    ((InitCallback) arrayList.get(i10)).onFailed(this.f21272q0);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((InitCallback) arrayList.get(i10)).onInitialized();
                    i10++;
                }
            }
        }
    }

    public EmojiCompat(@NonNull Config config) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f21245a = reentrantReadWriteLock;
        this.f21247c = 3;
        this.f21252h = config.f21260c;
        this.f21253i = config.f21261d;
        this.f21254j = config.f21262e;
        this.f21255k = config.f21264g;
        this.f21256l = config.f21265h;
        MetadataRepoLoader metadataRepoLoader = config.f21258a;
        this.f21250f = metadataRepoLoader;
        int i10 = config.f21266i;
        this.m = i10;
        this.f21257n = config.f21267j;
        this.f21248d = new Handler(Looper.getMainLooper());
        ArraySet arraySet = new ArraySet();
        this.f21246b = arraySet;
        SpanFactory spanFactory = config.f21259b;
        this.f21251g = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
        ArraySet arraySet2 = config.f21263f;
        if (arraySet2 != null && !arraySet2.isEmpty()) {
            arraySet.addAll((Collection) config.f21263f);
        }
        a aVar = new a(this);
        this.f21249e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f21247c = 0;
            } catch (Throwable th2) {
                this.f21245a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (getLoadState() == 0) {
            try {
                metadataRepoLoader.load(new androidx.emoji2.text.b(aVar));
            } catch (Throwable th3) {
                b(th3);
            }
        }
    }

    @NonNull
    public static EmojiCompat get() {
        EmojiCompat emojiCompat;
        synchronized (f21241o) {
            emojiCompat = f21243q;
            Preconditions.checkState(emojiCompat != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return emojiCompat;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, boolean z10) {
        int iMin;
        if (editable == null || inputConnection == null || i10 < 0 || i11 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z10) {
            int iMax = Math.max(i10, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                loop0: while (true) {
                    boolean z11 = false;
                    while (true) {
                        if (iMax == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart < 0) {
                            if (!z11) {
                                selectionStart = 0;
                                break loop0;
                            }
                            break;
                        }
                        char cCharAt = editable.charAt(selectionStart);
                        if (z11) {
                            if (Character.isHighSurrogate(cCharAt)) {
                                iMax--;
                            }
                        } else if (!Character.isSurrogate(cCharAt)) {
                            iMax--;
                        } else if (!Character.isHighSurrogate(cCharAt)) {
                            z11 = true;
                        }
                        selectionStart = -1;
                        break;
                    }
                }
            }
            selectionStart = -1;
            break;
            int iMax2 = Math.max(i11, 0);
            iMin = editable.length();
            if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                loop2: while (true) {
                    boolean z12 = false;
                    while (true) {
                        if (iMax2 != 0) {
                            if (selectionEnd >= iMin) {
                                if (!z12) {
                                    break loop2;
                                }
                                break loop2;
                            }
                            char cCharAt2 = editable.charAt(selectionEnd);
                            if (z12) {
                                if (Character.isLowSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                }
                            } else if (!Character.isSurrogate(cCharAt2)) {
                                iMax2--;
                                selectionEnd++;
                            } else if (!Character.isLowSurrogate(cCharAt2)) {
                                selectionEnd++;
                                z12 = true;
                            }
                            iMin = -1;
                            break loop2;
                        }
                        iMin = selectionEnd;
                        break loop2;
                    }
                }
            }
            iMin = -1;
            break loop2;
            if (selectionStart == -1 || iMin == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i10, 0);
            iMin = Math.min(selectionEnd + i11, editable.length());
        }
        EmojiSpan[] emojiSpanArr = (EmojiSpan[]) editable.getSpans(selectionStart, iMin, EmojiSpan.class);
        if (emojiSpanArr == null || emojiSpanArr.length <= 0) {
            return false;
        }
        for (EmojiSpan emojiSpan : emojiSpanArr) {
            int spanStart = editable.getSpanStart(emojiSpan);
            int spanEnd = editable.getSpanEnd(emojiSpan);
            selectionStart = Math.min(spanStart, selectionStart);
            iMin = Math.max(spanEnd, iMin);
        }
        int iMax3 = Math.max(selectionStart, 0);
        int iMin2 = Math.min(iMin, editable.length());
        inputConnection.beginBatchEdit();
        editable.delete(iMax3, iMin2);
        inputConnection.endBatchEdit();
        return true;
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        boolean zA;
        if (i10 == 67) {
            zA = d.a(editable, keyEvent, false);
        } else {
            if (i10 != 112) {
                return false;
            }
            zA = d.a(editable, keyEvent, true);
        }
        if (!zA) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    @Nullable
    public static EmojiCompat init(@NonNull Context context) {
        return init(context, null);
    }

    public static boolean isConfigured() {
        return f21243q != null;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static EmojiCompat reset(@NonNull Config config) {
        EmojiCompat emojiCompat;
        synchronized (f21241o) {
            emojiCompat = new EmojiCompat(config);
            f21243q = emojiCompat;
        }
        return emojiCompat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static void skipDefaultConfigurationLookup(boolean z10) {
        synchronized (f21242p) {
            f21244r = z10;
        }
    }

    public final boolean a() {
        return getLoadState() == 1;
    }

    public final void b(@Nullable Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f21245a.writeLock().lock();
        try {
            this.f21247c = 2;
            arrayList.addAll(this.f21246b);
            this.f21246b.clear();
            this.f21245a.writeLock().unlock();
            this.f21248d.post(new c(arrayList, this.f21247c, th2));
        } catch (Throwable th3) {
            this.f21245a.writeLock().unlock();
            throw th3;
        }
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        this.f21245a.writeLock().lock();
        try {
            this.f21247c = 1;
            arrayList.addAll(this.f21246b);
            this.f21246b.clear();
            this.f21245a.writeLock().unlock();
            this.f21248d.post(new c(arrayList, this.f21247c, null));
        } catch (Throwable th2) {
            this.f21245a.writeLock().unlock();
            throw th2;
        }
    }

    @NonNull
    public String getAssetSignature() {
        Preconditions.checkState(a(), "Not initialized yet");
        String strSourceSha = this.f21249e.f21269c.getMetadataList().sourceSha();
        return strSourceSha == null ? "" : strSourceSha;
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10) {
        Preconditions.checkState(a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        d dVar = this.f21249e.f21268b;
        dVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i10, i10 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanEnd(emojiSpanArr[0]);
            }
        }
        return ((d.c) dVar.c(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d.c(i10))).f21324c;
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10) {
        Preconditions.checkState(a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.f21249e.f21268b.b(charSequence, i10);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiSpanIndicatorColor() {
        return this.f21256l;
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10) {
        Preconditions.checkState(a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        d dVar = this.f21249e.f21268b;
        dVar.getClass();
        if (i10 < 0 || i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            EmojiSpan[] emojiSpanArr = (EmojiSpan[]) spanned.getSpans(i10, i10 + 1, EmojiSpan.class);
            if (emojiSpanArr.length > 0) {
                return spanned.getSpanStart(emojiSpanArr[0]);
            }
        }
        return ((d.c) dVar.c(charSequence, Math.max(0, i10 - 16), Math.min(charSequence.length(), i10 + 16), Integer.MAX_VALUE, true, new d.c(i10))).f21323b;
    }

    public int getLoadState() {
        this.f21245a.readLock().lock();
        try {
            return this.f21247c;
        } finally {
            this.f21245a.readLock().unlock();
        }
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence) {
        Preconditions.checkState(a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        d dVar = this.f21249e.f21268b;
        return dVar.b(charSequence, dVar.f21316b.f21295a.version()) == 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isEmojiSpanIndicatorEnabled() {
        return this.f21255k;
    }

    public void load() {
        Preconditions.checkState(this.m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (a()) {
            return;
        }
        this.f21245a.writeLock().lock();
        try {
            if (this.f21247c == 0) {
                this.f21245a.writeLock().unlock();
                return;
            }
            this.f21247c = 0;
            this.f21245a.writeLock().unlock();
            a aVar = this.f21249e;
            EmojiCompat emojiCompat = aVar.f21270a;
            try {
                emojiCompat.f21250f.load(new androidx.emoji2.text.b(aVar));
            } catch (Throwable th2) {
                emojiCompat.b(th2);
            }
        } catch (Throwable th3) {
            this.f21245a.writeLock().unlock();
            throw th3;
        }
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public void registerInitCallback(@NonNull InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.f21245a.writeLock().lock();
        try {
            if (this.f21247c == 1 || this.f21247c == 2) {
                this.f21248d.post(new c(Arrays.asList((InitCallback) Preconditions.checkNotNull(initCallback, "initCallback cannot be null")), this.f21247c, null));
            } else {
                this.f21246b.add(initCallback);
            }
        } finally {
            this.f21245a.writeLock().unlock();
        }
    }

    public void unregisterInitCallback(@NonNull InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f21245a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f21246b.remove(initCallback);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void updateEditorInfo(@NonNull EditorInfo editorInfo) {
        if (!a() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        a aVar = this.f21249e;
        aVar.getClass();
        editorInfo.extras.putInt(EDITOR_INFO_METAVERSION_KEY, aVar.f21269c.f21295a.version());
        editorInfo.extras.putBoolean(EDITOR_INFO_REPLACE_ALL_KEY, aVar.f21270a.f21252h);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static EmojiCompat init(@NonNull Context context, @Nullable DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        EmojiCompat emojiCompat;
        if (f21244r) {
            return f21243q;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        Config configCreate = defaultEmojiCompatConfigFactory.create(context);
        synchronized (f21242p) {
            try {
                if (!f21244r) {
                    if (configCreate != null) {
                        init(configCreate);
                    }
                    f21244r = true;
                }
                emojiCompat = f21243q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return emojiCompat;
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11) {
        return process(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        return process(charSequence, i10, i11, i12, 0);
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i10, @IntRange(from = 0) int i11, @IntRange(from = 0) int i12, int i13) {
        boolean z10;
        EmojiSpan[] emojiSpanArr;
        int iMin = i10;
        int iMax = i11;
        Preconditions.checkState(a(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(iMin, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(iMax, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(i12, "maxEmojiCount cannot be negative");
        Preconditions.checkArgument(iMin <= iMax, "start should be <= than end");
        i iVar = null;
        if (charSequence == null) {
            return null;
        }
        Preconditions.checkArgument(iMin <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(iMax <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || iMin == iMax) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f21252h : false;
        } else {
            z10 = true;
        }
        d dVar = this.f21249e.f21268b;
        dVar.getClass();
        boolean z11 = charSequence instanceof SpannableBuilder;
        if (z11) {
            ((SpannableBuilder) charSequence).beginBatchEdit();
        }
        if (z11) {
            iVar = new i((Spannable) charSequence);
        } else {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(iMin - 1, iMax + 1, EmojiSpan.class) <= iMax) {
                        iVar = new i();
                        iVar.f93966p0 = false;
                        iVar.f93967q0 = new SpannableString(charSequence);
                    }
                } else {
                    iVar = new i((Spannable) charSequence);
                }
            } finally {
                if (z11) {
                    ((SpannableBuilder) charSequence).endBatchEdit();
                }
            }
        }
        if (iVar != null && (emojiSpanArr = (EmojiSpan[]) iVar.f93967q0.getSpans(iMin, iMax, EmojiSpan.class)) != null && emojiSpanArr.length > 0) {
            for (EmojiSpan emojiSpan : emojiSpanArr) {
                int spanStart = iVar.f93967q0.getSpanStart(emojiSpan);
                int spanEnd = iVar.f93967q0.getSpanEnd(emojiSpan);
                if (spanStart != iMax) {
                    iVar.removeSpan(emojiSpan);
                }
                iMin = Math.min(spanStart, iMin);
                iMax = Math.max(spanEnd, iMax);
            }
        }
        int i14 = iMax;
        if (iMin != i14 && iMin < charSequence.length()) {
            i iVar2 = (i) dVar.c(charSequence, iMin, i14, (i12 == Integer.MAX_VALUE || iVar == null) ? i12 : i12 - ((EmojiSpan[]) iVar.f93967q0.getSpans(0, iVar.f93967q0.length(), EmojiSpan.class)).length, z10, new d.a(iVar, dVar.f21315a));
            if (iVar2 != null) {
                return iVar2.f93967q0;
            }
            if (!z11) {
                return charSequence;
            }
        } else if (!z11) {
            return charSequence;
        }
        return charSequence;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static EmojiCompat reset(@Nullable EmojiCompat emojiCompat) {
        EmojiCompat emojiCompat2;
        synchronized (f21241o) {
            f21243q = emojiCompat;
            emojiCompat2 = f21243q;
        }
        return emojiCompat2;
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence, @IntRange(from = 0) int i10) {
        Preconditions.checkState(a(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.f21249e.f21268b.b(charSequence, i10) == 1;
    }

    @NonNull
    public static EmojiCompat init(@NonNull Config config) {
        EmojiCompat emojiCompat = f21243q;
        if (emojiCompat == null) {
            synchronized (f21241o) {
                try {
                    emojiCompat = f21243q;
                    if (emojiCompat == null) {
                        emojiCompat = new EmojiCompat(config);
                        f21243q = emojiCompat;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return emojiCompat;
    }

    public static abstract class InitCallback {
        public void onInitialized() {
        }

        public void onFailed(@Nullable Throwable th2) {
        }
    }
}
