package com.veridas.config.parser;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Parser.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/veridas/config/parser/Parser;", ExifInterface.GPS_DIRECTION_TRUE, "", "parse", "value", "", "(Ljava/lang/String;)Ljava/lang/Object;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Parser<T> {
    T parse(@Nullable String value);
}
