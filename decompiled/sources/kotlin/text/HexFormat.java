package kotlin.text;

import androidx.appcompat.widget.g0;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.dynamiclinks.DynamicLink;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0004\u0019\u001a\u0018\u001bB!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lkotlin/text/HexFormat;", "", "", "toString", "", "a", "Z", "getUpperCase", "()Z", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat;", "b", "Lkotlin/text/HexFormat$BytesHexFormat;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat;", "c", "Lkotlin/text/HexFormat$NumberHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "number", "<init>", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "Companion", "Builder", "BytesHexFormat", "NumberHexFormat", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
@ExperimentalStdlibApi
public final class HexFormat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final HexFormat f82290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final HexFormat f82291e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean upperCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BytesHexFormat bytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NumberHexFormat number;

    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0001R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/text/HexFormat;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "a", "Z", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "upperCase", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "bytes", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "number", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public boolean upperCase = HexFormat.INSTANCE.getDefault().getUpperCase();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public BytesHexFormat.Builder f82296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public NumberHexFormat.Builder f82297c;

        @PublishedApi
        public Builder() {
        }

        @PublishedApi
        @NotNull
        public final HexFormat build() {
            BytesHexFormat default$kotlin_stdlib;
            NumberHexFormat default$kotlin_stdlib2;
            boolean z10 = this.upperCase;
            BytesHexFormat.Builder builder = this.f82296b;
            if (builder == null || (default$kotlin_stdlib = builder.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib = BytesHexFormat.INSTANCE.getDefault$kotlin_stdlib();
            }
            NumberHexFormat.Builder builder2 = this.f82297c;
            if (builder2 == null || (default$kotlin_stdlib2 = builder2.build$kotlin_stdlib()) == null) {
                default$kotlin_stdlib2 = NumberHexFormat.INSTANCE.getDefault$kotlin_stdlib();
            }
            return new HexFormat(z10, default$kotlin_stdlib, default$kotlin_stdlib2);
        }

        @NotNull
        public final BytesHexFormat.Builder getBytes() {
            if (this.f82296b == null) {
                this.f82296b = new BytesHexFormat.Builder();
            }
            BytesHexFormat.Builder builder = this.f82296b;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        @NotNull
        public final NumberHexFormat.Builder getNumber() {
            if (this.f82297c == null) {
                this.f82297c = new NumberHexFormat.Builder();
            }
            NumberHexFormat.Builder builder = this.f82297c;
            Intrinsics.checkNotNull(builder);
            return builder;
        }

        public final boolean getUpperCase() {
            return this.upperCase;
        }

        public final void setUpperCase(boolean z10) {
            this.upperCase = z10;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\u0018\u0000 $2\u00020\u0001:\u0002%$B9\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\n\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017¨\u0006&"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getBytesPerLine", "()I", "bytesPerLine", "b", "getBytesPerGroup", "bytesPerGroup", "c", "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "groupSeparator", "d", "getByteSeparator", "byteSeparator", "e", "getBytePrefix", "bytePrefix", "f", "getByteSuffix", "byteSuffix", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class BytesHexFormat {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final BytesHexFormat f82298g = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int bytesPerLine;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int bytesPerGroup;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String groupSeparator;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String byteSeparator;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String bytePrefix;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String byteSuffix;

        /* JADX INFO: compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R*\u0010\"\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R*\u0010&\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "value", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getBytesPerLine", "()I", "setBytesPerLine", "(I)V", "bytesPerLine", "b", "getBytesPerGroup", "setBytesPerGroup", "bytesPerGroup", "", "c", "Ljava/lang/String;", "getGroupSeparator", "()Ljava/lang/String;", "setGroupSeparator", "(Ljava/lang/String;)V", "groupSeparator", "d", "getByteSeparator", "setByteSeparator", "byteSeparator", "e", "getBytePrefix", "setBytePrefix", "bytePrefix", "f", "getByteSuffix", "setByteSuffix", "byteSuffix", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public int bytesPerLine;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            public int bytesPerGroup;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public String groupSeparator;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public String byteSeparator;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public String bytePrefix;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public String byteSuffix;

            public Builder() {
                Companion companion = BytesHexFormat.INSTANCE;
                this.bytesPerLine = companion.getDefault$kotlin_stdlib().getBytesPerLine();
                this.bytesPerGroup = companion.getDefault$kotlin_stdlib().getBytesPerGroup();
                this.groupSeparator = companion.getDefault$kotlin_stdlib().getGroupSeparator();
                this.byteSeparator = companion.getDefault$kotlin_stdlib().getByteSeparator();
                this.bytePrefix = companion.getDefault$kotlin_stdlib().getBytePrefix();
                this.byteSuffix = companion.getDefault$kotlin_stdlib().getByteSuffix();
            }

            @NotNull
            public final BytesHexFormat build$kotlin_stdlib() {
                return new BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
            }

            @NotNull
            public final String getBytePrefix() {
                return this.bytePrefix;
            }

            @NotNull
            public final String getByteSeparator() {
                return this.byteSeparator;
            }

            @NotNull
            public final String getByteSuffix() {
                return this.byteSuffix;
            }

            public final int getBytesPerGroup() {
                return this.bytesPerGroup;
            }

            public final int getBytesPerLine() {
                return this.bytesPerLine;
            }

            @NotNull
            public final String getGroupSeparator() {
                return this.groupSeparator;
            }

            public final void setBytePrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException(androidx.camera.core.processing.f.d("LF and CR characters are prohibited in bytePrefix, but was ", value));
                }
                this.bytePrefix = value;
            }

            public final void setByteSeparator(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException(androidx.camera.core.processing.f.d("LF and CR characters are prohibited in byteSeparator, but was ", value));
                }
                this.byteSeparator = value;
            }

            public final void setByteSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException(androidx.camera.core.processing.f.d("LF and CR characters are prohibited in byteSuffix, but was ", value));
                }
                this.byteSuffix = value;
            }

            public final void setBytesPerGroup(int i10) {
                if (i10 <= 0) {
                    throw new IllegalArgumentException(g0.c("Non-positive values are prohibited for bytesPerGroup, but was ", i10));
                }
                this.bytesPerGroup = i10;
            }

            public final void setBytesPerLine(int i10) {
                if (i10 <= 0) {
                    throw new IllegalArgumentException(g0.c("Non-positive values are prohibited for bytesPerLine, but was ", i10));
                }
                this.bytesPerLine = i10;
            }

            public final void setGroupSeparator(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.groupSeparator = str;
            }
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final BytesHexFormat getDefault$kotlin_stdlib() {
                return BytesHexFormat.f82298g;
            }
        }

        public BytesHexFormat(int i10, int i11, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
            Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
            Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
            Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
            Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
            this.bytesPerLine = i10;
            this.bytesPerGroup = i11;
            this.groupSeparator = groupSeparator;
            this.byteSeparator = byteSeparator;
            this.bytePrefix = bytePrefix;
            this.byteSuffix = byteSuffix;
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb2, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("bytesPerLine = ");
            sb2.append(this.bytesPerLine);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.bytesPerGroup);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("groupSeparator = \"");
            sb2.append(this.groupSeparator);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("byteSeparator = \"");
            sb2.append(this.byteSeparator);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("bytePrefix = \"");
            sb2.append(this.bytePrefix);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("byteSuffix = \"");
            sb2.append(this.byteSuffix);
            sb2.append("\"");
            return sb2;
        }

        @NotNull
        public final String getBytePrefix() {
            return this.bytePrefix;
        }

        @NotNull
        public final String getByteSeparator() {
            return this.byteSeparator;
        }

        @NotNull
        public final String getByteSuffix() {
            return this.byteSuffix;
        }

        public final int getBytesPerGroup() {
            return this.bytesPerGroup;
        }

        public final int getBytesPerLine() {
            return this.bytesPerLine;
        }

        @NotNull
        public final String getGroupSeparator() {
            return this.groupSeparator;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            StringBuilder sbAppendOptionsTo$kotlin_stdlib = appendOptionsTo$kotlin_stdlib(sb2, "    ");
            sbAppendOptionsTo$kotlin_stdlib.append('\n');
            Intrinsics.checkNotNullExpressionValue(sbAppendOptionsTo$kotlin_stdlib, "append(...)");
            sb2.append(")");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HexFormat getDefault() {
            return HexFormat.f82290d;
        }

        @NotNull
        public final HexFormat getUpperCase() {
            return HexFormat.f82291e;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB!\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J'\u0010\n\u001a\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "", "toString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "(Ljava/lang/StringBuilder;Ljava/lang/String;)Ljava/lang/StringBuilder;", "appendOptionsTo", "a", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "prefix", "b", "getSuffix", DynamicLink.Builder.KEY_SUFFIX, "", "c", "Z", "getRemoveLeadingZeros", "()Z", "removeLeadingZeros", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Companion", "Builder", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    public static final class NumberHexFormat {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final NumberHexFormat f82311d = new NumberHexFormat("", "", false);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String suffix;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final boolean removeLeadingZeros;

        /* JADX INFO: compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "value", "a", "Ljava/lang/String;", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "prefix", "b", "getSuffix", "setSuffix", DynamicLink.Builder.KEY_SUFFIX, "", "c", "Z", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "removeLeadingZeros", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        public static final class Builder {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public String prefix;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public String suffix;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public boolean removeLeadingZeros;

            public Builder() {
                Companion companion = NumberHexFormat.INSTANCE;
                this.prefix = companion.getDefault$kotlin_stdlib().getPrefix();
                this.suffix = companion.getDefault$kotlin_stdlib().getSuffix();
                this.removeLeadingZeros = companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            }

            @NotNull
            public final NumberHexFormat build$kotlin_stdlib() {
                return new NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros);
            }

            @NotNull
            public final String getPrefix() {
                return this.prefix;
            }

            public final boolean getRemoveLeadingZeros() {
                return this.removeLeadingZeros;
            }

            @NotNull
            public final String getSuffix() {
                return this.suffix;
            }

            public final void setPrefix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException(androidx.camera.core.processing.f.d("LF and CR characters are prohibited in prefix, but was ", value));
                }
                this.prefix = value;
            }

            public final void setRemoveLeadingZeros(boolean z10) {
                this.removeLeadingZeros = z10;
            }

            public final void setSuffix(@NotNull String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                if (StringsKt__StringsKt.contains$default((CharSequence) value, '\n', false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) value, '\r', false, 2, (Object) null)) {
                    throw new IllegalArgumentException(androidx.camera.core.processing.f.d("LF and CR characters are prohibited in suffix, but was ", value));
                }
                this.suffix = value;
            }
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final NumberHexFormat getDefault$kotlin_stdlib() {
                return NumberHexFormat.f82311d;
            }
        }

        public NumberHexFormat(@NotNull String prefix, @NotNull String suffix, boolean z10) {
            Intrinsics.checkNotNullParameter(prefix, "prefix");
            Intrinsics.checkNotNullParameter(suffix, "suffix");
            this.prefix = prefix;
            this.suffix = suffix;
            this.removeLeadingZeros = z10;
        }

        @NotNull
        public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb2, @NotNull String indent) {
            Intrinsics.checkNotNullParameter(sb2, "sb");
            Intrinsics.checkNotNullParameter(indent, "indent");
            sb2.append(indent);
            sb2.append("prefix = \"");
            sb2.append(this.prefix);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("suffix = \"");
            sb2.append(this.suffix);
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append("\",");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append(indent);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.removeLeadingZeros);
            return sb2;
        }

        @NotNull
        public final String getPrefix() {
            return this.prefix;
        }

        public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
        }

        @NotNull
        public final String getSuffix() {
            return this.suffix;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
            StringBuilder sbAppendOptionsTo$kotlin_stdlib = appendOptionsTo$kotlin_stdlib(sb2, "    ");
            sbAppendOptionsTo$kotlin_stdlib.append('\n');
            Intrinsics.checkNotNullExpressionValue(sbAppendOptionsTo$kotlin_stdlib, "append(...)");
            sb2.append(")");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.INSTANCE;
        BytesHexFormat default$kotlin_stdlib = companion.getDefault$kotlin_stdlib();
        NumberHexFormat.Companion companion2 = NumberHexFormat.INSTANCE;
        f82290d = new HexFormat(false, default$kotlin_stdlib, companion2.getDefault$kotlin_stdlib());
        f82291e = new HexFormat(true, companion.getDefault$kotlin_stdlib(), companion2.getDefault$kotlin_stdlib());
    }

    public HexFormat(boolean z10, @NotNull BytesHexFormat bytes, @NotNull NumberHexFormat number) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(number, "number");
        this.upperCase = z10;
        this.bytes = bytes;
        this.number = number;
    }

    @NotNull
    public final BytesHexFormat getBytes() {
        return this.bytes;
    }

    @NotNull
    public final NumberHexFormat getNumber() {
        return this.number;
    }

    public final boolean getUpperCase() {
        return this.upperCase;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    upperCase = ");
        sb2.append(this.upperCase);
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(",");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    bytes = BytesHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder sbAppendOptionsTo$kotlin_stdlib = this.bytes.appendOptionsTo$kotlin_stdlib(sb2, "        ");
        sbAppendOptionsTo$kotlin_stdlib.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppendOptionsTo$kotlin_stdlib, "append(...)");
        sb2.append("    ),");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("    number = NumberHexFormat(");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder sbAppendOptionsTo$kotlin_stdlib2 = this.number.appendOptionsTo$kotlin_stdlib(sb2, "        ");
        sbAppendOptionsTo$kotlin_stdlib2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sbAppendOptionsTo$kotlin_stdlib2, "append(...)");
        sb2.append("    )");
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append(")");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
