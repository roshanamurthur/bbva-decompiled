package com.bbva.ethermobilesdk.tokencompat.model;

import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StorageTokenBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"merge", "", "ocraSuite", "otpLapse", "otpLength", "type", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StorageTokenBuilderKt {
    @NotNull
    public static final String merge(@NotNull String ocraSuite, @Nullable String str, @Nullable String str2, @NotNull TokenType type) {
        Intrinsics.checkNotNullParameter(ocraSuite, "ocraSuite");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type == TokenType.CHROTP) {
            return ocraSuite;
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) ocraSuite, new String[]{DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER}, false, 0, 6, (Object) null));
        if (mutableList.size() < 3) {
            return ocraSuite;
        }
        if (str2 != null) {
            List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) mutableList.get(1), new String[]{Constant.DASH_STRING}, false, 0, 6, (Object) null));
            int size = mutableList2.size() - 1;
            if (str2.length() <= 0) {
                str2 = StorageTokenBuilder.OTP_LENGTH;
            }
            mutableList2.set(size, str2);
            mutableList.set(1, CollectionsKt___CollectionsKt.joinToString$default(mutableList2, Constant.DASH_STRING, null, null, 0, null, null, 62, null));
        }
        if (str != null) {
            List mutableList3 = CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) mutableList.get(2), new String[]{Constant.DASH_STRING}, false, 0, 6, (Object) null));
            String str3 = (String) CollectionsKt___CollectionsKt.last(mutableList3);
            if (str.length() <= 0) {
                str = "30";
            }
            int size2 = mutableList3.size() - 1;
            String strSubstring = str3.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = StringsKt___StringsKt.reversed((CharSequence) str3).toString().substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            mutableList3.set(size2, strSubstring + str + strSubstring2);
            mutableList.set(2, CollectionsKt___CollectionsKt.joinToString$default(mutableList3, Constant.DASH_STRING, null, null, 0, null, null, 62, null));
        }
        return CollectionsKt___CollectionsKt.joinToString$default(mutableList, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER, null, null, 0, null, null, 62, null);
    }
}
