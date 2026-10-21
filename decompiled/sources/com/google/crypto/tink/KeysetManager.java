package com.google.crypto.tink;

import com.google.crypto.tink.internal.KeyStatusTypeProtoConverter;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.crypto.tink.tinkkey.KeyHandle;
import com.google.crypto.tink.tinkkey.internal.ProtoKey;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes10.dex */
public final class KeysetManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final Keyset.Builder f46432a;

    public KeysetManager(Keyset.Builder builder) {
        this.f46432a = builder;
    }

    public static KeysetManager withEmptyKeyset() {
        return new KeysetManager(Keyset.newBuilder());
    }

    public static KeysetManager withKeysetHandle(KeysetHandle keysetHandle) {
        return new KeysetManager(keysetHandle.f46415a.toBuilder());
    }

    public final synchronized Keyset.Key a(KeyData keyData, OutputPrefixType outputPrefixType) throws GeneralSecurityException {
        int iD;
        iD = d();
        if (outputPrefixType == OutputPrefixType.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return Keyset.Key.newBuilder().setKeyData(keyData).setKeyId(iD).setStatus(KeyStatusType.ENABLED).setOutputPrefixType(outputPrefixType).build();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized KeysetManager add(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate, false);
        return this;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized int addNewKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, boolean z10) throws GeneralSecurityException {
        Keyset.Key keyC;
        try {
            keyC = c(keyTemplate);
            this.f46432a.addKey(keyC);
            if (z10) {
                this.f46432a.setPrimaryKeyId(keyC.getKeyId());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return keyC.getKeyId();
    }

    public final synchronized boolean b(int i10) {
        Iterator<Keyset.Key> it = this.f46432a.getKeyList().iterator();
        while (it.hasNext()) {
            if (it.next().getKeyId() == i10) {
                return true;
            }
        }
        return false;
    }

    public final synchronized Keyset.Key c(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        return a(Registry.newKeyData(keyTemplate), keyTemplate.getOutputPrefixType());
    }

    public final synchronized int d() {
        int iRandKeyId;
        iRandKeyId = Util.randKeyId();
        while (b(iRandKeyId)) {
            iRandKeyId = Util.randKeyId();
        }
        return iRandKeyId;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager delete(int i10) throws GeneralSecurityException {
        if (i10 == this.f46432a.getPrimaryKeyId()) {
            throw new GeneralSecurityException("cannot delete the primary key");
        }
        for (int i11 = 0; i11 < this.f46432a.getKeyCount(); i11++) {
            if (this.f46432a.getKey(i11).getKeyId() == i10) {
                this.f46432a.removeKey(i11);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager destroy(int i10) throws GeneralSecurityException {
        try {
            if (i10 == this.f46432a.getPrimaryKeyId()) {
                throw new GeneralSecurityException("cannot destroy the primary key");
            }
            for (int i11 = 0; i11 < this.f46432a.getKeyCount(); i11++) {
                Keyset.Key key = this.f46432a.getKey(i11);
                if (key.getKeyId() == i10) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED && key.getStatus() != KeyStatusType.DESTROYED) {
                        throw new GeneralSecurityException("cannot destroy key with id " + i10);
                    }
                    this.f46432a.setKey(i11, key.toBuilder().setStatus(KeyStatusType.DESTROYED).clearKeyData().build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i10);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager disable(int i10) throws GeneralSecurityException {
        try {
            if (i10 == this.f46432a.getPrimaryKeyId()) {
                throw new GeneralSecurityException("cannot disable the primary key");
            }
            for (int i11 = 0; i11 < this.f46432a.getKeyCount(); i11++) {
                Keyset.Key key = this.f46432a.getKey(i11);
                if (key.getKeyId() == i10) {
                    if (key.getStatus() != KeyStatusType.ENABLED && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot disable key with id " + i10);
                    }
                    this.f46432a.setKey(i11, key.toBuilder().setStatus(KeyStatusType.DISABLED).build());
                }
            }
            throw new GeneralSecurityException("key not found: " + i10);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager enable(int i10) throws GeneralSecurityException {
        for (int i11 = 0; i11 < this.f46432a.getKeyCount(); i11++) {
            try {
                Keyset.Key key = this.f46432a.getKey(i11);
                if (key.getKeyId() == i10) {
                    KeyStatusType status = key.getStatus();
                    KeyStatusType keyStatusType = KeyStatusType.ENABLED;
                    if (status != keyStatusType && key.getStatus() != KeyStatusType.DISABLED) {
                        throw new GeneralSecurityException("cannot enable key with id " + i10);
                    }
                    this.f46432a.setKey(i11, key.toBuilder().setStatus(keyStatusType).build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    public synchronized KeysetHandle getKeysetHandle() throws GeneralSecurityException {
        return KeysetHandle.d(this.f46432a.build());
    }

    @CanIgnoreReturnValue
    @InlineMe(replacement = "this.setPrimary(keyId)")
    @Deprecated
    public synchronized KeysetManager promote(int i10) throws GeneralSecurityException {
        return setPrimary(i10);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public synchronized KeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate, true);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager setPrimary(int i10) throws GeneralSecurityException {
        for (int i11 = 0; i11 < this.f46432a.getKeyCount(); i11++) {
            Keyset.Key key = this.f46432a.getKey(i11);
            if (key.getKeyId() == i10) {
                if (!key.getStatus().equals(KeyStatusType.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i10);
                }
                this.f46432a.setPrimaryKeyId(i10);
            }
        }
        throw new GeneralSecurityException("key not found: " + i10);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager add(KeyTemplate keyTemplate) throws GeneralSecurityException {
        addNewKey(keyTemplate.f46412a, false);
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager add(KeyHandle keyHandle) throws GeneralSecurityException {
        try {
            ProtoKey protoKey = (ProtoKey) keyHandle.getKey(com.google.crypto.tink.tinkkey.SecretKeyAccess.insecureSecretAccess());
            if (!b(keyHandle.getId())) {
                this.f46432a.addKey(Keyset.Key.newBuilder().setKeyData(protoKey.getProtoKey()).setKeyId(keyHandle.getId()).setStatus(KeyStatusTypeProtoConverter.toProto(keyHandle.getStatus())).setOutputPrefixType(KeyTemplate.b(protoKey.getOutputPrefixType())).build());
            } else {
                throw new GeneralSecurityException("Trying to add a key with an ID already contained in the keyset.");
            }
        } catch (ClassCastException e5) {
            throw new UnsupportedOperationException("KeyHandles which contain TinkKeys that are not ProtoKeys are not yet supported.", e5);
        }
        return this;
    }

    @CanIgnoreReturnValue
    public synchronized KeysetManager add(KeyHandle keyHandle, KeyAccess keyAccess) throws GeneralSecurityException {
        return add(keyHandle);
    }
}
