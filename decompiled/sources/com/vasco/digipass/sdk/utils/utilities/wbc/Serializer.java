package com.vasco.digipass.sdk.utils.utilities.wbc;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKReturnCodes;
import cz.muni.fi.xklinex.whiteboxAES.State;
import cz.muni.fi.xklinex.whiteboxAES.T1Box;
import cz.muni.fi.xklinex.whiteboxAES.T2Box;
import cz.muni.fi.xklinex.whiteboxAES.T3Box;
import cz.muni.fi.xklinex.whiteboxAES.XORBox;
import cz.muni.fi.xklinex.whiteboxAES.XORBoxState;
import cz.muni.fi.xklinex.whiteboxAES.XORCascade;
import cz.muni.fi.xklinex.whiteboxAES.XORCascadeState;
import cz.muni.fi.xklinex.whiteboxAES.generator.Bijection4x4;
import cz.muni.fi.xklinex.whiteboxAES.generator.ExternalBijections;
import cz.muni.fi.xklinex.whiteboxAES.generator.GF2MatrixEx;
import cz.muni.fi.xklinex.whiteboxAES.generator.LinearBijection;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
public class Serializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Kryo f66537a;

    public Serializer() {
        Kryo kryo = new Kryo();
        this.f66537a = kryo;
        kryo.register(WBCTable.class);
        kryo.register(ExternalBijections.class);
        kryo.register(LinearBijection[].class);
        kryo.register(LinearBijection.class);
        kryo.register(GF2MatrixEx.class);
        kryo.register(int[][].class);
        kryo.register(int[].class);
        kryo.register(byte[][].class);
        kryo.register(byte[].class);
        kryo.register(long[].class);
        kryo.register(Bijection4x4[][].class);
        kryo.register(Bijection4x4[].class);
        kryo.register(Bijection4x4.class);
        kryo.register(T1Box[][].class);
        kryo.register(T1Box[].class);
        kryo.register(T1Box.class);
        kryo.register(T2Box[][].class);
        kryo.register(T2Box[].class);
        kryo.register(T2Box.class);
        kryo.register(T3Box[][].class);
        kryo.register(T3Box[].class);
        kryo.register(T3Box.class);
        kryo.register(State[].class);
        kryo.register(State.class);
        kryo.register(XORCascade[][].class);
        kryo.register(XORCascade[].class);
        kryo.register(XORCascade.class);
        kryo.register(XORCascadeState[].class);
        kryo.register(XORCascadeState.class);
        kryo.register(XORBox[].class);
        kryo.register(XORBox.class);
        kryo.register(XORBoxState[].class);
        kryo.register(XORBoxState.class);
    }

    public WBCTable deserialize(String str) throws UtilitiesSDKException {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                WBCTable wBCTableDeserialize = deserialize(fileInputStream);
                fileInputStream.close();
                return wBCTableDeserialize;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e5) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID, e5);
        }
    }

    public WBCTable deserializeResource(String str) throws UtilitiesSDKException {
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream(str);
            try {
                if (resourceAsStream == null) {
                    throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID);
                }
                WBCTable wBCTableDeserialize = deserialize(resourceAsStream);
                resourceAsStream.close();
                return wBCTableDeserialize;
            } catch (Throwable th2) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e5) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID, e5);
        }
    }

    public void serialize(WBCTable wBCTable, String str) throws UtilitiesSDKException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                serialize(wBCTable, fileOutputStream);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e5) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID, e5);
        }
    }

    public WBCTable deserialize(InputStream inputStream) throws UtilitiesSDKException {
        try {
            Input input = new Input(inputStream);
            try {
                WBCTable wBCTable = (WBCTable) this.f66537a.readObject(input, WBCTable.class);
                input.close();
                return wBCTable;
            } catch (Throwable th2) {
                try {
                    input.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e5) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID, e5);
        }
    }

    public void serialize(WBCTable wBCTable, OutputStream outputStream) throws UtilitiesSDKException {
        try {
            Output output = new Output(outputStream);
            try {
                this.f66537a.writeObject(output, wBCTable);
                output.flush();
                output.close();
            } catch (Throwable th2) {
                try {
                    output.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e5) {
            throw new UtilitiesSDKException(UtilitiesSDKReturnCodes.WBC_INPUT_ARRAY_INVALID, e5);
        }
    }
}
