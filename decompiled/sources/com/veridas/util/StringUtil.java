package com.veridas.util;

import android.text.TextUtils;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.veridas.Veridas;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/veridas/util/StringUtil;", "", "()V", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StringUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @NotNull
    public static final String convertToString(@Nullable List<String> list) {
        return INSTANCE.convertToString(list);
    }

    @JvmStatic
    @NotNull
    public static final String hexToStringRepresentation(@NotNull byte[] bArr) {
        return INSTANCE.hexToStringRepresentation(bArr);
    }

    /* JADX INFO: compiled from: StringUtil.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\f"}, d2 = {"Lcom/veridas/util/StringUtil$Companion;", "", "()V", "convertToString", "", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS, "", "([Ljava/lang/String;)Ljava/lang/String;", "data", "", "", "hexToStringRepresentation", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: StringUtil.kt */
        public static final class a extends Lambda implements Function1<Byte, CharSequence> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f67488p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Byte b10) {
                String string = Integer.toString(b10.byteValue() & 255, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                return StringsKt__StringsKt.padStart(string, 2, '0');
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String convertToString(@Nullable List<String> list) {
            if (list == null) {
                return "";
            }
            String strJoin = TextUtils.join(", ", list);
            Intrinsics.checkNotNull(strJoin);
            return strJoin;
        }

        @JvmStatic
        @NotNull
        public final String hexToStringRepresentation(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return ArraysKt___ArraysKt.joinToString$default(data, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) a.f67488p0, 30, (Object) null);
        }

        @JvmStatic
        @NotNull
        public final String convertToString(@Nullable String[] list) {
            if (list == null) {
                return "";
            }
            String strJoin = TextUtils.join(", ", list);
            Intrinsics.checkNotNull(strJoin);
            return strJoin;
        }

        @JvmStatic
        @NotNull
        public final String convertToString(@NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            Charset charsetForName = Charset.forName(Veridas.US_ASCII);
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
            return new String(data, charsetForName);
        }
    }

    @JvmStatic
    @NotNull
    public static final String convertToString(@NotNull byte[] bArr) {
        return INSTANCE.convertToString(bArr);
    }

    @JvmStatic
    @NotNull
    public static final String convertToString(@Nullable String[] strArr) {
        return INSTANCE.convertToString(strArr);
    }
}
