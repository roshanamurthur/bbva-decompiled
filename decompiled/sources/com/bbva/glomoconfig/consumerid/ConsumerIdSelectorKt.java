package com.bbva.glomoconfig.consumerid;

import androidx.camera.core.impl.utils.a;
import com.bbva.notifications.constants.PushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.koin.core.qualifier.StringQualifier;
import org.koin.ext.KClassExtKt;

/* JADX INFO: compiled from: ConsumerIdSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"consumerIdNamed", "Lorg/koin/core/qualifier/StringQualifier;", "name", "", "gl-config_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConsumerIdSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerIdSelector.kt\ncom/bbva/glomoconfig/consumerid/ConsumerIdSelectorKt\n+ 2 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n*L\n1#1,11:1\n12#2:12\n*S KotlinDebug\n*F\n+ 1 ConsumerIdSelector.kt\ncom/bbva/glomoconfig/consumerid/ConsumerIdSelectorKt\n*L\n10#1:12\n*E\n"})
public final class ConsumerIdSelectorKt {
    @NotNull
    public static final StringQualifier consumerIdNamed(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new StringQualifier(a.b(KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(ConsumerIdSelector.class)), PushConstants.GE_PARAMS_SEPARATOR, name));
    }
}
