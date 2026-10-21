package com.dasnano.vddocumentcapture;

import com.dasnano.vddocumentcapture.document.DocumentFace;
import com.veridas.lib.entities.resources.Side;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r15v4 com.dasnano.vddocumentcapture.GenericDocumentState[], still in use, count: 1, list:
  (r15v4 com.dasnano.vddocumentcapture.GenericDocumentState[]) from 0x0080: INVOKE (r15v4 com.dasnano.vddocumentcapture.GenericDocumentState[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:129)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: GenericDocumentState.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/dasnano/vddocumentcapture/GenericDocumentState;", "", "", "isInitial", "Z", "isSearching", "isSearchingDocument", "isObverseFace", "isReverseFace", "isCapturePossible", "isSearchingObverse", "Lcom/veridas/lib/entities/resources/Side;", "captureFace", "Lcom/veridas/lib/entities/resources/Side;", "Lcom/dasnano/vddocumentcapture/document/DocumentFace;", "documentFace", "Lcom/dasnano/vddocumentcapture/document/DocumentFace;", "CALCULATING_AWAITING", "AWAIT_DOCUMENT", "CALCULATING_FPS", "SEARCHING_PASSPORT", "SEARCHING_OBVERSE", "ANALYZING_OBVERSE", "SEARCHING_REVERSE", "ANALYZING_REVERSE", "FRAME_SAVED", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public final class GenericDocumentState {
    CALCULATING_AWAITING(1),
    AWAIT_DOCUMENT(3),
    CALCULATING_FPS(11),
    SEARCHING_PASSPORT(14),
    SEARCHING_OBVERSE(14),
    ANALYZING_OBVERSE(40),
    SEARCHING_REVERSE(22),
    ANALYZING_REVERSE(48),
    FRAME_SAVED(0);

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @JvmField
    @Nullable
    public final Side captureFace;

    @JvmField
    @Nullable
    public final DocumentFace documentFace;

    @JvmField
    public final boolean isCapturePossible;

    @JvmField
    public final boolean isInitial;

    @JvmField
    public final boolean isObverseFace;

    @JvmField
    public final boolean isReverseFace;

    @JvmField
    public final boolean isSearching;

    @JvmField
    public final boolean isSearchingDocument;

    @JvmField
    public final boolean isSearchingObverse;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(genericDocumentStateArr);
    }

    public GenericDocumentState(int i10) {
        super(str, i);
        this.isInitial = (i10 & 1) != 0;
        boolean z10 = (i10 & 2) != 0;
        this.isSearching = z10;
        this.isSearchingDocument = (i10 & 4) != 0;
        boolean z11 = (i10 & 8) != 0;
        this.isObverseFace = z11;
        boolean z12 = (i10 & 16) != 0;
        this.isReverseFace = z12;
        this.isCapturePossible = (i10 & 32) != 0;
        this.isSearchingObverse = z10 && z11;
        DocumentFace documentFace = null;
        this.captureFace = z11 ? Side.OBVERSE : z12 ? Side.REVERSE : null;
        if (z11) {
            documentFace = DocumentFace.OBVERSE;
        } else if (z12) {
            documentFace = DocumentFace.REVERSE;
        }
        this.documentFace = documentFace;
    }

    @NotNull
    public static EnumEntries<GenericDocumentState> getEntries() {
        return $ENTRIES;
    }

    public static GenericDocumentState valueOf(String str) {
        return (GenericDocumentState) Enum.valueOf(GenericDocumentState.class, str);
    }

    public static GenericDocumentState[] values() {
        return (GenericDocumentState[]) $VALUES.clone();
    }
}
