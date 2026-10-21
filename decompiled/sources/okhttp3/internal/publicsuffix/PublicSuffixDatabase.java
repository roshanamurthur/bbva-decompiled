package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import bk.d;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PublicSuffixDatabase.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\r"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", DynamicLink.Builder.KEY_DOMAIN, "getEffectiveTldPlusOne", "", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "", "setListBytes", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class PublicSuffixDatabase {

    @NotNull
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f86082a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CountDownLatch f86083b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f86084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f86085d;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final byte[] f86079e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<String> f86080f = d.listOf(ProxyConfig.MATCH_ALL_SCHEMES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final PublicSuffixDatabase f86081g = new PublicSuffixDatabase();

    /* JADX INFO: compiled from: PublicSuffixDatabase.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "", "EXCEPTION_MARKER", "C", "", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final String access$binarySearch(Companion companion, byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int iAnd;
            boolean z10;
            int iAnd2;
            companion.getClass();
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        iAnd = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        iAnd = Util.and(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    iAnd2 = iAnd - Util.and(bArr[i14 + i19], 255);
                    if (iAnd2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (iAnd2 >= 0) {
                    if (iAnd2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i14, i16, UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        @NotNull
        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.f86081g;
        }
    }

    public static List b(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual(CollectionsKt___CollectionsKt.last(listSplit$default), "") ? CollectionsKt___CollectionsKt.dropLast(listSplit$default, 1) : listSplit$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void a() throws IOException {
        try {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
            if (resourceAsStream == null) {
                this.f86083b.countDown();
                return;
            }
            BufferedSource bufferedSourceBuffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                objectRef.element = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                objectRef2.element = bufferedSourceBuffer.readByteArray(bufferedSourceBuffer.readInt());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedSourceBuffer, null);
                synchronized (this) {
                    T t10 = objectRef.element;
                    Intrinsics.checkNotNull(t10);
                    this.f86084c = (byte[]) t10;
                    T t11 = objectRef2.element;
                    Intrinsics.checkNotNull(t11);
                    this.f86085d = (byte[]) t11;
                }
                this.f86083b.countDown();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(bufferedSourceBuffer, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            this.f86083b.countDown();
            throw th4;
        }
    }

    @Nullable
    public final String getEffectiveTldPlusOne(@NotNull String domain) {
        String strAccess$binarySearch;
        String str;
        String strAccess$binarySearch2;
        List<String> listEmptyList;
        List<String> listEmptyList2;
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        Intrinsics.checkNotNullExpressionValue(unicodeDomain, "unicodeDomain");
        List listB = b(unicodeDomain);
        AtomicBoolean atomicBoolean = this.f86082a;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                this.f86083b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        a();
                        break;
                    } catch (Throwable th2) {
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                } catch (InterruptedIOException unused2) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e5) {
                    Platform.INSTANCE.get().log("Failed to read public suffix list", 5, e5);
                    if (z10) {
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f86084c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size3 = listB.size();
        byte[][] bArr = new byte[size3][];
        for (int i10 = 0; i10 < size3; i10++) {
            String str2 = (String) listB.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                strAccess$binarySearch = null;
                break;
            }
            Companion companion = INSTANCE;
            byte[] bArr2 = this.f86084c;
            if (bArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr2 = null;
            }
            strAccess$binarySearch = Companion.access$binarySearch(companion, bArr2, bArr, i11);
            if (strAccess$binarySearch != null) {
                break;
            }
            i11++;
        }
        if (size3 <= 1) {
            str = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                str = null;
                break;
            }
            bArr3[i12] = f86079e;
            Companion companion2 = INSTANCE;
            byte[] bArr4 = this.f86084c;
            if (bArr4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixListBytes");
                bArr4 = null;
            }
            String strAccess$binarySearch3 = Companion.access$binarySearch(companion2, bArr4, bArr3, i12);
            if (strAccess$binarySearch3 != null) {
                str = strAccess$binarySearch3;
                break;
            }
            i12++;
        }
        if (str == null) {
            strAccess$binarySearch2 = null;
            break;
        }
        int i13 = size3 - 1;
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                strAccess$binarySearch2 = null;
                break;
            }
            Companion companion3 = INSTANCE;
            byte[] bArr5 = this.f86085d;
            if (bArr5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("publicSuffixExceptionListBytes");
                bArr5 = null;
            }
            strAccess$binarySearch2 = Companion.access$binarySearch(companion3, bArr5, bArr, i14);
            if (strAccess$binarySearch2 != null) {
                break;
            }
            i14++;
        }
        if (strAccess$binarySearch2 != null) {
            listEmptyList2 = StringsKt__StringsKt.split$default((CharSequence) CommandConstants.Z11_EXCLAMATION_MARK.concat(strAccess$binarySearch2), new char[]{'.'}, false, 0, 6, (Object) null);
        } else if (strAccess$binarySearch == null && str == null) {
            listEmptyList2 = f86080f;
        } else {
            if (strAccess$binarySearch == null || (listEmptyList = StringsKt__StringsKt.split$default((CharSequence) strAccess$binarySearch, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (str == null || (listEmptyList2 = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
            }
            if (listEmptyList.size() > listEmptyList2.size()) {
                listEmptyList2 = listEmptyList;
            }
        }
        if (listB.size() == listEmptyList2.size() && listEmptyList2.get(0).charAt(0) != '!') {
            return null;
        }
        if (listEmptyList2.get(0).charAt(0) == '!') {
            size = listB.size();
            size2 = listEmptyList2.size();
        } else {
            size = listB.size();
            size2 = listEmptyList2.size() + 1;
        }
        return SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence(b(domain)), size - size2), Constant.DOT_STRING, null, null, 0, null, null, 62, null);
    }

    public final void setListBytes(@NotNull byte[] publicSuffixListBytes, @NotNull byte[] publicSuffixExceptionListBytes) {
        Intrinsics.checkNotNullParameter(publicSuffixListBytes, "publicSuffixListBytes");
        Intrinsics.checkNotNullParameter(publicSuffixExceptionListBytes, "publicSuffixExceptionListBytes");
        this.f86084c = publicSuffixListBytes;
        this.f86085d = publicSuffixExceptionListBytes;
        this.f86082a.set(true);
        this.f86083b.countDown();
    }
}
