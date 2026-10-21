package com.bbva.ethermobilesdk.tokencompat.model.legacy.impl;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: STArrayImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b6\u0018\u00002\u00020\u0001:\u0002\u000f\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STArrayImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STArray;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "rc", "", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "b", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "value", "EmptyTokenList", "ValidTokenResult", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public abstract class STArrayImpl implements STArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final STReturnCode rc;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final List<TokenPub> value;

    /* JADX INFO: compiled from: STArrayImpl.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STArrayImpl$EmptyTokenList;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STArray;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component1", "", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component2", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "b", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Ljava/util/List;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EmptyTokenList implements STArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final List<TokenPub> value;

        /* JADX WARN: Multi-variable type inference failed */
        public EmptyTokenList() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ EmptyTokenList copy$default(EmptyTokenList emptyTokenList, STReturnCode sTReturnCode, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sTReturnCode = emptyTokenList.getRc();
            }
            if ((i10 & 2) != 0) {
                list = emptyTokenList.getValue();
            }
            return emptyTokenList.copy(sTReturnCode, list);
        }

        @NotNull
        public final STReturnCode component1() {
            return getRc();
        }

        @Nullable
        public final List<TokenPub> component2() {
            return getValue();
        }

        @NotNull
        public final EmptyTokenList copy(@NotNull STReturnCode rc2, @Nullable List<? extends TokenPub> value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new EmptyTokenList(rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EmptyTokenList)) {
                return false;
            }
            EmptyTokenList emptyTokenList = (EmptyTokenList) other;
            return Intrinsics.areEqual(getRc(), emptyTokenList.getRc()) && Intrinsics.areEqual(getValue(), emptyTokenList.getValue());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
        @Nullable
        public List<TokenPub> getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getRc().hashCode() * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
        public boolean isOk() {
            return STArray.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "EmptyTokenList(rc=" + getRc() + ", value=" + getValue() + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EmptyTokenList(@NotNull STReturnCode rc2, @Nullable List<? extends TokenPub> list) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.rc = rc2;
            this.value = list;
        }

        public /* synthetic */ EmptyTokenList(STReturnCode sTReturnCode, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new STReturnCodeImpl.TokenEmptyList(0, null, 3, null) : sTReturnCode, (i10 & 2) != 0 ? null : list);
        }
    }

    public STArrayImpl() {
        throw null;
    }

    public STArrayImpl(STReturnCode sTReturnCode, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.rc = sTReturnCode;
        this.value = list;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
    @NotNull
    public STReturnCode getRc() {
        return this.rc;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
    @Nullable
    public List<TokenPub> getValue() {
        return this.value;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
    public boolean isOk() {
        return STArray.DefaultImpls.isOk(this);
    }

    /* JADX INFO: compiled from: STArrayImpl.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0011\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003J%\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/impl/STArrayImpl$ValidTokenResult;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STArray;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "component1", "", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenPub;", "component2", "rc", "value", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "getRc", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "b", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;Ljava/util/List;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class ValidTokenResult implements STArray {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final STReturnCode rc;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final List<TokenPub> value;

        /* JADX WARN: Multi-variable type inference failed */
        public ValidTokenResult(@NotNull STReturnCode rc2, @Nullable List<? extends TokenPub> list) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            this.rc = rc2;
            this.value = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ValidTokenResult copy$default(ValidTokenResult validTokenResult, STReturnCode sTReturnCode, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                sTReturnCode = validTokenResult.getRc();
            }
            if ((i10 & 2) != 0) {
                list = validTokenResult.getValue();
            }
            return validTokenResult.copy(sTReturnCode, list);
        }

        @NotNull
        public final STReturnCode component1() {
            return getRc();
        }

        @Nullable
        public final List<TokenPub> component2() {
            return getValue();
        }

        @NotNull
        public final ValidTokenResult copy(@NotNull STReturnCode rc2, @Nullable List<? extends TokenPub> value) {
            Intrinsics.checkNotNullParameter(rc2, "rc");
            return new ValidTokenResult(rc2, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ValidTokenResult)) {
                return false;
            }
            ValidTokenResult validTokenResult = (ValidTokenResult) other;
            return Intrinsics.areEqual(getRc(), validTokenResult.getRc()) && Intrinsics.areEqual(getValue(), validTokenResult.getValue());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
        @NotNull
        public STReturnCode getRc() {
            return this.rc;
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
        @Nullable
        public List<TokenPub> getValue() {
            return this.value;
        }

        public int hashCode() {
            return (getRc().hashCode() * 31) + (getValue() == null ? 0 : getValue().hashCode());
        }

        @Override // com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray
        public boolean isOk() {
            return STArray.DefaultImpls.isOk(this);
        }

        @NotNull
        public String toString() {
            return "ValidTokenResult(rc=" + getRc() + ", value=" + getValue() + ")";
        }

        public /* synthetic */ ValidTokenResult(STReturnCode sTReturnCode, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new STReturnCodeImpl.Ok(0, null, 3, null) : sTReturnCode, list);
        }
    }
}
