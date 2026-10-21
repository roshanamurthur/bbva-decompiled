package com.bbva.component.dm.filefetcher.domain.exceptions;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmptyResponseException.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/dm/filefetcher/domain/exceptions/EmptyResponseException;", "Ljava/lang/Exception;", "()V", "Companion", "component-dm-filefetcher_release"}, k = 1, mv = {1, 1, 15})
public final class EmptyResponseException extends Exception {

    @NotNull
    public static final String ERROR_MESSAGE = "Server returned an empty response. Unable to create file.";

    public EmptyResponseException() {
        super(ERROR_MESSAGE);
    }
}
