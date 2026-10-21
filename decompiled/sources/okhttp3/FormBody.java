package okhttp3;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FormBody.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B%\b\u0000\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u001b"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "", "-deprecated_size", "()I", "size", FirebaseAnalytics.Param.INDEX, "", "encodedName", "name", "encodedValue", "value", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "", "writeTo", "", "encodedNames", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class FormBody extends RequestBody {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final MediaType f85538c = MediaType.INSTANCE.get("application/x-www-form-urlencoded");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<String> f85539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<String> f85540b;

    /* JADX INFO: compiled from: FormBody.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "", "name", "value", "add", "addEncoded", "Lokhttp3/FormBody;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Charset f85541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList f85542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f85543c;

        /* JADX WARN: Multi-variable type inference failed */
        @JvmOverloads
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final Builder add(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f85542b;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            arrayList.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.f85541a, 91, null));
            this.f85543c.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.f85541a, 91, null));
            return this;
        }

        @NotNull
        public final Builder addEncoded(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ArrayList arrayList = this.f85542b;
            HttpUrl.Companion companion = HttpUrl.INSTANCE;
            arrayList.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.f85541a, 83, null));
            this.f85543c.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.f85541a, 83, null));
            return this;
        }

        @NotNull
        public final FormBody build() {
            return new FormBody(this.f85542b, this.f85543c);
        }

        @JvmOverloads
        public Builder(@Nullable Charset charset) {
            this.f85541a = charset;
            this.f85542b = new ArrayList();
            this.f85543c = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : charset);
        }
    }

    public FormBody(@NotNull List<String> encodedNames, @NotNull List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f85539a = Util.toImmutableList(encodedNames);
        this.f85540b = Util.toImmutableList(encodedValues);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "size", imports = {}))
    @JvmName(name = "-deprecated_size")
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m6102deprecated_size() {
        return size();
    }

    public final long a(BufferedSink bufferedSink, boolean z10) {
        Buffer buffer;
        if (z10) {
            buffer = new Buffer();
        } else {
            Intrinsics.checkNotNull(bufferedSink);
            buffer = bufferedSink.getBuffer();
        }
        List<String> list = this.f85539a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8(list.get(i10));
            buffer.writeByte(61);
            buffer.writeUtf8(this.f85540b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = buffer.size();
        buffer.clear();
        return size2;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return a(null, true);
    }

    @Override // okhttp3.RequestBody
    @NotNull
    /* JADX INFO: renamed from: contentType */
    public MediaType getF85648a() {
        return f85538c;
    }

    @NotNull
    public final String encodedName(int index) {
        return this.f85539a.get(index);
    }

    @NotNull
    public final String encodedValue(int index) {
        return this.f85540b.get(index);
    }

    @NotNull
    public final String name(int index) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedName(index), 0, 0, true, 3, null);
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f85539a.size();
    }

    @NotNull
    public final String value(int index) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.INSTANCE, encodedValue(index), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@NotNull BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        a(sink, false);
    }
}
