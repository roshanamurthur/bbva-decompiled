package com.bbva.document.scanner.plugin.validators;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ValidationConstants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\" \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\" \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"", "Check", "Ljava/lang/String;", "Card", "A4", TypedValues.Custom.NAME, "customRatioWidth", "customRatioHeight", "", "a", "Ljava/util/List;", "getSupportedRatios", "()Ljava/util/List;", "supportedRatios", "b", "getSupportedCustomKeys", "supportedCustomKeys", "document-scanner-plugin_release"}, k = 2, mv = {1, 8, 0})
public final class ValidationConstantsKt {

    @NotNull
    public static final String Check = "check";

    @NotNull
    public static final String Custom = "custom";

    @NotNull
    public static final String customRatioHeight = "height";

    @NotNull
    public static final String customRatioWidth = "width";

    @NotNull
    public static final String Card = "card";

    @NotNull
    public static final String A4 = "a4";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<String> f29162a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"check", Card, A4, "custom"});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final List<String> f29163b = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"width", "height"});

    @NotNull
    public static final List<String> getSupportedCustomKeys() {
        return f29163b;
    }

    @NotNull
    public static final List<String> getSupportedRatios() {
        return f29162a;
    }
}
