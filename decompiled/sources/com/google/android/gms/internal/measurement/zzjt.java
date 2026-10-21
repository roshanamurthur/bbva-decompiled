package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzjx;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public class zzjt<MessageType extends zzjx<MessageType, BuilderType>, BuilderType extends zzjt<MessageType, BuilderType>> extends zzig<MessageType, BuilderType> {
    protected zzjx zza;
    protected boolean zzb = false;
    private final zzjx zzc;

    public zzjt(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzjx) messagetype.zzl(4, null, null);
    }

    private static final void zza(zzjx zzjxVar, zzjx zzjxVar2) {
        zzlk.zza().zzb(zzjxVar.getClass()).zzg(zzjxVar, zzjxVar2);
    }

    public void zzaC() {
        zzjx zzjxVar = (zzjx) this.zza.zzl(4, null, null);
        zza(zzjxVar, this.zza);
        this.zza = zzjxVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* synthetic */ zzig zzap(zzih zzihVar) {
        zzaw((zzjx) zzihVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzaq(byte[] bArr, int i10, int i11) throws zzkh {
        zzax(bArr, 0, i11, zzjj.zza());
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final /* bridge */ /* synthetic */ zzig zzar(byte[] bArr, int i10, int i11, zzjj zzjjVar) throws zzkh {
        zzax(bArr, 0, i11, zzjjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    /* JADX INFO: renamed from: zzav, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzjt zzao() {
        zzjt zzjtVar = (zzjt) this.zzc.zzl(5, null, null);
        zzjtVar.zzaw(zzaA());
        return zzjtVar;
    }

    public final zzjt zzaw(zzjx zzjxVar) {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        zza(this.zza, zzjxVar);
        return this;
    }

    public final zzjt zzax(byte[] bArr, int i10, int i11, zzjj zzjjVar) throws zzkh {
        if (this.zzb) {
            zzaC();
            this.zzb = false;
        }
        try {
            zzlk.zza().zzb(this.zza.getClass()).zzh(this.zza, bArr, 0, i11, new zzik(zzjjVar));
            return this;
        } catch (zzkh e5) {
            throw e5;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw zzkh.zzf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r3 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MessageType zzay() {
        /*
            r5 = this;
            com.google.android.gms.internal.measurement.zzjx r0 = r5.zzaA()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.zzl(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L13
            goto L30
        L13:
            if (r3 == 0) goto L31
            com.google.android.gms.internal.measurement.zzlk r3 = com.google.android.gms.internal.measurement.zzlk.zza()
            java.lang.Class r4 = r0.getClass()
            com.google.android.gms.internal.measurement.zzln r3 = r3.zzb(r4)
            boolean r3 = r3.zzj(r0)
            if (r1 == r3) goto L29
            r1 = r2
            goto L2a
        L29:
            r1 = r0
        L2a:
            r4 = 2
            r0.zzl(r4, r1, r2)
            if (r3 == 0) goto L31
        L30:
            return r0
        L31:
            com.google.android.gms.internal.measurement.zzma r1 = new com.google.android.gms.internal.measurement.zzma
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjt.zzay():com.google.android.gms.internal.measurement.zzjx");
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    /* JADX INFO: renamed from: zzaz, reason: merged with bridge method [inline-methods] */
    public MessageType zzaA() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        zzjx zzjxVar = this.zza;
        zzlk.zza().zzb(zzjxVar.getClass()).zzf(zzjxVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final /* synthetic */ zzlc zzbJ() {
        return this.zzc;
    }
}
